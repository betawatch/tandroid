package s4;

import android.net.Uri;
import j3.n0;
import java.util.ArrayList;
import java.util.List;
import s8.v;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final o2.i r;

    public l(n0 n0Var, v vVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, rVar, arrayList, list, list2);
        Uri.parse(((b) vVar.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new o2.i(new j(0L, -1L, null), 17) : null;
    }

    @Override // s4.m
    public final String b() {
        return null;
    }

    @Override // s4.m
    public final r4.h c() {
        return this.r;
    }

    @Override // s4.m
    public final j d() {
        return this.n;
    }
}
