package ye;

import t7.s;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class e extends df.a {
    public final bf.h a;
    public String b;
    public final StringBuilder c;

    public e(char c10, int i10, int i11) {
        bf.h hVar = new bf.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c10;
        hVar.h = i10;
        hVar.i = i11;
    }

    @Override // df.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // df.a
    public final void d() {
        String a2 = af.a.a(this.b.trim());
        bf.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // df.a
    public final bf.a e() {
        return this.a;
    }

    @Override // df.a
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.b;
        CharSequence charSequence = dVar.a;
        int i12 = dVar.g;
        bf.h hVar = this.a;
        if (i12 < 4) {
            char c10 = hVar.g;
            int i13 = hVar.h;
            int b10 = s.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && s.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
                return new q3.h(-1, -1, true);
            }
        }
        int length = charSequence.length();
        for (int i14 = hVar.i; i14 > 0 && i11 < length && charSequence.charAt(i11) == ' '; i14--) {
            i11++;
        }
        return q3.h.a(i11);
    }
}
