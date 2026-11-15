package zi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class f extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ f(l lVar, int i7) {
        this.a = i7;
        this.b = lVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                l.c(this.b, cameraDevice);
                break;
            default:
                l.c(this.b, cameraDevice);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                this.b.j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.b.s0.contains(cameraDevice));
                if (!this.b.s0.contains(cameraDevice)) {
                    l lVar = this.b;
                    if (cameraDevice != lVar.o0) {
                        boolean z10 = (!lVar.U || this.b.Y || this.b.V) ? false : true;
                        l lVar2 = this.b;
                        if (lVar2.y == cameraDevice) {
                            lVar2.o();
                            this.b.y = null;
                        }
                        this.b.p(cameraDevice, 1);
                        if (z10) {
                            this.b.L(new IllegalStateException("Camera device disconnected"));
                            break;
                        }
                    } else {
                        l.b(lVar, cameraDevice, "disconnected", null);
                        break;
                    }
                } else {
                    cameraDevice.close();
                    break;
                }
                break;
            default:
                l lVar3 = this.b;
                p pVar = lVar3.j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = lVar3.s0;
                sb2.append(arrayList.contains(cameraDevice));
                pVar.b(sb2.toString());
                if (!arrayList.contains(cameraDevice)) {
                    l.b(lVar3, cameraDevice, "disconnected", null);
                    break;
                } else {
                    cameraDevice.close();
                    break;
                }
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        switch (this.a) {
            case 0:
                l lVar = this.b;
                p pVar = lVar.j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(l.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = lVar.s0;
                sb2.append(arrayList.contains(cameraDevice));
                pVar.b(sb2.toString());
                if (!arrayList.contains(cameraDevice)) {
                    if (cameraDevice != lVar.o0) {
                        if (lVar.y == cameraDevice) {
                            lVar.o();
                            lVar.y = null;
                        }
                        lVar.p(cameraDevice, 1);
                        lVar.L(new IllegalStateException("Camera device error: " + l.e(i7) + " (" + i7 + ")"));
                        break;
                    } else {
                        l.b(lVar, cameraDevice, "error=" + l.e(i7) + " (" + i7 + ")", null);
                        break;
                    }
                } else {
                    cameraDevice.close();
                    break;
                }
            default:
                l lVar2 = this.b;
                p pVar2 = lVar2.j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(l.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = lVar2.s0;
                sb3.append(arrayList2.contains(cameraDevice));
                pVar2.b(sb3.toString());
                if (!arrayList2.contains(cameraDevice)) {
                    l.b(lVar2, cameraDevice, "error=" + l.e(i7) + " (" + i7 + ")", new IllegalStateException("Warm camera device error: " + l.e(i7) + " (" + i7 + ")"));
                    break;
                } else {
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
                p pVar = this.b.j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(l.z(this.b.D0));
                if (this.b.W) {
                    str = ", switchElapsedMs=" + l.z(this.b.F0);
                } else {
                    str = "";
                }
                sb2.append(str);
                pVar.b(sb2.toString());
                if (this.b.U) {
                    l lVar = this.b;
                    if (!lVar.V) {
                        lVar.y = cameraDevice;
                        if (!lVar.k0) {
                            lVar.t();
                            break;
                        } else if (lVar.v0 != null || lVar.o0 == null) {
                            lVar.j.b("active camera opened; waiting for dual peer before sessions");
                            break;
                        } else {
                            l.a(lVar);
                            break;
                        }
                    }
                }
                l lVar2 = this.b;
                lVar2.p(cameraDevice, lVar2.V ? 2 : 1);
                break;
            default:
                if (this.b.U && !this.b.Y) {
                    l lVar3 = this.b;
                    if (lVar3.k0 && lVar3.p0 != null && cameraDevice.getId().equals(this.b.p0.a)) {
                        l lVar4 = this.b;
                        lVar4.o0 = cameraDevice;
                        lVar4.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.p0.b + ", elapsedMs=" + l.z(this.b.y0));
                        l lVar5 = this.b;
                        if (lVar5.y != null && lVar5.z == null && !lVar5.V) {
                            lVar5.j.b("both camera devices opened; configuring dual sessions");
                            l.a(this.b);
                            break;
                        }
                    }
                }
                this.b.j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.b.p(cameraDevice, 1);
                break;
        }
    }
}
