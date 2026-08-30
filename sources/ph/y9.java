package ph;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public abstract class y9 {
    public float b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public nh.i3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static w9 b(org.telegram.ui.Cells.e7 e7Var) {
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = e7Var.getImageView();
        w9 w9Var = new w9(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        w9Var.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        w9Var.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.y);
        w9Var.b = Math.max(w9Var.c.width(), w9Var.c.height()) / 2.0f;
        return w9Var;
    }

    public static x9 c(nh.p pVar) {
        if (pVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = pVar.r;
        if (pVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        x9 x9Var = new x9(pVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        pVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(pVar, (ViewGroup) pVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        x9Var.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        x9Var.e = imageReceiver;
        x9Var.b = Math.max(x9Var.c.width(), x9Var.c.height()) / 2.0f;
        return x9Var;
    }

    public static w9 d(nh.i9 i9Var) {
        nh.d4 currentPeerView;
        nh.i3 i3Var;
        if (i9Var == null) {
            return null;
        }
        w9 w9Var = new w9(i9Var, 1);
        nh.y8 y8Var = i9Var.k0;
        if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null || (i3Var = currentPeerView.Z0) == null) {
            return null;
        }
        nh.w8 w8Var = i9Var.s;
        float x10 = w8Var == null ? 0.0f : w8Var.getX();
        nh.w8 w8Var2 = i9Var.s;
        float y10 = w8Var2 != null ? w8Var2.getY() : 0.0f;
        w9Var.c.set(i3Var.getX() + currentPeerView.getX() + i9Var.U + x10 + i9Var.v.getLeft(), i3Var.getY() + currentPeerView.getY() + i9Var.T + y10 + i9Var.v.getTop(), (((x10 + i9Var.U) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - i3Var.getRight()), (((y10 + i9Var.T) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - i3Var.getBottom()));
        w9Var.a = 1;
        w9Var.b = AndroidUtilities.dp(8.0f);
        nh.d4 t6 = i9Var.t();
        if (t6 != null) {
            w9Var.f = t6.Z0;
        }
        return w9Var;
    }

    public abstract void e();

    public abstract void f(boolean z4);

    public void a(Canvas canvas, float f10) {
    }
}
