package p0;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public static final byte[] e = new byte[1792];
    public final CharSequence a;
    public final int b;
    public int c;
    public char d;

    static {
        for (int i10 = 0; i10 < 1792; i10++) {
            e[i10] = Character.getDirectionality(i10);
        }
    }

    public a(CharSequence charSequence) {
        this.a = charSequence;
        this.b = charSequence.length();
    }

    public final byte a() {
        int i10 = this.c - 1;
        CharSequence charSequence = this.a;
        char charAt = charSequence.charAt(i10);
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
