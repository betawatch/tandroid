// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
