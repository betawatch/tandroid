package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class la implements ka {
    public final ArrayList a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override // z7.ka
    public final void a(s2.e eVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ka) obj).a(eVar);
        }
    }
}
