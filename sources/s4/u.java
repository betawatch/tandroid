package s4;

import android.content.ComponentName;
import com.google.android.gms.internal.vision.h3;
import java.util.ArrayList;
import org.telegram.messenger.ou;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class u {
    public final h3 a;
    public final ArrayList b = new ArrayList();
    public final boolean c;
    public final ou d;
    public ca.i e;

    public u(h3 h3Var, boolean z10) {
        this.a = h3Var;
        this.d = (ou) h3Var.d;
        this.c = z10;
    }

    public final v a(String str) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
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
