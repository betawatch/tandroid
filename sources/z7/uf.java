package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
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
