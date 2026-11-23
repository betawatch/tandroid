package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes.dex */
public abstract class u extends t {
    public final ArrayList Q;
    public boolean R;

    public u(boolean z10) {
        super(1000, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i7);

    public abstract boolean C1(View view);

    /* JADX WARN: Code restructure failed: missing block: B:144:0x00de, code lost:
    
        r25.b = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00e2, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a6, code lost:
    
        if (r24.f != (-1)) goto L88;
     */
    @Override // v4.t, v4.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(x0 x0Var, c1 c1Var, a0 a0Var, n2.j jVar) {
        boolean z10;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z11;
        boolean z12;
        View c10;
        boolean z13;
        x0 x0Var2 = x0Var;
        c1 c1Var2 = c1Var;
        int i18 = this.q.i();
        int i19 = 0;
        boolean z14 = true;
        boolean z15 = a0Var.e == 1;
        jVar.a = 0;
        int i20 = a0Var.d;
        boolean z16 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i21 = -1;
        if (z16 && a0Var.f != -1 && B1(i20) && m(a0Var.d + 1) == null) {
            if (B1(a0Var.d + 1)) {
                a0Var.d += 3;
            } else {
                a0Var.d += 2;
            }
            int i22 = a0Var.d;
            int i23 = i22;
            while (i23 > i20) {
                View c11 = a0Var.c(x0Var2);
                if (c11 != null) {
                    arrayList.add(c11);
                    if (i23 != i22) {
                        c(c11, rect);
                        w1(i18, c11, false);
                        z13 = z14;
                        int b10 = this.q.b(c11);
                        a0Var.b -= b10;
                        a0Var.c += b10;
                        i23--;
                        z14 = z13;
                    }
                }
                z13 = z14;
                i23--;
                z14 = z13;
            }
            z10 = z14;
            a0Var.d = i22;
        } else {
            z10 = true;
        }
        boolean z17 = z10;
        while (z17) {
            int i24 = this.J;
            boolean z18 = !arrayList.isEmpty();
            int i25 = i19;
            while (i25 < this.J && a0Var.b(c1Var2) && i24 > 0) {
                int i26 = a0Var.d;
                i24 -= v1(i26, x0Var2, c1Var2);
                if (i24 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c10 = a0Var.c(x0Var2);
                } else {
                    c10 = (View) arrayList.get(i19);
                    arrayList.remove(i19);
                    a0Var.d--;
                }
                if (c10 == null) {
                    break;
                }
                this.L[i25] = c10;
                i25++;
                if (a0Var.f == i21 && i24 <= 0 && B1(i26)) {
                    z18 = z10;
                }
                i19 = 0;
            }
            p1(i25, x0Var2, c1Var2, z15);
            float f10 = 0.0f;
            int i27 = 0;
            for (int i28 = 0; i28 < i25; i28++) {
                View view = this.L[i28];
                if (a0Var.k == null) {
                    if (z15) {
                        z12 = false;
                        a(-1, view, false);
                    } else {
                        z12 = false;
                        a(0, view, false);
                    }
                    z11 = z12;
                } else if (z15) {
                    a(-1, view, true);
                    z11 = false;
                } else {
                    z11 = false;
                    a(0, view, true);
                }
                c(view, rect);
                w1(i18, view, z11);
                int b11 = this.q.b(view);
                if (b11 > i27) {
                    i27 = b11;
                }
                float c12 = (this.q.c(view) * 1.0f) / ((s) view.getLayoutParams()).f;
                if (c12 > f10) {
                    f10 = c12;
                }
            }
            int i29 = 0;
            while (i29 < i25) {
                View view2 = this.L[i29];
                if (this.q.b(view2) != i27) {
                    s sVar = (s) view2.getLayoutParams();
                    Rect rect2 = sVar.b;
                    i16 = i29;
                    i17 = i18;
                    x1(p0.s(false, this.K[sVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin, ((ViewGroup.MarginLayoutParams) sVar).width), View.MeasureSpec.makeMeasureSpec(i27 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) sVar).topMargin) + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin), TLObject.FLAG_30), view2, true);
                } else {
                    i16 = i29;
                    i17 = i18;
                }
                i29 = i16 + 1;
                i18 = i17;
            }
            int i30 = i18;
            boolean C1 = C1(this.L[0]);
            if (C1) {
                i7 = -1;
            } else {
                i7 = -1;
            }
            if (C1 || a0Var.f != 1) {
                if (a0Var.f == -1) {
                    int i31 = a0Var.b - jVar.a;
                    int i32 = i31 - i27;
                    i11 = i31;
                    i12 = this.m;
                    i10 = i32;
                } else {
                    int i33 = jVar.a + a0Var.b;
                    i10 = i33;
                    i11 = i33 + i27;
                    i12 = 0;
                }
                int i34 = i12;
                int i35 = 0;
                while (i35 < i25) {
                    View view3 = this.L[i35];
                    s sVar2 = (s) view3.getLayoutParams();
                    int c13 = this.q.c(view3);
                    int i36 = i35;
                    boolean z19 = z15;
                    if (a0Var.f == -1) {
                        i34 -= c13;
                    }
                    int i37 = c13 + i34;
                    p0.O(view3, i34, i10, i37, i11);
                    if (a0Var.f == 1) {
                        i34 = i37;
                    }
                    if (sVar2.a.j() || sVar2.a.m()) {
                        jVar.c = true;
                    }
                    jVar.d |= view3.hasFocusable();
                    i35 = i36 + 1;
                    z15 = z19;
                }
                boolean z20 = z15;
                jVar.a += i27;
                Arrays.fill(this.L, (Object) null);
                c1Var2 = c1Var;
                z10 = true;
                z17 = z18;
                i18 = i30;
                z15 = z20;
                i19 = 0;
                i21 = -1;
                x0Var2 = x0Var;
            }
            if (a0Var.f == i7) {
                int i38 = a0Var.b - jVar.a;
                i15 = i38 - i27;
                i13 = i38;
                i14 = 0;
            } else {
                int i39 = jVar.a + a0Var.b;
                i13 = i39 + i27;
                i14 = this.m;
                i15 = i39;
            }
            for (int i40 = i25 - 1; i40 >= 0; i40--) {
                View view4 = this.L[i40];
                s sVar3 = (s) view4.getLayoutParams();
                int c14 = this.q.c(view4);
                int i41 = i14;
                int i42 = a0Var.f == 1 ? i41 - c14 : i41;
                int i43 = c14 + i42;
                p0.O(view4, i42, i15, i43, i13);
                i14 = a0Var.f == -1 ? i43 : i42;
                if (sVar3.a.j() || sVar3.a.m()) {
                    jVar.c = true;
                }
                jVar.d |= view4.hasFocusable();
            }
            boolean z202 = z15;
            jVar.a += i27;
            Arrays.fill(this.L, (Object) null);
            c1Var2 = c1Var;
            z10 = true;
            z17 = z18;
            i18 = i30;
            z15 = z202;
            i19 = 0;
            i21 = -1;
            x0Var2 = x0Var;
        }
    }

    @Override // v4.c0, v4.p0
    public final boolean e() {
        return this.R;
    }

    @Override // v4.c0
    public final void e1(x0 x0Var, int i7, int i10) {
        if (i7 < 0) {
            return;
        }
        int r10 = r();
        if (!this.v) {
            for (int i11 = 0; i11 < r10; i11++) {
                View q10 = q(i11);
                if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q10.getLayoutParams())).bottomMargin <= i7) {
                    if (q10.getHeight() + q10.getTop() <= i7) {
                    }
                }
                d1(x0Var, 0, i11);
                return;
            }
            return;
        }
        int i12 = r10 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View q11 = q(i13);
            if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q11.getLayoutParams())).bottomMargin <= i7) {
                if (q11.getHeight() + q11.getTop() <= i7) {
                }
            }
            d1(x0Var, i12, i13);
            return;
        }
    }

    @Override // v4.t
    public final int[] q1(int i7, int i10, int[] iArr) {
        if (iArr == null || iArr.length != i7 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i7 + 1];
        }
        iArr[0] = 0;
        for (int i11 = 1; i11 <= i7; i11++) {
            iArr[i11] = (int) Math.ceil((i11 / i7) * i10);
        }
        return iArr;
    }

    @Override // v4.t
    public final void w1(int i7, View view, boolean z10) {
        s sVar = (s) view.getLayoutParams();
        Rect rect = sVar.b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) sVar).topMargin + ((ViewGroup.MarginLayoutParams) sVar).bottomMargin;
        x1(p0.s(false, this.K[sVar.f], i7, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) sVar).leftMargin + ((ViewGroup.MarginLayoutParams) sVar).rightMargin, ((ViewGroup.MarginLayoutParams) sVar).width), p0.s(true, this.q.k(), this.l, i10, ((ViewGroup.MarginLayoutParams) sVar).height), view, z10);
    }
}
