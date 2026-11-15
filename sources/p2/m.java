package p2;

import a8.ja;
import e2.u;
import h2.l0;
import h9.i0;
import j$.util.DesugarCollections;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public abstract class m {
    public final u a;
    public final i0 b;
    public final long c;
    public final List d;
    public final List e;
    public final List f;
    public final j h;

    public m(u uVar, List list, s sVar, List list2, List list3, List list4) {
        ja.f(!list.isEmpty());
        this.a = uVar;
        this.b = i0.q(list);
        this.d = list2 == null ? Collections.EMPTY_LIST : DesugarCollections.unmodifiableList(list2);
        this.e = list3;
        this.f = list4;
        this.h = sVar.a(this);
        long j3 = sVar.c;
        long j10 = sVar.b;
        String str = l0.a;
        this.c = l0.a0(j3, 1000000L, j10, RoundingMode.DOWN);
    }

    public abstract String a();

    public abstract o2.i c();

    public abstract j d();
}
