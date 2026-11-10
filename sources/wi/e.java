package wi;

import android.hardware.camera2.CameraDevice;
import java.util.ArrayList;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                this.b.j.b("camera disconnected: id=" + cameraDevice.getId() + ", closing=" + this.b.s0.contains(cameraDevice));
                if (!this.b.s0.contains(cameraDevice)) {
                    k kVar = this.b;
                    if (cameraDevice != kVar.o0) {
                        boolean z9 = (!kVar.U || this.b.Y || this.b.V) ? false : true;
                        k kVar2 = this.b;
                        if (kVar2.y == cameraDevice) {
                            kVar2.o();
                            this.b.y = null;
                        }
                        this.b.p(cameraDevice, 1);
                        if (z9) {
                            this.b.L(new IllegalStateException("Camera device disconnected"));
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
                ArrayList arrayList = kVar3.s0;
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
                ArrayList arrayList = kVar.s0;
                sb2.append(arrayList.contains(cameraDevice));
                oVar.b(sb2.toString());
                if (!arrayList.contains(cameraDevice)) {
                    if (cameraDevice != kVar.o0) {
                        if (kVar.y == cameraDevice) {
                            kVar.o();
                            kVar.y = null;
                        }
                        kVar.p(cameraDevice, 1);
                        kVar.L(new IllegalStateException("Camera device error: " + k.e(i7) + " (" + i7 + ")"));
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
                ArrayList arrayList2 = kVar2.s0;
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
                sb2.append(k.z(this.b.D0));
                if (this.b.W) {
                    str = ", switchElapsedMs=" + k.z(this.b.F0);
                } else {
                    str = "";
                }
                sb2.append(str);
                oVar.b(sb2.toString());
                if (this.b.U) {
                    k kVar = this.b;
                    if (!kVar.V) {
                        kVar.y = cameraDevice;
                        if (!kVar.k0) {
                            kVar.t();
                            break;
                        } else if (kVar.v0 != null || kVar.o0 == null) {
                            kVar.j.b("active camera opened; waiting for dual peer before sessions");
                            break;
                        } else {
                            k.a(kVar);
                            break;
                        }
                    }
                }
                k kVar2 = this.b;
                kVar2.p(cameraDevice, kVar2.V ? 2 : 1);
                break;
            default:
                if (this.b.U && !this.b.Y) {
                    k kVar3 = this.b;
                    if (kVar3.k0 && kVar3.p0 != null && cameraDevice.getId().equals(this.b.p0.a)) {
                        k kVar4 = this.b;
                        kVar4.o0 = cameraDevice;
                        kVar4.j.b("warm camera opened: id=" + cameraDevice.getId() + ", facing=" + this.b.p0.b + ", elapsedMs=" + k.z(this.b.y0));
                        k kVar5 = this.b;
                        if (kVar5.y != null && kVar5.z == null && !kVar5.V) {
                            kVar5.j.b("both camera devices opened; configuring dual sessions");
                            k.a(this.b);
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
