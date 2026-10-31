package x7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class da implements fa {
    public final ArrayList a;

    public da(Context context, ca caVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        caVar.getClass();
        arrayList.add(new ha(context, caVar));
    }

    @Override // x7.fa
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((fa) obj).a(aVar);
        }
    }
}
