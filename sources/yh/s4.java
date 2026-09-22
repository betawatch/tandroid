package yh;

import ai.ga;
import android.content.Context;
import java.util.Calendar;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final /* synthetic */ class s4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ u5 b;
    public final /* synthetic */ TLObject c;
    public final /* synthetic */ TLRPC.TL_error d;
    public final /* synthetic */ Utilities.Callback2 e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ org.telegram.ui.ActionBar.f6 h;
    public final /* synthetic */ long n;
    public final /* synthetic */ String r;
    public final /* synthetic */ long s;
    public final /* synthetic */ TLObject v;
    public final /* synthetic */ TLObject w;

    public /* synthetic */ s4(u5 u5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, long j10, TLObject tLObject2, TLRPC.TL_textWithEntities tL_textWithEntities) {
        this.b = u5Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = f6Var;
        this.n = j3;
        this.r = str;
        this.s = j10;
        this.v = tLObject2;
        this.w = tL_textWithEntities;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ib0 ib0Var;
        ib0 ib0Var2;
        switch (this.a) {
            case 0:
                u5 u5Var = this.b;
                TLObject tLObject = this.c;
                TLRPC.TL_error tL_error = this.d;
                Utilities.Callback2 callback2 = this.e;
                Context context = this.f;
                org.telegram.ui.ActionBar.f6 f6Var = this.h;
                long j3 = this.n;
                String str = this.r;
                TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift = (TLRPC.TL_payments_paymentFormStarGift) this.v;
                TL_stars.StarGift starGift = (TL_stars.StarGift) this.w;
                long j10 = this.s;
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                xc X = (R == null || R.visibleDialog != null) ? xc.X() : xc.a0(R);
                if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
                        if (!MessagesController.getInstance(u5Var.a).starsPurchaseAvailable()) {
                            callback2.run(Boolean.FALSE, null);
                            u5.e0(context, f6Var);
                            break;
                        } else {
                            boolean[] zArr = {false};
                            l7 l7Var = new l7(context, f6Var, j3, 6, str, new ga(u5Var, zArr, tL_payments_paymentFormStarGift, starGift, j10, callback2), 0L);
                            l7Var.setOnDismissListener(new u4(callback2, zArr, 2));
                            l7Var.show();
                            break;
                        }
                    } else if (tL_error != null && "STARGIFT_USAGE_LIMITED".equals(tL_error.text)) {
                        callback2.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback2.run(Boolean.FALSE, null);
                        hg.k0.q(R.string.UnknownErrorCode, new Object[]{tL_error != null ? tL_error.text : "FAILED_SEND_STARS"}, X, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new t4(u5Var, (TLRPC.TL_payments_paymentResult) tLObject, 3));
                    u5Var.D = false;
                    u5Var.E = true;
                    u5Var.G = 0L;
                    u5Var.V();
                    u5Var.Q(j10);
                    u5Var.T(true);
                    callback2.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(u5Var.a).contains(j10)) {
                        MessagesController.getInstance(u5Var.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j10, false).apply();
                    }
                    MessagesController.getInstance(u5Var.a).getMainSettings().edit().putBoolean("show_gift_for_" + j10, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j10, true).apply();
                    LaunchActivity launchActivity = LaunchActivity.G1;
                    if (launchActivity != null && (ib0Var = launchActivity.x0) != null) {
                        ib0Var.c(true);
                        break;
                    }
                }
                break;
            default:
                u5 u5Var2 = this.b;
                TLObject tLObject2 = this.c;
                TLRPC.TL_error tL_error2 = this.d;
                Utilities.Callback2 callback22 = this.e;
                Context context2 = this.f;
                org.telegram.ui.ActionBar.f6 f6Var2 = this.h;
                long j11 = this.n;
                String str2 = this.r;
                long j12 = this.s;
                TLObject tLObject3 = this.v;
                TLRPC.TL_textWithEntities tL_textWithEntities = (TLRPC.TL_textWithEntities) this.w;
                org.telegram.ui.ActionBar.n2 R2 = LaunchActivity.R();
                xc X2 = (R2 == null || R2.visibleDialog != null) ? xc.X() : xc.a0(R2);
                if (!(tLObject2 instanceof TLRPC.TL_payments_paymentResult)) {
                    if (tL_error2 != null && "BALANCE_TOO_LOW".equals(tL_error2.text)) {
                        if (!MessagesController.getInstance(u5Var2.a).starsPurchaseAvailable()) {
                            callback22.run(Boolean.FALSE, null);
                            u5.e0(context2, f6Var2);
                            break;
                        } else {
                            boolean[] zArr2 = {false};
                            l7 l7Var2 = new l7(context2, f6Var2, j11, 6, str2, new ga(u5Var2, zArr2, j12, tLObject3, tL_textWithEntities, callback22), 0L);
                            l7Var2.setOnDismissListener(new u4(callback22, zArr2, 1));
                            l7Var2.show();
                            break;
                        }
                    } else if (tL_error2 != null && "STARGIFT_USAGE_LIMITED".equals(tL_error2.text)) {
                        callback22.run(Boolean.FALSE, "STARGIFT_USAGE_LIMITED");
                        break;
                    } else {
                        callback22.run(Boolean.FALSE, null);
                        hg.k0.q(R.string.UnknownErrorCode, new Object[]{tL_error2 != null ? tL_error2.text : "FAILED_SEND_STARS"}, X2, R.raw.error, 36);
                        break;
                    }
                } else {
                    Utilities.stageQueue.postRunnable(new t4(u5Var2, (TLRPC.TL_payments_paymentResult) tLObject2, 2));
                    u5Var2.T(true);
                    callback22.run(Boolean.TRUE, null);
                    if (BirthdayController.getInstance(u5Var2.a).contains(j12)) {
                        MessagesController.getInstance(u5Var2.a).getMainSettings().edit().putBoolean(Calendar.getInstance().get(1) + "bdayhint_" + j12, false).apply();
                    }
                    MessagesController.getInstance(u5Var2.a).getMainSettings().edit().putBoolean("show_gift_for_" + j12, true).putBoolean(Calendar.getInstance().get(1) + "show_gift_for_" + j12, true).apply();
                    LaunchActivity launchActivity2 = LaunchActivity.G1;
                    if (launchActivity2 != null && (ib0Var2 = launchActivity2.x0) != null) {
                        ib0Var2.c(true);
                        break;
                    }
                }
                break;
        }
    }

    public /* synthetic */ s4(u5 u5Var, TLObject tLObject, TLRPC.TL_error tL_error, Utilities.Callback2 callback2, Context context, org.telegram.ui.ActionBar.f6 f6Var, long j3, String str, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift, TL_stars.StarGift starGift, long j10) {
        this.b = u5Var;
        this.c = tLObject;
        this.d = tL_error;
        this.e = callback2;
        this.f = context;
        this.h = f6Var;
        this.n = j3;
        this.r = str;
        this.v = tL_payments_paymentFormStarGift;
        this.w = starGift;
        this.s = j10;
    }
}
