// default package

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class s00 extends AudioDeviceCallback {
    public final /* synthetic */ u00 a;

    public s00(u00 u00Var) {
        this.a = u00Var;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.l();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        u00 u00Var = this.a;
        if (hac.l(audioDeviceInfoArr, (AudioDeviceInfo) u00Var.s)) {
            u00Var.s = null;
        }
        u00Var.l();
    }
}
