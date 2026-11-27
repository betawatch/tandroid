// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class vq7 {
    public final Object a;
    public int b;
    public final /* synthetic */ wq7 c;

    public vq7(wq7 wq7Var, int i) {
        this.c = wq7Var;
        this.a = wq7Var.a[i];
        this.b = i;
    }

    public final int a() {
        int i = this.b;
        Object obj = this.a;
        wq7 wq7Var = this.c;
        if (i == -1 || i >= wq7Var.c || !tue.a(obj, wq7Var.a[i])) {
            this.b = wq7Var.c(obj);
        }
        int i2 = this.b;
        if (i2 == -1) {
            return 0;
        }
        return wq7Var.b[i2];
    }

    public final boolean equals(Object obj) {
        if (obj instanceof vq7) {
            vq7 vq7Var = (vq7) obj;
            if (a() == vq7Var.a() && tue.a(this.a, vq7Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.a;
        return (obj == null ? 0 : obj.hashCode()) ^ a();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int a = a();
        if (a == 1) {
            return valueOf;
        }
        return valueOf + " x " + a;
    }
}
