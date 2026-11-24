// default package

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class p4b implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ t4b b;

    public /* synthetic */ p4b(t4b t4bVar, byte b) {
        this.a = b;
        this.b = t4bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        t4b t4bVar = this.b;
        switch (b) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                getwebpagepreview.message = t4bVar.T1.d.getText().toString();
                t4bVar.d2 = ConnectionsManager.getInstance(t4bVar.a).sendRequest(getwebpagepreview, new wx9(t4bVar, (byte) 12));
                break;
            case 1:
                t4bVar.c1();
                break;
            default:
                it3 it3Var = t4bVar.T1;
                if (t4bVar.isShowing()) {
                    it3Var.d.requestFocus();
                    gl.F3(it3Var.d);
                    break;
                }
                break;
        }
    }
}
