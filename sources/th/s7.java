package th;

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.tgnet.tl.TL_stories;
import vh.k9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class s7 extends p7 {
    public final r7 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ t7 d;

    public s7(t7 t7Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = t7Var;
        this.b = tL_mediaAreaWeather;
        k9 k9Var = new k9();
        k9Var.c = tL_mediaAreaWeather.emoji;
        k9Var.d = (float) tL_mediaAreaWeather.temperature_c;
        r7 r7Var = new r7(this, org.telegram.messenger.w0.b, org.telegram.messenger.i0.p);
        this.a = r7Var;
        r7Var.setMaxWidth(org.telegram.messenger.i0.q.x);
        r7Var.setIsVideo(false);
        r7Var.d(d20.s0, k9Var.c);
        r7Var.setText(k9Var.a());
        r7Var.e(3, tL_mediaAreaWeather.color);
        r7Var.f();
    }

    @Override // th.p7
    public final void a(Canvas canvas, float f7) {
        t7 t7Var = this.d;
        double d = t7Var.b;
        double d10 = t7Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = t7Var.c;
        double d12 = t7Var.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        r7 r7Var = this.a;
        float min = Math.min(f12 / ((r7Var.getWidthInternal() - r7Var.getPaddingLeft()) - r7Var.getPaddingRight()), f13 / ((r7Var.getHeightInternal() - r7Var.getPaddingTop()) - r7Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - r7Var.getPaddingLeft(), ((-r6) / 2.0f) - r7Var.getPaddingTop());
        r7Var.a(canvas);
        canvas.restore();
    }

    @Override // th.p7
    public final void b(boolean z10) {
        r7 r7Var = this.a;
        if (!z10) {
            r7Var.K = false;
            r7Var.r.R();
            r7Var.s.R();
        } else {
            r7Var.K = true;
            if (r7Var.L) {
                r7Var.s.P();
            } else {
                r7Var.r.P();
            }
        }
    }

    @Override // th.p7
    public final void c(View view) {
        this.c = view;
    }
}
