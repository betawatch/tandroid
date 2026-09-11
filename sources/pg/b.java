package pg;

import hg.g;
import java.util.ArrayList;
import org.telegram.ui.Components.kl0;
import s4.o;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public abstract class b extends kl0 {
    public final g c = new g();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        g gVar = this.c;
        gVar.c = arrayList;
        gVar.d = arrayList2;
        o.c(gVar, true).b(this);
    }
}
