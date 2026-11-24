// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wea extends e69 {
    public final /* synthetic */ pea a;
    public final /* synthetic */ nha b;

    public wea(nha nhaVar, pea peaVar) {
        this.b = nhaVar;
        this.a = peaVar;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        pea peaVar = this.a;
        if (peaVar.h.getAdapter() == this.b.R) {
            int R = RecyclerView.R(view);
            rect.left = 0;
            rect.bottom = 0;
            qea qeaVar = peaVar.x;
            qeaVar.z1();
            if (R <= qeaVar.U) {
                rect.top = 0;
            } else {
                rect.top = gm.L(2.0f);
            }
            rect.right = peaVar.x.C1(R) ? 0 : gm.L(2.0f);
            return;
        }
        if (!(view instanceof sha)) {
            rect.left = 0;
            rect.top = 0;
            rect.bottom = 0;
            rect.right = 0;
            return;
        }
        sha shaVar = (sha) view;
        peaVar.h.getClass();
        int R2 = RecyclerView.R(shaVar);
        int i = peaVar.x.J;
        shaVar.b0 = R2 < i;
        int i2 = R2 % i;
        shaVar.W = i2 == 0;
        shaVar.a0 = i2 == i - 1;
        rect.left = 0;
        rect.top = 0;
        rect.bottom = 0;
        rect.right = 0;
    }
}
