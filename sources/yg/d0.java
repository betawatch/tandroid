package yg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.fq;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
        int i7 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i10 = j6.b7;
        e6 e6Var = this.x;
        Drawable X0 = j6.X0(context, i7, j6.w0(i10, e6Var));
        ColorDrawable colorDrawable = new ColorDrawable(j6.w0(j6.a7, e6Var));
        this.y = colorDrawable;
        this.E = X0;
        fq fqVar = new fq(colorDrawable, X0, 0, 0);
        fqVar.x = true;
        setBackground(fqVar);
    }

    @Override // org.telegram.ui.Cells.y8, org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.y;
            e6 e6Var = this.x;
            if (colorDrawable != null) {
                colorDrawable.setColor(j6.w0(j6.a7, e6Var));
            }
            if (this.E != null) {
                int w02 = j6.w0(j6.b7, e6Var);
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
