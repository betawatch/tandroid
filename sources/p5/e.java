package p5;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;
import org.telegram.ui.md0;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes.dex */
public final class e {
    public final k8.a a;
    public final md0 b;
    public final HashMap c;

    public e(Context context, md0 md0Var) {
        k8.a aVar = new k8.a(context, 22);
        this.c = new HashMap();
        this.a = aVar;
        this.b = md0Var;
    }

    public final synchronized f a(String str) {
        if (this.c.containsKey(str)) {
            return (f) this.c.get(str);
        }
        CctBackendFactory x02 = this.a.x0(str);
        if (x02 == null) {
            return null;
        }
        md0 md0Var = this.b;
        f create = x02.create(new b((Context) md0Var.b, (x5.a) md0Var.c, (x5.a) md0Var.d, str));
        this.c.put(str, create);
        return create;
    }
}
