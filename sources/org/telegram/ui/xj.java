package org.telegram.ui;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xj extends org.telegram.ui.ActionBar.k5 {
    public final /* synthetic */ bn x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xj(bn bnVar, bj bjVar, ej ejVar) {
        super(bjVar, ejVar);
        this.x = bnVar;
    }

    public final void m(int i7) {
        if (this.x.nb) {
            if (i7 == 0) {
                i7 = 1;
            } else if (i7 == 1) {
                i7 = 0;
            }
        }
        this.b = i7;
    }
}
