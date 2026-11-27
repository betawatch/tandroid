// default package

import android.graphics.Canvas;
import android.view.View;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes3.dex */
public final class pcb extends mcb {
    public final ocb a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ qcb d;

    public pcb(qcb qcbVar, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = qcbVar;
        this.b = tL_mediaAreaWeather;
        vwc vwcVar = new vwc();
        vwcVar.c = tL_mediaAreaWeather.emoji;
        vwcVar.d = (float) tL_mediaAreaWeather.temperature_c;
        ocb ocbVar = new ocb(this, a.b, hl.p);
        this.a = ocbVar;
        ocbVar.setMaxWidth(hl.q.x);
        ocbVar.setIsVideo(false);
        ocbVar.d(yac.t0, vwcVar.c);
        ocbVar.setText(vwcVar.a());
        ocbVar.e(3, tL_mediaAreaWeather.color);
        ocbVar.f();
    }

    @Override // mcb
    public final void a(Canvas canvas, float f) {
        qcb qcbVar = this.d;
        double d = qcbVar.b;
        double d2 = qcbVar.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f2 = (float) (((mediaAreaCoordinates.x * d2) / 100.0d) + d);
        double d3 = qcbVar.c;
        double d4 = qcbVar.e;
        float f3 = (float) (((mediaAreaCoordinates.y * d4) / 100.0d) + d3);
        float f4 = (float) ((d2 * mediaAreaCoordinates.w) / 100.0d);
        float f5 = (float) ((d4 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f2, f3);
        ocb ocbVar = this.a;
        float min = Math.min(f4 / ((ocbVar.getWidthInternal() - ocbVar.getPaddingLeft()) - ocbVar.getPaddingRight()), f5 / ((ocbVar.getHeightInternal() - ocbVar.getPaddingTop()) - ocbVar.getPaddingBottom()));
        canvas.scale(min, min);
        double d5 = tL_mediaAreaWeather.coordinates.rotation;
        if (d5 != 0.0d) {
            canvas.rotate((float) d5);
        }
        canvas.translate(((-r2) / 2.0f) - ocbVar.getPaddingLeft(), ((-r3) / 2.0f) - ocbVar.getPaddingTop());
        ocbVar.a(canvas);
        canvas.restore();
    }

    @Override // mcb
    public final void b(boolean z) {
        ocb ocbVar = this.a;
        if (!z) {
            ocbVar.L = false;
            ocbVar.r.K();
            ocbVar.s.K();
        } else {
            ocbVar.L = true;
            if (ocbVar.M) {
                ocbVar.s.I();
            } else {
                ocbVar.r.I();
            }
        }
    }

    @Override // mcb
    public final void c(View view) {
        this.c = view;
    }
}
