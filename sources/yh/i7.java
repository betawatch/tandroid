package yh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.u9;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.gb0;
import org.telegram.ui.mk;
import org.telegram.ui.xn0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class i7 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.b1 a0;
    public w51 b0;
    public boolean c0;

    public i7(Context context, org.telegram.ui.ActionBar.e6 e6Var, TLRPC.User user, tg.b1 b1Var) {
        super(context, null, false, false, e6Var);
        this.Z = user;
        this.a0 = b1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        ll0 ll0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        ll0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i5, e6Var));
        ai.d1 d1Var = new ai.d1(context, 5, e6Var);
        this.X = d1Var;
        ((TextView) d1Var.c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        c90 c90Var = (c90) d1Var.d;
        final int i12 = 1;
        c90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) { // from class: yh.h7
            public final /* synthetic */ i7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i11) {
                    case 0:
                        i7 i7Var = this.b;
                        ew0 ew0Var = new ew0(i7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(i7Var.attachedFragment) && (n2Var = i7Var.attachedFragment) != null) {
                            ew0Var.makeAttached(n2Var);
                        }
                        ew0Var.show();
                        break;
                    default:
                        nf.f.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        c90Var.setMaxWidth(ci.f4.a(c90Var.getText(), c90Var.getPaint()) + 1);
        this.e.setTitle(y());
        f9 f9Var = new f9((org.telegram.ui.ActionBar.e6) null);
        f9Var.r(user);
        ((u9) d1Var.b).e(user, f9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        c90 c90Var2 = new c90(context, e6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        c90Var2.setTextSize(1, 12.0f);
        c90Var2.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B6, e6Var));
        c90Var2.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        c90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) { // from class: yh.h7
            public final /* synthetic */ i7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i12) {
                    case 0:
                        i7 i7Var = this.b;
                        ew0 ew0Var = new ew0(i7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(i7Var.attachedFragment) && (n2Var = i7Var.attachedFragment) != null) {
                            ew0Var.makeAttached(n2Var);
                        }
                        ew0Var.show();
                        break;
                    default:
                        nf.f.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        c90Var2.setGravity(17);
        c90Var2.setMaxWidth(ci.f4.a(c90Var2.getText(), c90Var2.getPaint()));
        frameLayout.addView(c90Var2, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        this.containerView.addView(new r00(getContext()), w7.x5.c(-1.0f, -1));
        w51 w51Var = this.b0;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    public static void P(i7 i7Var, int i10) {
        i51 G;
        w51 w51Var = i7Var.b0;
        if (w51Var == null || (G = w51Var.G(i10 - 1)) == null) {
            return;
        }
        w51 w51Var2 = i7Var.b0;
        if (G.d == -1) {
            i7Var.c0 = !i7Var.c0;
            w51Var2.N(true);
            i7Var.d.v0(0, AndroidUtilities.dp(200.0f), qr.g);
            return;
        }
        if (G.G(j7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
            Context findActivity = AndroidUtilities.findActivity(i7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            Context context = findActivity;
            if (context == null) {
                return;
            }
            long j3 = i7Var.Z.id;
            u5 y3 = u5.y(i7Var.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
            d80 d80Var = new d80(i7Var, G, j3, 2);
            int i11 = y3.a;
            if (!MessagesController.getInstance(i11).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
                if (R == null || R.getContext() == null) {
                    u5.e0(context, null);
                    return;
                } else {
                    u5.e0(R.getContext(), R.getResourceProvider());
                    return;
                }
            }
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady()) {
                TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift = new TLRPC.TL_inputStorePaymentStarsGift();
                tL_inputStorePaymentStarsGift.stars = tL_starsGiftOption.stars;
                tL_inputStorePaymentStarsGift.currency = tL_starsGiftOption.currency;
                tL_inputStorePaymentStarsGift.amount = tL_starsGiftOption.amount;
                tL_inputStorePaymentStarsGift.user_id = MessagesController.getInstance(i11).getInputUser(j3);
                c5.a aVar = new c5.a();
                aVar.b = "inapp";
                aVar.a = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar.a()), new ai.h6(y3, d80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
                return;
            }
            TLRPC.TL_inputStorePaymentStarsGift tL_inputStorePaymentStarsGift2 = new TLRPC.TL_inputStorePaymentStarsGift();
            tL_inputStorePaymentStarsGift2.stars = tL_starsGiftOption.stars;
            tL_inputStorePaymentStarsGift2.amount = tL_starsGiftOption.amount;
            tL_inputStorePaymentStarsGift2.currency = tL_starsGiftOption.currency;
            tL_inputStorePaymentStarsGift2.user_id = MessagesController.getInstance(i11).getInputUser(j3);
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGift2;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject p5 = ei.k3.p(u5.I(), false);
            if (p5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.t5(y3, d80Var, tL_inputInvoiceStars, 24));
        }
    }

    public static void Q(i7 i7Var, i51 i51Var, long j3, Boolean bool, String str) {
        tg.b1 b1Var;
        if (i7Var.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (b1Var = i7Var.a0) != null) {
            b1Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        gb0 gb0Var = LaunchActivity.G1.x0;
        if (U == null) {
            return;
        }
        if (!bool.booleanValue()) {
            if (str != null) {
                hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, vc.a0(U), R.raw.error, 36);
            }
        } else {
            oc K = vc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) i51Var.B, UserObject.getForcedFirstName(i7Var.Z))), LocaleController.getString(R.string.ViewInChat), new xn0(j3, 2));
            K.j = 5000;
            K.k(true);
            if (gb0Var != null) {
                gb0Var.c(true);
            }
            u5.y(i7Var.currentAccount, false).T(true);
        }
    }

    public final void R(ArrayList arrayList, w51 w51Var) {
        arrayList.add(i51.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = u5.y(this.currentAccount, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
            arrayList.add(i51.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < u10.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i12);
                if (this.c0 || !tL_starsGiftOption.extended) {
                    int i13 = i11 + 1;
                    int i14 = j7.a;
                    i51 J = i51.J(j7.class);
                    J.d = i12;
                    J.z = i11;
                    long j3 = tL_starsGiftOption.stars;
                    J.B = j3;
                    J.l = LocaleController.formatPluralStringSpaced("StarsCount", (int) j3);
                    J.m = tL_starsGiftOption.loadingStorePrice ? null : BillingController.getInstance().formatCurrency(tL_starsGiftOption.amount, tL_starsGiftOption.currency);
                    J.G = tL_starsGiftOption;
                    arrayList.add(J);
                    i11 = i13;
                } else {
                    i10++;
                }
            }
            boolean z10 = this.c0;
            if (!z10 && i10 > 0) {
                String string = LocaleController.getString(z10 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                boolean z11 = !this.c0;
                int i15 = f7.a;
                i51 J2 = i51.J(f7.class);
                J2.d = -1;
                J2.l = string;
                J2.f = z11;
                J2.q = true;
                arrayList.add(J2);
            }
        }
        arrayList.add(i51.k(this.Y));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (w51Var = this.b0) != null) {
            w51Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        mk mkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof bo) {
            bo boVar = (bo) R;
            if (boVar.x9() && (mkVar = boVar.Y) != null) {
                mkVar.Q();
            }
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.b0 = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        ai.d1 d1Var = this.X;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.c).getText();
    }
}
