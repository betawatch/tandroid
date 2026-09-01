package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.g0;
import s5.m;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class e {
    public final g0 a;
    public final m b;
    public final HashMap c;

    public e(Context context, m mVar) {
        g0 g0Var = new g0(context, 19);
        this.c = new HashMap();
        this.a = g0Var;
        this.b = mVar;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory y10 = this.a.y(str);
        if (y10 == null) {
            return null;
        }
        m mVar = this.b;
        f create = y10.create(new b((Context) mVar.b, (h3.a) mVar.c, (h3.a) mVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
