// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.ViewGroup;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public abstract class q9b {
    public float b;
    public vca d;
    public ImageReceiver e;
    public g48 f;
    public boolean a = false;
    public final RectF c = new RectF();

    public static o9b b(wca wcaVar) {
        if (wcaVar == null) {
            return null;
        }
        bf0 imageView = wcaVar.getImageView();
        o9b o9bVar = new o9b(imageView, (byte) 2);
        int[] iArr = new int[2];
        imageView.getLocationOnScreen(iArr);
        int i = iArr[0];
        float f = i;
        float f2 = iArr[1];
        float width = imageView.getWidth() + i;
        float height = imageView.getHeight() + iArr[1];
        RectF rectF = o9bVar.c;
        rectF.set(f, f2, width, height);
        o9bVar.d = new vca(imageView.getContext(), null, false, R.drawable.large_repost_story, wcaVar.E);
        o9bVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return o9bVar;
    }

    public static p9b c(hh3 hh3Var) {
        if (hh3Var == null) {
            return null;
        }
        ImageReceiver imageReceiver = hh3Var.r;
        if (hh3Var.getRootView() == null) {
            return null;
        }
        float f = imageReceiver.N0;
        p9b p9bVar = new p9b(hh3Var, f / 2.0f);
        float[] fArr = new float[2];
        hh3Var.getRootView().getLocationOnScreen(new int[2]);
        gm.p1(hh3Var, (ViewGroup) hh3Var.getRootView(), fArr);
        float f2 = r5[0] + fArr[0] + imageReceiver.L0;
        float f3 = r5[1] + fArr[1] + imageReceiver.M0;
        RectF rectF = p9bVar.c;
        rectF.set(f2, f3, f2 + f, f + f3);
        p9bVar.e = imageReceiver;
        p9bVar.b = Math.max(rectF.width(), rectF.height()) / 2.0f;
        return p9bVar;
    }

    public static o9b d(oab oabVar) {
        a58 currentPeerView;
        g48 g48Var;
        if (oabVar == null) {
            return null;
        }
        o9b o9bVar = new o9b(oabVar, (byte) 1);
        eab eabVar = oabVar.o0;
        if (eabVar == null || (currentPeerView = eabVar.getCurrentPeerView()) == null || (g48Var = currentPeerView.S0) == null) {
            return null;
        }
        cab cabVar = oabVar.s;
        float x = cabVar == null ? 0.0f : cabVar.getX();
        cab cabVar2 = oabVar.s;
        float y = cabVar2 != null ? cabVar2.getY() : 0.0f;
        o9bVar.c.set(g48Var.getX() + currentPeerView.getX() + oabVar.Y + x + oabVar.w.getLeft(), g48Var.getY() + currentPeerView.getY() + oabVar.X + y + oabVar.w.getTop(), (((x + oabVar.Y) + oabVar.w.getRight()) - (oabVar.w.getWidth() - currentPeerView.getRight())) - (currentPeerView.getWidth() - g48Var.getRight()), (((y + oabVar.X) + oabVar.w.getBottom()) - (oabVar.w.getHeight() - currentPeerView.getBottom())) - (currentPeerView.getHeight() - g48Var.getBottom()));
        o9bVar.a = true;
        o9bVar.b = gm.L(8.0f);
        a58 w = oabVar.w();
        if (w != null) {
            o9bVar.f = w.S0;
        }
        return o9bVar;
    }

    public abstract void e();

    public abstract void f(boolean z);

    public void a(Canvas canvas, float f) {
    }
}
