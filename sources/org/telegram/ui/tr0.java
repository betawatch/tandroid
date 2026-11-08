package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tr0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.k60 b;

    public /* synthetic */ tr0(org.telegram.ui.Components.k60 k60Var, int i7) {
        this.a = i7;
        this.b = k60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.cc.e();
                this.b.s();
                break;
            default:
                org.telegram.ui.Components.cc.e();
                this.b.s();
                break;
        }
    }
}
