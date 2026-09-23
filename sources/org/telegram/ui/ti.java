package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class ti implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.p0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ xn s;

    public ti(xn xnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.s = xnVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = gk0Var;
        this.f = f7;
        this.h = f10;
        this.n = p0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            xn xnVar = this.s;
            if (xnVar.bc != null) {
                xnVar.bc = null;
                if (this.b) {
                    xnVar.h8(new si(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    xnVar.h8(new rh(4, this, this.r));
                }
                xnVar.A7(true);
            }
        }
    }
}
