package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public abstract class t extends s {
    public final ArrayList Q;
    public boolean R;

    public t(boolean z10) {
        super(MediaDataController.MAX_STYLE_RUNS_COUNT, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i10);

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
    @Override // s4.s, s4.d0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(pf.e eVar, a1 a1Var, b0 b0Var, a0 a0Var) {
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z11;
        boolean z12;
        View c10;
        boolean z13;
        pf.e eVar2 = eVar;
        a1 a1Var2 = a1Var;
        int i19 = this.q.i();
        int i20 = 0;
        boolean z14 = true;
        boolean z15 = b0Var.e == 1;
        a0Var.a = 0;
        int i21 = b0Var.d;
        boolean z16 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i22 = -1;
        if (z16 && b0Var.f != -1 && B1(i21) && m(b0Var.d + 1) == null) {
            if (B1(b0Var.d + 1)) {
                b0Var.d += 3;
            } else {
                b0Var.d += 2;
            }
            int i23 = b0Var.d;
            int i24 = i23;
            while (i24 > i21) {
                View c11 = b0Var.c(eVar2);
                if (c11 != null) {
                    arrayList.add(c11);
                    if (i24 != i23) {
                        c(c11, rect);
                        w1(c11, i19, false);
                        z13 = z14;
                        int b10 = this.q.b(c11);
                        b0Var.b -= b10;
                        b0Var.c += b10;
                        i24--;
                        z14 = z13;
                    }
                }
                z13 = z14;
                i24--;
                z14 = z13;
            }
            z10 = z14;
            b0Var.d = i23;
        } else {
            z10 = true;
        }
        boolean z17 = z10;
        while (z17) {
            int i25 = this.J;
            boolean z18 = !arrayList.isEmpty();
            int i26 = i20;
            while (i26 < this.J && b0Var.b(a1Var2) && i25 > 0) {
                int i27 = b0Var.d;
                i25 -= v1(i27, eVar2, a1Var2);
                if (i25 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c10 = b0Var.c(eVar2);
                } else {
                    c10 = (View) arrayList.get(i20);
                    arrayList.remove(i20);
                    b0Var.d--;
                }
                if (c10 == null) {
                    break;
                }
                this.L[i26] = c10;
                i26++;
                if (b0Var.f == i22 && i25 <= 0 && B1(i27)) {
                    z18 = z10;
                }
                i20 = 0;
            }
            p1(i26, eVar2, a1Var2, z15);
            float f7 = 0.0f;
            int i28 = 0;
            for (int i29 = 0; i29 < i26; i29++) {
                View view = this.L[i29];
                if (b0Var.k == null) {
                    if (z15) {
                        z12 = false;
                        a(view, -1, false);
                    } else {
                        z12 = false;
                        a(view, 0, false);
                    }
                    z11 = z12;
                } else if (z15) {
                    a(view, -1, true);
                    z11 = false;
                } else {
                    z11 = false;
                    a(view, 0, true);
                }
                c(view, rect);
                w1(view, i19, z11);
                int b11 = this.q.b(view);
                if (b11 > i28) {
                    i28 = b11;
                }
                float c12 = (this.q.c(view) * 1.0f) / ((r) view.getLayoutParams()).f;
                if (c12 > f7) {
                    f7 = c12;
                }
            }
            int i30 = 0;
            while (i30 < i26) {
                View view2 = this.L[i30];
                if (this.q.b(view2) != i28) {
                    r rVar = (r) view2.getLayoutParams();
                    Rect rect2 = rVar.b;
                    i17 = i30;
                    i18 = i19;
                    x1(p0.s(false, this.K[rVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), View.MeasureSpec.makeMeasureSpec(i28 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) rVar).topMargin) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin), TLObject.FLAG_30), view2, true);
                } else {
                    i17 = i30;
                    i18 = i19;
                }
                i30 = i17 + 1;
                i19 = i18;
            }
            int i31 = i19;
            boolean C1 = C1(this.L[0]);
            if (C1) {
                i10 = -1;
            } else {
                i10 = -1;
            }
            if (C1 || b0Var.f != 1) {
                if (b0Var.f == -1) {
                    int i32 = b0Var.b - a0Var.a;
                    int i33 = i32 - i28;
                    i12 = i32;
                    i13 = this.m;
                    i11 = i33;
                } else {
                    int i34 = a0Var.a + b0Var.b;
                    i11 = i34;
                    i12 = i34 + i28;
                    i13 = 0;
                }
                int i35 = i13;
                int i36 = 0;
                while (i36 < i26) {
                    View view3 = this.L[i36];
                    r rVar2 = (r) view3.getLayoutParams();
                    int c13 = this.q.c(view3);
                    int i37 = i36;
                    boolean z19 = z15;
                    if (b0Var.f == -1) {
                        i35 -= c13;
                    }
                    int i38 = c13 + i35;
                    p0.O(view3, i35, i11, i38, i12);
                    if (b0Var.f == 1) {
                        i35 = i38;
                    }
                    if (rVar2.a.j() || rVar2.a.m()) {
                        a0Var.c = true;
                    }
                    a0Var.d |= view3.hasFocusable();
                    i36 = i37 + 1;
                    z15 = z19;
                }
                boolean z20 = z15;
                a0Var.a += i28;
                Arrays.fill(this.L, (Object) null);
                a1Var2 = a1Var;
                z10 = true;
                z17 = z18;
                i19 = i31;
                z15 = z20;
                i20 = 0;
                i22 = -1;
                eVar2 = eVar;
            }
            if (b0Var.f == i10) {
                int i39 = b0Var.b - a0Var.a;
                i16 = i39 - i28;
                i14 = i39;
                i15 = 0;
            } else {
                int i40 = a0Var.a + b0Var.b;
                i14 = i40 + i28;
                i15 = this.m;
                i16 = i40;
            }
            for (int i41 = i26 - 1; i41 >= 0; i41--) {
                View view4 = this.L[i41];
                r rVar3 = (r) view4.getLayoutParams();
                int c14 = this.q.c(view4);
                int i42 = i15;
                int i43 = b0Var.f == 1 ? i42 - c14 : i42;
                int i44 = c14 + i43;
                p0.O(view4, i43, i16, i44, i14);
                i15 = b0Var.f == -1 ? i44 : i43;
                if (rVar3.a.j() || rVar3.a.m()) {
                    a0Var.c = true;
                }
                a0Var.d |= view4.hasFocusable();
            }
            boolean z202 = z15;
            a0Var.a += i28;
            Arrays.fill(this.L, (Object) null);
            a1Var2 = a1Var;
            z10 = true;
            z17 = z18;
            i19 = i31;
            z15 = z202;
            i20 = 0;
            i22 = -1;
            eVar2 = eVar;
        }
    }

    @Override // s4.d0, s4.p0
    public final boolean e() {
        return this.R;
    }

    @Override // s4.d0
    public final void e1(pf.e eVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int r10 = r();
        if (!this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q6 = q(i12);
                if (q6.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q6.getLayoutParams())).bottomMargin <= i10) {
                    if (q6.getHeight() + q6.getTop() <= i10) {
                    }
                }
                d1(eVar, 0, i12);
                return;
            }
            return;
        }
        int i13 = r10 - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View q10 = q(i14);
            if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((q0) q10.getLayoutParams())).bottomMargin <= i10) {
                if (q10.getHeight() + q10.getTop() <= i10) {
                }
            }
            d1(eVar, i13, i14);
            return;
        }
    }

    @Override // s4.s
    public final int[] q1(int i10, int i11, int[] iArr) {
        if (iArr == null || iArr.length != i10 + 1 || iArr[iArr.length - 1] != i11) {
            iArr = new int[i10 + 1];
        }
        iArr[0] = 0;
        for (int i12 = 1; i12 <= i10; i12++) {
            iArr[i12] = (int) Math.ceil((i12 / i10) * i11);
        }
        return iArr;
    }

    @Override // s4.s
    public final void w1(View view, int i10, boolean z10) {
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.b;
        int i11 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        x1(p0.s(false, this.K[rVar.f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), p0.s(true, this.q.k(), this.l, i11, ((ViewGroup.MarginLayoutParams) rVar).height), view, z10);
    }
}
