// default package

import java.util.List;
import java.util.RandomAccess;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class x2 extends y2 implements RandomAccess {
    public final y2 a;
    public final int b;
    public final int c;

    public x2(y2 y2Var, int i, int i2) {
        this.a = y2Var;
        this.b = i;
        zkd.a(i, i2, y2Var.h());
        this.c = i2 - i;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            k93.i(b00.g(i, i2, "index: ", ", size: "));
            return null;
        }
        return this.a.get(this.b + i);
    }

    @Override // y2
    public final int h() {
        return this.c;
    }

    @Override // y2, java.util.List
    public final List subList(int i, int i2) {
        zkd.a(i, i2, this.c);
        int i3 = this.b;
        return new x2(this.a, i + i3, i3 + i2);
    }
}
