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
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class wz0 extends View implements org.telegram.ui.Components.vg0 {
    public boolean A;
    public float B;
    public float C;
    public float[] D;
    public long E;
    public float F;
    public int G;
    public float H;
    public int I;
    public float J;
    public int K;
    public final /* synthetic */ ProfileActivity L;
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
    public final Paint v;
    public final GradientDrawable[] w;
    public final boolean[] x;
    public final float[] y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wz0(ProfileActivity profileActivity, Context context) {
        super(context);
        org.telegram.ui.ActionBar.k kVar;
        int i9;
        int i10;
        boolean z10;
        this.L = profileActivity;
        kVar = ((org.telegram.ui.ActionBar.o2) profileActivity).actionBar;
        if (kVar.getOccupyStatusBar()) {
            z10 = ((org.telegram.ui.ActionBar.o2) profileActivity).inBubbleMode;
            if (!z10) {
                i9 = AndroidUtilities.statusBarHeight;
                this.a = i9;
                this.b = new Rect();
                this.c = new Rect();
                this.d = new RectF();
                this.n = new float[]{0.0f, 1.0f};
                this.w = new GradientDrawable[2];
                this.x = new boolean[2];
                this.y = new float[2];
                this.C = 0.0f;
                this.D = null;
                this.G = -1;
                this.K = 1;
                setVisibility(8);
                Paint paint = new Paint(1);
                this.s = paint;
                paint.setColor(1442840575);
                Paint paint2 = new Paint(1);
                this.v = paint2;
                paint2.setColor(-1);
                GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
                this.e = gradientDrawable;
                gradientDrawable.setShape(0);
                GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
                this.f = gradientDrawable2;
                gradientDrawable2.setShape(0);
                i10 = 0;
                while (i10 < 2) {
                    this.w[i10] = new GradientDrawable(i10 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
                    this.w[i10].setShape(0);
                    i10++;
                }
                Paint paint3 = new Paint(1);
                this.r = paint3;
                paint3.setColor(-16777216);
                paint3.setAlpha(66);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(org.telegram.ui.Components.gr.j);
                ofFloat.addUpdateListener(new f3(this, 28));
                ofFloat.addListener(new bc0(this, 20));
            }
        }
        i9 = 0;
        this.a = i9;
        this.b = new Rect();
        this.c = new Rect();
        this.d = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.w = new GradientDrawable[2];
        this.x = new boolean[2];
        this.y = new float[2];
        this.C = 0.0f;
        this.D = null;
        this.G = -1;
        this.K = 1;
        setVisibility(8);
        Paint paint4 = new Paint(1);
        this.s = paint4;
        paint4.setColor(1442840575);
        Paint paint22 = new Paint(1);
        this.v = paint22;
        paint22.setColor(-1);
        GradientDrawable gradientDrawable3 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{1107296256, 0});
        this.e = gradientDrawable3;
        gradientDrawable3.setShape(0);
        GradientDrawable gradientDrawable22 = new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1107296256, 0});
        this.f = gradientDrawable22;
        gradientDrawable22.setShape(0);
        i10 = 0;
        while (i10 < 2) {
        }
        Paint paint32 = new Paint(1);
        this.r = paint32;
        paint32.setColor(-16777216);
        paint32.setAlpha(66);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat2;
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(org.telegram.ui.Components.gr.j);
        ofFloat2.addUpdateListener(new f3(this, 28));
        ofFloat2.addListener(new bc0(this, 20));
    }

    @Override // org.telegram.ui.Components.vg0
    public final void a() {
        Arrays.fill(this.x, false);
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.vg0
    public final void b(boolean z10) {
        this.x[!z10 ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // org.telegram.ui.Components.vg0
    public final void c() {
        this.L.i5(false);
    }

    @Override // org.telegram.ui.Components.vg0
    public final void d() {
        invalidate();
    }

    public final void e(float f10, boolean z10) {
        int i9 = (int) (255.0f * f10);
        this.e.setAlpha(i9);
        this.f.setAlpha(i9);
        this.r.setAlpha((int) (66.0f * f10));
        this.s.setAlpha((int) (85.0f * f10));
        this.v.setAlpha(i9);
        this.C = f10;
        if (!z10) {
            this.B = f10;
        }
        invalidate();
    }

    public final void f(float f10, boolean z10) {
        if (z10 != this.A) {
            this.A = z10;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f11 = this.B;
            float[] fArr = this.n;
            float lerp = AndroidUtilities.lerp(fArr, f11);
            if (z10) {
                valueAnimator.setDuration((long) (((1.0f - lerp) * 250.0f) / f10));
            } else {
                valueAnimator.setDuration((long) ((250.0f * lerp) / f10));
            }
            fArr[0] = lerp;
            fArr[1] = z10 ? 1.0f : 0.0f;
            valueAnimator.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0214  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float[] fArr;
        float[] fArr2;
        float f10;
        boolean z10;
        boolean z11;
        Paint paint;
        float[] fArr3;
        int i9;
        int i10;
        long j10;
        float f11;
        int i11 = 0;
        while (true) {
            fArr = this.y;
            if (i11 >= 2) {
                break;
            }
            float f12 = fArr[i11];
            if (f12 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.w;
                gradientDrawableArr[i11].setAlpha((int) (f12 * 255.0f));
                gradientDrawableArr[i11].draw(canvas);
            }
            i11++;
        }
        this.e.draw(canvas);
        this.f.draw(canvas);
        Rect rect = this.b;
        Paint paint2 = this.r;
        canvas.drawRect(rect, paint2);
        canvas.drawRect(this.c, paint2);
        ProfileActivity profileActivity = this.L;
        int realCount = profileActivity.j0.getRealCount();
        this.I = profileActivity.j0.getRealPosition();
        float[] fArr4 = this.D;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.D = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j11 = elapsedRealtime - this.E;
        if (j11 < 0 || j11 > 20) {
            j11 = 17;
        }
        this.E = elapsedRealtime;
        float f13 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            f10 = 180.0f;
            z10 = false;
        } else {
            int i12 = profileActivity.w0;
            if (i12 == 0) {
                this.C = 0.0f;
                profileActivity.w0 = 3;
            } else if (i12 == 1) {
                this.C = 0.0f;
                profileActivity.w0 = 2;
            }
            int i13 = profileActivity.w0;
            Paint paint3 = this.v;
            Paint paint4 = this.s;
            if (i13 == 2) {
                paint4.setAlpha((int) (this.C * 85.0f));
                paint3.setAlpha((int) (this.C * 255.0f));
            }
            f10 = 180.0f;
            int y10 = org.telegram.messenger.ll.y((realCount - 1) * 2, getMeasuredWidth() - AndroidUtilities.dp(10.0f), realCount);
            int dp = AndroidUtilities.dp(4.0f);
            z11 = ((org.telegram.ui.ActionBar.o2) profileActivity).inBubbleMode;
            int i14 = dp + (!z11 ? AndroidUtilities.statusBarHeight : 0);
            int i15 = 0;
            z10 = false;
            while (i15 < realCount) {
                int dp2 = (y10 * i15) + AndroidUtilities.dp((i15 * 2) + 5);
                int i16 = this.G;
                RectF rectF = this.d;
                if (i15 != i16 || Math.abs(this.F - f13) <= 1.0E-4f) {
                    paint = paint3;
                    fArr3 = fArr;
                    i9 = realCount;
                    i10 = 85;
                    if (i15 != this.I) {
                        j10 = j11;
                    } else if (profileActivity.j0.I()) {
                        f11 = profileActivity.j0.getCurrentItemProgress();
                        this.H = f11;
                        if ((f11 > 0.0f || !profileActivity.j0.J()) && this.J <= 0.0f) {
                            j10 = j11;
                        } else {
                            float f14 = this.J;
                            int i17 = this.K;
                            j10 = j11;
                            float f15 = ((i17 * j10) / 500.0f) + f14;
                            this.J = f15;
                            if (f15 > 1.0f) {
                                this.J = 1.0f;
                                this.K = i17 * (-1);
                            } else if (f15 <= 0.0f) {
                                this.J = 0.0f;
                                this.K = i17 * (-1);
                            }
                        }
                        rectF.set(dp2, i14, dp2 + y10, AndroidUtilities.dp(2.0f) + i14);
                        paint4.setAlpha((int) (((this.J * 48.0f) + 85.0f) * this.C));
                        canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
                    } else {
                        j10 = j11;
                        this.H = 1.0f;
                    }
                    f11 = 1.0f;
                    float f16 = dp2;
                    rectF.set(f16, i14, (y10 * f11) + f16, AndroidUtilities.dp(2.0f) + i14);
                    if (i15 != this.I) {
                        this.D[i15] = 0.75f;
                    } else if (profileActivity.w0 == 3) {
                        paint4.setAlpha((int) (AndroidUtilities.lerp(i10, 255, org.telegram.ui.Components.gr.j.getInterpolation(this.D[i15])) * this.C));
                    }
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.I ? paint : paint4);
                    i15++;
                    paint3 = paint;
                    fArr = fArr3;
                    realCount = i9;
                    j11 = j10;
                    f13 = 1.0f;
                } else {
                    float f17 = this.F;
                    canvas.save();
                    float f18 = dp2;
                    paint = paint3;
                    fArr3 = fArr;
                    float f19 = i14;
                    i9 = realCount;
                    float f20 = dp2 + y10;
                    canvas.clipRect((y10 * f17) + f18, f19, f20, AndroidUtilities.dp(2.0f) + i14);
                    rectF.set(f18, f19, f20, AndroidUtilities.dp(2.0f) + i14);
                    paint4.setAlpha((int) (this.C * 85.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
                    canvas.restore();
                    j10 = j11;
                    f11 = f17;
                }
                i10 = 80;
                z10 = true;
                float f162 = dp2;
                rectF.set(f162, i14, (y10 * f11) + f162, AndroidUtilities.dp(2.0f) + i14);
                if (i15 != this.I) {
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), i15 != this.I ? paint : paint4);
                i15++;
                paint3 = paint;
                fArr = fArr3;
                realCount = i9;
                j11 = j10;
                f13 = 1.0f;
            }
            fArr2 = fArr;
            long j12 = j11;
            int i18 = profileActivity.w0;
            if (i18 == 2) {
                float f21 = this.C;
                if (f21 < 1.0f) {
                    j11 = j12;
                    float f22 = (j11 / 180.0f) + f21;
                    this.C = f22;
                    if (f22 > 1.0f) {
                        this.C = 1.0f;
                    }
                    z10 = true;
                } else {
                    j11 = j12;
                    profileActivity.w0 = 3;
                }
            } else {
                j11 = j12;
                if (i18 == 3) {
                    int i19 = 0;
                    while (true) {
                        float[] fArr6 = this.D;
                        if (i19 >= fArr6.length) {
                            break;
                        }
                        if (i19 != this.I) {
                            float f23 = fArr6[i19];
                            if (f23 > 0.0f) {
                                float f24 = f23 - (j11 / 500.0f);
                                fArr6[i19] = f24;
                                if (f24 <= 0.0f) {
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
            }
        }
        for (int i20 = 0; i20 < 2; i20++) {
            if (this.x[i20]) {
                float f25 = fArr2[i20];
                if (f25 < 1.0f) {
                    float f26 = (j11 / f10) + f25;
                    fArr2[i20] = f26;
                    if (f26 > 1.0f) {
                        fArr2[i20] = 1.0f;
                    }
                    z10 = true;
                }
            } else {
                float f27 = fArr2[i20];
                if (f27 > 0.0f) {
                    float f28 = f27 - (j11 / f10);
                    fArr2[i20] = f28;
                    if (f28 < 0.0f) {
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
    public final void onSizeChanged(int i9, int i10, int i11, int i12) {
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + this.a;
        Rect rect = this.b;
        rect.set(0, 0, i9, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.c;
        rect2.set(0, (int) (i10 - (AndroidUtilities.dp(72.0f) * 0.5f)), i9, i10);
        this.e.setBounds(0, rect.bottom, i9, AndroidUtilities.dp(16.0f) + currentActionBarHeight);
        this.f.setBounds(0, ((i10 - this.L.O3()) - AndroidUtilities.dp(72.0f)) - AndroidUtilities.dp(24.0f), i9, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.w;
        int i13 = i9 / 5;
        gradientDrawableArr[0].setBounds(0, 0, i13, i10);
        gradientDrawableArr[1].setBounds(i9 - i13, 0, i9, i10);
    }
}
