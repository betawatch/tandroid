// default package

import android.util.SparseArray;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class t61 {
    public long a;
    public int b;
    public long c;
    public final SparseArray d = new SparseArray();

    public t61(long j) {
        this.a = j;
    }

    public final void a(c71 c71Var, int i) {
        SparseArray sparseArray = this.d;
        u61 u61Var = (u61) sparseArray.get(i, null);
        if (u61Var == null) {
            u61Var = new u61();
            sparseArray.put(i, u61Var);
        }
        long j = c71Var.c;
        u61Var.a += j;
        this.c += j;
        this.b++;
        u61Var.b.add(c71Var);
    }

    public final void b(c71 c71Var) {
        u61 u61Var = (u61) this.d.get(c71Var.d, null);
        if (u61Var == null || !u61Var.b.remove(c71Var)) {
            return;
        }
        long j = u61Var.a;
        long j2 = c71Var.c;
        u61Var.a = j - j2;
        this.c -= j2;
        this.b--;
    }
}
