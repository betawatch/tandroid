package org.telegram.ui;

import android.graphics.Point;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v81 extends w7.y5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.messenger.us b;

    public /* synthetic */ v81(org.telegram.messenger.us usVar, int i10) {
        this.a = i10;
        this.b = usVar;
    }

    @Override // w7.y5
    public void a() {
        switch (this.a) {
            case 1:
                ((be1) this.b).w.invalidate();
                break;
        }
    }

    @Override // w7.y5
    public void b(int i10, int i11) {
        switch (this.a) {
            case 0:
                Point point = org.telegram.messenger.i0.q;
                if ((point.x <= point.y) == (i10 <= i11)) {
                    ((m91) this.b).y0.invalidate();
                    break;
                }
                break;
        }
    }
}
