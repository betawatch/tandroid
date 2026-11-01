package se;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public final class a extends xe.a {
    public final ve.b a = new ve.b();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.a;
        return dVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // xe.a
    public final ve.a e() {
        return this.a;
    }

    @Override // xe.a
    public final q3.h h(d dVar) {
        char charAt;
        int i10 = dVar.e;
        if (!i(dVar, i10)) {
            return null;
        }
        int i11 = dVar.c + dVar.g;
        int i12 = i11 + 1;
        CharSequence charSequence = dVar.a;
        int i13 = i10 + 1;
        if (i13 < charSequence.length() && ((charAt = charSequence.charAt(i13)) == '\t' || charAt == ' ')) {
            i12 = i11 + 2;
        }
        return new q3.h(-1, i12, false);
    }
}
