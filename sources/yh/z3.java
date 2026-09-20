package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.u01;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final u01 b;
    public final u01 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new u01(str, 12.0f, null);
        this.c = new u01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
