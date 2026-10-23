package t1;

import androidx.fragment.app.s;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
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
