package th;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.at;
import org.telegram.messenger.voip.NativeInstance;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class n0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ s0 b;

    public /* synthetic */ n0(s0 s0Var, int i10) {
        this.a = i10;
        this.b = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.p();
                break;
            case 1:
                this.b.q();
                break;
            case 2:
                this.b.t(true);
                break;
            case 3:
                s0 s0Var = this.b;
                at.f(s0Var.e).k(at.G2, Long.valueOf(s0Var.w.id));
                s0Var.u(true);
                break;
            case 4:
                this.b.w();
                break;
            case 5:
                this.b.t(true);
                break;
            case 6:
                s0 s0Var2 = this.b;
                if (s0Var2.E != null) {
                    org.telegram.messenger.r5 r5Var = Utilities.e;
                    NativeInstance nativeInstance = s0Var2.E;
                    Objects.requireNonNull(nativeInstance);
                    r5Var.c(new org.telegram.messenger.voip.v0(nativeInstance, 3));
                    s0Var2.M.clear();
                    s0Var2.E = null;
                }
                s0Var2.k();
                break;
            case 7:
                this.b.t(true);
                break;
            case 8:
                this.b.t(true);
                break;
            case 9:
                s0 s0Var3 = this.b;
                if (s0Var3.E != null) {
                    org.telegram.messenger.r5 r5Var2 = Utilities.e;
                    NativeInstance nativeInstance2 = s0Var3.E;
                    Objects.requireNonNull(nativeInstance2);
                    r5Var2.c(new org.telegram.messenger.voip.v0(nativeInstance2, 3));
                    s0Var3.M.clear();
                    s0Var3.E = null;
                }
                s0Var3.k();
                break;
            case 10:
                this.b.p();
                break;
            case 11:
                this.b.q();
                break;
            default:
                s0 s0Var4 = this.b;
                if (!s0Var4.n) {
                    w7.c6.b(new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new ph.h1(s0Var4, 14));
                    break;
                }
                break;
        }
    }
}
