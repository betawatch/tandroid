package rh;

import android.os.Bundle;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.r20;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.s61;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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

    public /* synthetic */ n1(e4 e4Var, TLObject tLObject, long j10, long j11, r20 r20Var, TLRPC.TL_error tL_error, long j12) {
        this.b = e4Var;
        this.c = tLObject;
        this.d = j10;
        this.e = j11;
        this.n = r20Var;
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
                            e4Var.k().t(dd.L0(2131743904, null), null).k(false);
                            break;
                        } else {
                            e4Var.k().t(dd.a0(null, null, 2131743903, tL_error.text), null).k(false);
                            break;
                        }
                    } else {
                        e4Var.dismiss();
                        e6.y(e4Var.a, false).P(j10);
                        if (j10 < 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("chat_id", -j10);
                            bundle.putBoolean("start_from_monetization", true);
                            s61 s61Var = new s61(bundle);
                            r.g(e4Var.a).h(j10, true);
                            r.g(e4Var.a).l(j10);
                            s61Var.whenFullyVisible(new bi.e(s61Var, j12, 22));
                            T.presentFragment(s61Var);
                            break;
                        } else {
                            TLRPC.UserFull a2 = wp.r1(e4Var.a).a2(j11);
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
                                cc.a0(T).I(R.raw.stars_topup, dd.L0(2131750230, null), dd.H(',', "Gift2Converted", (int) j12)).k(true);
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
                r20 r20Var = (r20) this.n;
                TLRPC.TL_error tL_error2 = this.f;
                long j15 = this.h;
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!wp.r1(e4Var2.a).k7) {
                            e6 y3 = e6.y(e4Var2.a, false);
                            a3.h0 h0Var = new a3.h0(e4Var2, j15, j13, r20Var, 7);
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
                        r20Var.a(tL_error2);
                        e4Var2.k().f0(tL_error2, false);
                        break;
                    }
                } else {
                    TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject2;
                    wp.r1(e4Var2.a).V3(tL_payments_paymentResult.updates.users, false);
                    wp.r1(e4Var2.a).P3(tL_payments_paymentResult.updates.chats, false);
                    e6.y(e4Var2.a, false).S(false);
                    e6.y(e4Var2.a, false).P(j13);
                    e6.y(e4Var2.a, false).P(j14);
                    e6.y(e4Var2.a, false).O();
                    r20Var.a(null);
                    org.telegram.ui.ActionBar.k2 T2 = LaunchActivity.T();
                    if (T2 != null) {
                        if (j13 < 0 || j14 < 0) {
                            wb I = cc.a0(T2).I(R.raw.forward, dd.L0(2131749906, null), org.telegram.messenger.i0.W2(dd.a0(null, null, 2131749907, e4Var2.z1(), org.telegram.messenger.o5.t(j13))));
                            I.t = true;
                            I.j();
                        } else {
                            un ma2 = un.ma(j13);
                            ma2.whenFullyVisible(new v1(e4Var2, ma2, j13, 1));
                            T2.presentFragment(ma2);
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
