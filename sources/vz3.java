// default package

import android.os.Bundle;
import android.util.SparseIntArray;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vz3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e34 b;

    public /* synthetic */ vz3(e34 e34Var, byte b) {
        this.a = b;
        this.b = e34Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        e34 e34Var = this.b;
        switch (b) {
            case 0:
                e34Var.Y(false);
                e34Var.B();
                break;
            case 1:
                o14 o14Var = e34Var.S;
                if (o14Var != null) {
                    o14Var.F(true);
                    break;
                }
                break;
            case 2:
                f24 f24Var = e34Var.u1;
                if (f24Var != null) {
                    f24Var.s(e34Var.S.h);
                    break;
                }
                break;
            case 3:
                f24 f24Var2 = e34Var.u1;
                if (f24Var2 != null) {
                    f24Var2.p();
                    break;
                }
                break;
            case 4:
                e34Var.getClass();
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", z8c.h(e34Var.d1).e());
                e34Var.Z1.presentFragment(new d14(bundle));
                break;
            default:
                ArrayList<s14> emojipacks = e34Var.getEmojipacks();
                for (int i = 0; i < emojipacks.size(); i++) {
                    if (emojipacks.get(i).i) {
                        SparseIntArray sparseIntArray = e34Var.S.s;
                        char[] cArr = zx3.a;
                        int i2 = sparseIntArray.get(i + 8);
                        e34Var.Q.D0();
                        e34Var.U(i2);
                        e34Var.E(i2, gm.L(-9.0f));
                        e34Var.j(0, null);
                    }
                }
                break;
        }
    }
}
