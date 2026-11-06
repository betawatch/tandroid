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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tg0 implements Choreographer.FrameCallback {
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
    public float s = org.telegram.messenger.g0.L(40.0f);
    public View w;
    public bi.ia x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        D = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i7, float f10, sg0 sg0Var) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i7 < 0 || i7 >= lineCount) {
            return;
        }
        sg0 wrVar = sg0Var != null ? sg0Var : new wr(layout, 24);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i7);
        int lineBottom = layout.getLineBottom(i7);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            wrVar.d(canvas);
            canvas.restore();
        }
        float lineLeft = layout.getLineLeft(i7);
        float lineRight = layout.getLineRight(i7);
        float min = Math.min(lineLeft, lineRight);
        float max = Math.max(lineLeft, lineRight);
        if (max <= min) {
            return;
        }
        int paragraphDirection = layout.getParagraphDirection(i7);
        float f11 = max - min;
        float a10 = c8.j9.a(f10, 0.0f, f11);
        float f12 = a10 / f11;
        if (a10 <= 0.0f) {
            return;
        }
        if (a10 >= f11) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            wrVar.d(canvas);
            canvas.restore();
            return;
        }
        float T1 = org.telegram.messenger.g0.T1(-org.telegram.messenger.g0.L(50.0f), f11, f12);
        org.telegram.messenger.g0.L(50.0f);
        float f13 = lineTop;
        float f14 = lineBottom;
        int saveLayer = canvas.saveLayer(min, f13, max, f14, null);
        canvas.save();
        canvas.clipRect(min, f13, max, f14);
        wrVar.d(canvas);
        canvas.restore();
        Matrix matrix = E;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(org.telegram.messenger.g0.L(50.0f), 1.0f);
            matrix.postTranslate(T1, 0.0f);
        } else {
            matrix.setScale(-org.telegram.messenger.g0.L(50.0f), 1.0f);
            matrix.postTranslate(f11 - T1, 0.0f);
        }
        D.setLocalMatrix(matrix);
        canvas.drawRect(min, f13, max, f14, y);
        canvas.restoreToCount(saveLayer);
    }

    public static float h(Layout layout, int i7) {
        float lineRight = layout.getLineRight(i7) - layout.getLineLeft(i7);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public final void a(float f10) {
        int size = this.b.size();
        View view = null;
        int i7 = 0;
        while (i7 < size) {
            rg0 rg0Var = (rg0) this.b.get(i7);
            float f11 = (this.n || i7 <= this.d) ? 1.0f : 0.0f;
            ArrayList arrayList = this.c;
            float floatValue = i7 < arrayList.size() ? ((Float) arrayList.get(i7)).floatValue() : f11;
            if (floatValue == f11) {
                f11 = floatValue;
            } else if (f10 > 0.0f) {
                float f12 = f10 / 0.2f;
                f11 = f11 > floatValue ? Math.min(f11, f12 + floatValue) : Math.max(f11, floatValue - f12);
            }
            if (i7 < arrayList.size() && f11 != floatValue) {
                arrayList.set(i7, Float.valueOf(f11));
            }
            View e10 = rg0Var.e();
            if (e10 != null && e10 != view) {
                if (e10.getAlpha() != f11) {
                    e10.setAlpha(f11);
                }
                view = e10;
            }
            i7++;
        }
    }

    public final float c(rg0 rg0Var) {
        int d = d(rg0Var);
        if (d < 0) {
            return 1.0f;
        }
        ArrayList arrayList = this.c;
        if (d >= arrayList.size()) {
            return 1.0f;
        }
        return ((Float) arrayList.get(d)).floatValue();
    }

    public final int d(rg0 rg0Var) {
        int size = this.b.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (this.b.get(i7) == rg0Var) {
                return i7;
            }
        }
        return -1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.h) {
            float f10 = 0.0f;
            if (this.r != 0) {
                float f11 = (j3 - r0) * 1.0E-9f;
                if (this.b.isEmpty() || f11 <= 0.0f) {
                    this.n = this.b.isEmpty();
                } else {
                    float f12 = this.s * f11;
                    while (true) {
                        if (f12 <= 0.0f) {
                            break;
                        }
                        if (this.d >= this.b.size()) {
                            this.n = true;
                            break;
                        }
                        Layout a10 = ((rg0) this.b.get(this.d)).a();
                        if (a10 != null && a10.getLineCount() != 0) {
                            if (this.e >= a10.getLineCount()) {
                                int lineCount = a10.getLineCount() - 1;
                                this.e = lineCount;
                                this.f = h(a10, lineCount);
                            }
                            float h = h(a10, this.e);
                            if (h <= 0.001f) {
                                if (j(a10)) {
                                    break;
                                }
                            } else {
                                float f13 = this.f;
                                float f14 = h - f13;
                                if (f14 <= 0.001f) {
                                    if (j(a10)) {
                                        break;
                                    }
                                } else {
                                    if (f12 < f14) {
                                        f14 = f12;
                                    }
                                    float f15 = f13 + f14;
                                    this.f = f15;
                                    f12 -= f14;
                                    if (h - f15 <= 0.001f && !j(a10)) {
                                        f12 = 0.0f;
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
                f10 = f11;
            }
            this.r = j3;
            a(f10);
            e();
            if (!this.n) {
                this.a.postFrameCallback(this);
                return;
            }
            this.h = false;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                arrayList.set(i7, Float.valueOf(1.0f));
            }
            int size2 = this.b.size();
            View view = null;
            for (int i10 = 0; i10 < size2; i10++) {
                View e10 = ((rg0) this.b.get(i10)).e();
                if (e10 != null && e10 != view) {
                    if (e10.getAlpha() != 1.0f) {
                        e10.setAlpha(1.0f);
                    }
                    view = e10;
                }
            }
            bi.ia iaVar = this.x;
            if (iaVar != null) {
                iaVar.run();
                this.x = null;
            }
        }
    }

    public final void e() {
        rg0 rg0Var;
        int i7 = this.d;
        View e10 = (i7 < 0 || i7 >= this.b.size() || (rg0Var = (rg0) this.b.get(this.d)) == null) ? null : rg0Var.e();
        if (e10 != null) {
            e10.invalidate();
            View view = this.w;
            if (view != null && view != e10) {
                view.invalidate();
            }
            this.w = e10;
        }
    }

    public final boolean f() {
        if (!this.b.isEmpty()) {
            int size = this.b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((rg0) this.b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i7 = this.d;
                if (i7 < size) {
                    return false;
                }
                if (i7 <= size) {
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

    public final boolean g(rg0 rg0Var) {
        Layout a10;
        return d(rg0Var) == this.d && (a10 = rg0Var.a()) != null && this.e < a10.getLineCount();
    }

    public final boolean i(rg0 rg0Var) {
        int d = d(rg0Var);
        if (d < 0 || this.b.isEmpty()) {
            return false;
        }
        int i7 = this.d;
        return d < i7 || d <= i7;
    }

    public final boolean j(Layout layout) {
        int i7 = this.e + 1;
        this.e = i7;
        this.f = 0.0f;
        if (i7 >= layout.getLineCount()) {
            int i10 = this.d + 1;
            this.d = i10;
            this.e = 0;
            this.f = 0.0f;
            if (i10 >= this.b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f10;
        ArrayList arrayList2;
        boolean z9;
        if (!this.b.isEmpty() && this.d >= this.b.size()) {
            int size = this.b.size() - 1;
            this.d = size;
            Layout a10 = ((rg0) this.b.get(size)).a();
            int max = Math.max(0, a10 == null ? 0 : a10.getLineCount() - 1);
            this.e = max;
            this.f = a10 == null ? 0.0f : a10.getLineWidth(max);
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            f10 = 0.0f;
        } else {
            int i7 = this.d;
            f10 = 0.0f;
            while (i7 < this.b.size()) {
                Layout a11 = ((rg0) this.b.get(i7)).a();
                if (a11 != null) {
                    int min = i7 == this.d ? Math.min(Math.max(this.e, 0), Math.max(0, a11.getLineCount() - 1)) : 0;
                    for (int i10 = min; i10 < a11.getLineCount(); i10++) {
                        float h = h(a11, i10);
                        if (h > 0.001f) {
                            if (i7 == this.d && i10 == min) {
                                h -= this.f;
                                if (h <= 0.001f) {
                                }
                            }
                            f10 += h;
                        }
                    }
                }
                i7++;
            }
        }
        float L = org.telegram.messenger.g0.L(40.0f);
        if (f10 <= 0.001f) {
            this.s = L;
        } else {
            this.s = Math.max(L, f10 / 1.05f);
        }
        this.n = f();
        while (true) {
            arrayList2 = this.c;
            if (arrayList2.size() <= this.b.size()) {
                break;
            } else {
                a8.p0.z(1, arrayList2);
            }
        }
        int size2 = arrayList2.size();
        while (size2 < this.b.size()) {
            arrayList2.add(Float.valueOf((this.n || size2 <= this.d) ? 1.0f : 0.0f));
            size2++;
        }
        if (!this.n && !(z9 = this.h) && !z9) {
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

    public final void l(bi.ia iaVar) {
        this.x = iaVar;
    }
}
