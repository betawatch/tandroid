// default package

import android.net.Uri;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class zj implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bk b;

    public /* synthetic */ zj(bk bkVar, byte b) {
        this.a = b;
        this.b = bkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        bk bkVar = this.b;
        switch (b) {
            case 0:
                bkVar.a.unregisterReceiver(bkVar.d);
                break;
            case 1:
                bkVar.a();
                break;
            default:
                Uri uri = bk.g;
                bkVar.b();
                break;
        }
    }
}
