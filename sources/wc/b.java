package wc;

import b8.ec;
import df.g;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class b extends jf.a {
    public final a a = new a();
    public final StringBuilder b = new StringBuilder();
    public final int c;

    public b(int i3) {
        this.c = i3;
    }

    @Override // jf.a
    public final void a(CharSequence charSequence) {
        StringBuilder sb2 = this.b;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // jf.a
    public final void d() {
        this.a.g = this.b.toString();
    }

    @Override // jf.a
    public final gf.a e() {
        return this.a;
    }

    @Override // jf.a
    public final df.a h(g gVar) {
        int i3;
        int i10 = gVar.e;
        CharSequence charSequence = gVar.a;
        int length = charSequence.length();
        if (gVar.g < 4) {
            int i11 = i10;
            while (true) {
                if (i11 >= length) {
                    i3 = length - i10;
                    break;
                }
                if ('$' != charSequence.charAt(i11)) {
                    i3 = i11 - i10;
                    break;
                }
                i11++;
            }
            int i12 = this.c;
            if (i3 == i12 && ec.b(' ', i10 + i12, length, charSequence) == length) {
                return new df.a(-1, -1, true);
            }
        }
        return df.a.a(gVar.b);
    }
}
