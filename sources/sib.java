// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class sib {
    public uib a;
    public rib b;
    public TL_iv.pageTableCell c;
    public final int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r = -1;
    public final /* synthetic */ zib s;

    public sib(zib zibVar, int i) {
        this.s = zibVar;
        this.d = i;
    }

    public final void a(Canvas canvas, View view, boolean z) {
        Paint paint;
        Paint paint2;
        int i;
        float f;
        RectF rectF;
        int i2;
        int i3;
        amb ambVar;
        Canvas canvas2 = canvas;
        if (this.c != null) {
            int i4 = this.p + this.k;
            zib zibVar = this.s;
            int i5 = zibVar.E;
            Path path = zibVar.M;
            float[] fArr = zibVar.O;
            yib yibVar = zibVar.P;
            RectF rectF2 = zibVar.N;
            boolean z2 = false;
            boolean z3 = i4 == i5;
            boolean z4 = this.q + this.l == zibVar.F;
            int L = hl.L(8.0f);
            boolean z5 = this.c.header;
            if (z5 || (zibVar.I && this.a.a.b.a % 2 == 0)) {
                int i6 = this.p;
                if (i6 == 0 && this.q == 0) {
                    float f2 = L;
                    fArr[1] = f2;
                    fArr[0] = f2;
                    z2 = true;
                } else {
                    fArr[1] = 0.0f;
                    fArr[0] = 0.0f;
                }
                if (z3 && this.q == 0) {
                    float f3 = L;
                    fArr[3] = f3;
                    fArr[2] = f3;
                    z2 = true;
                } else {
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                }
                if (z3 && z4) {
                    float f4 = L;
                    fArr[5] = f4;
                    fArr[4] = f4;
                    z2 = true;
                } else {
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                }
                if (i6 == 0 && z4) {
                    float f5 = L;
                    fArr[7] = f5;
                    fArr[6] = f5;
                    z2 = true;
                } else {
                    fArr[7] = 0.0f;
                    fArr[6] = 0.0f;
                }
                if (z2) {
                    rectF2.set(i6, this.q, i6 + this.k, r3 + this.l);
                    path.reset();
                    path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                    if (this.c.header) {
                        canvas2.drawPath(path, yibVar.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, yibVar.getStripPaint());
                    }
                } else {
                    int i7 = this.q;
                    int i8 = this.k;
                    if (z5) {
                        canvas2.drawRect(i6, i7, i6 + i8, i7 + this.l, yibVar.getHeaderPaint());
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(i6, i7, i6 + i8, this.l + i7, yibVar.getStripPaint());
                    }
                }
            }
            if (z && this.b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.r >= 0 && (ambVar = zibVar.a) != null) {
                    ambVar.Y(canvas2, (zlb) zibVar.getParent().getParent(), this.r);
                }
                this.b.d(canvas2, view);
                canvas2.restore();
            }
            if (zibVar.H) {
                Paint linePaint = yibVar.getLinePaint();
                Paint linePaint2 = yibVar.getLinePaint();
                float strokeWidth = linePaint.getStrokeWidth() / 2.0f;
                float strokeWidth2 = linePaint2.getStrokeWidth() / 2.0f;
                int i9 = this.p;
                int i10 = this.q;
                int i11 = this.l;
                if (i9 == 0) {
                    float f6 = i10;
                    float f7 = i11 + i10;
                    if (i10 == 0) {
                        f6 += L;
                    }
                    float f8 = f6;
                    if (f7 == zibVar.F) {
                        f7 -= L;
                    }
                    float f9 = i9 + strokeWidth;
                    canvas2.drawLine(f9, f8, f9, f7, linePaint);
                    paint = linePaint;
                    paint2 = linePaint2;
                } else {
                    paint = linePaint;
                    float f10 = i9 - strokeWidth2;
                    paint2 = linePaint2;
                    canvas.drawLine(f10, i10, f10, i10 + i11, paint2);
                }
                int i12 = this.q;
                int i13 = this.p;
                int i14 = this.k;
                if (i12 == 0) {
                    float f11 = i13;
                    float f12 = i14 + i13;
                    if (i13 == 0) {
                        f11 += L;
                    }
                    float f13 = f11;
                    if (f12 == zibVar.E) {
                        f12 -= L;
                    }
                    float f14 = f12;
                    float f15 = i12 + strokeWidth;
                    canvas.drawLine(f13, f15, f14, f15, paint);
                } else {
                    float f16 = i12 - strokeWidth2;
                    canvas.drawLine(i13, f16, i14 + i13, f16, paint2);
                }
                if (z3 && (i = this.q) == 0) {
                    f = i + L;
                } else {
                    i = this.q;
                    f = i - strokeWidth;
                }
                float f17 = f;
                float f18 = (this.p + this.k) - strokeWidth;
                Paint paint3 = paint;
                canvas.drawLine(f18, f17, f18, (z3 && z4) ? (i + this.l) - L : (i + this.l) - strokeWidth, paint3);
                int i15 = this.p;
                float f19 = (this.q + this.l) - strokeWidth;
                canvas.drawLine((i15 == 0 && z4) ? i15 + L : i15 - strokeWidth, f19, (z3 && z4) ? (i15 + this.k) - L : (i15 + this.k) - strokeWidth, f19, paint3);
                int i16 = this.p;
                if (i16 == 0 && (i3 = this.q) == 0) {
                    float f20 = i16 + strokeWidth;
                    float f21 = i3 + strokeWidth;
                    float f22 = L << 1;
                    rectF2.set(f20, f21, f20 + f22, f22 + f21);
                    rectF = rectF2;
                    canvas.drawArc(rectF, -180.0f, 90.0f, false, paint3);
                } else {
                    rectF = rectF2;
                }
                if (z3 && (i2 = this.q) == 0) {
                    float f23 = (this.p + this.k) - strokeWidth;
                    float f24 = L << 1;
                    float f25 = i2 + strokeWidth;
                    rectF.set(f23 - f24, f25, f23, f24 + f25);
                    canvas.drawArc(rectF, 0.0f, -90.0f, false, paint3);
                }
                int i17 = this.p;
                if (i17 == 0 && z4) {
                    float f26 = i17 + strokeWidth;
                    float f27 = (this.q + this.l) - strokeWidth;
                    float f28 = L << 1;
                    rectF.set(f26, f27 - f28, f28 + f26, f27);
                    canvas.drawArc(rectF, 180.0f, -90.0f, false, paint3);
                }
                if (z3 && z4) {
                    float f29 = (this.p + this.k) - strokeWidth;
                    float f30 = L << 1;
                    float f31 = (this.q + this.l) - strokeWidth;
                    rectF.set(f29 - f30, f31 - f30, f29, f31);
                    canvas.drawArc(rectF, 0.0f, 90.0f, false, paint3);
                }
            }
        }
    }

    public final int b() {
        return this.p + this.g;
    }

    public final int c() {
        return this.q + this.h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x002b, code lost:
    
        if (r4.align_right == false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, int i2, boolean z) {
        this.k = i;
        this.l = i2;
        if (z) {
            this.m = i2;
        }
        if (this.c != null) {
            rib ribVar = this.b;
            if (ribVar != null) {
                Layout a = ribVar.a();
                int lineCount = a != null ? a.getLineCount() : 0;
                if (!z) {
                    if (lineCount <= 1) {
                        if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.c;
                            if (!pagetablecell.align_center) {
                            }
                        }
                    }
                    zib zibVar = this.s;
                    e(zibVar.P.c(this.c, this.k - (zibVar.w << 1)));
                    this.m = this.f + zibVar.r + zibVar.s;
                }
                f();
            }
            g();
        }
    }

    public final void e(rib ribVar) {
        this.b = ribVar;
        Layout a = ribVar != null ? ribVar.a() : null;
        int i = 0;
        if (a == null) {
            this.i = 0;
            this.e = 0;
            this.f = 0;
            return;
        }
        this.e = 0;
        this.i = 0;
        int lineCount = a.getLineCount();
        while (i < lineCount) {
            float lineLeft = a.getLineLeft(i);
            this.i = i == 0 ? (int) Math.ceil(lineLeft) : Math.min(this.i, (int) Math.ceil(lineLeft));
            this.e = (int) Math.ceil(Math.max(a.getLineWidth(i), this.e));
            i++;
        }
        this.f = a.getHeight();
    }

    public final void f() {
        int i = -this.i;
        this.g = i;
        TL_iv.pageTableCell pagetablecell = this.c;
        boolean z = pagetablecell.align_right;
        zib zibVar = this.s;
        if (z) {
            this.g = ((this.k - this.e) - zibVar.w) + i;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i;
        } else {
            this.g = i + zibVar.w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z = pagetablecell.valign_bottom;
        zib zibVar = this.s;
        if (z) {
            this.h = (this.l - this.f) - zibVar.s;
        } else {
            this.h = zibVar.r;
        }
    }
}
