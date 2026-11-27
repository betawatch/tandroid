// default package

import android.animation.ValueAnimator;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class uh3 extends x46 {
    public boolean I;
    public boolean J;
    public ValueAnimator K;
    public final /* synthetic */ tj3 L;
    public final /* synthetic */ uj3 M;

    public uh3(uj3 uj3Var, tj3 tj3Var) {
        this.M = uj3Var;
        this.L = tj3Var;
    }

    @Override // x46
    public final int Q0() {
        tj3 tj3Var = this.L;
        return (tj3Var.s == 0 && this.M.y3() && tj3Var.w == 2) ? 1 : 0;
    }

    @Override // x46, q79
    public final void a0(oh2 oh2Var, c89 c89Var) {
        boolean z = f11.a;
        try {
            super.a0(oh2Var, c89Var);
        } catch (IndexOutOfBoundsException e) {
            cc4.g(e, true);
            hl.c3(new th3(this.L, (byte) 0));
        }
    }

    @Override // x46
    public final void a1(View view, View view2, int i, int i2) {
        this.I = true;
        super.a1(view, view2, i, i2);
        this.I = false;
    }

    @Override // q79
    public final void e0() {
        ValueAnimator valueAnimator = this.K;
        if (valueAnimator != null) {
            valueAnimator.removeAllListeners();
            this.K.cancel();
        }
        tj3 tj3Var = this.L;
        if (tj3Var.a.getScrollState() != 1) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.M.U, 0.0f);
            this.K = ofFloat;
            ofFloat.addUpdateListener(new lk(this, tj3Var, (byte) 13));
            this.K.addListener(new cn2(this, (byte) 7));
            this.K.setDuration(200L);
            this.K.setInterpolator(k43.f);
            this.K.start();
        }
    }

    @Override // x46
    public final void g1(int i, int i2) {
        if (this.I) {
            i2 -= this.L.a.getPaddingTop();
        }
        super.g1(i, i2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        if (r4.J2(r6) != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        if (r11.z() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:227:0x0185, code lost:
    
        if (r8.z() == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x01d9, code lost:
    
        if (r8.z() == false) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x0259, code lost:
    
        if (r8 <= (-1)) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        if (r11.z() == false) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03fb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028f  */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [int] */
    /* JADX WARN: Type inference failed for: r20v0 */
    /* JADX WARN: Type inference failed for: r20v1 */
    /* JADX WARN: Type inference failed for: r20v7 */
    /* JADX WARN: Type inference failed for: r20v8 */
    /* JADX WARN: Type inference failed for: r5v4, types: [q79, uh3] */
    /* JADX WARN: Type inference failed for: r8v12, types: [q79, uh3] */
    @Override // x46, q79
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int n0(int i, oh2 oh2Var, c89 c89Var) {
        boolean z;
        int L;
        ?? r20;
        boolean z2;
        boolean z3;
        int i2;
        boolean z4;
        boolean z5;
        float f;
        int i3;
        int i4;
        a aVar;
        a aVar2;
        a aVar3;
        a aVar4;
        int i5;
        int L2;
        View m;
        int n0;
        xh3 xh3Var;
        float viewOffset;
        float f2;
        a aVar5;
        a aVar6;
        a aVar7;
        a aVar8;
        uj3 uj3Var = this.M;
        UndoView[] undoViewArr = uj3Var.z0;
        tj3 tj3Var = this.L;
        qj3 qj3Var = tj3Var.a;
        int i6 = 0;
        if (!qj3Var.W1) {
            boolean z6 = qj3Var.getScrollState() == 1;
            if (z6 != this.J) {
                this.J = z6;
                if (!z6) {
                }
            }
            float f3 = 0.0f;
            if (i > 0 && uj3Var.U != 0.0f) {
                aVar7 = ((e) uj3Var).actionBar;
                if (aVar7 != null) {
                    aVar8 = ((e) uj3Var).actionBar;
                }
                float f4 = uj3Var.U - i;
                if (f4 < 0.0f) {
                    i6 = (int) (-f4);
                } else {
                    f3 = f4;
                }
                uj3Var.a5(tj3Var, f3);
                return super.n0(i6, oh2Var, c89Var);
            }
            if (uj3Var.L && uj3Var.a3 == 0) {
                aVar5 = ((e) uj3Var).actionBar;
                if (aVar5 != null) {
                    aVar6 = ((e) uj3Var).actionBar;
                }
                z = true;
                int paddingTop = tj3Var.a.getPaddingTop();
                L = (z || uj3Var.H3.c() || uj3Var.S) ? paddingTop : paddingTop - hl.L(81.0f);
                if (uj3Var.S && tj3Var.s == 0 && !uj3Var.n2 && uj3Var.Y2 == 0) {
                    if (uj3Var.a3 == 0) {
                        uc7 messagesController = uj3Var.getMessagesController();
                        messagesController.getClass();
                        if (xea.m1) {
                            ?? r202 = 1;
                            boolean z7 = z;
                            z2 = z7;
                            z3 = r202;
                            if (messagesController.R.f(2305843009213693953L) != null) {
                                z2 = z7;
                                z3 = r202;
                                if (tj3Var.w == 2) {
                                    i2 = 1;
                                    z5 = z7;
                                    z4 = r202;
                                    if ((i2 == 0 || (z5 && !uj3Var.H3.c())) && i < 0) {
                                        tj3Var.a.setOverScrollMode(0);
                                        int K0 = tj3Var.c.K0();
                                        f = 1.0f;
                                        ?? r11 = (K0 == 0 || (m = tj3Var.c.m(K0)) == null || m.getBottom() - L > hl.L(1.0f)) ? K0 : z4;
                                        if (!z6) {
                                            if (r11 != 0 || i2 == 0) {
                                                i3 = -1;
                                                if (((r11 == z4 && i2 != 0) || r11 == 0) && z5 && z6 && !uj3Var.H3.c()) {
                                                    float f5 = uj3Var.O;
                                                    qj3 qj3Var2 = tj3Var.a;
                                                    if (f5 == 0.0f) {
                                                        qj3Var2.setOverScrollMode(0);
                                                    } else {
                                                        qj3Var2.setOverScrollMode(2);
                                                    }
                                                    i4 = (int) (i * 0.3f);
                                                }
                                            } else {
                                                View m2 = tj3Var.c.m(r11);
                                                float top = ((m2.getTop() - paddingTop) / m2.getMeasuredHeight()) + 1.0f;
                                                if (top > 1.0f) {
                                                    top = 1.0f;
                                                }
                                                tj3Var.a.setOverScrollMode(2);
                                                i4 = (int) xnb.B(top, 0.25f, 0.45f, i);
                                                if (i4 > -1) {
                                                    i4 = -1;
                                                }
                                                UndoView undoView = undoViewArr[0];
                                                if (undoView != null && undoView.getVisibility() == 0) {
                                                    boolean z8 = z4;
                                                    undoViewArr[0].d(z8 ? 1 : 0, z8);
                                                }
                                            }
                                            i3 = i4;
                                            if (tj3Var.s == 0) {
                                                viewOffset = ((int) tj3Var.a.getViewOffset()) - i;
                                                if (viewOffset >= 0.0f) {
                                                }
                                                tj3Var.a.setViewsOffset(f2);
                                            }
                                            if (tj3Var.s == 0) {
                                            }
                                            n0 = super.n0(i3, oh2Var, c89Var);
                                            if (n0 == 0) {
                                                uj3Var.a5(tj3Var, uj3Var.U - (uj3Var.F0.getOverScrollCoef() * i));
                                            }
                                            return n0;
                                        }
                                        View m3 = tj3Var.c.m(r11);
                                        if (m3 != null && r11 < 10) {
                                            int i7 = 0;
                                            while (i2 < r11) {
                                                yh3 yh3Var = tj3Var.d;
                                                if (((ek3) yh3Var.N.get(i2)).a == 0) {
                                                    if (!((ek3) yh3Var.N.get(i2)).f || yh3Var.K) {
                                                        L2 = hl.L(xea.l1 ? 76.0f : 70.0f);
                                                    } else {
                                                        L2 = hl.L(xea.l1 ? 86.0f : 91.0f);
                                                    }
                                                    i5 = L2 + 1;
                                                } else {
                                                    i5 = 0;
                                                }
                                                i7 += i5;
                                                i2++;
                                            }
                                            int i8 = (-(m3.getTop() - L)) + i7;
                                            if (!uj3Var.H3.c()) {
                                                aVar3 = ((e) uj3Var).actionBar;
                                                if (aVar3 != null) {
                                                    aVar4 = ((e) uj3Var).actionBar;
                                                }
                                                i8 -= hl.L(48.0f);
                                            }
                                            if (z5 && ((((ValueAnimator) tj3Var.b.c) != null || uj3Var.F0.g()) && !uj3Var.H3.c() && !uj3Var.S)) {
                                                i8 += hl.L(81.0f);
                                            }
                                            if ((((ValueAnimator) tj3Var.b.c) != null || uj3Var.F0.g()) && !uj3Var.H3.c() && !uj3Var.S) {
                                                aVar = ((e) uj3Var).actionBar;
                                                if (aVar != null) {
                                                    aVar2 = ((e) uj3Var).actionBar;
                                                }
                                                i8 += hl.L(48.0f);
                                            }
                                            if (i8 < Math.abs(i)) {
                                                i3 = -i8;
                                                if (tj3Var.s == 0 && tj3Var.a.getViewOffset() != 0.0f && i > 0 && z6) {
                                                    viewOffset = ((int) tj3Var.a.getViewOffset()) - i;
                                                    if (viewOffset >= 0.0f) {
                                                        i3 = (int) viewOffset;
                                                        f2 = 0.0f;
                                                    } else {
                                                        f2 = viewOffset;
                                                        i3 = 0;
                                                    }
                                                    tj3Var.a.setViewsOffset(f2);
                                                }
                                                if (tj3Var.s == 0 || tj3Var.w == 0 || !uj3Var.y3() || uj3Var.S) {
                                                    n0 = super.n0(i3, oh2Var, c89Var);
                                                    if (n0 == 0 && i < 0 && z6 && !uj3Var.H3.c() && z5 && uj3Var.w3 == 0.0f) {
                                                        uj3Var.a5(tj3Var, uj3Var.U - (uj3Var.F0.getOverScrollCoef() * i));
                                                    }
                                                    return n0;
                                                }
                                                int n02 = super.n0(i3, oh2Var, c89Var);
                                                xh3 xh3Var2 = tj3Var.n;
                                                if (xh3Var2 != null) {
                                                    xh3Var2.a = n02;
                                                }
                                                int K02 = tj3Var.c.K0();
                                                View m4 = K02 == 0 ? tj3Var.c.m(K02) : null;
                                                if (K02 != 0 || m4 == null || m4.getBottom() - L < hl.L(4.0f)) {
                                                    uj3Var.f3 = 0L;
                                                    uj3Var.h3 = false;
                                                    boolean z9 = tj3Var.w != 2;
                                                    tj3Var.w = (byte) 2;
                                                    if (z9 && hl.A1()) {
                                                        hl.g2(ob6.M0(2131754920, null));
                                                    }
                                                    xh3 xh3Var3 = tj3Var.n;
                                                    if (xh3Var3 != null) {
                                                        ValueAnimator valueAnimator = xh3Var3.z;
                                                        if (valueAnimator != null) {
                                                            valueAnimator.cancel();
                                                        }
                                                        of3 of3Var = xh3Var3.H;
                                                        if (of3Var != null) {
                                                            of3Var.removeCallbacks(xh3Var3.d0);
                                                        }
                                                        xh3Var3.x = 0.0f;
                                                        xh3Var3.y = false;
                                                        xh3Var3.e0 = false;
                                                        tj3Var.n.f(0.0f);
                                                        tj3Var.n.I = tj3Var.a;
                                                    }
                                                } else {
                                                    if (uj3Var.f3 == 0) {
                                                        uj3Var.f3 = System.currentTimeMillis();
                                                    }
                                                    if (tj3Var.w == 2 && (xh3Var = tj3Var.n) != null) {
                                                        xh3Var.g();
                                                    }
                                                    if (z5 && !uj3Var.H3.c() && !uj3Var.S) {
                                                        L += hl.L(81.0f);
                                                    }
                                                    float top2 = ((m4.getTop() - L) / m4.getMeasuredHeight()) + f;
                                                    if (top2 > f) {
                                                        top2 = f;
                                                    }
                                                    boolean z10 = top2 > 0.85f && System.currentTimeMillis() - uj3Var.f3 > 220;
                                                    if (uj3Var.h3 != z10) {
                                                        uj3Var.h3 = z10;
                                                        if (tj3Var.w == 2) {
                                                            try {
                                                                tj3Var.a.performHapticFeedback(3, 2);
                                                            } catch (Exception unused) {
                                                            }
                                                            xh3 xh3Var4 = tj3Var.n;
                                                            if (xh3Var4 != null) {
                                                                xh3Var4.a(z10);
                                                            }
                                                        }
                                                    }
                                                    if (tj3Var.w == 2 && i3 - n02 != 0 && i < 0 && z6) {
                                                        tj3Var.a.setViewsOffset(bp1.v(i, 0.2f, f - (tj3Var.a.getViewOffset() / hl.L(72.0f)), tj3Var.a.getViewOffset()));
                                                    }
                                                    xh3 xh3Var5 = tj3Var.n;
                                                    if (xh3Var5 != null) {
                                                        xh3Var5.f(top2);
                                                        tj3Var.n.I = tj3Var.a;
                                                    }
                                                }
                                                if (m4 != null) {
                                                    m4.invalidate();
                                                }
                                                if (tj3Var.w == 1 && n02 == 0 && i < 0 && z6 && !uj3Var.H3.c() && z5 && uj3Var.w3 == 0.0f) {
                                                    uj3Var.a5(tj3Var, uj3Var.U - (hl.R1(0.2f, 0.5f, uj3Var.F0.o0) * i));
                                                }
                                                return n02;
                                            }
                                        }
                                    } else {
                                        f = 1.0f;
                                    }
                                    i3 = i;
                                    if (tj3Var.s == 0) {
                                    }
                                    if (tj3Var.s == 0) {
                                    }
                                    n0 = super.n0(i3, oh2Var, c89Var);
                                    if (n0 == 0) {
                                    }
                                    return n0;
                                }
                            }
                            i2 = 0;
                            z5 = z2;
                            z4 = z3;
                            if (i2 == 0) {
                            }
                            tj3Var.a.setOverScrollMode(0);
                            int K03 = tj3Var.c.K0();
                            f = 1.0f;
                            if (K03 == 0) {
                            }
                            if (!z6) {
                            }
                        }
                    }
                    r20 = 1;
                } else {
                    r20 = 1;
                }
                z2 = z;
                z3 = r20;
                i2 = 0;
                z5 = z2;
                z4 = z3;
                if (i2 == 0) {
                }
                tj3Var.a.setOverScrollMode(0);
                int K032 = tj3Var.c.K0();
                f = 1.0f;
                if (K032 == 0) {
                }
                if (!z6) {
                }
            }
            z = false;
            int paddingTop2 = tj3Var.a.getPaddingTop();
            if (z) {
            }
            if (uj3Var.S) {
            }
            r20 = 1;
            z2 = z;
            z3 = r20;
            i2 = 0;
            z5 = z2;
            z4 = z3;
            if (i2 == 0) {
            }
            tj3Var.a.setOverScrollMode(0);
            int K0322 = tj3Var.c.K0();
            f = 1.0f;
            if (K0322 == 0) {
            }
            if (!z6) {
            }
        }
        return 0;
    }

    @Override // q79
    public final void u0(RecyclerView recyclerView, c89 c89Var, int i) {
        if (this.M.y3() && i == 1) {
            super.u0(recyclerView, c89Var, i);
            return;
        }
        z46 z46Var = new z46(recyclerView.getContext(), 0);
        z46Var.a = i;
        v0(z46Var);
    }
}
