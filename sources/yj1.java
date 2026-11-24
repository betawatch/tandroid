// default package

import java.util.Iterator;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class yj1 implements Iterable {
    public final char a;
    public final char b;

    static {
        new yj1((char) 1, (char) 0);
    }

    public yj1(char c, char c2) {
        this.a = c;
        this.b = (char) ore.a(c, c2, 1);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yj1)) {
            return false;
        }
        char c = this.a;
        char c2 = this.b;
        if (rp5.b(c, c2) > 0) {
            yj1 yj1Var = (yj1) obj;
            if (rp5.b(yj1Var.a, yj1Var.b) > 0) {
                return true;
            }
        }
        yj1 yj1Var2 = (yj1) obj;
        return c == yj1Var2.a && c2 == yj1Var2.b;
    }

    public final int hashCode() {
        char c = this.a;
        char c2 = this.b;
        if (rp5.b(c, c2) > 0) {
            return -1;
        }
        return (c * 31) + c2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new xj1(this.a, this.b);
    }

    public final String toString() {
        return this.a + ".." + this.b;
    }
}
