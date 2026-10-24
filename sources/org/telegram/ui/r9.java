package org.telegram.ui;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r9 extends w9 {
    public final /* synthetic */ s9 g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(s9 s9Var, int i10) {
        super(i10);
        this.g0 = s9Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        setFinishing(true);
        this.g0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void removeSelfFromStack() {
        this.g0.dismiss();
    }
}
