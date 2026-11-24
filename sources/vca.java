// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vca extends c49 {
    public final /* synthetic */ pca a;

    public vca(pca pcaVar) {
        this.a = pcaVar;
    }

    @Override // c49
    public final void e(Rect rect, View view, RecyclerView recyclerView, p49 p49Var) {
        if (!(view instanceof qfa)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        qfa qfaVar = (qfa) view;
        pca pcaVar = this.a;
        pcaVar.n.getClass();
        int R = RecyclerView.R(qfaVar);
        int i = pcaVar.r.J;
        qfaVar.b0 = R < i;
        int i2 = R % i;
        qfaVar.W = i2 == 0;
        qfaVar.a0 = i2 == i - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
