// default package

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zd4 extends gb3 {
    public final /* synthetic */ he4 F;

    public zd4(he4 he4Var) {
        this.F = he4Var;
    }

    @Override // gb3
    public final void C(s49 s49Var, fb3 fb3Var) {
        super.C(s49Var, fb3Var);
        View view = s49Var.a;
        if (view instanceof fe4) {
            fe4 fe4Var = (fe4) view;
            if (fe4Var.x) {
                ValueAnimator valueAnimator = fe4Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    fe4Var.a.removeAllUpdateListeners();
                    fe4Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new yd4(fe4Var, (byte) 0));
                ofFloat.addListener(new im2(fe4Var, (byte) 21));
                fe4Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // gb3, b49
    public final void f(s49 s49Var) {
        super.f(s49Var);
        View view = s49Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof fe4) {
            ((fe4) view).a();
        }
    }

    @Override // gb3, b49
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new uz1(this, (byte) 27));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0326, code lost:
    
        if (r1.getMeasuredWidth() != r1.k0) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v35 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    @Override // gb3, hia
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(s49 s49Var, zw8 zw8Var, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        ?? r4;
        boolean z;
        int i9;
        String str;
        int i10;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z6;
        boolean z7;
        boolean z8;
        int i11;
        int i12;
        View view = s49Var.a;
        if (!(view instanceof fe4)) {
            return super.r(s49Var, zw8Var, i, i2, i3, i4);
        }
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        R(s49Var);
        int i13 = i3 - translationX;
        int i14 = i4 - translationY;
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        fe4 fe4Var = (fe4) view;
        he4 he4Var = fe4Var.n0;
        TextPaint textPaint = he4Var.b;
        TextPaint textPaint2 = he4Var.c;
        int i15 = fe4Var.b.d;
        int i16 = fe4Var.J;
        if (i15 != i16) {
            fe4Var.I = true;
            fe4Var.K = i16;
            fe4Var.g0 = fe4Var.e0;
            fe4Var.h0 = fe4Var.f0;
            if (i16 <= 0 || i15 <= 0) {
                i5 = translationX;
                i6 = translationY;
                i7 = i13;
                z7 = true;
                z8 = false;
            } else {
                String valueOf = String.valueOf(i16);
                String valueOf2 = String.valueOf(fe4Var.b.d);
                if (valueOf.length() == valueOf2.length()) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(valueOf);
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(valueOf2);
                    SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(valueOf2);
                    int i17 = 0;
                    while (i17 < valueOf.length()) {
                        int i18 = translationX;
                        if (valueOf.charAt(i17) == valueOf2.charAt(i17)) {
                            int i19 = i17 + 1;
                            i11 = translationY;
                            spannableStringBuilder.setSpan(new lx2((byte) 1), i17, i19, 0);
                            i12 = i13;
                            spannableStringBuilder2.setSpan(new lx2((byte) 1), i17, i19, 0);
                        } else {
                            i11 = translationY;
                            i12 = i13;
                            spannableStringBuilder3.setSpan(new lx2((byte) 1), i17, i17 + 1, 0);
                        }
                        i17++;
                        i13 = i12;
                        translationY = i11;
                        translationX = i18;
                    }
                    i5 = translationX;
                    i6 = translationY;
                    i7 = i13;
                    z8 = false;
                    int ceil = (int) Math.ceil(bkb.K0.measureText(valueOf));
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    z7 = true;
                    fe4Var.M = new StaticLayout(spannableStringBuilder, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    fe4Var.N = new StaticLayout(spannableStringBuilder3, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                    fe4Var.L = new StaticLayout(spannableStringBuilder2, textPaint2, ceil, alignment, 1.0f, 0.0f, false);
                } else {
                    i5 = translationX;
                    i6 = translationY;
                    i7 = i13;
                    z7 = true;
                    z8 = false;
                    int ceil2 = (int) Math.ceil(bkb.K0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    fe4Var.M = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    fe4Var.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(bkb.K0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z = z7;
            i8 = z7;
            r4 = z8;
        } else {
            i5 = translationX;
            i6 = translationY;
            i7 = i13;
            i8 = 1;
            r4 = 0;
            z = false;
        }
        int i20 = fe4Var.b.d;
        if (i20 > 0) {
            Object[] objArr = new Object[i8];
            objArr[r4] = Integer.valueOf(i20);
            str = String.format("%d", objArr);
            i9 = Math.max(gl.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + gl.L(10.0f);
        } else {
            i9 = r4;
            str = null;
        }
        int i21 = fe4Var.b.c;
        if (i9 != 0) {
            i10 = gl.L((str != null ? 1.0f : he4Var.x) * 6.0f) + i9;
        } else {
            i10 = r4;
        }
        int i22 = i10 + i21;
        float measuredWidth = (fe4Var.getMeasuredWidth() - i22) / 2;
        float f = fe4Var.F;
        if (measuredWidth != f) {
            fe4Var.H = i8;
            fe4Var.G = f;
            z2 = i8;
        } else {
            z2 = z;
        }
        CharSequence charSequence3 = fe4Var.O;
        if (charSequence3 == null || fe4Var.b.b.equals(charSequence3)) {
            z3 = r4;
            z4 = z2;
        } else {
            if (fe4Var.O.length() > fe4Var.b.b.length()) {
                charSequence = fe4Var.O;
                charSequence2 = fe4Var.b.b;
                z6 = i8;
            } else {
                charSequence = fe4Var.b.b;
                charSequence2 = fe4Var.O;
                z6 = r4;
            }
            int t = gl.t(charSequence, charSequence2);
            if (t >= 0) {
                CharSequence m = vu3.m(charSequence, textPaint.getFontMetricsInt(), r4, null, r4);
                CharSequence charSequence4 = charSequence2;
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m);
                if (t != 0) {
                    spannableStringBuilder5.setSpan(new lx2(i8), r4, t, r4);
                }
                if (charSequence4.length() + t != charSequence.length()) {
                    spannableStringBuilder5.setSpan(new lx2(i8), charSequence4.length() + t, charSequence.length(), r4);
                }
                spannableStringBuilder4.setSpan(new lx2(i8), t, charSequence4.length() + t, r4);
                boolean z9 = z6;
                int L = gl.L(400.0f);
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                z3 = r4;
                StaticLayout staticLayout = new StaticLayout(spannableStringBuilder4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                fe4Var.Q = staticLayout;
                if (fe4Var.m0) {
                    int i23 = fe4Var.b.g ? 26 : z3 ? 1 : 0;
                    cm cmVar = fe4Var.P;
                    Layout[] layoutArr = new Layout[i8];
                    layoutArr[z3 ? 1 : 0] = staticLayout;
                    fe4Var.P = gm.update(i23, fe4Var, cmVar, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(spannableStringBuilder5, textPaint, gl.L(400.0f), alignment3, 1.0f, 0.0f, false);
                fe4Var.U = staticLayout2;
                if (fe4Var.m0) {
                    int i24 = fe4Var.b.g ? 26 : z3 ? 1 : 0;
                    cm cmVar2 = fe4Var.T;
                    Layout[] layoutArr2 = new Layout[i8];
                    layoutArr2[z3 ? 1 : 0] = staticLayout2;
                    fe4Var.T = gm.update(i24, fe4Var, cmVar2, layoutArr2);
                }
                fe4Var.V = i8;
                fe4Var.W = z9;
                fe4Var.b0 = t == 0 ? 0.0f : -fe4Var.U.getPrimaryHorizontal(t);
                fe4Var.d0 = fe4Var.c0;
                fe4Var.S = null;
                gm.release(fe4Var, fe4Var.R);
            } else {
                z3 = r4;
                CharSequence charSequence5 = fe4Var.b.b;
                int L2 = gl.L(400.0f);
                Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
                StaticLayout staticLayout3 = new StaticLayout(charSequence5, textPaint, L2, alignment4, 1.0f, 0.0f, false);
                fe4Var.Q = staticLayout3;
                if (fe4Var.m0) {
                    int i25 = fe4Var.b.g ? 26 : z3 ? 1 : 0;
                    cm cmVar3 = fe4Var.P;
                    Layout[] layoutArr3 = new Layout[i8];
                    layoutArr3[z3 ? 1 : 0] = staticLayout3;
                    fe4Var.P = gm.update(i25, fe4Var, cmVar3, layoutArr3);
                }
                StaticLayout staticLayout4 = new StaticLayout(fe4Var.O, textPaint, gl.L(400.0f), alignment4, 1.0f, 0.0f, false);
                fe4Var.S = staticLayout4;
                if (fe4Var.m0) {
                    int i26 = fe4Var.b.g ? 26 : z3 ? 1 : 0;
                    cm cmVar4 = fe4Var.R;
                    Layout[] layoutArr4 = new Layout[i8];
                    layoutArr4[z3 ? 1 : 0] = staticLayout4;
                    fe4Var.R = gm.update(i26, fe4Var, cmVar4, layoutArr4);
                }
                fe4Var.U = null;
                gm.release(fe4Var, fe4Var.T);
                fe4Var.V = i8;
                fe4Var.b0 = 0.0f;
                fe4Var.d0 = fe4Var.c0;
            }
            z4 = i8;
        }
        if (i22 == fe4Var.i0) {
            z5 = z4;
        }
        fe4Var.a0 = i8;
        fe4Var.j0 = fe4Var.i0;
        z5 = i8;
        if (z5) {
            fe4Var.y = 0.0f;
            fe4Var.x = i8;
            he4 he4Var2 = this.F;
            he4Var2.G.invalidate();
            he4Var2.invalidate();
        }
        if (i7 == 0 && i14 == 0 && !z5) {
            v(s49Var);
            return z3;
        }
        boolean z10 = i8;
        this.r.add(new fb3(s49Var, i5, i6, i3, i4));
        return z10;
    }

    @Override // hia
    public final void x(s49 s49Var) {
        s49Var.a.setTranslationX(0.0f);
        View view = s49Var.a;
        if (view instanceof fe4) {
            ((fe4) view).a();
        }
    }
}
