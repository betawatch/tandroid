package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.text.TextPaint;
import android.view.View;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class r4 extends View implements org.telegram.ui.Components.xg0 {
    public final boolean[] A;
    public final float[] B;
    public float C;
    public float[] D;
    public long E;
    public float F;
    public int G;
    public float H;
    public int I;
    public float J;
    public int K;
    public org.telegram.ui.Components.ch0 L;
    public final TextPaint M;
    public float N;
    public int O;
    public String P;
    public final RectF a;
    public int b;
    public final Rect c;
    public final Rect d;
    public final RectF e;
    public final GradientDrawable f;
    public final GradientDrawable h;
    public final float[] n;
    public final Paint r;
    public final Paint s;
    public final Paint v;
    public final Path w;
    public final RectF x;
    public final GradientDrawable[] y;

    public r4(Context context) {
        super(context);
        this.a = new RectF();
        int i10 = 1;
        this.b = 1;
        this.c = new Rect();
        this.d = new Rect();
        this.e = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.w = new Path();
        this.x = new RectF();
        this.y = new GradientDrawable[2];
        this.A = new boolean[2];
        this.B = new float[2];
        this.C = 0.0f;
        this.D = null;
        this.G = -1;
        this.K = 1;
        this.O = -1;
        Paint paint = new Paint(1);
        this.s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.v = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        int i11 = 0;
        while (i11 < 2) {
            this.y[i11] = new GradientDrawable(i11 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.y[i11].setShape(0);
            i11++;
        }
        Paint paint3 = new Paint(1);
        this.r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.er.j);
        ofFloat.addUpdateListener(new g3(this, i10));
        ofFloat.addListener(new lh.h9(this, 7));
        TextPaint textPaint = new TextPaint(1);
        this.M = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    private String getCurrentTitle() {
        if (this.O != this.L.getCurrentItem()) {
            this.P = ((String) this.L.getAdapter().d(this.L.getCurrentItem())).toString();
            this.O = this.L.getCurrentItem();
        }
        return this.P;
    }

    @Override // org.telegram.ui.Components.xg0
    public final void a() {
        Arrays.fill(this.A, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.xg0
    public final void b(boolean z10) {
        this.A[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.xg0
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.ch0 getProfileGalleryView() {
        return this.L;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01f3  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float[] fArr;
        float[] fArr2;
        Paint paint;
        float f10;
        float f11;
        int i10;
        boolean z10;
        float f12;
        float[] fArr3;
        Paint paint2;
        Paint paint3;
        int i11;
        float f13;
        float f14;
        int i12 = 0;
        while (true) {
            fArr = this.B;
            if (i12 >= 2) {
                break;
            }
            float f15 = fArr[i12];
            if (f15 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.y;
                gradientDrawableArr[i12].setAlpha((int) (f15 * 255.0f));
                gradientDrawableArr[i12].draw(canvas);
            }
            i12++;
        }
        this.f.draw(canvas);
        Rect rect = this.c;
        Paint paint4 = this.r;
        canvas.drawRect(rect, paint4);
        int realCount = this.L.getRealCount();
        this.I = this.L.getRealPosition();
        float[] fArr4 = this.D;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.D = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.E;
        if (j10 < 0 || j10 > 20) {
            j10 = 17;
        }
        this.E = elapsedRealtime;
        float f16 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            paint = paint4;
            f10 = 180.0f;
            f11 = 8.0f;
            i10 = 20;
            z10 = false;
        } else {
            int i13 = this.b;
            if (i13 == 0) {
                this.C = 0.0f;
                this.b = 3;
            } else if (i13 == 1) {
                this.C = 0.0f;
                this.b = 2;
            }
            int i14 = this.b;
            f10 = 180.0f;
            Paint paint5 = this.v;
            f11 = 8.0f;
            Paint paint6 = this.s;
            if (i14 == 2) {
                paint6.setAlpha((int) (this.C * 85.0f));
                paint5.setAlpha((int) (this.C * 255.0f));
            }
            int x8 = org.telegram.messenger.rl.x((realCount - 1) * 2, getMeasuredWidth() - AndroidUtilities.dp(10.0f), realCount);
            int dp = AndroidUtilities.dp(8.0f);
            int i15 = 0;
            z10 = false;
            while (i15 < realCount) {
                int dp2 = (x8 * i15) + AndroidUtilities.dp((i15 * 2) + 5);
                int i16 = this.G;
                RectF rectF = this.e;
                if (i15 != i16 || Math.abs(this.F - f16) <= 1.0E-4f) {
                    fArr3 = fArr;
                    paint2 = paint4;
                    paint3 = paint5;
                    i11 = 85;
                    if (i15 == this.I) {
                        if (this.L.I()) {
                            float currentItemProgress = this.L.getCurrentItemProgress();
                            this.H = currentItemProgress;
                            if ((currentItemProgress > 0.0f || !this.L.J()) && this.J <= 0.0f) {
                                f14 = currentItemProgress;
                            } else {
                                float f17 = this.J;
                                int i17 = this.K;
                                f14 = currentItemProgress;
                                float f18 = ((i17 * j10) / 500.0f) + f17;
                                this.J = f18;
                                if (f18 > 1.0f) {
                                    this.J = 1.0f;
                                    this.K = i17 * (-1);
                                } else if (f18 <= 0.0f) {
                                    this.J = 0.0f;
                                    this.K = i17 * (-1);
                                }
                            }
                            rectF.set(dp2, dp, dp2 + x8, AndroidUtilities.dp(2.0f) + dp);
                            paint6.setAlpha((int) (((this.J * 48.0f) + 85.0f) * this.C));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint6);
                            f13 = f14;
                        } else {
                            this.H = 1.0f;
                        }
                    }
                    f13 = 1.0f;
                    float f19 = dp2;
                    rectF.set(f19, dp, (x8 * f13) + f19, AndroidUtilities.dp(2.0f) + dp);
                    if (i15 != this.I) {
                        this.D[i15] = 0.75f;
                    } else if (this.b == 3) {
                        paint6.setAlpha((int) (AndroidUtilities.lerp(i11, 255, org.telegram.ui.Components.er.j.getInterpolation(this.D[i15])) * this.C));
                    }
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.I ? paint3 : paint6);
                    i15++;
                    fArr = fArr3;
                    paint5 = paint3;
                    paint4 = paint2;
                    f16 = 1.0f;
                } else {
                    float f20 = this.F;
                    canvas.save();
                    float f21 = dp2;
                    fArr3 = fArr;
                    float f22 = dp;
                    paint3 = paint5;
                    float f23 = dp2 + x8;
                    paint2 = paint4;
                    canvas.clipRect((x8 * f20) + f21, f22, f23, AndroidUtilities.dp(2.0f) + dp);
                    rectF.set(f21, f22, f23, AndroidUtilities.dp(2.0f) + dp);
                    paint6.setAlpha((int) (this.C * 85.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint6);
                    canvas.restore();
                    f13 = f20;
                }
                i11 = 80;
                z10 = true;
                float f192 = dp2;
                rectF.set(f192, dp, (x8 * f13) + f192, AndroidUtilities.dp(2.0f) + dp);
                if (i15 != this.I) {
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.I ? paint3 : paint6);
                i15++;
                fArr = fArr3;
                paint5 = paint3;
                paint4 = paint2;
                f16 = 1.0f;
            }
            fArr2 = fArr;
            paint = paint4;
            int i18 = this.b;
            if (i18 == 2) {
                float f24 = this.C;
                if (f24 < 1.0f) {
                    float f25 = (j10 / 180.0f) + f24;
                    this.C = f25;
                    if (f25 > 1.0f) {
                        this.C = 1.0f;
                    }
                    i10 = 20;
                    z10 = true;
                } else {
                    this.b = 3;
                }
            } else if (i18 == 3) {
                int i19 = 0;
                while (true) {
                    float[] fArr6 = this.D;
                    if (i19 >= fArr6.length) {
                        break;
                    }
                    if (i19 != this.I) {
                        float f26 = fArr6[i19];
                        if (f26 > 0.0f) {
                            float f27 = f26 - (j10 / 500.0f);
                            fArr6[i19] = f27;
                            if (f27 <= 0.0f) {
                                fArr6[i19] = 0.0f;
                                if (i19 == this.G) {
                                    this.G = -1;
                                }
                            }
                            z10 = true;
                            i19++;
                        }
                    }
                    if (i19 == this.G) {
                        this.G = -1;
                    }
                    i19++;
                }
            }
            i10 = 20;
        }
        if (realCount > i10 || this.N != 0.0f) {
            String currentTitle = getCurrentTitle();
            TextPaint textPaint = this.M;
            float measureText = textPaint.measureText(currentTitle);
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(f11);
            RectF rectF2 = this.a;
            rectF2.right = measuredWidth;
            rectF2.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
            float dp3 = AndroidUtilities.dp(f11);
            rectF2.top = dp3;
            rectF2.bottom = dp3 + AndroidUtilities.dp(26.0f);
            float dpf2 = AndroidUtilities.dpf2(12.0f);
            canvas.save();
            boolean z11 = realCount > 20;
            if (z11) {
                float f28 = this.N;
                if (f28 != 1.0f) {
                    this.N = (j10 / 150.0f) + f28;
                    f12 = this.N;
                    if (f12 < 1.0f) {
                        this.N = 1.0f;
                    } else if (f12 <= 0.0f) {
                        this.N = 0.0f;
                    } else {
                        invalidate();
                    }
                    float f29 = this.N;
                    canvas.scale(f29, f29, rectF2.centerX(), rectF2.centerY());
                    canvas.drawRoundRect(rectF2, dpf2, dpf2, paint);
                    canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
                    canvas.restore();
                }
            }
            if (!z11) {
                float f30 = this.N;
                if (f30 != 0.0f) {
                    this.N = f30 - (j10 / 150.0f);
                }
            }
            f12 = this.N;
            if (f12 < 1.0f) {
            }
            float f292 = this.N;
            canvas.scale(f292, f292, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, dpf2, dpf2, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (this.A[i20]) {
                float f31 = fArr2[i20];
                if (f31 < 1.0f) {
                    float f32 = (j10 / f10) + f31;
                    fArr2[i20] = f32;
                    if (f32 > 1.0f) {
                        fArr2[i20] = 1.0f;
                    }
                    z10 = true;
                }
            } else {
                float f33 = fArr2[i20];
                if (f33 > 0.0f) {
                    float f34 = f33 - (j10 / f10);
                    fArr2[i20] = f34;
                    if (f34 < 0.0f) {
                        fArr2[i20] = 0.0f;
                    }
                    z10 = true;
                }
            }
        }
        if (z10) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        Path path = this.w;
        path.reset();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.x;
        rectF.set(0.0f, 0.0f, measuredHeight, measuredWidth);
        path.addRoundRect(rectF, new float[]{AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.c;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i11 - (AndroidUtilities.dp(72.0f) * 0.5f)), i10, i11);
        this.f.setBounds(0, rect.bottom, i10, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i11 - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.y;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.ch0 ch0Var) {
        this.L = ch0Var;
    }

    public void c() {
    }
}
