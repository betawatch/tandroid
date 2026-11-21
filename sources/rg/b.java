package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.b11;
import org.telegram.ui.Components.dk0;
import v4.o;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public abstract class b extends dk0 {
    public final b11 c = new b11();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        b11 b11Var = this.c;
        b11Var.c = arrayList;
        b11Var.d = arrayList2;
        o.c(b11Var, true).c(this);
    }
}
