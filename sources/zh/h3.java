package zh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.vl0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class h3 extends vl0 implements q5 {
    public final /* synthetic */ z3 X2;
    public final /* synthetic */ z3 Y2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(z3 z3Var, Context context, b bVar) {
        super(context, bVar);
        this.Y2 = z3Var;
        this.X2 = z3Var;
    }

    @Override // zh.q5
    public final void a(int[] iArr) {
        iArr[0] = AndroidUtilities.dp(this.X2.e);
        iArr[1] = getMeasuredHeight();
    }

    @Override // org.telegram.ui.Components.vl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int i10, int i11) {
        this.Y2.n = View.MeasureSpec.getSize(i11);
        super.onMeasure(i10, i11);
    }
}
