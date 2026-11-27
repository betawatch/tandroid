// default package

import android.animation.ValueAnimator;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xf4 extends zb3 {
    public final /* synthetic */ fg4 F;

    public xf4(fg4 fg4Var) {
        this.F = fg4Var;
    }

    @Override // zb3
    public final void C(f89 f89Var, yb3 yb3Var) {
        super.C(f89Var, yb3Var);
        View view = f89Var.a;
        if (view instanceof dg4) {
            dg4 dg4Var = (dg4) view;
            if (dg4Var.x) {
                ValueAnimator valueAnimator = dg4Var.a;
                if (valueAnimator != null) {
                    valueAnimator.removeAllListeners();
                    dg4Var.a.removeAllUpdateListeners();
                    dg4Var.a.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new wf4(dg4Var, (byte) 0));
                ofFloat.addListener(new cn2(dg4Var, (byte) 21));
                dg4Var.a = ofFloat;
                ofFloat.setDuration(this.e);
                ofFloat.start();
            }
        }
    }

    @Override // zb3, o79
    public final void f(f89 f89Var) {
        super.f(f89Var);
        View view = f89Var.a;
        view.setTranslationX(0.0f);
        if (view instanceof dg4) {
            ((dg4) view).a();
        }
    }

    @Override // zb3, o79
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.s.isEmpty();
        boolean isEmpty4 = this.q.isEmpty();
        if (!isEmpty || !isEmpty2 || !isEmpty4 || !isEmpty3) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.1f);
            ofFloat.addUpdateListener(new az1(this, (byte) 29));
            ofFloat.setDuration(this.e);
            ofFloat.start();
        }
        super.m();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:93:0x033c  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [boolean, int] */
    @Override // zb3, cma
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean r(f89 f89Var, l09 l09Var, int i, int i2, int i3, int i4) {
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
        float f;
        CharSequence charSequence;
        CharSequence charSequence2;
        boolean z3;
        boolean z4;
        boolean z5;
        int i11;
        int i12;
        View view = f89Var.a;
        if (!(view instanceof dg4)) {
            return super.r(f89Var, l09Var, i, i2, i3, i4);
        }
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) view.getTranslationY());
        R(f89Var);
        int i13 = i3 - translationX;
        int i14 = i4 - translationY;
        if (i13 != 0) {
            view.setTranslationX(-i13);
        }
        if (i14 != 0) {
            view.setTranslationY(-i14);
        }
        dg4 dg4Var = (dg4) view;
        fg4 fg4Var = dg4Var.n0;
        TextPaint textPaint = fg4Var.b;
        TextPaint textPaint2 = fg4Var.c;
        int i15 = dg4Var.b.d;
        int i16 = dg4Var.J;
        if (i15 != i16) {
            dg4Var.I = true;
            dg4Var.K = i16;
            dg4Var.g0 = dg4Var.e0;
            dg4Var.h0 = dg4Var.f0;
            if (i16 <= 0 || i15 <= 0) {
                i5 = translationX;
                i6 = translationY;
                i7 = i13;
                z4 = true;
                z5 = false;
            } else {
                String valueOf = String.valueOf(i16);
                String valueOf2 = String.valueOf(dg4Var.b.d);
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
                            spannableStringBuilder.setSpan(new fy2((byte) 1), i17, i19, 0);
                            i12 = i13;
                            spannableStringBuilder2.setSpan(new fy2((byte) 1), i17, i19, 0);
                        } else {
                            i11 = translationY;
                            i12 = i13;
                            spannableStringBuilder3.setSpan(new fy2((byte) 1), i17, i17 + 1, 0);
                        }
                        i17++;
                        i13 = i12;
                        translationY = i11;
                        translationX = i18;
                    }
                    i5 = translationX;
                    i6 = translationY;
                    i7 = i13;
                    z5 = false;
                    int ceil = (int) Math.ceil(aob.K0.measureText(valueOf));
                    TextPaint textPaint3 = fg4Var.c;
                    Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                    dg4Var.M = new StaticLayout(spannableStringBuilder, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    dg4Var.N = new StaticLayout(spannableStringBuilder3, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    dg4Var.L = new StaticLayout(spannableStringBuilder2, textPaint3, ceil, alignment, 1.0f, 0.0f, false);
                    z4 = true;
                } else {
                    i5 = translationX;
                    i6 = translationY;
                    i7 = i13;
                    z5 = false;
                    int ceil2 = (int) Math.ceil(aob.K0.measureText(valueOf));
                    Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
                    z4 = true;
                    dg4Var.M = new StaticLayout(valueOf, textPaint2, ceil2, alignment2, 1.0f, 0.0f, false);
                    dg4Var.L = new StaticLayout(valueOf2, textPaint2, (int) Math.ceil(aob.K0.measureText(valueOf2)), alignment2, 1.0f, 0.0f, false);
                }
            }
            z = z4;
            i8 = z4;
            r4 = z5;
        } else {
            i5 = translationX;
            i6 = translationY;
            i7 = i13;
            i8 = 1;
            r4 = 0;
            z = false;
        }
        int i20 = dg4Var.b.d;
        if (i20 > 0) {
            Object[] objArr = new Object[i8];
            objArr[r4] = Integer.valueOf(i20);
            str = String.format("%d", objArr);
            i9 = Math.max(hl.L(7.333f), (int) Math.ceil(textPaint2.measureText(str))) + hl.L(10.0f);
        } else {
            i9 = r4;
            str = null;
        }
        int i21 = dg4Var.b.c;
        if (i9 != 0) {
            i10 = hl.L((str != null ? 1.0f : fg4Var.x) * 6.0f) + i9;
        } else {
            i10 = r4;
        }
        int i22 = i10 + i21;
        float measuredWidth = (dg4Var.getMeasuredWidth() - i22) / 2;
        float f2 = dg4Var.F;
        if (measuredWidth != f2) {
            dg4Var.H = i8;
            dg4Var.G = f2;
            z2 = i8;
        } else {
            z2 = z;
        }
        CharSequence charSequence3 = dg4Var.O;
        if (charSequence3 != null && !dg4Var.b.b.equals(charSequence3)) {
            if (dg4Var.O.length() > dg4Var.b.b.length()) {
                charSequence = dg4Var.O;
                charSequence2 = dg4Var.b.b;
                z3 = i8;
            } else {
                charSequence = dg4Var.b.b;
                charSequence2 = dg4Var.O;
                z3 = r4;
            }
            int t = hl.t(charSequence, charSequence2);
            if (t < 0) {
                CharSequence charSequence4 = dg4Var.b.b;
                int L = hl.L(400.0f);
                Layout.Alignment alignment3 = Layout.Alignment.ALIGN_NORMAL;
                f = 0.0f;
                StaticLayout staticLayout = new StaticLayout(charSequence4, textPaint, L, alignment3, 1.0f, 0.0f, false);
                dg4Var.Q = staticLayout;
                if (dg4Var.m0) {
                    int i23 = dg4Var.b.g ? 26 : r4;
                    dm dmVar = dg4Var.P;
                    Layout[] layoutArr = new Layout[i8];
                    layoutArr[r4] = staticLayout;
                    dg4Var.P = hm.update(i23, dg4Var, dmVar, layoutArr);
                }
                StaticLayout staticLayout2 = new StaticLayout(dg4Var.O, textPaint, hl.L(400.0f), alignment3, 1.0f, 0.0f, false);
                dg4Var.S = staticLayout2;
                if (dg4Var.m0) {
                    int i24 = dg4Var.b.g ? 26 : r4;
                    dm dmVar2 = dg4Var.R;
                    Layout[] layoutArr2 = new Layout[i8];
                    layoutArr2[r4] = staticLayout2;
                    dg4Var.R = hm.update(i24, dg4Var, dmVar2, layoutArr2);
                }
                dg4Var.U = null;
                hm.release(dg4Var, dg4Var.T);
                dg4Var.V = i8;
                dg4Var.b0 = 0.0f;
                dg4Var.d0 = dg4Var.c0;
                z2 = i8;
                if (i22 == dg4Var.i0 || dg4Var.getMeasuredWidth() != dg4Var.k0) {
                    dg4Var.a0 = i8;
                    dg4Var.j0 = dg4Var.i0;
                    z2 = i8;
                }
                if (z2) {
                    dg4Var.y = f;
                    dg4Var.x = i8;
                    fg4 fg4Var2 = this.F;
                    fg4Var2.G.invalidate();
                    fg4Var2.invalidate();
                }
                if (i7 != 0 && i14 == 0 && !z2) {
                    v(f89Var);
                    return r4;
                }
                boolean z6 = i8;
                this.r.add(new yb3(f89Var, i5, i6, i3, i4));
                return z6;
            }
            TextPaint textPaint4 = fg4Var.b;
            CharSequence m = pv3.m(charSequence, textPaint4.getFontMetricsInt(), r4, null, r4);
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(m);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(m);
            if (t != 0) {
                spannableStringBuilder5.setSpan(new fy2(i8), r4, t, r4);
            }
            if (charSequence2.length() + t != charSequence.length()) {
                spannableStringBuilder5.setSpan(new fy2(i8), charSequence2.length() + t, charSequence.length(), r4);
            }
            spannableStringBuilder4.setSpan(new fy2(i8), t, charSequence2.length() + t, r4);
            int L2 = hl.L(400.0f);
            Layout.Alignment alignment4 = Layout.Alignment.ALIGN_NORMAL;
            StaticLayout staticLayout3 = new StaticLayout(spannableStringBuilder4, textPaint4, L2, alignment4, 1.0f, 0.0f, false);
            dg4Var.Q = staticLayout3;
            if (dg4Var.m0) {
                int i25 = dg4Var.b.g ? 26 : r4;
                dm dmVar3 = dg4Var.P;
                Layout[] layoutArr3 = new Layout[i8];
                layoutArr3[r4] = staticLayout3;
                dg4Var.P = hm.update(i25, dg4Var, dmVar3, layoutArr3);
            }
            StaticLayout staticLayout4 = new StaticLayout(spannableStringBuilder5, textPaint4, hl.L(400.0f), alignment4, 1.0f, 0.0f, false);
            dg4Var.U = staticLayout4;
            if (dg4Var.m0) {
                int i26 = dg4Var.b.g ? 26 : r4;
                dm dmVar4 = dg4Var.T;
                Layout[] layoutArr4 = new Layout[i8];
                layoutArr4[r4] = staticLayout4;
                dg4Var.T = hm.update(i26, dg4Var, dmVar4, layoutArr4);
            }
            dg4Var.V = i8;
            dg4Var.W = z3;
            dg4Var.b0 = t == 0 ? 0.0f : -dg4Var.U.getPrimaryHorizontal(t);
            dg4Var.d0 = dg4Var.c0;
            dg4Var.S = null;
            hm.release(dg4Var, dg4Var.R);
            z2 = i8;
        }
        f = 0.0f;
        if (i22 == dg4Var.i0) {
        }
        dg4Var.a0 = i8;
        dg4Var.j0 = dg4Var.i0;
        z2 = i8;
        if (z2) {
        }
        if (i7 != 0) {
        }
        boolean z62 = i8;
        this.r.add(new yb3(f89Var, i5, i6, i3, i4));
        return z62;
    }

    @Override // cma
    public final void x(f89 f89Var) {
        f89Var.a.setTranslationX(0.0f);
        View view = f89Var.a;
        if (view instanceof dg4) {
            ((dg4) view).a();
        }
    }
}
