package yf;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Choreographer;
import android.view.FrameMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class x extends View {
    public tf.a E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final p8.b I;
    public int a;
    public long b;
    public int c;
    public pf.b d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window v;
    public HandlerThread w;
    public v x;
    public View y;

    public x(LaunchActivity launchActivity) {
        super(launchActivity.getApplicationContext());
        this.a = 0;
        this.b = 0L;
        this.c = 0;
        this.e = new AtomicInteger(0);
        this.f = 0;
        Paint paint = new Paint(1);
        this.h = paint;
        Paint paint2 = new Paint(1);
        this.n = paint2;
        this.F = new AtomicBoolean(false);
        this.G = new AtomicBoolean(false);
        this.H = new Handler(Looper.getMainLooper());
        this.I = new p8.b(this, 12);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (w wVar : w.values()) {
            if (Build.VERSION.SDK_INT >= wVar.c) {
                long metric = frameMetrics.getMetric(wVar.a);
                wVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = wVar.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    wVar.e = d;
                }
            } else {
                wVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static x b(LaunchActivity launchActivity, org.telegram.ui.j0 j0Var) {
        x xVar = new x(launchActivity);
        xVar.setObservedView(j0Var);
        xVar.r = (WindowManager) launchActivity.getSystemService("window");
        xVar.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        xVar.s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = xVar.s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        xVar.r.addView(xVar, xVar.s);
        xVar.G.set(true);
        if (xVar.F.getAndSet(true)) {
            return xVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        xVar.w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(xVar.w.getLooper());
        v vVar = new v();
        xVar.x = vVar;
        xVar.v.addOnFrameMetricsAvailableListener(vVar, handler);
        xVar.d = new pf.b(xVar, 3);
        Choreographer.getInstance().postFrameCallback(xVar.d);
        View view = xVar.y;
        if (view != null) {
            xVar.E = new tf.a(1, xVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(xVar.E);
            }
        }
        xVar.H.post(xVar.I);
        return xVar;
    }

    public final void c() {
        v vVar;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.v;
        if (window != null && (vVar = this.x) != null) {
            window.removeOnFrameMetricsAvailableListener(vVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.y;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.w;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
        if (this.r != null && this.G.getAndSet(false)) {
            try {
                this.r.removeViewImmediate(this);
            } catch (Throwable unused) {
            }
        }
        this.r = null;
        this.s = null;
        this.v = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String format;
        double d;
        x xVar = this;
        float dp = AndroidUtilities.dp(8.0f);
        float dp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, xVar.getWidth() > 0 ? xVar.getWidth() : AndroidUtilities.dp(260.0f), ((w.values().length + 9) * dp2) + (2.0f * dp), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), xVar.h);
        float f7 = dp + dp2;
        w[] values = w.values();
        int length = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f10 = dp2;
        long j3 = 0;
        int i10 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        while (true) {
            float f11 = f10;
            Paint paint = xVar.n;
            if (i10 >= length) {
                long j13 = j12;
                long max = Math.max(j3, Math.max(j10, j11));
                double d14 = d12;
                long j14 = j11;
                double d15 = d13;
                long j15 = j10;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f12 = f7 + f11;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j3 / 1000000.0d), Double.valueOf(d16)), dp, f12, paint);
                float f13 = f12 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d15)), dp, f13, paint);
                float f14 = f13 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d14)), dp, f14, paint);
                float f15 = f14 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j13 / 1000000.0d), Double.valueOf(d10)), dp, f15, paint);
                float f16 = f15 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), dp, f16, paint);
                float f17 = f16 + f11 + f11;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), dp, f17, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.y != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), dp, f17 + f11, paint);
                return;
            }
            int i11 = length;
            w wVar = values[i10];
            int i12 = i10;
            boolean z10 = Build.VERSION.SDK_INT >= wVar.c;
            String str = wVar.b;
            long j16 = j12;
            if (z10) {
                long j17 = wVar.d;
                if (j17 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j17 / 1000000.0d), Double.valueOf(wVar.e));
                    switch (wVar) {
                        case EF8:
                        case EF84:
                            j12 = j16 + wVar.d;
                            d10 += wVar.e;
                            break;
                        case EF18:
                        case EF28:
                        case EF38:
                        case EF48:
                            j3 += wVar.d;
                            d11 += wVar.e;
                            j12 = j16;
                            break;
                        case EF59:
                            long j18 = wVar.d;
                            j3 += j18;
                            d = wVar.e;
                            d11 += d;
                            j10 += j18;
                            d13 += d;
                            j12 = j16;
                            break;
                        case EF69:
                            j10 += wVar.d;
                            d = wVar.e;
                            d13 += d;
                            j12 = j16;
                            break;
                        case EF99:
                            j11 += wVar.d;
                            d12 += wVar.e;
                            j12 = j16;
                            break;
                        default:
                            j12 = j16;
                            break;
                    }
                    canvas.drawText(format, dp, f7, paint);
                    f7 += f11;
                    i10 = i12 + 1;
                    xVar = this;
                    f10 = f11;
                    length = i11;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j12 = j16;
            canvas.drawText(format, dp, f7, paint);
            f7 += f11;
            i10 = i12 + 1;
            xVar = this;
            f10 = f11;
            length = i11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((w.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.y;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.y = view;
        if (!this.F.get() || (view2 = this.y) == null) {
            return;
        }
        this.E = new tf.a(1, this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.E);
        }
    }
}
