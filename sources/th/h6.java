package th;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PorterDuffColorFilter;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.cd;
import org.telegram.ui.Components.dl0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.q80;
import org.telegram.ui.Components.t80;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h6 {
    public q80 a;
    public org.telegram.ui.Components.o5 b;
    public final ji.a c;
    public org.telegram.ui.Components.k5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.k5 f;
    public StaticLayout g;
    public f6[] h;
    public final ArrayList i;
    public final Stack j;
    public final nh.n k;
    public int l;
    public int m;
    public CharSequence n;
    public e6 o;
    public e6 p;
    public boolean q;
    public final org.telegram.ui.Components.t5 r;
    public final t80 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ i6 v;

    public h6(i6 i6Var) {
        this.v = i6Var;
        this.c = new ji.a(i6Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.t5(i6Var.J, 0L, 400L, gr.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new nh.n(i6Var, arrayList, new rh.d0(this, 17));
        t80 t80Var = new t80();
        this.s = t80Var;
        t80Var.y = path;
        t80Var.k(4.0f);
        t80Var.g(org.telegram.ui.ActionBar.t6.r1(0.3f, -1), org.telegram.ui.ActionBar.t6.r1(0.1f, -1), org.telegram.ui.ActionBar.t6.r1(0.2f, -1), org.telegram.ui.ActionBar.t6.r1(0.7f, -1));
        t80Var.setCallback(i6Var);
    }

    public final int a(int i10) {
        int i11;
        e6 e6Var = this.o;
        int i12 = 0;
        if (e6Var != null) {
            i11 = org.telegram.messenger.i0.L(8.0f) + e6Var.b();
        } else {
            i11 = 0;
        }
        e6 e6Var2 = this.p;
        if (e6Var2 != null) {
            i12 = org.telegram.messenger.i0.L(8.0f) + e6Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        i6 i6Var = this.v;
        if (staticLayout == null) {
            return i10 - ((i6Var.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!i6Var.b) {
            return i10 - ((i6Var.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * i6Var.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        i6 i6Var = this.v;
        j6 j6Var = i6Var.J;
        float d = this.r.d(this.q);
        if (f7 <= 0.0f) {
            return;
        }
        float T1 = org.telegram.messenger.i0.T1(f7, 0.7f * f7, d);
        if (T1 >= 1.0f) {
            c(canvas, d);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, j6Var.getWidth(), j6Var.getHeight(), (int) (T1 * 255.0f), 31);
            c(canvas2, d);
            canvas2.restore();
        }
        if (d > 0.0f || this.q) {
            int i10 = (int) (d * 255.0f * T1);
            t80 t80Var = this.s;
            t80Var.setAlpha(i10);
            t80Var.draw(canvas2);
            i6Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        i6 i6Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = i6Var.a;
        j6 j6Var = i6Var.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(i6Var.E, i6Var.F);
            e6 e6Var = this.o;
            int width = i6Var.getWidth();
            int i12 = i6Var.E;
            e6Var.a(canvas, (width - i12) - i12);
            int L = org.telegram.messenger.i0.L(8.0f) + this.o.b();
            canvas.restore();
            i10 = L;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(i6Var.E, i6Var.F + i10);
        if (this.c.h(canvas)) {
            i6Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (j6Var.W.x()) {
                canvas.save();
                canvas.translate(i6Var.E, i6Var.F + i10);
                j6Var.W.W(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(i6Var.E, i6Var.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.k5 update = org.telegram.ui.Components.o5.update(0, i6Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, i6Var.E, i6Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    f6[] f6VarArr = this.h;
                    if (i13 >= f6VarArr.length) {
                        break;
                    }
                    f6 f6Var = f6VarArr[i13];
                    if (f6Var != null) {
                        canvas.save();
                        float f11 = f6Var.c;
                        float f12 = f6Var.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float T1 = org.telegram.messenger.i0.T1(f11, f12, i6Var.x);
                            float T12 = org.telegram.messenger.i0.T1(f6Var.d, f6Var.f, gr.g.getInterpolation(i6Var.x));
                            canvas.translate(i6Var.E + T1, i6Var.F + i10 + T12);
                            if (z10) {
                                f(f6Var.b, i6Var.E + T1, i6Var.F + i10 + T12);
                            }
                            f6Var.b.draw(canvas);
                            org.telegram.ui.Components.k5 update2 = org.telegram.ui.Components.o5.update(0, i6Var, f6Var.a, f6Var.b);
                            f6Var.a = update2;
                            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, f6Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (i6Var.x != f10) {
                            canvas.translate(i6Var.E + f12, i6Var.F + i10 + f6Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, f6Var.b.getWidth(), f6Var.b.getHeight(), (int) (i6Var.x * 255.0f), 31);
                            d(f6Var.b, canvas, arrayList);
                            if (z10) {
                                f(f6Var.b, i6Var.E + f6Var.e, i6Var.F + i10 + f6Var.f);
                            }
                            f6Var.b.draw(canvas);
                            org.telegram.ui.Components.k5 update3 = org.telegram.ui.Components.o5.update(0, i6Var, f6Var.a, f6Var.b);
                            f6Var.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, f6Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, i6Var.x, porterDuffColorFilter);
                            canvas.restore();
                        }
                        canvas.restore();
                        i13 = i11 + 1;
                        arrayList = arrayList2;
                        f10 = 0.0f;
                    }
                    arrayList2 = arrayList;
                    i11 = i13;
                    i13 = i11 + 1;
                    arrayList = arrayList2;
                    f10 = 0.0f;
                }
            }
        } else if (this.e != null) {
            canvas.save();
            canvas.translate(i6Var.E, i6Var.F + i10);
            if (j6Var.W.x()) {
                j6Var.W.W(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.k5 update4 = org.telegram.ui.Components.o5.update(0, i6Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, i6Var.E, i6Var.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(i6Var.E, (org.telegram.messenger.i0.W1(i6Var.x, this.m, this.l) + i6Var.F) - this.p.b());
            e6 e6Var2 = this.p;
            int width2 = i6Var.getWidth();
            int i14 = i6Var.E;
            e6Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            nh.i.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    public final void e(int i10) {
        int i11;
        i6 i6Var = this.v;
        j6 j6Var = i6Var.J;
        TextPaint textPaint = i6Var.d;
        h6[] h6VarArr = i6Var.r;
        TextPaint textPaint2 = i6Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            e6 e6Var = this.o;
            if (e6Var != null) {
                this.l = org.telegram.messenger.i0.L(4.0f) + e6Var.b();
            }
            e6 e6Var2 = this.p;
            if (e6Var2 != null) {
                this.l = org.telegram.messenger.m5.C(4.0f, e6Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == h6VarArr[0]) {
                i6Var.w = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = i6.a(i6Var, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        e6 e6Var3 = this.o;
        int L = e6Var3 != null ? org.telegram.messenger.i0.L(8.0f) + e6Var3.b() : 0;
        e6 e6Var4 = this.p;
        if (e6Var4 != null) {
            this.l = org.telegram.messenger.m5.C(8.0f, e6Var4.b(), this.l);
        }
        this.l += L;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        i6Var.b = z10;
        if (z10) {
            i11 = 3;
            if (this.e.getLineCount() == 4) {
                if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                    i6Var.b = false;
                }
            }
        } else {
            i11 = 3;
        }
        if (i6Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == h6VarArr[0]) {
                String L0 = cd.L0(2131745357, null);
                i6Var.w = i6.a(i6Var, textPaint, L0, i10);
                i6Var.h = ((i6Var.F + L) + topPadding) - org.telegram.messenger.i0.N(0.3f);
                i6Var.n = (i6Var.E + i10) - textPaint.measureText(L0);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            e6 e6Var5 = this.o;
            int L2 = topPadding2 + (e6Var5 != null ? org.telegram.messenger.i0.L(8.0f) + e6Var5.b() : 0);
            e6 e6Var6 = this.p;
            this.m = L2 + (e6Var6 != null ? org.telegram.messenger.i0.L(8.0f) + e6Var6.b() : 0);
            this.g = i6.a(i6Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            nh.i.c(j6Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i12 = 0;
                while (true) {
                    f6[] f6VarArr = this.h;
                    if (i12 >= f6VarArr.length) {
                        break;
                    }
                    f6 f6Var = f6VarArr[i12];
                    if (f6Var != null) {
                        org.telegram.ui.Components.o5.release(j6Var, f6Var.a);
                    }
                    i12++;
                }
            }
            this.h = new f6[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i13 = i11; i13 < this.e.getLineCount(); i13++) {
                    int lineStart = this.e.getLineStart(i13);
                    int lineEnd = this.e.getLineEnd(i13);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i13 - 3] = null;
                    } else {
                        StaticLayout a10 = i6.a(i6Var, textPaint2, subSequence, i10);
                        f6 f6Var2 = new f6();
                        this.h[i13 - 3] = f6Var2;
                        f6Var2.b = a10;
                        f6Var2.e = this.e.getLineLeft(i13);
                        f6Var2.f = this.e.getTopPadding() + this.e.getLineTop(i13);
                        if (lineRight < i6Var.n - org.telegram.messenger.i0.L(16.0f)) {
                            f6Var2.d = topPadding;
                            f6Var2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            f6Var2.d = f6Var2.f;
                            f6Var2.c = f6Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == h6VarArr[0]) {
                i6Var.w = null;
            }
            this.g = null;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            nh.i.c(i6Var, this.e, stack, arrayList);
        }
        int i14 = i6Var.E;
        int i15 = i6Var.F;
        nh.n nVar = this.k;
        nVar.a = i14;
        nVar.b = i15;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            i6 i6Var = this.v;
            float f12 = lineLeft - (i6Var.E / 3.0f);
            float lineRight = (i6Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (i6Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (i6Var.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, e6 e6Var, e6 e6Var2) {
        this.n = charSequence;
        this.o = e6Var;
        this.p = e6Var2;
        i6 i6Var = this.v;
        if (e6Var != null) {
            g6 g6Var = new g6(this, 0);
            e6Var.r = i6Var;
            e6Var.s = g6Var;
            new dl0(i6Var);
            e6Var.j.setCallback(i6Var);
            e6Var.h.a = i6Var;
            e6Var.i.a = i6Var;
            e6Var.c();
        }
        e6 e6Var3 = this.p;
        if (e6Var3 != null) {
            g6 g6Var2 = new g6(this, 1);
            e6Var3.r = i6Var;
            e6Var3.s = g6Var2;
            new dl0(i6Var);
            e6Var3.j.setCallback(i6Var);
            e6Var3.h.a = i6Var;
            e6Var3.i.a = i6Var;
            e6Var3.c();
        }
        i6Var.s = 0;
        i6Var.requestLayout();
    }
}
