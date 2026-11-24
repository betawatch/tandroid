// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vea extends e69 {
    public final /* synthetic */ pea a;

    public vea(pea peaVar) {
        this.a = peaVar;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        if (!(view instanceof sha)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        sha shaVar = (sha) view;
        pea peaVar = this.a;
        peaVar.n.getClass();
        int R = RecyclerView.R(shaVar);
        int i = peaVar.r.J;
        shaVar.b0 = R < i;
        int i2 = R % i;
        shaVar.W = i2 == 0;
        shaVar.a0 = i2 == i - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
