package th;

import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import org.telegram.ui.Components.eq;
import org.telegram.ui.uw;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class e extends eq {
    public int D;
    public final /* synthetic */ Drawable E;
    public final /* synthetic */ Drawable F;
    public final /* synthetic */ uw G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(uw uwVar, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super(drawable, drawable2);
        this.G = uwVar;
        this.E = drawable3;
        this.F = drawable4;
    }

    @Override // org.telegram.ui.Components.eq, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        uw uwVar = this.G;
        int i10 = uwVar.b;
        int f7 = uwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.t6.s8 : org.telegram.ui.ActionBar.t6.M8);
        if (this.D != f7) {
            this.D = f7;
            int f10 = i0.b.f(0.1f, uwVar.f(i10 == 0 ? org.telegram.ui.ActionBar.t6.A8 : org.telegram.ui.ActionBar.t6.P8), f7);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            this.E.setColorFilter(new PorterDuffColorFilter(f10, mode));
            this.F.setColorFilter(new PorterDuffColorFilter(f7, mode));
        }
        super.draw(canvas);
    }
}
