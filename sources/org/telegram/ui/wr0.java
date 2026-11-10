package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class wr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.k60 b;

    public /* synthetic */ wr0(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.a = i7;
        this.b = k60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.bc.e();
                this.b.s();
                break;
            default:
                org.telegram.ui.Components.bc.e();
                this.b.s();
                break;
        }
    }
}
