package ye;

import bf.r;
import java.util.Locale;
import java.util.regex.Pattern;
import t7.s;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes.dex */
public final class m extends df.a {
    public final r a = new r();
    public final i b = new i();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x0105, code lost:
    
        if (r4 == r5) goto L21;
     */
    @Override // df.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int c10;
        int i10;
        i iVar = this.b;
        StringBuilder sb2 = iVar.b;
        if (sb2.length() != 0) {
            sb2.append('\n');
        }
        sb2.append(charSequence);
        int i11 = 0;
        while (i11 < charSequence.length()) {
            int c11 = m1.j.c(iVar.a);
            if (c11 == 0) {
                int c12 = s.c(i11, charSequence.length(), charSequence);
                if (c12 < charSequence.length() && charSequence.charAt(c12) == '[') {
                    iVar.a = 2;
                    iVar.d = new StringBuilder();
                    i11 = c12 + 1;
                    if (i11 >= charSequence.length()) {
                        iVar.d.append('\n');
                    }
                }
                i11 = -1;
            } else if (c11 == 1) {
                c10 = se.b.c(i11, charSequence);
                if (c10 != -1) {
                    iVar.d.append(charSequence, i11, c10);
                    if (c10 >= charSequence.length()) {
                        iVar.d.append('\n');
                        i11 = c10;
                    } else if (charSequence.charAt(c10) == ']' && (i10 = c10 + 1) < charSequence.length() && charSequence.charAt(i10) == ':' && iVar.d.length() <= 999) {
                        String sb3 = iVar.d.toString();
                        Pattern pattern = af.a.a;
                        String replaceAll = af.a.c.matcher(sb3.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            iVar.e = replaceAll;
                            iVar.a = 3;
                            i11 = s.c(c10 + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i11 = -1;
            } else if (c11 == 2) {
                int c13 = s.c(i11, charSequence.length(), charSequence);
                int b10 = se.b.b(c13, charSequence);
                if (b10 != -1) {
                    iVar.f = charSequence.charAt(c13) == '<' ? charSequence.subSequence(c13 + 1, b10 - 1).toString() : charSequence.subSequence(c13, b10).toString();
                    i11 = s.c(b10, charSequence.length(), charSequence);
                    if (i11 >= charSequence.length()) {
                        iVar.i = true;
                        sb2.setLength(0);
                    }
                    iVar.a = 4;
                }
                i11 = -1;
            } else if (c11 == 3) {
                i11 = s.c(i11, charSequence.length(), charSequence);
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
            } else if (c11 == 4) {
                c10 = se.b.e(charSequence, i11, iVar.g);
                if (c10 != -1) {
                    iVar.h.append(charSequence.subSequence(i11, c10));
                    if (c10 >= charSequence.length()) {
                        iVar.h.append('\n');
                        i11 = c10;
                    } else {
                        i11 = s.c(c10 + 1, charSequence.length(), charSequence);
                        if (i11 == charSequence.length()) {
                            iVar.i = true;
                            iVar.a();
                            sb2.setLength(0);
                            iVar.a = 1;
                        }
                    }
                }
                i11 = -1;
            } else if (c11 == 5) {
                return;
            }
            if (i11 == -1) {
                iVar.a = 6;
                return;
            }
        }
    }

    @Override // df.a
    public final boolean c() {
        return true;
    }

    @Override // df.a
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // df.a
    public final bf.a e() {
        return this.a;
    }

    @Override // df.a
    public final void g(cf.a aVar) {
        StringBuilder sb2 = this.b.b;
        if (sb2.length() > 0) {
            aVar.a(sb2.toString(), this.a);
        }
    }

    @Override // df.a
    public final q3.h h(d dVar) {
        if (dVar.h) {
            return null;
        }
        return q3.h.a(dVar.b);
    }
}
