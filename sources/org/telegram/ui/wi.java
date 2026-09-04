package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class wi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.fk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ah.j1 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ co s;

    public wi(co coVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.fk0 fk0Var, float f7, float f10, ah.j1 j1Var, MessageObject messageObject) {
        this.s = coVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = fk0Var;
        this.f = f7;
        this.h = f10;
        this.n = j1Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            co coVar = this.s;
            if (coVar.cc != null) {
                coVar.cc = null;
                if (this.b) {
                    coVar.h8(new vi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    coVar.h8(new fh(10, this, this.r));
                }
                coVar.A7(true);
            }
        }
    }
}
