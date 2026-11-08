package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j3);

    public static native ByteBuffer nativeAllocateByteBuffer(int i7);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j3);
}
