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
import org.telegram.ui.Components.ab;
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.ul0;
import org.telegram.ui.Components.v9;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ib0;
import org.telegram.ui.lk;
import org.telegram.ui.yn0;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class h7 extends ab implements NotificationCenter.NotificationCenterDelegate {
    public final ai.d1 X;
    public final FrameLayout Y;
    public final TLRPC.User Z;
    public final tg.a1 a0;
    public k61 b0;
    public boolean c0;

    public h7(Context context, org.telegram.ui.ActionBar.f6 f6Var, TLRPC.User user, tg.a1 a1Var) {
        super(context, null, false, false, f6Var);
        this.Z = user;
        this.a0 = a1Var;
        this.v = 0.2f;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiftOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
        fixNavigationBar();
        vl0 vl0Var = this.d;
        int i10 = this.backgroundPaddingLeft;
        final int i11 = 0;
        vl0Var.setPadding(i10, 0, i10, 0);
        this.d.setOnItemClickListener(new ai.g(this, 22));
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.i5, f6Var));
        ai.d1 d1Var = new ai.d1(context, 5, f6Var);
        this.X = d1Var;
        ((TextView) d1Var.c).setText(LocaleController.getString(R.string.GiftStarsTitle));
        k90 k90Var = (k90) d1Var.d;
        final int i12 = 1;
        k90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftStarsSubtitle, UserObject.getForcedFirstName(user))), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.GiftStarsSubtitleLinkName).replace(' ', (char) 160), new Runnable(this) { // from class: yh.g7
            public final /* synthetic */ h7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i11) {
                    case 0:
                        h7 h7Var = this.b;
                        pw0 pw0Var = new pw0(h7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(h7Var.attachedFragment) && (n2Var = h7Var.attachedFragment) != null) {
                            pw0Var.makeAttached(n2Var);
                        }
                        pw0Var.show();
                        break;
                    default:
                        nf.f.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }), true)));
        k90Var.setMaxWidth(ci.f4.a(k90Var.getText(), k90Var.getPaint()) + 1);
        this.e.setTitle(y());
        g9 g9Var = new g9((org.telegram.ui.ActionBar.f6) null);
        g9Var.r(user);
        ((v9) d1Var.b).e(user, g9Var);
        FrameLayout frameLayout = new FrameLayout(context);
        this.Y = frameLayout;
        k90 k90Var2 = new k90(context, f6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        k90Var2.setTextSize(1, 12.0f);
        k90Var2.setTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.B6, f6Var));
        k90Var2.setLinkTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.gc, f6Var));
        k90Var2.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new Runnable(this) { // from class: yh.g7
            public final /* synthetic */ h7 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                org.telegram.ui.ActionBar.n2 n2Var;
                switch (i12) {
                    case 0:
                        h7 h7Var = this.b;
                        pw0 pw0Var = new pw0(h7Var.getContext());
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(h7Var.attachedFragment) && (n2Var = h7Var.attachedFragment) != null) {
                            pw0Var.makeAttached(n2Var);
                        }
                        pw0Var.show();
                        break;
                    default:
                        nf.f.s(this.b.getContext(), LocaleController.getString(R.string.StarsTOSLink));
                        break;
                }
            }
        }));
        k90Var2.setGravity(17);
        k90Var2.setMaxWidth(ci.f4.a(k90Var2.getText(), k90Var2.getPaint()));
        frameLayout.addView(k90Var2, w7.y5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.h5, f6Var));
        this.containerView.addView(new r00(getContext()), w7.y5.c(-1.0f, -1));
        k61 k61Var = this.b0;
        if (k61Var != null) {
            k61Var.N(false);
        }
    }

    public static void P(h7 h7Var, int i10) {
        w51 G;
        k61 k61Var = h7Var.b0;
        if (k61Var == null || (G = k61Var.G(i10 - 1)) == null) {
            return;
        }
        k61 k61Var2 = h7Var.b0;
        if (G.d == -1) {
            h7Var.c0 = !h7Var.c0;
            k61Var2.N(true);
            h7Var.d.w0(0, AndroidUtilities.dp(200.0f), qr.g);
            return;
        }
        if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsGiftOption)) {
            Context findActivity = AndroidUtilities.findActivity(h7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            Context context = findActivity;
            if (context == null) {
                return;
            }
            long j3 = h7Var.Z.id;
            u5 y3 = u5.y(h7Var.currentAccount, false);
            TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) G.G;
            l80 l80Var = new l80(h7Var, G, j3, 2);
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
                aVar.c = "inapp";
                aVar.b = tL_starsGiftOption.store_product;
                BillingController.getInstance().queryProductDetails(Arrays.asList(aVar.a()), new ai.h6(y3, l80Var, tL_inputStorePaymentStarsGift, tL_starsGiftOption, context));
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
            ConnectionsManager.getInstance(i11).sendRequest(tL_payments_getPaymentForm, new ai.t5(y3, l80Var, tL_inputInvoiceStars, 24));
        }
    }

    public static void Q(h7 h7Var, w51 w51Var, long j3, Boolean bool, String str) {
        tg.a1 a1Var;
        if (h7Var.getContext() == null) {
            return;
        }
        if ((bool.booleanValue() || str != null) && (a1Var = h7Var.a0) != null) {
            a1Var.run();
        }
        super.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        ib0 ib0Var = LaunchActivity.G1.x0;
        if (U == null) {
            return;
        }
        if (!bool.booleanValue()) {
            if (str != null) {
                hg.k0.q(R.string.UnknownErrorCode, new Object[]{str}, xc.a0(U), R.raw.error, 36);
            }
        } else {
            pc K = xc.a0(U).K(R.raw.stars_send, LocaleController.getString(R.string.StarsGiftSentPopup), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftSentPopupInfo", (int) w51Var.B, UserObject.getForcedFirstName(h7Var.Z))), LocaleController.getString(R.string.ViewInChat), new yn0(j3, 2));
            K.j = 5000;
            K.k(true);
            if (ib0Var != null) {
                ib0Var.c(true);
            }
            u5.y(h7Var.currentAccount, false).T(true);
        }
    }

    public final void R(ArrayList arrayList, k61 k61Var) {
        arrayList.add(w51.k(this.X));
        com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        ArrayList u10 = u5.y(this.currentAccount, false).u();
        if (u10 == null || u10.isEmpty()) {
            arrayList.add(w51.n(31));
            arrayList.add(w51.n(31));
            arrayList.add(w51.n(31));
        } else {
            int i10 = 0;
            int i11 = 1;
            for (int i12 = 0; i12 < u10.size(); i12++) {
                TL_stars.TL_starsGiftOption tL_starsGiftOption = (TL_stars.TL_starsGiftOption) u10.get(i12);
                if (this.c0 || !tL_starsGiftOption.extended) {
                    int i13 = i11 + 1;
                    int i14 = i7.a;
                    w51 J = w51.J(i7.class);
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
                int i15 = e7.a;
                w51 J2 = w51.J(e7.class);
                J2.d = -1;
                J2.l = string;
                J2.f = z11;
                J2.q = true;
                arrayList.add(J2);
            }
        }
        arrayList.add(w51.k(this.Y));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k61 k61Var;
        if ((i10 == NotificationCenter.starGiftOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) && (k61Var = this.b0) != null) {
            k61Var.N(true);
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
        lk lkVar;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof zn) {
            zn znVar = (zn) R;
            if (znVar.x9() && (lkVar = znVar.Y) != null) {
                lkVar.P();
            }
        }
        super.show();
    }

    @Override // org.telegram.ui.Components.ab
    public final ul0 v(vl0 vl0Var) {
        k61 k61Var = new k61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 27), this.resourcesProvider);
        this.b0 = k61Var;
        return k61Var;
    }

    @Override // org.telegram.ui.Components.ab
    public final CharSequence y() {
        ai.d1 d1Var = this.X;
        if (d1Var == null) {
            return null;
        }
        return ((TextView) d1Var.c).getText();
    }
}
