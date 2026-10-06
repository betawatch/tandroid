package xd;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
