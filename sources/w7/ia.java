package w7;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class ia implements ha {
    public final ArrayList a;

    public ia(Context context, ga gaVar) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        gaVar.getClass();
        arrayList.add(new ka(context, gaVar));
    }

    @Override // w7.ha
    public final void a(m5.e eVar) {
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ha) obj).a(eVar);
        }
    }
}
