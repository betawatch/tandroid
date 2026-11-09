package q6;

import android.os.Bundle;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public abstract class y {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ d c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ d f;

    public y(d dVar, int i7, Bundle bundle) {
        this.f = dVar;
        Boolean bool = Boolean.TRUE;
        this.c = dVar;
        this.a = bool;
        this.b = false;
        this.d = i7;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(n6.a aVar);

    public final void c() {
        d();
        d dVar = this.c;
        synchronized (dVar.q) {
            dVar.q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
