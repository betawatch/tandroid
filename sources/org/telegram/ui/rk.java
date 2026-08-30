package org.telegram.ui;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class rk extends c2.y {
    public final /* synthetic */ xn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(xn xnVar, qj qjVar, tj tjVar) {
        super(qjVar, tjVar);
        this.l = xnVar;
    }

    public final void d(int i10) {
        if (this.l.Ma) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
