// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class py9 extends y11 {
    public int c;

    @Override // q11, tjb
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(bkb.xj);
            be0 be0Var = this.a;
            if (be0Var != null && themedColor != this.c) {
                this.c = themedColor;
                be0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }
}
