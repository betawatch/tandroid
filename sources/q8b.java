// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class q8b extends n8b {
    public final p8b a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ r8b d;

    public q8b(r8b r8bVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = r8bVar;
        this.b = tL_mediaAreaWeather;
        fsc fscVar = new fsc();
        fscVar.c = tL_mediaAreaWeather.emoji;
        fscVar.d = (float) tL_mediaAreaWeather.temperature_c;
        p8b p8bVar = new p8b(this, a.b, gl.p);
        this.a = p8bVar;
        p8bVar.setMaxWidth(gl.q.x);
        p8bVar.setIsVideo(false);
        p8bVar.d(y6c.t0, fscVar.c);
        p8bVar.setText(fscVar.a());
        p8bVar.e(3, tL_mediaAreaWeather.color);
        p8bVar.f();
    }

    @Override // n8b
    public final void a(Canvas canvas, float f) {
        r8b r8bVar = this.d;
        double d = r8bVar.b;
        double d2 = r8bVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f2 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
        double d3 = r8bVar.c;
        double d4 = r8bVar.e;
        float f3 = (float) (((mediaAreaCoordinates.y * d4) / 100.0d) + d3);
        float f4 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
        float f5 = (float) ((d4 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f2, f3);
        p8b p8bVar = this.a;
        float min = Math.min(f4 / ((p8bVar.getWidthInternal() - p8bVar.getPaddingLeft()) - p8bVar.getPaddingRight()), f5 / ((p8bVar.getHeightInternal() - p8bVar.getPaddingTop()) - p8bVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d5 = tL_mediaAreaWeather.coordinates.rotation;
        if (d5 != 0.0d) {
            canvas.rotate((float) d5);
        }
        canvas.translate(((-r2) / 2.0f) - p8bVar.getPaddingLeft(), ((-r3) / 2.0f) - p8bVar.getPaddingTop());
        p8bVar.a(canvas);
        canvas.restore();
    }

    @Override // n8b
    public final void b(boolean z) {
        p8b p8bVar = this.a;
        if (!z) {
            p8bVar.L = false;
            p8bVar.r.K();
            p8bVar.s.K();
        } else {
            p8bVar.L = true;
            if (p8bVar.M) {
                p8bVar.s.I();
            } else {
                p8bVar.r.I();
            }
        }
    }

    @Override // n8b
    public final void c(View view) {
        this.c = view;
    }
}
