package pg;

import hg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.lm0;
import s4.o;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public abstract class b extends lm0 {
    public final g c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.c;
        gVar.c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).c(this);
    }
}
