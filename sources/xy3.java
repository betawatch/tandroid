// default package

import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xy3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yy3 b;

    public /* synthetic */ xy3(yy3 yy3Var, byte b) {
        this.a = b;
        this.b = yy3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        yy3 yy3Var = this.b;
        switch (b) {
            case 0:
                yy3Var.f.dismiss();
                break;
            default:
                az3 az3Var = yy3Var.f;
                az3Var.dismiss();
                d dVar = az3Var.m1;
                if (dVar != null && dVar.getParentActivity() != null) {
                    mlb.y(null, 2131754432, c41.b0(dVar), null);
                    break;
                }
                break;
        }
    }
}
