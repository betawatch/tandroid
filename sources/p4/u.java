package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class u {
    public final h3 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final k2.u d;
    public b2.p e;

    public u(h3 h3Var, boolean z10) {
        this.a = h3Var;
        this.d = (k2.u) h3Var.d;
        this.c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            v vVar = (v) obj;
            if (vVar.b.equals(str)) {
                return vVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
