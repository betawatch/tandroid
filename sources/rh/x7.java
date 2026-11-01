package rh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.at;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.dd;
import org.telegram.messenger.vs;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.da;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ha;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.ra;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.xz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l10;
import org.telegram.ui.mk;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class x7 extends ha implements vs {
    public final long P1;
    public final l10 Q1;
    public final FrameLayout R1;
    public final xz S1;
    public Runnable T1;
    public final TLRPC.InputPeer U1;
    public final boolean V1;
    public q51 W1;
    public boolean X1;

    /* JADX WARN: Code restructure failed: missing block: B:54:0x010d, code lost:
    
        if (((r8 == null || r8.startsWith("LOC_ERR")) ? null : r8) == null) goto L73;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x7(Context context, org.telegram.ui.ActionBar.p6 p6Var, long j10, int i10, String str, Runnable runnable, long j11) {
        super(context, null, false, false, p6Var);
        String str2;
        String str3;
        this.r1 = 0.2f;
        this.T1 = runnable;
        TLRPC.InputPeer i12 = j11 == 0 ? null : wp.r1(this.a).i1(j11);
        this.U1 = i12;
        boolean k10 = (i12 == null || !((org.telegram.messenger.j0) wp.r1(e6.y(this.a, false).a).y7.h0.b).c) ? true : org.telegram.messenger.u1.i().k();
        this.V1 = k10;
        O();
        uk0 uk0Var = this.k1;
        int i11 = this.t0;
        uk0Var.setPadding(i11, 0, i11, 0);
        this.k1.setOnItemClickListener(new ag.y0(this, 14));
        this.k1.r1();
        s4.j jVar = new s4.j();
        jVar.m = false;
        jVar.C = false;
        jVar.o(gr.h);
        jVar.n(350L);
        this.k1.setItemAnimator(jVar);
        w0(org.telegram.ui.ActionBar.t6.i5);
        this.P1 = j10;
        l10 l10Var = new l10(this.a, context, p6Var);
        TextView textView = (TextView) l10Var.e;
        this.Q1 = l10Var;
        ((TextView) l10Var.b).setText(dd.G((int) Math.max(0L, j10 - e6.y(this.a, false).p().amount), "StarsNeededTitle", new Object[0]));
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
                        String M0 = dd.M0(str3);
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
            String a02 = dd.a0(str3, null, 0, str);
            a02 = (a02 == null || a02.startsWith("LOC_ERR")) ? null : a02;
            textView.setText(org.telegram.messenger.i0.W2(a02 == null ? dd.M0(str3) : a02));
            textView.setMaxWidth(vh.p2.a(textView.getText(), textView.getPaint()));
        }
        this.l1.setTitle(O0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.R1 = frameLayout;
        p80 p80Var = new p80(context, p6Var);
        frameLayout.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f));
        p80Var.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.B6, p6Var);
        org.telegram.ui.ActionBar.a7.H(p80Var, org.telegram.ui.ActionBar.t6.Uc, p6Var);
        if (k10) {
            p80Var.setText(org.telegram.messenger.i0.T2(dd.L0(2131744985, null), new ph.x1(this, 26)));
        } else {
            p80Var.setText(org.telegram.messenger.i0.W2(dd.L0(2131745067, null)));
        }
        p80Var.setGravity(17);
        p80Var.setMaxWidth(vh.p2.a(p80Var.getText(), p80Var.getPaint()));
        frameLayout.addView(p80Var, w7.b6.e(-2, -1, 17));
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.h5, frameLayout, p6Var);
        xz xzVar = new xz(getContext());
        this.S1 = xzVar;
        this.b.addView(xzVar, w7.b6.c(-1.0f, -1));
        q51 q51Var = this.W1;
        if (q51Var != null) {
            q51Var.O(false);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        at.f(this.a).n(this, at.v3);
        at.f(this.a).n(this, at.y3);
    }

    @Override // org.telegram.ui.Components.ha
    public final tk0 L0(uk0 uk0Var) {
        q51 q51Var = new q51(this.k1, getContext(), this.a, 0, true, new qh.d(this, 10), this.I0);
        this.W1 = q51Var;
        return q51Var;
    }

    @Override // org.telegram.ui.Components.ha
    public final CharSequence O0() {
        l10 l10Var = this.Q1;
        if (l10Var == null) {
            return null;
        }
        return ((TextView) l10Var.b).getText();
    }

    @Override // org.telegram.messenger.vs
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        Runnable runnable;
        if (i10 == at.v3 || i10 == at.y3) {
            q51 q51Var = this.W1;
            if (q51Var != null) {
                q51Var.O(true);
            }
            long j10 = e6.y(this.a, false).p().amount;
            TextView textView = (TextView) this.Q1.b;
            long j11 = this.P1;
            textView.setText(dd.H(',', "StarsNeededTitle", (int) (j11 - j10)));
            da daVar = this.l1;
            if (daVar != null) {
                daVar.setTitle(O0());
            }
            if (j10 < j11 || (runnable = this.T1) == null) {
                return;
            }
            runnable.run();
            this.T1 = null;
            dismiss();
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog, android.content.DialogInterface, org.telegram.ui.ActionBar.g2
    public final void dismiss() {
        super.dismiss();
        l10 l10Var = this.Q1;
        if (l10Var != null) {
            ((lg.q) l10Var.c).setPaused(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void show() {
        mk mkVar;
        if (!this.V1) {
            org.telegram.messenger.m5.n(null, 2131747413, new cc(ra.a(getContext()), this.I0), R.raw.stars_topup, 36);
            return;
        }
        if (e6.y(this.a, false).p().amount >= this.P1) {
            Runnable runnable = this.T1;
            if (runnable != null) {
                runnable.run();
                this.T1 = null;
                return;
            }
            return;
        }
        org.telegram.ui.ActionBar.k2 Q = LaunchActivity.Q();
        if (Q instanceof un) {
            un unVar = (un) Q;
            if (unVar.O9() && (mkVar = unVar.Z) != null) {
                mkVar.K();
            }
        }
        super.show();
        at.f(this.a).c(this, at.v3);
        at.f(this.a).c(this, at.y3);
    }
}
