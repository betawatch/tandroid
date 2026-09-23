package xd;

import java.nio.charset.Charset;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
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
