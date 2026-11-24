// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ugd extends n8d {
    public final /* synthetic */ bhd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ugd(bhd bhdVar) {
        super((byte) 1);
        this.c = bhdVar;
    }

    @Override // n8d
    public final void T(ws wsVar, String str, String str2, boolean z) {
        bhd bhdVar = this.c;
        bhdVar.u = wsVar;
        bhdVar.v = str;
        kbf kbfVar = new kbf(new Status(0, null, null, null), wsVar, str, str2, z);
        synchronized (bhdVar.s) {
            TaskCompletionSource taskCompletionSource = bhdVar.p;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(kbfVar);
            }
            bhdVar.p = null;
        }
    }

    @Override // n8d
    public final void V(int i) {
        this.c.i(i);
    }

    @Override // n8d
    public final void W(int i) {
        bhd bhdVar = this.c;
        bhd.g(bhdVar, i);
        if (bhdVar.E != null) {
            bhd.k(bhdVar).post(new egd(this, i, (byte) 2));
        }
    }

    @Override // n8d
    public final void X(int i) {
        bhd.g(this.c, i);
    }

    @Override // n8d
    public final void Y(c7d c7dVar) {
        bhd.k(this.c).post(new us4((Object) this, (Object) c7dVar, (byte) 20));
    }

    @Override // n8d
    public final void Z(int i) {
        bhd.g(this.c, i);
    }

    @Override // n8d
    public final void b0(int i) {
        bhd.k(this.c).post(new egd(this, i, (byte) 1));
    }

    @Override // n8d
    public final void c0(o7d o7dVar) {
        bhd.k(this.c).post(new tnd(this, o7dVar, (byte) 17));
    }

    @Override // n8d
    public final void d0(int i) {
        bhd.k(this.c).post(new egd(this, i, (byte) 0));
    }

    @Override // n8d
    public final void e0(long j) {
        bhd.f(this.c, j, 0);
    }

    @Override // n8d
    public final void f0(int i, long j) {
        bhd.f(this.c, j, i);
    }

    @Override // n8d
    public final void h0(int i) {
        bhd.k(this.c).post(new egd(this, i, (byte) 3));
    }

    @Override // n8d
    public final void i0(String str, String str2) {
        bhd.H.b("Receive (type=text, ns=%s) %s", str, str2);
        bhd.k(this.c).post(new rz1(this, str, str2, false, (byte) 6));
    }
}
