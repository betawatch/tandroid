package org.telegram.ui;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class rk extends org.telegram.ui.Components.bl0 {
    public final /* synthetic */ yn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rk(yn ynVar, sj sjVar, vj vjVar) {
        super(sjVar, vjVar);
        this.l = ynVar;
    }

    public final void f(int i10) {
        if (this.l.Na) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
