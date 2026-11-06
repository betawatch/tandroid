package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class d0 extends z8 {
    public Drawable D;
    public int E;
    public boolean F;
    public final f6 x;
    public ColorDrawable y;

    public d0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.x = f6Var;
    }

    public void setBackground(boolean z9) {
        Context context = getContext();
        int i7 = z9 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = k6.b7;
        f6 f6Var = this.x;
        Drawable X0 = k6.X0(context, i7, k6.w0(i10, f6Var));
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(k6.a7, f6Var));
        this.y = colorDrawable;
        this.D = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.x = true;
        setBackground(xpVar);
    }

    @Override // org.telegram.ui.Cells.z8, org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            f6 f6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(k6.w0(k6.a7, f6Var));
            }
            if (this.D != null) {
                int w02 = k6.w0(k6.b7, f6Var);
                if (w02 == this.E && this.F) {
                    return;
                }
                this.E = w02;
                this.F = true;
                this.D.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
