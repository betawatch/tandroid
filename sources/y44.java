// default package

import android.content.Context;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class y44 implements tw8 {
    public final /* synthetic */ byte a;
    public final aj3 b;

    public /* synthetic */ y44(aj3 aj3Var, byte b) {
        this.a = b;
        this.b = aj3Var;
    }

    @Override // uw8
    public final Object get() {
        byte b = this.a;
        aj3 aj3Var = this.b;
        switch (b) {
            case 0:
                return new x44((vw8) aj3Var.b);
            default:
                return new ab6((Context) aj3Var.b);
        }
    }
}
