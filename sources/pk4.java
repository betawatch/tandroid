// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pk4 extends ImageView implements qk4 {
    @Override // qk4
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(on2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
