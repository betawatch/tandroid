// default package

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class qde {
    protected int zza;

    public static void a(List list, List list2) {
        Charset charset = foe.a;
        list.getClass();
        if (list instanceof ere) {
            List zzd = ((ere) list).zzd();
            ere ereVar = (ere) list2;
            int size = list2.size();
            for (Object obj : zzd) {
                if (obj == null) {
                    int size2 = ereVar.size() - size;
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = ereVar.size() - 1; size3 >= size; size3--) {
                        ereVar.remove(size3);
                    }
                    fvc.f(sb2);
                    return;
                }
                if (obj instanceof sie) {
                    ereVar.e((sie) obj);
                } else {
                    ereVar.add((String) obj);
                }
            }
            return;
        }
        if (list instanceof yve) {
            list2.addAll(list);
            return;
        }
        if ((list2 instanceof ArrayList) && (list instanceof Collection)) {
            ((ArrayList) list2).ensureCapacity(list.size() + list2.size());
        }
        int size4 = list2.size();
        for (Object obj2 : list) {
            if (obj2 == null) {
                int size5 = list2.size() - size4;
                StringBuilder sb3 = new StringBuilder(37);
                sb3.append("Element at index ");
                sb3.append(size5);
                sb3.append(" is null.");
                String sb4 = sb3.toString();
                for (int size6 = list2.size() - 1; size6 >= size4; size6--) {
                    list2.remove(size6);
                }
                fvc.f(sb4);
                return;
            }
            list2.add(obj2);
        }
    }

    public abstract void b(int i);

    public abstract int c();
}
