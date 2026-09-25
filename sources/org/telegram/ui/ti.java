package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class ti implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.qk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.o0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ wn s;

    public ti(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.qk0 qk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.s = wnVar;
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
            wn wnVar = this.s;
            if (wnVar.bc != null) {
                wnVar.bc = null;
                if (this.b) {
                    wnVar.h8(new si(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    wnVar.h8(new fh(9, this, this.r));
                }
                wnVar.A7(true);
            }
        }
    }
}
