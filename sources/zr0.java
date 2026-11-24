// default package

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zr0 extends e69 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gs0 b;

    public /* synthetic */ zr0(gs0 gs0Var, byte b) {
        this.a = b;
        this.b = gs0Var;
    }

    @Override // e69
    public final void d(Rect rect, View view, RecyclerView recyclerView, r69 r69Var) {
        byte b = this.a;
        gs0 gs0Var = this.b;
        switch (b) {
            case 0:
                if (!(view instanceof sha)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    sha shaVar = (sha) view;
                    gs0Var.f.getClass();
                    int R = RecyclerView.R(shaVar);
                    int i = gs0Var.h.J;
                    shaVar.b0 = R < i;
                    int i2 = R % i;
                    shaVar.W = i2 == 0;
                    shaVar.a0 = i2 == i - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
            default:
                if (!(view instanceof sha)) {
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                } else {
                    sha shaVar2 = (sha) view;
                    gs0Var.r.getClass();
                    int R2 = RecyclerView.R(shaVar2);
                    int i3 = gs0Var.s.J;
                    shaVar2.b0 = R2 < i3;
                    int i4 = R2 % i3;
                    shaVar2.W = i4 == 0;
                    shaVar2.a0 = i4 == i3 - 1;
                    rect.left = 0;
                    rect.top = 0;
                    rect.bottom = 0;
                    rect.right = 0;
                    break;
                }
        }
    }
}
