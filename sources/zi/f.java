package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.a80;
import y7.h7;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final class f extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ f(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (kVar.A == cameraCaptureSession) {
                    kVar.A = null;
                    kVar.C = null;
                    kVar.m0 = false;
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                if (kVar2.z == cameraCaptureSession) {
                    kVar2.z = null;
                    kVar2.B = null;
                    kVar2.P = false;
                    kVar2.j.b("capture session closed");
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                cameraCaptureSession.close();
                k kVar = this.b;
                if (kVar.k0 && kVar.o0 != null && cameraCaptureSession.getDevice() == kVar.o0) {
                    kVar.A("standby session configuration failed", null, true);
                    break;
                }
                break;
            default:
                cameraCaptureSession.close();
                if (this.b.y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.b;
                    if (device == kVar2.y) {
                        if (kVar2.z == cameraCaptureSession) {
                            kVar2.z = null;
                            kVar2.B = null;
                        }
                        if (kVar2.U) {
                            k kVar3 = this.b;
                            if (kVar3.y != null && !kVar3.Y) {
                                k kVar4 = this.b;
                                if (!kVar4.k0) {
                                    if (kVar4.I != p0.c) {
                                        kVar4.M(new IllegalStateException("Camera capture session configuration failed"));
                                        break;
                                    } else {
                                        kVar4.B("60 fps session configuration failed", null);
                                        break;
                                    }
                                } else {
                                    kVar4.A("active session configuration failed", null, false);
                                    break;
                                }
                            }
                        }
                        this.b.j.b("stale capture session configuration failure ignored");
                        break;
                    }
                }
                this.b.j.b("stale capture session configuration failure ignored: id=" + cameraCaptureSession.getDevice().getId());
                break;
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
        Surface surface;
        i iVar;
        String str;
        switch (this.a) {
            case 0:
                if (this.b.U) {
                    k kVar = this.b;
                    if (kVar.k0 && kVar.o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.b;
                        CameraDevice cameraDevice = kVar2.o0;
                        if (device == cameraDevice && (surface = kVar2.u) != null && (iVar = kVar2.p0) != null) {
                            try {
                                kVar2.A = cameraCaptureSession;
                                kVar2.C = kVar2.w(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.b.C.build();
                                k kVar3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.r1, kVar3.n);
                                k kVar4 = this.b;
                                kVar4.m0 = true;
                                kVar4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.z(this.b.E0));
                                k.d(this.b);
                                return;
                            } catch (Exception e10) {
                                this.b.A("standby request submission failed", e10, true);
                                return;
                            }
                        }
                    }
                }
                this.b.j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.b.U && this.b.y != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.b;
                    CameraDevice cameraDevice2 = kVar5.y;
                    if (device2 == cameraDevice2) {
                        kVar5.z = cameraCaptureSession;
                        try {
                            kVar5.F = kVar5.G;
                            if (cameraDevice2 == null || kVar5.t == null) {
                                throw new IllegalStateException("Camera request surfaces are unavailable");
                            }
                            kVar5.B = kVar5.w(cameraDevice2, kVar5.t, kVar5.k(), true, true);
                            t tVar = this.b.v;
                            if (tVar != null) {
                                Handler handler = tVar.u;
                                if (tVar.r0 && handler != null) {
                                    handler.post(new q(tVar, 0));
                                }
                            }
                            k kVar6 = this.b;
                            boolean z10 = kVar6.k0 && kVar6.q0 != null;
                            boolean z11 = kVar6.W && !z10;
                            CameraCaptureSession cameraCaptureSession2 = kVar6.z;
                            CaptureRequest.Builder builder = kVar6.B;
                            if (cameraCaptureSession2 != null && builder != null) {
                                cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.r1, kVar6.n);
                            }
                            k kVar7 = this.b;
                            if (kVar7.k0) {
                                kVar7.l0 = true;
                            }
                            if (!z10) {
                                kVar7.W = false;
                            }
                            if (z11) {
                                kVar7.V = false;
                            }
                            kVar7.X = z11;
                            o oVar = this.b.j;
                            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                            sb2.append(this.b.F);
                            sb2.append(", fpsRange=");
                            sb2.append(this.b.J);
                            sb2.append(", elapsedMs=");
                            sb2.append(k.z(this.b.E0));
                            sb2.append(", segmentElapsedMs=");
                            sb2.append(k.z(this.b.C0));
                            if (z11) {
                                str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + k.z(this.b.F0);
                            } else {
                                str = "";
                            }
                            sb2.append(str);
                            oVar.b(sb2.toString());
                            k kVar8 = this.b;
                            kVar8.c.post(new a(kVar8, 9));
                            k kVar9 = this.b;
                            h7 h7Var = kVar9.k;
                            n0 n0Var = kVar9.F;
                            o0 o0Var = kVar9.H;
                            p0 p0Var = kVar9.I;
                            Size size = kVar9.q;
                            k kVar10 = this.b;
                            ((u0) h7Var.a).i.post(new a80(h7Var, new h(n0Var, o0Var, p0Var, size, kVar10.N, kVar10.F()), z11, 17));
                            if (z10) {
                                k.d(this.b);
                                return;
                            }
                            n0 n0Var2 = this.b.E;
                            k kVar11 = this.b;
                            if (n0Var2 != kVar11.F) {
                                kVar11.Y(kVar11.E);
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            k kVar12 = this.b;
                            if (kVar12.k0) {
                                kVar12.A("active request submission failed", e11, false);
                                return;
                            } else if (kVar12.I == p0.c) {
                                kVar12.B("60 fps request submission rejected", e11);
                                return;
                            } else {
                                kVar12.M(e11);
                                return;
                            }
                        }
                    }
                }
                this.b.j.b("stale capture session ignored: deviceId=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
        }
    }
}
