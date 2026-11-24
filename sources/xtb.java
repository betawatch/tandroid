// default package

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xtb {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public xtb(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            w26.j(tb4.y("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = str3;
        this.b = str;
        this.c = tb4.p(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xtb)) {
            return false;
        }
        xtb xtbVar = (xtb) obj;
        return this.a.equals(xtbVar.a) && this.b.equals(xtbVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
