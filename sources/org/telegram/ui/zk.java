package org.telegram.ui;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class zk extends org.telegram.ui.Components.pl0 {
    public final /* synthetic */ fo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zk(fo foVar, ak akVar, dk dkVar) {
        super(akVar, dkVar);
        this.l = foVar;
    }

    public final void f(int i10) {
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
