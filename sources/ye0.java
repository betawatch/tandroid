// default package

import java.util.regex.Pattern;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class ye0 extends tp5 {
    public static final Pattern e = el6.m;

    @Override // tp5
    public final ui6 b() {
        int i = this.d + 1;
        this.d = i;
        el6 el6Var = this.a;
        el6Var.g = i;
        if (el6Var.d() == '\n') {
            f34 f34Var = new f34((byte) 1);
            this.d++;
            return f34Var;
        }
        if (this.d < this.c.length()) {
            String str = this.c;
            int i2 = this.d;
            if (e.matcher(str.substring(i2, i2 + 1)).matches()) {
                String str2 = this.c;
                int i3 = this.d;
                this.a.getClass();
                vib vibVar = new vib(str2.substring(i3, i3 + 1));
                this.d++;
                return vibVar;
            }
        }
        return e("\\");
    }

    @Override // tp5
    public final char c() {
        return '\\';
    }
}
