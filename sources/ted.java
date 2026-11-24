// default package

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ted extends l6d {
    public final /* synthetic */ afd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ted(afd afdVar) {
        super((byte) 1);
        this.c = afdVar;
    }

    @Override // l6d
    public final void T(wr wrVar, String str, String str2, boolean z) {
        afd afdVar = this.c;
        afdVar.u = wrVar;
        afdVar.v = str;
        i9f i9fVar = new i9f(new Status(0, null, null, null), wrVar, str, str2, z);
        synchronized (afdVar.s) {
            TaskCompletionSource taskCompletionSource = afdVar.p;
            if (taskCompletionSource != null) {
                taskCompletionSource.setResult(i9fVar);
            }
            afdVar.p = null;
        }
    }

    @Override // l6d
    public final void V(int i) {
        this.c.i(i);
    }

    @Override // l6d
    public final void W(int i) {
        afd afdVar = this.c;
        afd.g(afdVar, i);
        if (afdVar.E != null) {
            afd.k(afdVar).post(new ded(this, i, (byte) 2));
        }
    }

    @Override // l6d
    public final void X(int i) {
        afd.g(this.c, i);
    }

    @Override // l6d
    public final void Y(a5d a5dVar) {
        afd.k(this.c).post(new tq4((Object) this, (Object) a5dVar, (byte) 20));
    }

    @Override // l6d
    public final void Z(int i) {
        afd.g(this.c, i);
    }

    @Override // l6d
    public final void b0(int i) {
        afd.k(this.c).post(new ded(this, i, (byte) 1));
    }

    @Override // l6d
    public final void c0(m5d m5dVar) {
        afd.k(this.c).post(new rld(this, m5dVar, (byte) 17));
    }

    @Override // l6d
    public final void d0(int i) {
        afd.k(this.c).post(new ded(this, i, (byte) 0));
    }

    @Override // l6d
    public final void e0(long j) {
        afd.f(this.c, j, 0);
    }

    @Override // l6d
    public final void f0(int i, long j) {
        afd.f(this.c, j, i);
    }

    @Override // l6d
    public final void h0(int i) {
        afd.k(this.c).post(new ded(this, i, (byte) 3));
    }

    @Override // l6d
    public final void i0(String str, String str2) {
        afd.H.b("Receive (type=text, ns=%s) %s", str, str2);
        afd.k(this.c).post(new ey1(this, str, str2, false, (byte) 6));
    }
}
