package t1;

import androidx.fragment.app.r;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
