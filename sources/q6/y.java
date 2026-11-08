package q6;

import android.os.Bundle;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
