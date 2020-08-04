package cn.zhutan.myspringtest.lifecycle;

import org.springframework.context.SmartLifecycle;


public class MySmartLifecycle implements SmartLifecycle {
	private volatile boolean running = false;

	@Override
	public void start() {
		System.out.println("start");
		running = true;
	}

	@Override
	public void stop() {
		System.out.println("stop");
		running = false;
	}

	@Override
	public boolean isRunning() {
		return running;
	}

	@Override
	public void stop(Runnable callback) {
		stop();
		// 让容器立马停止, 不调用此方法, 容器默认会等30秒后停止
		callback.run();
	}

	// 设置为true
	@Override
	public boolean isAutoStartup() {
		return true;
	}

	// 优先级
	@Override
	public int getPhase() {
		return 0;
	}
}
