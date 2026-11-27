package org.webrtc;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class JniCommon {

    /* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
