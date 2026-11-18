package pc;

import i5.g;
import java.util.ArrayList;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public abstract class e {
    static {
        Pattern.compile("(....|\\.\\.)(\\[(.*)\\])?");
    }

    public static String a(i5.b bVar, String str) {
        g parent = bVar.getParent();
        ArrayList arrayList = ((com.googlecode.mp4parser.e) parent).b;
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            i5.b bVar2 = (i5.b) obj;
            if (bVar2.getType().equals(bVar.getType())) {
                if (bVar2 == bVar) {
                    break;
                }
                i7++;
            }
        }
        String str2 = String.format("/%s[%d]", bVar.getType(), Integer.valueOf(i7)) + str;
        return parent instanceof i5.b ? a((i5.b) parent, str2) : str2;
    }
}
