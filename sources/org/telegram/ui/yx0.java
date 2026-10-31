package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.SystemClock;
import android.view.View;
import java.util.Arrays;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class yx0 extends View implements org.telegram.ui.Components.qg0 {
    public final float[] D;
    public boolean E;
    public float F;
    public float G;
    public float[] H;
    public long I;
    public float J;
    public int K;
    public float L;
    public int M;
    public float N;
    public int O;
    public final /* synthetic */ ProfileActivity P;
    public final int a;
    public final Rect b;
    public final Rect c;
    public final RectF d;
    public final GradientDrawable e;
    public final GradientDrawable f;
    public final ValueAnimator h;
    public final float[] n;
    public final Paint r;
    public final Paint s;
    public final Paint w;
    public final GradientDrawable[] x;
    public final boolean[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public yx0(ProfileActivity profileActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.l lVar;
        int i10;
        int i11;
        boolean z10;
        this.P = profileActivity;
        lVar = ((org.telegram.ui.ActionBar.k2) profileActivity).actionBar;
        if (lVar.getOccupyStatusBar()) {
            z10 = ((org.telegram.ui.ActionBar.k2) profileActivity).inBubbleMode;
            if (!z10) {
                i10 = org.telegram.messenger.i0.m;
                this.a = i10;
                this.b = new Rect();
                this.c = new Rect();
                this.d = new RectF();
                this.n = new float[]{0.0f, 1.0f};
                this.x = new GradientDrawable[2];
                this.y = new boolean[2];
                this.D = new float[2];
                this.G = 0.0f;
                this.H = null;
                this.K = -1;
                this.O = 1;
                setVisibility(8);
                Paint paint = new Paint(1);
                this.s = paint;
                paint.setColor(1442840575);
                Paint paint2 = new Paint(1);
                this.w = paint2;
                paint2.setColor(-1);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
                this.e = gradientDrawable;
                gradientDrawable.setShape(0);
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
                this.f = gradientDrawable2;
                gradientDrawable2.setShape(0);
                i11 = 0;
                while (i11 < 2) {
                    this.x[i11] = new GradientDrawable(i11 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
                    this.x[i11].setShape(0);
                    i11++;
                }
                Paint paint3 = new Paint(1);
                this.r = paint3;
                paint3.setColor(-16777216);
                paint3.setAlpha(66);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.j);
                ofFloat.addUpdateListener(new a3(this, 26));
                ofFloat.addListener(new ns0(this, 3));
            }
        }
        i10 = 0;
        this.a = i10;
        this.b = new Rect();
        this.c = new Rect();
        this.d = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.x = new GradientDrawable[2];
        this.y = new boolean[2];
        this.D = new float[2];
        this.G = 0.0f;
        this.H = null;
        this.K = -1;
        this.O = 1;
        setVisibility(8);
        Paint paint4 = new Paint(1);
        this.s = paint4;
        paint4.setColor(1442840575);
        Paint paint22 = new Paint(1);
        this.w = paint22;
        paint22.setColor(-1);
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.e = gradientDrawable3;
        gradientDrawable3.setShape(0);
        GradientDrawable gradientDrawable22 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.f = gradientDrawable22;
        gradientDrawable22.setShape(0);
        i11 = 0;
        while (i11 < 2) {
        }
        Paint paint32 = new Paint(1);
        this.r = paint32;
        paint32.setColor(-16777216);
        paint32.setAlpha(66);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat2;
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(org.telegram.ui.Components.gr.j);
        ofFloat2.addUpdateListener(new a3(this, 26));
        ofFloat2.addListener(new ns0(this, 3));
    }

    @Override // org.telegram.ui.Components.qg0
    public final void a() {
        Arrays.fill(this.y, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.qg0
    public final void b(boolean z10) {
        this.y[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.qg0
    public final void c() {
        RectF rectF = ProfileActivity.R6;
        this.P.H5(false);
    }

    @Override // org.telegram.ui.Components.qg0
    public final void d() {
        invalidate();
    }

    public final void e(boolean z10, float f7) {
        int i10 = (int) (255.0f * f7);
        this.e.setAlpha(i10);
        this.f.setAlpha(i10);
        this.r.setAlpha((int) (66.0f * f7));
        this.s.setAlpha((int) (85.0f * f7));
        this.w.setAlpha(i10);
        this.G = f7;
        if (!z10) {
            this.F = f7;
        }
        invalidate();
    }

    public final void f(boolean z10, float f7) {
        if (z10 != this.E) {
            this.E = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f10 = this.F;
            float[] fArr = this.n;
            float U1 = org.telegram.messenger.i0.U1(f10, fArr);
            if (z10) {
                valueAnimator.setDuration((long) (((1.0f - U1) * 250.0f) / f7));
            } else {
                valueAnimator.setDuration((long) ((250.0f * U1) / f7));
            }
            fArr[0] = U1;
            fArr[1] = z10 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x020d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        float f7;
        float[] fArr2;
        float f10;
        boolean z10;
        boolean z11;
        Paint paint;
        float[] fArr3;
        int i10;
        int i11;
        long j10;
        float f11;
        int i12 = 0;
        while (true) {
            fArr = this.D;
            f7 = 0.0f;
            if (i12 >= 2) {
                break;
            }
            float f12 = fArr[i12];
            if (f12 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.x;
                gradientDrawableArr[i12].setAlpha((int) (f12 * 255.0f));
                gradientDrawableArr[i12].draw(canvas);
            }
            i12++;
        }
        this.e.draw(canvas);
        this.f.draw(canvas);
        Rect rect = this.b;
        Paint paint2 = this.r;
        canvas.drawRect(rect, paint2);
        canvas.drawRect(this.c, paint2);
        ProfileActivity profileActivity = this.P;
        int realCount = profileActivity.n0.getRealCount();
        this.M = profileActivity.n0.getRealPosition();
        float[] fArr4 = this.H;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.H = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - this.I;
        if (j11 < 0 || j11 > 20) {
            j11 = 17;
        }
        this.I = elapsedRealtime;
        float f13 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            f10 = 180.0f;
            z10 = false;
        } else {
            int i13 = profileActivity.A0;
            if (i13 == 0) {
                this.G = 0.0f;
                profileActivity.A0 = 3;
            } else if (i13 == 1) {
                this.G = 0.0f;
                profileActivity.A0 = 2;
            }
            int i14 = profileActivity.A0;
            Paint paint3 = this.w;
            Paint paint4 = this.s;
            if (i14 == 2) {
                paint4.setAlpha((int) (this.G * 85.0f));
                paint3.setAlpha((int) (this.G * 255.0f));
            }
            f10 = 180.0f;
            int y3 = org.telegram.messenger.z20.y((realCount - 1) * 2, getMeasuredWidth() - org.telegram.messenger.i0.L(10.0f), realCount);
            int L = org.telegram.messenger.i0.L(1.0f);
            z11 = ((org.telegram.ui.ActionBar.k2) profileActivity).inBubbleMode;
            int i15 = L + (!z11 ? org.telegram.messenger.i0.m : 0);
            int i16 = 0;
            z10 = false;
            while (i16 < realCount) {
                int L2 = (y3 * i16) + org.telegram.messenger.i0.L((i16 * 2) + 5);
                int i17 = this.K;
                float f14 = f7;
                RectF rectF = this.d;
                if (i16 != i17 || Math.abs(this.J - f13) <= 1.0E-4f) {
                    paint = paint3;
                    fArr3 = fArr;
                    i10 = realCount;
                    float f15 = f13;
                    i11 = 85;
                    if (i16 != this.M) {
                        j10 = j11;
                    } else if (profileActivity.n0.I()) {
                        f11 = profileActivity.n0.getCurrentItemProgress();
                        this.L = f11;
                        if ((f11 > f14 || !profileActivity.n0.J()) && this.N <= f14) {
                            j10 = j11;
                        } else {
                            float f16 = this.N;
                            int i18 = this.O;
                            j10 = j11;
                            float f17 = ((i18 * j10) / 500.0f) + f16;
                            this.N = f17;
                            if (f17 > f15) {
                                this.N = f15;
                                this.O = i18 * (-1);
                            } else if (f17 <= f14) {
                                this.N = f14;
                                this.O = i18 * (-1);
                            }
                        }
                        rectF.set(L2, i15, L2 + y3, org.telegram.messenger.i0.L(2.0f) + i15);
                        paint4.setAlpha((int) (((this.N * 48.0f) + 85.0f) * this.G));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint4);
                    } else {
                        j10 = j11;
                        this.L = f15;
                    }
                    f11 = 1.0f;
                    float f18 = L2;
                    rectF.set(f18, i15, (y3 * f11) + f18, org.telegram.messenger.i0.L(2.0f) + i15);
                    if (i16 != this.M) {
                        this.H[i16] = 0.75f;
                    } else if (profileActivity.A0 == 3) {
                        paint4.setAlpha((int) (org.telegram.messenger.i0.W1(org.telegram.ui.Components.gr.j.getInterpolation(this.H[i16]), i11, org.telegram.messenger.zs.e4) * this.G));
                    }
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), i16 != this.M ? paint : paint4);
                    i16++;
                    paint3 = paint;
                    fArr = fArr3;
                    realCount = i10;
                    j11 = j10;
                    f7 = 0.0f;
                    f13 = 1.0f;
                } else {
                    float f19 = this.J;
                    canvas.save();
                    float f20 = f13;
                    float f21 = L2;
                    paint = paint3;
                    fArr3 = fArr;
                    float f22 = i15;
                    i10 = realCount;
                    float f23 = L2 + y3;
                    canvas.clipRect((y3 * f19) + f21, f22, f23, org.telegram.messenger.i0.L(2.0f) + i15);
                    rectF.set(f21, f22, f23, org.telegram.messenger.i0.L(2.0f) + i15);
                    paint4.setAlpha((int) (this.G * 85.0f));
                    canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(f20), org.telegram.messenger.i0.L(f20), paint4);
                    canvas.restore();
                    j10 = j11;
                    f11 = f19;
                }
                i11 = 80;
                z10 = true;
                float f182 = L2;
                rectF.set(f182, i15, (y3 * f11) + f182, org.telegram.messenger.i0.L(2.0f) + i15);
                if (i16 != this.M) {
                }
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), i16 != this.M ? paint : paint4);
                i16++;
                paint3 = paint;
                fArr = fArr3;
                realCount = i10;
                j11 = j10;
                f7 = 0.0f;
                f13 = 1.0f;
            }
            fArr2 = fArr;
            long j12 = j11;
            int i19 = profileActivity.A0;
            if (i19 == 2) {
                float f24 = this.G;
                if (f24 < 1.0f) {
                    j11 = j12;
                    float f25 = (j11 / 180.0f) + f24;
                    this.G = f25;
                    if (f25 > 1.0f) {
                        this.G = 1.0f;
                    }
                    z10 = true;
                } else {
                    j11 = j12;
                    profileActivity.A0 = 3;
                }
            } else {
                j11 = j12;
                if (i19 == 3) {
                    int i20 = 0;
                    while (true) {
                        float[] fArr6 = this.H;
                        if (i20 >= fArr6.length) {
                            break;
                        }
                        if (i20 != this.M) {
                            float f26 = fArr6[i20];
                            if (f26 > 0.0f) {
                                float f27 = f26 - (j11 / 500.0f);
                                fArr6[i20] = f27;
                                if (f27 <= 0.0f) {
                                    fArr6[i20] = 0.0f;
                                    if (i20 == this.K) {
                                        this.K = -1;
                                    }
                                }
                                z10 = true;
                                i20++;
                            }
                        }
                        if (i20 == this.K) {
                            this.K = -1;
                        }
                        i20++;
                    }
                }
            }
        }
        for (int i21 = 0; i21 < 2; i21++) {
            if (this.y[i21]) {
                float f28 = fArr2[i21];
                if (f28 < 1.0f) {
                    float f29 = (j11 / f10) + f28;
                    fArr2[i21] = f29;
                    if (f29 > 1.0f) {
                        fArr2[i21] = 1.0f;
                    }
                    z10 = true;
                }
            } else {
                float f30 = fArr2[i21];
                if (f30 > 0.0f) {
                    float f31 = f30 - (j11 / f10);
                    fArr2[i21] = f31;
                    if (f31 < 0.0f) {
                        fArr2[i21] = 0.0f;
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
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + this.a;
        Rect rect = this.b;
        rect.set(0, 0, i10, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.c;
        rect2.set(0, (int) (i11 - (org.telegram.messenger.i0.L(72.0f) * 0.5f)), i10, i11);
        this.e.setBounds(0, rect.bottom, i10, org.telegram.messenger.i0.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.R6;
        this.f.setBounds(0, ((i11 - this.P.d4()) - org.telegram.messenger.i0.L(72.0f)) - org.telegram.messenger.i0.L(24.0f), i10, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.x;
        int i14 = i10 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i14, i11);
        gradientDrawableArr[1].setBounds(i10 - i14, 0, i10, i11);
    }
}
