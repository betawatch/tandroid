package zi;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import org.telegram.ui.f60;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes4.dex */
public final class g extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ g(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onClosed(CameraCaptureSession cameraCaptureSession) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                if (lVar.A == cameraCaptureSession) {
                    lVar.A = null;
                    lVar.C = null;
                    lVar.m0 = false;
                    break;
                }
                break;
            default:
                l lVar2 = this.b;
                if (lVar2.z == cameraCaptureSession) {
                    lVar2.z = null;
                    lVar2.B = null;
                    lVar2.P = false;
                    lVar2.j.b("capture session closed");
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
                l lVar = this.b;
                if (lVar.k0 && lVar.o0 != null && cameraCaptureSession.getDevice() == lVar.o0) {
                    lVar.A("standby session configuration failed", null, true);
                    break;
                }
                break;
            default:
                cameraCaptureSession.close();
                if (this.b.y != null) {
                    CameraDevice device = cameraCaptureSession.getDevice();
                    l lVar2 = this.b;
                    if (device == lVar2.y) {
                        if (lVar2.z == cameraCaptureSession) {
                            lVar2.z = null;
                            lVar2.B = null;
                        }
                        if (lVar2.U) {
                            l lVar3 = this.b;
                            if (lVar3.y != null && !lVar3.Y) {
                                l lVar4 = this.b;
                                if (!lVar4.k0) {
                                    if (lVar4.I != q0.c) {
                                        lVar4.M(new IllegalStateException("Camera capture session configuration failed"));
                                        break;
                                    } else {
                                        lVar4.B("60 fps session configuration failed", null);
                                        break;
                                    }
                                } else {
                                    lVar4.A("active session configuration failed", null, false);
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
                if (this.b.U) {
                    l lVar = this.b;
                    if (lVar.k0 && lVar.o0 != null) {
                        CameraDevice device = cameraCaptureSession.getDevice();
                        l lVar2 = this.b;
                        CameraDevice cameraDevice = lVar2.o0;
                        if (device == cameraDevice && (surface = lVar2.u) != null && (jVar = lVar2.p0) != null) {
                            try {
                                lVar2.A = cameraCaptureSession;
                                lVar2.C = lVar2.w(cameraDevice, surface, jVar, false, true);
                                CaptureRequest build = this.b.C.build();
                                l lVar3 = this.b;
                                cameraCaptureSession.setRepeatingRequest(build, lVar3.r1, lVar3.n);
                                l lVar4 = this.b;
                                lVar4.m0 = true;
                                lVar4.j.b("standby capture session configured: id=" + cameraCaptureSession.getDevice().getId() + ", elapsedMs=" + l.z(this.b.E0));
                                l.d(this.b);
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
                    l lVar5 = this.b;
                    CameraDevice cameraDevice2 = lVar5.y;
                    if (device2 == cameraDevice2) {
                        lVar5.z = cameraCaptureSession;
                        try {
                            lVar5.F = lVar5.G;
                            if (cameraDevice2 == null || lVar5.t == null) {
                                throw new IllegalStateException("Camera request surfaces are unavailable");
                            }
                            lVar5.B = lVar5.w(cameraDevice2, lVar5.t, lVar5.k(), true, true);
                            u uVar = this.b.v;
                            if (uVar != null) {
                                Handler handler = uVar.u;
                                if (uVar.r0 && handler != null) {
                                    handler.post(new r(uVar, 0));
                                }
                            }
                            l lVar6 = this.b;
                            boolean z10 = lVar6.k0 && lVar6.q0 != null;
                            boolean z11 = lVar6.W && !z10;
                            CameraCaptureSession cameraCaptureSession2 = lVar6.z;
                            CaptureRequest.Builder builder = lVar6.B;
                            if (cameraCaptureSession2 != null && builder != null) {
                                cameraCaptureSession2.setRepeatingRequest(builder.build(), lVar6.r1, lVar6.n);
                            }
                            l lVar7 = this.b;
                            if (lVar7.k0) {
                                lVar7.l0 = true;
                            }
                            if (!z10) {
                                lVar7.W = false;
                            }
                            if (z11) {
                                lVar7.V = false;
                            }
                            lVar7.X = z11;
                            p pVar = this.b.j;
                            StringBuilder sb2 = new StringBuilder("capture session configured: facing=");
                            sb2.append(this.b.F);
                            sb2.append(", fpsRange=");
                            sb2.append(this.b.J);
                            sb2.append(", elapsedMs=");
                            sb2.append(l.z(this.b.E0));
                            sb2.append(", segmentElapsedMs=");
                            sb2.append(l.z(this.b.C0));
                            if (z11) {
                                str = ", switchPath=SEQUENTIAL, switchElapsedMs=" + l.z(this.b.F0);
                            } else {
                                str = "";
                            }
                            sb2.append(str);
                            pVar.b(sb2.toString());
                            l lVar8 = this.b;
                            lVar8.c.post(new a(lVar8, 9));
                            l lVar9 = this.b;
                            u7.i iVar = lVar9.k;
                            n0 n0Var = lVar9.F;
                            o0 o0Var = lVar9.H;
                            q0 q0Var = lVar9.I;
                            Size size = lVar9.q;
                            l lVar10 = this.b;
                            ((v0) iVar.a).i.post(new f60(iVar, new i(n0Var, o0Var, q0Var, size, lVar10.N, lVar10.F()), z11, 18));
                            if (z10) {
                                l.d(this.b);
                                return;
                            }
                            n0 n0Var2 = this.b.E;
                            l lVar11 = this.b;
                            if (n0Var2 != lVar11.F) {
                                lVar11.Y(lVar11.E);
                                return;
                            }
                            return;
                        } catch (Exception e11) {
                            l lVar12 = this.b;
                            if (lVar12.k0) {
                                lVar12.A("active request submission failed", e11, false);
                                return;
                            } else if (lVar12.I == q0.c) {
                                lVar12.B("60 fps request submission rejected", e11);
                                return;
                            } else {
                                lVar12.M(e11);
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
