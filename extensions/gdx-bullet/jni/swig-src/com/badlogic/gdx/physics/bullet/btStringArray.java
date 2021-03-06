/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btStringArray {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected btStringArray(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  public static long getCPtr(btStringArray obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btStringArray(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public btStringArray() {
    this(gdxBulletJNI.new_btStringArray__SWIG_0(), true);
  }

  public btStringArray(btStringArray otherArray) {
    this(gdxBulletJNI.new_btStringArray__SWIG_1(btStringArray.getCPtr(otherArray), otherArray), true);
  }

  public int size() {
    return gdxBulletJNI.btStringArray_size(swigCPtr, this);
  }

  public String at(int n) {
    return gdxBulletJNI.btStringArray_at__SWIG_0(swigCPtr, this, n);
  }

  public void clear() {
    gdxBulletJNI.btStringArray_clear(swigCPtr, this);
  }

  public void pop_back() {
    gdxBulletJNI.btStringArray_pop_back(swigCPtr, this);
  }

  public void resizeNoInitialize(int newsize) {
    gdxBulletJNI.btStringArray_resizeNoInitialize(swigCPtr, this, newsize);
  }

  public void resize(int newsize, String fillData) {
    gdxBulletJNI.btStringArray_resize__SWIG_0(swigCPtr, this, newsize, fillData);
  }

  public void resize(int newsize) {
    gdxBulletJNI.btStringArray_resize__SWIG_1(swigCPtr, this, newsize);
  }

  public String expandNonInitializing() {
    return gdxBulletJNI.btStringArray_expandNonInitializing(swigCPtr, this);
  }

  public String expand(String fillValue) {
    return gdxBulletJNI.btStringArray_expand__SWIG_0(swigCPtr, this, fillValue);
  }

  public String expand() {
    return gdxBulletJNI.btStringArray_expand__SWIG_1(swigCPtr, this);
  }

  public void push_back(String _Val) {
    gdxBulletJNI.btStringArray_push_back(swigCPtr, this, _Val);
  }

  public int capacity() {
    return gdxBulletJNI.btStringArray_capacity(swigCPtr, this);
  }

  public void reserve(int _Count) {
    gdxBulletJNI.btStringArray_reserve(swigCPtr, this, _Count);
  }

  public void swap(int index0, int index1) {
    gdxBulletJNI.btStringArray_swap(swigCPtr, this, index0, index1);
  }

  public int findBinarySearch(String key) {
    return gdxBulletJNI.btStringArray_findBinarySearch(swigCPtr, this, key);
  }

  public int findLinearSearch(String key) {
    return gdxBulletJNI.btStringArray_findLinearSearch(swigCPtr, this, key);
  }

  public void remove(String key) {
    gdxBulletJNI.btStringArray_remove(swigCPtr, this, key);
  }

  public void initializeFromBuffer(SWIGTYPE_p_void buffer, int size, int capacity) {
    gdxBulletJNI.btStringArray_initializeFromBuffer(swigCPtr, this, SWIGTYPE_p_void.getCPtr(buffer), size, capacity);
  }

  public void copyFromArray(btStringArray otherArray) {
    gdxBulletJNI.btStringArray_copyFromArray(swigCPtr, this, btStringArray.getCPtr(otherArray), otherArray);
  }

}
