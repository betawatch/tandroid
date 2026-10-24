package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class yg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.j80 b;

    public /* synthetic */ yg(org.telegram.ui.Components.j80 j80Var, int i10) {
        this.a = i10;
        this.b = j80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.j80 j80Var = this.b;
        switch (i10) {
            case 0:
                j80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                j80Var.s();
                break;
        }
    }
}
