package xd;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes.dex */
public abstract class a {
    public static final Charset a;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.i.d(forName, "forName(...)");
        a = forName;
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.i.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
