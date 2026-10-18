package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.i80 b;

    public /* synthetic */ zg(org.telegram.ui.Components.i80 i80Var, int i10) {
        this.a = i10;
        this.b = i80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.i80 i80Var = this.b;
        switch (i10) {
            case 0:
                i80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                i80Var.s();
                break;
        }
    }
}
