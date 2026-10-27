package vi;

import android.hardware.camera2.CameraDevice;
import li.e3;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class e extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ e(j jVar, int i10) {
        this.a = i10;
        this.b = jVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                if (!j.d(this.b, cameraDevice) && !j.e(this.b, cameraDevice)) {
                    j jVar = this.b;
                    if (cameraDevice != jVar.t0) {
                        if (!jVar.X) {
                            if (jVar.Y) {
                                jVar.Y = false;
                                if (jVar.V) {
                                    this.b.I();
                                    break;
                                }
                            }
                        } else {
                            jVar.j.b("camera closed for sequential switch: elapsedMs=" + j.z(this.b.C0) + ", switchElapsedMs=" + j.z(this.b.I0));
                            j jVar2 = this.b;
                            jVar2.X = false;
                            if (jVar2.V) {
                                this.b.I();
                                break;
                            }
                        }
                    } else {
                        jVar.t0 = null;
                        jVar.j.b("standby camera closed: id=" + cameraDevice.getId());
                        break;
                    }
                }
                break;
            default:
                j jVar3 = this.b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.t0) {
                    jVar3.t0 = null;
                    jVar3.j.b("standby camera closed: id=" + cameraDevice.getId());
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean z10;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                boolean z11 = false;
                jVar.W = false;
                jVar.j.b("camera disconnected: id=" + cameraDevice.getId());
                if (this.b.G(cameraDevice)) {
                    this.b.j.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    return;
                }
                j jVar2 = this.b;
                if (cameraDevice == jVar2.t0) {
                    if (jVar2.n0) {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        return;
                    }
                    jVar2.t0 = null;
                    jVar2.u0 = cameraDevice;
                    cameraDevice.close();
                    this.b.y("standby device disconnected", null);
                    return;
                }
                if (jVar2.V && !this.b.b0) {
                    j jVar3 = this.b;
                    if (!jVar3.X && !jVar3.Y) {
                        z11 = true;
                    }
                }
                j jVar4 = this.b;
                if (jVar4.z == cameraDevice) {
                    jVar4.q();
                    this.b.z = null;
                }
                cameraDevice.close();
                if (z11) {
                    j jVar5 = this.b;
                    IllegalStateException illegalStateException = new IllegalStateException("Camera device disconnected");
                    m mVar = jVar5.x;
                    if (mVar != null) {
                        synchronized (mVar) {
                            z10 = mVar.E;
                        }
                        if (z10) {
                            jVar5.j.a("camera lost while recording", illegalStateException);
                            e3 e3Var = jVar5.k;
                            ((u0) e3Var.b).i.post(new j0(e3Var, illegalStateException, 0));
                            return;
                        }
                    }
                    jVar5.N(illegalStateException);
                    return;
                }
                return;
            default:
                j jVar6 = this.b;
                if (!jVar6.G(cameraDevice)) {
                    j.b(jVar6, cameraDevice, "disconnected", null);
                    return;
                }
                jVar6.j.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                cameraDevice.close();
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        boolean z10;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.W = false;
                if (jVar.G(cameraDevice)) {
                    jVar.j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                if (cameraDevice == jVar.t0) {
                    if (jVar.n0) {
                        j.b(jVar, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", null);
                        return;
                    }
                    jVar.t0 = null;
                    jVar.u0 = cameraDevice;
                    cameraDevice.close();
                    jVar.y("standby device error=" + j.c(i10) + " (" + i10 + ")", null);
                    return;
                }
                if (jVar.z == cameraDevice) {
                    jVar.q();
                    jVar.z = null;
                }
                cameraDevice.close();
                IllegalStateException illegalStateException = new IllegalStateException("Camera device error: " + j.c(i10) + " (" + i10 + ")");
                m mVar = jVar.x;
                if (mVar != null) {
                    synchronized (mVar) {
                        z10 = mVar.E;
                    }
                    if (z10) {
                        jVar.j.a("camera lost while recording", illegalStateException);
                        e3 e3Var = jVar.k;
                        ((u0) e3Var.b).i.post(new j0(e3Var, illegalStateException, 0));
                        return;
                    }
                }
                jVar.N(illegalStateException);
                return;
            default:
                j jVar2 = this.b;
                if (jVar2.G(cameraDevice)) {
                    jVar2.j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    return;
                }
                j.b(jVar2, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + j.c(i10) + " (" + i10 + ")"));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        String str;
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.W = false;
                n nVar = jVar.j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(j.z(this.b.G0));
                if (this.b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.b.I0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.b.V) {
                    j jVar2 = this.b;
                    if (!jVar2.X) {
                        jVar2.z = cameraDevice;
                        if (!jVar2.n0) {
                            jVar2.u();
                            break;
                        } else if (!jVar2.s0 && jVar2.t0 != null) {
                            j.a(jVar2);
                            break;
                        } else {
                            jVar2.j.b("active camera opened; waiting for dual peer before sessions");
                            break;
                        }
                    }
                }
                cameraDevice.close();
                break;
            default:
                j jVar3 = this.b;
                jVar3.s0 = false;
                if (jVar3.V && !this.b.b0) {
                    j jVar4 = this.b;
                    if (!jVar4.m0 && jVar4.x0 != null && cameraDevice.getId().equals(this.b.x0.a)) {
                        j jVar5 = this.b;
                        jVar5.t0 = cameraDevice;
                        jVar5.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.x0.b + ", elapsedMs=" + j.z(this.b.B0));
                        j jVar6 = this.b;
                        if (jVar6.z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.n0) {
                                jVar6.j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.b);
                            } else {
                                jVar6.j.b("both camera devices opened; configuring active session");
                                this.b.u();
                            }
                        }
                        j jVar7 = this.b;
                        n0 n0Var = jVar7.y0;
                        if (n0Var != null && n0Var == jVar7.x0.b) {
                            jVar7.y0 = null;
                            if (!jVar7.c0(n0Var)) {
                                this.b.t();
                                break;
                            }
                        }
                    }
                }
                this.b.j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                cameraDevice.close();
                break;
        }
    }
}
