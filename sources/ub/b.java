package ub;

import android.content.Context;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object G(cf.c cVar) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(cVar.x(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) cVar.b(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) cVar.b(e.class), (qb.d) cVar.b(qb.d.class));
        }
    }
}
