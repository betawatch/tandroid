// default package

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yxb {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public yxb(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            lq5.j(qd4.y("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = str3;
        this.b = str;
        this.c = qd4.p(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yxb)) {
            return false;
        }
        yxb yxbVar = (yxb) obj;
        return this.a.equals(yxbVar.a) && this.b.equals(yxbVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
