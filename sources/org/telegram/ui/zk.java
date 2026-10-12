package org.telegram.ui;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class zk extends org.telegram.ui.Components.pl0 {
    public final /* synthetic */ fo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(fo foVar, ak akVar, dk dkVar) {
        super(akVar, dkVar);
        this.l = foVar;
    }

    public final void e(int i10) {
        if (this.l.Qa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
