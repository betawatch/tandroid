// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes3.dex */
public final class xv3 extends nic {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ zw3 c;

    public xv3(zw3 zw3Var, boolean z, Context context) {
        this.c = zw3Var;
        this.a = z;
        this.b = context;
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
        iw3 iw3Var = (iw3) view;
        if (this.a) {
            i = 1;
        }
        iw3Var.a(i);
    }

    @Override // nic
    public final View d(int i) {
        Context context = this.b;
        zw3 zw3Var = this.c;
        return i == 1 ? new hw3(zw3Var, context) : new ow3(zw3Var, context);
    }

    @Override // nic
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // nic
    public final int h(int i) {
        return (i == 0 || i == 1) ? 0 : 1;
    }
}
