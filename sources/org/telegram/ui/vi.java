package org.telegram.ui;

import org.telegram.messenger.MessageObject;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vi implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ org.telegram.ui.Components.pk0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float h;
    public final /* synthetic */ zg.o0 n;
    public final /* synthetic */ MessageObject r;
    public final /* synthetic */ zn s;

    public vi(zn znVar, boolean z10, boolean z11, int i10, boolean z12, org.telegram.ui.Components.pk0 pk0Var, float f7, float f10, zg.o0 o0Var, MessageObject messageObject) {
        this.s = znVar;
        this.a = z10;
        this.b = z11;
        this.c = i10;
        this.d = z12;
        this.e = pk0Var;
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
                    znVar.h8(new gh(10, this, this.r));
                }
                znVar.A7(true);
            }
        }
    }
}
