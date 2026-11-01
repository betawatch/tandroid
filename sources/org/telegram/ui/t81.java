package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class t81 extends w7.y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.vs b;

    public /* synthetic */ t81(org.telegram.messenger.vs vsVar, int i10) {
        this.a = i10;
        this.b = vsVar;
    }

    @Override // w7.y5
    public void a() {
        switch (this.a) {
            case 1:
                ((zd1) this.b).w.invalidate();
                break;
        }
    }

    @Override // w7.y5
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.i0.q;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((k91) this.b).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
