package org.webrtc;

import org.jni_zero.GEN_JNI;
import org.jni_zero.JniTestInstanceHolder;
import org.webrtc.NetworkChangeDetector;
import org.webrtc.NetworkMonitor;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
class NetworkMonitorJni implements NetworkMonitor.Natives {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static JniTestInstanceHolder sOverride;

    public static NetworkMonitor.Natives get() {
        Object obj;
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        return (jniTestInstanceHolder == null || (obj = jniTestInstanceHolder.value) == null) ? new NetworkMonitorJni() : (NetworkMonitor.Natives) obj;
    }

    public static void setInstanceForTesting(NetworkMonitor.Natives natives) {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder == null) {
            jniTestInstanceHolder = JniTestInstanceHolder.create();
            sOverride = jniTestInstanceHolder;
        }
        jniTestInstanceHolder.value = natives;
    }

    @Override // org.webrtc.NetworkMonitor.Natives
    public void notifyConnectionTypeChanged(long j) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyConnectionTypeChanged(j);
    }

    @Override // org.webrtc.NetworkMonitor.Natives
    public void notifyOfActiveNetworkList(long j, NetworkChangeDetector.NetworkInformation[] networkInformationArr) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfActiveNetworkList(j, networkInformationArr);
    }

    @Override // org.webrtc.NetworkMonitor.Natives
    public void notifyOfNetworkConnect(long j, NetworkChangeDetector.NetworkInformation networkInformation) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfNetworkConnect(j, networkInformation);
    }

    @Override // org.webrtc.NetworkMonitor.Natives
    public void notifyOfNetworkDisconnect(long j, long j2) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfNetworkDisconnect(j, j2);
    }

    @Override // org.webrtc.NetworkMonitor.Natives
    public void notifyOfNetworkPreference(long j, NetworkChangeDetector.ConnectionType connectionType, int i) {
        GEN_JNI.org_webrtc_NetworkMonitor_notifyOfNetworkPreference(j, connectionType, i);
    }
}
