package x7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class la implements ka {
    public final ArrayList a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override // x7.ka
    public final void a(m4.c cVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ka) obj).a(cVar);
        }
    }
}
