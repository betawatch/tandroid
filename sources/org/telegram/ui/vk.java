package org.telegram.ui;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final org.telegram.messenger.jc j(int i7) {
        return new org.telegram.messenger.jc(this.a, null, 0);
    }

    @Override // org.telegram.ui.mq0, org.telegram.ui.tq0
    public final void o(int i7, org.telegram.messenger.j20 j20Var, boolean z9, int i10, int i11, boolean z10) {
        this.c.u((org.telegram.messenger.gf) this.b.get(0), j20Var, z9, i10, 0, z10, 0L);
    }
}
