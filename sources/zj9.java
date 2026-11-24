// default package

import android.hardware.camera2.CameraDevice;
import android.os.HandlerThread;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class zj9 extends CameraDevice.StateCallback {
    public final CameraDevice.StateCallback a;
    public final boolean b;
    public boolean c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ ak9 f;

    public zj9(ak9 ak9Var, CameraDevice.StateCallback stateCallback, boolean z) {
        this.f = ak9Var;
        this.a = stateCallback;
        this.b = z;
        ak9Var.w0++;
    }

    public final void a() {
        boolean z = this.b;
        ak9 ak9Var = this.f;
        if (z) {
            if (ak9Var.v0 == this) {
                ak9Var.v0 = null;
            }
        } else if (ak9Var.u0 == this) {
            ak9Var.u0 = null;
        }
    }

    public final boolean b() {
        if (this.f.t0) {
            return false;
        }
        boolean z = this.b;
        ak9 ak9Var = this.f;
        return (z ? ak9Var.v0 : ak9Var.u0) == this;
    }

    public final void c() {
        if (this.c) {
            return;
        }
        this.c = true;
        ak9 ak9Var = this.f;
        int i = ak9Var.w0 - 1;
        ak9Var.w0 = i;
        HandlerThread handlerThread = ak9Var.x0;
        if (i > 0 || handlerThread == null) {
            return;
        }
        ak9Var.x0 = null;
        ak9Var.j.b("camera open results settled after release; quitting thread");
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
        boolean b = b();
        c();
        if (this.f.t0 || !(this.d || b)) {
            cameraDevice.close();
            return;
        }
        a();
        this.e = true;
        this.a.onDisconnected(cameraDevice);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        boolean b = b();
        c();
        if (!this.f.t0 && (this.d || b)) {
            a();
            this.e = true;
            this.a.onError(cameraDevice, i);
            return;
        }
        this.f.j.b("stale camera error ignored: id=" + cameraDevice.getId() + ", error=" + ak9.e(i) + ", warm=" + this.b);
        cameraDevice.close();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        boolean b = b();
        a();
        c();
        if (b) {
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
