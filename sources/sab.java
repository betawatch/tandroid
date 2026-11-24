// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class sab extends pab {
    public final rab a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ tab d;

    public sab(tab tabVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = tabVar;
        this.b = tL_mediaAreaWeather;
        iuc iucVar = new iuc();
        iucVar.c = tL_mediaAreaWeather.emoji;
        iucVar.d = (float) tL_mediaAreaWeather.temperature_c;
        rab rabVar = new rab(this, a.b, gm.p);
        this.a = rabVar;
        rabVar.setMaxWidth(gm.q.x);
        rabVar.setIsVideo(false);
        rabVar.d(z8c.t0, iucVar.c);
        rabVar.setText(iucVar.a());
        rabVar.e(3, tL_mediaAreaWeather.color);
        rabVar.f();
    }

    @Override // pab
    public final void a(Canvas canvas, float f) {
        tab tabVar = this.d;
        double d = tabVar.b;
        double d2 = tabVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f2 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
        double d3 = tabVar.c;
        double d4 = tabVar.e;
        float f3 = (float) (((mediaAreaCoordinates.y * d4) / 100.0d) + d3);
        float f4 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
        float f5 = (float) ((d4 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f2, f3);
        rab rabVar = this.a;
        float min = Math.min(f4 / ((rabVar.getWidthInternal() - rabVar.getPaddingLeft()) - rabVar.getPaddingRight()), f5 / ((rabVar.getHeightInternal() - rabVar.getPaddingTop()) - rabVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d5 = tL_mediaAreaWeather.coordinates.rotation;
        if (d5 != 0.0d) {
            canvas.rotate((float) d5);
        }
        canvas.translate(((-r2) / 2.0f) - rabVar.getPaddingLeft(), ((-r3) / 2.0f) - rabVar.getPaddingTop());
        rabVar.a(canvas);
        canvas.restore();
    }

    @Override // pab
    public final void b(boolean z) {
        rab rabVar = this.a;
        if (!z) {
            rabVar.L = false;
            rabVar.r.K();
            rabVar.s.K();
        } else {
            rabVar.L = true;
            if (rabVar.M) {
                rabVar.s.I();
            } else {
                rabVar.r.I();
            }
        }
    }

    @Override // pab
    public final void c(View view) {
        this.c = view;
    }
}
