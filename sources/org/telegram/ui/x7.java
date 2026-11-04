package org.telegram.ui;

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x7 extends FrameLayout {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ org.telegram.messenger.cs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x7(org.telegram.messenger.cs csVar, Context context, int i3) {
        super(context);
        this.a = i3;
        this.c = csVar;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onLayout(z10, i3, i10, i11, i12);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((i8) this.c).M.f();
                    break;
                }
                break;
            case 1:
                super.onLayout(z10, i3, i10, i11, i12);
                int i13 = i12 - i10;
                int i14 = this.b;
                if (i14 != -1 && Math.abs(i14 - i13) > org.telegram.messenger.g0.L(20.0f)) {
                    ((ip) this.c).b.y0(r3.W - 1);
                }
                this.b = i13;
                break;
            default:
                super.onLayout(z10, i3, i10, i11, i12);
                Point point = org.telegram.messenger.g0.q;
                int i15 = point.x + point.y;
                int i16 = this.b;
                if (i16 > 0 && i16 != i15) {
                    setVisibility(8);
                    org.telegram.ui.Components.l10 l10Var = (org.telegram.ui.Components.l10) this.c;
                    l10Var.x = false;
                    l10Var.a();
                }
                this.b = i15;
                break;
        }
    }

    @Override // android.view.View
    public void setVisibility(int i3) {
        switch (this.a) {
            case 2:
                super.setVisibility(i3);
                if (i3 == 8) {
                    this.b = -1;
                    break;
                }
                break;
            default:
                super.setVisibility(i3);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x7(i8 i8Var, Context context) {
        super(context);
        this.a = 0;
        this.c = i8Var;
    }
}
