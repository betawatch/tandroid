package qh;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c2 {
    public final Context a;
    public final z1 b;
    public final z1 c;
    public final WindowManager e;
    public final View f;
    public final WindowManager.LayoutParams g;
    public ValueAnimator i;
    public int j;
    public int k;
    public int l;
    public float m;
    public int n;
    public RadialGradient r;
    public final Paint s;
    public final ArrayList d = new ArrayList();
    public float h = 0.0f;
    public float o = 0.75f;
    public float p = 1.0f;
    public final Matrix q = new Matrix();

    public c2(Context context, WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams) {
        Paint paint = new Paint(1);
        this.s = paint;
        this.a = context;
        this.e = windowManager;
        this.f = view;
        this.g = layoutParams;
        this.b = new z1(this, context, 0);
        this.c = new z1(this, context, 1);
        paint.setAlpha(0);
    }

    public static int f(float f10) {
        return f10 < 0.5f ? i0.a.d(Utilities.clamp(f10 / 0.5f, 1.0f, 0.0f), -7544833, -1) : i0.a.d(Utilities.clamp((f10 - 0.5f) / 0.5f, 1.0f, 0.0f), -1, -70004);
    }

    public final void a(b2 b2Var) {
        b2Var.setInvert(this.h);
        this.d.add(b2Var);
    }

    public final void b(Canvas canvas, boolean z4) {
        if (this.r != null) {
            g();
            this.r.setLocalMatrix(this.q);
            Paint paint = this.s;
            if (z4) {
                canvas.drawRect(0.0f, 0.0f, this.j, this.k, paint);
                return;
            }
            RectF rectF = AndroidUtilities.rectTmp;
            z1 z1Var = this.c;
            rectF.set(0.0f, 0.0f, z1Var.getMeasuredWidth(), z1Var.getMeasuredHeight());
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(12.0f) - 2, AndroidUtilities.dp(12.0f) - 2, paint);
        }
    }

    public final void c(w8 w8Var) {
        h(this.p);
        e(1.0f, 320L, w8Var);
    }

    public final void d() {
        h(-1.0f);
        e(0.0f, 240L, null);
    }

    public final void e(float f10, long j10, Runnable runnable) {
        ValueAnimator valueAnimator = this.i;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.i = null;
        }
        if (j10 <= 0) {
            this.h = f10;
            i();
            if (runnable != null) {
                runnable.run();
                return;
            }
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.h, f10);
        this.i = ofFloat;
        ofFloat.addUpdateListener(new oh.f5(this, 14));
        this.i.addListener(new mh.k5(this, f10, runnable, 3));
        this.i.setDuration(j10);
        this.i.setInterpolator(pr.i);
        this.i.start();
    }

    public final void g() {
        int i10 = this.l;
        int i11 = this.n;
        z1 z1Var = this.b;
        if (i10 == i11 && this.j == z1Var.getMeasuredWidth() && this.k == z1Var.getMeasuredHeight() && Math.abs(this.m - this.h) <= 0.005f) {
            return;
        }
        this.l = this.n;
        this.j = z1Var.getMeasuredWidth();
        int measuredHeight = z1Var.getMeasuredHeight();
        this.k = measuredHeight;
        this.m = this.h;
        if (this.j <= 0 || measuredHeight <= 0) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            float f10 = this.j * 0.5f;
            float f11 = this.k * 0.4f;
            float min = (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f;
            ColorSpace.Named named = ColorSpace.Named.EXTENDED_SRGB;
            long[] jArr = {Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 0.0f, ColorSpace.get(named)).pack(), Color.valueOf(Color.red(this.n) / 255.0f, Color.green(this.n) / 255.0f, Color.blue(this.n) / 255.0f, 1.0f, ColorSpace.get(named)).pack()};
            float[] fArr = {AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f};
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.r = android.support.v4.media.session.y.b(f10, f11, min, jArr, fArr);
        } else {
            this.r = new RadialGradient(this.j * 0.5f, this.k * 0.4f, (2.0f - this.h) * (Math.min(r1, r11) / 2.0f) * 1.35f, new int[]{i0.a.k(this.n, 0), this.n}, new float[]{AndroidUtilities.lerp(0.9f, 0.22f, this.h), 1.0f}, Shader.TileMode.CLAMP);
        }
        this.s.setShader(this.r);
        z1Var.invalidate();
        this.c.invalidate();
    }

    public final void h(float f10) {
        Window window;
        WindowManager.LayoutParams layoutParams;
        View view = this.f;
        if (view != null && (layoutParams = this.g) != null) {
            layoutParams.screenBrightness = f10;
            WindowManager windowManager = this.e;
            if (windowManager != null) {
                windowManager.updateViewLayout(view, layoutParams);
                return;
            }
            return;
        }
        Activity findActivity = AndroidUtilities.findActivity(this.a);
        if (findActivity == null) {
            findActivity = LaunchActivity.D1;
        }
        if (findActivity == null || findActivity.isFinishing() || (window = findActivity.getWindow()) == null) {
            return;
        }
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.screenBrightness = f10;
        window.setAttributes(attributes);
    }

    public final void i() {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.d;
            if (i10 >= arrayList.size()) {
                this.s.setAlpha((int) (this.p * 255.0f * this.h));
                this.b.invalidate();
                this.c.invalidate();
                return;
            }
            ((b2) arrayList.get(i10)).setInvert(this.h);
            ((b2) arrayList.get(i10)).invalidate();
            i10++;
        }
    }
}
