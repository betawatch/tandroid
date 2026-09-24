package x7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
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
