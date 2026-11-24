// default package

import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class uu7 extends x1 {
    public final tu7 a = new tu7();
    public final f46 b = new f46();

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
        f46 f46Var = this.b;
        StringBuilder sb = f46Var.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int i2 = 0;
        while (i2 < charSequence.length()) {
            int F = ug8.F(f46Var.a);
            if (F == 0) {
                int c = lqe.c(i2, charSequence.length(), charSequence);
                if (c < charSequence.length() && charSequence.charAt(c) == '[') {
                    f46Var.a = 2;
                    f46Var.d = new StringBuilder();
                    i2 = c + 1;
                    if (i2 >= charSequence.length()) {
                        f46Var.d.append('\n');
                    }
                }
                i2 = -1;
            } else if (F == 1) {
                b = sne.b(i2, charSequence);
                if (b != -1) {
                    f46Var.d.append(charSequence, i2, b);
                    if (b >= charSequence.length()) {
                        f46Var.d.append('\n');
                        i2 = b;
                    } else if (charSequence.charAt(b) == ']' && (i = b + 1) < charSequence.length() && charSequence.charAt(i) == ':' && f46Var.d.length() <= 999) {
                        String sb2 = f46Var.d.toString();
                        Pattern pattern = z34.a;
                        String replaceAll = z34.c.matcher(sb2.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                        if (!replaceAll.isEmpty()) {
                            f46Var.e = replaceAll;
                            f46Var.a = 3;
                            i2 = lqe.c(b + 2, charSequence.length(), charSequence);
                        }
                    }
                }
                i2 = -1;
            } else if (F == 2) {
                int c2 = lqe.c(i2, charSequence.length(), charSequence);
                int a = sne.a(c2, charSequence);
                if (a != -1) {
                    f46Var.f = charSequence.charAt(c2) == '<' ? charSequence.subSequence(c2 + 1, a - 1).toString() : charSequence.subSequence(c2, a).toString();
                    i2 = lqe.c(a, charSequence.length(), charSequence);
                    if (i2 >= charSequence.length()) {
                        f46Var.i = true;
                        sb.setLength(0);
                    }
                    f46Var.a = 4;
                }
                i2 = -1;
            } else if (F == 3) {
                i2 = lqe.c(i2, charSequence.length(), charSequence);
                if (i2 >= charSequence.length()) {
                    f46Var.a = 1;
                } else {
                    f46Var.g = (char) 0;
                    char charAt = charSequence.charAt(i2);
                    if (charAt == '\"' || charAt == '\'') {
                        f46Var.g = charAt;
                    } else if (charAt == '(') {
                        f46Var.g = ')';
                    }
                    if (f46Var.g != 0) {
                        f46Var.a = 5;
                        f46Var.h = new StringBuilder();
                        i2++;
                        if (i2 == charSequence.length()) {
                            f46Var.h.append('\n');
                        }
                    } else {
                        f46Var.a();
                        f46Var.a = 1;
                    }
                }
            } else if (F == 4) {
                b = sne.d(charSequence, i2, f46Var.g);
                if (b != -1) {
                    f46Var.h.append(charSequence.subSequence(i2, b));
                    if (b >= charSequence.length()) {
                        f46Var.h.append('\n');
                        i2 = b;
                    } else {
                        i2 = lqe.c(b + 1, charSequence.length(), charSequence);
                        if (i2 == charSequence.length()) {
                            f46Var.i = true;
                            f46Var.a();
                            sb.setLength(0);
                            f46Var.a = 1;
                        }
                    }
                }
                i2 = -1;
            } else if (F == 5) {
                return;
            }
            if (i2 == -1) {
                f46Var.a = 6;
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
    public final gk0 e() {
        return this.a;
    }

    @Override // x1
    public final void g(qn5 qn5Var) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            qn5Var.a(sb.toString(), this.a);
        }
    }

    @Override // x1
    public final vj2 h(vo3 vo3Var) {
        if (vo3Var.h) {
            return null;
        }
        return vj2.a(vo3Var.b);
    }
}
