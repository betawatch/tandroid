package org.telegram.ui;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class uk extends org.telegram.ui.Components.ok0 {
    public final /* synthetic */ co l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uk(co coVar, uj ujVar, xj xjVar) {
        super(ujVar, xjVar);
        this.l = coVar;
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
