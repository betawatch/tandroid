// default package

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.c;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xy1 implements wv4 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c b;
    public final /* synthetic */ FrameLayout c;

    public /* synthetic */ xy1(c cVar, FrameLayout frameLayout, byte b) {
        this.a = b;
        this.b = cVar;
        this.c = frameLayout;
    }

    @Override // wv4
    public final void b(Canvas canvas) {
        vr1 vr1Var;
        byte b = this.a;
        FrameLayout frameLayout = this.c;
        c cVar = this.b;
        cVar.getClass();
        switch (b) {
            case 0:
                frameLayout.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView = cVar.a;
                ela elaVar = chatActivityEnterView.c2;
                elaVar.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r4[0] - r0[0], r4[1] - r0[1]);
                Drawable backgroundImage = elaVar.getBackgroundImage();
                if (backgroundImage != null) {
                    backgroundImage.draw(canvas);
                }
                yv1 yv1Var = chatActivityEnterView.F3;
                vr1Var = yv1Var != null ? yv1Var.A0 : null;
                if (vr1Var != null && vr1Var.getWidth() > 0) {
                    canvas.translate(vr1Var.getX(), vr1Var.getY());
                    vr1Var.draw(canvas);
                }
                canvas.restore();
                break;
            default:
                frameLayout.getLocationInWindow(new int[2]);
                ChatActivityEnterView chatActivityEnterView2 = cVar.a;
                ela elaVar2 = chatActivityEnterView2.c2;
                elaVar2.getLocationInWindow(new int[2]);
                canvas.save();
                canvas.translate(r4[0] - r0[0], r4[1] - r0[1]);
                Drawable backgroundImage2 = elaVar2.getBackgroundImage();
                if (backgroundImage2 != null) {
                    backgroundImage2.draw(canvas);
                }
                yv1 yv1Var2 = chatActivityEnterView2.F3;
                vr1Var = yv1Var2 != null ? yv1Var2.A0 : null;
                if (vr1Var != null && vr1Var.getWidth() > 0) {
                    canvas.translate(vr1Var.getX(), vr1Var.getY());
                    vr1Var.draw(canvas);
                }
                canvas.restore();
                break;
        }
    }
}
