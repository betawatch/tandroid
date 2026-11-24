// default package

import android.telephony.PhoneStateListener;
import org.telegram.messenger.MediaController;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vn6 extends PhoneStateListener {
    public final /* synthetic */ MediaController a;

    public vn6(MediaController mediaController) {
        this.a = mediaController;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        gm.c3(new bm3((Object) this, i, (byte) 22));
    }
}
