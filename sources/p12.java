// default package

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class p12 extends xz1 {
    public final /* synthetic */ i22 y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p12(i22 i22Var, ylb ylbVar, Context context) {
        super(R.drawable.send_plane_24, ylbVar, context, false);
        this.y0 = i22Var;
    }

    @Override // xz1
    public final boolean b() {
        return false;
    }

    @Override // xz1
    public final boolean c() {
        return !this.y0.R2;
    }

    @Override // xz1
    public final int getFillColor() {
        return cmb.v0(cmb.R5, this.y0.J0);
    }
}
