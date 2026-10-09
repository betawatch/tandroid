package ze;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a extends ef.a {
    public final cf.b a = new cf.b();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.a;
        return dVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // ef.a
    public final cf.a e() {
        return this.a;
    }

    @Override // ef.a
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
