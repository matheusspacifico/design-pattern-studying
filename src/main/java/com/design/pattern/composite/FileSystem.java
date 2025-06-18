package com.design.pattern.composite;

public interface FileSystem {
    String getName();
    int getByteSize();
    void printTree();
    void addFile(FileSystem element);
    void removeFile(FileSystem element);
}
