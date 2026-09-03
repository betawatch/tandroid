package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class si implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.qk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ ng.q0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ xn s;

    public si(xn xnVar, boolean z4, boolean z10, int i10, boolean z11, org.telegram.ui.Components.qk0 qk0Var, float f10, float f11, ng.q0 q0Var, MessageObject messageObject) {
        this.s = xnVar;
        this.a = z4;
        this.b = z10;
        this.c = i10;
        this.d = z11;
        this.e = qk0Var;
        this.f = f10;
        this.h = f11;
        this.n = q0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            xn xnVar = this.s;
            if (xnVar.Zb != null) {
                xnVar.Zb = null;
                if (this.b) {
                    xnVar.h8(new ri(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    xnVar.h8(new xc(20, this, this.r));
                }
                xnVar.A7(true);
            }
        }
    }
}
