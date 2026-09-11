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

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class y extends View {
    public w E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final rg.b0 I;
    public int a;
    public long b;
    public int c;
    public qf.b d;
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

    public y(LaunchActivity launchActivity) {
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
        this.I = new rg.b0(this, 10);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(AndroidUtilities.dp(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MONO));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (x xVar : x.values()) {
            if (Build.VERSION.SDK_INT >= xVar.c) {
                long metric = frameMetrics.getMetric(xVar.a);
                xVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = xVar.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    xVar.e = d;
                }
            } else {
                xVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static y b(LaunchActivity launchActivity, org.telegram.ui.j0 j0Var) {
        y yVar = new y(launchActivity);
        yVar.setObservedView(j0Var);
        yVar.r = (WindowManager) launchActivity.getSystemService("window");
        yVar.v = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        yVar.s = layoutParams;
        layoutParams.gravity = 8388627;
        int dp = AndroidUtilities.dp(12);
        WindowManager.LayoutParams layoutParams2 = yVar.s;
        layoutParams2.x = dp;
        layoutParams2.y = dp;
        layoutParams2.width = AndroidUtilities.dp(260.0f);
        yVar.r.addView(yVar, yVar.s);
        yVar.G.set(true);
        if (yVar.F.getAndSet(true)) {
            return yVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        yVar.w = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(yVar.w.getLooper());
        v vVar = new v();
        yVar.x = vVar;
        yVar.v.addOnFrameMetricsAvailableListener(vVar, handler);
        yVar.d = new qf.b(yVar, 3);
        Choreographer.getInstance().postFrameCallback(yVar.d);
        View view = yVar.y;
        if (view != null) {
            yVar.E = new w(yVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(yVar.E);
            }
        }
        yVar.H.post(yVar.I);
        return yVar;
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
        y yVar = this;
        float dp = AndroidUtilities.dp(8.0f);
        float dp2 = AndroidUtilities.dp(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, yVar.getWidth() > 0 ? yVar.getWidth() : AndroidUtilities.dp(260.0f), ((x.values().length + 9) * dp2) + (2.0f * dp), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), yVar.h);
        float f7 = dp + dp2;
        x[] values = x.values();
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
            Paint paint = yVar.n;
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
            x xVar = values[i10];
            int i12 = i10;
            boolean z10 = Build.VERSION.SDK_INT >= xVar.c;
            String str = xVar.b;
            long j16 = j12;
            if (z10) {
                long j17 = xVar.d;
                if (j17 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j17 / 1000000.0d), Double.valueOf(xVar.e));
                    switch (xVar) {
                        case EF8:
                        case EF84:
                            j12 = j16 + xVar.d;
                            d10 += xVar.e;
                            break;
                        case EF18:
                        case EF28:
                        case EF38:
                        case EF48:
                            j3 += xVar.d;
                            d11 += xVar.e;
                            j12 = j16;
                            break;
                        case EF59:
                            long j18 = xVar.d;
                            j3 += j18;
                            d = xVar.e;
                            d11 += d;
                            j10 += j18;
                            d13 += d;
                            j12 = j16;
                            break;
                        case EF69:
                            j10 += xVar.d;
                            d = xVar.e;
                            d13 += d;
                            j12 = j16;
                            break;
                        case EF99:
                            j11 += xVar.d;
                            d12 += xVar.e;
                            j12 = j16;
                            break;
                        default:
                            j12 = j16;
                            break;
                    }
                    canvas.drawText(format, dp, f7, paint);
                    f7 += f11;
                    i10 = i12 + 1;
                    yVar = this;
                    f10 = f11;
                    length = i11;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j12 = j16;
            canvas.drawText(format, dp, f7, paint);
            f7 += f11;
            i10 = i12 + 1;
            yVar = this;
            f10 = f11;
            length = i11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(AndroidUtilities.dp(210.0f), ((x.values().length + 9) * AndroidUtilities.dp(11.0f)) + (AndroidUtilities.dp(8.0f) * 2));
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
        this.E = new w(this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.E);
        }
    }
}
