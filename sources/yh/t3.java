package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.l11;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class t3 {
    public final float a;
    public final l11 b;
    public final l11 c;

    public t3(float f7, String str, CharSequence charSequence) {
        this.b = new l11(str, 12.0f, null);
        this.c = new l11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
