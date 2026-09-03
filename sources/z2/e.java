package z2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import q5.c0;
import s5.m;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class e {
    public final c0 a;
    public final m b;
    public final HashMap c;

    public e(Context context, m mVar) {
        c0 c0Var = new c0(context);
        this.c = new HashMap();
        this.a = c0Var;
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
