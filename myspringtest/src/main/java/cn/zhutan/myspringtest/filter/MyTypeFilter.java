package cn.zhutan.myspringtest.filter;

import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

public class MyTypeFilter implements TypeFilter {
	@Override
	public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
		ClassMetadata classMetadata = metadataReader.getClassMetadata();
		// 全限定名包含User的就创建, 其它不创建
		return classMetadata.getClassName().contains("User");
		// return true // 理论上代表所有类都会创建, 但是Spring里面还会对一些抽象类, 接口等等进行二层过滤
	}
}
