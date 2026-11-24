// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class wca extends c49 {
    public final /* synthetic */ pca a;
    public final /* synthetic */ nfa b;

    public wca(nfa nfaVar, pca pcaVar) {
        this.b = nfaVar;
        this.a = pcaVar;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        pca pcaVar = this.a;
        if (pcaVar.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            qca qcaVar = pcaVar.x;
            qcaVar.z1();
            if (R <= qcaVar.U) {
                rect.top = 0;
            } else {
                rect.top = gl.L(2.0f);
            }
            rect.right = pcaVar.x.C1(R) ? 0 : gl.L(2.0f);
            return;
        }
        if (!(view instanceof qfa)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        qfa qfaVar = (qfa) view;
        pcaVar.h.getClass();
        int R2 = RecyclerView.R(qfaVar);
        int i = pcaVar.x.J;
        qfaVar.b0 = R2 < i;
        int i2 = R2 % i;
        qfaVar.W = i2 == 0;
        qfaVar.a0 = i2 == i - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
