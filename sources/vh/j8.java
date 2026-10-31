package vh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class j8 {
    public float b;
    public org.telegram.ui.Cells.g7 d;
    public ImageReceiver e;
    public th.g2 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static h8 b(org.telegram.ui.Cells.h7 h7Var) {
        if (h7Var == null) {
            return null;
        }
        org.telegram.ui.Components.g9 imageView = h7Var.getImageView();
        h8 h8Var = new h8(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i10 = iArr[0];
        float f7 = i10;
        float f10 = iArr[1];
        float width = imageView.getWidth() + i10;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = h8Var.c;
        rectF.set(f7, f10, width, height);
        h8Var.d = new org.telegram.ui.Cells.g7(imageView.getContext(), null, false, R.drawable.large_repost_story, h7Var.D);
        h8Var.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return h8Var;
    }

    public static i8 c(th.l lVar) {
        if (lVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = lVar.r;
        if (lVar.getRootView() == null) {
            return null;
        }
        float f7 = imageReceiver.M0;
        i8 i8Var = new i8(lVar, f7 / 2.0f);
        float[] fArr = new float[2];
        lVar.getRootView().getLocationOnScreen(new int[2]);
        org.telegram.messenger.i0.r1(lVar, (ViewGroup) lVar.getRootView(), fArr);
        float f10 = r5[0] + fArr[0] + imageReceiver.K0;
        float f11 = r5[1] + fArr[1] + imageReceiver.L0;
        i8Var.c.set(f10, f11, f10 + f7, f7 + f11);
        i8Var.e = imageReceiver;
        i8Var.b = Math.max(i8Var.c.width(), i8Var.c.height()) / 2.0f;
        return i8Var;
    }

    public static h8 d(th.o7 o7Var) {
        th.z2 currentPeerView;
        th.g2 g2Var;
        if (o7Var == null) {
            return null;
        }
        h8 h8Var = new h8(o7Var, 1);
        th.e7 e7Var = o7Var.n0;
        if (e7Var == null || (currentPeerView = e7Var.getCurrentPeerView()) == null || (g2Var = currentPeerView.L0) == null) {
            return null;
        }
        th.c7 c7Var = o7Var.s;
        float x10 = c7Var == null ? 0.0f : c7Var.getX();
        th.c7 c7Var2 = o7Var.s;
        float y3 = c7Var2 != null ? c7Var2.getY() : 0.0f;
        h8Var.c.set(g2Var.getX() + currentPeerView.getX() + o7Var.X + x10 + o7Var.w.getLeft(), g2Var.getY() + currentPeerView.getY() + o7Var.W + y3 + o7Var.w.getTop(), (((x10 + o7Var.X) + o7Var.w.getRight()) - (o7Var.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - g2Var.getRight()), (((y3 + o7Var.W) + o7Var.w.getBottom()) - (o7Var.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - g2Var.getBottom()));
        h8Var.a = 1;
        h8Var.b = org.telegram.messenger.i0.L(8.0f);
        th.z2 H = o7Var.H();
        if (H != null) {
            h8Var.f = H.L0;
        }
        return h8Var;
    }

    public abstract void e();

    public abstract void f(boolean z10);

    public void a(Canvas canvas, float f7) {
    }
}
