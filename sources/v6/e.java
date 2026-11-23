package v6;

import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import q6.m;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e extends j {
    public static final com.google.android.gms.common.api.e l = new com.google.android.gms.common.api.e("ModuleInstall.API", new a9.e(19), new com.google.android.gms.common.api.d());

    public final Task f(n... nVarArr) {
        m.a("Please provide at least one OptionalModuleApi.", nVarArr.length > 0);
        for (n nVar : nVarArr) {
            m.i(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.a.isEmpty()) {
            return Tasks.forResult(new u6.a(0, true));
        }
        t b11 = u.b();
        b11.d = new n6.c[]{n7.b.d};
        b11.a = 27301;
        b11.b = false;
        b11.c = new s2.e(8, this, b10);
        return e(0, b11.a());
    }
}
