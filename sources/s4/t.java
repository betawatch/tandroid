package s4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MediaDataController;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
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

    /* JADX WARN: Code restructure failed: missing block: B:144:0x00db, code lost:
    
        r25.b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x00de, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a2, code lost:
    
        if (r24.f != (-1)) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:64:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0135 A[SYNTHETIC] */
    @Override // s4.s, s4.c0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(pf.e eVar, z0 z0Var, a0 a0Var, z zVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z10;
        int b10;
        float c10;
        View c11;
        pf.e eVar2 = eVar;
        z0 z0Var2 = z0Var;
        int i19 = this.q.i();
        int i20 = 0;
        boolean z11 = a0Var.e == 1;
        zVar.a = 0;
        int i21 = a0Var.d;
        boolean z12 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i22 = -1;
        if (z12 && a0Var.f != -1 && B1(i21) && m(a0Var.d + 1) == null) {
            if (B1(a0Var.d + 1)) {
                a0Var.d += 3;
            } else {
                a0Var.d += 2;
            }
            int i23 = a0Var.d;
            for (int i24 = i23; i24 > i21; i24--) {
                View c12 = a0Var.c(eVar2);
                if (c12 != null) {
                    arrayList.add(c12);
                    if (i24 != i23) {
                        c(c12, rect);
                        w1(c12, i19, false);
                        int b11 = this.q.b(c12);
                        a0Var.b -= b11;
                        a0Var.c += b11;
                    }
                }
            }
            a0Var.d = i23;
        }
        boolean z13 = true;
        while (z13) {
            int i25 = this.J;
            boolean z14 = !arrayList.isEmpty();
            int i26 = 0;
            while (i26 < this.J && a0Var.b(z0Var2) && i25 > 0) {
                int i27 = a0Var.d;
                i25 -= v1(i27, eVar2, z0Var2);
                if (i25 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c11 = a0Var.c(eVar2);
                } else {
                    c11 = (View) arrayList.get(i20);
                    arrayList.remove(i20);
                    a0Var.d--;
                }
                if (c11 == null) {
                    break;
                }
                this.L[i26] = c11;
                i26++;
                if (a0Var.f == i22 && i25 <= 0 && B1(i27)) {
                    z14 = true;
                }
                i20 = 0;
            }
            p1(i26, eVar2, z0Var2, z11);
            float f7 = 0.0f;
            int i28 = 0;
            for (int i29 = 0; i29 < i26; i29++) {
                View view = this.L[i29];
                if (a0Var.k == null) {
                    if (z11) {
                        a(view, -1, false);
                    } else {
                        a(view, 0, false);
                    }
                } else if (z11) {
                    a(view, -1, true);
                } else {
                    z10 = false;
                    a(view, 0, true);
                    c(view, rect);
                    w1(view, i19, z10);
                    b10 = this.q.b(view);
                    if (b10 > i28) {
                        i28 = b10;
                    }
                    c10 = (this.q.c(view) * 1.0f) / ((r) view.getLayoutParams()).f;
                    if (c10 <= f7) {
                        f7 = c10;
                    }
                }
                z10 = false;
                c(view, rect);
                w1(view, i19, z10);
                b10 = this.q.b(view);
                if (b10 > i28) {
                }
                c10 = (this.q.c(view) * 1.0f) / ((r) view.getLayoutParams()).f;
                if (c10 <= f7) {
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
                    x1(o0.s(false, this.K[rVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), View.MeasureSpec.makeMeasureSpec(i28 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) rVar).topMargin) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin), TLObject.FLAG_30), view2, true);
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
            if (C1 || a0Var.f != 1) {
                if (a0Var.f == -1) {
                    int i32 = a0Var.b - zVar.a;
                    int i33 = i32 - i28;
                    i12 = i32;
                    i13 = this.m;
                    i11 = i33;
                } else {
                    int i34 = zVar.a + a0Var.b;
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
                    boolean z15 = z11;
                    if (a0Var.f == -1) {
                        i35 -= c13;
                    }
                    int i38 = c13 + i35;
                    o0.O(view3, i35, i11, i38, i12);
                    if (a0Var.f == 1) {
                        i35 = i38;
                    }
                    if (rVar2.a.j() || rVar2.a.m()) {
                        zVar.c = true;
                    }
                    zVar.d |= view3.hasFocusable();
                    i36 = i37 + 1;
                    z11 = z15;
                }
                boolean z16 = z11;
                zVar.a += i28;
                Arrays.fill(this.L, (Object) null);
                eVar2 = eVar;
                z0Var2 = z0Var;
                z13 = z14;
                i19 = i31;
                z11 = z16;
                i20 = 0;
                i22 = -1;
            }
            if (a0Var.f == i10) {
                int i39 = a0Var.b - zVar.a;
                i16 = i39 - i28;
                i14 = i39;
                i15 = 0;
            } else {
                int i40 = zVar.a + a0Var.b;
                i14 = i40 + i28;
                i15 = this.m;
                i16 = i40;
            }
            for (int i41 = i26 - 1; i41 >= 0; i41--) {
                View view4 = this.L[i41];
                r rVar3 = (r) view4.getLayoutParams();
                int c14 = this.q.c(view4);
                int i42 = i15;
                int i43 = a0Var.f == 1 ? i42 - c14 : i42;
                int i44 = c14 + i43;
                o0.O(view4, i43, i16, i44, i14);
                i15 = a0Var.f == -1 ? i44 : i43;
                if (rVar3.a.j() || rVar3.a.m()) {
                    zVar.c = true;
                }
                zVar.d |= view4.hasFocusable();
            }
            boolean z162 = z11;
            zVar.a += i28;
            Arrays.fill(this.L, (Object) null);
            eVar2 = eVar;
            z0Var2 = z0Var;
            z13 = z14;
            i19 = i31;
            z11 = z162;
            i20 = 0;
            i22 = -1;
        }
    }

    @Override // s4.c0, s4.o0
    public final boolean e() {
        return this.R;
    }

    @Override // s4.c0
    public final void e1(pf.e eVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int r10 = r();
        if (!this.v) {
            for (int i12 = 0; i12 < r10; i12++) {
                View q6 = q(i12);
                if (q6.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q6.getLayoutParams())).bottomMargin <= i10) {
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
            if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q10.getLayoutParams())).bottomMargin <= i10) {
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
        x1(o0.s(false, this.K[rVar.f], i10, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), o0.s(true, this.q.k(), this.l, i11, ((ViewGroup.MarginLayoutParams) rVar).height), view, z10);
    }
}
