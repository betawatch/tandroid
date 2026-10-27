package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j10);

    public static native ByteBuffer nativeAllocateByteBuffer(int i10);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j10);
}
