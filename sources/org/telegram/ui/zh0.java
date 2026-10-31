package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.Layout;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class zh0 implements Choreographer.FrameCallback {
    public static final LinearGradient D;
    public static final Matrix E = new Matrix();
    public static final Paint y;
    public final Choreographer a = Choreographer.getInstance();
    public List b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f = 0.0f;
    public boolean h = false;
    public boolean n = true;
    public long r = 0;
    public float s = org.telegram.messenger.i0.L(40.0f);
    public View w;
    public org.telegram.messenger.dd x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        D = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f7, yh0 yh0Var) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i10 < 0 || i10 >= lineCount) {
            return;
        }
        yh0 ttVar = yh0Var != null ? yh0Var : new tt(layout, 24);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            ttVar.d(canvas);
            canvas.restore();
        }
        float lineLeft = layout.getLineLeft(i10);
        float lineRight = layout.getLineRight(i10);
        float min = Math.min(lineLeft, lineRight);
        float max = Math.max(lineLeft, lineRight);
        if (max <= min) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(i10);
        float f10 = max - min;
        float a2 = w7.u.a(f7, 0.0f, f10);
        float f11 = a2 / f10;
        if (a2 <= 0.0f) {
            return;
        }
        if (a2 >= f10) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            ttVar.d(canvas);
            canvas.restore();
            return;
        }
        float T1 = org.telegram.messenger.i0.T1(-org.telegram.messenger.i0.L(50.0f), f10, f11);
        org.telegram.messenger.i0.L(50.0f);
        float f12 = lineTop;
        float f13 = lineBottom;
        int saveLayer = canvas.saveLayer(min, f12, max, f13, null);
        canvas.save();
        canvas.clipRect(min, f12, max, f13);
        ttVar.d(canvas);
        canvas.restore();
        Matrix matrix = E;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(org.telegram.messenger.i0.L(50.0f), 1.0f);
            matrix.postTranslate(T1, 0.0f);
        } else {
            matrix.setScale(-org.telegram.messenger.i0.L(50.0f), 1.0f);
            matrix.postTranslate(f10 - T1, 0.0f);
        }
        D.setLocalMatrix(matrix);
        canvas.drawRect(min, f12, max, f13, y);
        canvas.restoreToCount(saveLayer);
    }

    public static float h(Layout layout, int i10) {
        float lineRight = layout.getLineRight(i10) - layout.getLineLeft(i10);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public final void a(float f7) {
        int size = this.b.size();
        View view = null;
        int i10 = 0;
        while (i10 < size) {
            xh0 xh0Var = (xh0) this.b.get(i10);
            float f10 = (this.n || i10 <= this.d) ? 1.0f : 0.0f;
            ArrayList arrayList = this.c;
            float floatValue = i10 < arrayList.size() ? ((Float) arrayList.get(i10)).floatValue() : f10;
            if (floatValue == f10) {
                f10 = floatValue;
            } else if (f7 > 0.0f) {
                float f11 = f7 / 0.2f;
                f10 = f10 > floatValue ? Math.min(f10, f11 + floatValue) : Math.max(f10, floatValue - f11);
            }
            if (i10 < arrayList.size() && f10 != floatValue) {
                arrayList.set(i10, Float.valueOf(f10));
            }
            View e = xh0Var.e();
            if (e != null && e != view) {
                if (e.getAlpha() != f10) {
                    e.setAlpha(f10);
                }
                view = e;
            }
            i10++;
        }
    }

    public final float c(xh0 xh0Var) {
        int d = d(xh0Var);
        if (d < 0) {
            return 1.0f;
        }
        ArrayList arrayList = this.c;
        if (d >= arrayList.size()) {
            return 1.0f;
        }
        return ((Float) arrayList.get(d)).floatValue();
    }

    public final int d(xh0 xh0Var) {
        int size = this.b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.b.get(i10) == xh0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        if (this.h) {
            float f7 = 0.0f;
            if (this.r != 0) {
                float f10 = (j10 - r0) * 1.0E-9f;
                if (this.b.isEmpty() || f10 <= 0.0f) {
                    this.n = this.b.isEmpty();
                } else {
                    float f11 = this.s * f10;
                    while (true) {
                        if (f11 <= 0.0f) {
                            break;
                        }
                        if (this.d >= this.b.size()) {
                            this.n = true;
                            break;
                        }
                        Layout a2 = ((xh0) this.b.get(this.d)).a();
                        if (a2 != null && a2.getLineCount() != 0) {
                            if (this.e >= a2.getLineCount()) {
                                int lineCount = a2.getLineCount() - 1;
                                this.e = lineCount;
                                this.f = h(a2, lineCount);
                            }
                            float h = h(a2, this.e);
                            if (h <= 0.001f) {
                                if (j(a2)) {
                                    break;
                                }
                            } else {
                                float f12 = this.f;
                                float f13 = h - f12;
                                if (f13 <= 0.001f) {
                                    if (j(a2)) {
                                        break;
                                    }
                                } else {
                                    if (f11 < f13) {
                                        f13 = f11;
                                    }
                                    float f14 = f12 + f13;
                                    this.f = f14;
                                    f11 -= f13;
                                    if (h - f14 <= 0.001f && !j(a2)) {
                                        f11 = 0.0f;
                                    }
                                }
                            }
                        } else {
                            this.d++;
                            this.e = 0;
                            this.f = 0.0f;
                        }
                    }
                    this.n = f();
                }
                f7 = f10;
            }
            this.r = j10;
            a(f7);
            e();
            if (!this.n) {
                this.a.postFrameCallback(this);
                return;
            }
            this.h = false;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.set(i10, Float.valueOf(1.0f));
            }
            int size2 = this.b.size();
            View view = null;
            for (int i11 = 0; i11 < size2; i11++) {
                View e = ((xh0) this.b.get(i11)).e();
                if (e != null && e != view) {
                    if (e.getAlpha() != 1.0f) {
                        e.setAlpha(1.0f);
                    }
                    view = e;
                }
            }
            org.telegram.messenger.dd ddVar = this.x;
            if (ddVar != null) {
                ddVar.run();
                this.x = null;
            }
        }
    }

    public final void e() {
        xh0 xh0Var;
        int i10 = this.d;
        View e = (i10 < 0 || i10 >= this.b.size() || (xh0Var = (xh0) this.b.get(this.d)) == null) ? null : xh0Var.e();
        if (e != null) {
            e.invalidate();
            View view = this.w;
            if (view != null && view != e) {
                view.invalidate();
            }
            this.w = e;
        }
    }

    public final boolean f() {
        if (!this.b.isEmpty()) {
            int size = this.b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((xh0) this.b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i10 = this.d;
                if (i10 < size) {
                    return false;
                }
                if (i10 <= size) {
                    int lineCount = layout.getLineCount() - 1;
                    float h = h(layout, lineCount);
                    if (this.e < lineCount || this.f < h - 0.001f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean g(xh0 xh0Var) {
        Layout a2;
        return d(xh0Var) == this.d && (a2 = xh0Var.a()) != null && this.e < a2.getLineCount();
    }

    public final boolean i(xh0 xh0Var) {
        int d = d(xh0Var);
        if (d < 0 || this.b.isEmpty()) {
            return false;
        }
        int i10 = this.d;
        return d < i10 || d <= i10;
    }

    public final boolean j(Layout layout) {
        int i10 = this.e + 1;
        this.e = i10;
        this.f = 0.0f;
        if (i10 >= layout.getLineCount()) {
            int i11 = this.d + 1;
            this.d = i11;
            this.e = 0;
            this.f = 0.0f;
            if (i11 >= this.b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f7;
        ArrayList arrayList2;
        boolean z10;
        if (!this.b.isEmpty() && this.d >= this.b.size()) {
            int size = this.b.size() - 1;
            this.d = size;
            Layout a2 = ((xh0) this.b.get(size)).a();
            int max = Math.max(0, a2 == null ? 0 : a2.getLineCount() - 1);
            this.e = max;
            this.f = a2 == null ? 0.0f : a2.getLineWidth(max);
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            f7 = 0.0f;
        } else {
            int i10 = this.d;
            f7 = 0.0f;
            while (i10 < this.b.size()) {
                Layout a10 = ((xh0) this.b.get(i10)).a();
                if (a10 != null) {
                    int min = i10 == this.d ? Math.min(Math.max(this.e, 0), Math.max(0, a10.getLineCount() - 1)) : 0;
                    for (int i11 = min; i11 < a10.getLineCount(); i11++) {
                        float h = h(a10, i11);
                        if (h > 0.001f) {
                            if (i10 == this.d && i11 == min) {
                                h -= this.f;
                                if (h <= 0.001f) {
                                }
                            }
                            f7 += h;
                        }
                    }
                }
                i10++;
            }
        }
        float L = org.telegram.messenger.i0.L(40.0f);
        if (f7 <= 0.001f) {
            this.s = L;
        } else {
            this.s = Math.max(L, f7 / 1.05f);
        }
        this.n = f();
        while (true) {
            arrayList2 = this.c;
            if (arrayList2.size() <= this.b.size()) {
                break;
            } else {
                a1.g.x(1, arrayList2);
            }
        }
        int size2 = arrayList2.size();
        while (size2 < this.b.size()) {
            arrayList2.add(Float.valueOf((this.n || size2 <= this.d) ? 1.0f : 0.0f));
            size2++;
        }
        if (!this.n && !(z10 = this.h) && !z10) {
            this.h = true;
            if (f()) {
                this.n = true;
            }
            this.r = 0L;
            this.a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }

    public final void l(org.telegram.messenger.dd ddVar) {
        this.x = ddVar;
    }
}
