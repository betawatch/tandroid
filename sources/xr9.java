// default package

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class xr9 {
    public static final Pattern c = Pattern.compile("[0-9]+");
    public int a;
    public ArrayList b;

    public final String a(String str, String str2, String str3, boolean z) {
        int length = str.length();
        int i = this.a;
        if (length < i) {
            return null;
        }
        int i2 = 0;
        Matcher matcher = c.matcher(str.substring(0, i));
        int parseInt = matcher.find() ? Integer.parseInt(matcher.group(0)) : 0;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            g78 g78Var = (g78) obj;
            if (parseInt >= g78Var.a && parseInt <= g78Var.b && str.length() <= g78Var.c) {
                if (z) {
                    int i4 = g78Var.d;
                    if (((i4 & 3) == 0 && str3 == null && str2 == null) || ((str3 != null && (i4 & 1) != 0) || (str2 != null && (i4 & 2) != 0))) {
                        return g78Var.a(str, str2, str3);
                    }
                } else if (str3 == null) {
                    if (str2 == null) {
                        return g78Var.a(str, str2, str3);
                    }
                    if (str2 != null && (g78Var.d & 2) != 0) {
                        return g78Var.a(str, str2, str3);
                    }
                } else {
                    if ((g78Var.d & 1) != 0) {
                        return g78Var.a(str, str2, str3);
                    }
                    if (str2 != null) {
                        return g78Var.a(str, str2, str3);
                    }
                    continue;
                }
            }
        }
        if (z) {
            return null;
        }
        if (str2 != null) {
            ArrayList arrayList2 = this.b;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                g78 g78Var2 = (g78) obj2;
                if (parseInt >= g78Var2.a && parseInt <= g78Var2.b && str.length() <= g78Var2.c && (str3 == null || (g78Var2.d & 1) != 0)) {
                    return g78Var2.a(str, str2, str3);
                }
            }
            return null;
        }
        if (str3 == null) {
            return null;
        }
        ArrayList arrayList3 = this.b;
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj3 = arrayList3.get(i2);
            i2++;
            g78 g78Var3 = (g78) obj3;
            if (parseInt >= g78Var3.a && parseInt <= g78Var3.b && str.length() <= g78Var3.c && (str2 == null || (g78Var3.d & 2) != 0)) {
                return g78Var3.a(str, str2, str3);
            }
        }
        return null;
    }
}
