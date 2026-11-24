// default package

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.TextPaint;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u62 {
    public TextPaint B;
    public TextPaint C;
    public final /* synthetic */ v62 O;
    public v62 a;
    public jo6 b;
    public ImageReceiver c;
    public ImageReceiver d;
    public boolean e;
    public float l;
    public float m;
    public float n;
    public float o;
    public qna s;
    public Bitmap v;
    public RectF f = null;
    public final RectF g = new RectF();
    public long h = 0;
    public int i = 0;
    public float j = 1.0f;
    public float k = 0.0f;
    public RectF p = null;
    public final RectF q = new RectF();
    public String r = null;
    public final Path t = new Path();
    public final float[] u = new float[8];
    public float w = 1.0f;
    public final Paint x = new Paint(1);
    public final RectF y = new RectF();
    public final Paint z = new Paint(1);
    public final Paint A = new Paint(1);
    public final Paint D = new Paint(1);
    public Bitmap E = null;
    public String F = null;
    public Bitmap G = null;
    public String H = null;
    public final Rect I = new Rect();
    public final Rect J = new Rect();
    public final Rect K = new Rect();
    public final Rect L = new Rect();
    public float M = 1.0f;
    public long N = 0;

    public u62(v62 v62Var) {
        this.O = v62Var;
        this.a = v62Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x04fb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0500 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0502 A[ADDED_TO_REGION, ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x03e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Canvas canvas, boolean z) {
        float f;
        w62 w62Var;
        char c;
        char c2;
        float f2;
        float f3;
        String str;
        int indexOf;
        String str2;
        boolean z2;
        float f4;
        float L;
        float L2;
        float f5;
        float f6;
        boolean z3;
        Bitmap bitmap;
        Canvas canvas2;
        String str3;
        float f7;
        String str4;
        String str5;
        char c3;
        char c4;
        qna qnaVar;
        RectF rectF;
        float c5 = c();
        if (this.g == null || this.c == null) {
            return false;
        }
        v62 v62Var = this.O;
        w62 w62Var2 = v62Var.z;
        x62 x62Var = w62Var2.Q;
        float f8 = w62Var2.Q.K == this ? w62Var2.H : 0.0f;
        float R1 = gm.R1(this.j, this.k, c5);
        if (R1 <= 0.0f) {
            return false;
        }
        RectF b = b();
        float L3 = gm.L(gda.U0 - 1);
        RectF rectF2 = this.q;
        float f9 = rectF2.left;
        float f10 = rectF2.top;
        float f11 = rectF2.right;
        float f12 = rectF2.bottom;
        if (c5 < 1.0f && (rectF = this.p) != null) {
            f9 = gm.R1(rectF.left, f9, c5);
            f10 = gm.R1(this.p.top, f10, c5);
            f11 = gm.R1(this.p.right, f11, c5);
            f12 = gm.R1(this.p.bottom, f12, c5);
        }
        float R12 = gm.R1(f9, L3, f8);
        float R13 = gm.R1(f10, L3, f8);
        float R14 = gm.R1(f11, L3, f8);
        float R15 = gm.R1(f12, L3, f8);
        if (z) {
            canvas.save();
            canvas.translate(-b.centerX(), -b.centerY());
        }
        int i = (int) R12;
        int i2 = (int) R13;
        int i3 = (int) R14;
        int i4 = (int) R15;
        this.c.r0(i, i2, i3, i4);
        this.c.i0(b.left, b.top, b.width(), b.height());
        this.c.setAlpha(R1);
        this.c.h(canvas, null);
        jo6 jo6Var = this.b;
        float[] fArr = this.u;
        Path path = this.t;
        if (jo6Var == null) {
            f = R13;
            w62Var = w62Var2;
            c = 3;
        } else if (!jo6Var.M || jo6Var.R) {
            f = R13;
            w62Var = w62Var2;
            c = 3;
        } else {
            if (this.e || this.d.n() != null || this.c.n() == null) {
                c3 = 2;
                if (!this.e && this.d.n() != null) {
                    c4 = 1;
                    this.e = true;
                    fArr[c4] = R12;
                    fArr[0] = R12;
                    fArr[3] = R13;
                    fArr[c3] = R13;
                    fArr[5] = R14;
                    fArr[4] = R14;
                    fArr[7] = R15;
                    fArr[6] = R15;
                    canvas.save();
                    path.rewind();
                    Path.Direction direction = Path.Direction.CW;
                    path.addRoundRect(b, fArr, direction);
                    canvas.clipPath(path);
                    if (this.l == 0.0f) {
                        path.rewind();
                        f = R13;
                        path.addCircle(this.m, this.n, this.l * this.o, direction);
                        canvas.clipPath(path, Region.Op.DIFFERENCE);
                    } else {
                        f = R13;
                    }
                    this.d.r0(i, i2, i3, i4);
                    this.d.i0(b.left, b.top, b.width(), b.height());
                    this.d.setAlpha(R1);
                    this.d.h(canvas, null);
                    qnaVar = this.s;
                    if (qnaVar == null) {
                        qnaVar = qna.e(w62Var2);
                        this.s = qnaVar;
                    }
                    int width = w62Var2.getWidth();
                    int height = w62Var2.getHeight();
                    w62Var = w62Var2;
                    c = 3;
                    c2 = c3;
                    qnaVar.c(canvas, w62Var, width, height, 1.0f, false);
                    canvas.restore();
                    w62Var.invalidate();
                    w62Var.invalidate();
                    f2 = this.w;
                    Bitmap bitmap2 = this.v;
                    if (f2 == 1.0f) {
                        f3 = 255.0f;
                        if (bitmap2 != null) {
                            bitmap2.recycle();
                            str = null;
                            this.v = null;
                            w62Var.invalidate();
                            indexOf = ((ArrayList) v62Var.k.f).indexOf(this.b) + v62Var.b;
                            if (indexOf < 0) {
                                str2 = (indexOf + 1) + "";
                            } else {
                                str2 = str;
                            }
                            float f13 = !this.c.R0 ? 1.0f : 0.0f;
                            z2 = Math.abs(this.M - f13) <= 0.01f;
                            if (z2) {
                                f4 = f3;
                            } else {
                                f4 = f3;
                                long min = Math.min(17L, SystemClock.elapsedRealtime() - this.N);
                                this.N = SystemClock.elapsedRealtime();
                                float f14 = min / 100.0f;
                                float f15 = this.M;
                                if (f13 < f15) {
                                    this.M = Math.max(0.0f, f15 - f14);
                                } else {
                                    this.M = Math.min(1.0f, f15 + f14);
                                }
                            }
                            L = b.top + gm.L(10.0f);
                            L2 = b.right - gm.L(10.0f);
                            float f16 = this.M * R1;
                            int L4 = gm.L(12.0f);
                            int L5 = gm.L(1.2f);
                            int i5 = (L4 + L5) << 1;
                            int i6 = L5 << 2;
                            float f17 = f4;
                            Rect rect = this.I;
                            if (str2 == null && (this.E == null || (str5 = this.F) == null || !str5.equals(str2))) {
                                if (this.E == null) {
                                    this.E = Bitmap.createBitmap(i5, i5, Bitmap.Config.ARGB_8888);
                                }
                                Canvas canvas3 = new Canvas(this.E);
                                canvas3.drawColor(0);
                                if (this.B == null) {
                                    f5 = L;
                                    TextPaint textPaint = new TextPaint(1);
                                    this.B = textPaint;
                                    textPaint.setTypeface(gm.o());
                                } else {
                                    f5 = L;
                                }
                                TextPaint textPaint2 = this.B;
                                int i7 = cmb.U9;
                                f6 = L2;
                                textPaint2.setColor(cmb.v0(i7, x62Var.a));
                                int length = str2.length();
                                float f18 = (length == 0 || length == 1 || length == 2) ? 14.0f : length != 3 ? 8.0f : 10.0f;
                                this.B.setTextSize(gm.L(f18));
                                float f19 = i5 / 2.0f;
                                z3 = z2;
                                int v0 = cmb.v0(cmb.V9, x62Var.a);
                                Paint paint = this.z;
                                paint.setColor(v0);
                                float f20 = (int) f19;
                                float f21 = L4;
                                canvas3.drawCircle(f20, f20, f21, paint);
                                int R0 = gm.R0(1.0f, 1.0f, -1, cmb.v0(i7, x62Var.a));
                                Paint paint2 = this.A;
                                paint2.setColor(R0);
                                paint2.setStyle(Paint.Style.STROKE);
                                paint2.setStrokeWidth(L5);
                                canvas3.drawCircle(f20, f20, f21, paint2);
                                canvas3.drawText(str2, f19 - (this.B.measureText(str2) / 2.0f), f19 + gm.L(1.0f) + gm.L(f18 / 4.0f), this.B);
                                rect.set(0, 0, i5, i5);
                                this.F = str2;
                            } else {
                                f5 = L;
                                f6 = L2;
                                z3 = z2;
                            }
                            bitmap = this.E;
                            Paint paint3 = this.D;
                            if (bitmap == null) {
                                float f22 = i5 * R1;
                                float f23 = i6;
                                float f24 = f5 - f23;
                                int i8 = (int) (f24 + f22);
                                Rect rect2 = this.J;
                                rect2.set((int) ((f6 - f22) + f23), (int) f24, (int) (f6 + f23), i8);
                                paint3.setAlpha((int) (f16 * f17));
                                canvas2 = canvas;
                                canvas2.drawBitmap(this.E, rect, rect2, paint3);
                            } else {
                                canvas2 = canvas;
                            }
                            float L6 = b.left + gm.L(4.0f);
                            float L7 = b.bottom - gm.L(4.0f);
                            str3 = this.r;
                            float f25 = this.M * R1;
                            if (str3 != null) {
                                Bitmap bitmap3 = this.G;
                                Rect rect3 = this.K;
                                if (bitmap3 == null || (str4 = this.H) == null || !str4.equals(str3)) {
                                    if (this.C == null) {
                                        TextPaint textPaint3 = new TextPaint(1);
                                        this.C = textPaint3;
                                        textPaint3.setTypeface(gm.o());
                                        this.C.setColor(-1);
                                    }
                                    float L8 = gm.L(12.0f);
                                    this.C.setTextSize(L8);
                                    float intrinsicWidth = x62Var.O.getIntrinsicWidth() + this.C.measureText(str3) + gm.L(15.0f);
                                    Drawable drawable = x62Var.O;
                                    float max = Math.max(L8, gm.L(4.0f) + x62Var.O.getIntrinsicHeight());
                                    int ceil = (int) Math.ceil(intrinsicWidth);
                                    int ceil2 = (int) Math.ceil(max);
                                    Bitmap bitmap4 = this.G;
                                    if (bitmap4 == null || bitmap4.getWidth() != ceil || this.G.getHeight() != ceil2) {
                                        Bitmap bitmap5 = this.G;
                                        if (bitmap5 != null) {
                                            bitmap5.recycle();
                                        }
                                        this.G = Bitmap.createBitmap(ceil, ceil2, Bitmap.Config.ARGB_8888);
                                    }
                                    f7 = f25;
                                    Canvas canvas4 = new Canvas(this.G);
                                    RectF rectF3 = gm.P;
                                    rectF3.set(0.0f, 0.0f, intrinsicWidth, max);
                                    canvas4.drawRoundRect(rectF3, gm.L(4.0f), gm.L(4.0f), cmb.h2);
                                    int L9 = gm.L(5.0f);
                                    int intrinsicHeight = (int) ((max - drawable.getIntrinsicHeight()) / 2.0f);
                                    drawable.setBounds(L9, intrinsicHeight, drawable.getIntrinsicWidth() + L9, drawable.getIntrinsicHeight() + intrinsicHeight);
                                    drawable.draw(canvas4);
                                    canvas4.drawText(str3, gm.L(18.0f), L8 + gm.L(-0.7f), this.C);
                                    rect3.set(0, 0, ceil, ceil2);
                                    this.H = str3;
                                } else {
                                    f7 = f25;
                                }
                                int width2 = this.G.getWidth();
                                Rect rect4 = this.L;
                                rect4.set((int) L6, (int) (L7 - (this.G.getHeight() * R1)), (int) ((width2 * R1) + L6), (int) L7);
                                paint3.setAlpha((int) (f7 * f17));
                                canvas2.drawBitmap(this.G, rect3, rect4, paint3);
                            }
                            if (z) {
                                canvas2.restore();
                            }
                            return c5 < 1.0f || z3;
                        }
                    } else if (bitmap2 != null) {
                        fArr[1] = R12;
                        fArr[0] = R12;
                        fArr[c] = f;
                        fArr[c2] = f;
                        fArr[5] = R14;
                        fArr[4] = R14;
                        fArr[7] = R15;
                        fArr[6] = R15;
                        canvas.save();
                        path.rewind();
                        path.addRoundRect(b, fArr, Path.Direction.CW);
                        canvas.clipPath(path);
                        f3 = 255.0f;
                        float A = kt6.A(Math.min(16L, SystemClock.elapsedRealtime() - this.h), 250.0f, this.w, 1.0f);
                        this.w = A;
                        Paint paint4 = this.x;
                        paint4.setAlpha((int) ((1.0f - A) * 255.0f));
                        canvas.drawBitmap(this.v, b.left, b.top, paint4);
                        canvas.restore();
                        w62Var.invalidate();
                    } else {
                        f3 = 255.0f;
                    }
                    str = null;
                    indexOf = ((ArrayList) v62Var.k.f).indexOf(this.b) + v62Var.b;
                    if (indexOf < 0) {
                    }
                    if (!this.c.R0) {
                    }
                    if (Math.abs(this.M - f13) <= 0.01f) {
                    }
                    if (z2) {
                    }
                    L = b.top + gm.L(10.0f);
                    L2 = b.right - gm.L(10.0f);
                    float f162 = this.M * R1;
                    int L42 = gm.L(12.0f);
                    int L52 = gm.L(1.2f);
                    int i52 = (L42 + L52) << 1;
                    int i62 = L52 << 2;
                    float f172 = f4;
                    Rect rect5 = this.I;
                    if (str2 == null) {
                    }
                    f5 = L;
                    f6 = L2;
                    z3 = z2;
                    bitmap = this.E;
                    Paint paint32 = this.D;
                    if (bitmap == null) {
                    }
                    float L62 = b.left + gm.L(4.0f);
                    float L72 = b.bottom - gm.L(4.0f);
                    str3 = this.r;
                    float f252 = this.M * R1;
                    if (str3 != null) {
                    }
                    if (z) {
                    }
                    if (c5 < 1.0f) {
                        return true;
                    }
                }
            } else {
                this.e = true;
                c3 = 2;
                this.d.f0(Utilities.D(this.c.n(), false));
            }
            c4 = 1;
            fArr[c4] = R12;
            fArr[0] = R12;
            fArr[3] = R13;
            fArr[c3] = R13;
            fArr[5] = R14;
            fArr[4] = R14;
            fArr[7] = R15;
            fArr[6] = R15;
            canvas.save();
            path.rewind();
            Path.Direction direction2 = Path.Direction.CW;
            path.addRoundRect(b, fArr, direction2);
            canvas.clipPath(path);
            if (this.l == 0.0f) {
            }
            this.d.r0(i, i2, i3, i4);
            this.d.i0(b.left, b.top, b.width(), b.height());
            this.d.setAlpha(R1);
            this.d.h(canvas, null);
            qnaVar = this.s;
            if (qnaVar == null) {
            }
            int width3 = w62Var2.getWidth();
            int height2 = w62Var2.getHeight();
            w62Var = w62Var2;
            c = 3;
            c2 = c3;
            qnaVar.c(canvas, w62Var, width3, height2, 1.0f, false);
            canvas.restore();
            w62Var.invalidate();
            w62Var.invalidate();
            f2 = this.w;
            Bitmap bitmap22 = this.v;
            if (f2 == 1.0f) {
            }
            str = null;
            indexOf = ((ArrayList) v62Var.k.f).indexOf(this.b) + v62Var.b;
            if (indexOf < 0) {
            }
            if (!this.c.R0) {
            }
            if (Math.abs(this.M - f13) <= 0.01f) {
            }
            if (z2) {
            }
            L = b.top + gm.L(10.0f);
            L2 = b.right - gm.L(10.0f);
            float f1622 = this.M * R1;
            int L422 = gm.L(12.0f);
            int L522 = gm.L(1.2f);
            int i522 = (L422 + L522) << 1;
            int i622 = L522 << 2;
            float f1722 = f4;
            Rect rect52 = this.I;
            if (str2 == null) {
            }
            f5 = L;
            f6 = L2;
            z3 = z2;
            bitmap = this.E;
            Paint paint322 = this.D;
            if (bitmap == null) {
            }
            float L622 = b.left + gm.L(4.0f);
            float L722 = b.bottom - gm.L(4.0f);
            str3 = this.r;
            float f2522 = this.M * R1;
            if (str3 != null) {
            }
            if (z) {
            }
            if (c5 < 1.0f) {
            }
        }
        c2 = 2;
        f2 = this.w;
        Bitmap bitmap222 = this.v;
        if (f2 == 1.0f) {
        }
        str = null;
        indexOf = ((ArrayList) v62Var.k.f).indexOf(this.b) + v62Var.b;
        if (indexOf < 0) {
        }
        if (!this.c.R0) {
        }
        if (Math.abs(this.M - f13) <= 0.01f) {
        }
        if (z2) {
        }
        L = b.top + gm.L(10.0f);
        L2 = b.right - gm.L(10.0f);
        float f16222 = this.M * R1;
        int L4222 = gm.L(12.0f);
        int L5222 = gm.L(1.2f);
        int i5222 = (L4222 + L5222) << 1;
        int i6222 = L5222 << 2;
        float f17222 = f4;
        Rect rect522 = this.I;
        if (str2 == null) {
        }
        f5 = L;
        f6 = L2;
        z3 = z2;
        bitmap = this.E;
        Paint paint3222 = this.D;
        if (bitmap == null) {
        }
        float L6222 = b.left + gm.L(4.0f);
        float L7222 = b.bottom - gm.L(4.0f);
        str3 = this.r;
        float f25222 = this.M * R1;
        if (str3 != null) {
        }
        if (z) {
        }
        if (c5 < 1.0f) {
        }
    }

    public final RectF b() {
        float f = 0.0f;
        if (this.g == null || this.c == null) {
            RectF rectF = this.y;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF;
        }
        w62 w62Var = this.O.z;
        u62 u62Var = w62Var.Q.K;
        if (u62Var != null && u62Var.b == this.b) {
            f = w62Var.H;
        }
        float R1 = (((1.0f - f) * 0.2f) + 0.8f) * gm.R1(this.j, this.k, c());
        RectF e = e(c());
        float f2 = 1.0f - R1;
        float f3 = R1 + 1.0f;
        e.set(kt6.d(e.width(), f2, 2.0f, e.left), ((e.height() * f2) / 2.0f) + e.top, kt6.d(e.width(), f3, 2.0f, e.left), ((e.height() * f3) / 2.0f) + e.top);
        return e;
    }

    public final float c() {
        return this.O.j.getInterpolation(Math.min(1.0f, (SystemClock.elapsedRealtime() - this.h) / 200.0f));
    }

    public final Object clone() {
        u62 u62Var = new u62(this.O);
        u62Var.g.set(this.g);
        u62Var.c = this.c;
        u62Var.b = this.b;
        return u62Var;
    }

    public final void d(r62 r62Var, c47 c47Var, boolean z) {
        RectF rectF = this.g;
        if (r62Var == null || c47Var == null) {
            if (!z) {
                this.j = 0.0f;
                this.k = 0.0f;
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.j = gm.R1(this.j, this.k, c());
            RectF rectF2 = this.f;
            if (rectF2 != null) {
                gm.X1(rectF2, rectF, c(), this.f);
            }
            this.k = 0.0f;
            this.h = elapsedRealtime;
            return;
        }
        this.i = c47Var.l;
        RectF rectF3 = this.q;
        if (z) {
            float c = c();
            RectF rectF4 = this.f;
            if (rectF4 != null) {
                gm.X1(rectF4, rectF, c, rectF4);
            }
            RectF rectF5 = this.p;
            if (rectF5 != null) {
                gm.X1(rectF5, rectF3, c, rectF5);
            }
            this.j = gm.R1(this.j, this.k, c);
            this.h = SystemClock.elapsedRealtime();
        }
        float f = c47Var.o;
        float f2 = r62Var.b;
        float f3 = f / f2;
        float f4 = c47Var.n;
        float f5 = r62Var.a;
        float f6 = f4 / f5;
        float f7 = c47Var.e / f2;
        float f8 = c47Var.f / f5;
        this.k = 1.0f;
        rectF.set(f3, f6, f7 + f3, f8 + f6);
        float L = gm.L(2.0f);
        float L2 = gm.L(gda.U0 - 1);
        int i = this.i;
        float f9 = (i & 5) == 5 ? L2 : L;
        float f10 = (i & 6) == 6 ? L2 : L;
        float f11 = (i & 10) == 10 ? L2 : L;
        if ((i & 9) == 9) {
            L = L2;
        }
        rectF3.set(f9, f10, f11, L);
        if (this.f == null) {
            RectF rectF6 = new RectF();
            this.f = rectF6;
            rectF6.set(rectF);
        }
        if (this.p == null) {
            RectF rectF7 = new RectF();
            this.p = rectF7;
            rectF7.set(rectF3);
        }
    }

    public final RectF e(float f) {
        RectF rectF;
        v62 v62Var = this.O;
        int i = v62Var.m;
        RectF rectF2 = this.y;
        RectF rectF3 = this.g;
        if (rectF3 == null || this.c == null) {
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            return rectF2;
        }
        float f2 = (rectF3.left * v62Var.r) + v62Var.n;
        float f3 = (rectF3.top * v62Var.s) + v62Var.p;
        float width = rectF3.width() * v62Var.r;
        float height = rectF3.height() * v62Var.s;
        if (f < 1.0f && (rectF = this.f) != null) {
            f2 = gm.R1((rectF.left * v62Var.r) + v62Var.n, f2, f);
            f3 = gm.R1((this.f.top * v62Var.s) + v62Var.p, f3, f);
            width = gm.R1(this.f.width() * v62Var.r, width, f);
            height = gm.R1(this.f.height() * v62Var.s, height, f);
        }
        int i2 = this.i;
        if ((i2 & 4) == 0) {
            float f4 = i;
            f3 += f4;
            height -= f4;
        }
        if ((i2 & 8) == 0) {
            height -= i;
        }
        if ((i2 & 1) == 0) {
            float f5 = i;
            f2 += f5;
            width -= f5;
        }
        if ((i2 & 2) == 0) {
            width -= i;
        }
        rectF2.set(f2, f3, width + f2, height + f3);
        return rectF2;
    }

    public final void f(jo6 jo6Var) {
        w62 w62Var = this.O.z;
        this.b = jo6Var;
        if (jo6Var.b) {
            this.r = gm.g0(jo6Var.E, false, false);
        } else {
            this.r = null;
        }
        ImageReceiver imageReceiver = this.c;
        if (imageReceiver == null) {
            this.c = new ImageReceiver(w62Var);
            this.d = new ImageReceiver(w62Var);
            imageReceiver = this.c;
            imageReceiver.h1 = new g11((Object) this, (Object) jo6Var, (byte) 26);
        }
        ImageReceiver imageReceiver2 = imageReceiver;
        int i = jo6Var.C;
        String str = jo6Var.I;
        String str2 = jo6Var.c;
        if (str2 != null) {
            imageReceiver2.Z(gn5.g(str2), null, null, null, cmb.Q4, 0L, null, null, 0);
            return;
        }
        if (str == null) {
            imageReceiver2.g0(cmb.Q4);
            return;
        }
        if (jo6Var.b) {
            imageReceiver2.Z(gn5.g("vthumb://" + i + ":" + str), null, null, null, cmb.Q4, 0L, null, null, 0);
            this.c.u0 = true;
            return;
        }
        imageReceiver2.o0(jo6Var.J, 0, true);
        this.c.Z(gn5.g("thumb://" + i + ":" + str), null, null, null, cmb.Q4, 0L, null, null, 0);
    }
}
