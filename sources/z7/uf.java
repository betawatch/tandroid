package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
