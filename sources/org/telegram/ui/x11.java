package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x11 extends w7.d6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ x11(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.d6
    public final void a() {
        switch (this.a) {
            case 0:
                ((i31) this.b).x1 = false;
                break;
            case 1:
                ((qh.g0) this.b).w = false;
                break;
            default:
                ((vh.b1) this.b).i3 = false;
                break;
        }
    }

    @Override // w7.d6
    public void b() {
        switch (this.a) {
            case 0:
                ((i31) this.b).x1 = true;
                break;
            case 2:
                ((vh.b1) this.b).i3 = true;
                break;
        }
    }
}
