// default package

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
