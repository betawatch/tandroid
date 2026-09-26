package w7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
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
