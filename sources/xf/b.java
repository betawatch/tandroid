package xf;

import f2.q;
import java.util.ArrayList;
import org.telegram.ui.Components.fx;
import org.telegram.ui.Components.yk0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class b extends yk0 {
    public final fx c = new fx();

    public final void E(ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList2 == null) {
            arrayList2 = new ArrayList();
        }
        fx fxVar = this.c;
        fxVar.c = arrayList;
        fxVar.d = arrayList2;
        q.c(fxVar, true).b(this);
    }
}
