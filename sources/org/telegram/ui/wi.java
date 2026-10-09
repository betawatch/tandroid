package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.kl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.n0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ zn s;

    public wi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.kl0 kl0Var, float f7, float f10, zg.n0 n0Var, MessageObject messageObject) {
        this.s = znVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = kl0Var;
        this.f = f7;
        this.h = f10;
        this.n = n0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            zn znVar = this.s;
            if (znVar.cc != null) {
                znVar.cc = null;
                if (this.b) {
                    znVar.k8(new vi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    znVar.k8(new sg(12, this, this.r));
                }
                znVar.D7(true);
            }
        }
    }
}
