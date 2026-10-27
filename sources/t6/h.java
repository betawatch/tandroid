package t6;

import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import o6.l;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h extends j {
    public static final com.google.android.gms.common.api.e k = new com.google.android.gms.common.api.e("ModuleInstall.API", new b8.d(14), new com.google.android.gms.common.api.d());

    public final Task f(n... nVarArr) {
        l.a("Please provide at least one OptionalModuleApi.", nVarArr.length > 0);
        for (n nVar : nVarArr) {
            l.i(nVar, "Requested API must not be null.");
        }
        a b10 = a.b(Arrays.asList(nVarArr), false);
        if (b10.a.isEmpty()) {
            return Tasks.forResult(new s6.a(0, true));
        }
        u b11 = v.b();
        b11.d = new l6.c[]{l7.b.c};
        b11.a = 27301;
        b11.b = false;
        b11.c = new f(this, b10);
        return e(0, b11.a());
    }
}
