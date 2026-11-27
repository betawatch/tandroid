// default package

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pk4 extends ImageView implements qk4 {
    @Override // qk4
    public void setInvert(float f) {
        setColorFilter(new PorterDuffColorFilter(vm2.f(f, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
