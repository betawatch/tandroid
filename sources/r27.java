// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class r27 extends oec {
    public final /* synthetic */ Context a;
    public final /* synthetic */ l37 b;

    public r27(l37 l37Var, Context context) {
        this.b = l37Var;
        this.a = context;
    }

    @Override // oec
    public final View d(int i) {
        return new f37(this.b, this.a, i);
    }

    @Override // oec
    public final int e() {
        return this.b.e.a.size();
    }

    @Override // oec
    public final int h(int i) {
        return ((i37) this.b.e.a.get(i)).a;
    }
}
