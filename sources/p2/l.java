package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final uy r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j3 = rVar.e;
        j jVar = j3 <= 0 ? null : new j(rVar.d, null, j3);
        this.n = jVar;
        this.r = jVar == null ? new uy(new j(0L, null, -1L), 7) : null;
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
    public final j f() {
        return this.n;
    }
}
