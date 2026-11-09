package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class d0 extends z8 {
    public Drawable D;
    public int E;
    public boolean F;
    public final g6 x;
    public ColorDrawable y;

    public d0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.x = g6Var;
    }

    public void setBackground(boolean z9) {
        Context context = getContext();
        int i7 = z9 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = l6.b7;
        g6 g6Var = this.x;
        Drawable X0 = l6.X0(context, i7, l6.w0(i10, g6Var));
        ColorDrawable colorDrawable = new ColorDrawable(l6.w0(l6.a7, g6Var));
        this.y = colorDrawable;
        this.D = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.x = true;
        setBackground(xpVar);
    }

    @Override // org.telegram.ui.Cells.z8, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            g6 g6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(l6.w0(l6.a7, g6Var));
            }
            if (this.D != null) {
                int w02 = l6.w0(l6.b7, g6Var);
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
