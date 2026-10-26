package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.k80 b;

    public /* synthetic */ zg(org.telegram.ui.Components.k80 k80Var, int i10) {
        this.a = i10;
        this.b = k80Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.a;
        org.telegram.ui.Components.k80 k80Var = this.b;
        switch (i10) {
            case 0:
                k80Var.s();
                break;
            default:
                Drawable[] drawableArr = PhotoViewer.U8;
                k80Var.s();
                break;
        }
    }
}
