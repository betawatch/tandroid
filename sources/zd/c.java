package zd;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final class c implements Serializable {
    public final Pattern a;

    public c() {
        Pattern compile = Pattern.compile("^[a-zA-Z0-9/_]{1,100}$");
        kotlin.jvm.internal.i.d(compile, "compile(...)");
        this.a = compile;
    }

    public final String toString() {
        String pattern = this.a.toString();
        kotlin.jvm.internal.i.d(pattern, "toString(...)");
        return pattern;
    }
}
