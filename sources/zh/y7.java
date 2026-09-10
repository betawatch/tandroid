package zh;

import android.graphics.Canvas;
import android.view.View;
import bi.df;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class y7 extends v7 {
    public final x7 a;
    public final TL_stories.TL_mediaAreaWeather b;
    public View c;
    public final /* synthetic */ z7 d;

    public y7(z7 z7Var, TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather) {
        this.d = z7Var;
        this.b = tL_mediaAreaWeather;
        df dfVar = new df();
        dfVar.c = tL_mediaAreaWeather.emoji;
        dfVar.d = (float) tL_mediaAreaWeather.temperature_c;
        x7 x7Var = new x7(this, ApplicationLoader.applicationContext, AndroidUtilities.density);
        this.a = x7Var;
        x7Var.setMaxWidth(AndroidUtilities.displaySize.x);
        x7Var.setIsVideo(false);
        x7Var.d(UserConfig.selectedAccount, dfVar.c);
        x7Var.setText(dfVar.a());
        x7Var.e(3, tL_mediaAreaWeather.color);
        x7Var.f();
    }

    @Override // zh.v7
    public final void a(Canvas canvas, float f7) {
        z7 z7Var = this.d;
        double d = z7Var.b;
        double d10 = z7Var.d;
        TL_stories.TL_mediaAreaWeather tL_mediaAreaWeather = this.b;
        TL_stories.MediaAreaCoordinates mediaAreaCoordinates = tL_mediaAreaWeather.coordinates;
        float f10 = (float) (((mediaAreaCoordinates.x * d10) / 100.0d) + d);
        double d11 = z7Var.c;
        double d12 = z7Var.e;
        float f11 = (float) (((mediaAreaCoordinates.y * d12) / 100.0d) + d11);
        float f12 = (float) ((d10 * mediaAreaCoordinates.w) / 100.0d);
        float f13 = (float) ((d12 * mediaAreaCoordinates.h) / 100.0d);
        canvas.save();
        canvas.translate(f10, f11);
        x7 x7Var = this.a;
        float min = Math.min(f12 / ((x7Var.getWidthInternal() - x7Var.getPaddingLeft()) - x7Var.getPaddingRight()), f13 / ((x7Var.getHeightInternal() - x7Var.getPaddingTop()) - x7Var.getPaddingBottom()));
        canvas.scale(min, min);
        double d13 = tL_mediaAreaWeather.coordinates.rotation;
        if (d13 != 0.0d) {
            canvas.rotate((float) d13);
        }
        canvas.translate(((-r3) / 2.0f) - x7Var.getPaddingLeft(), ((-r6) / 2.0f) - x7Var.getPaddingTop());
        x7Var.a(canvas);
        canvas.restore();
    }

    @Override // zh.v7
    public final void b(boolean z10) {
        x7 x7Var = this.a;
        if (!z10) {
            x7Var.K = false;
            x7Var.r.onDetachedFromWindow();
            x7Var.s.onDetachedFromWindow();
        } else {
            x7Var.K = true;
            if (x7Var.L) {
                x7Var.s.onAttachedToWindow();
            } else {
                x7Var.r.onAttachedToWindow();
            }
        }
    }

    @Override // zh.v7
    public final void c(View view) {
        this.c = view;
    }
}
