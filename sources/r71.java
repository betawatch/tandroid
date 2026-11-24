// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class r71 extends FrameLayout {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ gk7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r71(gk7 gk7Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.c = gk7Var;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a;
        gk7 gk7Var = this.c;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((b81) gk7Var).M.f();
                    break;
                }
                break;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                int i5 = i4 - i2;
                int i6 = this.b;
                if (i6 != -1 && Math.abs(i6 - i5) > gl.L(20.0f)) {
                    ((zc2) gk7Var).b.z0(r1.W - 1);
                }
                this.b = i5;
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                Point point = gl.q;
                int i7 = point.x + point.y;
                int i8 = this.b;
                if (i8 > 0 && i8 != i7) {
                    setVisibility(8);
                    o85 o85Var = (o85) gk7Var;
                    o85Var.y = false;
                    o85Var.a();
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
    public r71(b81 b81Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = b81Var;
    }
}
