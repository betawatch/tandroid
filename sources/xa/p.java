package xa;

import android.util.Log;
import java.util.Arrays;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class p {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public p(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            throw new IllegalArgumentException(a1.g.n("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
        }
        this.a = str3;
        this.b = str;
        this.c = a1.g.C(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.b.equals(pVar.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.a});
    }
}
