package ye;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class a extends df.a {
    public final bf.b a = new bf.b();

    public static boolean i(d dVar, int i10) {
        CharSequence charSequence = dVar.a;
        return dVar.g < 4 && i10 < charSequence.length() && charSequence.charAt(i10) == '>';
    }

    @Override // df.a
    public final bf.a e() {
        return this.a;
    }

    @Override // df.a
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
