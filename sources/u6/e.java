package u6;

import com.google.android.gms.common.api.internal.s;
import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import mi.h0;
import p6.m;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("ModuleInstall.API", new a6.b(17), new com.google.android.gms.common.api.d());

    public final Task f(n... nVarArr) {
        boolean z10 = false;
        m.a("Please provide at least one OptionalModuleApi.", nVarArr.length > 0);
        for (n nVar : nVarArr) {
            m.h(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.a.isEmpty()) {
            return Tasks.forResult(new t6.a(0, true));
        }
        s b11 = t.b();
        b11.d = new m6.c[]{m7.b.d};
        b11.a = 27301;
        b11.b = false;
        b11.c = new h0(this, b10, z10, 26);
        return e(0, b11.a());
    }
}
