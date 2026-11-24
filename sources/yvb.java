// default package

import android.util.Log;
import j$.util.Objects;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class yvb {
    public static final Pattern d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String a;
    public final String b;
    public final String c;

    public yvb(String str, String str2) {
        String str3;
        if (str2 == null || !str2.startsWith("/topics/")) {
            str3 = str2;
        } else {
            Log.w("FirebaseMessaging", "Format /topics/topic-name is deprecated. Only 'topic-name' should be used in " + str + ".");
            str3 = str2.substring(8);
        }
        if (str3 == null || !d.matcher(str3).matches()) {
            u36.j(kt6.o("Invalid topic name: ", str3, " does not match the allowed format [a-zA-Z0-9-_.~%]{1,900}."));
            throw null;
        }
        this.a = str3;
        this.b = str;
        this.c = td4.q(str, "!", str2);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yvb)) {
            return false;
        }
        yvb yvbVar = (yvb) obj;
        return this.a.equals(yvbVar.a) && this.b.equals(yvbVar.b);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.a);
    }
}
