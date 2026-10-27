package org.telegram.ui;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class qk extends org.telegram.ui.Components.ql0 {
    public final /* synthetic */ wn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qk(wn wnVar, rj rjVar, uj ujVar) {
        super(rjVar, ujVar);
        this.l = wnVar;
    }

    public final void e(int i10) {
        if (this.l.gb) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
