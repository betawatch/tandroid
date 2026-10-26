package qg;

import ig.h;
import java.util.ArrayList;
import org.telegram.ui.Components.lm0;
import s4.p;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class b extends lm0 {
    public final h c = new h();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        h hVar = this.c;
        hVar.c = arrayList;
        hVar.d = arrayList2;
        p.c(hVar, true).c(this);
    }
}
