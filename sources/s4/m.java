package s4;

import h5.d0;
import j$.util.DesugarCollections;
import j3.n0;
import java.util.Collections;
import java.util.List;
import s8.v;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public abstract class m {
    public final n0 a;
    public final v b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(n0 n0Var, List list, s sVar, List list2, List list3, List list4) {
        h5.a.f(!list.isEmpty());
        this.a = n0Var;
        this.b = v.t(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        this.c = d0.N(sVar.c, 1000000L, sVar.b);
    }

    public abstract String b();

    public abstract r4.h c();

    public abstract j d();
}
