package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.z01;
import v4.o;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public abstract class b extends bk0 {
    public final z01 c = new z01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        z01 z01Var = this.c;
        z01Var.c = arrayList;
        z01Var.d = arrayList2;
        o.c(z01Var, true).c(this);
    }
}
