package y0;

import w0.i;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class b extends i {
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(x0.a aVar, String str) {
        super(str, type);
        String type = "androidx.credentials.TYPE_GET_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.a);
        kotlin.jvm.internal.i.e(type, "type");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
