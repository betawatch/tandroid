package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j3);

    public static native ByteBuffer nativeAllocateByteBuffer(int i7);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j3);
}
