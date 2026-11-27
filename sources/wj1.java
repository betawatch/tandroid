// default package

import java.util.Arrays;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class wj1 {
    public final /* synthetic */ byte a;
    public char[] b;
    public int c;

    public final void a(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = this.b;
        if (cArr.length <= i3) {
            int i4 = i << 1;
            if (i3 < i4) {
                i3 = i4;
            }
            this.b = Arrays.copyOf(cArr, i3);
        }
    }

    public final void b() {
        vj1 vj1Var = vj1.c;
        char[] cArr = this.b;
        vj1Var.getClass();
        cArr.getClass();
        synchronized (vj1Var) {
            int i = vj1Var.b;
            if (cArr.length + i < rs.a) {
                vj1Var.b = i + cArr.length;
                vj1Var.a.addLast(cArr);
            }
        }
    }

    public final void c(String str) {
        str.getClass();
        int length = str.length();
        if (length == 0) {
            return;
        }
        a(this.c, length);
        str.getChars(0, str.length(), this.b, this.c);
        this.c += length;
    }

    public final String toString() {
        switch (this.a) {
        }
        return new String(this.b, 0, this.c);
    }
}
