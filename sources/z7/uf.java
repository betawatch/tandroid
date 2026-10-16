package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class uf implements tf {
    public final ArrayList a;

    public uf(Context context, sf sfVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        sfVar.getClass();
        arrayList.add(new yf(context, sfVar));
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
