// default package

import android.graphics.SurfaceTexture;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class rn6 implements ifc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ r47 c;
    public final /* synthetic */ MediaController d;

    public /* synthetic */ rn6(MediaController mediaController, int i, r47 r47Var, byte b) {
        this.a = b;
        this.d = mediaController;
        this.b = i;
        this.c = r47Var;
    }

    @Override // ifc
    public final void onError(kfc kfcVar, Exception exc) {
        switch (this.a) {
            case 0:
                break;
            default:
                cc4.g(exc, true);
                break;
        }
    }

    @Override // ifc
    public final void onRenderedFirstFrame() {
        switch (this.a) {
            case 0:
                break;
            default:
                String[] strArr = MediaController.W1;
                MediaController mediaController = this.d;
                mediaController.E();
                jx jxVar = mediaController.M0;
                if (jxVar != null && !jxVar.d) {
                    mediaController.N0 = true;
                    jxVar.setDrawingReady(true);
                    mediaController.O0.setTag(1);
                    break;
                }
                break;
        }
    }

    @Override // ifc
    public final void onSeekFinished(uj ujVar) {
        byte b = this.a;
    }

    @Override // ifc
    public final void onSeekStarted(uj ujVar) {
        byte b = this.a;
    }

    @Override // ifc
    public final void onStateChanged(boolean z, int i) {
        byte b = this.a;
        int i2 = this.b;
        switch (b) {
            case 0:
                MediaController mediaController = this.d;
                ArrayList arrayList = mediaController.S0;
                if (i2 == mediaController.n0) {
                    r47 r47Var = this.c;
                    if (i == 4 || ((i == 1 || i == 2) && z && r47Var.b0 >= 0.999f)) {
                        r47Var.b0 = 1.0f;
                        jn7.f(r47Var.K1).k(jn7.e2, Integer.valueOf(r47Var.e1()), 0);
                        if (!mediaController.d0()) {
                            if (arrayList.isEmpty() || (arrayList.size() <= 1 && r47.Q4(r47Var.k))) {
                                mediaController.m(true, mediaController.D(), r47.Q4(r47Var.k), false);
                            } else {
                                mediaController.X(true);
                            }
                        }
                    } else {
                        if (mediaController.j0 != null && mediaController.u0 != 0.0f && (i == 3 || i == 1)) {
                            mediaController.j0.p0((int) (r8.U() * mediaController.u0), false);
                            mediaController.u0 = 0.0f;
                        }
                    }
                    if (mediaController.j0 != null && go.w()) {
                        mediaController.j0.s0(true);
                        break;
                    }
                }
                break;
            default:
                MediaController mediaController2 = this.d;
                if (i2 == mediaController2.n0) {
                    mediaController2.L0(this.c, null, true, z, i);
                    break;
                }
                break;
        }
    }

    @Override // ifc
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.a) {
            case 0:
                return false;
            default:
                if (this.d.F0 == null || !PhotoViewer.C0() || PhotoViewer.q0().S2 == null) {
                    return false;
                }
                PhotoViewer.q0().T2 = surfaceTexture;
                return true;
        }
    }

    @Override // ifc
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        byte b = this.a;
    }

    @Override // ifc
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
        switch (this.a) {
            case 0:
                break;
            default:
                float f2 = i2 == 0 ? 1.0f : (i * f) / i2;
                MediaController mediaController = this.d;
                mediaController.P0 = f2;
                jx jxVar = mediaController.M0;
                if (jxVar != null) {
                    jxVar.a(f2, 0);
                    break;
                }
                break;
        }
    }

    private final void b() {
    }

    private final void c(uj ujVar) {
    }

    private final void d(uj ujVar) {
    }

    private final void e(uj ujVar) {
    }

    private final void f(uj ujVar) {
    }

    private final void g(uj ujVar) {
    }

    private final void h(uj ujVar) {
    }

    private final void i(SurfaceTexture surfaceTexture) {
    }

    private final void j(SurfaceTexture surfaceTexture) {
    }

    @Override // ifc
    public final void onRenderedFirstFrame(uj ujVar) {
        byte b = this.a;
    }

    private final void a(kfc kfcVar, Exception exc) {
    }

    private final void k(int i, int i2, float f, int i3) {
    }
}
