package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaStreamTrack;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class MediaStreamTrackJni implements MediaStreamTrack.Natives {
    private static JniTestInstanceHolder sOverride;

    public static MediaStreamTrack.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new MediaStreamTrackJni() : (MediaStreamTrack.Natives) obj;
    }

    public static void setInstanceForTesting(MediaStreamTrack.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.MediaStreamTrack.Natives
    public boolean getEnabled(long j) {
        return GEN_JNI.org_webrtc_MediaStreamTrack_getEnabled(j);
    }

    @Override // org.webrtc.MediaStreamTrack.Natives
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_MediaStreamTrack_getId(j);
    }

    @Override // org.webrtc.MediaStreamTrack.Natives
    public String getKind(long j) {
        return (String) GEN_JNI.org_webrtc_MediaStreamTrack_getKind(j);
    }

    @Override // org.webrtc.MediaStreamTrack.Natives
    public MediaStreamTrack.State getState(long j) {
        return (MediaStreamTrack.State) GEN_JNI.org_webrtc_MediaStreamTrack_getState(j);
    }

    @Override // org.webrtc.MediaStreamTrack.Natives
    public boolean setEnabled(long j, boolean z) {
        return GEN_JNI.org_webrtc_MediaStreamTrack_setEnabled(j, z);
    }
}
