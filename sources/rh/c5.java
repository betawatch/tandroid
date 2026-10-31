package rh;

import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.j20;
import org.telegram.messenger.q00;
import org.telegram.messenger.vp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w90;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class c5 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ e6 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ j20 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.p6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject w;
    public final /* synthetic */ TLObject x;

    public /* synthetic */ c5(e6 e6Var, TLObject tLObject, TLRPC.TL_error tL_error, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, long j11, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = e6Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = j20Var;
        this.f = context;
        this.h = p6Var;
        this.n = j10;
        this.r = str;
        this.s = j11;
        this.w = tLObject2;
        this.x = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w90 w90Var;
        w90 w90Var2;
        switch (this.a) {
            case 0:
                e6 e6Var = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                j20 j20Var = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.p6 p6Var = this.h;
                long j10 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.w;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.x;
                long j11 = this.s;
                org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
                cc X = (Q == null || Q.visibleDialog != null) ? cc.X() : cc.a0(Q);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!vp.r1(e6Var.a).k7) {
                            boolean[] zArr = {false};
                            x7 x7Var = new x7(context, p6Var, j10, 6, str, new q00(e6Var, zArr, tL_payments_paymentFormStarGift, starGift, j11, j20Var), 0L);
                            x7Var.setOnDismissListener(new d5(j20Var, zArr, 2));
                            x7Var.show();
                            break;
                        } else {
                            j20Var.a(Boolean.FALSE, null);
                            e6.c0(context, p6Var);
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        j20Var.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        j20Var.a(Boolean.FALSE, null);
                        X.Q(R.raw.error, 36, cd.a0(null, null, 2131743903, tL_error != null ? tL_error.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new b5(e6Var, (TLRPC.TL_payments_paymentResult) tLObject, 4));
                    e6Var.D = false;
                    e6Var.E = true;
                    e6Var.G = 0L;
                    e6Var.U();
                    e6Var.P(j11);
                    e6Var.S(true);
                    j20Var.a(Boolean.TRUE, null);
                    org.telegram.messenger.w1 b10 = org.telegram.messenger.y1.a(e6Var.a).b();
                    if (b10 != null && b10.a(j11)) {
                        vp.r1(e6Var.a).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j11, false).apply();
                    }
                    vp.r1(e6Var.a).f7.edit().putBoolean("show_gift_for_" + j11, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j11, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.I1;
                    if (launchActivity != null && (w90Var = launchActivity.x0) != null) {
                        w90Var.c(true);
                        break;
                    }
                }
                break;
            default:
                e6 e6Var2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                j20 j20Var2 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.p6 p6Var2 = this.h;
                long j12 = this.n;
                String str2 = this.r;
                long j13 = this.s;
                TLObject tLObject3 = this.w;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.x;
                org.telegram.ui.ActionBar.k2 Q2 = LaunchActivity.Q();
                cc X2 = (Q2 == null || Q2.visibleDialog != null) ? cc.X() : cc.a0(Q2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!vp.r1(e6Var2.a).k7) {
                            boolean[] zArr2 = {false};
                            x7 x7Var2 = new x7(context2, p6Var2, j12, 6, str2, new q00(e6Var2, zArr2, j13, tLObject3, tL_textWithEntities, j20Var2), 0L);
                            x7Var2.setOnDismissListener(new d5(j20Var2, zArr2, 1));
                            x7Var2.show();
                            break;
                        } else {
                            j20Var2.a(Boolean.FALSE, null);
                            e6.c0(context2, p6Var2);
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        j20Var2.a(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        j20Var2.a(Boolean.FALSE, null);
                        X2.Q(R.raw.error, 36, cd.a0(null, null, 2131743903, tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS")).j();
                        break;
                    }
                } else {
                    Utilities.d.c(new b5(e6Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 3));
                    e6Var2.S(true);
                    j20Var2.a(Boolean.TRUE, null);
                    org.telegram.messenger.w1 b11 = org.telegram.messenger.y1.a(e6Var2.a).b();
                    if (b11 != null && b11.a(j13)) {
                        vp.r1(e6Var2.a).f7.edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j13, false).apply();
                    }
                    vp.r1(e6Var2.a).f7.edit().putBoolean("show_gift_for_" + j13, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j13, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.I1;
                    if (launchActivity2 != null && (w90Var2 = launchActivity2.x0) != null) {
                        w90Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ c5(e6 e6Var, TLObject tLObject, TLRPC.TL_error tL_error, j20 j20Var, Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j11) {
        this.b = e6Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = j20Var;
        this.f = context;
        this.h = p6Var;
        this.n = j10;
        this.r = str;
        this.w = tL_payments_paymentFormStarGift;
        this.x = starGift;
        this.s = j11;
    }
}
