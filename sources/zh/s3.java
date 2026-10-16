package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.i11;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class s3 {
    public final float a;
    public final i11 b;
    public final i11 c;

    public s3(float f7, String str, CharSequence charSequence) {
        this.b = new i11(str, 12.0f, null);
        this.c = new i11(charSequence, 12.0f, AndroidUtilities.bold());
        this.a = (a() / 2.0f) + f7;
    }

    public final float a() {
        return Math.max(this.b.j(), this.c.j());
    }
}
