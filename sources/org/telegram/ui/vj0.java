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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vj0 implements Choreographer.FrameCallback {
    public static final Matrix E = new Matrix();
    public static final Paint x;
    public static final LinearGradient y;
    public final Choreographer a = Choreographer.getInstance();
    public List b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f = 0.0f;
    public boolean h = false;
    public boolean n = true;
    public long r = 0;
    public float s = AndroidUtilities.dp(40.0f);
    public View v;
    public org.telegram.messenger.t5 w;

    static {
        Paint paint = new Paint(1);
        x = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        y = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i10, float f7, uj0 uj0Var) {
        if (layout == null) {
            return;
        }
        int lineCount = layout.getLineCount();
        if (i10 < 0 || i10 >= lineCount) {
            return;
        }
        uj0 iuVar = uj0Var != null ? uj0Var : new iu(layout, 24);
        int width = layout.getWidth();
        layout.getHeight();
        int lineTop = layout.getLineTop(i10);
        int lineBottom = layout.getLineBottom(i10);
        if (lineTop > 0) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, width, lineTop);
            iuVar.b(canvas);
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
        float a2 = w7.q.a(f7, 0.0f, f10);
        float f11 = a2 / f10;
        if (a2 <= 0.0f) {
            return;
        }
        if (a2 >= f10) {
            canvas.save();
            canvas.clipRect(0.0f, lineTop, width, lineBottom);
            iuVar.b(canvas);
            canvas.restore();
            return;
        }
        float lerp = AndroidUtilities.lerp(-AndroidUtilities.dp(50.0f), f10, f11);
        AndroidUtilities.dp(50.0f);
        float f12 = lineTop;
        float f13 = lineBottom;
        int saveLayer = canvas.saveLayer(min, f12, max, f13, null);
        canvas.save();
        canvas.clipRect(min, f12, max, f13);
        iuVar.b(canvas);
        canvas.restore();
        Matrix matrix = E;
        matrix.reset();
        if (paragraphDirection >= 0) {
            matrix.setScale(AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(lerp, 0.0f);
        } else {
            matrix.setScale(-AndroidUtilities.dp(50.0f), 1.0f);
            matrix.postTranslate(f10 - lerp, 0.0f);
        }
        y.setLocalMatrix(matrix);
        canvas.drawRect(min, f12, max, f13, x);
        canvas.restoreToCount(saveLayer);
    }

    public static float i(Layout layout, int i10) {
        float lineRight = layout.getLineRight(i10) - layout.getLineLeft(i10);
        return lineRight >= 0.0f ? lineRight : -lineRight;
    }

    public final void a(float f7) {
        int size = this.b.size();
        View view = null;
        int i10 = 0;
        while (i10 < size) {
            tj0 tj0Var = (tj0) this.b.get(i10);
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
            View parentView = tj0Var.getParentView();
            if (parentView != null && parentView != view) {
                if (parentView.getAlpha() != f10) {
                    parentView.setAlpha(f10);
                }
                view = parentView;
            }
            i10++;
        }
    }

    public final float c(tj0 tj0Var) {
        int d = d(tj0Var);
        if (d < 0) {
            return 1.0f;
        }
        ArrayList arrayList = this.c;
        if (d >= arrayList.size()) {
            return 1.0f;
        }
        return ((Float) arrayList.get(d)).floatValue();
    }

    public final int d(tj0 tj0Var) {
        int size = this.b.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.b.get(i10) == tj0Var) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j3) {
        if (this.h) {
            float f7 = 0.0f;
            if (this.r != 0) {
                float f10 = (j3 - r0) * 1.0E-9f;
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
                        Layout layout = ((tj0) this.b.get(this.d)).getLayout();
                        if (layout != null && layout.getLineCount() != 0) {
                            if (this.e >= layout.getLineCount()) {
                                int lineCount = layout.getLineCount() - 1;
                                this.e = lineCount;
                                this.f = i(layout, lineCount);
                            }
                            float i10 = i(layout, this.e);
                            if (i10 <= 0.001f) {
                                if (k(layout)) {
                                    break;
                                }
                            } else {
                                float f12 = this.f;
                                float f13 = i10 - f12;
                                if (f13 <= 0.001f) {
                                    if (k(layout)) {
                                        break;
                                    }
                                } else {
                                    if (f11 < f13) {
                                        f13 = f11;
                                    }
                                    float f14 = f12 + f13;
                                    this.f = f14;
                                    f11 -= f13;
                                    if (i10 - f14 <= 0.001f && !k(layout)) {
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
            this.r = j3;
            a(f7);
            e();
            if (!this.n) {
                this.a.postFrameCallback(this);
                return;
            }
            this.h = false;
            ArrayList arrayList = this.c;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.set(i11, Float.valueOf(1.0f));
            }
            int size2 = this.b.size();
            View view = null;
            for (int i12 = 0; i12 < size2; i12++) {
                View parentView = ((tj0) this.b.get(i12)).getParentView();
                if (parentView != null && parentView != view) {
                    if (parentView.getAlpha() != 1.0f) {
                        parentView.setAlpha(1.0f);
                    }
                    view = parentView;
                }
            }
            org.telegram.messenger.t5 t5Var = this.w;
            if (t5Var != null) {
                t5Var.run();
                this.w = null;
            }
        }
    }

    public final void e() {
        tj0 tj0Var;
        int i10 = this.d;
        View parentView = (i10 < 0 || i10 >= this.b.size() || (tj0Var = (tj0) this.b.get(this.d)) == null) ? null : tj0Var.getParentView();
        if (parentView != null) {
            parentView.invalidate();
            View view = this.v;
            if (view != null && view != parentView) {
                view.invalidate();
            }
            this.v = parentView;
        }
    }

    public final boolean f() {
        if (!this.b.isEmpty()) {
            int size = this.b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((tj0) this.b.get(size)).getLayout();
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
                    float i11 = i(layout, lineCount);
                    if (this.e < lineCount || this.f < i11 - 0.001f) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean g(tj0 tj0Var) {
        Layout layout;
        return d(tj0Var) == this.d && (layout = tj0Var.getLayout()) != null && this.e < layout.getLineCount();
    }

    public final boolean h() {
        return this.h;
    }

    public final boolean j(tj0 tj0Var) {
        int d = d(tj0Var);
        if (d < 0 || this.b.isEmpty()) {
            return false;
        }
        int i10 = this.d;
        return d < i10 || d <= i10;
    }

    public final boolean k(Layout layout) {
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

    public final void l(List list) {
        float f7;
        ArrayList arrayList;
        boolean z10;
        if (!this.b.isEmpty() && this.d >= this.b.size()) {
            int size = this.b.size() - 1;
            this.d = size;
            Layout layout = ((tj0) this.b.get(size)).getLayout();
            int max = Math.max(0, layout == null ? 0 : layout.getLineCount() - 1);
            this.e = max;
            this.f = layout == null ? 0.0f : layout.getLineWidth(max);
        }
        if (list == null) {
            list = new ArrayList();
        }
        this.b = list;
        if (list.isEmpty()) {
            f7 = 0.0f;
        } else {
            int i10 = this.d;
            f7 = 0.0f;
            while (i10 < this.b.size()) {
                Layout layout2 = ((tj0) this.b.get(i10)).getLayout();
                if (layout2 != null) {
                    int min = i10 == this.d ? Math.min(Math.max(this.e, 0), Math.max(0, layout2.getLineCount() - 1)) : 0;
                    for (int i11 = min; i11 < layout2.getLineCount(); i11++) {
                        float i12 = i(layout2, i11);
                        if (i12 > 0.001f) {
                            if (i10 == this.d && i11 == min) {
                                i12 -= this.f;
                                if (i12 <= 0.001f) {
                                }
                            }
                            f7 += i12;
                        }
                    }
                }
                i10++;
            }
        }
        float dp = AndroidUtilities.dp(40.0f);
        if (f7 <= 0.001f) {
            this.s = dp;
        } else {
            this.s = Math.max(dp, f7 / 1.05f);
        }
        this.n = f();
        while (true) {
            arrayList = this.c;
            if (arrayList.size() <= this.b.size()) {
                break;
            } else {
                a4.a.x(1, arrayList);
            }
        }
        int size2 = arrayList.size();
        while (size2 < this.b.size()) {
            arrayList.add(Float.valueOf((this.n || size2 <= this.d) ? 1.0f : 0.0f));
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

    public final void m(org.telegram.messenger.t5 t5Var) {
        this.w = t5Var;
    }
}
