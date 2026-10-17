package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class wf implements vf {
    public final ArrayList a;

    public wf(Context context, uf ufVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        ufVar.getClass();
        arrayList.add(new zf(context, ufVar));
    }

    @Override // z7.vf
    public final void a(a5.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((vf) obj).a(aVar);
        }
    }
}
