// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class u83 extends z51 {
    public final /* synthetic */ v83 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u83(v83 v83Var, Context context, int i, int[] iArr, int[] iArr2) {
        super(context, i, iArr, 1, iArr2);
        this.f0 = v83Var;
    }

    @Override // z51
    public final int b() {
        return jn7.s3;
    }

    @Override // z51
    public final void c(int i, boolean z) {
        int i2;
        x83 x83Var = (x83) this.f0.e;
        if (!z) {
            x83Var.n1();
            return;
        }
        if (i < 0 || i >= x83Var.o3.length) {
            return;
        }
        int i3 = 0;
        while (true) {
            w83[] w83VarArr = x83Var.o3;
            i2 = -1;
            if (i3 >= w83VarArr.length) {
                i3 = -1;
                break;
            } else if (w83VarArr[i3].d == i) {
                break;
            } else {
                i3++;
            }
        }
        int i4 = 0;
        while (true) {
            if (i4 < x83Var.k3.size()) {
                s83 s83Var = (s83) x83Var.k3.get(i4);
                if (s83Var != null && s83Var.a == 2 && s83Var.h == i3) {
                    i2 = i4;
                    break;
                }
                i4++;
            } else {
                break;
            }
        }
        if (i2 >= 0) {
            x83Var.g1(new yd(i2, (byte) 2), 0, true);
        } else {
            x83Var.n1();
        }
    }

    @Override // z51
    public final int d() {
        return 10;
    }
}
