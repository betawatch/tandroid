package x7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class ca implements ea {
    public final ArrayList a;

    public ca(Context context, ba baVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        baVar.getClass();
        arrayList.add(new ga(context, baVar));
    }

    @Override // x7.ea
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ea) obj).a(aVar);
        }
    }
}
