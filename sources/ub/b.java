package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object D(cf.c cVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.s(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) cVar.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.a(e.class), (qb.d) cVar.a(qb.d.class));
        }
    }
}
