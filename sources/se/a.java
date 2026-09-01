package se;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class a {
    public String a;
    public ArrayList b;
    public ArrayList c;
    public ArrayList d;

    public final String a(String str) {
        String str2;
        String str3;
        String str4;
        String str5 = null;
        if (str.startsWith(this.a)) {
            str4 = this.a;
            str3 = str.substring(str4.length());
        } else {
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i10 = 0;
            while (true) {
                if (i10 >= size) {
                    str2 = null;
                    break;
                }
                Object obj = arrayList.get(i10);
                i10++;
                str2 = (String) obj;
                if (str.startsWith(str2)) {
                    break;
                }
            }
            if (str2 != null) {
                str3 = str.substring(str2.length());
                str4 = null;
                str5 = str2;
            } else {
                str3 = str;
                str4 = null;
            }
        }
        ArrayList arrayList2 = this.d;
        int size2 = arrayList2.size();
        int i11 = 0;
        while (i11 < size2) {
            Object obj2 = arrayList2.get(i11);
            i11++;
            String a2 = ((d) obj2).a(str3, str4, str5, true);
            if (a2 != null) {
                return a2;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList3.get(i12);
            i12++;
            String a10 = ((d) obj3).a(str3, str4, str5, false);
            if (a10 != null) {
                return a10;
            }
        }
        return (str4 == null || str3.length() == 0) ? str : android.support.v4.media.a.z(str4, " ", str3);
    }
}
