package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.lq;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d0 extends z8 {
    public Drawable E;
    public int F;
    public boolean G;
    public final i6 x;
    public ColorDrawable y;

    public d0(Context context, i6 i6Var) {
        super(context, i6Var);
        this.x = i6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i7 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = n6.b7;
        i6 i6Var = this.x;
        Drawable X0 = n6.X0(context, i7, n6.w0(i10, i6Var));
        ColorDrawable colorDrawable = new ColorDrawable(n6.w0(n6.a7, i6Var));
        this.y = colorDrawable;
        this.E = X0;
        lq lqVar = new lq(colorDrawable, X0, 0, 0);
        lqVar.x = true;
        setBackground(lqVar);
    }

    @Override // org.telegram.ui.Cells.z8, org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            i6 i6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(n6.w0(n6.a7, i6Var));
            }
            if (this.E != null) {
                int w02 = n6.w0(n6.b7, i6Var);
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
