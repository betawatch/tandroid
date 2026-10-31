package vh;

import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ t5 b;

    public /* synthetic */ p5(t5 t5Var, int i10) {
        this.a = i10;
        this.b = t5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
                t5 t5Var = this.b;
                getwebpagepreview.message = t5Var.Q1.d.getText().toString();
                t5Var.a2 = ConnectionsManager.getInstance(t5Var.a).sendRequest(getwebpagepreview, new ag.c(t5Var, 25));
                break;
            case 1:
                this.b.h1();
                break;
            default:
                t5 t5Var2 = this.b;
                org.telegram.ui.Cells.m3 m3Var = t5Var2.Q1;
                if (t5Var2.isShowing()) {
                    m3Var.d.requestFocus();
                    org.telegram.messenger.i0.J3(m3Var.d);
                    break;
                }
                break;
        }
    }
}
