package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import v5.n;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class d {
    public final n a;
    public final v5.c b;
    public final HashMap c;

    public d(Context context, v5.c cVar) {
        n nVar = new n(context, 8);
        this.c = new HashMap();
        this.a = nVar;
        this.b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory n10 = this.a.n(str);
        if (n10 == null) {
            return null;
        }
        v5.c cVar = this.b;
        e create = n10.create(new b((Context) cVar.b, (h3.a) cVar.c, (h3.a) cVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
