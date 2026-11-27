// default package

import android.os.Build;
import java.util.Locale;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class qb6 {
    public static final qb6 b = a(new Locale[0]);
    public final sb6 a;

    public qb6(sb6 sb6Var) {
        this.a = sb6Var;
    }

    public static qb6 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new qb6(new tb6(lh0.e(localeArr))) : new qb6(new rb6(localeArr));
    }

    public static qb6 b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] split = str.split(",", -1);
        int length = split.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = split[i];
            int i2 = pb6.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qb6) {
            return this.a.equals(((qb6) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
