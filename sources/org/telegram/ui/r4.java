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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class r4 extends View implements org.telegram.ui.Components.fh0 {
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
    public org.telegram.ui.Components.kh0 L;
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
        ofFloat.setInterpolator(org.telegram.ui.Components.jr.j);
        ofFloat.addUpdateListener(new g3(this, i10));
        ofFloat.addListener(new nh.q5(this, 7));
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

    @Override // org.telegram.ui.Components.fh0
    public final void a() {
        Arrays.fill(this.A, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.fh0
    public final void b(boolean z10) {
        this.A[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.fh0
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.kh0 getProfileGalleryView() {
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
        float f9;
        float f10;
        int i10;
        boolean z10;
        float f11;
        float[] fArr3;
        Paint paint2;
        Paint paint3;
        int i11;
        float f12;
        float f13;
        int i12 = 0;
        while (true) {
            fArr = this.B;
            if (i12 >= 2) {
                break;
            }
            float f14 = fArr[i12];
            if (f14 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.y;
                gradientDrawableArr[i12].setAlpha((int) (f14 * 255.0f));
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
        float f15 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            paint = paint4;
            f9 = 180.0f;
            f10 = 8.0f;
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
            f9 = 180.0f;
            Paint paint5 = this.v;
            f10 = 8.0f;
            Paint paint6 = this.s;
            if (i14 == 2) {
                paint6.setAlpha((int) (this.C * 85.0f));
                paint5.setAlpha((int) (this.C * 255.0f));
            }
            int x4 = b.x((realCount - 1) * 2, getMeasuredWidth() - AndroidUtilities.dp(10.0f), realCount);
            int dp = AndroidUtilities.dp(8.0f);
            int i15 = 0;
            z10 = false;
            while (i15 < realCount) {
                int dp2 = (x4 * i15) + AndroidUtilities.dp((i15 * 2) + 5);
                int i16 = this.G;
                RectF rectF = this.e;
                if (i15 != i16 || Math.abs(this.F - f15) <= 1.0E-4f) {
                    fArr3 = fArr;
                    paint2 = paint4;
                    paint3 = paint5;
                    i11 = 85;
                    if (i15 == this.I) {
                        if (this.L.I()) {
                            float currentItemProgress = this.L.getCurrentItemProgress();
                            this.H = currentItemProgress;
                            if ((currentItemProgress > 0.0f || !this.L.J()) && this.J <= 0.0f) {
                                f13 = currentItemProgress;
                            } else {
                                float f16 = this.J;
                                int i17 = this.K;
                                f13 = currentItemProgress;
                                float f17 = ((i17 * j10) / 500.0f) + f16;
                                this.J = f17;
                                if (f17 > 1.0f) {
                                    this.J = 1.0f;
                                    this.K = i17 * (-1);
                                } else if (f17 <= 0.0f) {
                                    this.J = 0.0f;
                                    this.K = i17 * (-1);
                                }
                            }
                            rectF.set(dp2, dp, dp2 + x4, AndroidUtilities.dp(2.0f) + dp);
                            paint6.setAlpha((int) (((this.J * 48.0f) + 85.0f) * this.C));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint6);
                            f12 = f13;
                        } else {
                            this.H = 1.0f;
                        }
                    }
                    f12 = 1.0f;
                    float f18 = dp2;
                    rectF.set(f18, dp, (x4 * f12) + f18, AndroidUtilities.dp(2.0f) + dp);
                    if (i15 != this.I) {
                        this.D[i15] = 0.75f;
                    } else if (this.b == 3) {
                        paint6.setAlpha((int) (AndroidUtilities.lerp(i11, 255, org.telegram.ui.Components.jr.j.getInterpolation(this.D[i15])) * this.C));
                    }
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.I ? paint3 : paint6);
                    i15++;
                    fArr = fArr3;
                    paint5 = paint3;
                    paint4 = paint2;
                    f15 = 1.0f;
                } else {
                    float f19 = this.F;
                    canvas.save();
                    float f20 = dp2;
                    fArr3 = fArr;
                    float f21 = dp;
                    paint3 = paint5;
                    float f22 = dp2 + x4;
                    paint2 = paint4;
                    canvas.clipRect((x4 * f19) + f20, f21, f22, AndroidUtilities.dp(2.0f) + dp);
                    rectF.set(f20, f21, f22, AndroidUtilities.dp(2.0f) + dp);
                    paint6.setAlpha((int) (this.C * 85.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint6);
                    canvas.restore();
                    f12 = f19;
                }
                i11 = 80;
                z10 = true;
                float f182 = dp2;
                rectF.set(f182, dp, (x4 * f12) + f182, AndroidUtilities.dp(2.0f) + dp);
                if (i15 != this.I) {
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.I ? paint3 : paint6);
                i15++;
                fArr = fArr3;
                paint5 = paint3;
                paint4 = paint2;
                f15 = 1.0f;
            }
            fArr2 = fArr;
            paint = paint4;
            int i18 = this.b;
            if (i18 == 2) {
                float f23 = this.C;
                if (f23 < 1.0f) {
                    float f24 = (j10 / 180.0f) + f23;
                    this.C = f24;
                    if (f24 > 1.0f) {
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
                        float f25 = fArr6[i19];
                        if (f25 > 0.0f) {
                            float f26 = f25 - (j10 / 500.0f);
                            fArr6[i19] = f26;
                            if (f26 <= 0.0f) {
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
            float measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(f10);
            RectF rectF2 = this.a;
            rectF2.right = measuredWidth;
            rectF2.left = measuredWidth - (AndroidUtilities.dpf2(16.0f) + measureText);
            float dp3 = AndroidUtilities.dp(f10);
            rectF2.top = dp3;
            rectF2.bottom = dp3 + AndroidUtilities.dp(26.0f);
            float dpf2 = AndroidUtilities.dpf2(12.0f);
            canvas.save();
            boolean z11 = realCount > 20;
            if (z11) {
                float f27 = this.N;
                if (f27 != 1.0f) {
                    this.N = (j10 / 150.0f) + f27;
                    f11 = this.N;
                    if (f11 < 1.0f) {
                        this.N = 1.0f;
                    } else if (f11 <= 0.0f) {
                        this.N = 0.0f;
                    } else {
                        invalidate();
                    }
                    float f28 = this.N;
                    canvas.scale(f28, f28, rectF2.centerX(), rectF2.centerY());
                    canvas.drawRoundRect(rectF2, dpf2, dpf2, paint);
                    canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
                    canvas.restore();
                }
            }
            if (!z11) {
                float f29 = this.N;
                if (f29 != 0.0f) {
                    this.N = f29 - (j10 / 150.0f);
                }
            }
            f11 = this.N;
            if (f11 < 1.0f) {
            }
            float f282 = this.N;
            canvas.scale(f282, f282, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, dpf2, dpf2, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (this.A[i20]) {
                float f30 = fArr2[i20];
                if (f30 < 1.0f) {
                    float f31 = (j10 / f9) + f30;
                    fArr2[i20] = f31;
                    if (f31 > 1.0f) {
                        fArr2[i20] = 1.0f;
                    }
                    z10 = true;
                }
            } else {
                float f32 = fArr2[i20];
                if (f32 > 0.0f) {
                    float f33 = f32 - (j10 / f9);
                    fArr2[i20] = f33;
                    if (f33 < 0.0f) {
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
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
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

    public void setProfileGalleryView(org.telegram.ui.Components.kh0 kh0Var) {
        this.L = kh0Var;
    }

    public void c() {
    }
}
