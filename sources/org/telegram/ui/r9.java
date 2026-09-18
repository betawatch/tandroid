package org.telegram.ui;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class r9 extends w9 {
    public final /* synthetic */ s9 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(s9 s9Var, int i10) {
        super(i10);
        this.f0 = s9Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void finishFragment() {
        setFinishing(true);
        this.f0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void removeSelfFromStack() {
        this.f0.dismiss();
    }
}
