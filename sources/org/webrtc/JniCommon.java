package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public class JniCommon {

    /* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
