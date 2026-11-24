// default package

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tl6 extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public tl6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        gl.c3(new sm3((Object) this, i, (byte) 20));
    }
}
