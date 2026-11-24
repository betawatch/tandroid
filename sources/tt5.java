// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class tt5 extends o39 {
    public final /* synthetic */ xt5 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt5(xt5 xt5Var, Context context) {
        super(context, null);
        this.f3 = xt5Var;
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.t1) {
            return;
        }
        super.requestLayout();
    }
}
