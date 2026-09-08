package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ug0 b;

    public /* synthetic */ wr(org.telegram.ui.Components.ug0 ug0Var, int i10) {
        this.a = i10;
        this.b = ug0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                this.b.b(true);
                break;
            default:
                this.b.b(true);
                break;
        }
    }
}
