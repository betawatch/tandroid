// default package

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class vw7 extends x1 {
    public final uw7 a = new uw7();
    public final f66 b = new f66();

    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fe, code lost:
    
        if (r3 != r4) goto L55;
     */
    @Override // x1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int b;
        int i;
        f66 f66Var = this.b;
        StringBuilder sb = f66Var.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int i2 = 0;
        while (i2 < charSequence.length()) {
            int F = wi8.F(f66Var.a);
            if (F == 0) {
                int c = ose.c(i2, charSequence.length(), charSequence);
                if (c < charSequence.length() && charSequence.charAt(c) == '[') {
                    f66Var.a = 2;
                    f66Var.d = new StringBuilder();
                    i2 = c + 1;
                    if (i2 >= charSequence.length()) {
                        f66Var.d.append('\n');
                    }
                }
                i2 = -1;
            } else if (F == 1) {
                b = vpe.b(i2, charSequence);
                if (b != -1) {
                    f66Var.d.append(charSequence, i2, b);
                    if (b >= charSequence.length()) {
                        f66Var.d.append('\n');
                        i2 = b;
                    } else if (charSequence.charAt(b) == ']' && (i = b + 1) < charSequence.length() && charSequence.charAt(i) == ':' && f66Var.d.length() <= 999) {
                        String sb2 = f66Var.d.toString();
                        Pattern pattern = j54.a;
                        String replaceAll = j54.c.matcher(sb2.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            f66Var.e = replaceAll;
                            f66Var.a = 3;
                            i2 = ose.c(b + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i2 = -1;
            } else if (F == 2) {
                int c2 = ose.c(i2, charSequence.length(), charSequence);
                int a = vpe.a(c2, charSequence);
                if (a != -1) {
                    f66Var.f = charSequence.charAt(c2) == '<' ? charSequence.subSequence(c2 + 1, a - 1).toString() : charSequence.subSequence(c2, a).toString();
                    i2 = ose.c(a, charSequence.length(), charSequence);
                    if (i2 >= charSequence.length()) {
                        f66Var.i = true;
                        sb.setLength(0);
                    }
                    f66Var.a = 4;
                }
                i2 = -1;
            } else if (F == 3) {
                i2 = ose.c(i2, charSequence.length(), charSequence);
                if (i2 >= charSequence.length()) {
                    f66Var.a = 1;
                } else {
                    f66Var.g = (char) 0;
                    char charAt = charSequence.charAt(i2);
                    if (charAt == '\"' || charAt == '\'') {
                        f66Var.g = charAt;
                    } else if (charAt == '(') {
                        f66Var.g = ')';
                    }
                    if (f66Var.g != 0) {
                        f66Var.a = 5;
                        f66Var.h = new StringBuilder();
                        i2++;
                        if (i2 == charSequence.length()) {
                            f66Var.h.append('\n');
                        }
                    } else {
                        f66Var.a();
                        f66Var.a = 1;
                    }
                }
            } else if (F == 4) {
                b = vpe.d(charSequence, i2, f66Var.g);
                if (b != -1) {
                    f66Var.h.append(charSequence.subSequence(i2, b));
                    if (b >= charSequence.length()) {
                        f66Var.h.append('\n');
                        i2 = b;
                    } else {
                        i2 = ose.c(b + 1, charSequence.length(), charSequence);
                        if (i2 == charSequence.length()) {
                            f66Var.i = true;
                            f66Var.a();
                            sb.setLength(0);
                            f66Var.a = 1;
                        }
                    }
                }
                i2 = -1;
            } else if (F == 5) {
                return;
            }
            if (i2 == -1) {
                f66Var.a = 6;
                return;
            }
        }
    }

    @Override // x1
    public final boolean c() {
        return true;
    }

    @Override // x1
    public final void d() {
        if (this.b.b.length() == 0) {
            this.a.g();
        }
    }

    @Override // x1
    public final gl0 e() {
        return this.a;
    }

    @Override // x1
    public final void g(qp5 qp5Var) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            qp5Var.a(sb.toString(), this.a);
        }
    }

    @Override // x1
    public final il2 h(fq3 fq3Var) {
        if (fq3Var.h) {
            return null;
        }
        return il2.a(fq3Var.b);
    }
}
