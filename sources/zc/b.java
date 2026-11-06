package zc;

import c8.x0;
import gf.h;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
    public final gf.a h(h hVar) {
        int i7;
        int i10 = hVar.e;
        CharSequence charSequence = hVar.a;
        int length = charSequence.length();
        if (hVar.g < 4) {
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
            if (i7 == i12 && x0.b(' ', i10 + i12, length, charSequence) == length) {
                return new gf.a(-1, -1, true);
            }
        }
        return gf.a.a(hVar.b);
    }
}
