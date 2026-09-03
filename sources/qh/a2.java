package qh;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.widget.ImageView;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class a2 extends ImageView implements b2 {
    @Override // qh.b2
    public void setInvert(float f10) {
        setColorFilter(new PorterDuffColorFilter(i0.a.d(f10, -1, -16777216), PorterDuff.Mode.MULTIPLY));
    }
}
