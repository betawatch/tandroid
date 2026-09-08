package s6;

import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.internal.w;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import ji.u4;
import n6.l;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class g extends j {
    public static final com.google.android.gms.common.api.e k = new com.google.android.gms.common.api.e("ModuleInstall.API", new a8.d(14), new com.google.android.gms.common.api.d());

    public final Task f(n... nVarArr) {
        l.a("Please provide at least one OptionalModuleApi.", nVarArr.length > 0);
        for (n nVar : nVarArr) {
            l.i(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.a.isEmpty()) {
            return Tasks.forResult(new r6.a(0, true));
        }
        v e7 = w.e();
        e7.d = new k6.c[]{k7.b.c};
        e7.a = 27301;
        e7.b = false;
        e7.c = new u4(this, b10);
        return e(0, e7.a());
    }
}
