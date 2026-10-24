package si;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import k2.w0;
import org.telegram.ui.v90;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class f extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ f(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                if (jVar.B == cameraCaptureSession) {
                    jVar.B = null;
                    jVar.D = null;
                    jVar.p0 = false;
                    break;
                }
                break;
            default:
                j jVar2 = this.b;
                if (jVar2.A == cameraCaptureSession) {
                    jVar2.A = null;
                    jVar2.C = null;
                    jVar2.Q = false;
                    jVar2.j.b("capture session closed");
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
                j jVar = this.b;
                if (jVar.m0 && jVar.s0 != null && cameraCaptureSession.getDevice() == jVar.s0) {
                    jVar.A("standby session configuration failed", null, true);
                    break;
                }
                break;
            default:
                cameraCaptureSession.close();
                if (this.b.z != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    j jVar2 = this.b;
                    if (device == jVar2.z) {
                        if (jVar2.A == cameraCaptureSession) {
                            jVar2.A = null;
                            jVar2.C = null;
                        }
                        if (jVar2.V) {
                            j jVar3 = this.b;
                            if (jVar3.z != null && !jVar3.b0) {
                                j jVar4 = this.b;
                                if (!jVar4.m0) {
                                    if (jVar4.s0 != null && !jVar4.l0) {
                                        if (!jVar4.X || !jVar4.D0) {
                                            jVar4.j.b("camera session configuration failed with warm device open");
                                            this.b.R("session configuration failed", null);
                                            break;
                                        } else {
                                            jVar4.L("session configuration failed", null);
                                            break;
                                        }
                                    } else if (jVar4.J != p0.c) {
                                        jVar4.N(new IllegalStateException("Camera capture session configuration failed"));
                                        break;
                                    } else {
                                        jVar4.B("60 fps session configuration failed", null);
                                        break;
                                    }
                                } else {
                                    jVar4.A("active session configuration failed", null, false);
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
                    j jVar = this.b;
                    if (jVar.m0 && jVar.s0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        j jVar2 = this.b;
                        CameraDevice cameraDevice = jVar2.s0;
                        if (device == cameraDevice && (surface = jVar2.v) != null && (iVar = jVar2.w0) != null) {
                            try {
                                jVar2.B = cameraCaptureSession;
                                jVar2.D = jVar2.x(cameraDevice, surface, iVar, false, true);
                                CaptureRequest build = this.b.D.build();
                                j jVar3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, jVar3.t1, jVar3.n);
                                j jVar4 = this.b;
                                jVar4.p0 = true;
                                jVar4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + j.z(this.b.G0));
                                j.f(this.b);
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
                    j jVar5 = this.b;
                    CameraDevice cameraDevice2 = jVar5.z;
                    if (device2 == cameraDevice2) {
                        jVar5.A = cameraCaptureSession;
                        try {
                            jVar5.G = jVar5.H;
                            if (cameraDevice2 == null || jVar5.u == null) {
                                throw new IllegalStateException("Camera request surfaces are unavailable");
                            }
                            jVar5.C = jVar5.x(cameraDevice2, jVar5.u, jVar5.l(), true, true);
                            t tVar = this.b.w;
                            if (tVar != null) {
                                Handler handler = tVar.u;
                                if (tVar.r0 && handler != null) {
                                    handler.post(new p(tVar, 0));
                                }
                            }
                            j jVar6 = this.b;
                            boolean z10 = jVar6.m0 && jVar6.x0 != null;
                            boolean z11 = jVar6.Z && !z10;
                            CameraCaptureSession cameraCaptureSession2 = jVar6.A;
                            CaptureRequest.Builder builder = jVar6.C;
                            if (cameraCaptureSession2 != null && builder != null) {
                                cameraCaptureSession2.setRepeatingRequest(builder.build(), jVar6.t1, jVar6.n);
                            }
                            j jVar7 = this.b;
                            if (jVar7.m0) {
                                jVar7.o0 = true;
                            }
                            if (!z10) {
                                jVar7.Z = false;
                            }
                            if (z11) {
                                jVar7.X = false;
                            }
                            jVar7.a0 = z11;
                            n nVar = this.b.j;
                            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                            sb2.append(this.b.G);
                            sb2.append(", fpsRange=");
                            sb2.append(this.b.K);
                            sb2.append(", elapsedMs=");
                            sb2.append(j.z(this.b.G0));
                            sb2.append(", segmentElapsedMs=");
                            sb2.append(j.z(this.b.E0));
                            if (z11) {
                                StringBuilder sb3 = new StringBuilder(", switchPath=");
                                sb3.append(this.b.D0 ? "WARM_DEVICE" : "SEQUENTIAL");
                                sb3.append(", switchElapsedMs=");
                                sb3.append(j.z(this.b.H0));
                                str = sb3.toString();
                            } else {
                                str = "";
                            }
                            sb2.append(str);
                            nVar.b(sb2.toString());
                            j jVar8 = this.b;
                            jVar8.c.post(new a(jVar8, 8));
                            j jVar9 = this.b;
                            w0 w0Var = jVar9.k;
                            m0 m0Var = jVar9.G;
                            n0 n0Var = jVar9.I;
                            p0 p0Var = jVar9.J;
                            Size size = jVar9.q;
                            Size size2 = jVar9.r;
                            j jVar10 = this.b;
                            ((u0) w0Var.b).i.post(new v90(w0Var, new h(m0Var, n0Var, p0Var, size, size2, jVar10.O, jVar10.F()), z11, 17));
                            if (z10) {
                                j.f(this.b);
                                return;
                            }
                            m0 m0Var2 = this.b.F;
                            j jVar11 = this.b;
                            if (m0Var2 != jVar11.G) {
                                jVar11.a0(jVar11.F);
                                return;
                            }
                            return;
                        } catch (Exception e7) {
                            j jVar12 = this.b;
                            if (jVar12.m0) {
                                jVar12.A("active request submission failed", e7, false);
                                return;
                            }
                            if (jVar12.X && jVar12.D0) {
                                jVar12.L("request submission failed", e7);
                                return;
                            } else if (jVar12.J == p0.c) {
                                jVar12.B("60 fps request submission rejected", e7);
                                return;
                            } else {
                                jVar12.N(e7);
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
