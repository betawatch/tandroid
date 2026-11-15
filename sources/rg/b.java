package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.tj0;
import v4.o;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class b extends tj0 {
    public final p01 c = new p01();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        p01 p01Var = this.c;
        p01Var.c = arrayList;
        p01Var.d = arrayList2;
        o.c(p01Var, true).c(this);
    }
}
