// default package

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
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xr8 extends View implements at8 {
    public final float[] E;
    public boolean F;
    public float G;
    public float H;
    public float[] I;
    public long J;
    public float K;
    public int L;
    public float M;
    public int N;
    public float O;
    public int P;
    public final /* synthetic */ ProfileActivity Q;
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
    public xr8(ProfileActivity profileActivity, Context context) {
        super(context);
        a aVar;
        int i;
        int i2;
        boolean z;
        this.Q = profileActivity;
        aVar = ((e) profileActivity).actionBar;
        if (aVar.getOccupyStatusBar()) {
            z = ((e) profileActivity).inBubbleMode;
            if (!z) {
                i = hl.m;
                this.a = i;
                this.b = new Rect();
                this.c = new Rect();
                this.d = new RectF();
                this.n = new float[]{0.0f, 1.0f};
                this.x = new GradientDrawable[2];
                this.y = new boolean[2];
                this.E = new float[2];
                this.H = 0.0f;
                this.I = null;
                this.L = -1;
                this.P = 1;
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
                i2 = 0;
                while (i2 < 2) {
                    this.x[i2] = new GradientDrawable(i2 == 0 ? GradientDrawable.Orientation.LEFT_RIGHT : GradientDrawable.Orientation.RIGHT_LEFT, new int[]{838860800, 0});
                    this.x[i2].setShape(0);
                    i2++;
                }
                Paint paint3 = new Paint(1);
                this.r = paint3;
                paint3.setColor(-16777216);
                paint3.setAlpha(66);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                this.h = ofFloat;
                ofFloat.setDuration(250L);
                ofFloat.setInterpolator(k43.j);
                ofFloat.addUpdateListener(new pv7(this, (byte) 18));
                ofFloat.addListener(new n88(this, (byte) 21));
            }
        }
        i = 0;
        this.a = i;
        this.b = new Rect();
        this.c = new Rect();
        this.d = new RectF();
        this.n = new float[]{0.0f, 1.0f};
        this.x = new GradientDrawable[2];
        this.y = new boolean[2];
        this.E = new float[2];
        this.H = 0.0f;
        this.I = null;
        this.L = -1;
        this.P = 1;
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
        i2 = 0;
        while (i2 < 2) {
        }
        Paint paint32 = new Paint(1);
        this.r = paint32;
        paint32.setColor(-16777216);
        paint32.setAlpha(66);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.h = ofFloat2;
        ofFloat2.setDuration(250L);
        ofFloat2.setInterpolator(k43.j);
        ofFloat2.addUpdateListener(new pv7(this, (byte) 18));
        ofFloat2.addListener(new n88(this, (byte) 21));
    }

    @Override // at8
    public final void a() {
        Arrays.fill(this.y, false);
        postInvalidateOnAnimation();
    }

    @Override // at8
    public final void b(boolean z) {
        this.y[!z ? 1 : 0] = true;
        postInvalidateOnAnimation();
    }

    @Override // at8
    public final void c() {
        RectF rectF = ProfileActivity.Z6;
        this.Q.e4(false);
    }

    @Override // at8
    public final void d() {
        invalidate();
    }

    public final void e(boolean z, float f) {
        int i = (int) (255.0f * f);
        this.e.setAlpha(i);
        this.f.setAlpha(i);
        this.r.setAlpha((int) (66.0f * f));
        this.s.setAlpha((int) (85.0f * f));
        this.w.setAlpha(i);
        this.H = f;
        if (!z) {
            this.G = f;
        }
        invalidate();
    }

    public final void f(boolean z, float f) {
        if (z != this.F) {
            this.F = z;
            ValueAnimator valueAnimator = this.h;
            valueAnimator.cancel();
            float f2 = this.G;
            float[] fArr = this.n;
            float S1 = hl.S1(f2, fArr);
            if (z) {
                valueAnimator.setDuration((long) (((1.0f - S1) * 250.0f) / f));
            } else {
                valueAnimator.setDuration((long) ((250.0f * S1) / f));
            }
            fArr[0] = S1;
            fArr[1] = z ? 1.0f : 0.0f;
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
        float f;
        float[] fArr2;
        float f2;
        boolean z;
        boolean z2;
        Paint paint;
        float[] fArr3;
        int i;
        int i2;
        long j;
        float f3;
        int i3 = 0;
        while (true) {
            fArr = this.E;
            f = 0.0f;
            if (i3 >= 2) {
                break;
            }
            float f4 = fArr[i3];
            if (f4 > 0.0f) {
                GradientDrawable[] gradientDrawableArr = this.x;
                gradientDrawableArr[i3].setAlpha((int) (f4 * 255.0f));
                gradientDrawableArr[i3].draw(canvas);
            }
            i3++;
        }
        this.e.draw(canvas);
        this.f.draw(canvas);
        Rect rect = this.b;
        Paint paint2 = this.r;
        canvas.drawRect(rect, paint2);
        canvas.drawRect(this.c, paint2);
        ProfileActivity profileActivity = this.Q;
        int realCount = profileActivity.o0.getRealCount();
        this.N = profileActivity.o0.getRealPosition();
        float[] fArr4 = this.I;
        if (fArr4 == null || fArr4.length != realCount) {
            float[] fArr5 = new float[realCount];
            this.I = fArr5;
            Arrays.fill(fArr5, 0.0f);
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = elapsedRealtime - this.J;
        if (j2 < 0 || j2 > 20) {
            j2 = 17;
        }
        this.J = elapsedRealtime;
        float f5 = 1.0f;
        if (realCount <= 1 || realCount > 20) {
            fArr2 = fArr;
            f2 = 180.0f;
            z = false;
        } else {
            byte b = profileActivity.B0;
            if (b == 0) {
                this.H = 0.0f;
                profileActivity.B0 = (byte) 3;
                b = 3;
            } else if (b == 1) {
                this.H = 0.0f;
                profileActivity.B0 = (byte) 2;
                b = 2;
            }
            Paint paint3 = this.w;
            Paint paint4 = this.s;
            if (b == 2) {
                paint4.setAlpha((int) (this.H * 85.0f));
                paint3.setAlpha((int) (this.H * 255.0f));
            }
            f2 = 180.0f;
            int D = ik8.D((realCount - 1) << 1, getMeasuredWidth() - hl.L(10.0f), realCount);
            int L = hl.L(1.0f);
            z2 = ((e) profileActivity).inBubbleMode;
            int i4 = L + (!z2 ? hl.m : 0);
            int i5 = 0;
            z = false;
            while (i5 < realCount) {
                int L2 = (D * i5) + hl.L((i5 << 1) + 5);
                int i6 = this.L;
                float f6 = f;
                RectF rectF = this.d;
                if (i5 != i6 || Math.abs(this.K - f5) <= 1.0E-4f) {
                    paint = paint3;
                    fArr3 = fArr;
                    i = realCount;
                    float f7 = f5;
                    i2 = 85;
                    if (i5 != this.N) {
                        j = j2;
                    } else if (profileActivity.o0.I()) {
                        f3 = profileActivity.o0.getCurrentItemProgress();
                        this.M = f3;
                        if ((f3 > f6 || !profileActivity.o0.J()) && this.O <= f6) {
                            j = j2;
                        } else {
                            float f8 = this.O;
                            int i7 = this.P;
                            j = j2;
                            float f9 = ((i7 * j) / 500.0f) + f8;
                            this.O = f9;
                            if (f9 > f7) {
                                this.O = f7;
                                this.P = i7 * (-1);
                            } else if (f9 <= f6) {
                                this.O = f6;
                                this.P = i7 * (-1);
                            }
                        }
                        rectF.set(L2, i4, L2 + D, hl.L(2.0f) + i4);
                        paint4.setAlpha((int) (((this.O * 48.0f) + 85.0f) * this.H));
                        canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), paint4);
                    } else {
                        j = j2;
                        this.M = f7;
                    }
                    f3 = 1.0f;
                    float f10 = L2;
                    rectF.set(f10, i4, (D * f3) + f10, hl.L(2.0f) + i4);
                    if (i5 != this.N) {
                        this.I[i5] = 0.75f;
                    } else if (profileActivity.B0 == 3) {
                        paint4.setAlpha((int) (hl.U1(k43.j.getInterpolation(this.I[i5]), i2, jn7.d4) * this.H));
                    }
                    canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), i5 != this.N ? paint : paint4);
                    i5++;
                    paint3 = paint;
                    fArr = fArr3;
                    realCount = i;
                    j2 = j;
                    f = 0.0f;
                    f5 = 1.0f;
                } else {
                    float f11 = this.K;
                    canvas.save();
                    float f12 = f5;
                    float f13 = L2;
                    paint = paint3;
                    fArr3 = fArr;
                    float f14 = i4;
                    i = realCount;
                    float f15 = L2 + D;
                    canvas.clipRect((D * f11) + f13, f14, f15, hl.L(2.0f) + i4);
                    rectF.set(f13, f14, f15, hl.L(2.0f) + i4);
                    paint4.setAlpha((int) (this.H * 85.0f));
                    canvas.drawRoundRect(rectF, hl.L(f12), hl.L(f12), paint4);
                    canvas.restore();
                    j = j2;
                    f3 = f11;
                }
                i2 = 80;
                z = true;
                float f102 = L2;
                rectF.set(f102, i4, (D * f3) + f102, hl.L(2.0f) + i4);
                if (i5 != this.N) {
                }
                canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), i5 != this.N ? paint : paint4);
                i5++;
                paint3 = paint;
                fArr = fArr3;
                realCount = i;
                j2 = j;
                f = 0.0f;
                f5 = 1.0f;
            }
            fArr2 = fArr;
            long j3 = j2;
            byte b2 = profileActivity.B0;
            if (b2 == 2) {
                float f16 = this.H;
                j2 = j3;
                if (f16 < 1.0f) {
                    float f17 = (j2 / 180.0f) + f16;
                    this.H = f17;
                    if (f17 > 1.0f) {
                        this.H = 1.0f;
                    }
                    z = true;
                } else {
                    profileActivity.B0 = (byte) 3;
                }
            } else {
                j2 = j3;
                if (b2 == 3) {
                    int i8 = 0;
                    while (true) {
                        float[] fArr6 = this.I;
                        if (i8 >= fArr6.length) {
                            break;
                        }
                        if (i8 != this.N) {
                            float f18 = fArr6[i8];
                            if (f18 > 0.0f) {
                                float f19 = f18 - (j2 / 500.0f);
                                fArr6[i8] = f19;
                                if (f19 <= 0.0f) {
                                    fArr6[i8] = 0.0f;
                                    if (i8 == this.L) {
                                        this.L = -1;
                                    }
                                }
                                z = true;
                                i8++;
                            }
                        }
                        if (i8 == this.L) {
                            this.L = -1;
                        }
                        i8++;
                    }
                }
            }
        }
        for (int i9 = 0; i9 < 2; i9++) {
            if (this.y[i9]) {
                float f20 = fArr2[i9];
                if (f20 < 1.0f) {
                    float f21 = (j2 / f2) + f20;
                    fArr2[i9] = f21;
                    if (f21 > 1.0f) {
                        fArr2[i9] = 1.0f;
                    }
                    z = true;
                }
            } else {
                float f22 = fArr2[i9];
                if (f22 > 0.0f) {
                    float f23 = f22 - (j2 / f2);
                    fArr2[i9] = f23;
                    if (f23 < 0.0f) {
                        fArr2[i9] = 0.0f;
                    }
                    z = true;
                }
            }
        }
        if (z) {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int currentActionBarHeight = a.getCurrentActionBarHeight() + this.a;
        Rect rect = this.b;
        rect.set(0, 0, i, (int) (currentActionBarHeight * 0.5f));
        Rect rect2 = this.c;
        rect2.set(0, (int) (i2 - (hl.L(72.0f) * 0.5f)), i, i2);
        this.e.setBounds(0, rect.bottom, i, hl.L(16.0f) + currentActionBarHeight);
        RectF rectF = ProfileActivity.Z6;
        this.f.setBounds(0, ((i2 - this.Q.X1()) - hl.L(72.0f)) - hl.L(24.0f), i, rect2.top);
        GradientDrawable[] gradientDrawableArr = this.x;
        int i5 = i / 5;
        gradientDrawableArr[0].setBounds(0, 0, i5, i2);
        gradientDrawableArr[1].setBounds(i - i5, 0, i, i2);
    }
}
