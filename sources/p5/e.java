package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import jb.m;
import org.telegram.ui.Components.i61;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class e {
    public final m a;
    public final i61 b;
    public final HashMap c;

    public e(Context context, i61 i61Var) {
        m mVar = new m(context, 23);
        this.c = new HashMap();
        this.a = mVar;
        this.b = i61Var;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory u02 = this.a.u0(str);
        if (u02 == null) {
            return null;
        }
        i61 i61Var = this.b;
        f create = u02.create(new b((Context) i61Var.b, (x5.a) i61Var.c, (x5.a) i61Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
