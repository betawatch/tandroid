package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.e11;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class y3 {
    public final float a;
    public final e11 b;
    public final e11 c;

    public y3(float f7, String str, CharSequence charSequence) {
        this.b = new e11(str, 12.0f, null);
        this.c = new e11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
