package zh;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AppGlobalConfig;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.db;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nb;
import org.telegram.ui.Components.za;
import org.telegram.ui.Components.zc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fo;
import org.telegram.ui.s20;
import org.telegram.ui.sk;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class e7 extends db implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final s20 Y;
    public final FrameLayout Z;
    public final d10 a0;
    public Runnable b0;
    public final TLRPC.InputPeer c0;
    public final boolean d0;
    public a71 e0;
    public boolean f0;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r6)) == null) goto L69;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public e7(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        super(context, null, false, false, c6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.b0 = runnable;
        TLRPC.InputPeer inputPeer = j11 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j11);
        this.c0 = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(n5.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.d0 = isReady;
        fixNavigationBar();
        mm0 mm0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        mm0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new bi.d(this, 23));
        this.d.p1();
        s4.k kVar = new s4.k();
        kVar.m = false;
        kVar.C = false;
        kVar.o(es.h);
        kVar.n(350L);
        this.d.setItemAnimator(kVar);
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i5, c6Var));
        this.X = j10;
        s20 s20Var = new s20(context, this.currentAccount, c6Var);
        TextView textView = (TextView) s20Var.e;
        this.Y = s20Var;
        ((TextView) s20Var.b).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j10 - n5.y(this.currentAccount, false).p().amount), new Object[0]));
        if (i10 == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            if (i10 != 2) {
                if (i10 == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i10 == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i10 != 3) {
                    if (i10 == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                    } else {
                        str2 = i10 == 5 ? "StarsNeededTextReactions" : i10 == 6 ? "StarsNeededTextGift" : i10 == 12 ? "StarsNeededTextGiftChannel" : i10 == 13 ? "StarsNeededTextPrivateMessage" : i10 == 10 ? "StarsNeededTextGiftUpgrade" : i10 == 11 ? "StarsNeededTextGiftTransfer" : i10 == 9 ? "StarsNeededBizText" : i10 == 14 ? "StarsNeededTextGiftBuyResale" : i10 == 15 ? "StarsNeededTextSearch" : i10 == 16 ? "StarsNeededRemoveGiftDescription" : i10 == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
                    }
                }
            }
            str2 = "StarsNeededTextKeepSubscription";
        }
        str3 = str2;
        if (TextUtils.isEmpty(str3)) {
            textView.setText("");
        } else {
            String nullable = LocaleController.nullable(LocaleController.formatString(str3, 0, str));
            textView.setText(AndroidUtilities.replaceTags(nullable == null ? LocaleController.getString(str3) : nullable));
            textView.setMaxWidth(di.d4.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(B());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        da0 da0Var = new da0(context, c6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        da0Var.setTextSize(1, 12.0f);
        da0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.B6, c6Var));
        da0Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        if (isReady) {
            da0Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new zf.c(this, 18)));
        } else {
            org.telegram.ui.Cells.c1.o(R.string.StarsPurchaseUnavailable, da0Var);
        }
        da0Var.setGravity(17);
        da0Var.setMaxWidth(di.d4.a(da0Var.getText(), da0Var.getPaint()));
        frameLayout.addView(da0Var, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.h5, c6Var));
        d10 d10Var = new d10(getContext());
        this.a0 = d10Var;
        this.containerView.addView(d10Var, w7.z5.d(-1.0f, -1));
        a71 a71Var = this.e0;
        if (a71Var != null) {
            a71Var.N(false);
        }
    }

    public static void Q(e7 e7Var, int i10) {
        m61 G;
        a71 a71Var = e7Var.e0;
        if (a71Var == null || (G = a71Var.G(i10 - 1)) == null) {
            return;
        }
        a71 a71Var2 = e7Var.e0;
        if (G.d == -1) {
            e7Var.f0 = !e7Var.f0;
            a71Var2.N(true);
        } else if (G.G(b7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(e7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            n5.y(e7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new rh.r(5, e7Var, G), e7Var.c0);
        }
    }

    public static void R(e7 e7Var, m61 m61Var, Boolean bool, String str) {
        if (e7Var.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new zc((FrameLayout) e7Var.containerView, e7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) m61Var.B, new Object[0])), R.raw.stars_topup).j();
            e7Var.a0.c(true);
            n5.y(e7Var.currentAccount, false).T(true);
        } else if (str != null) {
            i2.d.s(R.string.UnknownErrorCode, new Object[]{str}, new zc((FrameLayout) e7Var.containerView, e7Var.resourcesProvider), R.raw.error, 36);
        }
    }

    @Override // org.telegram.ui.Components.db
    public final CharSequence B() {
        s20 s20Var = this.Y;
        if (s20Var == null) {
            return null;
        }
        return ((TextView) s20Var.b).getText();
    }

    public final void S(ArrayList arrayList, a71 a71Var) {
        long j10;
        s20 s20Var = this.Y;
        arrayList.add(m61.l(s20Var));
        boolean z10 = this.d0;
        if (z10) {
            i2.d.p(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = n5.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(m61.n(31));
                arrayList.add(m61.n(31));
                arrayList.add(m61.n(31));
            } else {
                int i11 = 1;
                int i12 = 0;
                int i13 = 0;
                int i14 = 0;
                boolean z12 = false;
                while (true) {
                    int size = z11.size();
                    j10 = this.X;
                    if (i12 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i12);
                    if (tL_starsTopupOption.stars >= j10) {
                        if (tL_starsTopupOption.extended && !this.f0 && z12) {
                            i14++;
                        } else {
                            arrayList.add(b7.a(i12, i11, tL_starsTopupOption));
                            i13++;
                            i11++;
                            z12 = true;
                        }
                    }
                    i12++;
                }
                if (i13 < 3) {
                    arrayList.clear();
                    arrayList.add(m61.k(s20Var));
                    i2.d.p(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j10) {
                            arrayList.add(b7.a(i16, i11, tL_starsTopupOption2));
                            i15++;
                            i11++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(b7.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i11++;
                        }
                        boolean z13 = this.f0;
                        if (!z13 && i14 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.f0;
                            int i17 = x6.a;
                            m61 J = m61.J(x6.class);
                            J.d = -1;
                            J.l = string;
                            J.f = z14;
                            J.q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f0 = true;
                    }
                } else if (i13 > 0) {
                    boolean z15 = this.f0;
                    if (!z15 && i14 > 0) {
                        String string2 = LocaleController.getString(z15 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z16 = !this.f0;
                        int i18 = x6.a;
                        m61 J2 = m61.J(x6.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z16;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(b7.a(i10, i11, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i11++;
                    }
                }
            }
        }
        arrayList.add(m61.k(this.Z));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            a71 a71Var = this.e0;
            if (a71Var != null) {
                a71Var.N(true);
            }
            long j10 = n5.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.Y.b;
            long j11 = this.X;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j11 - j10)));
            za zaVar = this.e;
            if (zaVar != null) {
                zaVar.setTitle(B());
            }
            if (j10 < j11 || (runnable = this.b0) == null) {
                return;
            }
            runnable.run();
            this.b0 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.i2
    public final void dismiss() {
        super.dismiss();
        s20 s20Var = this.Y;
        if (s20Var != null) {
            ((tg.n) s20Var.c).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.e3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.e3, android.app.Dialog
    public final void show() {
        sk skVar;
        if (!this.d0) {
            org.telegram.messenger.g0.q(R.string.PaymentInvoiceDisabledStarsText, new zc(nb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (n5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof fo) {
            fo foVar = (fo) R;
            if (foVar.C9() && (skVar = foVar.Y) != null) {
                skVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.db
    public final lm0 x(mm0 mm0Var) {
        a71 a71Var = new a71(this.d, getContext(), this.currentAccount, 0, true, new ii.a(this, 28), this.resourcesProvider);
        this.e0 = a71Var;
        return a71Var;
    }
}
