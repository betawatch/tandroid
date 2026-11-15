package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes.dex */
public final class d {
    public final k8.a a;
    public final ld0 b;
    public final HashMap c;

    public d(Context context, ld0 ld0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.c = new HashMap();
        this.a = aVar;
        this.b = ld0Var;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory G0 = this.a.G0(str);
        if (G0 == null) {
            return null;
        }
        ld0 ld0Var = this.b;
        e create = G0.create(new b((Context) ld0Var.b, (x5.a) ld0Var.c, (x5.a) ld0Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
