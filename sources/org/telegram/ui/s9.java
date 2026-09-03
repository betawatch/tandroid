package org.telegram.ui;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s9 extends x9 {
    public final /* synthetic */ t9 c0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(t9 t9Var, int i10) {
        super(i10);
        this.c0 = t9Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void finishFragment() {
        setFinishing(true);
        this.c0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void removeSelfFromStack() {
        this.c0.dismiss();
    }
}
