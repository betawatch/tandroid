package rg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class r0 extends j {
    public final /* synthetic */ int n = 2;
    public final Paint r;
    public final Path s;

    public r0(s0 s0Var, Context context) {
        super(s0Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    @Override // rg.j
    public final int a(float f7, float f10) {
        switch (this.n) {
            case 0:
                float dp = AndroidUtilities.dp(1.0f);
                float dp2 = AndroidUtilities.dp(19.5f);
                float f11 = dp + dp2;
                float f12 = f11 * 2.0f;
                float measuredWidth = getMeasuredWidth() - f12;
                float A = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f12, 2.0f, f11);
                if (f7 <= f11 - dp2 || f10 <= A - dp2 || f7 >= f11 + dp2 || f10 >= A + dp2) {
                    float f13 = f11 + measuredWidth;
                    if (f7 <= f13 - dp2 || f10 <= A - dp2 || f7 >= f13 + dp2 || f10 >= A + dp2) {
                    }
                }
                break;
            case 1:
                float dp3 = AndroidUtilities.dp(1.0f);
                float dp4 = AndroidUtilities.dp(19.5f);
                float f14 = dp3 + dp4;
                float f15 = f14 * 2.0f;
                float measuredWidth2 = getMeasuredWidth() - f15;
                float A2 = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f15, 2.0f, f14);
                if (f7 <= f14 - dp4 || f10 <= A2 - dp4 || f7 >= f14 + dp4 || f10 >= A2 + dp4) {
                    float f16 = f14 + measuredWidth2;
                    if (f7 <= f16 - dp4 || f10 <= A2 - dp4 || f7 >= f16 + dp4 || f10 >= A2 + dp4) {
                    }
                }
                break;
            case 2:
                float dp5 = AndroidUtilities.dp(1.0f);
                float dp6 = AndroidUtilities.dp(19.5f);
                float f17 = dp5 + dp6;
                float f18 = f17 * 2.0f;
                float measuredWidth3 = getMeasuredWidth() - f18;
                float measuredHeight = getMeasuredHeight() - f18;
                float f19 = (measuredHeight / 2.0f) + f17;
                if (f7 <= f17 - dp6 || f10 <= f19 - dp6 || f7 >= f17 + dp6 || f10 >= f19 + dp6) {
                    float f20 = f17 + measuredWidth3;
                    if (f7 <= f20 - dp6 || f10 <= f19 - dp6 || f7 >= f20 + dp6 || f10 >= f19 + dp6) {
                        if (f7 <= f17 || f7 >= measuredWidth3 || f10 <= f17 || f10 >= measuredHeight) {
                        }
                    }
                }
                break;
            case 3:
                float dp7 = AndroidUtilities.dp(1.0f);
                float dp8 = AndroidUtilities.dp(19.5f);
                float f21 = dp7 + dp8;
                float f22 = f21 * 2.0f;
                float measuredWidth4 = getMeasuredWidth() - f22;
                float measuredHeight2 = getMeasuredHeight() - f22;
                float f23 = (measuredHeight2 / 2.0f) + f21;
                if (f7 <= f21 - dp8 || f10 <= f23 - dp8 || f7 >= f21 + dp8 || f10 >= f23 + dp8) {
                    float f24 = f21 + measuredWidth4;
                    if (f7 <= f24 - dp8 || f10 <= f23 - dp8 || f7 >= f24 + dp8 || f10 >= f23 + dp8) {
                        if (f7 <= f21 || f7 >= measuredWidth4 || f10 <= f21 || f10 >= measuredHeight2) {
                        }
                    }
                }
                break;
            case 4:
                float dp9 = AndroidUtilities.dp(1.0f);
                float dp10 = AndroidUtilities.dp(19.5f);
                float f25 = dp9 + dp10;
                float f26 = f25 * 2.0f;
                float measuredWidth5 = getMeasuredWidth() - f26;
                float A3 = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f26, 2.0f, f25);
                if (f7 <= f25 - dp10 || f10 <= A3 - dp10 || f7 >= f25 + dp10 || f10 >= A3 + dp10) {
                    float f27 = f25 + measuredWidth5;
                    if (f7 <= f27 - dp10 || f10 <= A3 - dp10 || f7 >= f27 + dp10 || f10 >= A3 + dp10) {
                    }
                }
                break;
            default:
                float dp11 = AndroidUtilities.dp(1.0f);
                float dp12 = AndroidUtilities.dp(19.5f);
                float f28 = dp11 + dp12;
                float f29 = f28 * 2.0f;
                float measuredWidth6 = getMeasuredWidth() - f29;
                float A4 = com.google.android.gms.internal.vision.e2.A(getMeasuredHeight(), f29, 2.0f, f28);
                if (f7 <= f28 - dp12 || f10 <= A4 - dp12 || f7 >= f28 + dp12 || f10 >= A4 + dp12) {
                    float f30 = f28 + measuredWidth6;
                    if (f7 <= f30 - dp12 || f10 <= A4 - dp12 || f7 >= f30 + dp12 || f10 >= A4 + dp12) {
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
                    float dp = AndroidUtilities.dp(2.0f);
                    float dpf2 = AndroidUtilities.dpf2(5.66f);
                    float dp2 = dp + dpf2 + AndroidUtilities.dp(15.0f);
                    float f7 = dp2 * 2.0f;
                    float measuredWidth = getMeasuredWidth() - f7;
                    float measuredHeight = getMeasuredHeight() - f7;
                    RectF rectF = AndroidUtilities.rectTmp;
                    float f10 = dp2 + measuredWidth;
                    float f11 = dp2 + measuredHeight;
                    rectF.set(dp2, dp2, f10, f11);
                    float dp3 = AndroidUtilities.dp(12.0f);
                    float min = Math.min(dp3, measuredWidth / 2.0f);
                    float f12 = measuredHeight / 2.0f;
                    float min2 = Math.min(dp3, f12);
                    Path path = this.s;
                    path.rewind();
                    float f13 = min * 2.0f;
                    float f14 = dp2 + f13;
                    float f15 = 2.0f * min2;
                    float f16 = dp2 + f15;
                    rectF.set(dp2, dp2, f14, f16);
                    path.arcTo(rectF, 180.0f, 90.0f);
                    float f17 = f10 - f13;
                    rectF.set(f17, dp2, f10, f16);
                    path.arcTo(rectF, 270.0f, 90.0f);
                    Paint paint = this.a;
                    canvas.drawPath(path, paint);
                    path.rewind();
                    float f18 = f11 - f15;
                    rectF.set(dp2, f18, f14, f11);
                    path.arcTo(rectF, 180.0f, -90.0f);
                    rectF.set(f17, f18, f10, f11);
                    path.arcTo(rectF, 90.0f, -90.0f);
                    canvas.drawPath(path, paint);
                    float f19 = dp2 + f12;
                    Paint paint2 = this.c;
                    canvas.drawCircle(dp2, f19, dpf2, paint2);
                    Paint paint3 = this.b;
                    canvas.drawCircle(dp2, f19, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                    canvas.drawCircle(f10, f19, dpf2, paint2);
                    canvas.drawCircle(f10, f19, (dpf2 - AndroidUtilities.dp(1.0f)) + 1.0f, paint3);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f20 = dp2 + min2;
                    float f21 = f11 - min2;
                    canvas.drawLine(dp2, f20, dp2, f21, paint);
                    canvas.drawLine(f10, f20, f10, f21, paint);
                    Paint paint4 = this.r;
                    canvas.drawCircle(f10, f19, (AndroidUtilities.dp(1.0f) + dpf2) - 1.0f, paint4);
                    canvas.drawCircle(dp2, f19, (dpf2 + AndroidUtilities.dp(1.0f)) - 1.0f, paint4);
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
                    float dp4 = AndroidUtilities.dp(2.0f);
                    float dpf22 = AndroidUtilities.dpf2(5.66f);
                    float dp5 = dp4 + dpf22 + AndroidUtilities.dp(15.0f);
                    float f22 = dp5 * 2.0f;
                    float measuredWidth2 = getMeasuredWidth() - f22;
                    float measuredHeight2 = getMeasuredHeight() - f22;
                    RectF rectF2 = AndroidUtilities.rectTmp;
                    float f23 = dp5 + measuredWidth2;
                    float f24 = dp5 + measuredHeight2;
                    rectF2.set(dp5, dp5, f23, f24);
                    float dp6 = AndroidUtilities.dp(12.0f);
                    float min3 = Math.min(dp6, measuredWidth2 / 2.0f);
                    float f25 = measuredHeight2 / 2.0f;
                    float min4 = Math.min(dp6, f25);
                    Path path2 = this.s;
                    path2.rewind();
                    float f26 = min3 * 2.0f;
                    float f27 = dp5 + f26;
                    float f28 = 2.0f * min4;
                    float f29 = dp5 + f28;
                    rectF2.set(dp5, dp5, f27, f29);
                    path2.arcTo(rectF2, 180.0f, 90.0f);
                    float f30 = f23 - f26;
                    rectF2.set(f30, dp5, f23, f29);
                    path2.arcTo(rectF2, 270.0f, 90.0f);
                    Paint paint5 = this.a;
                    canvas.drawPath(path2, paint5);
                    path2.rewind();
                    float f31 = f24 - f28;
                    rectF2.set(dp5, f31, f27, f24);
                    path2.arcTo(rectF2, 180.0f, -90.0f);
                    rectF2.set(f30, f31, f23, f24);
                    path2.arcTo(rectF2, 90.0f, -90.0f);
                    canvas.drawPath(path2, paint5);
                    float f32 = dp5 + f25;
                    Paint paint6 = this.c;
                    canvas.drawCircle(dp5, f32, dpf22, paint6);
                    Paint paint7 = this.b;
                    canvas.drawCircle(dp5, f32, (dpf22 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                    canvas.drawCircle(f23, f32, dpf22, paint6);
                    canvas.drawCircle(f23, f32, (dpf22 - AndroidUtilities.dp(1.0f)) + 1.0f, paint7);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f33 = dp5 + min4;
                    float f34 = f24 - min4;
                    canvas.drawLine(dp5, f33, dp5, f34, paint5);
                    canvas.drawLine(f23, f33, f23, f34, paint5);
                    Paint paint8 = this.r;
                    canvas.drawCircle(f23, f32, (AndroidUtilities.dp(1.0f) + dpf22) - 1.0f, paint8);
                    canvas.drawCircle(dp5, f32, (dpf22 + AndroidUtilities.dp(1.0f)) - 1.0f, paint8);
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
                    float dp7 = AndroidUtilities.dp(2.0f);
                    float dpf23 = AndroidUtilities.dpf2(5.66f);
                    float dp8 = dp7 + dpf23 + AndroidUtilities.dp(15.0f);
                    float f35 = dp8 * 2.0f;
                    float measuredWidth3 = getMeasuredWidth() - f35;
                    float measuredHeight3 = getMeasuredHeight() - f35;
                    RectF rectF3 = AndroidUtilities.rectTmp;
                    float f36 = dp8 + measuredWidth3;
                    float f37 = dp8 + measuredHeight3;
                    rectF3.set(dp8, dp8, f36, f37);
                    float dp9 = AndroidUtilities.dp(12.0f);
                    float min5 = Math.min(dp9, measuredWidth3 / 2.0f);
                    float f38 = measuredHeight3 / 2.0f;
                    float min6 = Math.min(dp9, f38);
                    Path path3 = this.s;
                    path3.rewind();
                    float f39 = min5 * 2.0f;
                    float f40 = dp8 + f39;
                    float f41 = 2.0f * min6;
                    float f42 = dp8 + f41;
                    rectF3.set(dp8, dp8, f40, f42);
                    path3.arcTo(rectF3, 180.0f, 90.0f);
                    float f43 = f36 - f39;
                    rectF3.set(f43, dp8, f36, f42);
                    path3.arcTo(rectF3, 270.0f, 90.0f);
                    Paint paint9 = this.a;
                    canvas.drawPath(path3, paint9);
                    path3.rewind();
                    float f44 = f37 - f41;
                    rectF3.set(dp8, f44, f40, f37);
                    path3.arcTo(rectF3, 180.0f, -90.0f);
                    rectF3.set(f43, f44, f36, f37);
                    path3.arcTo(rectF3, 90.0f, -90.0f);
                    canvas.drawPath(path3, paint9);
                    float f45 = dp8 + f38;
                    Paint paint10 = this.c;
                    canvas.drawCircle(dp8, f45, dpf23, paint10);
                    Paint paint11 = this.b;
                    canvas.drawCircle(dp8, f45, (dpf23 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                    canvas.drawCircle(f36, f45, dpf23, paint10);
                    canvas.drawCircle(f36, f45, (dpf23 - AndroidUtilities.dp(1.0f)) + 1.0f, paint11);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f46 = dp8 + min6;
                    float f47 = f37 - min6;
                    canvas.drawLine(dp8, f46, dp8, f47, paint9);
                    canvas.drawLine(f36, f46, f36, f47, paint9);
                    Paint paint12 = this.r;
                    canvas.drawCircle(f36, f45, (AndroidUtilities.dp(1.0f) + dpf23) - 1.0f, paint12);
                    canvas.drawCircle(dp8, f45, (dpf23 + AndroidUtilities.dp(1.0f)) - 1.0f, paint12);
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
                    float dp10 = AndroidUtilities.dp(2.0f);
                    float dpf24 = AndroidUtilities.dpf2(5.66f);
                    float dp11 = dp10 + dpf24 + AndroidUtilities.dp(15.0f);
                    float f48 = dp11 * 2.0f;
                    float measuredWidth4 = getMeasuredWidth() - f48;
                    float measuredHeight4 = getMeasuredHeight() - f48;
                    RectF rectF4 = AndroidUtilities.rectTmp;
                    float f49 = dp11 + measuredWidth4;
                    float f50 = dp11 + measuredHeight4;
                    rectF4.set(dp11, dp11, f49, f50);
                    float dp12 = AndroidUtilities.dp(12.0f);
                    float min7 = Math.min(dp12, measuredWidth4 / 2.0f);
                    float f51 = measuredHeight4 / 2.0f;
                    float min8 = Math.min(dp12, f51);
                    Path path4 = this.s;
                    path4.rewind();
                    float f52 = min7 * 2.0f;
                    float f53 = dp11 + f52;
                    float f54 = 2.0f * min8;
                    float f55 = dp11 + f54;
                    rectF4.set(dp11, dp11, f53, f55);
                    path4.arcTo(rectF4, 180.0f, 90.0f);
                    float f56 = f49 - f52;
                    rectF4.set(f56, dp11, f49, f55);
                    path4.arcTo(rectF4, 270.0f, 90.0f);
                    Paint paint13 = this.a;
                    canvas.drawPath(path4, paint13);
                    path4.rewind();
                    float f57 = f50 - f54;
                    rectF4.set(dp11, f57, f53, f50);
                    path4.arcTo(rectF4, 180.0f, -90.0f);
                    rectF4.set(f56, f57, f49, f50);
                    path4.arcTo(rectF4, 90.0f, -90.0f);
                    canvas.drawPath(path4, paint13);
                    float f58 = dp11 + f51;
                    Paint paint14 = this.c;
                    canvas.drawCircle(dp11, f58, dpf24, paint14);
                    Paint paint15 = this.b;
                    canvas.drawCircle(dp11, f58, (dpf24 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                    canvas.drawCircle(f49, f58, dpf24, paint14);
                    canvas.drawCircle(f49, f58, (dpf24 - AndroidUtilities.dp(1.0f)) + 1.0f, paint15);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f59 = dp11 + min8;
                    float f60 = f50 - min8;
                    canvas.drawLine(dp11, f59, dp11, f60, paint13);
                    canvas.drawLine(f49, f59, f49, f60, paint13);
                    Paint paint16 = this.r;
                    canvas.drawCircle(f49, f58, (AndroidUtilities.dp(1.0f) + dpf24) - 1.0f, paint16);
                    canvas.drawCircle(dp11, f58, (dpf24 + AndroidUtilities.dp(1.0f)) - 1.0f, paint16);
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
                    float dp13 = AndroidUtilities.dp(2.0f);
                    float dpf25 = AndroidUtilities.dpf2(5.66f);
                    float dp14 = dp13 + dpf25 + AndroidUtilities.dp(15.0f);
                    float f61 = dp14 * 2.0f;
                    float measuredWidth5 = getMeasuredWidth() - f61;
                    float measuredHeight5 = getMeasuredHeight() - f61;
                    RectF rectF5 = AndroidUtilities.rectTmp;
                    float f62 = dp14 + measuredWidth5;
                    float f63 = dp14 + measuredHeight5;
                    rectF5.set(dp14, dp14, f62, f63);
                    float dp15 = AndroidUtilities.dp(12.0f);
                    float min9 = Math.min(dp15, measuredWidth5 / 2.0f);
                    float f64 = measuredHeight5 / 2.0f;
                    float min10 = Math.min(dp15, f64);
                    Path path5 = this.s;
                    path5.rewind();
                    float f65 = min9 * 2.0f;
                    float f66 = dp14 + f65;
                    float f67 = 2.0f * min10;
                    float f68 = dp14 + f67;
                    rectF5.set(dp14, dp14, f66, f68);
                    path5.arcTo(rectF5, 180.0f, 90.0f);
                    float f69 = f62 - f65;
                    rectF5.set(f69, dp14, f62, f68);
                    path5.arcTo(rectF5, 270.0f, 90.0f);
                    Paint paint17 = this.a;
                    canvas.drawPath(path5, paint17);
                    path5.rewind();
                    float f70 = f63 - f67;
                    rectF5.set(dp14, f70, f66, f63);
                    path5.arcTo(rectF5, 180.0f, -90.0f);
                    rectF5.set(f69, f70, f62, f63);
                    path5.arcTo(rectF5, 90.0f, -90.0f);
                    canvas.drawPath(path5, paint17);
                    float f71 = dp14 + f64;
                    Paint paint18 = this.c;
                    canvas.drawCircle(dp14, f71, dpf25, paint18);
                    Paint paint19 = this.b;
                    canvas.drawCircle(dp14, f71, (dpf25 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                    canvas.drawCircle(f62, f71, dpf25, paint18);
                    canvas.drawCircle(f62, f71, (dpf25 - AndroidUtilities.dp(1.0f)) + 1.0f, paint19);
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f72 = dp14 + min10;
                    float f73 = f63 - min10;
                    canvas.drawLine(dp14, f72, dp14, f73, paint17);
                    canvas.drawLine(f62, f72, f62, f73, paint17);
                    Paint paint20 = this.r;
                    canvas.drawCircle(f62, f71, (AndroidUtilities.dp(1.0f) + dpf25) - 1.0f, paint20);
                    canvas.drawCircle(dp14, f71, (dpf25 + AndroidUtilities.dp(1.0f)) - 1.0f, paint20);
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
                        int i10 = (int) (showAlpha6 * 255.0f);
                        canvas2 = canvas;
                        canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), i10, 31);
                    } else {
                        canvas2 = canvas;
                    }
                    float dp16 = AndroidUtilities.dp(2.0f);
                    float dpf26 = AndroidUtilities.dpf2(5.66f);
                    float dp17 = dp16 + dpf26 + AndroidUtilities.dp(15.0f);
                    float f74 = dp17 * 2.0f;
                    float measuredWidth6 = getMeasuredWidth() - f74;
                    float measuredHeight6 = getMeasuredHeight() - f74;
                    RectF rectF6 = AndroidUtilities.rectTmp;
                    float f75 = dp17 + measuredWidth6;
                    float f76 = dp17 + measuredHeight6;
                    rectF6.set(dp17, dp17, f75, f76);
                    float dp18 = AndroidUtilities.dp(12.0f);
                    float min11 = Math.min(dp18, measuredWidth6 / 2.0f);
                    float f77 = measuredHeight6 / 2.0f;
                    float min12 = Math.min(dp18, f77);
                    Path path6 = this.s;
                    path6.rewind();
                    float f78 = min11 * 2.0f;
                    float f79 = dp17 + f78;
                    float f80 = 2.0f * min12;
                    float f81 = dp17 + f80;
                    rectF6.set(dp17, dp17, f79, f81);
                    path6.arcTo(rectF6, 180.0f, 90.0f);
                    float f82 = f75 - f78;
                    rectF6.set(f82, dp17, f75, f81);
                    path6.arcTo(rectF6, 270.0f, 90.0f);
                    Paint paint21 = this.a;
                    canvas2.drawPath(path6, paint21);
                    path6.rewind();
                    float f83 = f76 - f80;
                    rectF6.set(dp17, f83, f79, f76);
                    path6.arcTo(rectF6, 180.0f, -90.0f);
                    rectF6.set(f82, f83, f75, f76);
                    path6.arcTo(rectF6, 90.0f, -90.0f);
                    canvas2.drawPath(path6, paint21);
                    float f84 = dp17 + f77;
                    Paint paint22 = this.c;
                    canvas2.drawCircle(dp17, f84, dpf26, paint22);
                    Paint paint23 = this.b;
                    canvas2.drawCircle(dp17, f84, (dpf26 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                    canvas2.drawCircle(f75, f84, dpf26, paint22);
                    canvas2.drawCircle(f75, f84, (dpf26 - AndroidUtilities.dp(1.0f)) + 1.0f, paint23);
                    canvas2.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), 255, 31);
                    float f85 = dp17 + min12;
                    float f86 = f76 - min12;
                    canvas.drawLine(dp17, f85, dp17, f86, paint21);
                    canvas.drawLine(f75, f85, f75, f86, paint21);
                    Paint paint24 = this.r;
                    canvas.drawCircle(f75, f84, (AndroidUtilities.dp(1.0f) + dpf26) - 1.0f, paint24);
                    canvas.drawCircle(dp17, f84, (dpf26 + AndroidUtilities.dp(1.0f)) - 1.0f, paint24);
                    canvas.restoreToCount(saveCount6);
                    break;
                }
                break;
        }
    }

    public r0(y2 y2Var, Context context) {
        super(y2Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(v0 v0Var, Context context) {
        super(v0Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(x2 x2Var, Context context) {
        super(x2Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(z1 z1Var, Context context) {
        super(z1Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public r0(g1 g1Var, Context context) {
        super(g1Var, context);
        Paint paint = new Paint(1);
        this.r = paint;
        this.s = new Path();
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }
}
