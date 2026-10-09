package ze;

import cf.r;
import java.util.Locale;
import java.util.regex.Pattern;
import v7.h0;
import v7.i0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class m extends ef.a {
    public final r a = new r();
    public final i b = new i();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // ef.a
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
                int c11 = i0.c(i11, charSequence.length(), charSequence);
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
                b10 = h0.b(i11, charSequence);
                if (b10 != -1) {
                    iVar.d.append(charSequence, i11, b10);
                    if (b10 >= charSequence.length()) {
                        iVar.d.append('\n');
                        i11 = b10;
                    } else if (charSequence.charAt(b10) == ']' && (i10 = b10 + 1) < charSequence.length() && charSequence.charAt(i10) == ':' && iVar.d.length() <= 999) {
                        String sb3 = iVar.d.toString();
                        Pattern pattern = bf.a.a;
                        String replaceAll = bf.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            iVar.e = replaceAll;
                            iVar.a = 3;
                            i11 = i0.c(b10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i11 = -1;
            } else if (c10 == 2) {
                int c12 = i0.c(i11, charSequence.length(), charSequence);
                int a2 = h0.a(c12, charSequence);
                if (a2 != -1) {
                    iVar.f = charSequence.charAt(c12) == '<' ? charSequence.subSequence(c12 + 1, a2 - 1).toString() : charSequence.subSequence(c12, a2).toString();
                    i11 = i0.c(a2, charSequence.length(), charSequence);
                    if (i11 >= charSequence.length()) {
                        iVar.i = true;
                        sb2.setLength(0);
                    }
                    iVar.a = 4;
                }
                i11 = -1;
            } else if (c10 == 3) {
                i11 = i0.c(i11, charSequence.length(), charSequence);
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
                b10 = h0.d(charSequence, i11, iVar.g);
                if (b10 != -1) {
                    iVar.h.append(charSequence.subSequence(i11, b10));
                    if (b10 >= charSequence.length()) {
                        iVar.h.append('\n');
                        i11 = b10;
                    } else {
                        i11 = i0.c(b10 + 1, charSequence.length(), charSequence);
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

    @Override // ef.a
    public final boolean c() {
        return true;
    }

    @Override // ef.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // ef.a
    public final cf.a e() {
        return this.a;
    }

    @Override // ef.a
    public final void g(df.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // ef.a
    public final q3.h h(d dVar) {
        if (dVar.h) {
            return null;
        }
        return q3.h.a(dVar.b);
    }
}
