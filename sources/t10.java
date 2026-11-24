// default package

import android.view.ViewGroup;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class t10 extends ke5 {
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
