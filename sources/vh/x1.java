package vh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x1 extends ImageView implements y1 {
    @Override // vh.y1
    public void setInvert(float f7) {
        setColorFilter(new PorterDuffColorFilter(i0.b.f(f7, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
