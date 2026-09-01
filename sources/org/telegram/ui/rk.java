package org.telegram.ui;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
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
