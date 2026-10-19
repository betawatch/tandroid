package org.telegram.ui;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class r9 extends w9 {
    public final /* synthetic */ s9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(s9 s9Var, int i10) {
        super(i10);
        this.g0 = s9Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void finishFragment() {
        setFinishing(true);
        this.g0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void removeSelfFromStack() {
        this.g0.dismiss();
    }
}
