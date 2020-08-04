package cn.zhutan.myspringtest.lifecycle;

import org.springframework.context.Lifecycle;


public class MyLifecycle implements Lifecycle {
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
}
