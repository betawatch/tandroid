// default package

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class q1f implements g2f {
    public final ArrayList a;

    public q1f(Context context, y0f y0fVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        y0fVar.getClass();
        arrayList.add(new k3f(context, y0fVar));
    }

    @Override // g2f
    public final void a(rx rxVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((g2f) obj).a(rxVar);
        }
    }
}
