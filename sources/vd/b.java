package vd;

import com.google.android.gms.common.api.internal.m1;
import java.util.Random;
import kotlin.jvm.internal.i;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class b extends a {
    public final m1 b = new m1(2);

    @Override // vd.a
    public final Random a() {
        Object obj = this.b.get();
        i.d(obj, "get(...)");
        return (Random) obj;
    }
}
