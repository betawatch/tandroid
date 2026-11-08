package wi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final class e extends CameraDevice.StateCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k b;

    public /* synthetic */ e(k kVar, int i7) {
        this.a = i7;
        this.b = kVar;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                k.c(this.b, cameraDevice);
                break;
            default:
                k.c(this.b, cameraDevice);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.a) {
            case 0:
                this.b.j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.b.t0.contains(cameraDevice));
                if (!this.b.t0.contains(cameraDevice)) {
                    k kVar = this.b;
                    if (cameraDevice != kVar.p0) {
                        boolean z9 = (!kVar.V || this.b.Z || this.b.W) ? false : true;
                        k kVar2 = this.b;
                        if (kVar2.z == cameraDevice) {
                            kVar2.p();
                            this.b.z = null;
                        }
                        this.b.q(cameraDevice, 1);
                        if (z9) {
                            this.b.M(new IllegalStateException("Camera device disconnected"));
                            break;
                        }
                    } else {
                        k.b(kVar, cameraDevice, "disconnected", null);
                        break;
                    }
                } else {
                    cameraDevice.close();
                    break;
                }
                break;
            default:
                k kVar3 = this.b;
                o oVar = kVar3.j;
                StringBuilder sb2 = new StringBuilder("warm camera disconnected: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", closing=");
                ArrayList arrayList = kVar3.t0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (!arrayList.contains(cameraDevice)) {
                    k.b(kVar3, cameraDevice, "disconnected", null);
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
                k kVar = this.b;
                o oVar = kVar.j;
                StringBuilder sb2 = new StringBuilder("camera error: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", error=");
                sb2.append(k.e(i7));
                sb2.append(" (");
                sb2.append(i7);
                sb2.append("), closing=");
                ArrayList arrayList = kVar.t0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (!arrayList.contains(cameraDevice)) {
                    if (cameraDevice != kVar.p0) {
                        if (kVar.z == cameraDevice) {
                            kVar.p();
                            kVar.z = null;
                        }
                        kVar.q(cameraDevice, 1);
                        kVar.M(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
                        break;
                    } else {
                        k.b(kVar, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", null);
                        break;
                    }
                } else {
                    cameraDevice.close();
                    break;
                }
            default:
                k kVar2 = this.b;
                o oVar2 = kVar2.j;
                StringBuilder sb3 = new StringBuilder("warm camera error: id=");
                sb3.append(cameraDevice.getId());
                sb3.append(", error=");
                sb3.append(k.e(i7));
                sb3.append(" (");
                sb3.append(i7);
                sb3.append("), closing=");
                ArrayList arrayList2 = kVar2.t0;
                sb3.append(arrayList2.contains(cameraDevice));
                oVar2.b(sb3.toString());
                if (!arrayList2.contains(cameraDevice)) {
                    k.b(kVar2, cameraDevice, "error=" + k.e(i7) + " (" + i7 + ")", new IllegalStateException("Warm camera device error: " + k.e(i7) + " (" + i7 + ")"));
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
                o oVar = this.b.j;
                StringBuilder sb2 = new StringBuilder("camera opened: id=");
                sb2.append(cameraDevice.getId());
                sb2.append(", elapsedMs=");
                sb2.append(k.A(this.b.E0));
                if (this.b.X) {
                    str = ", switchElapsedMs=" + k.A(this.b.G0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.b.V) {
                    k kVar = this.b;
                    if (!kVar.W) {
                        kVar.z = cameraDevice;
                        if (!kVar.l0) {
                            kVar.u();
                            break;
                        } else if (kVar.w0 != null || kVar.p0 == null) {
                            kVar.j.b("active camera opened; waiting for dual peer before sessions");
                            break;
                        } else {
                            k.a(kVar);
                            break;
                        }
                    }
                }
                k kVar2 = this.b;
                kVar2.q(cameraDevice, kVar2.W ? 2 : 1);
                break;
            default:
                if (this.b.V && !this.b.Z) {
                    k kVar3 = this.b;
                    if (kVar3.l0 && kVar3.q0 != null && cameraDevice.getId().equals(this.b.q0.a)) {
                        k kVar4 = this.b;
                        kVar4.p0 = cameraDevice;
                        kVar4.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.q0.b + ", elapsedMs=" + k.A(this.b.z0));
                        k kVar5 = this.b;
                        if (kVar5.z != null && kVar5.A == null && !kVar5.W) {
                            kVar5.j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.b);
                            break;
                        }
                    }
                }
                this.b.j.b("stale warm camera open ignored: id=" + cameraDevice.getId());
                this.b.q(cameraDevice, 1);
                break;
        }
    }
}
