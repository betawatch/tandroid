package z7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes.dex */
public final class la implements ka {
    public final ArrayList a;

    public la(Context context, ja jaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        jaVar.getClass();
        arrayList.add(new na(context, jaVar));
    }

    @Override // z7.ka
    public final void a(sg.i0 i0Var) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            ((ka) obj).a(i0Var);
        }
    }
}
