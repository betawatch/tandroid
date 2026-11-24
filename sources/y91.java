// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
