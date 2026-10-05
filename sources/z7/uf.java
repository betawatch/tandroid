package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public final class uf implements tf {
    public final ArrayList a;

    public uf(Context context, sf sfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        sfVar.getClass();
        arrayList.add(new xf(context, sfVar));
    }

    @Override // z7.tf
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((tf) obj).a(aVar);
        }
    }
}
