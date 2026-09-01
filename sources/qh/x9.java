package qh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public abstract class x9 {
    public float b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public oh.j3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static u9 b(org.telegram.ui.Cells.e7 e7Var) {
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = e7Var.getImageView();
        u9 u9Var = new u9(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        u9Var.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        u9Var.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.y);
        u9Var.b = Math.max(u9Var.c.width(), u9Var.c.height()) / 2.0f;
        return u9Var;
    }

    public static w9 c(oh.o oVar) {
        if (oVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = oVar.r;
        if (oVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        w9 w9Var = new w9(oVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        oVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        w9Var.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        w9Var.e = imageReceiver;
        w9Var.b = Math.max(w9Var.c.width(), w9Var.c.height()) / 2.0f;
        return w9Var;
    }

    public static u9 d(oh.i9 i9Var) {
        oh.f4 currentPeerView;
        oh.j3 j3Var;
        if (i9Var == null) {
            return null;
        }
        u9 u9Var = new u9(i9Var, 1);
        oh.y8 y8Var = i9Var.k0;
        if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null || (j3Var = currentPeerView.Z0) == null) {
            return null;
        }
        oh.w8 w8Var = i9Var.s;
        float x10 = w8Var == null ? 0.0f : w8Var.getX();
        oh.w8 w8Var2 = i9Var.s;
        float y10 = w8Var2 != null ? w8Var2.getY() : 0.0f;
        u9Var.c.set(j3Var.getX() + currentPeerView.getX() + i9Var.U + x10 + i9Var.v.getLeft(), j3Var.getY() + currentPeerView.getY() + i9Var.T + y10 + i9Var.v.getTop(), (((x10 + i9Var.U) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((y10 + i9Var.T) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
        u9Var.a = 1;
        u9Var.b = AndroidUtilities.dp(8.0f);
        oh.f4 t6 = i9Var.t();
        if (t6 != null) {
            u9Var.f = t6.Z0;
        }
        return u9Var;
    }

    public abstract void e();

    public abstract void f(boolean z4);

    public void a(Canvas canvas, float f10) {
    }
}
