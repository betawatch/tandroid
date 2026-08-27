package x2;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import w3.b0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class d {
    public final b0 a;
    public final u2.b b;
    public final HashMap c;

    public d(Context context, u2.b bVar) {
        b0 b0Var = new b0(context, 2);
        this.c = new HashMap();
        this.a = b0Var;
        this.b = bVar;
    }

    public final synchronized e a(String str) {
        if (this.c.containsKey(str)) {
            return (e) this.c.get(str);
        }
        CctBackendFactory j10 = this.a.j(str);
        if (j10 == null) {
            return null;
        }
        u2.b bVar = this.b;
        e create = j10.create(new b((Context) bVar.c, (f3.a) bVar.d, (f3.a) bVar.b, str));
        this.c.put(str, create);
        return create;
    }
}
