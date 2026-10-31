package w7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ia implements ha {
    public final ArrayList a;

    public ia(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        gaVar.getClass();
        arrayList.add(new ka(context, gaVar));
    }

    @Override // w7.ha
    public final void a(m5.e eVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ha) obj).a(eVar);
        }
    }
}
