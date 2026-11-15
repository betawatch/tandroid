package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vk extends mq0 {
    public final /* synthetic */ Bitmap a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ an c;

    public vk(an anVar, Bitmap bitmap, ArrayList arrayList) {
        this.c = anVar;
        this.a = bitmap;
        this.b = arrayList;
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final org.telegram.messenger.ic j(int i7) {
        return new org.telegram.messenger.ic(this.a, null, 0);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.sq0
    public final void o(int i7, org.telegram.messenger.g20 g20Var, boolean z10, int i10, int i11, boolean z11) {
        this.c.u((org.telegram.messenger.ff) this.b.get(0), g20Var, z10, i10, 0, z11, 0L);
    }
}
