package r4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.g3;
import java.util.ArrayList;
import org.telegram.ui.Components.nh;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class v {
    public final g3 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final nh d;
    public ba.i e;

    public v(g3 g3Var, boolean z10) {
        this.a = g3Var;
        this.d = (nh) g3Var.d;
        this.c = z10;
    }

    public final w a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
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
