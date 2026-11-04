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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class s4 extends View implements org.telegram.ui.Components.rf0 {
    public final GradientDrawable[] E;
    public final boolean[] F;
    public final float[] G;
    public float H;
    public float[] I;
    public long J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public org.telegram.ui.Components.vf0 Q;
    public final TextPaint R;
    public float S;
    public int T;
    public String U;
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
    public final Paint w;
    public final Path x;
    public final RectF y;

    public s4(Context context) {
        super(context);
        this.a = new RectF();
        int i3 = 1;
        this.b = 1;
        this.c = new Rect();
        this.d = new Rect();
        this.e = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.x = new Path();
        this.y = new RectF();
        this.E = new GradientDrawable[2];
        this.F = new boolean[2];
        this.G = new float[2];
        this.H = 0.0f;
        this.I = null;
        this.L = -1;
        this.P = 1;
        this.T = -1;
        Paint paint = new Paint(1);
        this.s = paint;
        paint.setColor(1442840575);
        Paint paint2 = new Paint(1);
        this.w = paint2;
        paint2.setColor(-1);
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.f = gradientDrawable;
        gradientDrawable.setShape(0);
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.h = gradientDrawable2;
        gradientDrawable2.setShape(0);
        int i10 = 0;
        while (i10 < 2) {
            this.E[i10] = new GradientDrawable(i10 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
            this.E[i10].setShape(0);
            i10++;
        }
        Paint paint3 = new Paint(1);
        this.r = paint3;
        paint3.setColor(-16777216);
        paint3.setAlpha(66);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.setDuration(250L);
        ofFloat.setInterpolator(org.telegram.ui.Components.xq.j);
        ofFloat.addUpdateListener(new b3(this, i3));
        ofFloat.addListener(new ii.v3(this, 16));
        TextPaint textPaint = new TextPaint(1);
        this.R = textPaint;
        textPaint.setColor(-1);
        textPaint.setTypeface(Typeface.SANS_SERIF);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setTextSize(org.telegram.messenger.g0.N(15.0f));
    }

    private String getCurrentTitle() {
        if (this.T != this.Q.getCurrentItem()) {
            this.U = ((String) this.Q.getAdapter().d(this.Q.getCurrentItem())).toString();
            this.T = this.Q.getCurrentItem();
        }
        return this.U;
    }

    @Override // org.telegram.ui.Components.rf0
    public final void a() {
        Arrays.fill(this.F, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.rf0
    public final void b(boolean z10) {
        this.F[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.rf0
    public final void d() {
        invalidate();
    }

    public org.telegram.ui.Components.vf0 getProfileGalleryView() {
        return this.Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:120:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01ee  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onDraw(Canvas canvas) {
        float[] fArr;
        float f10;
        float[] fArr2;
        Paint paint;
        float f11;
        float f12;
        int i3;
        boolean z10;
        float f13;
        float[] fArr3;
        Paint paint2;
        Paint paint3;
        int i10;
        float f14;
        float f15;
        int i11 = 0;
        while (true) {
            fArr = this.G;
            f10 = 0.0f;
            if (i11 >= 2) {
                break;
            }
            float f16 = fArr[i11];
            if (f16 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.E;
                gradientDrawableArr[i11].setAlpha((int) (f16 * 255.0f));
                gradientDrawableArr[i11].draw(canvas);
            }
            i11++;
        }
        this.f.draw(canvas);
        Rect rect = this.c;
        Paint paint4 = this.r;
        canvas.drawRect(rect, paint4);
        int realCount = this.Q.getRealCount();
        this.N = this.Q.getRealPosition();
        float[] fArr4 = this.I;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.I = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = elapsedRealtime - this.J;
        if (j10 < 0 || j10 > 20) {
            j10 = 17;
        }
        this.J = elapsedRealtime;
        float f17 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            paint = paint4;
            f11 = 180.0f;
            f12 = 8.0f;
            i3 = 20;
            z10 = false;
        } else {
            int i12 = this.b;
            if (i12 == 0) {
                this.H = 0.0f;
                this.b = 3;
            } else if (i12 == 1) {
                this.H = 0.0f;
                this.b = 2;
            }
            int i13 = this.b;
            f11 = 180.0f;
            Paint paint5 = this.w;
            f12 = 8.0f;
            Paint paint6 = this.s;
            if (i13 == 2) {
                paint6.setAlpha((int) (this.H * 85.0f));
                paint5.setAlpha((int) (this.H * 255.0f));
            }
            int y9 = org.telegram.messenger.camera.q.y((realCount - 1) * 2, getMeasuredWidth() - org.telegram.messenger.g0.L(10.0f), realCount);
            int L = org.telegram.messenger.g0.L(8.0f);
            int i14 = 0;
            z10 = false;
            while (i14 < realCount) {
                int L2 = (y9 * i14) + org.telegram.messenger.g0.L((i14 * 2) + 5);
                int i15 = this.L;
                float f18 = f10;
                RectF rectF = this.e;
                if (i14 != i15 || Math.abs(this.K - f17) <= 1.0E-4f) {
                    fArr3 = fArr;
                    paint2 = paint4;
                    paint3 = paint5;
                    float f19 = f17;
                    i10 = 85;
                    if (i14 == this.N) {
                        if (this.Q.I()) {
                            float currentItemProgress = this.Q.getCurrentItemProgress();
                            this.M = currentItemProgress;
                            if ((currentItemProgress > f18 || !this.Q.J()) && this.O <= f18) {
                                f15 = currentItemProgress;
                            } else {
                                float f20 = this.O;
                                int i16 = this.P;
                                f15 = currentItemProgress;
                                float f21 = ((i16 * j10) / 500.0f) + f20;
                                this.O = f21;
                                if (f21 > f19) {
                                    this.O = f19;
                                    this.P = i16 * (-1);
                                } else if (f21 <= f18) {
                                    this.O = f18;
                                    this.P = i16 * (-1);
                                }
                            }
                            rectF.set(L2, L, L2 + y9, org.telegram.messenger.g0.L(2.0f) + L);
                            paint6.setAlpha((int) (((this.O * 48.0f) + 85.0f) * this.H));
                            canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), paint6);
                            f14 = f15;
                        } else {
                            this.M = f19;
                        }
                    }
                    f14 = 1.0f;
                    float f22 = L2;
                    rectF.set(f22, L, (y9 * f14) + f22, org.telegram.messenger.g0.L(2.0f) + L);
                    if (i14 != this.N) {
                        this.I[i14] = 0.75f;
                    } else if (this.b == 3) {
                        paint6.setAlpha((int) (org.telegram.messenger.g0.W1(org.telegram.ui.Components.xq.j.getInterpolation(this.I[i14]), i10, org.telegram.messenger.hs.e4) * this.H));
                    }
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), i14 != this.N ? paint3 : paint6);
                    i14++;
                    fArr = fArr3;
                    paint5 = paint3;
                    paint4 = paint2;
                    f10 = 0.0f;
                    f17 = 1.0f;
                } else {
                    float f23 = this.K;
                    canvas.save();
                    float f24 = f17;
                    float f25 = L2;
                    fArr3 = fArr;
                    float f26 = L;
                    paint3 = paint5;
                    float f27 = L2 + y9;
                    paint2 = paint4;
                    canvas.clipRect((y9 * f23) + f25, f26, f27, org.telegram.messenger.g0.L(2.0f) + L);
                    rectF.set(f25, f26, f27, org.telegram.messenger.g0.L(2.0f) + L);
                    paint6.setAlpha((int) (this.H * 85.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(f24), org.telegram.messenger.g0.L(f24), paint6);
                    canvas.restore();
                    f14 = f23;
                }
                i10 = 80;
                z10 = true;
                float f222 = L2;
                rectF.set(f222, L, (y9 * f14) + f222, org.telegram.messenger.g0.L(2.0f) + L);
                if (i14 != this.N) {
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(1.0f), i14 != this.N ? paint3 : paint6);
                i14++;
                fArr = fArr3;
                paint5 = paint3;
                paint4 = paint2;
                f10 = 0.0f;
                f17 = 1.0f;
            }
            fArr2 = fArr;
            paint = paint4;
            int i17 = this.b;
            if (i17 == 2) {
                float f28 = this.H;
                if (f28 < 1.0f) {
                    float f29 = (j10 / 180.0f) + f28;
                    this.H = f29;
                    if (f29 > 1.0f) {
                        this.H = 1.0f;
                    }
                    i3 = 20;
                    z10 = true;
                } else {
                    this.b = 3;
                }
            } else if (i17 == 3) {
                int i18 = 0;
                while (true) {
                    float[] fArr6 = this.I;
                    if (i18 >= fArr6.length) {
                        break;
                    }
                    if (i18 != this.N) {
                        float f30 = fArr6[i18];
                        if (f30 > 0.0f) {
                            float f31 = f30 - (j10 / 500.0f);
                            fArr6[i18] = f31;
                            if (f31 <= 0.0f) {
                                fArr6[i18] = 0.0f;
                                if (i18 == this.L) {
                                    this.L = -1;
                                }
                            }
                            z10 = true;
                            i18++;
                        }
                    }
                    if (i18 == this.L) {
                        this.L = -1;
                    }
                    i18++;
                }
            }
            i3 = 20;
        }
        if (realCount > i3 || this.S != 0.0f) {
            String currentTitle = getCurrentTitle();
            TextPaint textPaint = this.R;
            float measureText = textPaint.measureText(currentTitle);
            float measuredWidth = getMeasuredWidth() - org.telegram.messenger.g0.L(f12);
            RectF rectF2 = this.a;
            rectF2.right = measuredWidth;
            rectF2.left = measuredWidth - (org.telegram.messenger.g0.N(16.0f) + measureText);
            float L3 = org.telegram.messenger.g0.L(f12);
            rectF2.top = L3;
            rectF2.bottom = L3 + org.telegram.messenger.g0.L(26.0f);
            float N = org.telegram.messenger.g0.N(12.0f);
            canvas.save();
            boolean z11 = realCount > 20;
            if (z11) {
                float f32 = this.S;
                if (f32 != 1.0f) {
                    this.S = (j10 / 150.0f) + f32;
                    f13 = this.S;
                    if (f13 < 1.0f) {
                        this.S = 1.0f;
                    } else if (f13 <= 0.0f) {
                        this.S = 0.0f;
                    } else {
                        invalidate();
                    }
                    float f33 = this.S;
                    canvas.scale(f33, f33, rectF2.centerX(), rectF2.centerY());
                    canvas.drawRoundRect(rectF2, N, N, paint);
                    canvas.drawText(getCurrentTitle(), rectF2.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF2.top, textPaint);
                    canvas.restore();
                }
            }
            if (!z11) {
                float f34 = this.S;
                if (f34 != 0.0f) {
                    this.S = f34 - (j10 / 150.0f);
                }
            }
            f13 = this.S;
            if (f13 < 1.0f) {
            }
            float f332 = this.S;
            canvas.scale(f332, f332, rectF2.centerX(), rectF2.centerY());
            canvas.drawRoundRect(rectF2, N, N, paint);
            canvas.drawText(getCurrentTitle(), rectF2.centerX(), org.telegram.messenger.g0.N(18.5f) + rectF2.top, textPaint);
            canvas.restore();
        }
        for (int i19 = 0; i19 < 2; i19++) {
            if (this.F[i19]) {
                float f35 = fArr2[i19];
                if (f35 < 1.0f) {
                    float f36 = (j10 / f11) + f35;
                    fArr2[i19] = f36;
                    if (f36 > 1.0f) {
                        fArr2[i19] = 1.0f;
                    }
                    z10 = true;
                }
            } else {
                float f37 = fArr2[i19];
                if (f37 > 0.0f) {
                    float f38 = f37 - (j10 / f11);
                    fArr2[i19] = f38;
                    if (f38 < 0.0f) {
                        fArr2[i19] = 0.0f;
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
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, i10);
        Path path = this.x;
        path.reset();
        float measuredHeight = getMeasuredHeight();
        float measuredWidth = getMeasuredWidth();
        RectF rectF = this.y;
        rectF.set(0.0f, 0.0f, measuredHeight, measuredWidth);
        path.addRoundRect(rectF, new float[]{org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), org.telegram.messenger.g0.L(13.0f), 0.0f, 0.0f, 0.0f, 0.0f}, Path.Direction.CCW);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        Rect rect = this.c;
        rect.set(0, 0, i3, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.d;
        rect2.set(0, (int) (i10 - (org.telegram.messenger.g0.L(72.0f) * 0.5f)), i3, i10);
        this.f.setBounds(0, rect.bottom, i3, org.telegram.messenger.g0.L(16.0f) + currentActionBarHeight);
        this.h.setBounds(0, (i10 - org.telegram.messenger.g0.L(72.0f)) - org.telegram.messenger.g0.L(24.0f), i3, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.E;
        int i13 = i3 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i3 - i13, 0, i3, i10);
    }

    public void setProfileGalleryView(org.telegram.ui.Components.vf0 vf0Var) {
        this.Q = vf0Var;
    }

    @Override // org.telegram.ui.Components.rf0
    public void c() {
    }
}
