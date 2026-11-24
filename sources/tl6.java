// default package

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class tl6 extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public tl6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        gl.d3(new sm3((Object) this, i, (byte) 20));
    }
}
