package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.oj0;
import v4.o;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public abstract class b extends oj0 {
    public final m01 c = new m01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        m01 m01Var = this.c;
        m01Var.c = arrayList;
        m01Var.d = arrayList2;
        o.c(m01Var, true).c(this);
    }
}
