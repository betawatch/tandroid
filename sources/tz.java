// default package

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
