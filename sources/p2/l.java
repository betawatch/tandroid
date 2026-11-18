package p2;

import android.net.Uri;
import e2.u;
import h9.i0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.hn;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final hn r;

    public l(u uVar, i0 i0Var, r rVar, ArrayList arrayList, List list, List list2) {
        super(uVar, i0Var, rVar, arrayList, list, list2);
        Uri.parse(((b) i0Var.get(0)).a);
        long j3 = rVar.e;
        j jVar = j3 <= 0 ? null : new j(rVar.d, null, j3);
        this.n = jVar;
        this.r = jVar == null ? new hn(new j(0L, null, -1L), 8) : null;
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
