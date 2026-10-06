package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ui implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.sk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.m0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ yn s;

    public ui(yn ynVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.sk0 sk0Var, float f7, float f10, zg.m0 m0Var, MessageObject messageObject) {
        this.s = ynVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = sk0Var;
        this.f = f7;
        this.h = f10;
        this.n = m0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            yn ynVar = this.s;
            if (ynVar.Zb != null) {
                ynVar.Zb = null;
                if (this.b) {
                    ynVar.h8(new ti(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    ynVar.h8(new oh(8, this, this.r));
                }
                ynVar.A7(true);
            }
        }
    }
}
