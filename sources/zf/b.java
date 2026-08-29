package zf;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.mx;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class b extends il0 {
    public final mx c = new mx();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        mx mxVar = this.c;
        mxVar.c = arrayList;
        mxVar.d = arrayList2;
        q.c(mxVar, true).b(this);
    }
}
