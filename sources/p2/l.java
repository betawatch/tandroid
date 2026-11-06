package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.uy;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
