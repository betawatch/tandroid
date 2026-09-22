package w7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
    public final void a(org.telegram.ui.Cells.f3 f3Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(f3Var);
        }
    }
}
