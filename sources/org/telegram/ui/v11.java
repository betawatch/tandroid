package org.telegram.ui;

import android.view.ViewGroup;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class v11 extends w7.d6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup b;

    public /* synthetic */ v11(ViewGroup viewGroup, int i10) {
        this.a = i10;
        this.b = viewGroup;
    }

    @Override // w7.d6
    public final void a() {
        switch (this.a) {
            case 0:
                ((g31) this.b).x1 = false;
                break;
            case 1:
                ((qh.g0) this.b).w = false;
                break;
            default:
                ((vh.c1) this.b).i3 = false;
                break;
        }
    }

    @Override // w7.d6
    public void b() {
        switch (this.a) {
            case 0:
                ((g31) this.b).x1 = true;
                break;
            case 2:
                ((vh.c1) this.b).i3 = true;
                break;
        }
    }
}
