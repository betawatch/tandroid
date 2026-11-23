package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.a11;
import org.telegram.ui.Components.dk0;
import v4.o;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
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
