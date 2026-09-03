package uf;

import org.telegram.messenger.SendMessagesHelper;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class l0 extends SendMessagesHelper.LocationProvider {
    public final /* synthetic */ u0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(u0 u0Var, k0 k0Var) {
        super(k0Var);
        this.a = u0Var;
    }

    @Override // org.telegram.messenger.SendMessagesHelper.LocationProvider
    public final void stop() {
        super.stop();
        this.a.w0 = null;
    }
}
