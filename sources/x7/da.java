package x7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
