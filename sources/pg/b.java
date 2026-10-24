package pg;

import hg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.lm0;
import s4.o;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
