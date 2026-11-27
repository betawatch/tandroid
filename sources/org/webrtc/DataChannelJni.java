package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.DataChannel;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class DataChannelJni implements DataChannel.Natives {
    private static JniTestInstanceHolder sOverride;

    public static DataChannel.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new DataChannelJni() : (DataChannel.Natives) obj;
    }

    public static void setInstanceForTesting(DataChannel.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.DataChannel.Natives
    public long bufferedAmount(DataChannel dataChannel) {
        return GEN_JNI.org_webrtc_DataChannel_bufferedAmount(dataChannel);
    }

    @Override // org.webrtc.DataChannel.Natives
    public void close(DataChannel dataChannel) {
        GEN_JNI.org_webrtc_DataChannel_close(dataChannel);
    }

    @Override // org.webrtc.DataChannel.Natives
    public int id(DataChannel dataChannel) {
        return GEN_JNI.org_webrtc_DataChannel_id(dataChannel);
    }

    @Override // org.webrtc.DataChannel.Natives
    public String label(DataChannel dataChannel) {
        return (String) GEN_JNI.org_webrtc_DataChannel_label(dataChannel);
    }

    @Override // org.webrtc.DataChannel.Natives
    public long registerObserver(DataChannel dataChannel, DataChannel.Observer observer) {
        return GEN_JNI.org_webrtc_DataChannel_registerObserver(dataChannel, observer);
    }

    @Override // org.webrtc.DataChannel.Natives
    public boolean send(DataChannel dataChannel, byte[] bArr, boolean z) {
        return GEN_JNI.org_webrtc_DataChannel_send(dataChannel, bArr, z);
    }

    @Override // org.webrtc.DataChannel.Natives
    public DataChannel.State state(DataChannel dataChannel) {
        return (DataChannel.State) GEN_JNI.org_webrtc_DataChannel_state(dataChannel);
    }

    @Override // org.webrtc.DataChannel.Natives
    public void unregisterObserver(DataChannel dataChannel, long j) {
        GEN_JNI.org_webrtc_DataChannel_unregisterObserver(dataChannel, j);
    }
}
