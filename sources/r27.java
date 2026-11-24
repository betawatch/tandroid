// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
