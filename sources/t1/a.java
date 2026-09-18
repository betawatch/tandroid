package t1;

import androidx.fragment.app.s;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class a extends RuntimeException {
    public final s a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(s fragment, String str) {
        super(str);
        i.e(fragment, "fragment");
        this.a = fragment;
    }
}
