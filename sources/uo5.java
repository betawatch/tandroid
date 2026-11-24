// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class uo5 extends fo5 {
    public zp7 a;
    public boolean b;

    @Override // fo5
    public final fo5 a(Object obj) {
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
            zp7 zp7Var = this.a;
            zp7 zp7Var2 = new zp7();
            zp7Var2.d(zp7Var.c);
            if (zp7Var.c != 0) {
                i2 = 0;
                while (i2 != -1) {
                    jte.j(i2, zp7Var.c);
                    Object obj2 = zp7Var.a[i2];
                    jte.j(i2, zp7Var.c);
                    zp7Var2.e(zp7Var.b[i2], obj2);
                    i2++;
                    if (i2 >= zp7Var.c) {
                    }
                }
                this.a = zp7Var2;
            }
            i2 = -1;
        }
        this.b = false;
        obj.getClass();
        zp7 zp7Var3 = this.a;
        zp7Var3.e(zp7Var3.b(obj) + i, obj);
    }
}
