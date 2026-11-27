// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class ys0 extends nic {
    public final zs0[] a = new zs0[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ h79 c;
    public final /* synthetic */ at0 d;

    public ys0(at0 at0Var, Context context, h79 h79Var) {
        this.d = at0Var;
        this.b = context;
        this.c = h79Var;
    }

    @Override // nic
    public final void b(View view, int i, int i2) {
        this.c.M(view);
    }

    @Override // nic
    public final View d(int i) {
        zs0[] zs0VarArr = this.a;
        if (zs0VarArr[i] == null) {
            zs0VarArr[i] = new zs0(this.d, this.b, i);
        }
        return zs0VarArr[i];
    }

    @Override // nic
    public final int e() {
        return this.a.length;
    }

    @Override // nic
    public final CharSequence g(int i) {
        return ob6.M0(i == 1 ? 2131744576 : i == 2 ? 2131744575 : 2131744577, null);
    }

    @Override // nic
    public final int h(int i) {
        return i;
    }
}
