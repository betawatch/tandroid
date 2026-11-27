package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class JniCommon {

    /* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
    interface Natives {
        void addRef(long j);

        ByteBuffer allocateByteBuffer(int i);

        void freeByteBuffer(ByteBuffer byteBuffer);

        void releaseRef(long j);
    }

    public static void nativeAddRef(long j) {
        JniCommonJni.get().addRef(j);
    }

    public static ByteBuffer nativeAllocateByteBuffer(int i) {
        return JniCommonJni.get().allocateByteBuffer(i);
    }

    public static void nativeFreeByteBuffer(ByteBuffer byteBuffer) {
        JniCommonJni.get().freeByteBuffer(byteBuffer);
    }

    public static void nativeReleaseRef(long j) {
        JniCommonJni.get().releaseRef(j);
    }
}
