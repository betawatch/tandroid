package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.nd0;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final nd0 r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j3 = rVar.e;
        j jVar = j3 <= 0 ? null : new j(rVar.d, null, j3);
        this.n = jVar;
        this.r = jVar == null ? new nd0(new j(0L, null, -1L), 5) : null;
    }

    @Override // p2.m
    public final String b() {
        return null;
    }

    @Override // p2.m
    public final o2.i d() {
        return this.r;
    }

    @Override // p2.m
    public final j h() {
        return this.n;
    }
}
