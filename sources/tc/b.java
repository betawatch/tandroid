package tc;

import q3.h;
import w7.e8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class b extends xe.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i10) {
        this.c = i10;
    }

    @Override // xe.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // xe.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // xe.a
    public final ve.a e() {
        return this.a;
    }

    @Override // xe.a
    public final h h(se.d dVar) {
        int i10;
        int i11 = dVar.e;
        CharSequence charSequence = dVar.a;
        int length = charSequence.length();
        if (dVar.g < 4) {
            int i12 = i11;
            while (true) {
                if (i12 >= length) {
                    i10 = length - i11;
                    break;
                }
                if ('$' != charSequence.charAt(i12)) {
                    i10 = i12 - i11;
                    break;
                }
                i12++;
            }
            int i13 = this.c;
            if (i10 == i13 && e8.b(' ', charSequence, i11 + i13, length) == length) {
                return new h(-1, -1, true);
            }
        }
        return h.a(dVar.b);
    }
}
