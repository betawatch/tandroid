package w7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
    public final void a(o0.a aVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ja) obj).a(aVar);
        }
    }
}
