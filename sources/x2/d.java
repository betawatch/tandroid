package x2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class d {
    public final w4.e a;
    public final t5.c b;
    public final HashMap c;

    public d(Context context, t5.c cVar) {
        w4.e eVar = new w4.e(context, 1);
        this.c = new HashMap();
        this.a = eVar;
        this.b = cVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory f10 = this.a.f(str);
        if (f10 == null) {
            return null;
        }
        t5.c cVar = this.b;
        e create = f10.create(new b((Context) cVar.b, (f3.a) cVar.c, (f3.a) cVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
