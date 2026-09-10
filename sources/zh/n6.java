package zh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.j90;
import org.telegram.ui.Components.n90;
import org.telegram.ui.Components.q90;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class n6 {
    public n90 a;
    public org.telegram.ui.Components.y5 b;
    public final j90 c;
    public org.telegram.ui.Components.u5 d;
    public StaticLayout e;
    public org.telegram.ui.Components.u5 f;
    public StaticLayout g;
    public k6[] h;
    public final ArrayList i;
    public final Stack j;
    public final uh.m k;
    public int l;
    public int m;
    public CharSequence n;
    public j6 o;
    public j6 p;
    public boolean q;
    public final org.telegram.ui.Components.d6 r;
    public final q90 s;
    public final Path t;
    public final AtomicReference u;
    public final /* synthetic */ o6 v;

    public n6(o6 o6Var) {
        this.v = o6Var;
        this.c = new j90(o6Var);
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        this.j = new Stack();
        this.n = "";
        this.r = new org.telegram.ui.Components.d6(o6Var.J, 0L, 400L, wr.h);
        Path path = new Path();
        this.t = path;
        this.u = new AtomicReference();
        this.k = new uh.m(o6Var, arrayList, new th.e(this, 26));
        q90 q90Var = new q90();
        this.s = q90Var;
        q90Var.x = path;
        q90Var.j(4.0f);
        q90Var.f(org.telegram.ui.ActionBar.j6.l1(0.3f, -1), org.telegram.ui.ActionBar.j6.l1(0.1f, -1), org.telegram.ui.ActionBar.j6.l1(0.2f, -1), org.telegram.ui.ActionBar.j6.l1(0.7f, -1));
        q90Var.setCallback(o6Var);
    }

    public final int a(int i10) {
        int i11;
        j6 j6Var = this.o;
        int i12 = 0;
        if (j6Var != null) {
            i11 = AndroidUtilities.dp(8.0f) + j6Var.b();
        } else {
            i11 = 0;
        }
        j6 j6Var2 = this.p;
        if (j6Var2 != null) {
            i12 = AndroidUtilities.dp(8.0f) + j6Var2.b();
        }
        int i13 = i11 + i12;
        StaticLayout staticLayout = this.e;
        o6 o6Var = this.v;
        if (staticLayout == null) {
            return i10 - ((o6Var.F * 2) + this.l);
        }
        int lineCount = staticLayout.getLineCount();
        if (!o6Var.b) {
            return i10 - ((o6Var.F * 2) + this.l);
        }
        return (i10 - ((Math.min(3, lineCount) + 1) * o6Var.c.getFontMetricsInt(null))) - i13;
    }

    public final void b(Canvas canvas, float f7) {
        Canvas canvas2;
        o6 o6Var = this.v;
        p6 p6Var = o6Var.J;
        float e = this.r.e(this.q);
        if (f7 <= 0.0f) {
            return;
        }
        float lerp = AndroidUtilities.lerp(f7, 0.7f * f7, e);
        if (lerp >= 1.0f) {
            c(canvas, e);
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(0.0f, 0.0f, p6Var.getWidth(), p6Var.getHeight(), (int) (lerp * 255.0f), 31);
            c(canvas2, e);
            canvas2.restore();
        }
        if (e > 0.0f || this.q) {
            int i10 = (int) (e * 255.0f * lerp);
            q90 q90Var = this.s;
            q90Var.setAlpha(i10);
            q90Var.draw(canvas2);
            o6Var.invalidate();
        }
    }

    public final void c(Canvas canvas, float f7) {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i11;
        o6 o6Var = this.v;
        PorterDuffColorFilter porterDuffColorFilter = o6Var.a;
        p6 p6Var = o6Var.J;
        if (this.o != null) {
            canvas.save();
            canvas.translate(o6Var.E, o6Var.F);
            j6 j6Var = this.o;
            int width = o6Var.getWidth();
            int i12 = o6Var.E;
            j6Var.a(canvas, (width - i12) - i12);
            int dp = AndroidUtilities.dp(8.0f) + this.o.b();
            canvas.restore();
            i10 = dp;
        } else {
            i10 = 0;
        }
        canvas.save();
        canvas.translate(o6Var.E, o6Var.F + i10);
        if (this.c.f(canvas)) {
            o6Var.invalidate();
        }
        canvas.restore();
        float f10 = 0.0f;
        boolean z10 = f7 > 0.0f;
        this.t.rewind();
        ArrayList arrayList3 = this.i;
        if (arrayList3.isEmpty() && this.g != null) {
            if (p6Var.W.y()) {
                canvas.save();
                canvas.translate(o6Var.E, o6Var.F + i10);
                p6Var.W.X(canvas);
                canvas.restore();
            }
            if (this.g != null) {
                canvas.save();
                canvas.translate(o6Var.E, o6Var.F + i10);
                d(this.g, canvas, arrayList3);
                org.telegram.ui.Components.u5 update = org.telegram.ui.Components.y5.update(0, o6Var, this.f, this.g);
                this.f = update;
                org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.g, update, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                arrayList = arrayList3;
                canvas.restore();
                if (z10) {
                    f(this.g, o6Var.E, o6Var.F + i10);
                }
            } else {
                arrayList = arrayList3;
            }
            if (this.h != null) {
                int i13 = 0;
                while (true) {
                    k6[] k6VarArr = this.h;
                    if (i13 >= k6VarArr.length) {
                        break;
                    }
                    k6 k6Var = k6VarArr[i13];
                    if (k6Var != null) {
                        canvas.save();
                        float f11 = k6Var.c;
                        float f12 = k6Var.e;
                        if (f11 != f12) {
                            arrayList2 = arrayList;
                            i11 = i13;
                            float lerp = AndroidUtilities.lerp(f11, f12, o6Var.w);
                            float lerp2 = AndroidUtilities.lerp(k6Var.d, k6Var.f, wr.g.getInterpolation(o6Var.w));
                            canvas.translate(o6Var.E + lerp, o6Var.F + i10 + lerp2);
                            if (z10) {
                                f(k6Var.b, o6Var.E + lerp, o6Var.F + i10 + lerp2);
                            }
                            k6Var.b.draw(canvas);
                            org.telegram.ui.Components.u5 update2 = org.telegram.ui.Components.y5.update(0, o6Var, k6Var.a, k6Var.b);
                            k6Var.a = update2;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, k6Var.b, update2, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
                        } else if (o6Var.w != f10) {
                            canvas.translate(o6Var.E + f12, o6Var.F + i10 + k6Var.f);
                            canvas.saveLayerAlpha(0.0f, 0.0f, k6Var.b.getWidth(), k6Var.b.getHeight(), (int) (o6Var.w * 255.0f), 31);
                            d(k6Var.b, canvas, arrayList);
                            if (z10) {
                                f(k6Var.b, o6Var.E + k6Var.e, o6Var.F + i10 + k6Var.f);
                            }
                            k6Var.b.draw(canvas);
                            org.telegram.ui.Components.u5 update3 = org.telegram.ui.Components.y5.update(0, o6Var, k6Var.a, k6Var.b);
                            k6Var.a = update3;
                            arrayList2 = arrayList;
                            i11 = i13;
                            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, k6Var.b, update3, 0.0f, arrayList2, 0.0f, 0.0f, 0.0f, o6Var.w, porterDuffColorFilter);
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
            canvas.translate(o6Var.E, o6Var.F + i10);
            if (p6Var.W.y()) {
                p6Var.W.X(canvas);
            }
            d(this.e, canvas, arrayList3);
            org.telegram.ui.Components.u5 update4 = org.telegram.ui.Components.y5.update(0, o6Var, this.d, this.e);
            this.d = update4;
            org.telegram.ui.Components.y5.drawAnimatedEmojis(canvas, this.e, update4, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f, porterDuffColorFilter);
            canvas.restore();
            if (z10) {
                f(this.e, o6Var.E, o6Var.F + i10);
            }
        }
        if (this.p != null) {
            canvas.save();
            canvas.translate(o6Var.E, (AndroidUtilities.lerp(this.m, this.l, o6Var.w) + o6Var.F) - this.p.b());
            j6 j6Var2 = this.p;
            int width2 = o6Var.getWidth();
            int i14 = o6Var.E;
            j6Var2.a(canvas, (width2 - i14) - i14);
            canvas.restore();
        }
    }

    public final void d(StaticLayout staticLayout, Canvas canvas, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            staticLayout.draw(canvas);
        } else {
            uh.h.g(this.v, false, -1, 0, this.u, 0, staticLayout, arrayList, canvas, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void e(int i10) {
        StaticLayout staticLayout;
        StaticLayout staticLayout2;
        o6 o6Var = this.v;
        p6 p6Var = o6Var.J;
        TextPaint textPaint = o6Var.d;
        n6[] n6VarArr = o6Var.r;
        TextPaint textPaint2 = o6Var.c;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        Stack stack = this.j;
        ArrayList arrayList = this.i;
        if (isEmpty) {
            this.e = null;
            this.l = 0;
            j6 j6Var = this.o;
            if (j6Var != null) {
                this.l = AndroidUtilities.dp(4.0f) + j6Var.b();
            }
            j6 j6Var2 = this.p;
            if (j6Var2 != null) {
                this.l = org.telegram.messenger.a2.C(4.0f, j6Var2.b(), this.l);
            }
            this.m = this.l;
            if (this == n6VarArr[0]) {
                o6Var.v = null;
            }
            this.g = null;
            stack.addAll(arrayList);
            arrayList.clear();
            return;
        }
        StaticLayout a2 = o6.a(o6Var, textPaint2, this.n, i10);
        this.e = a2;
        this.l = a2.getHeight();
        j6 j6Var3 = this.o;
        int dp = j6Var3 != null ? AndroidUtilities.dp(8.0f) + j6Var3.b() : 0;
        j6 j6Var4 = this.p;
        if (j6Var4 != null) {
            this.l = org.telegram.messenger.a2.C(8.0f, j6Var4.b(), this.l);
        }
        this.l += dp;
        float measureText = textPaint2.measureText(" ");
        boolean z10 = this.e.getLineCount() > 3;
        o6Var.b = z10;
        if (!z10) {
            staticLayout = null;
        } else if (this.e.getLineCount() == 4) {
            staticLayout = null;
            if (TextUtils.getTrimmedLength(this.n.subSequence(this.e.getLineStart(2), this.e.getLineEnd(2))) == 0) {
                o6Var.b = false;
            }
        } else {
            staticLayout = null;
        }
        if (o6Var.b) {
            float topPadding = this.e.getTopPadding() + this.e.getLineTop(2);
            if (this == n6VarArr[0]) {
                String string = LocaleController.getString(R.string.ShowMore);
                o6Var.v = o6.a(o6Var, textPaint, string, i10);
                o6Var.h = ((o6Var.F + dp) + topPadding) - AndroidUtilities.dpf2(0.3f);
                o6Var.n = (o6Var.E + i10) - textPaint.measureText(string);
            }
            int topPadding2 = this.e.getTopPadding() + this.e.getLineBottom(2);
            j6 j6Var5 = this.o;
            int dp2 = topPadding2 + (j6Var5 != null ? AndroidUtilities.dp(8.0f) + j6Var5.b() : 0);
            j6 j6Var6 = this.p;
            this.m = dp2 + (j6Var6 != null ? AndroidUtilities.dp(8.0f) + j6Var6.b() : 0);
            this.g = o6.a(o6Var, textPaint2, this.n.subSequence(0, this.e.getLineEnd(2)), i10);
            stack.addAll(arrayList);
            arrayList.clear();
            uh.h.c(p6Var, this.e, stack, arrayList);
            float lineRight = this.e.getLineRight(2) + measureText;
            if (this.h != null) {
                int i11 = 0;
                while (true) {
                    k6[] k6VarArr = this.h;
                    if (i11 >= k6VarArr.length) {
                        break;
                    }
                    k6 k6Var = k6VarArr[i11];
                    if (k6Var != null) {
                        org.telegram.ui.Components.y5.release(p6Var, k6Var.a);
                    }
                    i11++;
                }
            }
            this.h = new k6[this.e.getLineCount() - 3];
            if (arrayList.isEmpty()) {
                for (int i12 = 3; i12 < this.e.getLineCount(); i12++) {
                    int lineStart = this.e.getLineStart(i12);
                    int lineEnd = this.e.getLineEnd(i12);
                    CharSequence subSequence = this.n.subSequence(Math.min(lineStart, lineEnd), Math.max(lineStart, lineEnd));
                    if (TextUtils.isEmpty(subSequence)) {
                        this.h[i12 - 3] = staticLayout;
                    } else {
                        StaticLayout a10 = o6.a(o6Var, textPaint2, subSequence, i10);
                        k6 k6Var2 = new k6();
                        this.h[i12 - 3] = k6Var2;
                        k6Var2.b = a10;
                        k6Var2.e = this.e.getLineLeft(i12);
                        k6Var2.f = this.e.getTopPadding() + this.e.getLineTop(i12);
                        if (lineRight < o6Var.n - AndroidUtilities.dp(16.0f)) {
                            k6Var2.d = topPadding;
                            k6Var2.c = lineRight;
                            lineRight = Math.abs(a10.getLineRight(0) - a10.getLineLeft(0)) + measureText + lineRight;
                        } else {
                            k6Var2.d = k6Var2.f;
                            k6Var2.c = k6Var2.e;
                        }
                    }
                }
            }
        } else {
            if (this == n6VarArr[0]) {
                staticLayout2 = staticLayout;
                o6Var.v = staticLayout2;
            } else {
                staticLayout2 = staticLayout;
            }
            this.g = staticLayout2;
            this.m = this.l;
            stack.addAll(arrayList);
            arrayList.clear();
            uh.h.c(o6Var, this.e, stack, arrayList);
        }
        int i13 = o6Var.E;
        int i14 = o6Var.F;
        uh.m mVar = this.k;
        mVar.c = i13;
        mVar.d = i14;
    }

    public final void f(Layout layout, float f7, float f10) {
        float f11 = 0.0f;
        int i10 = 0;
        while (i10 < layout.getLineCount()) {
            float lineLeft = layout.getLineLeft(i10);
            o6 o6Var = this.v;
            float f12 = lineLeft - (o6Var.E / 3.0f);
            float lineRight = (o6Var.E / 3.0f) + layout.getLineRight(i10);
            if (i10 == 0) {
                f11 = layout.getLineTop(i10) - (o6Var.F / 3.0f);
            }
            float lineBottom = layout.getLineBottom(i10);
            float f13 = i10 >= layout.getLineCount() + (-1) ? (o6Var.F / 3.0f) + lineBottom : lineBottom;
            this.t.addRect(f7 + f12, f10 + f11, f7 + lineRight, f10 + f13, Path.Direction.CW);
            i10++;
            f11 = f13;
        }
    }

    public final void g(CharSequence charSequence, j6 j6Var, j6 j6Var2) {
        this.n = charSequence;
        this.o = j6Var;
        this.p = j6Var2;
        o6 o6Var = this.v;
        if (j6Var != null) {
            m6 m6Var = new m6(this, 0);
            j6Var.r = o6Var;
            j6Var.s = m6Var;
            new cm0(o6Var);
            j6Var.j.setCallback(o6Var);
            j6Var.h.a = o6Var;
            j6Var.i.a = o6Var;
            j6Var.c();
        }
        j6 j6Var3 = this.p;
        if (j6Var3 != null) {
            m6 m6Var2 = new m6(this, 1);
            j6Var3.r = o6Var;
            j6Var3.s = m6Var2;
            new cm0(o6Var);
            j6Var3.j.setCallback(o6Var);
            j6Var3.h.a = o6Var;
            j6Var3.i.a = o6Var;
            j6Var3.c();
        }
        o6Var.s = 0;
        o6Var.requestLayout();
    }
}
