// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class y91 extends da1 {
    public final /* synthetic */ z91 h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y91(z91 z91Var, int i) {
        super(i);
        this.h0 = z91Var;
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.d
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
