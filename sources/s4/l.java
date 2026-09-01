package s4;

import android.net.Uri;
import j3.n0;
import java.util.ArrayList;
import java.util.List;
import org.telegram.ui.Components.ai;
import s8.v;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class l extends m {
    public final j n;
    public final ai r;

    public l(n0 n0Var, v vVar, r rVar, ArrayList arrayList, List list, List list2) {
        super(n0Var, vVar, rVar, arrayList, list, list2);
        Uri.parse(((b) vVar.get(0)).a);
        long j10 = rVar.e;
        j jVar = j10 <= 0 ? null : new j(rVar.d, j10, null);
        this.n = jVar;
        this.r = jVar == null ? new ai(new j(0L, -1L, null), 13) : null;
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
