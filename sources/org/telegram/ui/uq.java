package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class uq implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.if0 b;

    public /* synthetic */ uq(org.telegram.ui.Components.if0 if0Var, int i7) {
        this.a = i7;
        this.b = if0Var;
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
