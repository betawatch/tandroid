// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ufa extends hha {
    public final /* synthetic */ nha h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ufa(nha nhaVar, Context context) {
        super(nhaVar, context);
        this.h = nhaVar;
    }

    @Override // y59
    public final void f() {
        super.f();
        nha nhaVar = this.h;
        iga P = nhaVar.P(0);
        if (P == null || P.n.getVisibility() != 0) {
            return;
        }
        nhaVar.L.f();
    }
}
