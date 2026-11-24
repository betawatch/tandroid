// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class q6b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u6b b;

    public /* synthetic */ q6b(u6b u6bVar, byte b) {
        this.a = b;
        this.b = u6bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        u6b u6bVar = this.b;
        switch (b) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = u6bVar.T1.d.getText().toString();
                u6bVar.d2 = ConnectionsManager.getInstance(u6bVar.a).sendRequest(getwebpagepreview, new go9(u6bVar, (byte) 13));
                break;
            case 1:
                u6bVar.c1();
                break;
            default:
                su3 su3Var = u6bVar.T1;
                if (u6bVar.isShowing()) {
                    su3Var.d.requestFocus();
                    gm.E3(su3Var.d);
                    break;
                }
                break;
        }
    }
}
