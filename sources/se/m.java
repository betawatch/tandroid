package se;

import java.util.Locale;
import java.util.regex.Pattern;
import ve.q;
import w7.d8;
import w7.e8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class m extends xe.a {
    public final q a = new q();
    public final i b = new i();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // xe.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b10;
        int i10;
        i iVar = this.b;
        StringBuilder sb2 = iVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int c10 = m1.j.c(iVar.a);
            if (c10 == 0) {
                int c11 = e8.c(i11, charSequence.length(), charSequence);
                if (c11 < charSequence.length() && charSequence.charAt(c11) == '[') {
                    iVar.a = 2;
                    iVar.d = new StringBuilder();
                    i11 = c11 + 1;
                    if (i11 >= charSequence.length()) {
                        iVar.d.append('\n');
                    }
                }
                i11 = -1;
            } else if (c10 == 1) {
                b10 = d8.b(i11, charSequence);
                if (b10 != -1) {
                    iVar.d.append(charSequence, i11, b10);
                    if (b10 >= charSequence.length()) {
                        iVar.d.append('\n');
                        i11 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i10 = b10 + 1) < charSequence.length() && charSequence.charAt(i10) == ':' && iVar.d.length() <= 999) {
                        String sb3 = iVar.d.toString();
                        Pattern pattern = ue.a.a;
                        String replaceAll = ue.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            iVar.e = replaceAll;
                            iVar.a = 3;
                            i11 = e8.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i11 = -1;
            } else if (c10 == 2) {
                int c12 = e8.c(i11, charSequence.length(), charSequence);
                int a2 = d8.a(c12, charSequence);
                if (a2 != -1) {
                    iVar.f = charSequence.charAt(c12) == '<' ? charSequence.subSequence(c12 + 1, a2 - 1).toString() : charSequence.subSequence(c12, a2).toString();
                    i11 = e8.c(a2, charSequence.length(), charSequence);
                    if (i11 >= charSequence.length()) {
                        iVar.i = true;
                        sb2.setLength(0);
                    }
                    iVar.a = 4;
                }
                i11 = -1;
            } else if (c10 == 3) {
                i11 = e8.c(i11, charSequence.length(), charSequence);
                if (i11 >= charSequence.length()) {
                    iVar.a = 1;
                } else {
                    iVar.g = (char) 0;
                    char charAt = charSequence.charAt(i11);
                    if (charAt == '\"' || charAt == '\'') {
                        iVar.g = charAt;
                    } else if (charAt == '(') {
                        iVar.g = ')';
                    }
                    if (iVar.g != 0) {
                        iVar.a = 5;
                        iVar.h = new StringBuilder();
                        i11++;
                        if (i11 == charSequence.length()) {
                            iVar.h.append('\n');
                        }
                    } else {
                        iVar.a();
                        iVar.a = 1;
                    }
                }
            } else if (c10 == 4) {
                b10 = d8.d(charSequence, i11, iVar.g);
                if (b10 != -1) {
                    iVar.h.append(charSequence.subSequence(i11, b10));
                    if (b10 >= charSequence.length()) {
                        iVar.h.append('\n');
                        i11 = b10;
                    } else {
                        i11 = e8.c(b10 + 1, charSequence.length(), charSequence);
                        if (i11 == charSequence.length()) {
                            iVar.i = true;
                            iVar.a();
                            sb2.setLength(0);
                            iVar.a = 1;
                        }
                    }
                }
                i11 = -1;
            } else if (c10 == 5) {
                return;
            }
            if (i11 == -1) {
                iVar.a = 6;
                return;
            }
        }
    }

    @Override // xe.a
    public final boolean c() {
        return true;
    }

    @Override // xe.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // xe.a
    public final ve.a e() {
        return this.a;
    }

    @Override // xe.a
    public final void g(we.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // xe.a
    public final q3.h h(d dVar) {
        if (dVar.h) {
            return null;
        }
        return q3.h.a(dVar.b);
    }
}
