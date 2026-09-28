package org.telegram.ui;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class rk extends org.telegram.ui.Components.bl0 {
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
