package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class ri implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.gl0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ bh.x0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ wn s;

    public ri(wn wnVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.gl0 gl0Var, float f7, float f10, bh.x0 x0Var, MessageObject messageObject) {
        this.s = wnVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = gl0Var;
        this.f = f7;
        this.h = f10;
        this.n = x0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            wn wnVar = this.s;
            if (wnVar.Cc != null) {
                wnVar.Cc = null;
                if (this.b) {
                    wnVar.q8(new qi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    wnVar.q8(new ed(18, this, this.r));
                }
                wnVar.J7(true);
            }
        }
    }
}
