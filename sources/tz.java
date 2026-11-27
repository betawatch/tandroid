// default package

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class tz extends AudioDeviceCallback {
    public final /* synthetic */ vz a;

    public tz(vz vzVar) {
        this.a = vzVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.l();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        vz vzVar = this.a;
        if (gcc.l(audioDeviceInfoArr, (AudioDeviceInfo) vzVar.s)) {
            vzVar.s = null;
        }
        vzVar.l();
    }
}
