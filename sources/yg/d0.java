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
import org.telegram.ui.Cells.a9;
import org.telegram.ui.Components.oq;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class d0 extends a9 {
    public Drawable E;
    public int F;
    public boolean G;
    public final h6 x;
    public ColorDrawable y;

    public d0(Context context, h6 h6Var) {
        super(context, h6Var);
        this.x = h6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i7 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = m6.b7;
        h6 h6Var = this.x;
        Drawable X0 = m6.X0(context, i7, m6.w0(i10, h6Var));
        ColorDrawable colorDrawable = new ColorDrawable(m6.w0(m6.a7, h6Var));
        this.y = colorDrawable;
        this.E = X0;
        oq oqVar = new oq(colorDrawable, X0, 0, 0);
        oqVar.x = true;
        setBackground(oqVar);
    }

    @Override // org.telegram.ui.Cells.a9, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            h6 h6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(m6.w0(m6.a7, h6Var));
            }
            if (this.E != null) {
                int w02 = m6.w0(m6.b7, h6Var);
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
