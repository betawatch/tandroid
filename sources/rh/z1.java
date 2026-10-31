package rh;

import android.text.TextUtils;
import org.telegram.messenger.q20;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class z1 implements q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ gf.e c;
    public final /* synthetic */ mg.i2 d;

    public /* synthetic */ z1(e4 e4Var, gf.e eVar, mg.i2 i2Var, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = eVar;
        this.d = i2Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        String str = (String) obj;
        switch (this.a) {
            case 0:
                this.c.b();
                e4 e4Var = this.b;
                mg.i2 i2Var = this.d;
                if (str == null) {
                    if (i2Var != null) {
                        i2Var.dismiss();
                    }
                    e4Var.dismiss();
                    org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                    if (T instanceof org.telegram.ui.Wallet.b6) {
                        ((org.telegram.ui.Wallet.b6) T).N0();
                        break;
                    }
                } else {
                    (i2Var != null ? new cc(i2Var.c, e4Var.I0) : e4Var.k()).e0(str, false);
                    break;
                }
                break;
            default:
                this.c.c(false);
                if (!TextUtils.isEmpty(str)) {
                    e4 e4Var2 = this.b;
                    mg.i2 i2Var2 = this.d;
                    (i2Var2 != null ? new cc(i2Var2.c, e4Var2.I0) : e4Var2.k()).e0(str, false);
                    break;
                }
                break;
        }
    }
}
