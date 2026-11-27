// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class pk4 extends ImageView implements qk4 {
    @Override // qk4
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(vm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
