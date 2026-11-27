// default package

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class ow0 extends i22 {
    public final /* synthetic */ byte d0;
    public final /* synthetic */ Object e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow0(byte b, Context context, Object obj) {
        super(context);
        this.d0 = b;
        this.e0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i, int i2) {
        int i3;
        float f;
        int size;
        byte b = this.d0;
        Object obj = this.e0;
        switch (b) {
            case 0:
                xw0 xw0Var = (xw0) obj;
                tw0 tw0Var = xw0Var.n0;
                int size2 = View.MeasureSpec.getSize(i2);
                if (!hl.O1()) {
                    Point point = hl.q;
                    if (point.x > point.y) {
                        i3 = (int) (size2 / 3.5f);
                        if (i3 < 0) {
                            i3 = 0;
                        }
                        f = i3;
                        if (getOffsetY() != f && !xw0Var.e0 && xw0Var.V0) {
                            xw0Var.H = true;
                            setOffsetY(f);
                            xw0Var.H = false;
                            xw0Var.V0 = false;
                        }
                        if (!xw0Var.f0 && hl.O1() && !hl.E && !hl.N1()) {
                            Point point2 = hl.q;
                            i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i2);
                        if (!xw0Var.f0) {
                            size = (size - hl.m) - a.getCurrentActionBarHeight();
                        }
                        if (tw0Var != null && tw0Var.getTotalHeight() > 0) {
                            size -= tw0Var.getTotalHeight();
                        }
                        super.onMeasure(i, ik8.E(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i3 = (size2 / 5) << 1;
                if (i3 < 0) {
                }
                f = i3;
                if (getOffsetY() != f) {
                    xw0Var.H = true;
                    setOffsetY(f);
                    xw0Var.H = false;
                    xw0Var.V0 = false;
                }
                if (!xw0Var.f0) {
                    Point point22 = hl.q;
                    i = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i2);
                if (!xw0Var.f0) {
                }
                if (tw0Var != null) {
                    size -= tw0Var.getTotalHeight();
                }
                super.onMeasure(i, ik8.E(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i2) - a.getCurrentActionBarHeight()) - hl.L(84.0f)) + ((j22) obj).O, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        switch (this.d0) {
            case 0:
                if (!((xw0) this.e0).H) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // i22, android.view.View
    public final void setTranslationY(float f) {
        switch (this.d0) {
            case 0:
                super.setTranslationY(f);
                xw0 xw0Var = (xw0) this.e0;
                yp0 yp0Var = xw0Var.o0;
                if (yp0Var != null) {
                    yp0Var.setTranslationY(hl.L(24.0f) + f);
                }
                FrameLayout frameLayout = xw0Var.r0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(xw0Var.x.getTranslationY() + hl.U1(xw0Var.h0, a.getCurrentActionBarHeight() - hl.L(24.0f), hl.L(70.0f) + xw0Var.n.top));
                    break;
                }
                break;
            default:
                super.setTranslationY(f);
                break;
        }
    }
}
