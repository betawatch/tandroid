// default package

import android.content.Context;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class xv5 extends d79 {
    public final /* synthetic */ bw5 f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv5(bw5 bw5Var, Context context) {
        super(context, null);
        this.f3 = bw5Var;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View, android.view.ViewParent
    public final void requestLayout() {
        if (this.f3.t1) {
            return;
        }
        super.requestLayout();
    }
}
