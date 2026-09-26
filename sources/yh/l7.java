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
import org.telegram.ui.Components.bb;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.lb;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.j20;
import org.telegram.ui.jk;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class l7 extends bb implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final j20 Y;
    public final FrameLayout Z;
    public final s00 a0;
    public Runnable b0;
    public final TLRPC.InputPeer c0;
    public final boolean d0;
    public j61 e0;
    public boolean f0;

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0104, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r7)) == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public l7(Context context, org.telegram.ui.ActionBar.d6 d6Var, long j3, int i10, String str, Runnable runnable, long j10) {
        super(context, null, false, false, d6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.b0 = runnable;
        TLRPC.InputPeer inputPeer = j10 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        this.c0 = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(s5.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.d0 = isReady;
        fixNavigationBar();
        wl0 wl0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wl0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new ai.g(this, 23));
        this.d.p1();
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(rr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.i5, d6Var));
        this.X = j3;
        j20 j20Var = new j20(context, this.currentAccount, d6Var);
        TextView textView = (TextView) j20Var.e;
        this.Y = j20Var;
        ((TextView) j20Var.b).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j3 - s5.y(this.currentAccount, false).p().amount), new Object[0]));
        int i12 = 7;
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
        n90 n90Var = new n90(context, d6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        n90Var.setTextSize(1, 12.0f);
        n90Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.B6, d6Var));
        n90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.gc, d6Var));
        if (isReady) {
            n90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new r2(this, i12)));
        } else {
            org.telegram.ui.Cells.c1.q(R.string.StarsPurchaseUnavailable, n90Var);
        }
        n90Var.setGravity(17);
        n90Var.setMaxWidth(ci.e4.a(n90Var.getText(), n90Var.getPaint()));
        frameLayout.addView(n90Var, w7.y5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.h5, d6Var));
        s00 s00Var = new s00(getContext());
        this.a0 = s00Var;
        this.containerView.addView(s00Var, w7.y5.c(-1.0f, -1));
        j61 j61Var = this.e0;
        if (j61Var != null) {
            j61Var.N(false);
        }
    }

    public static void P(l7 l7Var, int i10) {
        v51 G;
        j61 j61Var = l7Var.e0;
        if (j61Var == null || (G = j61Var.G(i10 - 1)) == null) {
            return;
        }
        j61 j61Var2 = l7Var.e0;
        if (G.d == -1) {
            l7Var.f0 = !l7Var.f0;
            j61Var2.N(true);
        } else if (G.G(i7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(l7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            s5.y(l7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, l7Var, G), l7Var.c0);
        }
    }

    public static void Q(l7 l7Var, v51 v51Var, Boolean bool, String str) {
        if (l7Var.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new xc((FrameLayout) l7Var.containerView, l7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) v51Var.B, new Object[0])), R.raw.stars_topup).j();
            l7Var.a0.c(true);
            s5.y(l7Var.currentAccount, false).T(true);
        } else if (str != null) {
            hg.c.q(R.string.UnknownErrorCode, new Object[]{str}, new xc((FrameLayout) l7Var.containerView, l7Var.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, j61 j61Var) {
        long j3;
        j20 j20Var = this.Y;
        arrayList.add(v51.l(j20Var));
        boolean z10 = this.d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = s5.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(v51.n(31));
                arrayList.add(v51.n(31));
                arrayList.add(v51.n(31));
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
                            arrayList.add(i7.a(i11, i14, tL_starsTopupOption));
                            i12++;
                            i14++;
                            z12 = true;
                        }
                    }
                    i11++;
                }
                if (i12 < 3) {
                    arrayList.clear();
                    arrayList.add(v51.k(j20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(i7.a(i16, i14, tL_starsTopupOption2));
                            i15++;
                            i14++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(i7.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i14++;
                        }
                        boolean z13 = this.f0;
                        if (!z13 && i13 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.f0;
                            int i17 = e7.a;
                            v51 J = v51.J(e7.class);
                            J.d = -1;
                            J.l = string;
                            J.f = z14;
                            J.q = true;
                            arrayList.add(J);
                        }
                    } else {
                        this.f0 = true;
                    }
                } else if (i12 > 0) {
                    boolean z15 = this.f0;
                    if (!z15 && i13 > 0) {
                        String string2 = LocaleController.getString(z15 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                        boolean z16 = !this.f0;
                        int i18 = e7.a;
                        v51 J2 = v51.J(e7.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z16;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(i7.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i14++;
                    }
                }
            }
        }
        arrayList.add(v51.k(this.Z));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            j61 j61Var = this.e0;
            if (j61Var != null) {
                j61Var.N(true);
            }
            long j3 = s5.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.Y.b;
            long j10 = this.X;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            xa xaVar = this.e;
            if (xaVar != null) {
                xaVar.setTitle(y());
            }
            if (j3 < j10 || (runnable = this.b0) == null) {
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
        j20 j20Var = this.Y;
        if (j20Var != null) {
            ((sg.e) j20Var.c).setPaused(true);
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
        jk jkVar;
        if (!this.d0) {
            org.telegram.messenger.f0.p(R.string.PaymentInvoiceDisabledStarsText, new xc(lb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
            return;
        }
        if (s5.y(this.currentAccount, false).p().amount >= this.X) {
            Runnable runnable = this.b0;
            if (runnable != null) {
                runnable.run();
                this.b0 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        if (R instanceof wn) {
            wn wnVar = (wn) R;
            if (wnVar.x9() && (jkVar = wnVar.Y) != null) {
                jkVar.P();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.bb
    public final vl0 v(wl0 wl0Var) {
        j61 j61Var = new j61(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.e0 = j61Var;
        return j61Var;
    }

    @Override // org.telegram.ui.Components.bb
    public final CharSequence y() {
        j20 j20Var = this.Y;
        if (j20Var == null) {
            return null;
        }
        return ((TextView) j20Var.b).getText();
    }
}
