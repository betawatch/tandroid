package w7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes.dex */
public final class ka implements ja {
    public final ArrayList a;

    public ka(Context context, ia iaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        iaVar.getClass();
        arrayList.add(new ma(context, iaVar));
    }

    @Override // w7.ja
    public final void a(n7.z0 z0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(z0Var);
        }
    }
}
