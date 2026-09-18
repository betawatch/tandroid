package t1;

import androidx.fragment.app.s;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
