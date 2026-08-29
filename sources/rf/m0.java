package rf;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class m0 extends SendMessagesHelper.LocationProvider {
    public final /* synthetic */ v0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(v0 v0Var, l0 l0Var) {
        super(l0Var);
        this.a = v0Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider
    public final void stop() {
        super.stop();
        this.a.v0 = null;
    }
}
