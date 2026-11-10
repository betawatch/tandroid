package wi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final class j extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ k f;

    public j(k kVar, CameraDevice.StateCallback stateCallback, boolean z9) {
        this.f = kVar;
        this.a = stateCallback;
        this.b = z9;
        kVar.w0++;
    }

    public final void a() {
        k kVar = this.f;
        boolean z9 = this.b;
        if (z9) {
            if (kVar.v0 != this) {
                return;
            }
        } else if (kVar.u0 != this) {
            return;
        }
        if (z9) {
            kVar.v0 = null;
        } else {
            kVar.u0 = null;
        }
    }

    public final boolean b() {
        if (this.f.t0) {
            return false;
        }
        return (this.b ? this.f.v0 : this.f.u0) == this;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        k kVar = this.f;
        int i7 = kVar.w0 - 1;
        kVar.w0 = i7;
        HandlerThread handlerThread = kVar.x0;
        if (i7 > 0 || handlerThread == null) {
            return;
        }
        kVar.x0 = null;
        kVar.j.b("camera open results settled after release; quitting thread");
        handlerThread.quitSafely();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (!this.e || this.f.t0) {
            return;
        }
        this.a.onClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (this.f.t0 || !(this.d || b10)) {
            cameraDevice.close();
            return;
        }
        a();
        this.e = true;
        this.a.onDisconnected(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i7) {
        boolean b10 = b();
        c();
        if (!this.f.t0 && (this.d || b10)) {
            a();
            this.e = true;
            this.a.onError(cameraDevice, i7);
            return;
        }
        this.f.j.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + k.e(i7) + ", warm=" + this.b);
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b10 = b();
        a();
        c();
        if (b10) {
            this.d = true;
            this.e = true;
            this.f.r0.add(cameraDevice);
            this.a.onOpened(cameraDevice);
            return;
        }
        this.f.j.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.b + ", released=" + this.f.t0);
        cameraDevice.close();
    }
}
