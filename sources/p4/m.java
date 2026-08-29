package p4;

import f5.d0;
import j$.util.DesugarCollections;
import j3.t0;
import java.util.Collections;
import java.util.List;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class m {
    public final t0 a;
    public final z b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(t0 t0Var, List list, s sVar, List list2, List list3, List list4) {
        f5.a.f(!list.isEmpty());
        this.a = t0Var;
        this.b = z.u(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        this.c = d0.O(sVar.c, 1000000L, sVar.b);
    }

    public abstract String a();

    public abstract o4.i c();

    public abstract j d();
}
