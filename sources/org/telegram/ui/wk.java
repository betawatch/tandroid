package org.telegram.ui;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class wk extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ eo l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wk(eo eoVar, wj wjVar, zj zjVar) {
        super(wjVar, zjVar);
        this.l = eoVar;
    }

    public final void d(int i10) {
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
