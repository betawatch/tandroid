package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class w7 extends FrameLayout {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ org.telegram.messenger.ls c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w7(org.telegram.messenger.ls lsVar, Context context, int i7) {
        super(context);
        this.a = i7;
        this.c = lsVar;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z9, i7, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((h8) this.c).L.f();
                    break;
                }
                break;
            case 1:
                super.onLayout(z9, i7, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    ((kp) this.c).b.y0(r3.V - 1);
                }
                this.b = i13;
                break;
            default:
                super.onLayout(z9, i7, i10, i11, i12);
                Point point = org.telegram.messenger.g0.q;
                int i15 = point.x + point.y;
                int i16 = this.b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.p10 p10Var = (org.telegram.ui.Components.p10) this.c;
                    p10Var.y = false;
                    p10Var.a();
                }
                this.b = i15;
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i7) {
        switch (this.a) {
            case 2:
                super.setVisibility(i7);
                if (i7 == 8) {
                    this.b = -1;
                    break;
                }
                break;
            default:
                super.setVisibility(i7);
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
