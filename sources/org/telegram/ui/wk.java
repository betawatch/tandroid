package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class wk extends oq0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ bn c;

    public wk(bn bnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = bnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final org.telegram.messenger.hc j(int i7) {
        return new org.telegram.messenger.hc(this.a, null, 0);
    }

    @Override // org.telegram.ui.oq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.e20 e20Var, boolean z10, int i10, int i11, boolean z11) {
        this.c.u((org.telegram.messenger.ef) this.b.get(0), e20Var, z10, i10, 0, z11, 0L);
    }
}
