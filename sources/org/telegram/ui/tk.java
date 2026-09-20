package org.telegram.ui;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class tk extends org.telegram.ui.Components.yk0 {
    public final /* synthetic */ zn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tk(zn znVar, tj tjVar, wj wjVar) {
        super(tjVar, wjVar);
        this.l = znVar;
    }

    public final void f(int i10) {
        if (this.l.Pa) {
            if (i10 == 0) {
                i10 = 1;
            } else if (i10 == 1) {
                i10 = 0;
            }
        }
        this.b = i10;
    }
}
