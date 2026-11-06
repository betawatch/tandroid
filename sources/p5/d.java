package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.hy0;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes.dex */
public final class d {
    public final d0 a;
    public final hy0 b;
    public final HashMap c;

    public d(Context context, hy0 hy0Var) {
        d0 d0Var = new d0(context);
        this.c = new HashMap();
        this.a = d0Var;
        this.b = hy0Var;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory E = this.a.E(str);
        if (E == null) {
            return null;
        }
        hy0 hy0Var = this.b;
        e create = E.create(new b((Context) hy0Var.b, (x5.a) hy0Var.c, (x5.a) hy0Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
