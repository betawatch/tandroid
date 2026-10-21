package t1;

import androidx.fragment.app.s;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
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
