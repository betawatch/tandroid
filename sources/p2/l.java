package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.jn;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final jn r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j3 = rVar.e;
        j jVar = j3 <= 0 ? null : new j(rVar.d, null, j3);
        this.n = jVar;
        this.r = jVar == null ? new jn(new j(0L, null, -1L), 8) : null;
    }

    @Override // p2.m
    public final String b() {
        return null;
    }

    @Override // p2.m
    public final o2.i c() {
        return this.r;
    }

    @Override // p2.m
    public final j d() {
        return this.n;
    }
}
