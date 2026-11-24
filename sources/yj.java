// default package

import android.net.Uri;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
