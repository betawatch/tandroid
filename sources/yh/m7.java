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
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qr;
import org.telegram.ui.Components.r00;
import org.telegram.ui.Components.va;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.za;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bo;
import org.telegram.ui.mk;
import org.telegram.ui.o20;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class m7 extends za implements NotificationCenter.NotificationCenterDelegate {
    public final long X;
    public final o20 Y;
    public final FrameLayout Z;
    public final r00 a0;
    public Runnable b0;
    public final TLRPC.InputPeer c0;
    public final boolean d0;
    public w51 e0;
    public boolean f0;

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
    
        if (org.telegram.messenger.LocaleController.nullable(org.telegram.messenger.LocaleController.getString(r7)) == null) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m7(Context context, org.telegram.ui.ActionBar.e6 e6Var, long j3, int i10, String str, Runnable runnable, long j10) {
        super(context, null, false, false, e6Var);
        String str2;
        String str3;
        this.v = 0.2f;
        this.b0 = runnable;
        TLRPC.InputPeer inputPeer = j10 == 0 ? null : MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        this.c0 = inputPeer;
        boolean isReady = (inputPeer == null || !AppGlobalConfig.getInstance(u5.y(this.currentAccount, false).a).starsSpendTopUpInvoiceDisabled.get()) ? true : BillingController.getInstance().isReady();
        this.d0 = isReady;
        fixNavigationBar();
        ll0 ll0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        ll0Var.setPadding(i11, 0, i11, 0);
        this.d.setOnItemClickListener(new ai.g(this, 23));
        this.d.p1();
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(qr.h);
        jVar.n(350L);
        this.d.setItemAnimator(jVar);
        setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.i5, e6Var));
        this.X = j3;
        o20 o20Var = new o20(context, this.currentAccount, e6Var);
        TextView textView = (TextView) o20Var.e;
        this.Y = o20Var;
        ((TextView) o20Var.b).setText(LocaleController.formatPluralString("StarsNeededTitle", (int) Math.max(0L, j3 - u5.y(this.currentAccount, false).p().amount), new Object[0]));
        int i12 = 6;
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
            textView.setMaxWidth(ci.f4.a(textView.getText(), textView.getPaint()));
        }
        this.e.setTitle(y());
        FrameLayout frameLayout = new FrameLayout(context);
        this.Z = frameLayout;
        c90 c90Var = new c90(context, e6Var);
        frameLayout.setPadding(0, AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f));
        c90Var.setTextSize(1, 12.0f);
        c90Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.B6, e6Var));
        c90Var.setLinkTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.gc, e6Var));
        if (isReady) {
            c90Var.setText(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StarsTOS), new x2(this, i12)));
        } else {
            org.telegram.ui.Cells.q3.q(R.string.StarsPurchaseUnavailable, c90Var);
        }
        c90Var.setGravity(17);
        c90Var.setMaxWidth(ci.f4.a(c90Var.getText(), c90Var.getPaint()));
        frameLayout.addView(c90Var, w7.x5.e(-2, -1, 17));
        frameLayout.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.h5, e6Var));
        r00 r00Var = new r00(getContext());
        this.a0 = r00Var;
        this.containerView.addView(r00Var, w7.x5.c(-1.0f, -1));
        w51 w51Var = this.e0;
        if (w51Var != null) {
            w51Var.N(false);
        }
    }

    public static void P(m7 m7Var, int i10) {
        i51 G;
        w51 w51Var = m7Var.e0;
        if (w51Var == null || (G = w51Var.G(i10 - 1)) == null) {
            return;
        }
        w51 w51Var2 = m7Var.e0;
        if (G.d == -1) {
            m7Var.f0 = !m7Var.f0;
            w51Var2.N(true);
        } else if (G.G(j7.class) && (G.G instanceof TL_stars.TL_starsTopupOption)) {
            Activity findActivity = AndroidUtilities.findActivity(m7Var.getContext());
            if (findActivity == null) {
                findActivity = LaunchActivity.G1;
            }
            if (findActivity == null) {
                return;
            }
            u5.y(m7Var.currentAccount, false).f(findActivity, (TL_stars.TL_starsTopupOption) G.G, new ai.m0(25, m7Var, G), m7Var.c0);
        }
    }

    public static void Q(m7 m7Var, i51 i51Var, Boolean bool, String str) {
        if (m7Var.getContext() == null) {
            return;
        }
        if (bool.booleanValue()) {
            new vc((FrameLayout) m7Var.containerView, m7Var.resourcesProvider).M(LocaleController.getString(R.string.StarsAcquired), AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsAcquiredInfo", (int) i51Var.B, new Object[0])), R.raw.stars_topup).j();
            m7Var.a0.c(true);
            u5.y(m7Var.currentAccount, false).T(true);
        } else if (str != null) {
            hg.c.s(R.string.UnknownErrorCode, new Object[]{str}, new vc((FrameLayout) m7Var.containerView, m7Var.resourcesProvider), R.raw.error, 36);
        }
    }

    public final void R(ArrayList arrayList, w51 w51Var) {
        long j3;
        o20 o20Var = this.Y;
        arrayList.add(i51.l(o20Var));
        boolean z10 = this.d0;
        if (z10) {
            com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
        }
        int i10 = 0;
        ArrayList z11 = u5.y(this.currentAccount, false).z();
        if (z10) {
            if (z11 == null || z11.isEmpty()) {
                arrayList.add(i51.n(31));
                arrayList.add(i51.n(31));
                arrayList.add(i51.n(31));
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
                            arrayList.add(j7.a(i11, i14, tL_starsTopupOption));
                            i12++;
                            i14++;
                            z12 = true;
                        }
                    }
                    i11++;
                }
                if (i12 < 3) {
                    arrayList.clear();
                    arrayList.add(i51.k(o20Var));
                    com.google.android.gms.internal.vision.e2.n(R.string.TelegramStarsChoose, arrayList);
                    int i15 = 0;
                    for (int i16 = 0; i16 < z11.size(); i16++) {
                        TL_stars.TL_starsTopupOption tL_starsTopupOption2 = (TL_stars.TL_starsTopupOption) z11.get(i16);
                        if (tL_starsTopupOption2.stars >= j3) {
                            arrayList.add(j7.a(i16, i14, tL_starsTopupOption2));
                            i15++;
                            i14++;
                        }
                    }
                    if (i15 == 0) {
                        while (i10 < z11.size()) {
                            arrayList.add(j7.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                            i10++;
                            i14++;
                        }
                        boolean z13 = this.f0;
                        if (!z13 && i13 > 0) {
                            String string = LocaleController.getString(z13 ? R.string.NotifyLessOptions : R.string.NotifyMoreOptions);
                            boolean z14 = !this.f0;
                            int i17 = f7.a;
                            i51 J = i51.J(f7.class);
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
                        int i18 = f7.a;
                        i51 J2 = i51.J(f7.class);
                        J2.d = -1;
                        J2.l = string2;
                        J2.f = z16;
                        J2.q = true;
                        arrayList.add(J2);
                    }
                } else {
                    while (i10 < z11.size()) {
                        arrayList.add(j7.a(i10, i14, (TL_stars.TL_starsTopupOption) z11.get(i10)));
                        i10++;
                        i14++;
                    }
                }
            }
        }
        arrayList.add(i51.k(this.Z));
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == NotificationCenter.starOptionsLoaded || i10 == NotificationCenter.starBalanceUpdated) {
            w51 w51Var = this.e0;
            if (w51Var != null) {
                w51Var.N(true);
            }
            long j3 = u5.y(this.currentAccount, false).p().amount;
            TextView textView = (TextView) this.Y.b;
            long j10 = this.X;
            textView.setText(LocaleController.formatPluralStringComma("StarsNeededTitle", (int) (j10 - j3)));
            va vaVar = this.e;
            if (vaVar != null) {
                vaVar.setTitle(y());
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
        mk mkVar;
        if (!this.d0) {
            org.telegram.messenger.y0.o(R.string.PaymentInvoiceDisabledStarsText, new vc(jb.a(getContext()), this.resourcesProvider), R.raw.stars_topup, 36);
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
        if (R instanceof bo) {
            bo boVar = (bo) R;
            if (boVar.x9() && (mkVar = boVar.Y) != null) {
                mkVar.Q();
            }
        }
        super.show();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starOptionsLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starBalanceUpdated);
    }

    @Override // org.telegram.ui.Components.za
    public final kl0 v(ll0 ll0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new hi.a(this, 28), this.resourcesProvider);
        this.e0 = w51Var;
        return w51Var;
    }

    @Override // org.telegram.ui.Components.za
    public final CharSequence y() {
        o20 o20Var = this.Y;
        if (o20Var == null) {
            return null;
        }
        return ((TextView) o20Var.b).getText();
    }
}
