package th;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bi0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class q7 extends p7 {
    public final u6 a;
    public final TL_stories.TL_mediaAreaSuggestedReaction b;
    public final sg.f0 c;
    public final /* synthetic */ t7 d;

    public q7(t7 t7Var, TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction) {
        this.d = t7Var;
        u6 u6Var = new u6(null);
        this.a = u6Var;
        sg.f0 f0Var = new sg.f0(null);
        this.c = f0Var;
        this.b = tL_mediaAreaSuggestedReaction;
        if (tL_mediaAreaSuggestedReaction.flipped) {
            u6Var.b(true, false);
        }
        if (tL_mediaAreaSuggestedReaction.dark) {
            u6Var.a();
        }
        f0Var.i = true;
        f0Var.e(sg.o0.d(tL_mediaAreaSuggestedReaction.reaction));
    }

    @Override // th.p7
    public final void a(Canvas canvas, float f7) {
        sg.f0 f0Var = this.c;
        org.telegram.ui.Components.f5 f5Var = f0Var.b;
        ImageReceiver imageReceiver = f5Var != null ? f5Var.k : f0Var.a;
        if (imageReceiver != null && imageReceiver.K() && imageReceiver.J()) {
            bi0 B = imageReceiver.B();
            if (B == null || !B.y()) {
                t7 t7Var = this.d;
                double d = t7Var.b;
                double d10 = t7Var.d;
                TL_stories.TL_mediaAreaSuggestedReaction tL_mediaAreaSuggestedReaction = this.b;
                TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaSuggestedReaction.coordinates;
                float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
                double d11 = t7Var.c;
                double d12 = t7Var.e;
                float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
                float f12 = ((float) ((d10 * mediaAreaCoordinates.w) / 100.0d)) / 2.0f;
                float f13 = ((float) ((d12 * mediaAreaCoordinates.h) / 100.0d)) / 2.0f;
                u6 u6Var = this.a;
                u6Var.setBounds((int) (f10 - f12), (int) (f11 - f13), (int) (f12 + f10), (int) (f13 + f11));
                u6Var.e = (int) (255.0f * f7);
                canvas.save();
                double d13 = tL_mediaAreaSuggestedReaction.coordinates.rotation;
                if (d13 != 0.0d) {
                    canvas.rotate((float) d13, f10, f11);
                }
                Rect rect = org.telegram.messenger.i0.Q;
                float height = (u6Var.getBounds().height() * 0.61f) / 2.0f;
                rect.set((int) (u6Var.getBounds().centerX() - height), (int) (u6Var.getBounds().centerY() - height), (int) (u6Var.getBounds().centerX() + height), (int) (u6Var.getBounds().centerY() + height));
                u6Var.c(1.0f);
                u6Var.draw(canvas);
                f0Var.c(rect);
                f0Var.h = f7;
                f0Var.d(u6Var.a == 1 ? -1 : -16777216);
                f0Var.a(canvas);
                canvas.restore();
            }
        }
    }

    @Override // th.p7
    public final void b(boolean z10) {
        this.c.b(z10);
    }

    @Override // th.p7
    public final void c(View view) {
        sg.f0 f0Var = this.c;
        if (f0Var.f == view) {
            return;
        }
        if (!f0Var.g) {
            f0Var.f = view;
            return;
        }
        f0Var.b(false);
        f0Var.f = view;
        f0Var.b(true);
    }
}
