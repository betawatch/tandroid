package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rr implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.ch0 b;

    public /* synthetic */ rr(org.telegram.ui.Components.ch0 ch0Var, int i10) {
        this.a = i10;
        this.b = ch0Var;
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
