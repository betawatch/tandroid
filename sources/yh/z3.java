package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f11;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class z3 {
    public final float a;
    public final f11 b;
    public final f11 c;

    public z3(float f7, String str, CharSequence charSequence) {
        this.b = new f11(str, 12.0f, null);
        this.c = new f11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
