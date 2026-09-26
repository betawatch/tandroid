package org.telegram.ui;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class rk extends org.telegram.ui.Components.zk0 {
    public final /* synthetic */ wn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(wn wnVar, rj rjVar, uj ujVar) {
        super(rjVar, ujVar);
        this.l = wnVar;
    }

    public final void e(int i10) {
        if (this.l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
