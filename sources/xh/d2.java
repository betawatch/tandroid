package xh;

import android.content.Context;
import android.graphics.Point;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class d2 extends h3 {
    public final /* synthetic */ int c0;
    public final /* synthetic */ Object d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d2(Object obj, Context context, int i10) {
        super(context);
        this.c0 = i10;
        this.d0 = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        int size;
        switch (this.c0) {
            case 0:
                m2 m2Var = (m2) this.d0;
                i2 i2Var = m2Var.m0;
                int size2 = View.MeasureSpec.getSize(i11);
                if (!org.telegram.messenger.i0.Q1()) {
                    Point point = org.telegram.messenger.i0.q;
                    if (point.x > point.y) {
                        i12 = (int) (size2 / 3.5f);
                        if (i12 < 0) {
                            i12 = 0;
                        }
                        f7 = i12;
                        if (getOffsetY() != f7 && !m2Var.d0 && m2Var.U0) {
                            m2Var.G = true;
                            setOffsetY(f7);
                            m2Var.G = false;
                            m2Var.U0 = false;
                        }
                        if (!m2Var.e0 && org.telegram.messenger.i0.Q1() && !org.telegram.messenger.i0.E && !org.telegram.messenger.i0.P1()) {
                            Point point2 = org.telegram.messenger.i0.q;
                            i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point2.x, point2.y) * 0.8f), TLObject.FLAG_30);
                        }
                        size = View.MeasureSpec.getSize(i11);
                        if (!m2Var.e0) {
                            size = (size - org.telegram.messenger.i0.m) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
                        }
                        if (i2Var != null && i2Var.getTotalHeight() > 0) {
                            size -= i2Var.getTotalHeight();
                        }
                        super.onMeasure(i10, z20.B(24.0f, size, TLObject.FLAG_30));
                        break;
                    }
                }
                i12 = (size2 / 5) * 2;
                if (i12 < 0) {
                }
                f7 = i12;
                if (getOffsetY() != f7) {
                    m2Var.G = true;
                    setOffsetY(f7);
                    m2Var.G = false;
                    m2Var.U0 = false;
                }
                if (!m2Var.e0) {
                    Point point22 = org.telegram.messenger.i0.q;
                    i10 = View.MeasureSpec.makeMeasureSpec((int) (Math.min(point22.x, point22.y) * 0.8f), TLObject.FLAG_30);
                }
                size = View.MeasureSpec.getSize(i11);
                if (!m2Var.e0) {
                }
                if (i2Var != null) {
                    size -= i2Var.getTotalHeight();
                }
                super.onMeasure(i10, z20.B(24.0f, size, TLObject.FLAG_30));
            default:
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(((View.MeasureSpec.getSize(i11) - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - org.telegram.messenger.i0.L(84.0f)) + ((i3) this.d0).N, TLObject.FLAG_30));
                break;
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        switch (this.c0) {
            case 0:
                if (!((m2) this.d0).G) {
                    super.requestLayout();
                    break;
                }
                break;
            default:
                super.requestLayout();
                break;
        }
    }

    @Override // xh.h3, android.view.View
    public void setTranslationY(float f7) {
        switch (this.c0) {
            case 0:
                super.setTranslationY(f7);
                m2 m2Var = (m2) this.d0;
                org.telegram.messenger.l2 l2Var = m2Var.n0;
                if (l2Var != null) {
                    l2Var.setTranslationY(org.telegram.messenger.i0.L(24.0f) + f7);
                }
                FrameLayout frameLayout = m2Var.q0;
                if (frameLayout != null) {
                    frameLayout.setTranslationY(m2Var.x.getTranslationY() + org.telegram.messenger.i0.W1(m2Var.g0, org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() - org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(70.0f) + m2Var.n.top));
                    break;
                }
                break;
            default:
                super.setTranslationY(f7);
                break;
        }
    }
}
