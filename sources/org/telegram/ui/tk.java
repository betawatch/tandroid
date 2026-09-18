package org.telegram.ui;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class tk extends org.telegram.ui.Components.zk0 {
    public final /* synthetic */ zn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(zn znVar, tj tjVar, wj wjVar) {
        super(tjVar, wjVar);
        this.l = znVar;
    }

    public final void f(int i10) {
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
