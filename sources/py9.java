// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
