package qh;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public abstract class w9 {
    public float b;
    public org.telegram.ui.Cells.d7 d;
    public ImageReceiver e;
    public oh.j3 f;
    public int a = 0;
    public final RectF c = new RectF();

    public static t9 b(org.telegram.ui.Cells.e7 e7Var) {
        if (e7Var == null) {
            return null;
        }
        org.telegram.ui.Components.p9 imageView = e7Var.getImageView();
        t9 t9Var = new t9(imageView, 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        t9Var.c.set(iArr[0], iArr[1], imageView.getWidth() + r5, imageView.getHeight() + iArr[1]);
        t9Var.d = new org.telegram.ui.Cells.d7(imageView.getContext(), null, false, e7Var.y);
        t9Var.b = Math.max(t9Var.c.width(), t9Var.c.height()) / 2.0f;
        return t9Var;
    }

    public static v9 c(oh.o oVar) {
        if (oVar == null) {
            return null;
        }
        ImageReceiver imageReceiver = oVar.r;
        if (oVar.getRootView() == null) {
            return null;
        }
        float imageWidth = imageReceiver.getImageWidth();
        v9 v9Var = new v9(oVar, imageWidth / 2.0f);
        float[] fArr = new float[2];
        oVar.getRootView().getLocationOnScreen(new int[2]);
        AndroidUtilities.getViewPositionInParent(oVar, (ViewGroup) oVar.getRootView(), fArr);
        float imageX = imageReceiver.getImageX() + r5[0] + fArr[0];
        float imageY = imageReceiver.getImageY() + r5[1] + fArr[1];
        v9Var.c.set(imageX, imageY, imageX + imageWidth, imageWidth + imageY);
        v9Var.e = imageReceiver;
        v9Var.b = Math.max(v9Var.c.width(), v9Var.c.height()) / 2.0f;
        return v9Var;
    }

    public static t9 d(oh.i9 i9Var) {
        oh.f4 currentPeerView;
        oh.j3 j3Var;
        if (i9Var == null) {
            return null;
        }
        t9 t9Var = new t9(i9Var, 1);
        oh.y8 y8Var = i9Var.k0;
        if (y8Var == null || (currentPeerView = y8Var.getCurrentPeerView()) == null || (j3Var = currentPeerView.Z0) == null) {
            return null;
        }
        oh.w8 w8Var = i9Var.s;
        float x10 = w8Var == null ? 0.0f : w8Var.getX();
        oh.w8 w8Var2 = i9Var.s;
        float y10 = w8Var2 != null ? w8Var2.getY() : 0.0f;
        t9Var.c.set(j3Var.getX() + currentPeerView.getX() + i9Var.U + x10 + i9Var.v.getLeft(), j3Var.getY() + currentPeerView.getY() + i9Var.T + y10 + i9Var.v.getTop(), (((x10 + i9Var.U) + i9Var.v.getRight()) - (i9Var.v.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - j3Var.getRight()), (((y10 + i9Var.T) + i9Var.v.getBottom()) - (i9Var.v.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - j3Var.getBottom()));
        t9Var.a = 1;
        t9Var.b = AndroidUtilities.dp(8.0f);
        oh.f4 t6 = i9Var.t();
        if (t6 != null) {
            t9Var.f = t6.Z0;
        }
        return t9Var;
    }

    public abstract void e();

    public abstract void f(boolean z4);

    public void a(Canvas canvas, float f10) {
    }
}
