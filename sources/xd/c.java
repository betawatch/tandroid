package xd;

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public final class c implements Serializable {
    public final Pattern a;

    public c(String str) {
        Pattern compile = Pattern.compile(str);
        kotlin.jvm.internal.j.d(compile, "compile(...)");
        this.a = compile;
    }

    public final String toString() {
        String pattern = this.a.toString();
        kotlin.jvm.internal.j.d(pattern, "toString(...)");
        return pattern;
    }
}
