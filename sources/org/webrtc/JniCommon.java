package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j3);

    public static native ByteBuffer nativeAllocateByteBuffer(int i7);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j3);
}
