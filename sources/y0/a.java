package y0;

import kotlin.jvm.internal.i;
import w0.d;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class a extends d {
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(x0.a aVar, String str) {
        super(str, type);
        String type = "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/".concat(aVar.a);
        i.e(type, "type");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
