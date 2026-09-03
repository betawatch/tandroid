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

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public abstract class v4 extends View implements org.telegram.ui.Components.rh0 {
    public final boolean[] B;
    public final float[] C;
    public float D;
    public float[] E;
    public long F;
    public float G;
    public int H;
    public float I;
    public int J;
    public float K;
    public int L;
    public org.telegram.ui.Components.wh0 M;
    public final TextPaint N;
    public float O;
    public int P;
    public String Q;
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

    public v4(Context context) {
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
        this.B = new boolean[2];
        this.C = new float[2];
        this.D = 0.0f;
        this.E = null;
        this.H = -1;
        this.L = 1;
        this.P = -1;
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
        ofFloat.setInterpolator(org.telegram.ui.Components.mr.j);
        ofFloat.addUpdateListener(new g3(this, i10));
        ofFloat.addListener(new cg.l0(this, 28));
        TextPaint textPaint = new TextPaint(1);
        this.N = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(AndroidUtilities.dpf2(15.0f));
    }

    private String getCurrentTitle() {
        if (this.P != this.M.getCurrentItem()) {
            this.Q = ((String) this.M.getAdapter().d(this.M.getCurrentItem())).toString();
            this.P = this.M.getCurrentItem();
        }
        return this.Q;
    }

    @Override // org.telegram.ui.Components.rh0
    public final void a() {
        Arrays.fill(this.B, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.rh0
    public final void b(boolean z4) {
        this.B[!z4 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.rh0
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.wh0 getProfileGalleryView() {
        return this.M;
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
        boolean z4;
        float f12;
        float[] fArr3;
        Paint paint2;
        Paint paint3;
        int i11;
        float f13;
        float f14;
        int i12 = 0;
        while (true) {
            fArr = this.C;
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
        int realCount = this.M.getRealCount();
        this.J = this.M.getRealPosition();
        float[] fArr4 = this.E;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.E = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.F;
        if (j10 < 0 || j10 > 20) {
            j10 = 17;
        }
        this.F = elapsedRealtime;
        float f16 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            paint = paint4;
            f10 = 180.0f;
            f11 = 8.0f;
            i10 = 20;
            z4 = false;
        } else {
            int i13 = this.b;
            if (i13 == 0) {
                this.D = 0.0f;
                this.b = 3;
            } else if (i13 == 1) {
                this.D = 0.0f;
                this.b = 2;
            }
            int i14 = this.b;
            f10 = 180.0f;
            Paint paint5 = this.v;
            f11 = 8.0f;
            Paint paint6 = this.s;
            if (i14 == 2) {
                paint6.setAlpha((int) (this.D * 85.0f));
                paint5.setAlpha((int) (this.D * 255.0f));
            }
            int x10 = b.x((realCount - 1) * 2, getMeasuredWidth() - AndroidUtilities.dp(10.0f), realCount);
            int dp = AndroidUtilities.dp(8.0f);
            int i15 = 0;
            z4 = false;
            while (i15 < realCount) {
                int dp2 = (x10 * i15) + AndroidUtilities.dp((i15 * 2) + 5);
                int i16 = this.H;
                RectF rectF = this.e;
                if (i15 != i16 || Math.abs(this.G - f16) <= 1.0E-4f) {
                    fArr3 = fArr;
                    paint2 = paint4;
                    paint3 = paint5;
                    i11 = 85;
                    if (i15 == this.J) {
                        if (this.M.I()) {
                            float currentItemProgress = this.M.getCurrentItemProgress();
                            this.I = currentItemProgress;
                            if ((currentItemProgress > 0.0f || !this.M.J()) && this.K <= 0.0f) {
                                f14 = currentItemProgress;
                            } else {
                                float f17 = this.K;
                                int i17 = this.L;
                                f14 = currentItemProgress;
                                float f18 = ((i17 * j10) / 500.0f) + f17;
                                this.K = f18;
                                if (f18 > 1.0f) {
                                    this.K = 1.0f;
                                    this.L = i17 * (-1);
                                } else if (f18 <= 0.0f) {
                                    this.K = 0.0f;
                                    this.L = i17 * (-1);
                                }
                            }
                            rectF.set(dp2, dp, dp2 + x10, AndroidUtilities.dp(2.0f) + dp);
                            paint6.setAlpha((int) (((this.K * 48.0f) + 85.0f) * this.D));
                            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint6);
                            f13 = f14;
                        } else {
                            this.I = 1.0f;
                        }
                    }
                    f13 = 1.0f;
                    float f19 = dp2;
                    rectF.set(f19, dp, (x10 * f13) + f19, AndroidUtilities.dp(2.0f) + dp);
                    if (i15 != this.J) {
                        this.E[i15] = 0.75f;
                    } else if (this.b == 3) {
                        paint6.setAlpha((int) (AndroidUtilities.lerp(i11, 255, org.telegram.ui.Components.mr.j.getInterpolation(this.E[i15])) * this.D));
                    }
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.J ? paint3 : paint6);
                    i15++;
                    fArr = fArr3;
                    paint5 = paint3;
                    paint4 = paint2;
                    f16 = 1.0f;
                } else {
                    float f20 = this.G;
                    canvas.save();
                    float f21 = dp2;
                    fArr3 = fArr;
                    float f22 = dp;
                    paint3 = paint5;
                    float f23 = dp2 + x10;
                    paint2 = paint4;
                    canvas.clipRect((x10 * f20) + f21, f22, f23, AndroidUtilities.dp(2.0f) + dp);
                    rectF.set(f21, f22, f23, AndroidUtilities.dp(2.0f) + dp);
                    paint6.setAlpha((int) (this.D * 85.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint6);
                    canvas.restore();
                    f13 = f20;
                }
                i11 = 80;
                z4 = true;
                float f192 = dp2;
                rectF.set(f192, dp, (x10 * f13) + f192, AndroidUtilities.dp(2.0f) + dp);
                if (i15 != this.J) {
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.J ? paint3 : paint6);
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
                float f24 = this.D;
                if (f24 < 1.0f) {
                    float f25 = (j10 / 180.0f) + f24;
                    this.D = f25;
                    if (f25 > 1.0f) {
                        this.D = 1.0f;
                    }
                    i10 = 20;
                    z4 = true;
                } else {
                    this.b = 3;
                }
            } else if (i18 == 3) {
                int i19 = 0;
                while (true) {
                    float[] fArr6 = this.E;
                    if (i19 >= fArr6.length) {
                        break;
                    }
                    if (i19 != this.J) {
                        float f26 = fArr6[i19];
                        if (f26 > 0.0f) {
                            float f27 = f26 - (j10 / 500.0f);
                            fArr6[i19] = f27;
                            if (f27 <= 0.0f) {
                                fArr6[i19] = 0.0f;
                                if (i19 == this.H) {
                                    this.H = -1;
                                }
                            }
                            z4 = true;
                            i19++;
                        }
                    }
                    if (i19 == this.H) {
                        this.H = -1;
                    }
                    i19++;
                }
            }
            i10 = 20;
        }
        if (realCount > i10 || this.O != 0.0f) {
            String currentTitle = getCurrentTitle();
            TextPaint textPaint = this.N;
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
            boolean z10 = realCount > 20;
            if (z10) {
                float f28 = this.O;
                if (f28 != 1.0f) {
                    this.O = (j10 / 150.0f) + f28;
                    f12 = this.O;
                    if (f12 < 1.0f) {
                        this.O = 1.0f;
                    } else if (f12 <= 0.0f) {
                        this.O = 0.0f;
                    } else {
                        invalidate();
                    }
                    float f29 = this.O;
                    canvas.scale(f29, f29, rectF2.centerX(), rectF2.centerY());
                    canvas.drawRoundRect(rectF2, dpf2, dpf2, paint);
                    canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
                    canvas.restore();
                }
            }
            if (!z10) {
                float f30 = this.O;
                if (f30 != 0.0f) {
                    this.O = f30 - (j10 / 150.0f);
                }
            }
            f12 = this.O;
            if (f12 < 1.0f) {
            }
            float f292 = this.O;
            canvas.scale(f292, f292, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, dpf2, dpf2, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), AndroidUtilities.dpf2(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (this.B[i20]) {
                float f31 = fArr2[i20];
                if (f31 < 1.0f) {
                    float f32 = (j10 / f10) + f31;
                    fArr2[i20] = f32;
                    if (f32 > 1.0f) {
                        fArr2[i20] = 1.0f;
                    }
                    z4 = true;
                }
            } else {
                float f33 = fArr2[i20];
                if (f33 > 0.0f) {
                    float f34 = f33 - (j10 / f10);
                    fArr2[i20] = f34;
                    if (f34 < 0.0f) {
                        fArr2[i20] = 0.0f;
                    }
                    z4 = true;
                }
            }
        }
        if (z4) {
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

    public void setProfileGalleryView(org.telegram.ui.Components.wh0 wh0Var) {
        this.M = wh0Var;
    }

    @Override // org.telegram.ui.Components.rh0
    public void c() {
    }
}
