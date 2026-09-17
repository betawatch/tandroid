package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j3);

    public static native ByteBuffer nativeAllocateByteBuffer(int i10);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j3);
}
