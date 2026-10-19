package vb;

import android.content.Context;
import com.google.android.gms.internal.cast.z5;
import java.util.ArrayList;
import java.util.Collections;
import n6.l;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements r9.d {
    public static final /* synthetic */ b b = new b(0);
    public static final /* synthetic */ b c = new b(1);
    public final /* synthetic */ int a;

    public /* synthetic */ b(int i10) {
        this.a = i10;
    }

    @Override // r9.d
    public final Object j2(z5 z5Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(z5Var.y(ub.a.class));
                l.j("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, c.a);
                return new e((Context) z5Var.a(Context.class), (ub.a) arrayList.get(0));
            default:
                return new a((e) z5Var.a(e.class), (rb.d) z5Var.a(rb.d.class));
        }
    }
}
