package r3;

import h5.d0;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public final class p {
    public static final Pattern c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");
    public int a = -1;
    public int b = -1;

    public final boolean a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String group = matcher.group(1);
            int i10 = d0.a;
            int parseInt = Integer.parseInt(group, 16);
            int parseInt2 = Integer.parseInt(matcher.group(2), 16);
            if (parseInt <= 0 && parseInt2 <= 0) {
                return false;
            }
            this.a = parseInt;
            this.b = parseInt2;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(e4.c cVar) {
        int i10 = 0;
        while (true) {
            e4.b[] bVarArr = cVar.a;
            if (i10 >= bVarArr.length) {
                return;
            }
            e4.b bVar = bVarArr[i10];
            if (bVar instanceof j4.e) {
                j4.e eVar = (j4.e) bVar;
                if ("iTunSMPB".equals(eVar.c) && a(eVar.d)) {
                    return;
                }
            } else if (bVar instanceof j4.k) {
                j4.k kVar = (j4.k) bVar;
                if ("com.apple.iTunes".equals(kVar.b) && "iTunSMPB".equals(kVar.c) && a(kVar.d)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }
}
