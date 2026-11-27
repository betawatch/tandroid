package org.webrtc;

import java.nio.ByteBuffer;
import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.JniCommon;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
class JniCommonJni implements JniCommon.Natives {
    private static JniTestInstanceHolder sOverride;

    public static JniCommon.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new JniCommonJni() : (JniCommon.Natives) obj;
    }

    public static void setInstanceForTesting(JniCommon.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.JniCommon.Natives
    public void addRef(long j) {
        GEN_JNI.org_webrtc_JniCommon_addRef(j);
    }

    @Override // org.webrtc.JniCommon.Natives
    public ByteBuffer allocateByteBuffer(int i) {
        return (ByteBuffer) GEN_JNI.org_webrtc_JniCommon_allocateByteBuffer(i);
    }

    @Override // org.webrtc.JniCommon.Natives
    public void freeByteBuffer(ByteBuffer byteBuffer) {
        GEN_JNI.org_webrtc_JniCommon_freeByteBuffer(byteBuffer);
    }

    @Override // org.webrtc.JniCommon.Natives
    public void releaseRef(long j) {
        GEN_JNI.org_webrtc_JniCommon_releaseRef(j);
    }
}
