package yh;

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
import org.telegram.ui.Components.cb;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.mb;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.tr;
import org.telegram.ui.Components.u00;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.ya;
import org.telegram.ui.Components.yc;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jk;
import org.telegram.ui.o20;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class n7 extends cb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final o20 Y;
    public final FrameLayout Z;
    public final u00 a0;
    public Runnable b0;
    public final TLRPC.InputPeer c0;
    public final boolean d0;
    public w61 e0;
    public boolean f0;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r7)) == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n7(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, int i10, String str, Runnable runnable, long j10) {
        super(context, null, false, false, d6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.b0 = runnable;
        TLRPC.InputPeer inputPeer = j10 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        this.c0 = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(u5.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.d0 = isReady;
        fixNavigationBar();
        zl0 zl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        zl0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new ai.g(this, 23));
        this.d.r1();
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(tr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i5, d6Var));
        this.X = j3;
        o20 o20Var = new o20(context, this.currentAccount, d6Var);
        TextView textView = (TextView) o20Var.e;
        this.Y = o20Var;
        ((TextView) o20Var.b).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j3 - u5.y(this.currentAccount, false).p().amount), new Object[0]));
        int i12 = 8;
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
            textView.setMaxWidth(ci.e4.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        q90 q90Var = new q90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        q90Var.setTextSize(1, 12.0f);
        q90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B6, d6Var));
        q90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, d6Var));
        if (isReady) {
            q90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new o2(this, i12)));
        } else {
            org.telegram.ui.Cells.c1.q(R.string.StarsPurchaseUnavailable, q90Var);
        }
        q90Var.setGravity(17);
        q90Var.setMaxWidth(ci.e4.a(q90Var.getText(), q90Var.getPaint()));
        frameLayout.addView(q90Var, w7.z5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, d6Var));
        u00 u00Var = new u00(getContext());
        this.a0 = u00Var;
        this.containerView.addView(u00Var, w7.z5.c(-1.0f, -1));
        w61 w61Var = this.e0;
        if (w61Var != null) {
            w61Var.N(false);
        }
    }

    public static void N(n7 n7Var, int i10) {
        h61 G;
        w61 w61Var = n7Var.e0;
        if (w61Var == null || (G = w61Var.G(i10 - 1)) == null) {
            return;
        }
        w61 w61Var2 = n7Var.e0;
        if (G.d == -1) {
            n7Var.f0 = !n7Var.f0;
            w61Var2.N(true);
        } else if (G.H(k7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(n7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            u5.y(n7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, n7Var, G), n7Var.c0);
        }
    }

    public static void O(n7 n7Var, h61 h61Var, Boolean bool, String str) {
        if (n7Var.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new yc((FrameLayout) n7Var.containerView, n7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) h61Var.B, new Object[0])), R.raw.stars_topup).j();
            n7Var.a0.c(true);
            u5.y(n7Var.currentAccount, false).T(true);
        } else if (str != null) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new yc((FrameLayout) n7Var.containerView, n7Var.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void P(ArrayList arrayList, w61 w61Var) {
        long j3;
        o20 o20Var = this.Y;
        arrayList.add(h61.m(o20Var));
        boolean z10 = this.d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = u5.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(h61.p(31));
                arrayList.add(h61.p(31));
                arrayList.add(h61.p(31));
            } else {
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                boolean z12 = false;
                int i14 = 1;
                while (true) {
                    int size = z11.size();
                    j3 = this.X;
                    if (i11 >= size) {
                        break;
                    }
                    TL_stars.TL_starsTopupOption tL_starsTopupOption = (TL_stars.TL_starsTopupOption) z11.get(i11);
                    if (tL_starsTopupOption.stars >= j3) {
                        if (tL_starsTopupOption.extended && !this.f0 && z12) {
                            i13++;
                        } else {
                            arrayList.add(k7.a(i11, i14, tL_starsTopupOption));
                            i12++;
                            i14++;
                            z12 = true;
                        }
                    }
                    i11++;
                }
                if (i12 < 3) {
                    arrayList.clear();
                    arrayList.add(h61.k(o20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(k7.a(i16, i14, tL_starsTopupOption2));
                            i15++;
                            i14++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(k7.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i14++;
                        }
                        boolean z13 = this.f0;
                        if (!z13 && i13 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.f0;
                            int i17 = g7.a;
                            h61 K = h61.K(g7.class);
                            K.d = -1;
                            K.l = string;
                            K.f = z14;
                            K.q = true;
                            arrayList.add(K);
                        }
                    } else {
                        this.f0 = true;
                    }
                } else if (i12 > 0) {
                    boolean z15 = this.f0;
                    if (!z15 && i13 > 0) {
                        String string2 = LocaleController.getString(z15 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z16 = !this.f0;
                        int i18 = g7.a;
                        h61 K2 = h61.K(g7.class);
                        K2.d = -1;
                        K2.l = string2;
                        K2.f = z16;
                        K2.q = true;
                        arrayList.add(K2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(k7.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i14++;
                    }
                }
            }
        }
        arrayList.add(h61.k(this.Z));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            w61 w61Var = this.e0;
            if (w61Var != null) {
                w61Var.N(true);
            }
            long j3 = u5.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.Y.b;
            long j10 = this.X;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            ya yaVar = this.e;
            if (yaVar != null) {
                yaVar.setTitle(y());
            }
            if (j3 < j10 || (runnable = this.b0) == null) {
                return;
            }
            runnable.run();
            this.b0 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.j2
    public final void dismiss() {
        super.dismiss();
        o20 o20Var = this.Y;
        if (o20Var != null) {
            ((sg.e) o20Var.c).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.f3
    public final void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.ActionBar.f3, android.app.Dialog
    public final void show() {
        jk jkVar;
        if (!this.d0) {
            org.telegram.messenger.q.p(R.string.PaymentInvoiceDisabledStarsText, new yc(mb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (u5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R instanceof yn) {
            yn ynVar = (yn) R;
            if (ynVar.w9() && (jkVar = ynVar.W) != null) {
                jkVar.N();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.cb
    public final yl0 v(zl0 zl0Var) {
        w61 w61Var = new w61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 29), this.resourcesProvider);
        this.e0 = w61Var;
        return w61Var;
    }

    @Override // org.telegram.ui.Components.cb
    public final CharSequence y() {
        o20 o20Var = this.Y;
        if (o20Var == null) {
            return null;
        }
        return ((TextView) o20Var.b).getText();
    }
}
