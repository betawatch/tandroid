// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r0a extends g31 {
    public int c;

    @Override // y21, vlb
    public final void updateColors() {
        super.updateColors();
        try {
            int themedColor = getThemedColor(cmb.xj);
            bf0 bf0Var = this.a;
            if (bf0Var != null && themedColor != this.c) {
                this.c = themedColor;
                bf0Var.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }
}
