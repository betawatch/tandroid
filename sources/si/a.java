package si;

import android.util.SparseArray;
import bg.d;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes4.dex */
public final class a {
    public SparseArray a;

    public final void a(HashMap hashMap) {
        if (this.a != null) {
            for (Map.Entry entry : hashMap.entrySet()) {
                this.a.put(((String) entry.getKey()).hashCode(), (String) entry.getValue());
            }
            return;
        }
        this.a = new SparseArray(hashMap.size());
        ArrayList arrayList = new ArrayList(hashMap.entrySet());
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new d(22)));
        int size = arrayList.size();
        int i7 = 0;
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            Map.Entry entry2 = (Map.Entry) obj;
            this.a.append(((String) entry2.getKey()).hashCode(), (String) entry2.getValue());
        }
    }
}
