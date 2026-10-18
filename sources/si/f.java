package si;

import android.hardware.camera2.CameraDevice;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class f extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ f(k kVar, int i10) {
        this.a = i10;
        this.b = kVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                if (!k.d(this.b, cameraDevice) && !k.e(this.b, cameraDevice)) {
                    k kVar = this.b;
                    if (cameraDevice != kVar.s0) {
                        if (!kVar.X) {
                            if (kVar.Y) {
                                kVar.Y = false;
                                if (kVar.V) {
                                    this.b.I();
                                    break;
                                }
                            }
                        } else {
                            kVar.j.b("camera closed for sequential switch: elapsedMs=" + k.z(this.b.B0) + ", switchElapsedMs=" + k.z(this.b.H0));
                            k kVar2 = this.b;
                            kVar2.X = false;
                            if (kVar2.V) {
                                this.b.I();
                                break;
                            }
                        }
                    } else {
                        kVar.s0 = null;
                        kVar.j.b("standby camera closed: id=" + cameraDevice.getId());
                        break;
                    }
                }
                break;
            default:
                k kVar3 = this.b;
                if (!k.d(kVar3, cameraDevice) && !k.e(kVar3, cameraDevice) && cameraDevice == kVar3.s0) {
                    kVar3.s0 = null;
                    kVar3.j.b("standby camera closed: id=" + cameraDevice.getId());
                    break;
                }
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                boolean z10 = false;
                kVar.W = false;
                kVar.j.b("camera disconnected: id=" + cameraDevice.getId());
                if (!this.b.G(cameraDevice)) {
                    k kVar2 = this.b;
                    if (cameraDevice != kVar2.s0) {
                        if (kVar2.V && !this.b.b0) {
                            k kVar3 = this.b;
                            if (!kVar3.X && !kVar3.Y) {
                                z10 = true;
                            }
                        }
                        k kVar4 = this.b;
                        if (kVar4.z == cameraDevice) {
                            kVar4.q();
                            this.b.z = null;
                        }
                        cameraDevice.close();
                        if (z10) {
                            this.b.N(new IllegalStateException("Camera device disconnected"));
                            break;
                        }
                    } else if (!kVar2.m0) {
                        kVar2.s0 = null;
                        kVar2.t0 = cameraDevice;
                        cameraDevice.close();
                        this.b.y("standby device disconnected", null);
                        break;
                    } else {
                        k.b(kVar2, cameraDevice, "disconnected", null);
                        break;
                    }
                } else {
                    this.b.j.b("camera disconnected while warm-switch recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    break;
                }
                break;
            default:
                k kVar5 = this.b;
                if (!kVar5.G(cameraDevice)) {
                    k.b(kVar5, cameraDevice, "disconnected", null);
                    break;
                } else {
                    kVar5.j.b("warm camera disconnected while recovery is closing it: id=" + cameraDevice.getId());
                    cameraDevice.close();
                    break;
                }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i10) {
        switch (this.a) {
            case 0:
                k kVar = this.b;
                kVar.W = false;
                if (!kVar.G(cameraDevice)) {
                    if (cameraDevice != kVar.s0) {
                        if (kVar.z == cameraDevice) {
                            kVar.q();
                            kVar.z = null;
                        }
                        cameraDevice.close();
                        kVar.N(new IllegalStateException("Camera device error: " + k.c(i10) + " (" + i10 + ")"));
                        break;
                    } else if (!kVar.m0) {
                        kVar.s0 = null;
                        kVar.t0 = cameraDevice;
                        cameraDevice.close();
                        kVar.y("standby device error=" + k.c(i10) + " (" + i10 + ")", null);
                        break;
                    } else {
                        k.b(kVar, cameraDevice, "error=" + k.c(i10) + " (" + i10 + ")", null);
                        break;
                    }
                } else {
                    kVar.j.b("camera error while warm-switch recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
                    cameraDevice.close();
                    break;
                }
            default:
                k kVar2 = this.b;
                if (!kVar2.G(cameraDevice)) {
                    k.b(kVar2, cameraDevice, "error=" + k.c(i10) + " (" + i10 + ")", new IllegalStateException("Warm camera device error: " + k.c(i10) + " (" + i10 + ")"));
                    break;
                } else {
                    kVar2.j.b("warm camera error while recovery is closing it: id=" + cameraDevice.getId() + ", error=" + k.c(i10) + " (" + i10 + ")");
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
                k kVar = this.b;
                kVar.W = false;
                o oVar = kVar.j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.z(this.b.F0));
                if (this.b.Z) {
                    str = ", switchElapsedMs=" + k.z(this.b.H0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.b.V) {
                    k kVar2 = this.b;
                    if (!kVar2.X) {
                        kVar2.z = cameraDevice;
                        if (!kVar2.m0) {
                            kVar2.u();
                            break;
                        } else if (!kVar2.r0 && kVar2.s0 != null) {
                            k.a(kVar2);
                            break;
                        } else {
                            kVar2.j.b("active camera opened; waiting for dual peer before sessions");
                            break;
                        }
                    }
                }
                cameraDevice.close();
                break;
            default:
                k kVar3 = this.b;
                kVar3.r0 = false;
                if (kVar3.V && !this.b.b0) {
                    k kVar4 = this.b;
                    if (!kVar4.l0 && kVar4.w0 != null && cameraDevice.getId().equals(this.b.w0.a)) {
                        k kVar5 = this.b;
                        kVar5.s0 = cameraDevice;
                        kVar5.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.w0.b + ", elapsedMs=" + k.z(this.b.A0));
                        k kVar6 = this.b;
                        if (kVar6.z != null && kVar6.A == null && !kVar6.X) {
                            if (kVar6.m0) {
                                kVar6.j.b("both camera devices opened; configuring dual sessions");
                                k.a(this.b);
                            } else {
                                kVar6.j.b("both camera devices opened; configuring active session");
                                this.b.u();
                            }
                        }
                        k kVar7 = this.b;
                        l0 l0Var = kVar7.x0;
                        if (l0Var != null && l0Var == kVar7.w0.b) {
                            kVar7.x0 = null;
                            if (!kVar7.c0(l0Var)) {
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
