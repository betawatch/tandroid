// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class pr4 extends View {
    public int a;
    public final /* synthetic */ sr4 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr4(sr4 sr4Var, Context context) {
        super(context);
        this.b = sr4Var;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        sr4 sr4Var = this.b;
        ar0 ar0Var = sr4Var.e;
        ArrayList arrayList = sr4Var.c0;
        int size = View.MeasureSpec.getSize(i);
        int i4 = this.a;
        if (i4 != -1) {
            setMeasuredDimension(size, i4);
            return;
        }
        if (sr4Var.f0 == sr4.k0) {
            i3 = arrayList.size();
        } else {
            ArrayList arrayList2 = sr4Var.g0;
            if (arrayList2 != null) {
                i3 = (sr4Var.e0 ? arrayList.size() : 0) + arrayList2.size() + (sr4Var.d0 ? 1 : 0);
            } else {
                i3 = 0;
            }
        }
        setMeasuredDimension(size, Math.max(0, (gl.q.y - gl.L(62.0f)) - (((int) (((int) (size / ar0Var.J)) * sr4Var.P)) * ((int) Math.ceil(i3 / ar0Var.J)))));
    }
}
