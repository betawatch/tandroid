package rg;

import java.util.ArrayList;
import org.telegram.ui.Components.p01;
import org.telegram.ui.Components.tj0;
import v4.o;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
