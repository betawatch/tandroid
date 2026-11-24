// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class to9 implements vp9 {
    public final /* synthetic */ vo9 a;

    public to9(vo9 vo9Var) {
        this.a = vo9Var;
    }

    @Override // vp9
    public final void onRejoinRequested() {
        gm.c3(new kf9(this, (byte) 12));
    }

    @Override // vp9
    public final void onStreamChannels(ArrayList arrayList) {
        gm.c3(new il9(this, arrayList, (byte) 11));
    }
}
