// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class uye {
    public static final ArrayList a(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            zzc zzcVar = (zzc) obj;
            Bundle bundle = new Bundle();
            bundle.putInt("event_type", zzcVar.a);
            bundle.putLong("event_timestamp", zzcVar.b);
            arrayList2.add(bundle);
        }
        return arrayList2;
    }
}
