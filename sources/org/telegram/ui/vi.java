package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class vi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.qk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.o0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ zn s;

    public vi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.s = znVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = qk0Var;
        this.f = f7;
        this.h = f10;
        this.n = o0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            zn znVar = this.s;
            if (znVar.bc != null) {
                znVar.bc = null;
                if (this.b) {
                    znVar.h8(new ui(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    znVar.h8(new qh(8, this, this.r));
                }
                znVar.A7(true);
            }
        }
    }
}
