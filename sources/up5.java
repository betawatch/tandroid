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
import org.telegram.ui.PhotoViewer;
import org.webrtc.EglRenderer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class up5 implements TextureView.SurfaceTextureListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ up5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [djb] */
    /* JADX WARN: Type inference failed for: r7v0, types: [djb] */
    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        final byte b = 1;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        switch (this.a) {
            case 0:
                wp5 wp5Var = (wp5) this.b;
                if (wp5Var.J == null && surfaceTexture != null) {
                    wp5Var.J = new vp5(wp5Var, surfaceTexture);
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    wp5Var.J.postRunnable(new tp5(this, objArr == true ? 1 : 0));
                    vp5 vp5Var = wp5Var.J;
                    vp5Var.postRunnable(vp5Var.x);
                    break;
                }
                break;
            case 2:
                ta8 ta8Var = (ta8) this.b;
                EglRenderer eglRenderer = ta8Var.a;
                if (!ta8Var.c && ta8Var.b != surfaceTexture) {
                    ta8Var.b = surfaceTexture;
                    if (i > 0 && i2 > 0) {
                        eglRenderer.setLayoutAspectRatio(i / i2);
                    }
                    eglRenderer.createEglSurface(surfaceTexture);
                    break;
                }
                break;
            case 3:
                ak9 ak9Var = (ak9) this.b;
                ak9Var.j.b("preview surface available: view=" + i + "x" + i2);
                Handler handler = ak9Var.n;
                if (ak9Var.U && handler != null && ak9Var.c.isAvailable()) {
                    handler.post(new pj9(ak9Var, (byte) 8));
                    break;
                }
                break;
            case 4:
                pla plaVar = (pla) this.b;
                if (plaVar.f == null) {
                    ola olaVar = new ola(plaVar, surfaceTexture, i, i2, new nla(plaVar, b));
                    plaVar.f = olaVar;
                    olaVar.start();
                    break;
                }
                break;
            case 5:
                final ijb ijbVar = (ijb) this.b;
                ArrayList arrayList = ijbVar.c;
                gjb gjbVar = ijbVar.a;
                if (gjbVar != null) {
                    gjbVar.g();
                    ijbVar.a = null;
                }
                final Object[] objArr3 = objArr2 == true ? 1 : 0;
                gjb gjbVar2 = new gjb(surfaceTexture, new Runnable() { // from class: djb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = objArr3;
                        ijb ijbVar2 = ijbVar;
                        switch (b2) {
                            case 0:
                                ijbVar2.invalidate();
                                break;
                            default:
                                Boolean bool = ijb.f;
                                Runnable runnable = ijbVar2.d;
                                if (runnable != null) {
                                    ijbVar2.e = true;
                                    ijbVar2.d = null;
                                    ijb.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, new Runnable() { // from class: djb
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        ijb ijbVar2 = ijbVar;
                        switch (b2) {
                            case 0:
                                ijbVar2.invalidate();
                                break;
                            default:
                                Boolean bool = ijb.f;
                                Runnable runnable = ijbVar2.d;
                                if (runnable != null) {
                                    ijbVar2.e = true;
                                    ijbVar2.d = null;
                                    ijb.b(runnable);
                                    break;
                                }
                                break;
                        }
                    }
                }, i, i2);
                ijbVar.a = gjbVar2;
                gjbVar2.a = h24.m(ijbVar.getContext()).h();
                if (!arrayList.isEmpty()) {
                    for (int i3 = 0; i3 < arrayList.size(); i3++) {
                        hjb hjbVar = (hjb) arrayList.get(i3);
                        Bitmap bitmap = hjbVar.e;
                        if (bitmap != null) {
                            ijbVar.a.c(hjbVar.f, bitmap, hjbVar.c, hjbVar.d);
                        } else {
                            ArrayList arrayList2 = hjbVar.b;
                            gjb gjbVar3 = ijbVar.a;
                            if (arrayList2 != null) {
                                gjbVar3.d(arrayList2, hjbVar.d);
                            } else {
                                gjbVar3.b(hjbVar.g, hjbVar.a, hjbVar.d);
                            }
                        }
                    }
                    arrayList.clear();
                    Choreographer.getInstance().postFrameCallback(ijbVar.b);
                    break;
                }
                break;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        byte b = 2;
        switch (this.a) {
            case 0:
                wp5 wp5Var = (wp5) this.b;
                vp5 vp5Var = wp5Var.J;
                if (vp5Var != null) {
                    vp5Var.postRunnable(new tp5(vp5Var, b));
                    wp5Var.J = null;
                }
                return true;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                TextureView textureView = photoViewer.C2;
                if (textureView == null || !photoViewer.F3) {
                    return true;
                }
                if (photoViewer.L3) {
                    photoViewer.G3 = (byte) 2;
                }
                textureView.setSurfaceTexture(surfaceTexture);
                photoViewer.C2.setVisibility(0);
                photoViewer.F3 = false;
                photoViewer.f0.invalidate();
                return false;
            case 3:
                ((ak9) this.b).j.b("preview surface destroyed: active=" + ((ak9) this.b).U);
                if (((ak9) this.b).U) {
                    ((ak9) this.b).M(new IllegalStateException("Preview SurfaceTexture was destroyed"));
                }
            case 2:
                return true;
            case 4:
                ola olaVar = ((pla) this.b).f;
                if (olaVar != null) {
                    olaVar.a = false;
                    ((pla) this.b).f = null;
                }
                return true;
            case 5:
                ijb ijbVar = (ijb) this.b;
                gjb gjbVar = ijbVar.a;
                if (gjbVar != null) {
                    gjbVar.g();
                    ijbVar.a = null;
                }
                Runnable runnable = ijbVar.d;
                if (runnable != null) {
                    ijbVar.d = null;
                    ijb.b(runnable);
                }
                return false;
            default:
                stc stcVar = (stc) this.b;
                TextureView textureView2 = stcVar.d;
                if (!stcVar.T) {
                    return true;
                }
                if (stcVar.a0) {
                    stcVar.r = (byte) 2;
                }
                textureView2.setSurfaceTexture(surfaceTexture);
                textureView2.setVisibility(0);
                stcVar.T = false;
                return false;
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        Handler handler;
        switch (this.a) {
            case 0:
                if (((wp5) this.b).J != null) {
                    Intro.onSurfaceChanged(i, i2, Math.min(i / 150.0f, i2 / 150.0f), 0);
                    return;
                }
                return;
            case 1:
                return;
            case 2:
                ta8 ta8Var = (ta8) this.b;
                if (i <= 0 || i2 <= 0) {
                    return;
                }
                ta8Var.a.setLayoutAspectRatio(i / i2);
                return;
            case 3:
                ak9 ak9Var = (ak9) this.b;
                ak9Var.j.b("preview surface size changed: view=" + i + "x" + i2);
                ak9Var.a0();
                return;
            case 4:
                ola olaVar = ((pla) this.b).f;
                if (olaVar != null) {
                    synchronized (olaVar.e) {
                        olaVar.f = true;
                        olaVar.h = i;
                        olaVar.n = i2;
                    }
                    return;
                }
                return;
            case 5:
                gjb gjbVar = ((ijb) this.b).a;
                if (gjbVar == null || (handler = gjbVar.getHandler()) == null || !gjbVar.b.get()) {
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
        byte b = 1;
        switch (this.a) {
            case 0:
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) this.b;
                if (photoViewer.G3 == 1) {
                    photoViewer.s(true);
                    break;
                }
                break;
            case 2:
                break;
            case 3:
                if (((ak9) this.b).X) {
                    ((ak9) this.b).X = false;
                    ek9 ek9Var = ((ak9) this.b).j;
                    StringBuilder sb = new StringBuilder("camera switch first preview frame: path=");
                    sb.append(((ak9) this.b).k0 ? "DUAL_ACTIVE" : "SEQUENTIAL");
                    sb.append(", totalElapsedMs=");
                    sb.append(ak9.x(((ak9) this.b).F0));
                    ek9Var.b(sb.toString());
                    ul9 ul9Var = (ul9) ((ak9) this.b).k.b;
                    Handler handler = ul9Var.i;
                    gi3 gi3Var = ul9Var.d;
                    Objects.requireNonNull(gi3Var);
                    handler.post(new zk9(gi3Var, b));
                }
                long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                long timestamp = surfaceTexture.getTimestamp();
                ak9 ak9Var = (ak9) this.b;
                if (ak9Var.G0 == 0) {
                    ak9Var.G0 = elapsedRealtimeNanos;
                    ek9 ek9Var2 = ak9Var.j;
                    StringBuilder sb2 = new StringBuilder("preview frame delivery started: thread=");
                    sb2.append(Thread.currentThread().getName());
                    sb2.append(", view=");
                    sb2.append(((ak9) this.b).c.getWidth());
                    sb2.append("x");
                    sb2.append(((ak9) this.b).c.getHeight());
                    sb2.append(", buffer=");
                    ro5 ro5Var = ((ak9) this.b).c;
                    sb2.append(Math.max(1, Math.min(720, Math.min(ro5Var.getWidth(), ro5Var.getHeight()))));
                    sb2.append(", attached=");
                    sb2.append(((ak9) this.b).c.isAttachedToWindow());
                    sb2.append(", shown=");
                    sb2.append(((ak9) this.b).c.isShown());
                    sb2.append(", alpha=");
                    sb2.append(((ak9) this.b).c.getAlpha());
                    sb2.append(", hardwareAccelerated=");
                    sb2.append(((ak9) this.b).c.isHardwareAccelerated());
                    sb2.append(", displayRefreshRate=");
                    sb2.append(((ak9) this.b).c.getDisplay() == null ? "unknown" : Float.valueOf(((ak9) this.b).c.getDisplay().getRefreshRate()));
                    ek9Var2.b(sb2.toString());
                }
                ak9 ak9Var2 = (ak9) this.b;
                long j3 = ak9Var2.I0;
                if (j3 != 0) {
                    long j4 = elapsedRealtimeNanos - j3;
                    j = 0;
                    ak9Var2.K0++;
                    ak9Var2.L0 += j4;
                    j2 = 1;
                    double d = j4;
                    ak9Var2.M0 = (d * d) + ak9Var2.M0;
                    long j5 = ak9Var2.N0;
                    if (j5 == 0 || j4 < j5) {
                        ak9Var2.N0 = j4;
                    }
                    ak9Var2.O0 = Math.max(ak9Var2.O0, j4);
                    if (j4 > 50000000) {
                        ak9Var2.P0++;
                    }
                    if (j4 > 100000000) {
                        ak9Var2.Q0++;
                    }
                } else {
                    j = 0;
                    j2 = 1;
                }
                ak9 ak9Var3 = (ak9) this.b;
                ak9Var3.I0 = elapsedRealtimeNanos;
                long j6 = ak9Var3.J0;
                if (timestamp > j6) {
                    if (ak9Var3.S0 == j) {
                        ak9Var3.S0 = timestamp;
                    }
                    ak9Var3.T0 = timestamp;
                    ak9Var3.R0 += j2;
                } else if (j6 != j) {
                    ak9Var3.U0 += j2;
                }
                ak9Var3.J0 = timestamp;
                ak9Var3.H0 += j2;
                long j7 = elapsedRealtimeNanos - ak9Var3.G0;
                if (j7 >= 5000000000L) {
                    ro5 ro5Var2 = ak9Var3.c;
                    long j8 = ak9Var3.T0 - ak9Var3.S0;
                    if (j8 > j) {
                        if (ak9Var3.R0 > j2) {
                            f = ((r11 - j2) * 1.0E9f) / j8;
                            ak9Var3.j.b("preview frame delivery: callbackFps=" + ((ak9Var3.H0 * 1.0E9f) / j7) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + ak9.d(ak9Var3.L0, ak9Var3.K0) + ", min=" + (ak9Var3.N0 / 1000000.0f) + ", max=" + (ak9Var3.O0 / 1000000.0f) + ", jitter=" + ak9.U(ak9Var3.M0, ak9Var3.L0, ak9Var3.K0) + "}, gaps={over50ms=" + ak9Var3.P0 + ", over100ms=" + ak9Var3.Q0 + "}, nonMonotonicTimestamps=" + ak9Var3.U0 + ", viewState={shown=" + ro5Var2.isShown() + ", alpha=" + ro5Var2.getAlpha() + ", windowVisibility=" + ro5Var2.getWindowVisibility() + "}");
                            ak9Var3.O();
                            ak9Var3.G0 = elapsedRealtimeNanos;
                            break;
                        }
                    }
                    f = 0.0f;
                    ak9Var3.j.b("preview frame delivery: callbackFps=" + ((ak9Var3.H0 * 1.0E9f) / j7) + ", timestampFps=" + f + ", callbackIntervalMs={avg=" + ak9.d(ak9Var3.L0, ak9Var3.K0) + ", min=" + (ak9Var3.N0 / 1000000.0f) + ", max=" + (ak9Var3.O0 / 1000000.0f) + ", jitter=" + ak9.U(ak9Var3.M0, ak9Var3.L0, ak9Var3.K0) + "}, gaps={over50ms=" + ak9Var3.P0 + ", over100ms=" + ak9Var3.Q0 + "}, nonMonotonicTimestamps=" + ak9Var3.U0 + ", viewState={shown=" + ro5Var2.isShown() + ", alpha=" + ro5Var2.getAlpha() + ", windowVisibility=" + ro5Var2.getWindowVisibility() + "}");
                    ak9Var3.O();
                    ak9Var3.G0 = elapsedRealtimeNanos;
                }
                break;
            case 4:
            case 5:
                break;
            default:
                stc stcVar = (stc) this.b;
                if (stcVar.r == 1) {
                    stcVar.n.getViewTreeObserver().addOnPreDrawListener(new fb(this, (byte) 12));
                    stcVar.n.invalidate();
                    break;
                }
                break;
        }
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

    private final void d(SurfaceTexture surfaceTexture, int i, int i2) {
    }
}
