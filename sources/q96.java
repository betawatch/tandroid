// default package

import android.util.SparseArray;
import j$.util.Comparator$-CC;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class q96 {
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
        Collections.sort(arrayList, Comparator$-CC.comparingInt(new mm((byte) 6)));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Map.Entry entry2 = (Map.Entry) obj;
            this.a.append(((String) entry2.getKey()).hashCode(), (String) entry2.getValue());
        }
    }
}
