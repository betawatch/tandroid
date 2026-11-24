// default package

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class zua extends fy0 implements gk7 {
    public final long S1;
    public final dr0 T1;
    public final FrameLayout U1;
    public final qh4 V1;
    public Runnable W1;
    public final TLRPC.InputPeer X1;
    public final boolean Y1;
    public l5c Z1;
    public boolean a2;

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        if ((r8.startsWith("LOC_ERR") ? null : r8) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public zua(Context context, wjb wjbVar, long j, int i, String str, Runnable runnable, long j2) {
        super(context, null, false, false, wjbVar);
        String str2;
        this.u1 = 0.2f;
        this.W1 = runnable;
        TLRPC.InputPeer h1 = j2 == 0 ? null : na7.q1(this.a).h1(j2);
        this.X1 = h1;
        boolean j3 = (h1 == null || !na7.q1(gta.v(this.a, false).a).k4.l0.f) ? true : ci0.h().j();
        this.Y1 = j3;
        K();
        o39 o39Var = this.n1;
        int i2 = this.u0;
        o39Var.setPadding(i2, 0, i2, 0);
        this.n1.setOnItemClickListener(new f09(this, (byte) 13));
        this.n1.r1();
        gb3 gb3Var = new gb3();
        gb3Var.m = false;
        gb3Var.C = false;
        gb3Var.o(s33.h);
        gb3Var.n(350L);
        this.n1.setItemAnimator(gb3Var);
        t0(bkb.h5);
        this.S1 = j;
        dr0 dr0Var = new dr0(this.a, wjbVar, context);
        TextView textView = (TextView) dr0Var.e;
        this.T1 = dr0Var;
        ((TextView) dr0Var.b).setText(k96.G((int) Math.max(0L, j - gta.v(this.a, false).m().amount), "StarsNeededTitle", new Object[0]));
        if (i == 1) {
            str2 = "StarsNeededTextBuySubscription";
        } else {
            String str3 = "StarsNeededTextKeepSubscription";
            if (i != 2) {
                if (i == 7) {
                    str2 = "StarsNeededTextKeepBotSubscription";
                } else if (i == 8) {
                    str2 = "StarsNeededTextKeepBizSubscription";
                } else if (i != 3) {
                    if (i == 4) {
                        str2 = "StarsNeededTextLink";
                        if (str == null) {
                            str3 = "StarsNeededTextLink";
                        } else {
                            str3 = "StarsNeededTextLink_" + str.toLowerCase();
                        }
                        String N0 = k96.N0(str3);
                    } else {
                        str2 = i == 5 ? "StarsNeededTextReactions" : i == 6 ? "StarsNeededTextGift" : i == 12 ? "StarsNeededTextGiftChannel" : i == 13 ? "StarsNeededTextPrivateMessage" : i == 10 ? "StarsNeededTextGiftUpgrade" : i == 11 ? "StarsNeededTextGiftTransfer" : i == 9 ? "StarsNeededBizText" : i == 14 ? "StarsNeededTextGiftBuyResale" : i == 15 ? "StarsNeededTextSearch" : i == 16 ? "StarsNeededRemoveGiftDescription" : i == 17 ? "StarsNeededLiveComments" : "StarsNeededText";
                    }
                }
            }
            str2 = str3;
        }
        if (TextUtils.isEmpty(str2)) {
            textView.setText("");
        } else {
            String a0 = k96.a0(str2, null, 0, str);
            a0 = a0.startsWith("LOC_ERR") ? null : a0;
            textView.setText(gl.S2(a0 == null ? k96.N0(str2) : a0));
            textView.setMaxWidth(je5.a(textView.getText(), textView.getPaint()));
        }
        this.o1.setTitle(J0());
        FrameLayout frameLayout = new FrameLayout(context);
        this.U1 = frameLayout;
        l46 l46Var = new l46(context, wjbVar);
        frameLayout.setPadding(0, gl.L(11.0f), 0, gl.L(11.0f));
        l46Var.setTextSize(1, 12.0f);
        zkb.X(l46Var, bkb.A6, wjbVar);
        zkb.G(l46Var, bkb.Wc, wjbVar);
        if (j3) {
            l46Var.setText(gl.N2(k96.M0(2131744730, null), -1, 0, new z6a(this, (byte) 26), null));
        } else {
            l46Var.setText(gl.S2(k96.M0(2131744812, null)));
        }
        l46Var.setGravity(17);
        l46Var.setMaxWidth(je5.a(l46Var.getText(), l46Var.getPaint()));
        frameLayout.addView(l46Var, nme.e(-2, -1, 17));
        zkb.h(bkb.g5, wjbVar, frameLayout);
        qh4 qh4Var = new qh4(getContext());
        this.V1 = qh4Var;
        this.b.addView(qh4Var, nme.c(-1.0f, -1));
        l5c l5cVar = this.Z1;
        if (l5cVar != null) {
            l5cVar.O(false);
        }
    }

    @Override // fy0
    public final n39 G0(o39 o39Var) {
        l5c l5cVar = new l5c(this.n1, getContext(), this.a, 0, true, new tf8(this, (byte) 26), this.J0);
        this.Z1 = l5cVar;
        return l5cVar;
    }

    @Override // fx0
    public final void I() {
        super.I();
        kk7.f(this.a).n(this, kk7.w3);
        kk7.f(this.a).n(this, kk7.z3);
    }

    @Override // fy0
    public final CharSequence J0() {
        dr0 dr0Var = this.T1;
        if (dr0Var == null) {
            return null;
        }
        return ((TextView) dr0Var.b).getText();
    }

    @Override // gk7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        Runnable runnable;
        if (i == kk7.w3 || i == kk7.z3) {
            l5c l5cVar = this.Z1;
            if (l5cVar != null) {
                l5cVar.O(true);
            }
            long j = gta.v(this.a, false).m().amount;
            TextView textView = (TextView) this.T1.b;
            long j2 = this.S1;
            textView.setText(k96.H(',', "StarsNeededTitle", (int) (j2 - j)));
            by0 by0Var = this.o1;
            if (by0Var != null) {
                by0Var.setTitle(J0());
            }
            if (j < j2 || (runnable = this.W1) == null) {
                return;
            }
            runnable.run();
            this.W1 = null;
            dismiss();
        }
    }

    @Override // fx0, android.app.Dialog, android.content.DialogInterface, zf0
    public final void dismiss() {
        super.dismiss();
        dr0 dr0Var = this.T1;
        if (dr0Var != null) {
            ((er4) dr0Var.c).setPaused(true);
        }
    }

    @Override // fx0, android.app.Dialog
    public final void show() {
        ar1 ar1Var;
        if (!this.Y1) {
            ir2.v(null, 2131747204, new u21(f11.a(getContext()), this.J0), R.raw.stars_topup, 36);
            return;
        }
        if (gta.v(this.a, false).m().amount >= this.S1) {
            Runnable runnable = this.W1;
            if (runnable != null) {
                runnable.run();
                this.W1 = null;
                return;
            }
            return;
        }
        d Q = LaunchActivity.Q();
        if (Q instanceof mu1) {
            mu1 mu1Var = (mu1) Q;
            if (mu1Var.Q7() && (ar1Var = mu1Var.a0) != null) {
                ar1Var.S();
            }
        }
        super.show();
        kk7.f(this.a).b(this, kk7.w3);
        kk7.f(this.a).b(this, kk7.z3);
    }
}
