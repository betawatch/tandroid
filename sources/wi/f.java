package wi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.Components.rt;
import org.telegram.ui.g60;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                if (kVar.B == cameraCaptureSession) {
                    kVar.B = null;
                    kVar.D = null;
                    kVar.n0 = false;
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
                if (kVar.l0 && kVar.p0 != null && cameraCaptureSession.getDevice() == kVar.p0) {
                    kVar.B("standby session configuration failed", null, true);
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
                            if (kVar3.z != null && !kVar3.Z) {
                                k kVar4 = this.b;
                                if (!kVar4.l0) {
                                    if (kVar4.J != o0.c) {
                                        kVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                        break;
                                    } else {
                                        kVar4.C("60 fps session configuration failed", null);
                                        break;
                                    }
                                } else {
                                    kVar4.B("active session configuration failed", null, false);
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
                if (this.b.V) {
                    k kVar = this.b;
                    if (kVar.l0 && kVar.p0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        k kVar2 = this.b;
                        CameraDevice cameraDevice = kVar2.p0;
                        if (device == cameraDevice && (surface = kVar2.v) != null && (iVar = kVar2.q0) != null) {
                            try {
                                kVar2.B = cameraCaptureSession;
                                kVar2.D = kVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.b.D.build();
                                k kVar3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, kVar3.s1, kVar3.n);
                                k kVar4 = this.b;
                                kVar4.n0 = true;
                                kVar4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + k.A(this.b.F0));
                                k.d(this.b);
                                return;
                            } catch (Exception e10) {
                                this.b.B("standby request submission failed", e10, true);
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
                            kVar5.C = kVar5.x(cameraDevice2, kVar5.u, kVar5.k(), true, true);
                            t tVar = this.b.w;
                            if (tVar != null) {
                                Handler handler = tVar.u;
                                if (tVar.r0 && handler != null) {
                                    handler.post(new q(tVar, 0));
                                }
                            }
                            k kVar6 = this.b;
                            boolean z9 = kVar6.l0 && kVar6.r0 != null;
                            boolean z10 = kVar6.X && !z9;
                            CameraCaptureSession cameraCaptureSession2 = kVar6.A;
                            CaptureRequest.Builder builder = kVar6.C;
                            if (cameraCaptureSession2 != null && builder != null) {
                                cameraCaptureSession2.setRepeatingRequest(builder.build(), kVar6.s1, kVar6.n);
                            }
                            k kVar7 = this.b;
                            if (kVar7.l0) {
                                kVar7.m0 = true;
                            }
                            if (!z9) {
                                kVar7.X = false;
                            }
                            if (z10) {
                                kVar7.W = false;
                            }
                            kVar7.Y = z10;
                            o oVar = this.b.j;
                            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                            sb2.append(this.b.G);
                            sb2.append(", fpsRange=");
                            sb2.append(this.b.K);
                            sb2.append(", elapsedMs=");
                            sb2.append(k.A(this.b.F0));
                            sb2.append(", segmentElapsedMs=");
                            sb2.append(k.A(this.b.D0));
                            if (z10) {
                                str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + k.A(this.b.G0);
                            } else {
                                str = "";
                            }
                            sb2.append(str);
                            oVar.b(sb2.toString());
                            k kVar8 = this.b;
                            kVar8.c.post(new a(kVar8, 9));
                            k kVar9 = this.b;
                            rt rtVar = kVar9.k;
                            m0 m0Var = kVar9.G;
                            n0 n0Var = kVar9.I;
                            o0 o0Var = kVar9.J;
                            Size size = kVar9.q;
                            Size size2 = kVar9.r;
                            k kVar10 = this.b;
                            ((t0) rtVar.b).i.post(new g60(rtVar, new h(m0Var, n0Var, o0Var, size, size2, kVar10.O, kVar10.G()), z10, 18));
                            if (z9) {
                                k.d(this.b);
                                return;
                            }
                            m0 m0Var2 = this.b.F;
                            k kVar11 = this.b;
                            if (m0Var2 != kVar11.G) {
                                kVar11.Z(kVar11.F);
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            k kVar12 = this.b;
                            if (kVar12.l0) {
                                kVar12.B("active request submission failed", e11, false);
                                return;
                            } else if (kVar12.J == o0.c) {
                                kVar12.C("60 fps request submission rejected", e11);
                                return;
                            } else {
                                kVar12.N(e11);
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
