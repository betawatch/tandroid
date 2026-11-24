// default package

import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r2b extends FrameLayout implements vlb {
    public ylb a;
    public ShapeDrawable b;
    public View c;

    @Override // vlb
    public final void updateColors() {
        try {
            ShapeDrawable shapeDrawable = this.b;
            if (shapeDrawable != null) {
                cmb.A1(cmb.p1(0.12f, cmb.v0(cmb.Df, this.a)), shapeDrawable);
                View view = this.c;
                if (view != null) {
                    view.invalidate();
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
