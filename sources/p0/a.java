package p0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i9 = 0; i9 < 1792; i9++) {
            e[i9] = Character.getDirectionality(i9);
        }
    }

    public a(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        int i9 = this.c - 1;
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(i9);
        this.d = charAt;
        if (Character.isLowSurrogate(charAt)) {
            int codePointBefore = Character.codePointBefore(charSequence, this.c);
            this.c -= Character.charCount(codePointBefore);
            return Character.getDirectionality(codePointBefore);
        }
        this.c--;
        char c10 = this.d;
        return c10 < 1792 ? e[c10] : Character.getDirectionality(c10);
    }
}
