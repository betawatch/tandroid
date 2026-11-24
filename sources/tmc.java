// default package

import android.text.TextUtils;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final /* synthetic */ class tmc implements qac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b61 b;
    public final /* synthetic */ my0 c;
    public final /* synthetic */ ylb d;

    public /* synthetic */ tmc(b61 b61Var, my0 my0Var, ylb ylbVar, byte b) {
        this.a = b;
        this.b = b61Var;
        this.c = my0Var;
        this.d = ylbVar;
    }

    @Override // qac
    public final void a(Object obj) {
        byte b = this.a;
        ylb ylbVar = this.d;
        my0 my0Var = this.c;
        b61 b61Var = this.b;
        String str = (String) obj;
        switch (b) {
            case 0:
                b61Var.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    new c41(my0Var.F, ylbVar).f0(str, false);
                    break;
                } else {
                    my0Var.dismiss();
                    break;
                }
            default:
                b61Var.setLoading(false);
                if (str == null) {
                    my0Var.dismiss();
                    break;
                } else {
                    new c41(my0Var.F, ylbVar).f0(str, false);
                    break;
                }
        }
    }
}
