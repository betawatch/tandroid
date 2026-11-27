package org.webrtc;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.NV21Buffer;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
class NV21BufferJni implements NV21Buffer.Natives {
    private static JniTestInstanceHolder sOverride;

    public static NV21Buffer.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new NV21BufferJni() : (NV21Buffer.Natives) obj;
    }

    public static void setInstanceForTesting(NV21Buffer.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.NV21Buffer.Natives
    public void cropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11) {
        GEN_JNI.org_webrtc_NV21Buffer_cropAndScale(i, i2, i3, i4, i5, i6, bArr, i7, i8, byteBuffer, i9, byteBuffer2, i10, byteBuffer3, i11);
    }
}
