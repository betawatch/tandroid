package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.f01;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes4.dex */
public final class x3 {
    public final float a;
    public final f01 b;
    public final f01 c;

    public x3(float f7, String str, CharSequence charSequence) {
        this.b = new f01(str, 12.0f, null);
        this.c = new f01(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
