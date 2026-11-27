// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class zq0 extends p79 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gr0 b;

    public /* synthetic */ zq0(gr0 gr0Var, byte b) {
        this.a = b;
        this.b = gr0Var;
    }

    @Override // p79
    public final void d(Rect rect, View view, RecyclerView recyclerView, c89 c89Var) {
        byte b = this.a;
        gr0 gr0Var = this.b;
        switch (b) {
            case 0:
                if (!(view instanceof jja)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    jja jjaVar = (jja) view;
                    gr0Var.f.getClass();
                    int S = RecyclerView.S(jjaVar);
                    int i = gr0Var.h.J;
                    jjaVar.b0 = S < i;
                    int i2 = S % i;
                    jjaVar.W = i2 == 0;
                    jjaVar.a0 = i2 == i - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof jja)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    jja jjaVar2 = (jja) view;
                    gr0Var.r.getClass();
                    int S2 = RecyclerView.S(jjaVar2);
                    int i3 = gr0Var.s.J;
                    jjaVar2.b0 = S2 < i3;
                    int i4 = S2 % i3;
                    jjaVar2.W = i4 == 0;
                    jjaVar2.a0 = i4 == i3 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
