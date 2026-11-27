// default package

import java.io.Serializable;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class u89 implements Serializable {
    public final Pattern a;

    public u89(String str) {
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.a = compile;
    }

    public final String toString() {
        String pattern = this.a.toString();
        pattern.getClass();
        return pattern;
    }
}
