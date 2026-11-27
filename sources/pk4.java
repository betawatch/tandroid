// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class pk4 extends ImageView implements qk4 {
    @Override // qk4
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(vm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
