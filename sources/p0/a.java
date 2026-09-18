package p0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
