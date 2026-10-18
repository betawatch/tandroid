package s6;

import com.google.android.gms.common.api.internal.u;
import com.google.android.gms.common.api.internal.v;
import com.google.android.gms.common.api.j;
import com.google.android.gms.common.api.n;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import ki.t1;
import n6.l;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
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
        u b11 = v.b();
        b11.d = new k6.c[]{k7.b.c};
        b11.a = 27301;
        b11.b = false;
        b11.c = new t1(this, b10);
        return e(0, b11.a());
    }
}
