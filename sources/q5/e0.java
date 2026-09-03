package q5;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.s1;
import com.google.android.gms.tasks.TaskCompletionSource;
import org.telegram.ui.zy;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e0 extends u5.g {
    public final /* synthetic */ f0 b;

    public e0(f0 f0Var) {
        this.b = f0Var;
    }

    @Override // u5.h
    public final void I(int i10) {
        f0.k(this.b).post(new d0(this, i10, 0));
    }

    @Override // u5.h
    public final void L(u5.d dVar) {
        f0.k(this.b).post(new zy(this, dVar, false, 5));
    }

    @Override // u5.h
    public final void M(String str, String str2) {
        f0.G.b("Receive (type=text, ns=%s) %s", str, str2);
        f0.k(this.b).post(new s1(this, str, str2, false, 12));
    }

    @Override // u5.h
    public final void U(int i10) {
        this.b.i(i10);
    }

    @Override // u5.h
    public final void W(long j10) {
        f0.f(this.b, j10, 0);
    }

    @Override // u5.h
    public final void c(int i10) {
        f0.g(this.b, i10);
    }

    @Override // u5.h
    public final void d(int i10) {
        f0.k(this.b).post(new d0(this, i10, 1));
    }

    @Override // u5.h
    public final void n0(u5.c cVar) {
        f0.k(this.b).post(new zy(this, cVar, false, 6));
    }

    @Override // u5.h
    public final void t0(d dVar, String str, String str2, boolean z4) {
        f0 f0Var = this.b;
        f0Var.t = dVar;
        f0Var.u = str;
        u5.u uVar = new u5.u(new Status(0, null, null, null), dVar, str, str2, z4);
        synchronized (f0Var.r) {
            try {
                TaskCompletionSource taskCompletionSource = f0Var.o;
                if (taskCompletionSource != null) {
                    taskCompletionSource.setResult(uVar);
                }
                f0Var.o = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // u5.h
    public final void u0(int i10) {
        f0.k(this.b).post(new d0(this, i10, 3));
    }

    @Override // u5.h
    public final void z0(String str, byte[] bArr) {
        f0.G.b("IGNORING: Receive (type=binary, ns=%s) <%d bytes>", str, Integer.valueOf(bArr.length));
    }

    @Override // u5.h
    public final void zzd(int i10) {
        f0 f0Var = this.b;
        f0.g(f0Var, i10);
        if (f0Var.D != null) {
            f0.k(f0Var).post(new d0(this, i10, 2));
        }
    }

    @Override // u5.h
    public final void zzg(int i10) {
        f0.g(this.b, i10);
    }

    @Override // u5.h
    public final void zzm(int i10, long j10) {
        f0.f(this.b, j10, i10);
    }

    @Override // u5.h
    public final void zzn() {
        f0.G.b("Deprecated callback: \"onStatusReceived\"", new Object[0]);
    }
}
