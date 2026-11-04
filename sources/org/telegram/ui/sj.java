package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sj extends org.telegram.ui.Components.vi0 {
    public final /* synthetic */ wm l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(wm wmVar, wi wiVar, zi ziVar) {
        super(wiVar, ziVar);
        this.l = wmVar;
    }

    public final void f(int i3) {
        if (this.l.kb) {
            if (i3 == 0) {
                i3 = 1;
            } else if (i3 == 1) {
                i3 = 0;
            }
        }
        this.b = i3;
    }
}
