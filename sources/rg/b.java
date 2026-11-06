package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.oj0;
import v4.o;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
