package org.webrtc;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.JavaI420Buffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class JavaI420BufferJni implements JavaI420Buffer.Natives {
    private static JniTestInstanceHolder sOverride;

    public static JavaI420Buffer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new JavaI420BufferJni() : (JavaI420Buffer.Natives) obj;
    }

    public static void setInstanceForTesting(JavaI420Buffer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.JavaI420Buffer.Natives
    public void cropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12) {
        GEN_JNI.org_webrtc_JavaI420Buffer_cropAndScaleI420(byteBuffer, i, byteBuffer2, i2, byteBuffer3, i3, i4, i5, i6, i7, byteBuffer4, i8, byteBuffer5, i9, byteBuffer6, i10, i11, i12);
    }
}
