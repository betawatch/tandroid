// default package

import android.view.ViewTreeObserver;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xj3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xj3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((ui3) obj).a.f0[0].a.getViewTreeObserver().removeOnPreDrawListener(this);
                gm.d3((toa) obj2, 100L);
                return false;
            case 1:
                g95 g95Var = (g95) obj;
                g95Var.J1.getViewTreeObserver().removeOnPreDrawListener(this);
                g95Var.i4 = null;
                g95Var.T3.h((rd2) obj2);
                gm.V3(g95Var.e4);
                g95Var.b.requestLayout();
                return false;
            default:
                ((ViewTreeObserver) obj2).removeOnPreDrawListener(this);
                wz8 wz8Var = (wz8) obj;
                b31 b31Var = wz8Var.X;
                if (b31Var != null) {
                    int[] iArr = wz8.e0;
                    b31Var.getLocationInWindow(iArr);
                    float f = iArr[0];
                    float translationY = iArr[1] - wz8Var.X.getTranslationY();
                    b31 b31Var2 = wz8Var.X;
                    float topOffset = translationY + (b31Var2.top ? b31Var2.getTopOffset() : -b31Var2.getBottomOffset());
                    wz8Var.a.getLocationInWindow(iArr);
                    float f2 = iArr[0];
                    float f3 = iArr[1];
                    wz8Var.Y = (wz8Var.X.a.getMeasuredWidth() / 2.0f) + (f - f2) + wz8Var.X.a.getLeft();
                    wz8Var.Z = (wz8Var.X.a.getMeasuredHeight() / 2.0f) + (topOffset - f3) + wz8Var.X.a.getTop();
                }
                wz8Var.c();
                return true;
        }
    }
}
