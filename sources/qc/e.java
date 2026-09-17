package qc;

import f5.f;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public abstract class e {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(f5.b bVar, String str) {
        f parent = bVar.getParent();
        ArrayList arrayList = ((com.googlecode.mp4parser.e) parent).b;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            f5.b bVar2 = (f5.b) obj;
            if (bVar2.getType().equals(bVar.getType())) {
                if (bVar2 == bVar) {
                    break;
                }
                i10++;
            }
        }
        String str2 = String.format("/%s[%d]", bVar.getType(), Integer.valueOf(i10)) + str;
        return parent instanceof f5.b ? a((f5.b) parent, str2) : str2;
    }
}
