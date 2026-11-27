// default package

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class w5f {
    public static akf j;
    public static final qmf k;
    public final String a;
    public final String b;
    public final n5f c;
    public final lja d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new qmf(objArr);
    }

    public w5f(Context context, lja ljaVar, n5f n5fVar) {
        this.a = context.getPackageName();
        this.b = in2.a(context);
        this.d = ljaVar;
        this.c = n5fVar;
        z6f.O3();
        this.g = "vision-common";
        ri6.v();
        this.e = ri6.G(new tg7(this, (byte) 6));
        ri6.v();
        ljaVar.getClass();
        this.f = ri6.G(new z1f(ljaVar, (byte) 1));
        qmf qmfVar = k;
        this.h = qmfVar.containsKey("vision-common") ? vs3.d(context, (String) qmfVar.get("vision-common"), false) : -1;
    }
}
