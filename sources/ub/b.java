package ub;

import android.content.Context;
import bi.u6;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements q9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public final Object P1(u6 u6Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(u6Var.x(tb.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) u6Var.a(Context.class), (tb.a) arrayList.get(0));
            default:
                return new a((e) u6Var.a(e.class), (qb.d) u6Var.a(qb.d.class));
        }
    }
}
