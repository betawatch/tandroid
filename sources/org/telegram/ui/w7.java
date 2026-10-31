package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ org.telegram.messenger.us c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7(org.telegram.messenger.us usVar, Context context, int i10) {
        super(context);
        this.a = i10;
        this.c = usVar;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i10, i11, i12, i13);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((h8) this.c).L.f();
                    break;
                }
                break;
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                int i14 = i13 - i11;
                int i15 = this.b;
                if (i15 != -1 && Math.abs(i15 - i14) > org.telegram.messenger.i0.L(20.0f)) {
                    ((iq) this.c).b.y0(r3.V - 1);
                }
                this.b = i14;
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                Point point = org.telegram.messenger.i0.q;
                int i16 = point.x + point.y;
                int i17 = this.b;
                if (i17 > 0 && i17 != i16) {
                    setVisibility(8);
                    org.telegram.ui.Components.g20 g20Var = (org.telegram.ui.Components.g20) this.c;
                    g20Var.x = false;
                    g20Var.a();
                }
                this.b = i16;
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        switch (this.a) {
            case 2:
                super.setVisibility(i10);
                if (i10 == 8) {
                    this.b = -1;
                    break;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w7(h8 h8Var, Context context) {
        super(context);
        this.a = 0;
        this.c = h8Var;
    }
}
