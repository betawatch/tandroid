package org.telegram.ui;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class yj extends org.telegram.ui.Components.si0 {
    public final /* synthetic */ cn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(cn cnVar, cj cjVar, fj fjVar) {
        super(cjVar, fjVar);
        this.l = cnVar;
    }

    public final void f(int i7) {
        if (this.l.lb) {
            if (i7 == 0) {
                i7 = 1;
            } else if (i7 == 1) {
                i7 = 0;
            }
        }
        this.b = i7;
    }
}
