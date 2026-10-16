package t1;

import androidx.fragment.app.r;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a extends RuntimeException {
    public final r a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r fragment, String str) {
        super(str);
        i.e(fragment, "fragment");
        this.a = fragment;
    }
}
