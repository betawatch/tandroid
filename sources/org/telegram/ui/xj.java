package org.telegram.ui;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class xj extends org.telegram.ui.ActionBar.l5 {
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
