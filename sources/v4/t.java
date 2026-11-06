package v4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public abstract class t extends s {
    public final ArrayList Q;
    public boolean R;

    public t(boolean z9) {
        super(1000, z9);
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
    @Override // v4.s, v4.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(v0 v0Var, a1 a1Var, z zVar, n2.j jVar) {
        boolean z9;
        int i7;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z10;
        boolean z11;
        View c10;
        boolean z12;
        v0 v0Var2 = v0Var;
        a1 a1Var2 = a1Var;
        int i18 = this.q.i();
        int i19 = 0;
        boolean z13 = true;
        boolean z14 = zVar.e == 1;
        jVar.a = 0;
        int i20 = zVar.d;
        boolean z15 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i21 = -1;
        if (z15 && zVar.f != -1 && B1(i20) && m(zVar.d + 1) == null) {
            if (B1(zVar.d + 1)) {
                zVar.d += 3;
            } else {
                zVar.d += 2;
            }
            int i22 = zVar.d;
            int i23 = i22;
            while (i23 > i20) {
                View c11 = zVar.c(v0Var2);
                if (c11 != null) {
                    arrayList.add(c11);
                    if (i23 != i22) {
                        c(c11, rect);
                        w1(i18, c11, false);
                        z12 = z13;
                        int b10 = this.q.b(c11);
                        zVar.b -= b10;
                        zVar.c += b10;
                        i23--;
                        z13 = z12;
                    }
                }
                z12 = z13;
                i23--;
                z13 = z12;
            }
            z9 = z13;
            zVar.d = i22;
        } else {
            z9 = true;
        }
        boolean z16 = z9;
        while (z16) {
            int i24 = this.J;
            boolean z17 = !arrayList.isEmpty();
            int i25 = i19;
            while (i25 < this.J && zVar.b(a1Var2) && i24 > 0) {
                int i26 = zVar.d;
                i24 -= v1(i26, v0Var2, a1Var2);
                if (i24 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c10 = zVar.c(v0Var2);
                } else {
                    c10 = (View) arrayList.get(i19);
                    arrayList.remove(i19);
                    zVar.d--;
                }
                if (c10 == null) {
                    break;
                }
                this.L[i25] = c10;
                i25++;
                if (zVar.f == i21 && i24 <= 0 && B1(i26)) {
                    z17 = z9;
                }
                i19 = 0;
            }
            p1(i25, v0Var2, a1Var2, z14);
            float f10 = 0.0f;
            int i27 = 0;
            for (int i28 = 0; i28 < i25; i28++) {
                View view = this.L[i28];
                if (zVar.k == null) {
                    if (z14) {
                        z11 = false;
                        a(-1, view, false);
                    } else {
                        z11 = false;
                        a(0, view, false);
                    }
                    z10 = z11;
                } else if (z14) {
                    a(-1, view, true);
                    z10 = false;
                } else {
                    z10 = false;
                    a(0, view, true);
                }
                c(view, rect);
                w1(i18, view, z10);
                int b11 = this.q.b(view);
                if (b11 > i27) {
                    i27 = b11;
                }
                float c12 = (this.q.c(view) * 1.0f) / ((r) view.getLayoutParams()).f;
                if (c12 > f10) {
                    f10 = c12;
                }
            }
            int i29 = 0;
            while (i29 < i25) {
                View view2 = this.L[i29];
                if (this.q.b(view2) != i27) {
                    r rVar = (r) view2.getLayoutParams();
                    Rect rect2 = rVar.b;
                    i16 = i29;
                    i17 = i18;
                    x1(n0.s(false, this.K[rVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), View.MeasureSpec.makeMeasureSpec(i27 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) rVar).topMargin) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin), TLObject.FLAG_30), view2, true);
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
            if (C1 || zVar.f != 1) {
                if (zVar.f == -1) {
                    int i31 = zVar.b - jVar.a;
                    int i32 = i31 - i27;
                    i11 = i31;
                    i12 = this.m;
                    i10 = i32;
                } else {
                    int i33 = jVar.a + zVar.b;
                    i10 = i33;
                    i11 = i33 + i27;
                    i12 = 0;
                }
                int i34 = i12;
                int i35 = 0;
                while (i35 < i25) {
                    View view3 = this.L[i35];
                    r rVar2 = (r) view3.getLayoutParams();
                    int c13 = this.q.c(view3);
                    int i36 = i35;
                    boolean z18 = z14;
                    if (zVar.f == -1) {
                        i34 -= c13;
                    }
                    int i37 = c13 + i34;
                    n0.O(view3, i34, i10, i37, i11);
                    if (zVar.f == 1) {
                        i34 = i37;
                    }
                    if (rVar2.a.j() || rVar2.a.m()) {
                        jVar.c = true;
                    }
                    jVar.d |= view3.hasFocusable();
                    i35 = i36 + 1;
                    z14 = z18;
                }
                boolean z19 = z14;
                jVar.a += i27;
                Arrays.fill(this.L, (Object) null);
                a1Var2 = a1Var;
                z9 = true;
                z16 = z17;
                i18 = i30;
                z14 = z19;
                i19 = 0;
                i21 = -1;
                v0Var2 = v0Var;
            }
            if (zVar.f == i7) {
                int i38 = zVar.b - jVar.a;
                i15 = i38 - i27;
                i13 = i38;
                i14 = 0;
            } else {
                int i39 = jVar.a + zVar.b;
                i13 = i39 + i27;
                i14 = this.m;
                i15 = i39;
            }
            for (int i40 = i25 - 1; i40 >= 0; i40--) {
                View view4 = this.L[i40];
                r rVar3 = (r) view4.getLayoutParams();
                int c14 = this.q.c(view4);
                int i41 = i14;
                int i42 = zVar.f == 1 ? i41 - c14 : i41;
                int i43 = c14 + i42;
                n0.O(view4, i42, i15, i43, i13);
                i14 = zVar.f == -1 ? i43 : i42;
                if (rVar3.a.j() || rVar3.a.m()) {
                    jVar.c = true;
                }
                jVar.d |= view4.hasFocusable();
            }
            boolean z192 = z14;
            jVar.a += i27;
            Arrays.fill(this.L, (Object) null);
            a1Var2 = a1Var;
            z9 = true;
            z16 = z17;
            i18 = i30;
            z14 = z192;
            i19 = 0;
            i21 = -1;
            v0Var2 = v0Var;
        }
    }

    @Override // v4.b0, v4.n0
    public final boolean e() {
        return this.R;
    }

    @Override // v4.b0
    public final void e1(v0 v0Var, int i7, int i10) {
        if (i7 < 0) {
            return;
        }
        int r10 = r();
        if (!this.v) {
            for (int i11 = 0; i11 < r10; i11++) {
                View q10 = q(i11);
                if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((o0) q10.getLayoutParams())).bottomMargin <= i7) {
                    if (q10.getHeight() + q10.getTop() <= i7) {
                    }
                }
                d1(v0Var, 0, i11);
                return;
            }
            return;
        }
        int i12 = r10 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View q11 = q(i13);
            if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((o0) q11.getLayoutParams())).bottomMargin <= i7) {
                if (q11.getHeight() + q11.getTop() <= i7) {
                }
            }
            d1(v0Var, i12, i13);
            return;
        }
    }

    @Override // v4.s
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

    @Override // v4.s
    public final void w1(int i7, View view, boolean z9) {
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        x1(n0.s(false, this.K[rVar.f], i7, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), n0.s(true, this.q.k(), this.l, i10, ((ViewGroup.MarginLayoutParams) rVar).height), view, z9);
    }
}
