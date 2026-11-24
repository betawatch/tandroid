// default package

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.text.Layout;
import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class xeb {
    public zeb a;
    public web b;
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
    public final /* synthetic */ efb s;

    public xeb(efb efbVar, int i) {
        this.s = efbVar;
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
        fib fibVar;
        Canvas canvas2 = canvas;
        if (this.c != null) {
            int i4 = this.p + this.k;
            efb efbVar = this.s;
            int i5 = efbVar.E;
            Path path = efbVar.M;
            float[] fArr = efbVar.O;
            dfb dfbVar = efbVar.P;
            RectF rectF2 = efbVar.N;
            boolean z2 = false;
            boolean z3 = i4 == i5;
            boolean z4 = this.q + this.l == efbVar.F;
            int L = gl.L(8.0f);
            boolean z5 = this.c.header;
            if (z5 || (efbVar.I && this.a.a.b.a % 2 == 0)) {
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
                        canvas2.drawPath(path, dfbVar.getHeaderPaint());
                    } else {
                        canvas2.drawPath(path, dfbVar.getStripPaint());
                    }
                } else {
                    int i7 = this.q;
                    int i8 = this.k;
                    if (z5) {
                        canvas2.drawRect(i6, i7, i6 + i8, i7 + this.l, dfbVar.getHeaderPaint());
                        canvas2 = canvas;
                    } else {
                        canvas2 = canvas;
                        canvas2.drawRect(i6, i7, i6 + i8, this.l + i7, dfbVar.getStripPaint());
                    }
                }
            }
            if (z && this.b != null) {
                canvas2.save();
                canvas2.translate(b(), c());
                if (this.r >= 0 && (fibVar = efbVar.a) != null) {
                    fibVar.Y(canvas2, (eib) efbVar.getParent().getParent(), this.r);
                }
                this.b.d(canvas2, view);
                canvas2.restore();
            }
            if (efbVar.H) {
                Paint linePaint = dfbVar.getLinePaint();
                Paint linePaint2 = dfbVar.getLinePaint();
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
                    if (f7 == efbVar.F) {
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
                    if (f12 == efbVar.E) {
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
            web webVar = this.b;
            if (webVar != null) {
                Layout a = webVar.a();
                int lineCount = a != null ? a.getLineCount() : 0;
                if (!z) {
                    if (lineCount <= 1) {
                        if (lineCount > 0) {
                            TL_iv.pageTableCell pagetablecell = this.c;
                            if (!pagetablecell.align_center) {
                            }
                        }
                    }
                    efb efbVar = this.s;
                    e(efbVar.P.c(this.c, this.k - (efbVar.w << 1)));
                    this.m = this.f + efbVar.r + efbVar.s;
                }
                f();
            }
            g();
        }
    }

    public final void e(web webVar) {
        this.b = webVar;
        Layout a = webVar != null ? webVar.a() : null;
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
        efb efbVar = this.s;
        if (z) {
            this.g = ((this.k - this.e) - efbVar.w) + i;
        } else if (pagetablecell.align_center) {
            this.g = Math.round((this.k - this.e) / 2.0f) + i;
        } else {
            this.g = i + efbVar.w;
        }
    }

    public final void g() {
        TL_iv.pageTableCell pagetablecell = this.c;
        if (pagetablecell.valign_middle) {
            this.h = (this.l - this.f) / 2;
            return;
        }
        boolean z = pagetablecell.valign_bottom;
        efb efbVar = this.s;
        if (z) {
            this.h = (this.l - this.f) - efbVar.s;
        } else {
            this.h = efbVar.r;
        }
    }
}
