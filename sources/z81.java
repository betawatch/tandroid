// default package

import android.content.Context;
import android.graphics.Point;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class z81 extends FrameLayout {
    public final /* synthetic */ byte a;
    public int b;
    public final /* synthetic */ jm7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z81(jm7 jm7Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.c = jm7Var;
        this.b = -1;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        byte b = this.a;
        jm7 jm7Var = this.c;
        switch (b) {
            case 0:
                super.onLayout(z, i, i2, i3, i4);
                int measuredWidth = (getMeasuredWidth() + getMeasuredHeight()) << 16;
                if (this.b != measuredWidth) {
                    this.b = measuredWidth;
                    ((k91) jm7Var).M.f();
                    break;
                }
                break;
            case 1:
                super.onLayout(z, i, i2, i3, i4);
                int i5 = i4 - i2;
                int i6 = this.b;
                if (i6 != -1 && Math.abs(i6 - i5) > gm.L(20.0f)) {
                    ((ke2) jm7Var).b.z0(r1.W - 1);
                }
                this.b = i5;
                break;
            default:
                super.onLayout(z, i, i2, i3, i4);
                Point point = gm.q;
                int i7 = point.x + point.y;
                int i8 = this.b;
                if (i8 > 0 && i8 != i7) {
                    setVisibility(8);
                    oa5 oa5Var = (oa5) jm7Var;
                    oa5Var.y = false;
                    oa5Var.a();
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
    public z81(k91 k91Var, Context context) {
        super(context);
        this.a = (byte) 0;
        this.c = k91Var;
    }
}
