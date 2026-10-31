package rf;

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
import org.telegram.messenger.i0;
import org.telegram.ui.Components.ew;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.l0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v extends View {
    public View D;
    public nf.a E;
    public final AtomicBoolean F;
    public final AtomicBoolean G;
    public final Handler H;
    public final ew I;
    public int a;
    public long b;
    public int c;
    public jf.b d;
    public final AtomicInteger e;
    public int f;
    public final Paint h;
    public final Paint n;
    public WindowManager r;
    public WindowManager.LayoutParams s;
    public Window w;
    public HandlerThread x;
    public t y;

    public v(LaunchActivity launchActivity) {
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
        this.I = new ew(this, 25);
        paint.setColor(-1342177280);
        paint2.setColor(-1);
        paint2.setTextSize(i0.L(9.0f));
        paint2.setFakeBoldText(true);
        paint2.setTypeface(i0.o1("fonts/rmono.ttf"));
        setWillNotDraw(false);
    }

    public static void a(FrameMetrics frameMetrics) {
        for (u uVar : u.values()) {
            if (Build.VERSION.SDK_INT >= uVar.c) {
                long metric = frameMetrics.getMetric(uVar.a);
                uVar.d = metric;
                if (metric >= 0) {
                    double d = metric / 1000000.0d;
                    double d10 = uVar.e;
                    if (d10 != 0.0d) {
                        d = ((d - d10) * 0.05d) + d10;
                    }
                    uVar.e = d;
                }
            } else {
                uVar.d = Long.MIN_VALUE;
            }
        }
    }

    public static v b(LaunchActivity launchActivity, l0 l0Var) {
        v vVar = new v(launchActivity);
        vVar.setObservedView(l0Var);
        vVar.r = (WindowManager) launchActivity.getSystemService("window");
        vVar.w = launchActivity.getWindow();
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(-2, -2, 2, 792, -3);
        vVar.s = layoutParams;
        layoutParams.gravity = 8388627;
        int L = i0.L(12);
        WindowManager.LayoutParams layoutParams2 = vVar.s;
        layoutParams2.x = L;
        layoutParams2.y = L;
        layoutParams2.width = i0.L(260.0f);
        vVar.r.addView(vVar, vVar.s);
        vVar.G.set(true);
        if (vVar.F.getAndSet(true)) {
            return vVar;
        }
        HandlerThread handlerThread = new HandlerThread("FrameMetrics");
        vVar.x = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(vVar.x.getLooper());
        t tVar = new t();
        vVar.y = tVar;
        vVar.w.addOnFrameMetricsAvailableListener(tVar, handler);
        vVar.d = new jf.b(vVar, 3);
        Choreographer.getInstance().postFrameCallback(vVar.d);
        View view = vVar.D;
        if (view != null) {
            vVar.E = new nf.a(1, vVar);
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnDrawListener(vVar.E);
            }
        }
        vVar.H.post(vVar.I);
        return vVar;
    }

    public final void c() {
        t tVar;
        this.F.set(false);
        this.H.removeCallbacks(this.I);
        Window window = this.w;
        if (window != null && (tVar = this.y) != null) {
            window.removeOnFrameMetricsAvailableListener(tVar);
        }
        if (this.d != null) {
            Choreographer.getInstance().removeFrameCallback(this.d);
            this.d = null;
        }
        View view = this.D;
        if (view != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        HandlerThread handlerThread = this.x;
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
        this.w = null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        String format;
        double d;
        v vVar = this;
        float L = i0.L(8.0f);
        float L2 = i0.L(11.0f);
        canvas.drawRoundRect(0.0f, 0.0f, vVar.getWidth() > 0 ? vVar.getWidth() : i0.L(260.0f), ((u.values().length + 9) * L2) + (2.0f * L), i0.L(10.0f), i0.L(10.0f), vVar.h);
        float f7 = L + L2;
        u[] values = u.values();
        int length = values.length;
        double d10 = 0.0d;
        double d11 = 0.0d;
        double d12 = 0.0d;
        double d13 = 0.0d;
        float f10 = L2;
        long j10 = 0;
        int i10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = 0;
        while (true) {
            float f11 = f10;
            Paint paint = vVar.n;
            if (i10 >= length) {
                long j14 = j13;
                long max = Math.max(j10, Math.max(j11, j12));
                double d14 = d12;
                long j15 = j12;
                double d15 = d13;
                long j16 = j11;
                double d16 = d11;
                double max2 = Math.max(d16, Math.max(d15, d14));
                float f12 = f7 + f11;
                Locale locale = Locale.US;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "ui", Double.valueOf(j10 / 1000000.0d), Double.valueOf(d16)), L, f12, paint);
                float f13 = f12 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "rt", Double.valueOf(j16 / 1000000.0d), Double.valueOf(d15)), L, f13, paint);
                float f14 = f13 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "gpu", Double.valueOf(j15 / 1000000.0d), Double.valueOf(d14)), L, f14, paint);
                float f15 = f14 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "other", Double.valueOf(j14 / 1000000.0d), Double.valueOf(d10)), L, f15, paint);
                float f16 = f15 + f11;
                canvas.drawText(String.format(locale, "%-16s : %5.2f / %5.2f ms", "frame", Double.valueOf(max / 1000000.0d), Double.valueOf(max2)), L, f16, paint);
                float f17 = f16 + f11 + f11;
                canvas.drawText(String.format(locale, "%-16s : %d /s", "vsync", Integer.valueOf(this.c)), L, f17, paint);
                canvas.drawText(String.format(locale, "%-16s : %d /s", this.D != null ? "onDraw" : "onDraw (none)", Integer.valueOf(this.f)), L, f17 + f11, paint);
                return;
            }
            int i11 = length;
            u uVar = values[i10];
            int i12 = i10;
            boolean z10 = Build.VERSION.SDK_INT >= uVar.c;
            String str = uVar.b;
            long j17 = j13;
            if (z10) {
                long j18 = uVar.d;
                if (j18 >= 0) {
                    format = String.format(Locale.US, "%-16s : %5.2f / %5.2f ms", str, Double.valueOf(j18 / 1000000.0d), Double.valueOf(uVar.e));
                    switch (uVar) {
                        case EF7:
                        case EF81:
                            j13 = j17 + uVar.d;
                            d10 += uVar.e;
                            break;
                        case EF17:
                        case EF27:
                        case EF37:
                        case EF47:
                            j10 += uVar.d;
                            d11 += uVar.e;
                            j13 = j17;
                            break;
                        case EF57:
                            long j19 = uVar.d;
                            j10 += j19;
                            d = uVar.e;
                            d11 += d;
                            j11 += j19;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF67:
                            j11 += uVar.d;
                            d = uVar.e;
                            d13 += d;
                            j13 = j17;
                            break;
                        case EF96:
                            j12 += uVar.d;
                            d12 += uVar.e;
                            j13 = j17;
                            break;
                        default:
                            j13 = j17;
                            break;
                    }
                    canvas.drawText(format, L, f7, paint);
                    f7 += f11;
                    i10 = i12 + 1;
                    vVar = this;
                    f10 = f11;
                    length = i11;
                }
            }
            format = String.format(Locale.US, "%-16s : n/a", str);
            j13 = j17;
            canvas.drawText(format, L, f7, paint);
            f7 += f11;
            i10 = i12 + 1;
            vVar = this;
            f10 = f11;
            length = i11;
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(i0.L(210.0f), ((u.values().length + 9) * i0.L(11.0f)) + (i0.L(8.0f) * 2));
    }

    public void setObservedView(View view) {
        View view2;
        View view3 = this.D;
        if (view3 != null && this.E != null) {
            ViewTreeObserver viewTreeObserver = view3.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(this.E);
            }
            this.E = null;
        }
        this.D = view;
        if (!this.F.get() || (view2 = this.D) == null) {
            return;
        }
        this.E = new nf.a(1, this);
        ViewTreeObserver viewTreeObserver2 = view2.getViewTreeObserver();
        if (viewTreeObserver2.isAlive()) {
            viewTreeObserver2.addOnDrawListener(this.E);
        }
    }
}
