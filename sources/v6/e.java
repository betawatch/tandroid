package v6;

import com.google.android.gms.common.api.internal.t;
import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import q6.m;
import sg.h0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
        b11.c = new h0(7, this, b10);
        return e(0, b11.a());
    }
}
