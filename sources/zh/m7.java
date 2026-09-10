package zh;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class m7 extends r {
    public final /* synthetic */ u7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7(Context context, u7 u7Var) {
        super(context);
        this.a = u7Var;
    }

    @Override // zh.r, android.view.View
    public final void invalidate() {
        super.invalidate();
        k2.v vVar = this.a.G0;
        if (vVar != null) {
            vVar.b();
        }
    }
}
