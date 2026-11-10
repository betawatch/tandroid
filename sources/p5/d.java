package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import m4.d0;
import org.telegram.ui.ly0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class d {
    public final d0 a;
    public final ly0 b;
    public final HashMap c;

    public d(Context context, ly0 ly0Var) {
        d0 d0Var = new d0(context);
        this.c = new HashMap();
        this.a = d0Var;
        this.b = ly0Var;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory E = this.a.E(str);
        if (E == null) {
            return null;
        }
        ly0 ly0Var = this.b;
        e create = E.create(new b((Context) ly0Var.b, (x5.a) ly0Var.c, (x5.a) ly0Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
