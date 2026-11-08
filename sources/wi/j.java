package wi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
        kVar.x0++;
    }

    public final void a() {
        k kVar = this.f;
        boolean z9 = this.b;
        if (z9) {
            if (kVar.w0 != this) {
                return;
            }
        } else if (kVar.v0 != this) {
            return;
        }
        if (z9) {
            kVar.w0 = null;
        } else {
            kVar.v0 = null;
        }
    }

    public final boolean b() {
        if (this.f.u0) {
            return false;
        }
        return (this.b ? this.f.w0 : this.f.v0) == this;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        k kVar = this.f;
        int i7 = kVar.x0 - 1;
        kVar.x0 = i7;
        HandlerThread handlerThread = kVar.y0;
        if (i7 > 0 || handlerThread == null) {
            return;
        }
        kVar.y0 = null;
        kVar.j.b("camera open results settled after release; quitting thread");
        handlerThread.quitSafely();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        if (!this.e || this.f.u0) {
            return;
        }
        this.a.onClosed(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        boolean b10 = b();
        c();
        if (this.f.u0 || !(this.d || b10)) {
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
        if (!this.f.u0 && (this.d || b10)) {
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
            this.f.s0.add(cameraDevice);
            this.a.onOpened(cameraDevice);
            return;
        }
        this.f.j.b("stale camera open closed: id=" + cameraDevice.getId() + ", warm=" + this.b + ", released=" + this.f.u0);
        cameraDevice.close();
    }
}
