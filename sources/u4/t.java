package u4;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class t extends s {
    public final ArrayList Q;
    public boolean R;

    public t(boolean z10) {
        super(1000, z10);
        this.Q = new ArrayList(4);
        this.R = true;
    }

    public abstract boolean B1(int i3);

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
    @Override // u4.s, u4.b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Z0(tf.e eVar, a1 a1Var, z zVar, m2.j jVar) {
        boolean z10;
        int i3;
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
        View c2;
        boolean z13;
        tf.e eVar2 = eVar;
        a1 a1Var2 = a1Var;
        int i18 = this.q.i();
        int i19 = 0;
        boolean z14 = true;
        boolean z15 = zVar.e == 1;
        jVar.a = 0;
        int i20 = zVar.d;
        boolean z16 = this.v;
        Rect rect = this.P;
        ArrayList arrayList = this.Q;
        int i21 = -1;
        if (z16 && zVar.f != -1 && B1(i20) && m(zVar.d + 1) == null) {
            if (B1(zVar.d + 1)) {
                zVar.d += 3;
            } else {
                zVar.d += 2;
            }
            int i22 = zVar.d;
            int i23 = i22;
            while (i23 > i20) {
                View c10 = zVar.c(eVar2);
                if (c10 != null) {
                    arrayList.add(c10);
                    if (i23 != i22) {
                        c(c10, rect);
                        w1(i18, c10, false);
                        z13 = z14;
                        int b10 = this.q.b(c10);
                        zVar.b -= b10;
                        zVar.c += b10;
                        i23--;
                        z14 = z13;
                    }
                }
                z13 = z14;
                i23--;
                z14 = z13;
            }
            z10 = z14;
            zVar.d = i22;
        } else {
            z10 = true;
        }
        boolean z17 = z10;
        while (z17) {
            int i24 = this.J;
            boolean z18 = !arrayList.isEmpty();
            int i25 = i19;
            while (i25 < this.J && zVar.b(a1Var2) && i24 > 0) {
                int i26 = zVar.d;
                i24 -= v1(i26, eVar2, a1Var2);
                if (i24 < 0) {
                    break;
                }
                if (arrayList.isEmpty()) {
                    c2 = zVar.c(eVar2);
                } else {
                    c2 = (View) arrayList.get(i19);
                    arrayList.remove(i19);
                    zVar.d--;
                }
                if (c2 == null) {
                    break;
                }
                this.L[i25] = c2;
                i25++;
                if (zVar.f == i21 && i24 <= 0 && B1(i26)) {
                    z18 = z10;
                }
                i19 = 0;
            }
            p1(i25, eVar2, a1Var2, z15);
            float f10 = 0.0f;
            int i27 = 0;
            for (int i28 = 0; i28 < i25; i28++) {
                View view = this.L[i28];
                if (zVar.k == null) {
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
                float c11 = (this.q.c(view) * 1.0f) / ((r) view.getLayoutParams()).f;
                if (c11 > f10) {
                    f10 = c11;
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
                    x1(o0.s(false, this.K[rVar.f], TLObject.FLAG_30, rect2.left + rect2.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), View.MeasureSpec.makeMeasureSpec(i27 - (((rect2.top + rect2.bottom) + ((ViewGroup.MarginLayoutParams) rVar).topMargin) + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin), TLObject.FLAG_30), view2, true);
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
                i3 = -1;
            } else {
                i3 = -1;
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
                    int c12 = this.q.c(view3);
                    int i36 = i35;
                    boolean z19 = z15;
                    if (zVar.f == -1) {
                        i34 -= c12;
                    }
                    int i37 = c12 + i34;
                    o0.O(view3, i34, i10, i37, i11);
                    if (zVar.f == 1) {
                        i34 = i37;
                    }
                    if (rVar2.a.j() || rVar2.a.m()) {
                        jVar.c = true;
                    }
                    jVar.d |= view3.hasFocusable();
                    i35 = i36 + 1;
                    z15 = z19;
                }
                boolean z20 = z15;
                jVar.a += i27;
                Arrays.fill(this.L, (Object) null);
                a1Var2 = a1Var;
                z10 = true;
                z17 = z18;
                i18 = i30;
                z15 = z20;
                i19 = 0;
                i21 = -1;
                eVar2 = eVar;
            }
            if (zVar.f == i3) {
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
                int c13 = this.q.c(view4);
                int i41 = i14;
                int i42 = zVar.f == 1 ? i41 - c13 : i41;
                int i43 = c13 + i42;
                o0.O(view4, i42, i15, i43, i13);
                i14 = zVar.f == -1 ? i43 : i42;
                if (rVar3.a.j() || rVar3.a.m()) {
                    jVar.c = true;
                }
                jVar.d |= view4.hasFocusable();
            }
            boolean z202 = z15;
            jVar.a += i27;
            Arrays.fill(this.L, (Object) null);
            a1Var2 = a1Var;
            z10 = true;
            z17 = z18;
            i18 = i30;
            z15 = z202;
            i19 = 0;
            i21 = -1;
            eVar2 = eVar;
        }
    }

    @Override // u4.b0, u4.o0
    public final boolean e() {
        return this.R;
    }

    @Override // u4.b0
    public final void e1(tf.e eVar, int i3, int i10) {
        if (i3 < 0) {
            return;
        }
        int r5 = r();
        if (!this.v) {
            for (int i11 = 0; i11 < r5; i11++) {
                View q10 = q(i11);
                if (q10.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q10.getLayoutParams())).bottomMargin <= i3) {
                    if (q10.getHeight() + q10.getTop() <= i3) {
                    }
                }
                d1(eVar, 0, i11);
                return;
            }
            return;
        }
        int i12 = r5 - 1;
        for (int i13 = i12; i13 >= 0; i13--) {
            View q11 = q(i13);
            if (q11.getBottom() + ((ViewGroup.MarginLayoutParams) ((p0) q11.getLayoutParams())).bottomMargin <= i3) {
                if (q11.getHeight() + q11.getTop() <= i3) {
                }
            }
            d1(eVar, i12, i13);
            return;
        }
    }

    @Override // u4.s
    public final int[] q1(int i3, int i10, int[] iArr) {
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i10) {
            iArr = new int[i3 + 1];
        }
        iArr[0] = 0;
        for (int i11 = 1; i11 <= i3; i11++) {
            iArr[i11] = (int) Math.ceil((i11 / i3) * i10);
        }
        return iArr;
    }

    @Override // u4.s
    public final void w1(int i3, View view, boolean z10) {
        r rVar = (r) view.getLayoutParams();
        Rect rect = rVar.b;
        int i10 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) rVar).topMargin + ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        x1(o0.s(false, this.K[rVar.f], i3, rect.left + rect.right + ((ViewGroup.MarginLayoutParams) rVar).leftMargin + ((ViewGroup.MarginLayoutParams) rVar).rightMargin, ((ViewGroup.MarginLayoutParams) rVar).width), o0.s(true, this.q.k(), this.l, i10, ((ViewGroup.MarginLayoutParams) rVar).height), view, z10);
    }
}
