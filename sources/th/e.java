package th;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.eq;
import org.telegram.ui.tw;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class e extends eq {
    public int D;
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ tw G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(tw twVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = twVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.eq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        tw twVar = this.G;
        int i10 = twVar.b;
        int f7 = twVar.f(i10 == 0 ? org.telegram.ui.ActionBar.t6.s8 : org.telegram.ui.ActionBar.t6.M8);
        if (this.D != f7) {
            this.D = f7;
            int f10 = i0.b.f(0.1f, twVar.f(i10 == 0 ? org.telegram.ui.ActionBar.t6.A8 : org.telegram.ui.ActionBar.t6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
