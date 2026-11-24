// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class oz9 extends o39 implements n2b {
    public final /* synthetic */ g0a f3;
    public final /* synthetic */ g0a g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz9(g0a g0aVar, Context context, f53 f53Var) {
        super(context, f53Var);
        this.g3 = g0aVar;
        this.f3 = g0aVar;
    }

    @Override // n2b
    public final void b(int[] iArr) {
        iArr[0] = gl.L(this.f3.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // o39, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i, int i2) {
        this.g3.n = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
    }
}
