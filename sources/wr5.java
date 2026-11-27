// default package

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.TextureView;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Intro;
import org.webrtc.EglRenderer;
import org.webrtc.ThreadUtils;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class wr5 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wr5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [cnb] */
    /* JADX WARN: Type inference failed for: r7v0, types: [cnb] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Object[] objArr = 0;
        final byte b = 1;
        switch (this.a) {
            case 0:
                yr5 yr5Var = (yr5) this.b;
                if (yr5Var.J == null && surfaceTexture != null) {
                    yr5Var.J = new xr5(yr5Var, surfaceTexture);
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    yr5Var.J.postRunnable(new ea5(this, (byte) 15));
                    xr5 xr5Var = yr5Var.J;
                    xr5Var.postRunnable(xr5Var.x);
                    break;
                }
                break;
            case 1:
                ke8 ke8Var = (ke8) this.b;
                EglRenderer eglRenderer = ke8Var.a;
                if (!ke8Var.c && ke8Var.b != surfaceTexture) {
                    ke8Var.b = surfaceTexture;
                    if (i > 0 && i2 > 0) {
                        eglRenderer.setLayoutAspectRatio(i / i2);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    break;
                }
                break;
            case 2:
                on9 on9Var = (on9) this.b;
                on9Var.j.b("preview surface available: view=" + i + "x" + i2);
                Handler handler = on9Var.n;
                if (on9Var.U && handler != null && on9Var.c.isAvailable()) {
                    handler.post(new dn9(on9Var, b));
                    break;
                }
                break;
            case 3:
                mpa mpaVar = (mpa) this.b;
                if (mpaVar.f == null) {
                    lpa lpaVar = new lpa(mpaVar, surfaceTexture, i, i2, new kpa(mpaVar, (byte) 1));
                    mpaVar.f = lpaVar;
                    lpaVar.start();
                    break;
                }
                break;
            case 4:
                ((bnb) this.b).c.a(surfaceTexture, true);
                break;
            case 5:
                final hnb hnbVar = (hnb) this.b;
                ArrayList arrayList = hnbVar.c;
                fnb fnbVar = hnbVar.a;
                if (fnbVar != null) {
                    fnbVar.g();
                    hnbVar.a = null;
                }
                final Object[] objArr2 = objArr == true ? 1 : 0;
                fnb fnbVar2 = new fnb(surfaceTexture, new Runnable() { // from class: cnb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = objArr2;
                        hnb hnbVar2 = hnbVar;
                        switch (b2) {
                            case 0:
                                hnbVar2.invalidate();
                                break;
                            default:
                                Boolean bool = hnb.f;
                                Runnable runnable = hnbVar2.d;
                                if (runnable != null) {
                                    hnbVar2.e = true;
                                    hnbVar2.d = null;
                                    hnb.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, new Runnable() { // from class: cnb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        hnb hnbVar2 = hnbVar;
                        switch (b2) {
                            case 0:
                                hnbVar2.invalidate();
                                break;
                            default:
                                Boolean bool = hnb.f;
                                Runnable runnable = hnbVar2.d;
                                if (runnable != null) {
                                    hnbVar2.e = true;
                                    hnbVar2.d = null;
                                    hnb.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i, i2);
                hnbVar.a = fnbVar2;
                fnbVar2.a = c34.m(hnbVar.getContext()).h();
                if (!arrayList.isEmpty()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        gnb gnbVar = (gnb) arrayList.get(i3);
                        Bitmap bitmap = gnbVar.e;
                        if (bitmap != null) {
                            hnbVar.a.c(gnbVar.f, bitmap, gnbVar.c, gnbVar.d);
                        } else {
                            ArrayList arrayList2 = gnbVar.b;
                            fnb fnbVar3 = hnbVar.a;
                            if (arrayList2 != null) {
                                fnbVar3.d(arrayList2, gnbVar.d);
                            } else {
                                fnbVar3.b(gnbVar.g, gnbVar.a, gnbVar.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(hnbVar.b);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                yr5 yr5Var = (yr5) this.b;
                xr5 xr5Var = yr5Var.J;
                if (xr5Var != null) {
                    xr5Var.postRunnable(new ea5(xr5Var, (byte) 17));
                    yr5Var.J = null;
                }
                return true;
            case 2:
                ((on9) this.b).j.b("preview surface destroyed: active=" + ((on9) this.b).U);
                if (((on9) this.b).U) {
                    ((on9) this.b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                }
            case 1:
                return true;
            case 3:
                lpa lpaVar = ((mpa) this.b).f;
                if (lpaVar != null) {
                    lpaVar.a = false;
                    ((mpa) this.b).f = null;
                }
                return true;
            case 4:
                ThreadUtils.checkIsOnMainThread();
                ((bnb) this.b).c.f(null, true);
                return false;
            case 5:
                hnb hnbVar = (hnb) this.b;
                fnb fnbVar = hnbVar.a;
                if (fnbVar != null) {
                    fnbVar.g();
                    hnbVar.a = null;
                }
                Runnable runnable = hnbVar.d;
                if (runnable != null) {
                    hnbVar.d = null;
                    hnb.b(runnable);
                }
                return false;
            default:
                hyc hycVar = (hyc) this.b;
                TextureView textureView = hycVar.d;
                if (!hycVar.T) {
                    return true;
                }
                if (hycVar.a0) {
                    hycVar.r = (byte) 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                textureView.setVisibility(0);
                hycVar.T = false;
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Handler handler;
        switch (this.a) {
            case 0:
                if (((yr5) this.b).J != null) {
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    return;
                }
                return;
            case 1:
                ke8 ke8Var = (ke8) this.b;
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                ke8Var.a.setLayoutAspectRatio(i / i2);
                return;
            case 2:
                on9 on9Var = (on9) this.b;
                on9Var.j.b("preview surface size changed: view=" + i + "x" + i2);
                on9Var.a0();
                return;
            case 3:
                lpa lpaVar = ((mpa) this.b).f;
                if (lpaVar != null) {
                    synchronized (lpaVar.e) {
                        lpaVar.f = true;
                        lpaVar.h = i;
                        lpaVar.n = i2;
                    }
                    return;
                }
                return;
            case 4:
                return;
            case 5:
                fnb fnbVar = ((hnb) this.b).a;
                if (fnbVar == null || (handler = fnbVar.getHandler()) == null || !fnbVar.b.get()) {
                    return;
                }
                handler.sendMessage(handler.obtainMessage(1, i, i2));
                return;
            default:
                return;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        long j;
        long j2;
        float f;
        switch (this.a) {
            case 0:
            case 1:
                break;
            case 2:
                if (((on9) this.b).X) {
                    ((on9) this.b).X = false;
                    sn9 sn9Var = ((on9) this.b).j;
                    StringBuilder sb = new StringBuilder("camera switch first preview frame: path=");
                    sb.append(((on9) this.b).k0 ? "DUAL_ACTIVE" : "SEQUENTIAL");
                    sb.append(", totalElapsedMs=");
                    sb.append(on9.x(((on9) this.b).F0));
                    sn9Var.b(sb.toString());
                    jp9 jp9Var = (jp9) ((on9) this.b).k.b;
                    Handler handler = jp9Var.i;
                    kj4 kj4Var = jp9Var.d;
                    Objects.requireNonNull(kj4Var);
                    handler.post(new v59(kj4Var, (byte) 17));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                on9 on9Var = (on9) this.b;
                if (on9Var.G0 == 0) {
                    on9Var.G0 = elapsedRealtimeNanos;
                    sn9 sn9Var2 = on9Var.j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((on9) this.b).c.getWidth());
                    sb2.append("x");
                    sb2.append(((on9) this.b).c.getHeight());
                    sb2.append(", buffer=");
                    uq5 uq5Var = ((on9) this.b).c;
                    sb2.append(Math.max(1, Math.min(720, Math.min(uq5Var.getWidth(), uq5Var.getHeight()))));
                    sb2.append(", attached=");
                    sb2.append(((on9) this.b).c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((on9) this.b).c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((on9) this.b).c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((on9) this.b).c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    sb2.append(((on9) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((on9) this.b).c.getDisplay().getRefreshRate()));
                    sn9Var2.b(sb2.toString());
                }
                on9 on9Var2 = (on9) this.b;
                long j3 = on9Var2.I0;
                if (j3 != 0) {
                    long j4 = elapsedRealtimeNanos - j3;
                    j = 0;
                    on9Var2.K0++;
                    on9Var2.L0 += j4;
                    j2 = 1;
                    double d = j4;
                    on9Var2.M0 = (d * d) + on9Var2.M0;
                    long j5 = on9Var2.N0;
                    if (j5 == 0 || j4 < j5) {
                        on9Var2.N0 = j4;
                    }
                    on9Var2.O0 = Math.max(on9Var2.O0, j4);
                    if (j4 > 50000000) {
                        on9Var2.P0++;
                    }
                    if (j4 > 100000000) {
                        on9Var2.Q0++;
                    }
                } else {
                    j = 0;
                    j2 = 1;
                }
                on9 on9Var3 = (on9) this.b;
                on9Var3.I0 = elapsedRealtimeNanos;
                long j6 = on9Var3.J0;
                if (timestamp > j6) {
                    if (on9Var3.S0 == j) {
                        on9Var3.S0 = timestamp;
                    }
                    on9Var3.T0 = timestamp;
                    on9Var3.R0 += j2;
                } else if (j6 != j) {
                    on9Var3.U0 += j2;
                }
                on9Var3.J0 = timestamp;
                on9Var3.H0 += j2;
                long j7 = elapsedRealtimeNanos - on9Var3.G0;
                if (j7 >= 5000000000L) {
                    uq5 uq5Var2 = on9Var3.c;
                    long j8 = on9Var3.T0 - on9Var3.S0;
                    if (j8 > j) {
                        if (on9Var3.R0 > j2) {
                            f = ((r11 - j2) * 1.0E9f) / j8;
                            on9Var3.j.b("preview frame delivery: callbackFps=" + ((on9Var3.H0 * 1.0E9f) / j7) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + on9.d(on9Var3.L0, on9Var3.K0) + ", min=" + (on9Var3.N0 / 1000000.0f) + ", max=" + (on9Var3.O0 / 1000000.0f) + ", jitter=" + on9.U(on9Var3.M0, on9Var3.L0, on9Var3.K0) + "}, gaps={over50ms=" + on9Var3.P0 + ", over100ms=" + on9Var3.Q0 + "}, nonMonotonicTimestamps=" + on9Var3.U0 + ", viewState={shown=" + uq5Var2.isShown() + ", alpha=" + uq5Var2.getAlpha() + ", windowVisibility=" + uq5Var2.getWindowVisibility() + "}");
                            on9Var3.O();
                            on9Var3.G0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f = 0.0f;
                    on9Var3.j.b("preview frame delivery: callbackFps=" + ((on9Var3.H0 * 1.0E9f) / j7) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + on9.d(on9Var3.L0, on9Var3.K0) + ", min=" + (on9Var3.N0 / 1000000.0f) + ", max=" + (on9Var3.O0 / 1000000.0f) + ", jitter=" + on9.U(on9Var3.M0, on9Var3.L0, on9Var3.K0) + "}, gaps={over50ms=" + on9Var3.P0 + ", over100ms=" + on9Var3.Q0 + "}, nonMonotonicTimestamps=" + on9Var3.U0 + ", viewState={shown=" + uq5Var2.isShown() + ", alpha=" + uq5Var2.getAlpha() + ", windowVisibility=" + uq5Var2.getWindowVisibility() + "}");
                    on9Var3.O();
                    on9Var3.G0 = elapsedRealtimeNanos;
                }
                break;
            case 3:
            case 4:
            case 5:
                break;
            default:
                hyc hycVar = (hyc) this.b;
                if (hycVar.r == 1) {
                    hycVar.n.getViewTreeObserver().addOnPreDrawListener(new gb(this, (byte) 13));
                    hycVar.n.invalidate();
                    break;
                }
                break;
        }
    }

    private final void d(SurfaceTexture surfaceTexture) {
    }

    private final void e(SurfaceTexture surfaceTexture) {
    }

    private final void f(SurfaceTexture surfaceTexture) {
    }

    private final void g(SurfaceTexture surfaceTexture) {
    }

    private final void h(SurfaceTexture surfaceTexture) {
    }

    private final void a(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    private final void b(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    private final void c(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
