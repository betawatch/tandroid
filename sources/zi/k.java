package zi;

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes4.dex */
public final class k extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ l f;

    public k(l lVar, CameraDevice.StateCallback stateCallback, boolean z10) {
        this.f = lVar;
        this.a = stateCallback;
        this.b = z10;
        lVar.w0++;
    }

    public final void a() {
        l lVar = this.f;
        boolean z10 = this.b;
        if (z10) {
            if (lVar.v0 != this) {
                return;
            }
        } else if (lVar.u0 != this) {
            return;
        }
        if (z10) {
            lVar.v0 = null;
        } else {
            lVar.u0 = null;
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
        l lVar = this.f;
        int i7 = lVar.w0 - 1;
        lVar.w0 = i7;
        HandlerThread handlerThread = lVar.x0;
        if (i7 > 0 || handlerThread == null) {
            return;
        }
        lVar.x0 = null;
        lVar.j.b("camera open results settled after release; quitting thread");
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
        this.f.j.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + l.e(i7) + ", warm=" + this.b);
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
