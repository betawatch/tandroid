package z5;

import android.os.Bundle;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class w {
    public Boolean a;
    public boolean b;
    public final /* synthetic */ g c;
    public final int d;
    public final Bundle e;
    public final /* synthetic */ g f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f = gVar;
        Boolean bool = Boolean.TRUE;
        this.c = gVar;
        this.a = bool;
        this.b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(w5.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.c.C) {
            this.c.C.remove(this);
        }
    }
}
