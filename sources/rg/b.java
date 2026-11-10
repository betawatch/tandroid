package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.oj0;
import v4.o;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
