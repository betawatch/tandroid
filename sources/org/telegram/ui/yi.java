package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class yi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.pk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ yg.p0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ eo s;

    public yi(eo eoVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, yg.p0 p0Var, MessageObject messageObject) {
        this.s = eoVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = pk0Var;
        this.f = f7;
        this.h = f10;
        this.n = p0Var;
        this.r = messageObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.a) {
            eo eoVar = this.s;
            if (eoVar.cc != null) {
                eoVar.cc = null;
                if (this.b) {
                    eoVar.h8(new xi(this, this.c, this.d, this.e, this.f, this.h, this.n, 0));
                } else {
                    eoVar.h8(new qh(7, this, this.r));
                }
                eoVar.A7(true);
            }
        }
    }
}
