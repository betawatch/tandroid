package rh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.u61;
import org.telegram.ui.un;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n1 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e4 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ TLRPC.TL_error f;
    public final /* synthetic */ long h;
    public final /* synthetic */ Object n;

    public /* synthetic */ n1(e4 e4Var, TLObject tLObject, long j10, long j11, q20 q20Var, TLRPC.TL_error tL_error, long j12) {
        this.b = e4Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.n = q20Var;
        this.f = tL_error;
        this.h = j12;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = 1;
        switch (this.a) {
            case 0:
                e4 e4Var = this.b;
                org.telegram.ui.ActionBar.x1 x1Var = (org.telegram.ui.ActionBar.x1) this.n;
                TLObject tLObject = this.c;
                long j10 = this.d;
                long j11 = this.e;
                long j12 = this.h;
                TLRPC.TL_error tL_error = this.f;
                x1Var.c(400L);
                org.telegram.ui.ActionBar.k2 T = LaunchActivity.T();
                if (T != null) {
                    if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
                        if (tL_error == null) {
                            e4Var.k().t(cd.L0(2131743904, null), null).k(false);
                            break;
                        } else {
                            e4Var.k().t(cd.a0(null, null, 2131743903, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        e4Var.dismiss();
                        e6.y(e4Var.a, false).P(j10);
                        if (j10 < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j10);
                            bundle.putBoolean("start_from_monetization", true);
                            u61 u61Var = new u61(bundle);
                            r.g(e4Var.a).h(j10, true);
                            r.g(e4Var.a).l(j10);
                            u61Var.whenFullyVisible(new bi.e(u61Var, j12, 22));
                            T.presentFragment(u61Var);
                            break;
                        } else {
                            TLRPC.UserFull a2 = vp.r1(e4Var.a).a2(j11);
                            if (a2 != null) {
                                int max = Math.max(0, a2.stargifts_count - 1);
                                a2.stargifts_count = max;
                                if (max <= 0) {
                                    a2.flags2 &= -257;
                                }
                            }
                            e6.y(e4Var.a, false).O();
                            e6.y(e4Var.a, false).S(true);
                            if (!(T instanceof h8)) {
                                h8 h8Var = new h8();
                                h8Var.whenFullyVisible(new bi.e(h8Var, j12, 21));
                                T.presentFragment(h8Var);
                                break;
                            } else {
                                cc.a0(T).I(R.raw.stars_topup, cd.L0(2131750230, null), cd.H(',', "Gift2Converted", (int) j12)).k(true);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                e4 e4Var2 = this.b;
                TLObject tLObject2 = this.c;
                long j13 = this.d;
                long j14 = this.e;
                q20 q20Var = (q20) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j15 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!vp.r1(e4Var2.a).k7) {
                            e6 y3 = e6.y(e4Var2.a, false);
                            a3.h0 h0Var = new a3.h0(e4Var2, j15, j13, q20Var, 7);
                            y3.e = false;
                            y3.q(h0Var, false, true);
                            y3.e = true;
                            break;
                        } else {
                            e4Var2.c2.setLoading(false);
                            e6.c0(e4Var2.getContext(), e4Var2.I0);
                            break;
                        }
                    } else {
                        q20Var.a(tL_error2);
                        e4Var2.k().f0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    vp.r1(e4Var2.a).V3(tL_payments_paymentResult.updates.users, false);
                    vp.r1(e4Var2.a).P3(tL_payments_paymentResult.updates.chats, false);
                    e6.y(e4Var2.a, false).S(false);
                    e6.y(e4Var2.a, false).P(j13);
                    e6.y(e4Var2.a, false).P(j14);
                    e6.y(e4Var2.a, false).O();
                    q20Var.a(null);
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j13 < 0 || j14 < 0) {
                            wb I = cc.a0(T2).I(R.raw.forward, cd.L0(2131749906, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749907, e4Var2.z1(), org.telegram.messenger.o5.t(j13))));
                            I.t = true;
                            I.j();
                        } else {
                            un ha = un.ha(j13);
                            ha.whenFullyVisible(new v1(e4Var2, ha, j13, 1));
                            T2.presentFragment(ha);
                        }
                    }
                    Utilities.d.c(new y1(e4Var2, tL_payments_paymentResult, i10));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ n1(e4 e4Var, org.telegram.ui.ActionBar.x1 x1Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.b = e4Var;
        this.n = x1Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f = tL_error;
    }
}
