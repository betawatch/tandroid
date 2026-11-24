// default package

import android.net.Uri;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class yj implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ak b;

    public /* synthetic */ yj(ak akVar, byte b) {
        this.a = b;
        this.b = akVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ak akVar = this.b;
        switch (b) {
            case 0:
                akVar.a.unregisterReceiver(akVar.d);
                break;
            case 1:
                akVar.a();
                break;
            default:
                Uri uri = ak.g;
                akVar.b();
                break;
        }
    }
}
