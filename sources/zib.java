// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.text.Layout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zib extends View {
    public static final lib T = new lib(0);
    public static final lib U = new lib(1);
    public static final lib V = new lib(3);
    public static final lib W = new lib(4);
    public int E;
    public int F;
    public int[] G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final ArrayList K;
    public final ArrayList L;
    public final Path M;
    public final RectF N;
    public final float[] O;
    public final yib P;
    public final ArrayList Q;
    public boolean R;
    public final xib S;
    public final amb a;
    public int b;
    public final pib c;
    public final pib d;
    public int e;
    public boolean f;
    public int h;
    public int n;
    public int r;
    public int s;
    public int w;
    public int x;
    public boolean y;

    public zib(Context context, yib yibVar, amb ambVar) {
        super(context);
        this.c = new pib(this, true);
        this.d = new pib(this, false);
        this.e = 0;
        this.f = false;
        this.h = 1;
        this.n = 0;
        this.r = hl.L(8.0f);
        this.s = hl.L(9.0f);
        this.w = hl.L(12.0f);
        this.y = true;
        this.G = new int[0];
        this.K = new ArrayList();
        this.L = new ArrayList();
        this.M = new Path();
        this.N = new RectF();
        this.O = new float[8];
        this.Q = new ArrayList();
        this.a = ambVar;
        setRowCount(TLObject.FLAG_31);
        setColumnCount(TLObject.FLAG_31);
        setOrientation(0);
        setUseDefaultMargins(false);
        setAlignmentMode(1);
        setRowOrderPreserved(true);
        setColumnOrderPreserved(true);
        this.P = yibVar;
        xib xibVar = new xib(this, this);
        this.S = xibVar;
        ihc.l(this, xibVar);
    }

    public static void g(String str) {
        throw new IllegalArgumentException(str.concat(". "));
    }

    public static void k(uib uibVar, int i, int i2, int i3, int i4) {
        tib tibVar = new tib(i, i2 + i);
        wib wibVar = uibVar.a;
        uibVar.a = new wib(wibVar.a, tibVar, wibVar.c, wibVar.d);
        tib tibVar2 = new tib(i3, i4 + i3);
        wib wibVar2 = uibVar.b;
        uibVar.b = new wib(wibVar2.a, tibVar2, wibVar2.c, wibVar2.d);
    }

    public final void a(int i, int i2, int i3, int i4) {
        ArrayList arrayList = this.Q;
        sib sibVar = new sib(this, arrayList.size());
        uib uibVar = new uib();
        tib tibVar = new tib(i2, i4 + i2);
        lib libVar = W;
        uibVar.a = new wib(false, tibVar, libVar, 0.0f);
        uibVar.b = new wib(false, new tib(i, i3 + i), libVar, 0.0f);
        sibVar.a = uibVar;
        sibVar.j = i2;
        arrayList.add(sibVar);
        h();
    }

    public final void b(TL_iv.pageTableCell pagetablecell, int i, int i2, int i3) {
        if (i3 == 0) {
            i3 = 1;
        }
        ArrayList arrayList = this.Q;
        sib sibVar = new sib(this, arrayList.size());
        sibVar.c = pagetablecell;
        uib uibVar = new uib();
        int i4 = pagetablecell.rowspan;
        if (i4 == 0) {
            i4 = 1;
        }
        tib tibVar = new tib(i2, i4 + i2);
        lib libVar = W;
        uibVar.a = new wib(false, tibVar, libVar, 0.0f);
        uibVar.b = new wib(false, new tib(i, i3 + i), libVar, 1.0f);
        sibVar.a = uibVar;
        sibVar.j = i2;
        arrayList.add(sibVar);
        if (pagetablecell.rowspan > 1) {
            this.L.add(new PointF(i2, i2 + r10));
        }
        h();
    }

    public final void c() {
        Throwable th;
        int i = this.n;
        if (i != 0) {
            int childCount = getChildCount();
            int i2 = 1;
            for (int i3 = 0; i3 < childCount; i3++) {
                i2 = (i2 * 31) + d(i3).a.hashCode();
            }
            if (i != i2) {
                h();
                c();
                return;
            }
            return;
        }
        boolean z = this.e == 0;
        int i4 = (z ? this.c : this.d).b;
        if (i4 == Integer.MIN_VALUE) {
            i4 = 0;
        }
        if (i4 < 0 || i4 > 1024) {
            g("Table grid count out of bounds");
            throw null;
        }
        int[] iArr = new int[i4];
        int childCount2 = getChildCount();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < childCount2; i7++) {
            uib uibVar = d(i7).a;
            wib wibVar = z ? uibVar.a : uibVar.b;
            tib tibVar = wibVar.b;
            boolean z2 = wibVar.a;
            int a = tibVar.a();
            if (a <= 0 || a > 1024) {
                g("Table row or column span out of bounds");
                throw null;
            }
            if (z2) {
                i5 = tibVar.a;
            }
            wib wibVar2 = z ? uibVar.b : uibVar.a;
            tib tibVar2 = wibVar2.b;
            int a2 = tibVar2.a();
            int i8 = tibVar2.a;
            if (a2 > 0) {
                th = null;
                if (tibVar2.a() <= 1024) {
                    boolean z3 = wibVar2.a;
                    int a3 = tibVar2.a();
                    if (i4 != 0) {
                        a3 = Math.min(a3, i4 - (z3 ? Math.min(i8, i4) : 0));
                    }
                    if (z3) {
                        i6 = i8;
                    }
                    if (i4 != 0) {
                        if (!z2 || !z3) {
                            while (true) {
                                int i9 = i6 + a3;
                                if (i9 <= i4) {
                                    for (int i10 = i6; i10 < i9; i10++) {
                                        if (iArr[i10] <= i5) {
                                        }
                                    }
                                    break;
                                }
                                if (z3) {
                                    i5++;
                                } else if (i9 <= i4) {
                                    i6++;
                                } else {
                                    i5++;
                                    i6 = 0;
                                }
                            }
                        }
                        Arrays.fill(iArr, Math.min(i6, i4), Math.min(i6 + a3, i4), i5 + a);
                    }
                    if (z) {
                        k(uibVar, i5, a, i6, a3);
                    } else {
                        k(uibVar, i6, a3, i5, a);
                    }
                    i6 += a3;
                }
            } else {
                th = null;
            }
            g("Table row or column span out of bounds");
            throw th;
        }
        int childCount3 = getChildCount();
        int i11 = 1;
        for (int i12 = 0; i12 < childCount3; i12++) {
            i11 = (i11 * 31) + d(i12).a.hashCode();
        }
        this.n = i11;
    }

    public final sib d(int i) {
        if (i < 0) {
            return null;
        }
        ArrayList arrayList = this.Q;
        if (i < arrayList.size()) {
            return (sib) arrayList.get(i);
        }
        return null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        xib xibVar = this.S;
        if (xibVar == null || !xibVar.f(motionEvent)) {
            return super.dispatchHoverEvent(motionEvent);
        }
        return true;
    }

    public final int e(sib sibVar, boolean z, boolean z2) {
        int[] iArr;
        if (this.h == 1) {
            return f(sibVar, z, z2);
        }
        pib pibVar = z ? this.c : this.d;
        if (z2) {
            if (pibVar.j == null) {
                pibVar.j = new int[pibVar.e() + 1];
            }
            if (!pibVar.k) {
                pibVar.b(true);
                pibVar.k = true;
            }
            iArr = pibVar.j;
        } else {
            if (pibVar.l == null) {
                pibVar.l = new int[pibVar.e() + 1];
            }
            if (!pibVar.m) {
                pibVar.b(false);
                pibVar.m = true;
            }
            iArr = pibVar.l;
        }
        uib uibVar = sibVar.a;
        tib tibVar = (z ? uibVar.b : uibVar.a).b;
        return iArr[z2 ? tibVar.a : tibVar.b];
    }

    public final int f(sib sibVar, boolean z, boolean z2) {
        wib wibVar;
        pib pibVar;
        uib uibVar = sibVar.a;
        int i = z ? z2 ? ((ViewGroup.MarginLayoutParams) uibVar).leftMargin : ((ViewGroup.MarginLayoutParams) uibVar).rightMargin : z2 ? ((ViewGroup.MarginLayoutParams) uibVar).topMargin : ((ViewGroup.MarginLayoutParams) uibVar).bottomMargin;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        if (!this.f) {
            return 0;
        }
        if (z) {
            wibVar = uibVar.b;
            pibVar = this.c;
        } else {
            wibVar = uibVar.a;
            pibVar = this.d;
        }
        tib tibVar = wibVar.b;
        if ((z && this.J) != z2) {
            return 0;
        }
        pibVar.e();
        return 0;
    }

    public int getAlignmentMode() {
        return this.h;
    }

    public int getChildCount() {
        return this.Q.size();
    }

    public int getColumnCount() {
        return this.c.e();
    }

    public int getOrientation() {
        return this.e;
    }

    public int getRenderHeight() {
        return this.F;
    }

    public int getRowCount() {
        return this.d.e();
    }

    public boolean getUseDefaultMargins() {
        return this.f;
    }

    public final void h() {
        this.n = 0;
        pib pibVar = this.c;
        pibVar.k();
        pib pibVar2 = this.d;
        pibVar2.k();
        if (pibVar == null || pibVar2 == null) {
            return;
        }
        pibVar.l();
        pibVar2.l();
    }

    public final void i(sib sibVar, int i, int i2, boolean z) {
        sibVar.d(e(sibVar, true, false) + e(sibVar, true, true) + i, e(sibVar, false, false) + e(sibVar, false, true) + i2, z);
    }

    public final void j(int i, boolean z) {
        int i2;
        int i3;
        TextPaint textPaint;
        CharSequence charSequence;
        jib b;
        yib yibVar = this.P;
        int i4 = 0;
        if (!z || !this.R || this.e != 0) {
            int childCount = getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                sib d = d(i5);
                uib uibVar = d.a;
                if (z) {
                    float size = View.MeasureSpec.getSize(i);
                    d.e(yibVar.c(d.c, this.b == 2 ? ((int) (size / 2.0f)) - (this.w << 2) : (int) (size / 1.5f)));
                    if (d.b != null) {
                        ((ViewGroup.MarginLayoutParams) uibVar).height = Math.max(this.x, d.f + this.r + this.s);
                        int b2 = d.b.b();
                        i2 = b2 > 0 ? ((ViewGroup.MarginLayoutParams) uibVar).height * b2 : d.e + (this.w << 1);
                        ((ViewGroup.MarginLayoutParams) uibVar).width = i2;
                    } else {
                        ((ViewGroup.MarginLayoutParams) uibVar).width = 0;
                        ((ViewGroup.MarginLayoutParams) uibVar).height = 0;
                        i2 = 0;
                    }
                    i(d, i2, ((ViewGroup.MarginLayoutParams) uibVar).height, true);
                } else {
                    boolean z2 = this.e == 0;
                    wib wibVar = z2 ? uibVar.b : uibVar.a;
                    wib wibVar2 = wib.e;
                    if (wibVar.a(z2) == W) {
                        tib tibVar = wibVar.b;
                        int[] g = (z2 ? this.c : this.d).g();
                        int e = (g[tibVar.b] - g[tibVar.a]) - (e(d, z2, false) + e(d, z2, true));
                        if (z2) {
                            rib ribVar = d.b;
                            int b3 = ribVar != null ? ribVar.b() : 0;
                            if (b3 > 0) {
                                int max = Math.max(1, Math.round(e / b3));
                                ((ViewGroup.MarginLayoutParams) uibVar).height = max;
                                d.m = max;
                            }
                            i(d, e, ((ViewGroup.MarginLayoutParams) uibVar).height, false);
                        } else {
                            i(d, ((ViewGroup.MarginLayoutParams) uibVar).width, e, false);
                        }
                    }
                }
            }
            return;
        }
        int childCount2 = getChildCount();
        int size2 = View.MeasureSpec.getSize(i);
        int i6 = this.w << 1;
        int max2 = Math.max(1, (this.b > 1 ? Math.round(size2 * 0.8f) : size2) - i6);
        ArrayList arrayList = new ArrayList(childCount2);
        jib[] jibVarArr = new jib[childCount2];
        int i7 = 0;
        while (i7 < childCount2) {
            sib d2 = d(i7);
            uib uibVar2 = d2.a;
            tib tibVar2 = uibVar2.b.b;
            d2.e(yibVar.c(d2.c, max2));
            if (d2.b == null) {
                ((ViewGroup.MarginLayoutParams) uibVar2).width = i4;
                ((ViewGroup.MarginLayoutParams) uibVar2).height = i4;
                i(d2, i4, i4, true);
            } else {
                ((ViewGroup.MarginLayoutParams) uibVar2).height = Math.max(this.x, d2.f + this.r + this.s);
                int b4 = d2.b.b();
                if (b4 > 0) {
                    int i8 = tibVar2.a;
                    int a = tibVar2.a();
                    int i9 = ((ViewGroup.MarginLayoutParams) uibVar2).height * b4;
                    b = new jib();
                    b.a = i8;
                    b.b = Math.max(1, a);
                    b.g = true;
                    int max3 = Math.max(0, i9);
                    b.e = max3;
                    b.d = max3;
                } else {
                    Layout a2 = d2.b.a();
                    if (a2 != null) {
                        CharSequence text = a2.getText();
                        textPaint = a2.getPaint();
                        charSequence = text;
                    } else {
                        textPaint = null;
                        charSequence = null;
                    }
                    b = sze.b(charSequence, textPaint, tibVar2.a, tibVar2.a(), i6, max2, d2.e);
                }
                jibVarArr[i7] = b;
                arrayList.add(b);
            }
            i7++;
            i4 = 0;
        }
        int[] a3 = sze.a(this.b, size2, 0, arrayList);
        for (int i10 = 0; i10 < childCount2; i10++) {
            sib d3 = d(i10);
            jib jibVar = jibVarArr[i10];
            if (jibVar != null) {
                uib uibVar3 = d3.a;
                if (d3.b.b() > 0) {
                    i3 = jibVar.e;
                    ((ViewGroup.MarginLayoutParams) uibVar3).width = i3;
                } else {
                    tib tibVar3 = uibVar3.b.b;
                    int i11 = 0;
                    for (int max4 = Math.max(0, tibVar3.a); max4 < Math.min(this.b, tibVar3.b); max4++) {
                        i11 += a3[max4];
                    }
                    int max5 = Math.max(1, i11 - i6);
                    if (d3.e > max5) {
                        d3.e(yibVar.c(d3.c, max5));
                        ((ViewGroup.MarginLayoutParams) uibVar3).height = Math.max(this.x, d3.f + this.r + this.s);
                    }
                    i3 = d3.e + i6;
                    ((ViewGroup.MarginLayoutParams) uibVar3).width = i3;
                }
                i(d3, i3, ((ViewGroup.MarginLayoutParams) uibVar3).height, true);
            }
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            d(i).a(canvas, this, true);
        }
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        c();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        zib zibVar = this;
        zibVar.c();
        pib pibVar = zibVar.d;
        pib pibVar2 = zibVar.c;
        if (pibVar2 != null && pibVar != null) {
            pibVar2.l();
            pibVar.l();
        }
        zibVar.b = 0;
        int childCount = zibVar.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            zibVar.b = Math.max(zibVar.b, zibVar.d(i7).a.b.b.b);
        }
        zibVar.j(i, true);
        if (zibVar.e == 0) {
            i3 = pibVar2.i(i);
            if (zibVar.y) {
                i3 = Math.max(i3, View.MeasureSpec.getSize(i));
                pibVar2.v.a = i3;
                pibVar2.w.a = -i3;
                pibVar2.q = false;
                pibVar2.g();
            }
            zibVar.j(i, false);
            i4 = pibVar.i(i2);
        } else {
            int i8 = pibVar.i(i2);
            zibVar.j(i, false);
            i3 = pibVar2.i(i);
            i4 = i8;
        }
        int max = Math.max(i4, zibVar.getSuggestedMinimumHeight());
        zibVar.setMeasuredDimension(i3, max);
        pibVar2.v.a = i3;
        pibVar2.w.a = -i3;
        pibVar2.q = false;
        pibVar2.g();
        pibVar.v.a = max;
        pibVar.w.a = -max;
        pibVar.q = false;
        pibVar.g();
        int[] g = pibVar2.g();
        int[] g2 = pibVar.g();
        int[] copyOf = Arrays.copyOf(g2, g2.length);
        ArrayList arrayList = zibVar.K;
        arrayList.clear();
        int i9 = g[g.length - 1];
        int childCount2 = zibVar.getChildCount();
        int i10 = 0;
        while (i10 < childCount2) {
            int i11 = i10;
            sib d = zibVar.d(i11);
            uib uibVar = d.a;
            wib wibVar = uibVar.b;
            wib wibVar2 = uibVar.a;
            tib tibVar = wibVar.b;
            tib tibVar2 = wibVar2.b;
            int i12 = childCount2;
            int i13 = g[tibVar.a];
            int i14 = g2[tibVar2.a];
            int i15 = g[tibVar.b];
            int i16 = g2[tibVar2.b];
            int i17 = i15 - i13;
            int i18 = i16 - i14;
            int i19 = d.k;
            pib pibVar3 = pibVar;
            int i20 = d.l;
            lib a = wibVar.a(true);
            lib a2 = wibVar2.a(false);
            ko9 f = pibVar2.f();
            qib qibVar = (qib) ((Object[]) f.d)[((int[]) f.b)[i11]];
            ko9 f2 = pibVar3.f();
            pib pibVar4 = pibVar2;
            qib qibVar2 = (qib) ((Object[]) f2.d)[((int[]) f2.b)[i11]];
            int b = a.b(d, i17 - qibVar.d(true));
            int b2 = a2.b(d, i18 - qibVar2.d(true));
            int e = zibVar.e(d, true, true);
            int e2 = zibVar.e(d, false, true);
            int e3 = zibVar.e(d, true, false);
            int i21 = e + e3;
            int e4 = e2 + zibVar.e(d, false, false);
            int a3 = qibVar.a(zibVar, d, a, i19 + i21, true);
            zibVar = this;
            int a4 = qibVar2.a(zibVar, d, a2, i20 + e4, false);
            int c = a.c(i19, i17 - i21);
            int c2 = a2.c(i20, i18 - e4);
            int i22 = i13 + b + a3;
            int f3 = !zibVar.J ? e + i22 : qd4.f(i9, c, e3, i22);
            int i23 = i14 + b2 + a4 + e2;
            if (d.c != null) {
                if (c == d.k && c2 == d.l) {
                    i6 = 0;
                } else {
                    i6 = 0;
                    d.d(c, c2, false);
                }
                int i24 = d.m;
                if (i24 != 0 && i24 != c2) {
                    tib tibVar3 = d.a.a.b;
                    if (tibVar3.b - tibVar3.a <= 1) {
                        ArrayList arrayList2 = zibVar.L;
                        int size = arrayList2.size();
                        int i25 = i6;
                        while (true) {
                            if (i25 >= size) {
                                arrayList.add(d);
                                break;
                            }
                            PointF pointF = (PointF) arrayList2.get(i25);
                            float f4 = pointF.x;
                            float f5 = d.a.a.b.a;
                            if (f4 > f5 || pointF.y <= f5) {
                                i25++;
                            }
                        }
                    }
                }
            }
            d.p = f3;
            d.q = i23;
            i10 = i11 + 1;
            pibVar = pibVar3;
            childCount2 = i12;
            pibVar2 = pibVar4;
        }
        int size2 = arrayList.size();
        int i26 = 0;
        while (i26 < size2) {
            sib sibVar = (sib) arrayList.get(i26);
            int i27 = sibVar.l;
            int i28 = sibVar.d;
            int i29 = i27 - sibVar.m;
            ArrayList arrayList3 = zibVar.Q;
            int size3 = arrayList3.size();
            for (int i30 = i28 + 1; i30 < size3; i30++) {
                sib sibVar2 = (sib) arrayList3.get(i30);
                if (sibVar.a.a.b.a != sibVar2.a.a.b.a) {
                    break;
                }
                int i31 = sibVar.m;
                int i32 = sibVar2.m;
                if (i31 < i32) {
                    z = true;
                    break;
                }
                int i33 = sibVar2.l - i32;
                if (i33 > 0) {
                    i29 = Math.min(i29, i33);
                }
            }
            z = false;
            if (!z) {
                int i34 = i28 - 1;
                while (true) {
                    if (i34 < 0) {
                        break;
                    }
                    sib sibVar3 = (sib) arrayList3.get(i34);
                    if (sibVar.a.a.b.a != sibVar3.a.a.b.a) {
                        break;
                    }
                    int i35 = sibVar.m;
                    int i36 = sibVar3.m;
                    if (i35 < i36) {
                        z = true;
                        break;
                    }
                    int i37 = sibVar3.l - i36;
                    if (i37 > 0) {
                        i29 = Math.min(i29, i37);
                    }
                    i34--;
                }
            }
            if (!z) {
                sibVar.l = sibVar.m;
                sibVar.g();
                max -= i29;
                int i38 = sibVar.a.a.b.a;
                while (true) {
                    i38++;
                    if (i38 >= copyOf.length) {
                        break;
                    } else {
                        copyOf[i38] = copyOf[i38] - i29;
                    }
                }
                int size4 = arrayList3.size();
                int i39 = size2;
                int i40 = i26;
                int i41 = 0;
                while (i41 < size4) {
                    sib sibVar4 = (sib) arrayList3.get(i41);
                    if (sibVar == sibVar4) {
                        i5 = i41;
                    } else {
                        int i42 = sibVar.a.a.b.a;
                        int i43 = sibVar4.a.a.b.a;
                        if (i42 == i43) {
                            if (sibVar4.m != sibVar4.l) {
                                arrayList.remove(sibVar4);
                                if (sibVar4.d < i28) {
                                    i40--;
                                }
                                i39--;
                            }
                            int i44 = sibVar4.l - i29;
                            sibVar4.l = i44;
                            i5 = i41;
                            sibVar4.d(sibVar4.k, i44, true);
                        } else {
                            i5 = i41;
                            if (i42 < i43) {
                                sibVar4.q -= i29;
                            }
                        }
                    }
                    i41 = i5 + 1;
                }
                i26 = i40;
                size2 = i39;
            }
            i26++;
        }
        int childCount3 = zibVar.getChildCount();
        for (int i45 = 0; i45 < childCount3; i45++) {
            sib d2 = zibVar.d(i45);
            zibVar.P.g(d2.b, d2.c());
            d2.n = d2.p;
            d2.o = d2.k;
        }
        zibVar.E = i9;
        zibVar.F = max;
        zibVar.G = copyOf;
        zibVar.setMeasuredDimension(i9, max);
    }

    @Override // android.view.View
    public final void requestLayout() {
        pib pibVar;
        super.requestLayout();
        pib pibVar2 = this.c;
        if (pibVar2 == null || (pibVar = this.d) == null) {
            return;
        }
        pibVar2.l();
        pibVar.l();
    }

    public void setAlignmentMode(int i) {
        this.h = i;
        requestLayout();
    }

    public void setBalancedColumns(boolean z) {
        if (this.R == z) {
            return;
        }
        this.R = z;
        requestLayout();
    }

    public void setColumnCount(int i) {
        this.c.n(i);
        h();
        requestLayout();
    }

    public void setColumnOrderPreserved(boolean z) {
        pib pibVar = this.c;
        pibVar.u = z;
        pibVar.k();
        h();
        requestLayout();
    }

    public void setDrawLines(boolean z) {
        this.H = z;
    }

    public void setFillWidth(boolean z) {
        if (this.y == z) {
            return;
        }
        this.y = z;
        requestLayout();
    }

    public void setMinimumCellHeight(int i) {
        this.x = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        if (this.e != i) {
            this.e = i;
            h();
            requestLayout();
        }
    }

    public void setRenderWidth(int i) {
        int i2;
        int measuredWidth = getMeasuredWidth();
        this.E = Math.max(measuredWidth, i);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            sib d = d(i3);
            if (measuredWidth <= 0 || (i2 = this.E) == measuredWidth) {
                int i4 = d.n;
                int i5 = d.o + i4;
                d.p = i4;
                d.k = Math.max(0, i5 - i4);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            } else {
                float f = measuredWidth;
                int round = Math.round((d.n * i2) / f);
                int round2 = Math.round(((d.n + d.o) * this.E) / f);
                d.p = round;
                d.k = Math.max(0, round2 - round);
                if (d.c != null && d.b != null) {
                    d.f();
                }
            }
        }
        int[] iArr = this.G;
        if (iArr.length < 2) {
            this.F = getMeasuredHeight();
        } else {
            int length = iArr.length;
            int i6 = length - 1;
            int[] iArr2 = new int[i6];
            int i7 = 0;
            while (i7 < i6) {
                int[] iArr3 = this.G;
                int i8 = i7 + 1;
                iArr2[i7] = iArr3[i8] - iArr3[i7];
                i7 = i8;
            }
            for (int i9 = 0; i9 < getChildCount(); i9++) {
                sib d2 = d(i9);
                rib ribVar = d2.b;
                int b = ribVar != null ? ribVar.b() : 0;
                if (b > 0) {
                    tib tibVar = d2.a.a.b;
                    int max = Math.max(0, tibVar.a);
                    int min = Math.min(i6, tibVar.b);
                    if (max < min) {
                        int i10 = 0;
                        for (int i11 = max; i11 < min; i11++) {
                            i10 += iArr2[i11];
                        }
                        int max2 = Math.max(1, Math.round(d2.k / b)) - i10;
                        while (max < min && max2 > 0) {
                            int i12 = min - max;
                            int i13 = ((max2 + i12) - 1) / i12;
                            iArr2[max] = iArr2[max] + i13;
                            max2 -= i13;
                            max++;
                        }
                    }
                }
            }
            int[] iArr4 = new int[length];
            int i14 = 0;
            while (i14 < i6) {
                int i15 = i14 + 1;
                iArr4[i15] = iArr4[i14] + iArr2[i14];
                i14 = i15;
            }
            this.F = iArr4[i6];
            for (int i16 = 0; i16 < getChildCount(); i16++) {
                sib d3 = d(i16);
                tib tibVar2 = d3.a.a.b;
                int max3 = Math.max(0, Math.min(i6, tibVar2.a));
                int max4 = Math.max(max3, Math.min(i6, tibVar2.b));
                int i17 = iArr4[max3];
                int i18 = iArr4[max4];
                d3.q = i17;
                d3.l = Math.max(0, i18 - i17);
                if (d3.c != null) {
                    d3.g();
                }
                this.P.g(d3.b, d3.c());
            }
        }
        invalidate();
    }

    public void setRowCount(int i) {
        this.d.n(i);
        h();
        requestLayout();
    }

    public void setRowOrderPreserved(boolean z) {
        pib pibVar = this.d;
        pibVar.u = z;
        pibVar.k();
        h();
        requestLayout();
    }

    public void setRtl(boolean z) {
        this.J = z;
    }

    public void setStriped(boolean z) {
        this.I = z;
    }

    public void setUseDefaultMargins(boolean z) {
        this.f = z;
        requestLayout();
    }
}
