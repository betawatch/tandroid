// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qr1 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qr1(zu1 zu1Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = zu1Var;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                zu1 zu1Var = this.b;
                if (view == zu1Var.j3) {
                    ImageView imageView = zu1Var.h3;
                    int i5 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = zu1Var.i3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i5 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = hl.L(i5);
                }
                super.measureChildWithMargins(view, i, i2, i3, i4);
                break;
            default:
                super.measureChildWithMargins(view, i, i2, i3, i4);
                break;
        }
    }

    @Override // android.view.View
    public final void setTranslationY(float f) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f);
                this.b.m1.invalidate();
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        switch (this.a) {
            case 0:
                super.setVisibility(i);
                this.b.xd.s(2, i == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
