package org.telegram.ui;

import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sr0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ yr0 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ sr0(yr0 yr0Var, boolean z4, int i10) {
        this.a = i10;
        this.b = yr0Var;
        this.c = z4;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.qc.F(this.b.b.b0, this.c).j();
                break;
            default:
                org.telegram.ui.Components.qc.F(this.b.b.b0, this.c).j();
                break;
        }
    }
}
