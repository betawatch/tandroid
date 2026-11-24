// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
