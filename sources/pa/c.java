package pa;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class c {
    public static final c d = new c("", "", false);
    public final String a;
    public final String b;
    public final boolean c;

    static {
        new c("\n", "  ", true);
    }

    public c(String str, String str2, boolean z4) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.a = str;
        this.b = str2;
        this.c = z4;
    }
}
