package rh;

import android.text.TextUtils;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class x1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ String c;

    public /* synthetic */ x1(e4 e4Var, String str, int i10) {
        this.a = i10;
        this.b = e4Var;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        String str = this.c;
        e4 e4Var = this.b;
        switch (i10) {
            case 0:
                long j10 = e4Var.P1;
                e4Var.c2.setLoading(false);
                if (!TextUtils.isEmpty(str)) {
                    e4Var.dismiss();
                    org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        if (Q instanceof un) {
                            un unVar = (un) Q;
                            if (unVar.a() == j10) {
                                cc.a0(unVar).I(R.raw.gift, cd.L0(2131745114, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131745112, org.telegram.messenger.o5.t(j10)))).k(true);
                                break;
                            }
                        }
                        zs f7 = zs.f(e4Var.a);
                        Long valueOf = Long.valueOf(j10);
                        Boolean bool = Boolean.FALSE;
                        f7.k(6, valueOf, bool);
                        zs.f(e4Var.a).k(5, Long.valueOf(j10), bool);
                        un ha = un.ha(j10);
                        ha.whenFullyVisible(new o(7, e4Var, ha));
                        Q.presentFragment(ha);
                        break;
                    }
                } else {
                    e4Var.s2(0, true, null);
                    break;
                }
                break;
            case 1:
                gf.f.t(e4Var.getContext(), vp.r1(e4Var.a).I6 + str);
                break;
            case 2:
                gf.f.t(e4Var.getContext(), vp.r1(e4Var.a).I6 + str);
                break;
            case 3:
                gf.f.t(e4Var.getContext(), vp.r1(e4Var.a).I6 + str);
                break;
            case 4:
                gf.f.t(e4Var.getContext(), vp.r1(e4Var.a).I6 + str);
                break;
            case 5:
                gf.f.t(e4Var.getContext(), vp.r1(e4Var.a).I6 + str);
                break;
            case 6:
                gf.f.t(e4Var.getContext(), vp.r1(e4Var.a).I6 + str);
                break;
            case 7:
                org.telegram.messenger.i0.g(str);
                wb k10 = e4Var.k().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                e4Var.dismiss();
                gf.f.r(e4Var.getContext(), "https://" + vp.r1(e4Var.a).U2 + "/" + str);
                break;
        }
    }
}
