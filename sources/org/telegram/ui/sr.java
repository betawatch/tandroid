package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.yf0 b;

    public /* synthetic */ sr(org.telegram.ui.Components.yf0 yf0Var, int i10) {
        this.a = i10;
        this.b = yf0Var;
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
