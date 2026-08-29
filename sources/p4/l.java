package p4;

import android.net.Uri;
import j3.t0;
import java.util.ArrayList;
import java.util.List;
import nh.d6;
import q8.z;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final d6 r;

    public l(t0 t0Var, z zVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(t0Var, zVar, rVar, arrayList, list, list2);
        Uri.parse(((b) zVar.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new d6(new j(0L, -1L, null), 13) : null;
    }

    @Override // p4.m
    public final String a() {
        return null;
    }

    @Override // p4.m
    public final o4.i c() {
        return this.r;
    }

    @Override // p4.m
    public final j d() {
        return this.n;
    }
}
