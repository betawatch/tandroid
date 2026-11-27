// default package

import android.net.Uri;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
