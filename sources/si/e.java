package si;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
                    if (cameraDevice != jVar.s0) {
                        if (!jVar.X) {
                            if (jVar.Y) {
                                jVar.Y = false;
                                if (jVar.V) {
                                    this.b.I();
                                    break;
                                }
                            }
                        } else {
                            jVar.j.b("camera closed for sequential switch: elapsedMs=" + j.z(this.b.B0) + ", switchElapsedMs=" + j.z(this.b.H0));
                            j jVar2 = this.b;
                            jVar2.X = false;
                            if (jVar2.V) {
                                this.b.I();
                                break;
                            }
                        }
                    } else {
                        jVar.s0 = null;
                        jVar.j.b("standby camera closed: id=" + cameraDevice.getId());
                        break;
                    }
                }
                break;
            default:
                j jVar3 = this.b;
                if (!j.d(jVar3, cameraDevice) && !j.e(jVar3, cameraDevice) && cameraDevice == jVar3.s0) {
                    jVar3.s0 = null;
                    jVar3.j.b("standby camera closed: id=" + cameraDevice.getId());
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                boolean z10 = false;
                jVar.W = false;
                jVar.j.b("camera disconnected: id=" + cameraDevice.getId());
                if (!this.b.G(cameraDevice)) {
                    j jVar2 = this.b;
                    if (cameraDevice != jVar2.s0) {
                        if (jVar2.V && !this.b.b0) {
                            j jVar3 = this.b;
                            if (!jVar3.X && !jVar3.Y) {
                                z10 = true;
                            }
                        }
                        j jVar4 = this.b;
                        if (jVar4.z == cameraDevice) {
                            jVar4.q();
                            this.b.z = null;
                        }
                        cameraDevice.close();
                        if (z10) {
                            this.b.N(new IllegalStateException("Camera device disconnected"));
                            break;
                        }
                    } else if (!jVar2.m0) {
                        jVar2.s0 = null;
                        jVar2.t0 = cameraDevice;
                        cameraDevice.close();
                        this.b.y("standby device disconnected", null);
                        break;
                    } else {
                        j.b(jVar2, cameraDevice, "disconnected", null);
                        break;
                    }
                } else {
                    this.b.j.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    break;
                }
                break;
            default:
                j jVar5 = this.b;
                if (!jVar5.G(cameraDevice)) {
                    j.b(jVar5, cameraDevice, "disconnected", null);
                    break;
                } else {
                    jVar5.j.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    break;
                }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.a) {
            case 0:
                j jVar = this.b;
                jVar.W = false;
                if (!jVar.G(cameraDevice)) {
                    if (cameraDevice != jVar.s0) {
                        if (jVar.z == cameraDevice) {
                            jVar.q();
                            jVar.z = null;
                        }
                        cameraDevice.close();
                        jVar.N(new IllegalStateException("Camera device error: " + j.c(i10) + " (" + i10 + ")"));
                        break;
                    } else if (!jVar.m0) {
                        jVar.s0 = null;
                        jVar.t0 = cameraDevice;
                        cameraDevice.close();
                        jVar.y("standby device error=" + j.c(i10) + " (" + i10 + ")", null);
                        break;
                    } else {
                        j.b(jVar, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", null);
                        break;
                    }
                } else {
                    jVar.j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    break;
                }
            default:
                j jVar2 = this.b;
                if (!jVar2.G(cameraDevice)) {
                    j.b(jVar2, cameraDevice, "error=" + j.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + j.c(i10) + " (" + i10 + ")"));
                    break;
                } else {
                    jVar2.j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + j.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    break;
                }
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
                sb2.append(j.z(this.b.F0));
                if (this.b.Z) {
                    str = ", switchElapsedMs=" + j.z(this.b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                nVar.b(sb2.toString());
                if (this.b.V) {
                    j jVar2 = this.b;
                    if (!jVar2.X) {
                        jVar2.z = cameraDevice;
                        if (!jVar2.m0) {
                            jVar2.u();
                            break;
                        } else if (!jVar2.r0 && jVar2.s0 != null) {
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
                jVar3.r0 = false;
                if (jVar3.V && !this.b.b0) {
                    j jVar4 = this.b;
                    if (!jVar4.l0 && jVar4.w0 != null && cameraDevice.getId().equals(this.b.w0.a)) {
                        j jVar5 = this.b;
                        jVar5.s0 = cameraDevice;
                        jVar5.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.w0.b + ", elapsedMs=" + j.z(this.b.A0));
                        j jVar6 = this.b;
                        if (jVar6.z != null && jVar6.A == null && !jVar6.X) {
                            if (jVar6.m0) {
                                jVar6.j.b("both camera devices opened; configuring dual sessions");
                                j.a(this.b);
                            } else {
                                jVar6.j.b("both camera devices opened; configuring active session");
                                this.b.u();
                            }
                        }
                        j jVar7 = this.b;
                        l0 l0Var = jVar7.x0;
                        if (l0Var != null && l0Var == jVar7.w0.b) {
                            jVar7.x0 = null;
                            if (!jVar7.c0(l0Var)) {
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
