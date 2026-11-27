// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class u10 extends lg5 {
    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i != 0) {
            try {
                ((ViewGroup) getParent()).removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
