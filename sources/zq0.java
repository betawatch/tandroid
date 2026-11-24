// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class zq0 extends c49 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gr0 b;

    public /* synthetic */ zq0(gr0 gr0Var, byte b) {
        this.a = b;
        this.b = gr0Var;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        byte b = this.a;
        gr0 gr0Var = this.b;
        switch (b) {
            case 0:
                if (!(view instanceof qfa)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    qfa qfaVar = (qfa) view;
                    gr0Var.f.getClass();
                    int R = RecyclerView.R(qfaVar);
                    int i = gr0Var.h.J;
                    qfaVar.b0 = R < i;
                    int i2 = R % i;
                    qfaVar.W = i2 == 0;
                    qfaVar.a0 = i2 == i - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof qfa)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    qfa qfaVar2 = (qfa) view;
                    gr0Var.r.getClass();
                    int R2 = RecyclerView.R(qfaVar2);
                    int i3 = gr0Var.s.J;
                    qfaVar2.b0 = R2 < i3;
                    int i4 = R2 % i3;
                    qfaVar2.W = i4 == 0;
                    qfaVar2.a0 = i4 == i3 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
