package ub;

import android.content.Context;
import ci.u5;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object y0(u5 u5Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(u5Var.y(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) u5Var.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) u5Var.a(e.class), (qb.d) u5Var.a(qb.d.class));
        }
    }
}
