package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.MediaStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public class MediaStreamJni implements MediaStream.Natives {
    private static JniTestInstanceHolder sOverride;

    public static MediaStream.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new MediaStreamJni() : (MediaStream.Natives) obj;
    }

    public static void setInstanceForTesting(MediaStream.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.MediaStream.Natives
    public boolean addAudioTrackToNativeStream(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_addAudioTrackToNativeStream(j, j2);
    }

    @Override // org.webrtc.MediaStream.Natives
    public boolean addVideoTrackToNativeStream(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_addVideoTrackToNativeStream(j, j2);
    }

    @Override // org.webrtc.MediaStream.Natives
    public String getId(long j) {
        return (String) GEN_JNI.org_webrtc_MediaStream_getId(j);
    }

    @Override // org.webrtc.MediaStream.Natives
    public boolean removeAudioTrack(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_removeAudioTrack(j, j2);
    }

    @Override // org.webrtc.MediaStream.Natives
    public boolean removeVideoTrack(long j, long j2) {
        return GEN_JNI.org_webrtc_MediaStream_removeVideoTrack(j, j2);
    }
}
