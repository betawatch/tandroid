package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.g0;
import s5.m;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class d {
    public final g0 a;
    public final m b;
    public final HashMap c;

    public d(Context context, m mVar) {
        g0 g0Var = new g0(context, 19);
        this.c = new HashMap();
        this.a = g0Var;
        this.b = mVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory E = this.a.E(str);
        if (E == null) {
            return null;
        }
        m mVar = this.b;
        e create = E.create(new b((Context) mVar.b, (h3.a) mVar.c, (h3.a) mVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
