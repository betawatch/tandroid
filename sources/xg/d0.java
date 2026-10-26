package xg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.ar;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class d0 extends i9 {
    public int E;
    public boolean F;
    public final u6 w;
    public ColorDrawable x;
    public Drawable y;

    public d0(Context context, u6 u6Var) {
        super(context, u6Var);
        this.w = u6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = y6.b7;
        u6 u6Var = this.w;
        Drawable W0 = y6.W0(context, i10, y6.w0(i11, u6Var));
        ColorDrawable colorDrawable = new ColorDrawable(y6.w0(y6.a7, u6Var));
        this.x = colorDrawable;
        this.y = W0;
        ar arVar = new ar(colorDrawable, W0, 0, 0);
        arVar.w = true;
        setBackground(arVar);
    }

    @Override // org.telegram.ui.Cells.i9, org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.x;
            u6 u6Var = this.w;
            if (colorDrawable != null) {
                colorDrawable.setColor(y6.w0(y6.a7, u6Var));
            }
            if (this.y != null) {
                int w02 = y6.w0(y6.b7, u6Var);
                if (w02 == this.E && this.F) {
                    return;
                }
                this.E = w02;
                this.F = true;
                this.y.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
