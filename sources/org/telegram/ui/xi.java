package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class xi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.p0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ bo s;

    public xi(bo boVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gk0 gk0Var, float f7, float f10, zg.p0 p0Var, MessageObject messageObject) {
        this.s = boVar;
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
            bo boVar = this.s;
            if (boVar.bc != null) {
                boVar.bc = null;
                if (this.b) {
                    boVar.h8(new wi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    boVar.h8(new wh(4, this, this.r));
                }
                boVar.A7(true);
            }
        }
    }
}
