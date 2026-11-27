// default package

import android.net.Uri;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
