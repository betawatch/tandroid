package org.telegram.ui;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
