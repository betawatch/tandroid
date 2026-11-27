// default package

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.p;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class s02 implements uu0 {
    public ValueAnimator a;
    public final /* synthetic */ j22 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ n12 e;

    public s02(n12 n12Var, j22 j22Var, String str, long j) {
        this.e = n12Var;
        this.b = j22Var;
        this.c = str;
        this.d = j;
    }

    @Override // uu0
    public final wr0 A() {
        return null;
    }

    @Override // uu0
    public final void b() {
        z();
    }

    @Override // uu0
    public final String g(boolean z, boolean z2) {
        return "UNSUPPORTED";
    }

    @Override // uu0
    public final boolean h() {
        int i = this.e.G3;
        ls6 d0 = ls6.d0(i);
        long j = this.d;
        return d0.l(j) || uc7.s1(i).T3.contains(Long.valueOf(j));
    }

    @Override // uu0
    public final void i(boolean z) {
        hl.L3(this.e.U2.getBackButton(), z ? R.drawable.ic_ab_back : R.drawable.ic_close_white);
    }

    @Override // uu0
    public final void j() {
        z();
    }

    @Override // uu0
    public final void k(boolean z) {
        this.b.setNeedCloseConfirmation(z);
    }

    @Override // uu0
    public final void m(int i) {
        this.b.setCustomBackground(i);
    }

    @Override // uu0
    public final void n(TLRPC.InputInvoice inputInvoice, String str, TLObject tLObject) {
        n12 n12Var = this.e;
        int i = n12Var.G3;
        e eVar = n12Var.Z1;
        boolean z = tLObject instanceof TLRPC.TL_payments_paymentFormStars;
        j22 j22Var = this.b;
        p pVar = null;
        if (z) {
            id idVar = new id(3, null, n12Var.getContext());
            idVar.q(150L);
            jxa.v(i, false).X(null, inputInvoice, (TLRPC.TL_payments_paymentFormStars) tLObject, new uc(idVar, (byte) 4), new rx1(j22Var, str, (byte) 3));
            hl.t1(j22Var);
            return;
        }
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            uc7.s1(i).j4(paymentForm.users, false);
            pVar = new p(paymentForm, null, str, eVar);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            pVar = new p((TLRPC.PaymentReceipt) tLObject);
        }
        if (pVar != null) {
            j22Var.J();
            hl.t1(j22Var);
            mu7 mu7Var = new mu7(eVar.getParentActivity());
            mu7Var.show();
            pVar.a1 = new ie((Object) mu7Var, (Object) j22Var, (Object) str, (byte) 21);
            pVar.Z0 = n12Var.J0;
            mu7Var.c(pVar);
        }
    }

    @Override // uu0
    public final void q(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4) {
        float f;
        float f2;
        n12 n12Var = this.e;
        RadialProgressView radialProgressView = n12Var.z3;
        in inVar = n12Var.B3;
        f12 f12Var = n12Var.v2;
        j22 j22Var = this.b;
        if (f12Var == j22Var) {
            if (j22Var.Q || this.c != null) {
                inVar.setClickable(z2);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                byte b = 1;
                byte b2 = 0;
                if (j != 0) {
                    spannableStringBuilder.append((CharSequence) "* ");
                    spannableStringBuilder.append((CharSequence) str);
                    spannableStringBuilder.setSpan(new hm(j, 1.4f, inVar.getPaint().getFontMetricsInt()), 0, 1, 33);
                    inVar.setText(spannableStringBuilder);
                } else {
                    inVar.setText(str);
                }
                inVar.setTextColor(i2);
                inVar.setEmojiColor(i2);
                boolean z5 = rv0.R0;
                inVar.setBackground(aob.g0(i, vm2.h(i) >= 0.30000001192092896d ? 301989888 : 385875967));
                if (n12Var.A3 != z) {
                    n12Var.A3 = z;
                    ValueAnimator valueAnimator = this.a;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (z) {
                        f2 = 0.0f;
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                        f2 = 1.0f;
                    }
                    ValueAnimator duration = ValueAnimator.ofFloat(f2, f).setDuration(250L);
                    this.a = duration;
                    duration.addUpdateListener(new az1(this, (byte) 1));
                    this.a.addListener(new l02(this, z, b2));
                    this.a.start();
                }
                radialProgressView.setProgressColor(i2);
                if (n12Var.y3 != z3) {
                    radialProgressView.animate().cancel();
                    if (z3) {
                        radialProgressView.setAlpha(0.0f);
                        radialProgressView.setVisibility(0);
                    }
                    radialProgressView.animate().alpha(z3 ? 1.0f : 0.0f).scaleX(z3 ? 1.0f : 0.1f).scaleY(z3 ? 1.0f : 0.1f).setDuration(250L).setListener(new l02(this, z3, b)).start();
                }
            }
        }
    }

    @Override // uu0
    public final void s() {
        f12 f12Var = this.e.v2;
        j22 j22Var = this.b;
        if (f12Var != j22Var || j22Var.K.c) {
            return;
        }
        j22Var.J();
    }

    @Override // uu0
    public final void t(boolean z) {
        b8 b8Var = this.b.M;
        if (b8Var != null) {
            b8Var.setVisibility(z ? 0 : 8);
        }
    }

    @Override // uu0
    public final void u(int i, final int i2, boolean z) {
        n12 n12Var = this.e;
        final int i3 = n12Var.D4.b;
        final sv0 sv0Var = new sv0();
        sv0Var.c(sv0Var.a, n12Var.U1 ? i3 : 0, n12Var.J0);
        n12Var.U1 = z;
        sv0Var.c(sv0Var.b, z ? i2 : 0, n12Var.J0);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(200L);
        duration.setInterpolator(k43.f);
        final j22 j22Var = this.b;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: k02
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int f = vm2.f(floatValue, i3, i2);
                n12 n12Var2 = s02.this.e;
                n12Var2.k4 = f;
                n12Var2.j4 = true;
                y10 y10Var = n12Var2.U2;
                if (y10Var != null) {
                    y10Var.updateColors();
                    y10Var.invalidate();
                }
                n12Var2.D4.a(f);
                jz1 jz1Var = n12Var2.s3;
                if (jz1Var != null) {
                    jz1Var.invalidate();
                }
                j22Var.setCustomActionBarBackground(f);
                n12Var2.v2.invalidate();
                n12Var2.o3.invalidate();
                sv0Var.b(y10Var, floatValue);
            }
        });
        duration.start();
    }

    @Override // uu0
    public final void v(TLRPC.User user, String str, ArrayList arrayList) {
        boolean isEmpty = arrayList.isEmpty();
        n12 n12Var = this.e;
        if (isEmpty) {
            e eVar = n12Var.Z1;
            if (eVar instanceof zu1) {
                ((zu1) eVar).a0.setFieldText("@" + lbc.p(user) + " " + str);
            }
            n12Var.a(true);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("dialogsType", 14);
        bundle.putBoolean("onlySelect", true);
        bundle.putBoolean("allowGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowLegacyGroups", arrayList.contains("groups"));
        bundle.putBoolean("allowMegagroups", arrayList.contains("groups"));
        bundle.putBoolean("allowUsers", arrayList.contains("users"));
        bundle.putBoolean("allowChannels", arrayList.contains("channels"));
        bundle.putBoolean("allowBots", arrayList.contains("bots"));
        uj3 uj3Var = new uj3(bundle);
        mu7 mu7Var = new mu7(n12Var.getContext());
        uj3Var.E2 = new pt((Object) this, (Object) user, (Object) mu7Var, str, (byte) 5);
        mu7Var.show();
        mu7Var.c(uj3Var);
    }

    @Override // uu0
    public final void y(boolean z) {
        this.b.setAllowSwipes(z);
    }

    @Override // uu0
    public final void z() {
        n12 n12Var = this.e;
        if (n12Var.v2 != this.b) {
            return;
        }
        n12Var.w0(false);
        n12Var.getWindow().setSoftInputMode(48);
        n12Var.dismiss();
        hl.d3(new kc((byte) 10), 150L);
    }

    @Override // uu0
    public final void a() {
    }

    @Override // uu0
    public final void c() {
    }

    @Override // uu0
    public final void d(TLRPC.Document document) {
    }

    @Override // uu0
    public final void e(String str) {
    }

    @Override // uu0
    public final void f(ArrayList arrayList) {
    }

    @Override // uu0
    public final void p(boolean z) {
    }

    @Override // uu0
    public final void r(int i) {
    }

    @Override // uu0
    public final void w(boolean z) {
    }

    @Override // uu0
    public final void x(int i) {
    }

    @Override // uu0
    public final void o(int i, boolean z) {
    }

    @Override // uu0
    public final void l(boolean z, boolean z2, String str, long j, int i, int i2, boolean z3, boolean z4, String str2) {
    }
}
