// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class z71 extends FrameLayout {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ fn7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z71(fn7 fn7Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.c = fn7Var;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a;
        fn7 fn7Var = this.c;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((j81) fn7Var).M.f();
                    break;
                }
                break;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                int i5 = i4 - i2;
                int i6 = this.b;
                if (i6 != -1 && Math.abs(i6 - i5) > hl.L(20.0f)) {
                    ((pd2) fn7Var).b.A0(r1.W - 1);
                }
                this.b = i5;
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                Point point = hl.q;
                int i7 = point.x + point.y;
                int i8 = this.b;
                if (i8 > 0 && i8 != i7) {
                    setVisibility(8);
                    ra5 ra5Var = (ra5) fn7Var;
                    ra5Var.y = false;
                    ra5Var.a();
                }
                this.b = i7;
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 2:
                super.setVisibility(i);
                if (i == 8) {
                    this.b = -1;
                    break;
                }
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z71(j81 j81Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = j81Var;
    }
}
