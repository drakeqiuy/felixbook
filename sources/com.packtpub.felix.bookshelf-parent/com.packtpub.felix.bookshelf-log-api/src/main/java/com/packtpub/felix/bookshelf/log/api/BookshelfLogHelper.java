package com.packtpub.felix.bookshelf.log.api;

public interface BookshelfLogHelper {
	public void debug(String pattern, Object... args);
    
	public void debug(String pattern, Throwable throwable, Object... args);
	public void info(String pattern, Object... args);
	public void warn(String pattern, Object... args);
	public void warn(String pattern, Throwable throwable, Object... args);
	public void error(String pattern, Object... args);
	public void error(String pattern, Throwable throwable, Object... args);
}
