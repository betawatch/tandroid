// default package

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sz extends AudioDeviceCallback {
    public final /* synthetic */ uz a;

    public sz(uz uzVar) {
        this.a = uzVar;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        this.a.c();
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        uz uzVar = this.a;
        if (g8c.l(audioDeviceInfoArr, uzVar.i)) {
            uzVar.i = null;
        }
        uzVar.c();
    }
}
