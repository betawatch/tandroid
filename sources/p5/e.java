package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.nd0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class e {
    public final k8.a a;
    public final nd0 b;
    public final HashMap c;

    public e(Context context, nd0 nd0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.c = new HashMap();
        this.a = aVar;
        this.b = nd0Var;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory x02 = this.a.x0(str);
        if (x02 == null) {
            return null;
        }
        nd0 nd0Var = this.b;
        f create = x02.create(new b((Context) nd0Var.b, (x5.a) nd0Var.c, (x5.a) nd0Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
