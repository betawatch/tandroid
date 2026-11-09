package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class xk extends pq0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ cn c;

    public xk(cn cnVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = cnVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final org.telegram.messenger.jc j(int i7) {
        return new org.telegram.messenger.jc(this.a, null, 0);
    }

    @Override // org.telegram.ui.pq0, org.telegram.ui.wq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.c.u((org.telegram.messenger.gf) this.b.get(0), j20Var, z9, i10, 0, z10, 0L);
    }
}
