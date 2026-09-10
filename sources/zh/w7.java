package zh;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.hj0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class w7 extends v7 {
    public final a7 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final yg.g0 c;
    public final /* synthetic */ z7 d;

    public w7(z7 z7Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = z7Var;
        a7 a7Var = new a7(null);
        this.a = a7Var;
        yg.g0 g0Var = new yg.g0(null);
        this.c = g0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            a7Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            a7Var.a();
        }
        g0Var.i = true;
        g0Var.e(yg.p0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // zh.v7
    public final void a(Canvas canvas, float f7) {
        yg.g0 g0Var = this.c;
        org.telegram.ui.Components.p5 p5Var = g0Var.b;
        ImageReceiver imageReceiver = p5Var != null ? p5Var.k : g0Var.a;
        if (imageReceiver != null && imageReceiver.hasImageSet() && imageReceiver.hasImageLoaded()) {
            hj0 lottieAnimation = imageReceiver.getLottieAnimation();
            if (lottieAnimation == null || !lottieAnimation.y()) {
                z7 z7Var = this.d;
                double d = z7Var.b;
                double d10 = z7Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = z7Var.c;
                double d12 = z7Var.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                a7 a7Var = this.a;
                a7Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                a7Var.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = AndroidUtilities.rectTmp2;
                float height = (a7Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (a7Var.getBounds().centerX() - height), (int) (a7Var.getBounds().centerY() - height), (int) (a7Var.getBounds().centerX() + height), (int) (a7Var.getBounds().centerY() + height));
                a7Var.c(1.0f);
                a7Var.draw(canvas);
                g0Var.c(rect);
                g0Var.h = f7;
                g0Var.d(a7Var.a == 1 ? -1 : -16777216);
                g0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // zh.v7
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // zh.v7
    public final void c(View view) {
        yg.g0 g0Var = this.c;
        if (g0Var.f == view) {
            return;
        }
        if (!g0Var.g) {
            g0Var.f = view;
            return;
        }
        g0Var.b(false);
        g0Var.f = view;
        g0Var.b(true);
    }
}
