package zg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class d0 extends y8 {
    public Drawable E;
    public int F;
    public boolean G;
    public final e6 x;
    public ColorDrawable y;

    public d0(Context context, e6 e6Var) {
        super(context, e6Var);
        this.x = e6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i3 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = k6.b7;
        e6 e6Var = this.x;
        Drawable X0 = k6.X0(context, i3, k6.w0(i10, e6Var));
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(k6.a7, e6Var));
        this.y = colorDrawable;
        this.E = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.x = true;
        setBackground(xpVar);
    }

    @Override // org.telegram.ui.Cells.y8, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            e6 e6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(k6.w0(k6.a7, e6Var));
            }
            if (this.E != null) {
                int w02 = k6.w0(k6.b7, e6Var);
                if (w02 == this.F && this.G) {
                    return;
                }
                this.F = w02;
                this.G = true;
                this.E.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }
}
