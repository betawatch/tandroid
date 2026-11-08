package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.qs;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class j0 extends i {
    public final /* synthetic */ int n = 0;
    public final Paint r;
    public final Path s;

    public j0(k0 k0Var, Context context) {
        super(k0Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // tg.i
    public final int a(float f10, float f11) {
        switch (this.n) {
            case 0:
                float L = org.telegram.messenger.g0.L(1.0f);
                float L2 = org.telegram.messenger.g0.L(19.5f);
                float f12 = L + L2;
                float f13 = f12 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f13;
                float A = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f13, 2.0f, f12);
                if (f10 <= f12 - L2 || f11 <= A - L2 || f10 >= f12 + L2 || f11 >= A + L2) {
                    float f14 = f12 + measuredWidth;
                    if (f10 <= f14 - L2 || f11 <= A - L2 || f10 >= f14 + L2 || f11 >= A + L2) {
                    }
                }
                break;
            case 1:
                float L3 = org.telegram.messenger.g0.L(1.0f);
                float L4 = org.telegram.messenger.g0.L(19.5f);
                float f15 = L3 + L4;
                float f16 = f15 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f16;
                float A2 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f16, 2.0f, f15);
                if (f10 <= f15 - L4 || f11 <= A2 - L4 || f10 >= f15 + L4 || f11 >= A2 + L4) {
                    float f17 = f15 + measuredWidth2;
                    if (f10 <= f17 - L4 || f11 <= A2 - L4 || f10 >= f17 + L4 || f11 >= A2 + L4) {
                    }
                }
                break;
            case 2:
                float L5 = org.telegram.messenger.g0.L(1.0f);
                float L6 = org.telegram.messenger.g0.L(19.5f);
                float f18 = L5 + L6;
                float f19 = f18 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f19;
                float measuredHeight = getMeasuredHeight() - f19;
                float f20 = (measuredHeight / 2.0f) + f18;
                if (f10 <= f18 - L6 || f11 <= f20 - L6 || f10 >= f18 + L6 || f11 >= f20 + L6) {
                    float f21 = f18 + measuredWidth3;
                    if (f10 <= f21 - L6 || f11 <= f20 - L6 || f10 >= f21 + L6 || f11 >= f20 + L6) {
                        if (f10 <= f18 || f10 >= measuredWidth3 || f11 <= f18 || f11 >= measuredHeight) {
                        }
                    }
                }
                break;
            case 3:
                float L7 = org.telegram.messenger.g0.L(1.0f);
                float L8 = org.telegram.messenger.g0.L(19.5f);
                float f22 = L7 + L8;
                float f23 = f22 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f23;
                float measuredHeight2 = getMeasuredHeight() - f23;
                float f24 = (measuredHeight2 / 2.0f) + f22;
                if (f10 <= f22 - L8 || f11 <= f24 - L8 || f10 >= f22 + L8 || f11 >= f24 + L8) {
                    float f25 = f22 + measuredWidth4;
                    if (f10 <= f25 - L8 || f11 <= f24 - L8 || f10 >= f25 + L8 || f11 >= f24 + L8) {
                        if (f10 <= f22 || f10 >= measuredWidth4 || f11 <= f22 || f11 >= measuredHeight2) {
                        }
                    }
                }
                break;
            case 4:
                float L9 = org.telegram.messenger.g0.L(1.0f);
                float L10 = org.telegram.messenger.g0.L(19.5f);
                float f26 = L9 + L10;
                float f27 = f26 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f27;
                float A3 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f27, 2.0f, f26);
                if (f10 <= f26 - L10 || f11 <= A3 - L10 || f10 >= f26 + L10 || f11 >= A3 + L10) {
                    float f28 = f26 + measuredWidth5;
                    if (f10 <= f28 - L10 || f11 <= A3 - L10 || f10 >= f28 + L10 || f11 >= A3 + L10) {
                    }
                }
                break;
            default:
                float L11 = org.telegram.messenger.g0.L(1.0f);
                float L12 = org.telegram.messenger.g0.L(19.5f);
                float f29 = L11 + L12;
                float f30 = f29 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f30;
                float A4 = com.google.android.recaptcha.internal.a.A(getMeasuredHeight(), f30, 2.0f, f29);
                if (f10 <= f29 - L12 || f11 <= A4 - L12 || f10 >= f29 + L12 || f11 >= A4 + L12) {
                    float f31 = f29 + measuredWidth6;
                    if (f10 <= f31 - L12 || f11 <= A4 - L12 || f10 >= f31 + L12 || f11 >= A4 + L12) {
                    }
                }
                break;
        }
        return 0;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        switch (this.n) {
            case 0:
                super.onDraw(canvas);
                int saveCount = canvas.getSaveCount();
                float showAlpha = getShowAlpha();
                if (showAlpha > 0.0f) {
                    if (showAlpha < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha * 255.0f), 31);
                    }
                    float L = org.telegram.messenger.g0.L(2.0f);
                    float N = org.telegram.messenger.g0.N(5.66f);
                    float L2 = L + N + org.telegram.messenger.g0.L(15.0f);
                    float f10 = L2 * 2.0f;
                    float measuredWidth = getMeasuredWidth() - f10;
                    float measuredHeight = getMeasuredHeight() - f10;
                    RectF rectF = org.telegram.messenger.g0.P;
                    float f11 = L2 + measuredWidth;
                    float f12 = L2 + measuredHeight;
                    rectF.set(L2, L2, f11, f12);
                    float L3 = org.telegram.messenger.g0.L(12.0f);
                    float min = Math.min(L3, measuredWidth / 2.0f);
                    float f13 = measuredHeight / 2.0f;
                    float min2 = Math.min(L3, f13);
                    Path path = this.s;
                    path.rewind();
                    float f14 = min * 2.0f;
                    float f15 = L2 + f14;
                    float f16 = 2.0f * min2;
                    float f17 = L2 + f16;
                    rectF.set(L2, L2, f15, f17);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f18 = f11 - f14;
                    rectF.set(f18, L2, f11, f17);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint = this.a;
                    canvas.drawPath(path, paint);
                    path.rewind();
                    float f19 = f12 - f16;
                    rectF.set(L2, f19, f15, f12);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f18, f19, f11, f12);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas.drawPath(path, paint);
                    float f20 = L2 + f13;
                    Paint paint2 = this.c;
                    canvas.drawCircle(L2, f20, N, paint2);
                    Paint paint3 = this.b;
                    canvas.drawCircle(L2, f20, (N - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint3);
                    canvas.drawCircle(f11, f20, N, paint2);
                    canvas.drawCircle(f11, f20, (N - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint3);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
                    float f21 = L2 + min2;
                    float f22 = f12 - min2;
                    canvas.drawLine(L2, f21, L2, f22, paint);
                    canvas.drawLine(f11, f21, f11, f22, paint);
                    Paint paint4 = this.r;
                    canvas.drawCircle(f11, f20, (org.telegram.messenger.g0.L(1.0f) + N) - 1.0f, paint4);
                    canvas.drawCircle(L2, f20, (N + org.telegram.messenger.g0.L(1.0f)) - 1.0f, paint4);
                    canvas.restoreToCount(saveCount);
                    break;
                }
                break;
            case 1:
                super.onDraw(canvas);
                int saveCount2 = canvas.getSaveCount();
                float showAlpha2 = getShowAlpha();
                if (showAlpha2 > 0.0f) {
                    if (showAlpha2 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha2 * 255.0f), 31);
                    }
                    float L4 = org.telegram.messenger.g0.L(2.0f);
                    float N2 = org.telegram.messenger.g0.N(5.66f);
                    float L5 = L4 + N2 + org.telegram.messenger.g0.L(15.0f);
                    float f23 = L5 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f23;
                    float measuredHeight2 = getMeasuredHeight() - f23;
                    RectF rectF2 = org.telegram.messenger.g0.P;
                    float f24 = L5 + measuredWidth2;
                    float f25 = L5 + measuredHeight2;
                    rectF2.set(L5, L5, f24, f25);
                    float L6 = org.telegram.messenger.g0.L(12.0f);
                    float min3 = Math.min(L6, measuredWidth2 / 2.0f);
                    float f26 = measuredHeight2 / 2.0f;
                    float min4 = Math.min(L6, f26);
                    Path path2 = this.s;
                    path2.rewind();
                    float f27 = min3 * 2.0f;
                    float f28 = L5 + f27;
                    float f29 = 2.0f * min4;
                    float f30 = L5 + f29;
                    rectF2.set(L5, L5, f28, f30);
                    path2.arcTo(rectF2, 180.0f, 90.0f);
                    float f31 = f24 - f27;
                    rectF2.set(f31, L5, f24, f30);
                    path2.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint5 = this.a;
                    canvas.drawPath(path2, paint5);
                    path2.rewind();
                    float f32 = f25 - f29;
                    rectF2.set(L5, f32, f28, f25);
                    path2.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f31, f32, f24, f25);
                    path2.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path2, paint5);
                    float f33 = L5 + f26;
                    Paint paint6 = this.c;
                    canvas.drawCircle(L5, f33, N2, paint6);
                    Paint paint7 = this.b;
                    canvas.drawCircle(L5, f33, (N2 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint7);
                    canvas.drawCircle(f24, f33, N2, paint6);
                    canvas.drawCircle(f24, f33, (N2 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint7);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
                    float f34 = L5 + min4;
                    float f35 = f25 - min4;
                    canvas.drawLine(L5, f34, L5, f35, paint5);
                    canvas.drawLine(f24, f34, f24, f35, paint5);
                    Paint paint8 = this.r;
                    canvas.drawCircle(f24, f33, (org.telegram.messenger.g0.L(1.0f) + N2) - 1.0f, paint8);
                    canvas.drawCircle(L5, f33, (N2 + org.telegram.messenger.g0.L(1.0f)) - 1.0f, paint8);
                    canvas.restoreToCount(saveCount2);
                    break;
                }
                break;
            case 2:
                super.onDraw(canvas);
                int saveCount3 = canvas.getSaveCount();
                float showAlpha3 = getShowAlpha();
                if (showAlpha3 > 0.0f) {
                    if (showAlpha3 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha3 * 255.0f), 31);
                    }
                    float L7 = org.telegram.messenger.g0.L(2.0f);
                    float N3 = org.telegram.messenger.g0.N(5.66f);
                    float L8 = L7 + N3 + org.telegram.messenger.g0.L(15.0f);
                    float f36 = L8 * 2.0f;
                    float measuredWidth3 = getMeasuredWidth() - f36;
                    float measuredHeight3 = getMeasuredHeight() - f36;
                    RectF rectF3 = org.telegram.messenger.g0.P;
                    float f37 = L8 + measuredWidth3;
                    float f38 = L8 + measuredHeight3;
                    rectF3.set(L8, L8, f37, f38);
                    float L9 = org.telegram.messenger.g0.L(12.0f);
                    float min5 = Math.min(L9, measuredWidth3 / 2.0f);
                    float f39 = measuredHeight3 / 2.0f;
                    float min6 = Math.min(L9, f39);
                    Path path3 = this.s;
                    path3.rewind();
                    float f40 = min5 * 2.0f;
                    float f41 = L8 + f40;
                    float f42 = 2.0f * min6;
                    float f43 = L8 + f42;
                    rectF3.set(L8, L8, f41, f43);
                    path3.arcTo(rectF3, 180.0f, 90.0f);
                    float f44 = f37 - f40;
                    rectF3.set(f44, L8, f37, f43);
                    path3.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint9 = this.a;
                    canvas.drawPath(path3, paint9);
                    path3.rewind();
                    float f45 = f38 - f42;
                    rectF3.set(L8, f45, f41, f38);
                    path3.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f44, f45, f37, f38);
                    path3.arcTo(rectF3, 90.0f, -90.0f);
                    canvas.drawPath(path3, paint9);
                    float f46 = L8 + f39;
                    Paint paint10 = this.c;
                    canvas.drawCircle(L8, f46, N3, paint10);
                    Paint paint11 = this.b;
                    canvas.drawCircle(L8, f46, (N3 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint11);
                    canvas.drawCircle(f37, f46, N3, paint10);
                    canvas.drawCircle(f37, f46, (N3 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint11);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
                    float f47 = L8 + min6;
                    float f48 = f38 - min6;
                    canvas.drawLine(L8, f47, L8, f48, paint9);
                    canvas.drawLine(f37, f47, f37, f48, paint9);
                    Paint paint12 = this.r;
                    canvas.drawCircle(f37, f46, (org.telegram.messenger.g0.L(1.0f) + N3) - 1.0f, paint12);
                    canvas.drawCircle(L8, f46, (N3 + org.telegram.messenger.g0.L(1.0f)) - 1.0f, paint12);
                    canvas.restoreToCount(saveCount3);
                    break;
                }
                break;
            case 3:
                super.onDraw(canvas);
                int saveCount4 = canvas.getSaveCount();
                float showAlpha4 = getShowAlpha();
                if (showAlpha4 > 0.0f) {
                    if (showAlpha4 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha4 * 255.0f), 31);
                    }
                    float L10 = org.telegram.messenger.g0.L(2.0f);
                    float N4 = org.telegram.messenger.g0.N(5.66f);
                    float L11 = L10 + N4 + org.telegram.messenger.g0.L(15.0f);
                    float f49 = L11 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f49;
                    float measuredHeight4 = getMeasuredHeight() - f49;
                    RectF rectF4 = org.telegram.messenger.g0.P;
                    float f50 = L11 + measuredWidth4;
                    float f51 = L11 + measuredHeight4;
                    rectF4.set(L11, L11, f50, f51);
                    float L12 = org.telegram.messenger.g0.L(12.0f);
                    float min7 = Math.min(L12, measuredWidth4 / 2.0f);
                    float f52 = measuredHeight4 / 2.0f;
                    float min8 = Math.min(L12, f52);
                    Path path4 = this.s;
                    path4.rewind();
                    float f53 = min7 * 2.0f;
                    float f54 = L11 + f53;
                    float f55 = 2.0f * min8;
                    float f56 = L11 + f55;
                    rectF4.set(L11, L11, f54, f56);
                    path4.arcTo(rectF4, 180.0f, 90.0f);
                    float f57 = f50 - f53;
                    rectF4.set(f57, L11, f50, f56);
                    path4.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint13 = this.a;
                    canvas.drawPath(path4, paint13);
                    path4.rewind();
                    float f58 = f51 - f55;
                    rectF4.set(L11, f58, f54, f51);
                    path4.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f57, f58, f50, f51);
                    path4.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path4, paint13);
                    float f59 = L11 + f52;
                    Paint paint14 = this.c;
                    canvas.drawCircle(L11, f59, N4, paint14);
                    Paint paint15 = this.b;
                    canvas.drawCircle(L11, f59, (N4 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint15);
                    canvas.drawCircle(f50, f59, N4, paint14);
                    canvas.drawCircle(f50, f59, (N4 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint15);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
                    float f60 = L11 + min8;
                    float f61 = f51 - min8;
                    canvas.drawLine(L11, f60, L11, f61, paint13);
                    canvas.drawLine(f50, f60, f50, f61, paint13);
                    Paint paint16 = this.r;
                    canvas.drawCircle(f50, f59, (org.telegram.messenger.g0.L(1.0f) + N4) - 1.0f, paint16);
                    canvas.drawCircle(L11, f59, (N4 + org.telegram.messenger.g0.L(1.0f)) - 1.0f, paint16);
                    canvas.restoreToCount(saveCount4);
                    break;
                }
                break;
            case 4:
                super.onDraw(canvas);
                int saveCount5 = canvas.getSaveCount();
                float showAlpha5 = getShowAlpha();
                if (showAlpha5 > 0.0f) {
                    if (showAlpha5 < 1.0f) {
                        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (showAlpha5 * 255.0f), 31);
                    }
                    float L13 = org.telegram.messenger.g0.L(2.0f);
                    float N5 = org.telegram.messenger.g0.N(5.66f);
                    float L14 = L13 + N5 + org.telegram.messenger.g0.L(15.0f);
                    float f62 = L14 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f62;
                    float measuredHeight5 = getMeasuredHeight() - f62;
                    RectF rectF5 = org.telegram.messenger.g0.P;
                    float f63 = L14 + measuredWidth5;
                    float f64 = L14 + measuredHeight5;
                    rectF5.set(L14, L14, f63, f64);
                    float L15 = org.telegram.messenger.g0.L(12.0f);
                    float min9 = Math.min(L15, measuredWidth5 / 2.0f);
                    float f65 = measuredHeight5 / 2.0f;
                    float min10 = Math.min(L15, f65);
                    Path path5 = this.s;
                    path5.rewind();
                    float f66 = min9 * 2.0f;
                    float f67 = L14 + f66;
                    float f68 = 2.0f * min10;
                    float f69 = L14 + f68;
                    rectF5.set(L14, L14, f67, f69);
                    path5.arcTo(rectF5, 180.0f, 90.0f);
                    float f70 = f63 - f66;
                    rectF5.set(f70, L14, f63, f69);
                    path5.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint17 = this.a;
                    canvas.drawPath(path5, paint17);
                    path5.rewind();
                    float f71 = f64 - f68;
                    rectF5.set(L14, f71, f67, f64);
                    path5.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f70, f71, f63, f64);
                    path5.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path5, paint17);
                    float f72 = L14 + f65;
                    Paint paint18 = this.c;
                    canvas.drawCircle(L14, f72, N5, paint18);
                    Paint paint19 = this.b;
                    canvas.drawCircle(L14, f72, (N5 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint19);
                    canvas.drawCircle(f63, f72, N5, paint18);
                    canvas.drawCircle(f63, f72, (N5 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint19);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
                    float f73 = L14 + min10;
                    float f74 = f64 - min10;
                    canvas.drawLine(L14, f73, L14, f74, paint17);
                    canvas.drawLine(f63, f73, f63, f74, paint17);
                    Paint paint20 = this.r;
                    canvas.drawCircle(f63, f72, (org.telegram.messenger.g0.L(1.0f) + N5) - 1.0f, paint20);
                    canvas.drawCircle(L14, f72, (N5 + org.telegram.messenger.g0.L(1.0f)) - 1.0f, paint20);
                    canvas.restoreToCount(saveCount5);
                    break;
                }
                break;
            default:
                super.onDraw(canvas);
                int saveCount6 = canvas.getSaveCount();
                float showAlpha6 = getShowAlpha();
                if (showAlpha6 > 0.0f) {
                    if (showAlpha6 < 1.0f) {
                        int i7 = (int) (showAlpha6 * 255.0f);
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i7, 31);
                    } else {
                        canvas2 = canvas;
                    }
                    float L16 = org.telegram.messenger.g0.L(2.0f);
                    float N6 = org.telegram.messenger.g0.N(5.66f);
                    float L17 = L16 + N6 + org.telegram.messenger.g0.L(15.0f);
                    float f75 = L17 * 2.0f;
                    float measuredWidth6 = getMeasuredWidth() - f75;
                    float measuredHeight6 = getMeasuredHeight() - f75;
                    RectF rectF6 = org.telegram.messenger.g0.P;
                    float f76 = L17 + measuredWidth6;
                    float f77 = L17 + measuredHeight6;
                    rectF6.set(L17, L17, f76, f77);
                    float L18 = org.telegram.messenger.g0.L(12.0f);
                    float min11 = Math.min(L18, measuredWidth6 / 2.0f);
                    float f78 = measuredHeight6 / 2.0f;
                    float min12 = Math.min(L18, f78);
                    Path path6 = this.s;
                    path6.rewind();
                    float f79 = min11 * 2.0f;
                    float f80 = L17 + f79;
                    float f81 = 2.0f * min12;
                    float f82 = L17 + f81;
                    rectF6.set(L17, L17, f80, f82);
                    path6.arcTo(rectF6, 180.0f, 90.0f);
                    float f83 = f76 - f79;
                    rectF6.set(f83, L17, f76, f82);
                    path6.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint21 = this.a;
                    canvas2.drawPath(path6, paint21);
                    path6.rewind();
                    float f84 = f77 - f81;
                    rectF6.set(L17, f84, f80, f77);
                    path6.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f83, f84, f76, f77);
                    path6.arcTo(rectF6, 90.0f, -90.0f);
                    canvas2.drawPath(path6, paint21);
                    float f85 = L17 + f78;
                    Paint paint22 = this.c;
                    canvas2.drawCircle(L17, f85, N6, paint22);
                    Paint paint23 = this.b;
                    canvas2.drawCircle(L17, f85, (N6 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint23);
                    canvas2.drawCircle(f76, f85, N6, paint22);
                    canvas2.drawCircle(f76, f85, (N6 - org.telegram.messenger.g0.L(1.0f)) + 1.0f, paint23);
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), qs.e4, 31);
                    float f86 = L17 + min12;
                    float f87 = f77 - min12;
                    canvas.drawLine(L17, f86, L17, f87, paint21);
                    canvas.drawLine(f76, f86, f76, f87, paint21);
                    Paint paint24 = this.r;
                    canvas.drawCircle(f76, f85, (org.telegram.messenger.g0.L(1.0f) + N6) - 1.0f, paint24);
                    canvas.drawCircle(L17, f85, (N6 + org.telegram.messenger.g0.L(1.0f)) - 1.0f, paint24);
                    canvas.restoreToCount(saveCount6);
                    break;
                }
                break;
        }
    }

    public j0(l2 l2Var, Context context) {
        super(l2Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public j0(n0 n0Var, Context context) {
        super(n0Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public j0(k2 k2Var, Context context) {
        super(k2Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public j0(n1 n1Var, Context context) {
        super(n1Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public j0(u0 u0Var, Context context) {
        super(u0Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
