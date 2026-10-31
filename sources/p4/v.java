package p4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class v {
    public final g3 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final l2.f d;
    public b2.u e;

    public v(g3 g3Var, boolean z10) {
        this.a = g3Var;
        this.d = (l2.f) g3Var.d;
        this.c = z10;
    }

    public final w a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            w wVar = (w) obj;
            if (wVar.b.equals(str)) {
                return wVar;
            }
        }
        return null;
    }

    public final String toString() {
        return "MediaRouter.RouteProviderInfo{ packageName=" + ((ComponentName) this.d.b).getPackageName() + " }";
    }
}
