package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.Components.z01;
import v4.o;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
