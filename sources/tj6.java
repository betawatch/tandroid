// default package

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.animation.DecelerateInterpolator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tj6 extends Drawable {
    public em0 A;
    public m17 B;
    public LinearGradient C;
    public Matrix D;
    public boolean E;
    public final TextPaint a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public final Paint e;
    public final RectF f;
    public PorterDuffColorFilter g;
    public float h;
    public final DecelerateInterpolator i;
    public boolean j;
    public float k;
    public int l;
    public String m;
    public int n;
    public float o;
    public int p;
    public int q;
    public float r;
    public float s;
    public long t;
    public boolean u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public tj6() {
        TextPaint textPaint = new TextPaint(1);
        this.a = textPaint;
        Paint paint = new Paint(1);
        this.b = paint;
        this.c = new Paint(1);
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(1);
        this.e = paint3;
        this.f = new RectF();
        this.h = 1.0f;
        this.i = new DecelerateInterpolator();
        this.k = 400.0f;
        this.l = -1;
        this.o = 1.0f;
        this.r = 1.0f;
        paint.setColor(-1);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(gl.L(3.0f));
        paint.setStyle(Paint.Style.STROKE);
        paint3.setColor(-1);
        textPaint.setTypeface(gl.o());
        textPaint.setTextSize(gl.L(13.0f));
        textPaint.setColor(-1);
        paint2.setColor(-1);
    }

    public final void a(boolean z) {
        m17 m17Var = this.B;
        if (m17Var == null || !m17Var.l() || this.E) {
            return;
        }
        Rect bounds = getBounds();
        m17 m17Var2 = this.B;
        Shader shader = m17Var2.a;
        Matrix matrix = m17Var2.k;
        matrix.reset();
        this.B.a();
        if (z) {
            matrix.postTranslate(-bounds.centerX(), (-this.B.r) + bounds.top);
        } else {
            matrix.postTranslate(0.0f, -this.B.r);
        }
        shader.setLocalMatrix(matrix);
    }

    public final float b() {
        if (this.u) {
            return this.r;
        }
        return 1.0f;
    }

    public final void c(int i) {
        int i2 = (-16777216) | i;
        this.b.setColor(i2);
        this.d.setColor(i2);
        this.e.setColor(i2);
        this.a.setColor(i2);
        this.g = new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0040, code lost:
    
        if (r8 != 14) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(int i, boolean z) {
        int i2;
        int i3;
        int i4 = this.p;
        if (i4 == i && (i3 = this.q) != i) {
            this.p = i3;
            this.r = 1.0f;
            i4 = i3;
        }
        if (z) {
            if (i4 == i || (i2 = this.q) == i) {
                return;
            }
            if ((i4 == 0 && i == 1) || (i4 == 1 && i == 0)) {
                this.k = 300.0f;
            } else if (i4 == 2 && (i == 3 || i == 14)) {
                this.k = 400.0f;
            } else {
                if (i4 != 4) {
                    if (i == 6) {
                        this.k = 360.0f;
                    }
                }
                if (i4 != 14 || i != 4) {
                    this.k = 220.0f;
                }
                this.k = 160.0f;
            }
            if (this.u) {
                this.p = i2;
            }
            this.u = true;
            this.q = i;
            this.s = this.r;
            this.r = 0.0f;
        } else {
            if (i4 == i) {
                return;
            }
            this.u = false;
            this.q = i;
            this.p = i;
            this.s = this.r;
            this.r = 1.0f;
        }
        if (i == 3 || i == 14) {
            this.v = 112.0f;
            this.x = 0.0f;
            this.y = 0.0f;
            this.z = 0.0f;
        }
        invalidateSelf();
    }

    /* JADX WARN: Code restructure failed: missing block: B:277:0x07d9, code lost:
    
        if (r4 == 1) goto L335;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x07db, code lost:
    
        r4 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x07ca, code lost:
    
        if (r4 == 0) goto L329;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0994 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x09b4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x09d5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0a12 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0a68  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0ae2  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0b48  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b6c  */
    /* JADX WARN: Removed duplicated region for block: B:176:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b0e A[LOOP:0: B:178:0x0b0a->B:180:0x0b0e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0b18  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x08d8  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x092f  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0976  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0990  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x096b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0904  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x07c2  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x07e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x083b  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0847  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x08a6  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0875  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x083e  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x07c8  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x073a  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x0777  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x07ac  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x073d  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x06da  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x06e9  */
    /* JADX WARN: Removed duplicated region for block: B:312:0x0718  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x06ce  */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x06b4  */
    /* JADX WARN: Removed duplicated region for block: B:326:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0630  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x061e  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:338:0x05fa  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x05c8  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x0578  */
    /* JADX WARN: Removed duplicated region for block: B:362:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:363:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04d5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x04ee  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0554  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x05c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x05f5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0616  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x062d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0640 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x06bd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0723  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x07b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x08c8  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(Canvas canvas) {
        float f;
        int save;
        int i;
        float f2;
        float f3;
        float L;
        int i2;
        Paint paint;
        int i3;
        RectF rectF;
        float L2;
        float L3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        RectF rectF2;
        Canvas canvas2;
        int i4;
        int i5;
        int i6;
        int i7;
        float f9;
        float f10;
        int i8;
        Path[] pathArr;
        Path[] pathArr2;
        Path[] pathArr3;
        Path[] pathArr4;
        Drawable drawable;
        int i9;
        Drawable drawable2;
        Drawable drawable3;
        Drawable drawable4;
        int i10;
        int i11;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        Rect rect;
        float f14;
        int i14;
        int i15;
        int i16;
        int i17;
        float f15;
        int i18;
        Paint paint2;
        float f16;
        int i19;
        float f17;
        float interpolation;
        int i20;
        float f18;
        float f19;
        int i21;
        float f20;
        int i22;
        int i23;
        float f21;
        int i24;
        long j;
        int i25;
        float f22;
        int i26;
        Path path;
        int i27;
        float f23;
        float centerX;
        float L4;
        int min;
        float f24;
        float f25;
        float f26;
        float f27;
        float f28;
        float f29;
        float f30;
        float centerX2;
        int centerY;
        int centerY2;
        RectF rectF3;
        int i28;
        int i29;
        RectF rectF4;
        int i30;
        int i31;
        int i32;
        Rect bounds = getBounds();
        m17 m17Var = this.B;
        Paint paint3 = this.e;
        Paint paint4 = this.d;
        Paint paint5 = this.b;
        if (m17Var != null && m17Var.l() && !this.E) {
            Shader shader = this.B.a;
            paint5.setShader(shader);
            paint4.setShader(shader);
            paint3.setShader(shader);
        } else if (this.C == null || this.E) {
            paint5.setShader(null);
            paint4.setShader(null);
            paint3.setShader(null);
        } else {
            this.D.reset();
            this.D.setTranslate(0.0f, bounds.top);
            this.C.setLocalMatrix(this.D);
            paint5.setShader(this.C);
            paint4.setShader(this.C);
            paint3.setShader(this.C);
        }
        int centerX3 = bounds.centerX();
        int centerY3 = bounds.centerY();
        int i33 = this.q;
        if (i33 == 4) {
            int i34 = this.p;
            if (i34 == 3 || i34 == 14) {
                f = 1.0f;
                i = 0;
            } else {
                save = canvas.save();
                f = 1.0f;
                float f31 = 1.0f - this.r;
                canvas.scale(f31, f31, centerX3, centerY3);
                i = save;
            }
        } else {
            f = 1.0f;
            if ((i33 == 6 || i33 == 10) && this.p == 4) {
                save = canvas.save();
                float f32 = this.r;
                canvas.scale(f32, f32, centerX3, centerY3);
                i = save;
            }
            i = 0;
        }
        Typeface typeface = gl.a;
        int i35 = this.p;
        RectF rectF5 = this.f;
        if (i35 == 2 || this.q == 2) {
            a(false);
            float f33 = centerY3;
            float L5 = f33 - (gl.L(9.0f) * this.h);
            f2 = 0.5f;
            float L6 = (gl.L(9.0f) * this.h) + f33;
            float L7 = (gl.L(12.0f) * this.h) + f33;
            int i36 = this.p;
            if ((i36 == 3 || i36 == 14) && this.q == 2) {
                paint5.setAlpha((int) (Math.min(f, this.r / 0.5f) * 255.0f));
                f3 = this.r;
                L = (gl.L(12.0f) * this.h) + f33;
            } else {
                int i37 = this.q;
                if (i37 == 3 || i37 == 14 || i37 == 2) {
                    paint5.setAlpha(kk7.d4);
                    f8 = this.r;
                } else {
                    paint5.setAlpha((int) ((1.0f - this.r) * Math.min(1.0f, this.s / 0.5f) * 255.0f));
                    f8 = this.s;
                }
                f3 = f8;
                L = (gl.L(1.0f) * this.h) + f33;
            }
            if (this.u) {
                if (this.q == 2) {
                    i2 = i;
                    paint = paint4;
                    i3 = centerY3;
                    rectF = rectF5;
                    float f34 = f3;
                    f4 = 1.0f - f3;
                    f5 = f34;
                } else if (f3 <= 0.5f) {
                    f4 = f3 / 0.5f;
                    f5 = 1.0f - f4;
                    i2 = i;
                    paint = paint4;
                    i3 = centerY3;
                    rectF = rectF5;
                } else {
                    float L8 = gl.L(13.0f);
                    float f35 = this.h;
                    float L9 = (L8 * f35 * f35) + (this.j ? gl.L(2.0f) : 0);
                    float f36 = f3 - 0.5f;
                    float f37 = f36 / 0.5f;
                    if (f36 > 0.2f) {
                        f7 = (f36 - 0.2f) / 0.3f;
                        f6 = 1.0f;
                    } else {
                        f6 = f36 / 0.2f;
                        f7 = 0.0f;
                    }
                    float f38 = centerX3;
                    float f39 = L9 / 2.0f;
                    rectF5.set(f38 - L9, L7 - f39, f38, L7 + f39);
                    float f40 = f7 * 100.0f;
                    i2 = i;
                    paint = paint4;
                    float f41 = f7;
                    L2 = f38;
                    i3 = centerY3;
                    canvas.drawArc(rectF5, f40, (104.0f * f37) - f40, false, paint5);
                    float A = tb4.A(L7, L, f6, L);
                    if (f41 > 0.0f) {
                        float f42 = this.q == 14 ? 0.0f : (-45.0f) * (1.0f - f41);
                        float L10 = gl.L(7.0f) * f41 * this.h;
                        int i38 = (int) (f41 * 255.0f);
                        int i39 = this.q;
                        if (i39 != 3 && i39 != 14 && i39 != 2) {
                            i38 = (int) (i38 * (1.0f - Math.min(1.0f, this.r / 0.5f)));
                        }
                        int i40 = i38;
                        if (f42 != 0.0f) {
                            canvas.save();
                            canvas.rotate(f42, L2, f33);
                        }
                        if (i40 != 0) {
                            paint5.setAlpha(i40);
                            if (this.q == 14) {
                                paint3.setAlpha(i40);
                                rectF5.set(centerX3 - gl.L(3.5f), i3 - gl.L(3.5f), gl.L(3.5f) + centerX3, gl.L(3.5f) + i3);
                                canvas.drawRoundRect(rectF5, gl.L(2.0f), gl.L(2.0f), paint3);
                                paint5.setAlpha((int) (i40 * 0.15f));
                                int L11 = gl.L(this.j ? 2.0f : 4.0f);
                                rectF5.set(bounds.left + L11, bounds.top + L11, bounds.right - L11, bounds.bottom - L11);
                                canvas.drawArc(rectF5, 0.0f, 360.0f, false, paint5);
                                paint5.setAlpha(i40);
                            } else {
                                float f43 = L2 - L10;
                                float f44 = f33 - L10;
                                float f45 = L2 + L10;
                                float f46 = L10 + f33;
                                rectF = rectF5;
                                canvas.drawLine(f43, f44, f45, f46, paint5);
                                canvas.drawLine(f45, f44, f43, f46, paint5);
                                if (f42 != 0.0f) {
                                    canvas.restore();
                                }
                            }
                        }
                        rectF = rectF5;
                        if (f42 != 0.0f) {
                        }
                    } else {
                        rectF = rectF5;
                    }
                    L5 = A;
                    L3 = L2;
                    L6 = L7;
                }
                float A2 = tb4.A(L, L5, f4, L5);
                float A3 = tb4.A(L7, L6, f4, L6);
                float f47 = centerX3;
                float L12 = f47 - ((gl.L(8.0f) * f5) * this.h);
                float L13 = f47 + (gl.L(8.0f) * f5 * this.h);
                L7 = A3 - ((gl.L(8.0f) * f5) * this.h);
                L3 = L13;
                L2 = L12;
                L5 = A2;
                L6 = A3;
            } else {
                i2 = i;
                paint = paint4;
                i3 = centerY3;
                rectF = rectF5;
                float f48 = centerX3;
                L2 = f48 - (gl.L(8.0f) * this.h);
                L3 = f48 + (gl.L(8.0f) * this.h);
                L7 = L6 - (gl.L(8.0f) * this.h);
            }
            float f49 = L3;
            float f50 = L5;
            if (f50 != L6) {
                float f51 = centerX3;
                canvas.drawLine(f51, f50, f51, L6, paint5);
            }
            float f52 = centerX3;
            if (L2 != f52) {
                float f53 = L7;
                canvas.drawLine(L2, f53, f52, L6, paint5);
                canvas.drawLine(f49, f53, f52, L6, paint5);
            }
        } else {
            i2 = i;
            paint = paint4;
            i3 = centerY3;
            f2 = 0.5f;
            rectF = rectF5;
        }
        int i41 = this.p;
        if (i41 == 3 || i41 == 14) {
            rectF2 = rectF;
            canvas2 = canvas;
            i4 = 1;
            i5 = 4;
        } else {
            i5 = 4;
            if (i41 == 4 && ((i32 = this.q) == 14 || i32 == 3)) {
                rectF2 = rectF;
                canvas2 = canvas;
                i4 = 1;
            } else {
                if (i41 == 10 || this.q == 10 || i41 == 13) {
                    int i42 = this.q;
                    int i43 = (i42 == 4 || i42 == 6) ? (int) ((1.0f - this.r) * 255.0f) : kk7.d4;
                    if (i43 != 0) {
                        a(false);
                        paint5.setAlpha((int) (i43 * this.o));
                        float max = Math.max(4.0f, this.x * 360.0f);
                        int L14 = gl.L(this.j ? 2.0f : 4.0f);
                        rectF.set(bounds.left + L14, bounds.top + L14, bounds.right - L14, bounds.bottom - L14);
                        canvas2 = canvas;
                        canvas2.drawArc(rectF, this.v, max, false, paint5);
                        i6 = i3;
                        i7 = this.p;
                        if (i7 != this.q) {
                            f9 = 1.0f;
                            f10 = 1.0f;
                        } else if (i7 == i5 || i7 == 3 || i7 == 14) {
                            float f54 = this.r;
                            f9 = f54;
                            f10 = 1.0f - f54;
                        } else {
                            float min2 = Math.min(1.0f, this.r / f2);
                            f10 = oo1.x(this.r, f2, 1.0f, 0.0f);
                            f9 = min2;
                        }
                        i8 = this.q;
                        if (i8 != 15) {
                            pathArr = bkb.Z4;
                        } else {
                            if (this.p == 15) {
                                pathArr2 = bkb.Z4;
                                pathArr = null;
                                if (i8 == 5) {
                                    pathArr = bkb.Y4;
                                } else if (this.p == 5) {
                                    pathArr2 = bkb.Y4;
                                }
                                pathArr3 = pathArr;
                                pathArr4 = pathArr2;
                                if (i8 == 7) {
                                    drawable2 = bkb.a5;
                                    drawable = null;
                                    i9 = 8;
                                } else {
                                    drawable = this.p == 7 ? bkb.a5 : null;
                                    i9 = 8;
                                    drawable2 = null;
                                }
                                if (i8 == i9) {
                                    drawable2 = bkb.b5;
                                } else if (this.p == i9) {
                                    drawable = bkb.b5;
                                }
                                if (this.p != 9 || i8 == 9) {
                                    a(false);
                                    paint5.setAlpha(this.p == this.q ? kk7.d4 : (int) (this.r * 255.0f));
                                    int L15 = gl.L(7.0f) + i6;
                                    int L16 = centerX3 - gl.L(3.0f);
                                    if (this.p != this.q) {
                                        canvas2.save();
                                        float f55 = this.r;
                                        canvas2.scale(f55, f55, centerX3, i6);
                                    }
                                    float f56 = L16;
                                    float f57 = L15;
                                    drawable3 = drawable;
                                    drawable4 = drawable2;
                                    canvas2.drawLine(L16 - gl.L(6.0f), L15 - gl.L(6.0f), f56, f57, paint5);
                                    canvas2 = canvas;
                                    canvas2.drawLine(f56, f57, gl.L(12.0f) + L16, L15 - gl.L(12.0f), paint5);
                                    if (this.p != this.q) {
                                        canvas2.restore();
                                    }
                                } else {
                                    drawable3 = drawable;
                                    drawable4 = drawable2;
                                }
                                if (this.p != 12 || this.q == 12) {
                                    a(false);
                                    i10 = this.p;
                                    i11 = this.q;
                                    if (i10 == i11) {
                                        f11 = 1.0f;
                                    } else {
                                        f11 = this.r;
                                        if (i11 != 13) {
                                            f11 = 1.0f - f11;
                                        }
                                    }
                                    paint5.setAlpha(i10 == i11 ? kk7.d4 : (int) (f11 * 255.0f));
                                    if (this.p != this.q) {
                                        canvas2.save();
                                        canvas2.scale(f11, f11, centerX3, i6);
                                    }
                                    float L17 = gl.L(7.0f) * this.h;
                                    float f58 = centerX3;
                                    float f59 = f58 - L17;
                                    float f60 = i6;
                                    float f61 = f60 - L17;
                                    float f62 = f58 + L17;
                                    float f63 = f60 + L17;
                                    canvas2.drawLine(f59, f61, f62, f63, paint5);
                                    canvas2.drawLine(f62, f61, f59, f63, paint5);
                                    if (this.p != this.q) {
                                        canvas2.restore();
                                    }
                                }
                                if (this.p != 13 || this.q == 13) {
                                    a(false);
                                    i12 = this.p;
                                    i13 = this.q;
                                    if (i12 == i13) {
                                        f12 = 1.0f;
                                    } else {
                                        f12 = this.r;
                                        if (i13 != 13) {
                                            f12 = 1.0f - f12;
                                        }
                                    }
                                    TextPaint textPaint = this.a;
                                    textPaint.setAlpha((int) (f12 * 255.0f));
                                    int L18 = gl.L(5.0f) + i6;
                                    f13 = 5.0f;
                                    int i44 = centerX3 - (this.n / 2);
                                    rect = bounds;
                                    f14 = f10;
                                    if (this.p != this.q) {
                                        canvas2.save();
                                        canvas2.scale(f12, f12, centerX3, i6);
                                    }
                                    i14 = (int) (this.x * 100.0f);
                                    if (this.m == null && i14 == this.l) {
                                        i15 = centerX3;
                                    } else {
                                        this.l = i14;
                                        this.m = String.format("%d%%", Integer.valueOf(i14));
                                        i15 = centerX3;
                                        this.n = (int) Math.ceil(textPaint.measureText(r2));
                                    }
                                    canvas2.drawText(this.m, i44, L18, textPaint);
                                    if (this.p != this.q) {
                                        canvas2.restore();
                                    }
                                } else {
                                    f13 = 5.0f;
                                    rect = bounds;
                                    f14 = f10;
                                    i15 = centerX3;
                                }
                                i16 = this.p;
                                if (i16 != 0 || i16 == 1 || (i27 = this.q) == 0 || i27 == 1) {
                                    if (i16 == 0 || (i17 = this.q) != 1) {
                                        if (i16 == 1) {
                                            i17 = this.q;
                                        }
                                        float f64 = 0.0f;
                                        f15 = f64;
                                        i18 = this.q;
                                        if ((i18 != 0 || i18 == 1) && (i16 == 0 || i16 == 1)) {
                                            paint2 = paint;
                                            paint2.setAlpha(kk7.d4);
                                        } else if (i18 == 4) {
                                            paint2 = paint;
                                            paint2.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                        } else {
                                            paint2 = paint;
                                            paint2.setAlpha(i16 == i18 ? kk7.d4 : (int) (this.r * 255.0f));
                                        }
                                        a(true);
                                        canvas2.save();
                                        canvas2.translate(tb4.A(1.0f, f15, gl.L(1.0f), rect.centerX()), rect.centerY());
                                        f16 = f15 * 500.0f;
                                        i19 = this.p;
                                        f17 = i19 != 1 ? 90.0f : 0.0f;
                                        if (i19 == 0 || this.q != 1) {
                                            interpolation = (i19 == 1 || this.q != 0) ? f17 : f16 < 100.0f ? (-5.0f) * s33.j.getInterpolation(f16 / 100.0f) : f16 < 484.0f ? (-5.0f) + (s33.j.getInterpolation((f16 - 100.0f) / 384.0f) * 95.0f) : 90.0f;
                                        } else {
                                            interpolation = f16 < 384.0f ? s33.j.getInterpolation(f16 / 384.0f) * 95.0f : f16 < 484.0f ? 95.0f - (s33.j.getInterpolation((f16 - 384.0f) / 100.0f) * f13) : 90.0f;
                                            f16 += 100.0f;
                                        }
                                        canvas2.rotate(interpolation);
                                        i20 = this.p;
                                        if ((i20 != 0 && i20 != 1) || i20 == 4) {
                                            canvas2.scale(f9, f9);
                                        }
                                        bkb.w3.b(canvas2, paint2, f16);
                                        canvas2.scale(1.0f, -1.0f);
                                        bkb.w3.b(canvas2, paint2, f16);
                                        canvas2.restore();
                                    }
                                    if (this.u) {
                                        f15 = this.r;
                                        if (i17 == 0) {
                                            f15 = 1.0f - f15;
                                        }
                                        i18 = this.q;
                                        if (i18 != 0) {
                                        }
                                        paint2 = paint;
                                        paint2.setAlpha(kk7.d4);
                                        a(true);
                                        canvas2.save();
                                        canvas2.translate(tb4.A(1.0f, f15, gl.L(1.0f), rect.centerX()), rect.centerY());
                                        f16 = f15 * 500.0f;
                                        i19 = this.p;
                                        if (i19 != 1) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i19 == 1) {
                                        }
                                        canvas2.rotate(interpolation);
                                        i20 = this.p;
                                        if (i20 != 0) {
                                            canvas2.scale(f9, f9);
                                            bkb.w3.b(canvas2, paint2, f16);
                                            canvas2.scale(1.0f, -1.0f);
                                            bkb.w3.b(canvas2, paint2, f16);
                                            canvas2.restore();
                                        }
                                        canvas2.scale(f9, f9);
                                        bkb.w3.b(canvas2, paint2, f16);
                                        canvas2.scale(1.0f, -1.0f);
                                        bkb.w3.b(canvas2, paint2, f16);
                                        canvas2.restore();
                                    }
                                } else {
                                    paint2 = paint;
                                }
                                if (this.p != 6 || this.q == 6) {
                                    a(false);
                                    if (this.p != 6) {
                                        float f65 = this.r;
                                        if (f65 > 0.5f) {
                                            float f66 = (f65 - 0.5f) / 0.5f;
                                            f18 = 1.0f - Math.min(1.0f, f66 / 0.5f);
                                            f21 = f66 > 0.5f ? (f66 - 0.5f) / 0.5f : 0.0f;
                                        } else {
                                            f21 = 0.0f;
                                            f18 = 1.0f;
                                        }
                                        paint5.setAlpha(kk7.d4);
                                        f19 = f21;
                                    } else {
                                        if (this.q != 6) {
                                            paint5.setAlpha((int) ((1.0f - this.r) * 255.0f));
                                        } else {
                                            paint5.setAlpha(kk7.d4);
                                        }
                                        f18 = 0.0f;
                                        f19 = 1.0f;
                                    }
                                    int L19 = gl.L(7.0f) + i6;
                                    int L20 = i15 - gl.L(3.0f);
                                    if (f18 < 1.0f) {
                                        i21 = i15;
                                        i22 = L19;
                                        f20 = f19;
                                        i23 = L20;
                                        canvas.drawLine(L20 - gl.L(6.0f), L19 - gl.L(6.0f), L20 - (gl.L(6.0f) * f18), L19 - (gl.L(6.0f) * f18), paint5);
                                    } else {
                                        i21 = i15;
                                        f20 = f19;
                                        i22 = L19;
                                        i23 = L20;
                                    }
                                    if (f20 > 0.0f) {
                                        float f67 = i23;
                                        float f68 = i22;
                                        canvas2 = canvas;
                                        canvas2.drawLine(f67, f68, (gl.L(12.0f) * f20) + f67, f68 - (gl.L(12.0f) * f20), paint5);
                                    } else {
                                        canvas2 = canvas;
                                    }
                                } else {
                                    i21 = i15;
                                }
                                if (drawable3 != null && drawable3 != drawable4) {
                                    int intrinsicWidth = (int) (drawable3.getIntrinsicWidth() * f14);
                                    int intrinsicHeight = (int) (drawable3.getIntrinsicHeight() * f14);
                                    drawable3.setColorFilter(this.g);
                                    drawable3.setAlpha(this.p != this.q ? kk7.d4 : (int) ((1.0f - this.r) * 255.0f));
                                    int i45 = intrinsicWidth / 2;
                                    int i46 = intrinsicHeight / 2;
                                    drawable3.setBounds(i21 - i45, i6 - i46, i21 + i45, i46 + i6);
                                    drawable3.draw(canvas2);
                                }
                                if (drawable4 != null) {
                                    int intrinsicWidth2 = (int) (drawable4.getIntrinsicWidth() * f9);
                                    int intrinsicHeight2 = (int) (drawable4.getIntrinsicHeight() * f9);
                                    drawable4.setColorFilter(this.g);
                                    drawable4.setAlpha(this.p == this.q ? kk7.d4 : (int) (this.r * 255.0f));
                                    int i47 = intrinsicWidth2 / 2;
                                    int i48 = intrinsicHeight2 / 2;
                                    drawable4.setBounds(i21 - i47, i6 - i48, i21 + i47, i48 + i6);
                                    drawable4.draw(canvas2);
                                }
                                Paint paint6 = this.c;
                                if (pathArr4 != null || pathArr4 == pathArr3) {
                                    i24 = i21;
                                } else {
                                    int L21 = gl.L(24.0f);
                                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                                    paint2.setAlpha(this.p == this.q ? kk7.d4 : (int) ((1.0f - this.r) * 255.0f));
                                    a(true);
                                    canvas2.save();
                                    i24 = i21;
                                    canvas2.translate(i24, i6);
                                    float f69 = f14;
                                    canvas2.scale(f69, f69);
                                    float f70 = (-L21) / 2;
                                    canvas2.translate(f70, f70);
                                    Path path2 = pathArr4[0];
                                    if (path2 != null) {
                                        canvas2.drawPath(path2, paint2);
                                    }
                                    Path path3 = pathArr4[1];
                                    if (path3 != null) {
                                        canvas2.drawPath(path3, paint6);
                                    }
                                    canvas2.restore();
                                }
                                if (pathArr3 != null) {
                                    int L22 = gl.L(24.0f);
                                    int i49 = this.p == this.q ? kk7.d4 : (int) (this.r * 255.0f);
                                    paint2.setStyle(Paint.Style.FILL_AND_STROKE);
                                    paint2.setAlpha(i49);
                                    a(true);
                                    canvas2.save();
                                    canvas2.translate(i24, i6);
                                    canvas2.scale(f9, f9);
                                    float f71 = (-L22) / 2;
                                    canvas2.translate(f71, f71);
                                    Path path4 = pathArr3[0];
                                    if (path4 != null) {
                                        canvas2.drawPath(path4, paint2);
                                    }
                                    if (pathArr3.length >= 3 && (path = pathArr3[2]) != null) {
                                        canvas2.drawPath(path, paint5);
                                    }
                                    Path path5 = pathArr3[1];
                                    if (path5 != null) {
                                        if (i49 != 255) {
                                            int alpha = paint6.getAlpha();
                                            paint6.setAlpha((int) ((i49 / 255.0f) * alpha));
                                            canvas2.drawPath(pathArr3[1], paint6);
                                            paint6.setAlpha(alpha);
                                        } else {
                                            canvas2.drawPath(path5, paint6);
                                        }
                                    }
                                    canvas2.restore();
                                }
                                long currentTimeMillis = System.currentTimeMillis();
                                j = currentTimeMillis - this.t;
                                if (j > 17) {
                                    j = 17;
                                }
                                this.t = currentTimeMillis;
                                i25 = this.p;
                                if (i25 != 3 || i25 == 14 || ((i25 == 4 && this.q == 14) || i25 == 10 || i25 == 13)) {
                                    f22 = ((360 * j) / 2500.0f) + this.v;
                                    this.v = f22;
                                    while (f22 > 360.0f) {
                                        f22 -= 360.0f;
                                    }
                                    this.v = f22;
                                    if (this.q != 2) {
                                        float f72 = this.w;
                                        float f73 = this.y;
                                        float f74 = f72 - f73;
                                        if (f74 > 0.0f) {
                                            float f75 = this.z + j;
                                            this.z = f75;
                                            if (f75 >= 200.0f) {
                                                this.x = f72;
                                                this.y = f72;
                                                this.z = 0.0f;
                                            } else {
                                                this.x = (this.i.getInterpolation(f75 / 200.0f) * f74) + f73;
                                            }
                                        }
                                    }
                                    invalidateSelf();
                                }
                                if (this.u) {
                                    float f76 = this.r;
                                    if (f76 < 1.0f) {
                                        float f77 = (j / this.k) + f76;
                                        this.r = f77;
                                        if (f77 >= 1.0f) {
                                            this.p = this.q;
                                            this.r = 1.0f;
                                            this.u = false;
                                        }
                                        invalidateSelf();
                                    }
                                }
                                i26 = i2;
                                if (i26 >= 1) {
                                    canvas2.restoreToCount(i26);
                                    return;
                                }
                                return;
                            }
                            pathArr = null;
                        }
                        pathArr2 = null;
                        if (i8 == 5) {
                        }
                        pathArr3 = pathArr;
                        pathArr4 = pathArr2;
                        if (i8 == 7) {
                        }
                        if (i8 == i9) {
                        }
                        if (this.p != 9) {
                        }
                        a(false);
                        paint5.setAlpha(this.p == this.q ? kk7.d4 : (int) (this.r * 255.0f));
                        int L152 = gl.L(7.0f) + i6;
                        int L162 = centerX3 - gl.L(3.0f);
                        if (this.p != this.q) {
                        }
                        float f562 = L162;
                        float f572 = L152;
                        drawable3 = drawable;
                        drawable4 = drawable2;
                        canvas2.drawLine(L162 - gl.L(6.0f), L152 - gl.L(6.0f), f562, f572, paint5);
                        canvas2 = canvas;
                        canvas2.drawLine(f562, f572, gl.L(12.0f) + L162, L152 - gl.L(12.0f), paint5);
                        if (this.p != this.q) {
                        }
                        if (this.p != 12) {
                        }
                        a(false);
                        i10 = this.p;
                        i11 = this.q;
                        if (i10 == i11) {
                        }
                        paint5.setAlpha(i10 == i11 ? kk7.d4 : (int) (f11 * 255.0f));
                        if (this.p != this.q) {
                        }
                        float L172 = gl.L(7.0f) * this.h;
                        float f582 = centerX3;
                        float f592 = f582 - L172;
                        float f602 = i6;
                        float f612 = f602 - L172;
                        float f622 = f582 + L172;
                        float f632 = f602 + L172;
                        canvas2.drawLine(f592, f612, f622, f632, paint5);
                        canvas2.drawLine(f622, f612, f592, f632, paint5);
                        if (this.p != this.q) {
                        }
                        if (this.p != 13) {
                        }
                        a(false);
                        i12 = this.p;
                        i13 = this.q;
                        if (i12 == i13) {
                        }
                        TextPaint textPaint2 = this.a;
                        textPaint2.setAlpha((int) (f12 * 255.0f));
                        int L182 = gl.L(5.0f) + i6;
                        f13 = 5.0f;
                        int i442 = centerX3 - (this.n / 2);
                        rect = bounds;
                        f14 = f10;
                        if (this.p != this.q) {
                        }
                        i14 = (int) (this.x * 100.0f);
                        if (this.m == null) {
                        }
                        this.l = i14;
                        this.m = String.format("%d%%", Integer.valueOf(i14));
                        i15 = centerX3;
                        this.n = (int) Math.ceil(textPaint2.measureText(r2));
                        canvas2.drawText(this.m, i442, L182, textPaint2);
                        if (this.p != this.q) {
                        }
                        i16 = this.p;
                        if (i16 != 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i16 == 1) {
                        }
                        float f642 = 0.0f;
                        f15 = f642;
                        i18 = this.q;
                        if (i18 != 0) {
                        }
                        paint2 = paint;
                        paint2.setAlpha(kk7.d4);
                        a(true);
                        canvas2.save();
                        canvas2.translate(tb4.A(1.0f, f15, gl.L(1.0f), rect.centerX()), rect.centerY());
                        f16 = f15 * 500.0f;
                        i19 = this.p;
                        if (i19 != 1) {
                        }
                        if (i19 == 0) {
                        }
                        if (i19 == 1) {
                        }
                        canvas2.rotate(interpolation);
                        i20 = this.p;
                        if (i20 != 0) {
                        }
                        canvas2.scale(f9, f9);
                        bkb.w3.b(canvas2, paint2, f16);
                        canvas2.scale(1.0f, -1.0f);
                        bkb.w3.b(canvas2, paint2, f16);
                        canvas2.restore();
                        if (this.p != 6) {
                        }
                        a(false);
                        if (this.p != 6) {
                        }
                        int L192 = gl.L(7.0f) + i6;
                        int L202 = i15 - gl.L(3.0f);
                        if (f18 < 1.0f) {
                        }
                        if (f20 > 0.0f) {
                        }
                        if (drawable3 != null) {
                            int intrinsicWidth3 = (int) (drawable3.getIntrinsicWidth() * f14);
                            int intrinsicHeight3 = (int) (drawable3.getIntrinsicHeight() * f14);
                            drawable3.setColorFilter(this.g);
                            drawable3.setAlpha(this.p != this.q ? kk7.d4 : (int) ((1.0f - this.r) * 255.0f));
                            int i452 = intrinsicWidth3 / 2;
                            int i462 = intrinsicHeight3 / 2;
                            drawable3.setBounds(i21 - i452, i6 - i462, i21 + i452, i462 + i6);
                            drawable3.draw(canvas2);
                        }
                        if (drawable4 != null) {
                        }
                        Paint paint62 = this.c;
                        if (pathArr4 != null) {
                        }
                        i24 = i21;
                        if (pathArr3 != null) {
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        j = currentTimeMillis2 - this.t;
                        if (j > 17) {
                        }
                        this.t = currentTimeMillis2;
                        i25 = this.p;
                        if (i25 != 3) {
                        }
                        f22 = ((360 * j) / 2500.0f) + this.v;
                        this.v = f22;
                        while (f22 > 360.0f) {
                        }
                        this.v = f22;
                        if (this.q != 2) {
                        }
                        invalidateSelf();
                        if (this.u) {
                        }
                        i26 = i2;
                        if (i26 >= 1) {
                        }
                    }
                }
                canvas2 = canvas;
                i6 = i3;
                i7 = this.p;
                if (i7 != this.q) {
                }
                i8 = this.q;
                if (i8 != 15) {
                }
                pathArr2 = null;
                if (i8 == 5) {
                }
                pathArr3 = pathArr;
                pathArr4 = pathArr2;
                if (i8 == 7) {
                }
                if (i8 == i9) {
                }
                if (this.p != 9) {
                }
                a(false);
                paint5.setAlpha(this.p == this.q ? kk7.d4 : (int) (this.r * 255.0f));
                int L1522 = gl.L(7.0f) + i6;
                int L1622 = centerX3 - gl.L(3.0f);
                if (this.p != this.q) {
                }
                float f5622 = L1622;
                float f5722 = L1522;
                drawable3 = drawable;
                drawable4 = drawable2;
                canvas2.drawLine(L1622 - gl.L(6.0f), L1522 - gl.L(6.0f), f5622, f5722, paint5);
                canvas2 = canvas;
                canvas2.drawLine(f5622, f5722, gl.L(12.0f) + L1622, L1522 - gl.L(12.0f), paint5);
                if (this.p != this.q) {
                }
                if (this.p != 12) {
                }
                a(false);
                i10 = this.p;
                i11 = this.q;
                if (i10 == i11) {
                }
                paint5.setAlpha(i10 == i11 ? kk7.d4 : (int) (f11 * 255.0f));
                if (this.p != this.q) {
                }
                float L1722 = gl.L(7.0f) * this.h;
                float f5822 = centerX3;
                float f5922 = f5822 - L1722;
                float f6022 = i6;
                float f6122 = f6022 - L1722;
                float f6222 = f5822 + L1722;
                float f6322 = f6022 + L1722;
                canvas2.drawLine(f5922, f6122, f6222, f6322, paint5);
                canvas2.drawLine(f6222, f6122, f5922, f6322, paint5);
                if (this.p != this.q) {
                }
                if (this.p != 13) {
                }
                a(false);
                i12 = this.p;
                i13 = this.q;
                if (i12 == i13) {
                }
                TextPaint textPaint22 = this.a;
                textPaint22.setAlpha((int) (f12 * 255.0f));
                int L1822 = gl.L(5.0f) + i6;
                f13 = 5.0f;
                int i4422 = centerX3 - (this.n / 2);
                rect = bounds;
                f14 = f10;
                if (this.p != this.q) {
                }
                i14 = (int) (this.x * 100.0f);
                if (this.m == null) {
                }
                this.l = i14;
                this.m = String.format("%d%%", Integer.valueOf(i14));
                i15 = centerX3;
                this.n = (int) Math.ceil(textPaint22.measureText(r2));
                canvas2.drawText(this.m, i4422, L1822, textPaint22);
                if (this.p != this.q) {
                }
                i16 = this.p;
                if (i16 != 0) {
                }
                if (i16 == 0) {
                }
                if (i16 == 1) {
                }
                float f6422 = 0.0f;
                f15 = f6422;
                i18 = this.q;
                if (i18 != 0) {
                }
                paint2 = paint;
                paint2.setAlpha(kk7.d4);
                a(true);
                canvas2.save();
                canvas2.translate(tb4.A(1.0f, f15, gl.L(1.0f), rect.centerX()), rect.centerY());
                f16 = f15 * 500.0f;
                i19 = this.p;
                if (i19 != 1) {
                }
                if (i19 == 0) {
                }
                if (i19 == 1) {
                }
                canvas2.rotate(interpolation);
                i20 = this.p;
                if (i20 != 0) {
                }
                canvas2.scale(f9, f9);
                bkb.w3.b(canvas2, paint2, f16);
                canvas2.scale(1.0f, -1.0f);
                bkb.w3.b(canvas2, paint2, f16);
                canvas2.restore();
                if (this.p != 6) {
                }
                a(false);
                if (this.p != 6) {
                }
                int L1922 = gl.L(7.0f) + i6;
                int L2022 = i15 - gl.L(3.0f);
                if (f18 < 1.0f) {
                }
                if (f20 > 0.0f) {
                }
                if (drawable3 != null) {
                }
                if (drawable4 != null) {
                }
                Paint paint622 = this.c;
                if (pathArr4 != null) {
                }
                i24 = i21;
                if (pathArr3 != null) {
                }
                long currentTimeMillis22 = System.currentTimeMillis();
                j = currentTimeMillis22 - this.t;
                if (j > 17) {
                }
                this.t = currentTimeMillis22;
                i25 = this.p;
                if (i25 != 3) {
                }
                f22 = ((360 * j) / 2500.0f) + this.v;
                this.v = f22;
                while (f22 > 360.0f) {
                }
                this.v = f22;
                if (this.q != 2) {
                }
                invalidateSelf();
                if (this.u) {
                }
                i26 = i2;
                if (i26 >= 1) {
                }
            }
        }
        a(false);
        int i50 = this.q;
        if (i50 == 2) {
            float f78 = this.r;
            if (f78 <= f2) {
                float f79 = 1.0f - (f78 / f2);
                i31 = (int) (f79 * 255.0f);
                f27 = gl.L(7.0f) * f79 * this.h;
            } else {
                f27 = 0.0f;
                i31 = 0;
            }
            min = i31;
            centerX = 0.0f;
            f28 = 0.0f;
            f26 = 0.0f;
            f24 = 1.0f;
        } else {
            if (i50 == 15 || i50 == 0 || i50 == i4 || i50 == 5 || i50 == 8 || i50 == 9 || i50 == 7 || i50 == 6) {
                float f80 = this.r;
                if (i50 == 6) {
                    f23 = 1.0f;
                    f80 = Math.min(1.0f, f80 / f2);
                } else {
                    f23 = 1.0f;
                }
                float f81 = f23 - f80;
                centerX = bounds.centerX();
                float centerY4 = bounds.centerY();
                L4 = gl.L(7.0f) * f81 * this.h;
                float f82 = f23;
                min = (int) (Math.min(f23, f81 * 2.0f) * 255.0f);
                f24 = f81;
                f25 = f82;
                f26 = centerY4;
            } else if (i50 == i5) {
                float f83 = 1.0f - this.r;
                L4 = gl.L(7.0f) * this.h;
                int i51 = (int) (f83 * 255.0f);
                if (this.p == 14) {
                    centerX = bounds.left;
                    centerY2 = bounds.top;
                } else {
                    centerX = bounds.centerX();
                    centerY2 = bounds.centerY();
                }
                f26 = centerY2;
                f25 = 1.0f;
                min = i51;
                f24 = f83;
            } else if (i50 == 14 || i50 == 3) {
                float f84 = this.r;
                float f85 = 1.0f - f84;
                if (this.p == i5) {
                    f30 = f84;
                    f29 = 0.0f;
                } else {
                    f29 = 45.0f * f85;
                    f30 = 1.0f;
                }
                float L23 = gl.L(7.0f) * this.h;
                int i52 = (int) (f84 * 255.0f);
                if (this.q == 14) {
                    centerX2 = bounds.left;
                    centerY = bounds.top;
                } else {
                    centerX2 = bounds.centerX();
                    centerY = bounds.centerY();
                }
                f26 = centerY;
                float f86 = centerX2;
                min = i52;
                centerX = f86;
                float f87 = f30;
                f28 = f29;
                f27 = L23;
                f24 = f87;
            } else {
                f27 = this.h * gl.L(7.0f);
                centerX = 0.0f;
                f28 = 0.0f;
                f26 = 0.0f;
                f24 = 1.0f;
                min = kk7.d4;
            }
            f27 = L4;
            f28 = 0.0f;
            if (f24 != f25) {
                canvas2.save();
                canvas2.scale(f24, f24, centerX, f26);
            }
            if (f28 == 0.0f) {
                canvas2.save();
                i6 = i3;
                canvas2.rotate(f28, centerX3, i6);
            } else {
                i6 = i3;
            }
            if (min == 0) {
                float f88 = min;
                paint5.setAlpha((int) (this.o * f88));
                if (this.p == 14 || this.q == 14) {
                    rectF3 = rectF2;
                    paint3.setAlpha((int) (f88 * this.o));
                    rectF3.set(centerX3 - gl.L(3.5f), i6 - gl.L(3.5f), gl.L(3.5f) + centerX3, gl.L(3.5f) + i6);
                    canvas2.drawRoundRect(rectF3, gl.L(2.0f), gl.L(2.0f), paint3);
                } else {
                    float f89 = centerX3;
                    RectF rectF6 = rectF2;
                    float f90 = f89 - f27;
                    float f91 = i6;
                    float f92 = f91 - f27;
                    float f93 = f89 + f27;
                    float f94 = f91 + f27;
                    rectF3 = rectF6;
                    canvas2.drawLine(f90, f92, f93, f94, paint5);
                    canvas2.drawLine(f93, f92, f90, f94, paint5);
                }
            } else {
                rectF3 = rectF2;
            }
            if (f28 != 0.0f) {
                canvas2.restore();
            }
            if (f24 != f25) {
                canvas2.restore();
            }
            i28 = this.p;
            if ((i28 != 3 || i28 == 14 || (i28 == i5 && ((i30 = this.q) == 14 || i30 == 3))) && min != 0) {
                float max2 = Math.max(4.0f, this.x * 360.0f);
                int L24 = gl.L(this.j ? 2.0f : 4.0f);
                rectF3.set(bounds.left + L24, bounds.top + L24, bounds.right - L24, bounds.bottom - L24);
                i29 = this.p;
                if (i29 != 14 || (i29 == i5 && this.q == 14)) {
                    paint5.setAlpha((int) (min * 0.15f * this.o));
                    rectF4 = rectF3;
                    canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
                    paint5.setAlpha(min);
                } else {
                    rectF4 = rectF3;
                }
                canvas2 = canvas;
                canvas2.drawArc(rectF4, this.v, max2, false, paint5);
            }
            i7 = this.p;
            if (i7 != this.q) {
            }
            i8 = this.q;
            if (i8 != 15) {
            }
            pathArr2 = null;
            if (i8 == 5) {
            }
            pathArr3 = pathArr;
            pathArr4 = pathArr2;
            if (i8 == 7) {
            }
            if (i8 == i9) {
            }
            if (this.p != 9) {
            }
            a(false);
            paint5.setAlpha(this.p == this.q ? kk7.d4 : (int) (this.r * 255.0f));
            int L15222 = gl.L(7.0f) + i6;
            int L16222 = centerX3 - gl.L(3.0f);
            if (this.p != this.q) {
            }
            float f56222 = L16222;
            float f57222 = L15222;
            drawable3 = drawable;
            drawable4 = drawable2;
            canvas2.drawLine(L16222 - gl.L(6.0f), L15222 - gl.L(6.0f), f56222, f57222, paint5);
            canvas2 = canvas;
            canvas2.drawLine(f56222, f57222, gl.L(12.0f) + L16222, L15222 - gl.L(12.0f), paint5);
            if (this.p != this.q) {
            }
            if (this.p != 12) {
            }
            a(false);
            i10 = this.p;
            i11 = this.q;
            if (i10 == i11) {
            }
            paint5.setAlpha(i10 == i11 ? kk7.d4 : (int) (f11 * 255.0f));
            if (this.p != this.q) {
            }
            float L17222 = gl.L(7.0f) * this.h;
            float f58222 = centerX3;
            float f59222 = f58222 - L17222;
            float f60222 = i6;
            float f61222 = f60222 - L17222;
            float f62222 = f58222 + L17222;
            float f63222 = f60222 + L17222;
            canvas2.drawLine(f59222, f61222, f62222, f63222, paint5);
            canvas2.drawLine(f62222, f61222, f59222, f63222, paint5);
            if (this.p != this.q) {
            }
            if (this.p != 13) {
            }
            a(false);
            i12 = this.p;
            i13 = this.q;
            if (i12 == i13) {
            }
            TextPaint textPaint222 = this.a;
            textPaint222.setAlpha((int) (f12 * 255.0f));
            int L18222 = gl.L(5.0f) + i6;
            f13 = 5.0f;
            int i44222 = centerX3 - (this.n / 2);
            rect = bounds;
            f14 = f10;
            if (this.p != this.q) {
            }
            i14 = (int) (this.x * 100.0f);
            if (this.m == null) {
            }
            this.l = i14;
            this.m = String.format("%d%%", Integer.valueOf(i14));
            i15 = centerX3;
            this.n = (int) Math.ceil(textPaint222.measureText(r2));
            canvas2.drawText(this.m, i44222, L18222, textPaint222);
            if (this.p != this.q) {
            }
            i16 = this.p;
            if (i16 != 0) {
            }
            if (i16 == 0) {
            }
            if (i16 == 1) {
            }
            float f64222 = 0.0f;
            f15 = f64222;
            i18 = this.q;
            if (i18 != 0) {
            }
            paint2 = paint;
            paint2.setAlpha(kk7.d4);
            a(true);
            canvas2.save();
            canvas2.translate(tb4.A(1.0f, f15, gl.L(1.0f), rect.centerX()), rect.centerY());
            f16 = f15 * 500.0f;
            i19 = this.p;
            if (i19 != 1) {
            }
            if (i19 == 0) {
            }
            if (i19 == 1) {
            }
            canvas2.rotate(interpolation);
            i20 = this.p;
            if (i20 != 0) {
            }
            canvas2.scale(f9, f9);
            bkb.w3.b(canvas2, paint2, f16);
            canvas2.scale(1.0f, -1.0f);
            bkb.w3.b(canvas2, paint2, f16);
            canvas2.restore();
            if (this.p != 6) {
            }
            a(false);
            if (this.p != 6) {
            }
            int L19222 = gl.L(7.0f) + i6;
            int L20222 = i15 - gl.L(3.0f);
            if (f18 < 1.0f) {
            }
            if (f20 > 0.0f) {
            }
            if (drawable3 != null) {
            }
            if (drawable4 != null) {
            }
            Paint paint6222 = this.c;
            if (pathArr4 != null) {
            }
            i24 = i21;
            if (pathArr3 != null) {
            }
            long currentTimeMillis222 = System.currentTimeMillis();
            j = currentTimeMillis222 - this.t;
            if (j > 17) {
            }
            this.t = currentTimeMillis222;
            i25 = this.p;
            if (i25 != 3) {
            }
            f22 = ((360 * j) / 2500.0f) + this.v;
            this.v = f22;
            while (f22 > 360.0f) {
            }
            this.v = f22;
            if (this.q != 2) {
            }
            invalidateSelf();
            if (this.u) {
            }
            i26 = i2;
            if (i26 >= 1) {
            }
        }
        f25 = 1.0f;
        if (f24 != f25) {
        }
        if (f28 == 0.0f) {
        }
        if (min == 0) {
        }
        if (f28 != 0.0f) {
        }
        if (f24 != f25) {
        }
        i28 = this.p;
        if (i28 != 3) {
        }
        float max22 = Math.max(4.0f, this.x * 360.0f);
        int L242 = gl.L(this.j ? 2.0f : 4.0f);
        rectF3.set(bounds.left + L242, bounds.top + L242, bounds.right - L242, bounds.bottom - L242);
        i29 = this.p;
        if (i29 != 14) {
        }
        paint5.setAlpha((int) (min * 0.15f * this.o));
        rectF4 = rectF3;
        canvas2.drawArc(rectF4, 0.0f, 360.0f, false, paint5);
        paint5.setAlpha(min);
        canvas2 = canvas;
        canvas2.drawArc(rectF4, this.v, max22, false, paint5);
        i7 = this.p;
        if (i7 != this.q) {
        }
        i8 = this.q;
        if (i8 != 15) {
        }
        pathArr2 = null;
        if (i8 == 5) {
        }
        pathArr3 = pathArr;
        pathArr4 = pathArr2;
        if (i8 == 7) {
        }
        if (i8 == i9) {
        }
        if (this.p != 9) {
        }
        a(false);
        paint5.setAlpha(this.p == this.q ? kk7.d4 : (int) (this.r * 255.0f));
        int L152222 = gl.L(7.0f) + i6;
        int L162222 = centerX3 - gl.L(3.0f);
        if (this.p != this.q) {
        }
        float f562222 = L162222;
        float f572222 = L152222;
        drawable3 = drawable;
        drawable4 = drawable2;
        canvas2.drawLine(L162222 - gl.L(6.0f), L152222 - gl.L(6.0f), f562222, f572222, paint5);
        canvas2 = canvas;
        canvas2.drawLine(f562222, f572222, gl.L(12.0f) + L162222, L152222 - gl.L(12.0f), paint5);
        if (this.p != this.q) {
        }
        if (this.p != 12) {
        }
        a(false);
        i10 = this.p;
        i11 = this.q;
        if (i10 == i11) {
        }
        paint5.setAlpha(i10 == i11 ? kk7.d4 : (int) (f11 * 255.0f));
        if (this.p != this.q) {
        }
        float L172222 = gl.L(7.0f) * this.h;
        float f582222 = centerX3;
        float f592222 = f582222 - L172222;
        float f602222 = i6;
        float f612222 = f602222 - L172222;
        float f622222 = f582222 + L172222;
        float f632222 = f602222 + L172222;
        canvas2.drawLine(f592222, f612222, f622222, f632222, paint5);
        canvas2.drawLine(f622222, f612222, f592222, f632222, paint5);
        if (this.p != this.q) {
        }
        if (this.p != 13) {
        }
        a(false);
        i12 = this.p;
        i13 = this.q;
        if (i12 == i13) {
        }
        TextPaint textPaint2222 = this.a;
        textPaint2222.setAlpha((int) (f12 * 255.0f));
        int L182222 = gl.L(5.0f) + i6;
        f13 = 5.0f;
        int i442222 = centerX3 - (this.n / 2);
        rect = bounds;
        f14 = f10;
        if (this.p != this.q) {
        }
        i14 = (int) (this.x * 100.0f);
        if (this.m == null) {
        }
        this.l = i14;
        this.m = String.format("%d%%", Integer.valueOf(i14));
        i15 = centerX3;
        this.n = (int) Math.ceil(textPaint2222.measureText(r2));
        canvas2.drawText(this.m, i442222, L182222, textPaint2222);
        if (this.p != this.q) {
        }
        i16 = this.p;
        if (i16 != 0) {
        }
        if (i16 == 0) {
        }
        if (i16 == 1) {
        }
        float f642222 = 0.0f;
        f15 = f642222;
        i18 = this.q;
        if (i18 != 0) {
        }
        paint2 = paint;
        paint2.setAlpha(kk7.d4);
        a(true);
        canvas2.save();
        canvas2.translate(tb4.A(1.0f, f15, gl.L(1.0f), rect.centerX()), rect.centerY());
        f16 = f15 * 500.0f;
        i19 = this.p;
        if (i19 != 1) {
        }
        if (i19 == 0) {
        }
        if (i19 == 1) {
        }
        canvas2.rotate(interpolation);
        i20 = this.p;
        if (i20 != 0) {
        }
        canvas2.scale(f9, f9);
        bkb.w3.b(canvas2, paint2, f16);
        canvas2.scale(1.0f, -1.0f);
        bkb.w3.b(canvas2, paint2, f16);
        canvas2.restore();
        if (this.p != 6) {
        }
        a(false);
        if (this.p != 6) {
        }
        int L192222 = gl.L(7.0f) + i6;
        int L202222 = i15 - gl.L(3.0f);
        if (f18 < 1.0f) {
        }
        if (f20 > 0.0f) {
        }
        if (drawable3 != null) {
        }
        if (drawable4 != null) {
        }
        Paint paint62222 = this.c;
        if (pathArr4 != null) {
        }
        i24 = i21;
        if (pathArr3 != null) {
        }
        long currentTimeMillis2222 = System.currentTimeMillis();
        j = currentTimeMillis2222 - this.t;
        if (j > 17) {
        }
        this.t = currentTimeMillis2222;
        i25 = this.p;
        if (i25 != 3) {
        }
        f22 = ((360 * j) / 2500.0f) + this.v;
        this.v = f22;
        while (f22 > 360.0f) {
        }
        this.v = f22;
        if (this.q != 2) {
        }
        invalidateSelf();
        if (this.u) {
        }
        i26 = i2;
        if (i26 >= 1) {
        }
    }

    public final void e(boolean z, float f) {
        if (this.w == f) {
            return;
        }
        if (z) {
            float f2 = this.x;
            if (f2 > f) {
                this.x = f;
                f2 = f;
            }
            this.y = f2;
        } else {
            this.x = f;
            this.y = f;
        }
        this.w = f;
        this.z = 0.0f;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return gl.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return gl.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        return gl.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        return gl.L(48.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        super.invalidateSelf();
        em0 em0Var = this.A;
        if (em0Var != null) {
            em0Var.a.invalidate();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        float L = (i3 - i) / gl.L(48.0f);
        this.h = L;
        if (L < 0.7f) {
            this.b.setStrokeWidth(gl.L(2.0f));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.b.setColorFilter(colorFilter);
        this.d.setColorFilter(colorFilter);
        this.e.setColorFilter(colorFilter);
        this.a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
