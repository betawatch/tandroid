// default package

import j$.util.Objects;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class um5 extends fm5 {
    public wn7 a;
    public boolean b;

    @Override // fm5
    public final fm5 a(Object obj) {
        c(1, obj);
        return this;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x001f, code lost:
    
        r3 = -1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(int i, Object obj) {
        int i2;
        Objects.requireNonNull(this.a);
        if (i == 0) {
            return;
        }
        if (this.b) {
            wn7 wn7Var = this.a;
            wn7 wn7Var2 = new wn7();
            wn7Var2.d(wn7Var.c);
            if (wn7Var.c != 0) {
                i2 = 0;
                while (i2 != -1) {
                    gre.j(i2, wn7Var.c);
                    Object obj2 = wn7Var.a[i2];
                    gre.j(i2, wn7Var.c);
                    wn7Var2.e(wn7Var.b[i2], obj2);
                    i2++;
                    if (i2 >= wn7Var.c) {
                    }
                }
                this.a = wn7Var2;
            }
            i2 = -1;
        }
        this.b = false;
        obj.getClass();
        wn7 wn7Var3 = this.a;
        wn7Var3.e(wn7Var3.b(obj) + i, obj);
    }
}
