package wg;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.e9;
import org.telegram.ui.Components.yq;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class d0 extends e9 {
    public int E;
    public boolean F;
    public final g6 w;
    public ColorDrawable x;
    public Drawable y;

    public d0(Context context, g6 g6Var) {
        super(context, g6Var);
        this.w = g6Var;
    }

    public void setBackground(boolean z10) {
        Context context = getContext();
        int i10 = z10 ? R.drawable.greydivider_bottom : R.drawable.greydivider;
        int i11 = k6.b7;
        g6 g6Var = this.w;
        Drawable W0 = k6.W0(context, i10, k6.w0(i11, g6Var));
        ColorDrawable colorDrawable = new ColorDrawable(k6.w0(k6.a7, g6Var));
        this.x = colorDrawable;
        this.y = W0;
        yq yqVar = new yq(colorDrawable, W0, 0, 0);
        yqVar.w = true;
        setBackground(yqVar);
    }

    @Override // org.telegram.ui.Cells.e9, org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        super.updateColors();
        try {
            ColorDrawable colorDrawable = this.x;
            g6 g6Var = this.w;
            if (colorDrawable != null) {
                colorDrawable.setColor(k6.w0(k6.a7, g6Var));
            }
            if (this.y != null) {
                int w02 = k6.w0(k6.b7, g6Var);
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
