package org.telegram.ui;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class wj extends org.telegram.ui.Components.ri0 {
    public final /* synthetic */ an l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wj(an anVar, aj ajVar, dj djVar) {
        super(ajVar, djVar);
        this.l = anVar;
    }

    public final void f(int i7) {
        if (this.l.jb) {
            if (i7 == 0) {
                i7 = 1;
            } else if (i7 == 1) {
                i7 = 0;
            }
        }
        this.b = i7;
    }
}
