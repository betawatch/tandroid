package zc;

import c8.b1;
import gf.g;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class b extends mf.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i7) {
        this.c = i7;
    }

    @Override // mf.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // mf.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // mf.a
    public final kf.a e() {
        return this.a;
    }

    @Override // mf.a
    public final gf.a h(g gVar) {
        int i7;
        int i10 = gVar.e;
        CharSequence charSequence = gVar.a;
        int length = charSequence.length();
        if (gVar.g < 4) {
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i7 = length - i10;
                    break;
                }
                if ('$' != charSequence.charAt(i11)) {
                    i7 = i11 - i10;
                    break;
                }
                i11++;
            }
            int i12 = this.c;
            if (i7 == i12 && b1.b(' ', i10 + i12, length, charSequence) == length) {
                return new gf.a(-1, -1, true);
            }
        }
        return gf.a.a(gVar.b);
    }
}
