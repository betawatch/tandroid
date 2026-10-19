package zd;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
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
