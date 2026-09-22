package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class wi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.sk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.p0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ zn s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.s = znVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = sk0Var;
        this.f = f7;
        this.h = f10;
        this.n = p0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            zn znVar = this.s;
            if (znVar.bc != null) {
                znVar.bc = null;
                if (this.b) {
                    znVar.h8(new vi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    znVar.h8(new gh(10, this, this.r));
                }
                znVar.A7(true);
            }
        }
    }
}
