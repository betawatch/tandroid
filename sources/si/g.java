package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.z70;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes4.dex */
public final class g extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ g(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                if (kVar.B == cameraCaptureSession) {
                    kVar.B = null;
                    kVar.D = null;
                    kVar.p0 = false;
                    break;
                }
                break;
            default:
                k kVar2 = this.b;
                if (kVar2.A == cameraCaptureSession) {
                    kVar2.A = null;
                    kVar2.C = null;
                    kVar2.Q = false;
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
                if (kVar.m0 && kVar.s0 != null && cameraCaptureSession.getDevice() == kVar.s0) {
                    kVar.A("standby session configuration failed", null, true);
                    break;
                }
                break;
            default:
                cameraCaptureSession.close();
                if (this.b.z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    k kVar2 = this.b;
                    if (device == kVar2.z) {
                        if (kVar2.A == cameraCaptureSession) {
                            kVar2.A = null;
                            kVar2.C = null;
                        }
                        if (kVar2.V) {
                            k kVar3 = this.b;
                            if (kVar3.z != null && !kVar3.b0) {
                                k kVar4 = this.b;
                                if (!kVar4.m0) {
                                    if (kVar4.s0 != null && !kVar4.l0) {
                                        if (!kVar4.X || !kVar4.D0) {
                                            kVar4.j.b("camera session configuration failed with warm device open");
                                            this.b.R("session configuration failed", null);
                                            break;
                                        } else {
                                            kVar4.L("session configuration failed", null);
                                            break;
                                        }
                                    } else if (kVar4.J != o0.c) {
                                        kVar4.N(new IllegalStateException("Camera capture session configuration failed"));
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
        j jVar;
        String str;
        switch (this.a) {
            case 0:
                if (this.b.V) {
                    k kVar = this.b;
                    if (kVar.m0 && kVar.s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.b;
                        CameraDevice cameraDevice = kVar2.s0;
                        if (device == cameraDevice && (surface = kVar2.v) != null && (jVar = kVar2.w0) != null) {
                            try {
                                kVar2.B = cameraCaptureSession;
                                kVar2.D = kVar2.x(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.b.D.build();
                                k kVar3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.t1, kVar3.n);
                                k kVar4 = this.b;
                                kVar4.p0 = true;
                                kVar4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.z(this.b.G0));
                                k.f(this.b);
                                return;
                            } catch (Exception e) {
                                this.b.A("standby request submission failed", e, true);
                                return;
                            }
                        }
                    }
                }
                this.b.j.b("stale standby capture session ignored: id=" + cameraCaptureSession.getDevice().getId());
                cameraCaptureSession.close();
                return;
            default:
                if (this.b.V && this.b.z != null) {
                    CameraDevice device2 = cameraCaptureSession.getDevice();
                    k kVar5 = this.b;
                    CameraDevice cameraDevice2 = kVar5.z;
                    if (device2 == cameraDevice2) {
                        kVar5.A = cameraCaptureSession;
                        try {
                            kVar5.G = kVar5.H;
                            if (cameraDevice2 == null || kVar5.u == null) {
                                throw new IllegalStateException("Camera request surfaces are unavailable");
                            }
                            kVar5.C = kVar5.x(cameraDevice2, kVar5.u, kVar5.l(), true, true);
                            u uVar = this.b.w;
                            if (uVar != null) {
                                Handler handler = uVar.u;
                                if (uVar.r0 && handler != null) {
                                    handler.post(new q(uVar, 0));
                                }
                            }
                            k kVar6 = this.b;
                            boolean z10 = kVar6.m0 && kVar6.x0 != null;
                            boolean z11 = kVar6.Z && !z10;
                            CameraCaptureSession cameraCaptureSession2 = kVar6.A;
                            CaptureRequest.Builder builder = kVar6.C;
                            if (cameraCaptureSession2 != null && builder != null) {
                                cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.t1, kVar6.n);
                            }
                            k kVar7 = this.b;
                            if (kVar7.m0) {
                                kVar7.o0 = true;
                            }
                            if (!z10) {
                                kVar7.Z = false;
                            }
                            if (z11) {
                                kVar7.X = false;
                            }
                            kVar7.a0 = z11;
                            o oVar = this.b.j;
                            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                            sb2.append(this.b.G);
                            sb2.append(", fpsRange=");
                            sb2.append(this.b.K);
                            sb2.append(", elapsedMs=");
                            sb2.append(k.z(this.b.G0));
                            sb2.append(", segmentElapsedMs=");
                            sb2.append(k.z(this.b.E0));
                            if (z11) {
                                StringBuilder sb3 = new StringBuilder(", switchPath=");
                                sb3.append(this.b.D0 ? "WARM_DEVICE" : "SEQUENTIAL");
                                sb3.append(", switchElapsedMs=");
                                sb3.append(k.z(this.b.H0));
                                str = sb3.toString();
                            } else {
                                str = "";
                            }
                            sb2.append(str);
                            oVar.b(sb2.toString());
                            k kVar8 = this.b;
                            kVar8.c.post(new b(kVar8, 8));
                            k kVar9 = this.b;
                            l2.f fVar = kVar9.k;
                            m0 m0Var = kVar9.G;
                            n0 n0Var = kVar9.I;
                            o0 o0Var = kVar9.J;
                            Size size = kVar9.q;
                            Size size2 = kVar9.r;
                            k kVar10 = this.b;
                            ((t0) fVar.b).i.post(new z70(fVar, new i(m0Var, n0Var, o0Var, size, size2, kVar10.O, kVar10.F()), z11, 18));
                            if (z10) {
                                k.f(this.b);
                                return;
                            }
                            m0 m0Var2 = this.b.F;
                            k kVar11 = this.b;
                            if (m0Var2 != kVar11.G) {
                                kVar11.a0(kVar11.F);
                                return;
                            }
                            return;
                        } catch (Exception e7) {
                            k kVar12 = this.b;
                            if (kVar12.m0) {
                                kVar12.A("active request submission failed", e7, false);
                                return;
                            }
                            if (kVar12.X && kVar12.D0) {
                                kVar12.L("request submission failed", e7);
                                return;
                            } else if (kVar12.J == o0.c) {
                                kVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                kVar12.N(e7);
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
