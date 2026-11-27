// default package

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class uh7 extends iu5 {
    public final long e;
    public final ArrayList f;
    public final ArrayList g;

    public uh7(int i, long j) {
        super(i, (byte) 1);
        this.e = j;
        this.f = new ArrayList();
        this.g = new ArrayList();
    }

    @Override // iu5
    public final String toString() {
        return iu5.e(this.b) + " leaves: " + Arrays.toString(this.f.toArray()) + " containers: " + Arrays.toString(this.g.toArray());
    }

    public final uh7 u(int i) {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            uh7 uh7Var = (uh7) arrayList.get(i2);
            if (uh7Var.b == i) {
                return uh7Var;
            }
        }
        return null;
    }

    public final vh7 v(int i) {
        ArrayList arrayList = this.f;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            vh7 vh7Var = (vh7) arrayList.get(i2);
            if (vh7Var.b == i) {
                return vh7Var;
            }
        }
        return null;
    }
}
