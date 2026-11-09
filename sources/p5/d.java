package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.ky0;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes.dex */
public final class d {
    public final d0 a;
    public final ky0 b;
    public final HashMap c;

    public d(Context context, ky0 ky0Var) {
        d0 d0Var = new d0(context);
        this.c = new HashMap();
        this.a = d0Var;
        this.b = ky0Var;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory E = this.a.E(str);
        if (E == null) {
            return null;
        }
        ky0 ky0Var = this.b;
        e create = E.create(new b((Context) ky0Var.b, (x5.a) ky0Var.c, (x5.a) ky0Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
