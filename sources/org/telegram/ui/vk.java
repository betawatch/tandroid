package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class vk extends nq0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ an c;

    public vk(an anVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = anVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final org.telegram.messenger.jc j(int i7) {
        return new org.telegram.messenger.jc(this.a, null, 0);
    }

    @Override // org.telegram.ui.nq0, org.telegram.ui.uq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.c.u((org.telegram.messenger.gf) this.b.get(0), j20Var, z9, i10, 0, z10, 0L);
    }
}
