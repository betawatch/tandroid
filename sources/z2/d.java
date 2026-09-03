package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.c0;
import s5.m;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class d {
    public final c0 a;
    public final m b;
    public final HashMap c;

    public d(Context context, m mVar) {
        c0 c0Var = new c0(context);
        this.c = new HashMap();
        this.a = c0Var;
        this.b = mVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory B = this.a.B(str);
        if (B == null) {
            return null;
        }
        m mVar = this.b;
        e create = B.create(new b((Context) mVar.b, (h3.a) mVar.c, (h3.a) mVar.d, str));
        this.c.put(str, create);
        return create;
    }
}
