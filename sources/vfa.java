// default package

import android.content.Context;
import android.os.Bundle;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vfa extends gw1 {
    public final /* synthetic */ nha f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfa(nha nhaVar, Context context, tk5 tk5Var, Bundle bundle) {
        super(context, tk5Var, bundle);
        this.f = nhaVar;
    }

    @Override // gw1
    public final void b(boolean z) {
        r7 r7Var = this.f.q0;
        if (r7Var != null) {
            r7Var.setShowSearchProgress(z);
        }
    }
}
