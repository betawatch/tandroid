// default package

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ps1 extends FrameLayout {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yv1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ps1(yv1 yv1Var, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = yv1Var;
    }

    @Override // android.view.ViewGroup
    public final void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        switch (this.a) {
            case 1:
                yv1 yv1Var = this.b;
                if (view == yv1Var.j3) {
                    ImageView imageView = yv1Var.h3;
                    int i5 = (imageView == null || imageView.getVisibility() == 8) ? 18 : 66;
                    ImageView imageView2 = yv1Var.i3;
                    if (imageView2 != null && imageView2.getVisibility() != 8) {
                        i5 += 48;
                    }
                    ((ViewGroup.MarginLayoutParams) view.getLayoutParams()).leftMargin = gm.L(i5);
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
                this.b.ud.s(2, i == 0, getMeasuredWidth() > 0);
                break;
            default:
                super.setVisibility(i);
                break;
        }
    }
}
