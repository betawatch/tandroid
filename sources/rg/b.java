package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.dk0;
import v4.o;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public abstract class b extends dk0 {
    public final a11 c = new a11();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        a11 a11Var = this.c;
        a11Var.c = arrayList;
        a11Var.d = arrayList2;
        o.c(a11Var, true).c(this);
    }
}
