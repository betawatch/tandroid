// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class w91 {
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
            int i = 0;
            while (true) {
                if (i >= size) {
                    str2 = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
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
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            String a = ((xr9) obj2).a(str3, str4, str5, true);
            if (a != null) {
                return a;
            }
        }
        ArrayList arrayList3 = this.d;
        int size3 = arrayList3.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList3.get(i3);
            i3++;
            String a2 = ((xr9) obj3).a(str3, str4, str5, false);
            if (a2 != null) {
                return a2;
            }
        }
        return (str4 == null || str3.length() == 0) ? str : qd4.y(str4, " ", str3);
    }
}
