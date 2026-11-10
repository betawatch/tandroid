package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.xp;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class d0 extends z8 {
    public Drawable D;
    public int E;
    public boolean F;
    public final h6 x;
    public ColorDrawable y;

    public d0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.x = h6Var;
    }

    public void setBackground(boolean z9) {
        Context context = getContext();
        int i7 = z9 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = m6.b7;
        h6 h6Var = this.x;
        Drawable X0 = m6.X0(context, i7, m6.w0(i10, h6Var));
        ColorDrawable colorDrawable = new ColorDrawable(m6.w0(m6.a7, h6Var));
        this.y = colorDrawable;
        this.D = X0;
        xp xpVar = new xp(colorDrawable, X0, 0, 0);
        xpVar.x = true;
        setBackground(xpVar);
    }

    @Override // org.telegram.ui.Cells.z8, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            h6 h6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(m6.w0(m6.a7, h6Var));
            }
            if (this.D != null) {
                int w02 = m6.w0(m6.b7, h6Var);
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
