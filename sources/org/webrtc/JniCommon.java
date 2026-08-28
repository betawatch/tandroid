package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j10);

    public static native ByteBuffer nativeAllocateByteBuffer(int i9);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j10);
}
