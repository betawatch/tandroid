package rh;

import android.text.TextUtils;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.wp;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
                                cc.a0(unVar).I(R.raw.gift, dd.L0(2131745114, null), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131745112, org.telegram.messenger.o5.t(j10)))).k(true);
                                break;
                            }
                        }
                        at f7 = at.f(e4Var.a);
                        Long valueOf = Long.valueOf(j10);
                        Boolean bool = Boolean.FALSE;
                        f7.k(6, valueOf, bool);
                        at.f(e4Var.a).k(5, Long.valueOf(j10), bool);
                        un ma2 = un.ma(j10);
                        ma2.whenFullyVisible(new n(8, e4Var, ma2));
                        Q.presentFragment(ma2);
                        break;
                    }
                } else {
                    e4Var.s2(0, true, null);
                    break;
                }
                break;
            case 1:
                gf.f.t(e4Var.getContext(), wp.r1(e4Var.a).I6 + str);
                break;
            case 2:
                gf.f.t(e4Var.getContext(), wp.r1(e4Var.a).I6 + str);
                break;
            case 3:
                gf.f.t(e4Var.getContext(), wp.r1(e4Var.a).I6 + str);
                break;
            case 4:
                gf.f.t(e4Var.getContext(), wp.r1(e4Var.a).I6 + str);
                break;
            case 5:
                gf.f.t(e4Var.getContext(), wp.r1(e4Var.a).I6 + str);
                break;
            case 6:
                gf.f.t(e4Var.getContext(), wp.r1(e4Var.a).I6 + str);
                break;
            case 7:
                org.telegram.messenger.i0.g(str);
                wb k10 = e4Var.k().k(false);
                k10.t = true;
                k10.j();
                break;
            default:
                e4Var.dismiss();
                gf.f.r(e4Var.getContext(), "https://" + wp.r1(e4Var.a).U2 + "/" + str);
                break;
        }
    }
}
