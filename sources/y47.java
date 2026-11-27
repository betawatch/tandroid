// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class y47 extends nic {
    public final /* synthetic */ Context a;
    public final /* synthetic */ s57 b;

    public y47(s57 s57Var, Context context) {
        this.b = s57Var;
        this.a = context;
    }

    @Override // nic
    public final View d(int i) {
        return new m57(this.b, this.a, i);
    }

    @Override // nic
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // nic
    public final int h(int i) {
        return ((p57) this.b.e.a.get(i)).a;
    }
}
