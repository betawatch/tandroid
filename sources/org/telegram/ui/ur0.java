package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class ur0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.y60 b;

    public /* synthetic */ ur0(org.telegram.ui.Components.y60 y60Var, int i7) {
        this.a = i7;
        this.b = y60Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.gc.e();
                this.b.s();
                break;
            default:
                org.telegram.ui.Components.gc.e();
                this.b.s();
                break;
        }
    }
}
