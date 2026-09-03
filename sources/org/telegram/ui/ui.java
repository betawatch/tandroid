package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class ui implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.pk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ mg.q0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ zn s;

    public ui(zn znVar, boolean z4, boolean z10, int i10, boolean z11, org.telegram.ui.Components.pk0 pk0Var, float f10, float f11, mg.q0 q0Var, MessageObject messageObject) {
        this.s = znVar;
        this.a = z4;
        this.b = z10;
        this.c = i10;
        this.d = z11;
        this.e = pk0Var;
        this.f = f10;
        this.h = f11;
        this.n = q0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            zn znVar = this.s;
            if (znVar.Zb != null) {
                znVar.Zb = null;
                if (this.b) {
                    znVar.h8(new ti(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    znVar.h8(new hc(21, this, this.r));
                }
                znVar.A7(true);
            }
        }
    }
}
