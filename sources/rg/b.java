package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.dk0;
import org.telegram.ui.Components.z01;
import v4.p;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class b extends dk0 {
    public final z01 c = new z01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        z01 z01Var = this.c;
        z01Var.c = arrayList;
        z01Var.d = arrayList2;
        p.c(z01Var, true).c(this);
    }
}
