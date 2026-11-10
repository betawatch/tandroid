package org.telegram.ui;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yj extends org.telegram.ui.Components.ri0 {
    public final /* synthetic */ cn l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(cn cnVar, cj cjVar, fj fjVar) {
        super(cjVar, fjVar);
        this.l = cnVar;
    }

    public final void f(int i7) {
        if (this.l.lb) {
            if (i7 == 0) {
                i7 = 1;
            } else if (i7 == 1) {
                i7 = 0;
            }
        }
        this.b = i7;
    }
}
