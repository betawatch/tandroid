// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class t20 extends ig5 {
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
