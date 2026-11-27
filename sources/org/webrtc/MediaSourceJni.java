package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public class MediaSourceJni implements MediaSource.Natives {
    private static JniTestInstanceHolder sOverride;

    public static MediaSource.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new MediaSourceJni() : (MediaSource.Natives) obj;
    }

    public static void setInstanceForTesting(MediaSource.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.MediaSource.Natives
    public MediaSource.State getState(long j) {
        return (MediaSource.State) GEN_JNI.org_webrtc_MediaSource_getState(j);
    }
}
