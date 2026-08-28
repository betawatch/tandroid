package yb;

import java.util.ArrayList;
import java.util.regex.Pattern;
import q2.f;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class e {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(q2.b bVar, String str) {
        f parent = bVar.getParent();
        ArrayList arrayList = ((com.googlecode.mp4parser.e) parent).b;
        int size = arrayList.size();
        int i9 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q2.b bVar2 = (q2.b) obj;
            if (bVar2.getType().equals(bVar.getType())) {
                if (bVar2 == bVar) {
                    break;
                }
                i9++;
            }
        }
        String str2 = String.format("/%s[%d]", bVar.getType(), Integer.valueOf(i9)) + str;
        return parent instanceof q2.b ? a((q2.b) parent, str2) : str2;
    }
}
