package x7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
