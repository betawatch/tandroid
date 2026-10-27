package qg;

import ig.h;
import java.util.ArrayList;
import org.telegram.ui.Components.mm0;
import s4.p;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class b extends mm0 {
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
