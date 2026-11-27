// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.a;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class zs8 extends de0 implements tma {
    public final int H;
    public RadialProgress2 I;
    public ValueAnimator J;
    public float K;
    public long L;
    public boolean M;
    public final int N;
    public final Paint O;
    public Runnable P;
    public final /* synthetic */ et8 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs8(et8 et8Var, Context context, int i, Paint paint) {
        super(context);
        this.Q = et8Var;
        this.H = hl.L(64.0f);
        this.L = -1L;
        this.N = i;
        this.O = paint;
        setLayerNum(et8Var.m1);
    }

    @Override // tma
    public final void d(Runnable runnable) {
        this.P = runnable;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        et8 et8Var = this.Q;
        if (et8Var.h1) {
            et8Var.invalidate();
        }
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // de0, android.view.View
    public final void onDraw(Canvas canvas) {
        Canvas canvas2;
        et8 et8Var = this.Q;
        float[] fArr = et8Var.P0;
        Path path = et8Var.N0;
        ArrayList arrayList = et8Var.c1;
        RectF rectF = et8Var.O0;
        de8 de8Var = et8Var.i1;
        if (de8Var == null || !de8Var.n) {
            if (this.I != null) {
                int k = et8Var.E0.k(this.N);
                if (et8Var.j1) {
                    k--;
                }
                Drawable t = getImageReceiver().t();
                long j = 0;
                if (k >= arrayList.size() || arrayList.get(k) == null ? t == null || (this.M && (!(t instanceof lm) || ((lm) t).d[4] <= 0)) : ((Float) arrayList.get(k)).floatValue() < 1.0f) {
                    if (this.L < 0) {
                        this.L = System.currentTimeMillis();
                    } else {
                        long currentTimeMillis = System.currentTimeMillis() - this.L;
                        long j2 = this.M ? 250L : 750L;
                        if (currentTimeMillis <= 250 + j2 && currentTimeMillis > j2) {
                            this.I.E = k43.f.getInterpolation((currentTimeMillis - j2) / 250.0f);
                        }
                    }
                    if (et8Var.h1) {
                        invalidate();
                    } else {
                        postInvalidateOnAnimation();
                    }
                    invalidate();
                } else if (this.J == null) {
                    RadialProgress2 radialProgress2 = this.I;
                    if ((radialProgress2.c ? radialProgress2.j : radialProgress2.i).w < 1.0f) {
                        radialProgress2.o(true, 1.0f);
                        j = 100;
                    }
                    this.K = this.I.E;
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    this.J = ofFloat;
                    ofFloat.setStartDelay(j);
                    this.J.setDuration((long) (this.K * 250.0f));
                    this.J.setInterpolator(k43.f);
                    this.J.addUpdateListener(new pv7(this, (byte) 20));
                    this.J.addListener(new dn(this, k, (byte) 8));
                    this.J.start();
                }
                int i = et8Var.n1;
                Paint paint = this.O;
                if (i == 0 && et8Var.o1 == 0) {
                    canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                    canvas2 = canvas;
                } else {
                    canvas2 = canvas;
                    if (i == et8Var.o1) {
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        float f = et8Var.n1;
                        canvas2.drawRoundRect(rectF, f, f, paint);
                    } else {
                        path.reset();
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        for (int i2 = 0; i2 < 4; i2++) {
                            fArr[i2] = et8Var.n1;
                            fArr[i2 + 4] = et8Var.o1;
                        }
                        path.addRoundRect(rectF, fArr, Path.Direction.CW);
                        canvas2.drawPath(path, paint);
                    }
                }
            } else {
                canvas2 = canvas;
            }
            super.onDraw(canvas);
            RadialProgress2 radialProgress22 = this.I;
            if (radialProgress22 == null || radialProgress22.E <= 0.0f) {
                return;
            }
            radialProgress22.draw(canvas2);
        }
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.I != null) {
            int currentActionBarHeight = a.getCurrentActionBarHeight() + (this.Q.A0.getOccupyStatusBar() ? hl.m : 0);
            int M = hl.M(80.0f);
            RadialProgress2 radialProgress2 = this.I;
            int i5 = this.H;
            int i6 = (i2 - currentActionBarHeight) - M;
            radialProgress2.p((i - i5) / 2, ik8.g(i6, i5, 2, currentActionBarHeight), (i + i5) / 2, ((i6 + i5) / 2) + currentActionBarHeight);
        }
    }

    @Override // android.view.View
    public final void invalidate(Rect rect) {
        super.invalidate(rect);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        super.invalidate(i, i2, i3, i4);
        Runnable runnable = this.P;
        if (runnable != null) {
            runnable.run();
        }
    }
}
