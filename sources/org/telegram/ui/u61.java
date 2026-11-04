package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class u61 extends b8.jf {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.cs b;

    public /* synthetic */ u61(org.telegram.messenger.cs csVar, int i3) {
        this.a = i3;
        this.b = csVar;
    }

    @Override // b8.jf
    public void a() {
        switch (this.a) {
            case 1:
                ((zb1) this.b).w.invalidate();
                break;
        }
    }

    @Override // b8.jf
    public void b(int i3, int i10) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.g0.q;
                if ((point.x <= point.y) == (i3 <= i10)) {
                    ((l71) this.b).z0.invalidate();
                    break;
                }
                break;
        }
    }
}
