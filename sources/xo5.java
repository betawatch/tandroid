// default package

import j$.util.Objects;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class xo5 extends io5 {
    public wq7 a;
    public boolean b;

    @Override // io5
    public final io5 a(Object obj) {
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
            wq7 wq7Var = this.a;
            wq7 wq7Var2 = new wq7();
            wq7Var2.d(wq7Var.c);
            if (wq7Var.c != 0) {
                i2 = 0;
                while (i2 != -1) {
                    yve.j(i2, wq7Var.c);
                    Object obj2 = wq7Var.a[i2];
                    yve.j(i2, wq7Var.c);
                    wq7Var2.e(wq7Var.b[i2], obj2);
                    i2++;
                    if (i2 >= wq7Var.c) {
                    }
                }
                this.a = wq7Var2;
            }
            i2 = -1;
        }
        this.b = false;
        obj.getClass();
        wq7 wq7Var3 = this.a;
        wq7Var3.e(wq7Var3.b(obj) + i, obj);
    }
}
