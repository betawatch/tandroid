// default package

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
