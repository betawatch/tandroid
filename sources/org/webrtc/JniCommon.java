package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j10);

    public static native ByteBuffer nativeAllocateByteBuffer(int i10);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j10);
}
