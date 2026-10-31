package se;

import w7.e8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e extends xe.a {
    public final ve.h a;
    public String b;
    public final StringBuilder c;

    public e(char c10, int i10, int i11) {
        ve.h hVar = new ve.h();
        this.a = hVar;
        this.c = new StringBuilder();
        hVar.g = c10;
        hVar.h = i10;
        hVar.i = i11;
    }

    @Override // xe.a
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb2 = this.c;
        sb2.append(charSequence);
        sb2.append('\n');
    }

    @Override // xe.a
    public final void d() {
        String a2 = ue.a.a(this.b.trim());
        ve.h hVar = this.a;
        hVar.j = a2;
        hVar.k = this.c.toString();
    }

    @Override // xe.a
    public final ve.a e() {
        return this.a;
    }

    @Override // xe.a
    public final q3.h h(d dVar) {
        int i10 = dVar.e;
        int i11 = dVar.b;
        CharSequence charSequence = dVar.a;
        int i12 = dVar.g;
        ve.h hVar = this.a;
        if (i12 < 4) {
            char c10 = hVar.g;
            int i13 = hVar.h;
            int b10 = e8.b(c10, charSequence, i10, charSequence.length()) - i10;
            if (b10 >= i13 && e8.c(i10 + b10, charSequence.length(), charSequence) == charSequence.length()) {
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
