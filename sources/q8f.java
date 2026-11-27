// default package

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class q8f {
    public static yjd k;
    public static final xkd l;
    public final String a;
    public final String b;
    public final e8f c;
    public final lja d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();
    public final HashMap j = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        l = new xkd(objArr);
    }

    public q8f(Context context, lja ljaVar, e8f e8fVar) {
        this.a = context.getPackageName();
        this.b = in2.a(context);
        this.d = ljaVar;
        this.c = e8fVar;
        faf.D0();
        this.g = "play-services-mlkit-image-labeling";
        ri6.v();
        this.e = ri6.G(new ug7(this, (byte) 7));
        ri6.v();
        ljaVar.getClass();
        this.f = ri6.G(new z1f(ljaVar, (byte) 2));
        xkd xkdVar = l;
        this.h = xkdVar.containsKey("play-services-mlkit-image-labeling") ? vs3.d(context, (String) xkdVar.get("play-services-mlkit-image-labeling"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final String b() {
        Task task = this.e;
        return task.isSuccessful() ? (String) task.getResult() : v26.c.a(this.g);
    }

    public final boolean c(vxe vxeVar, long j) {
        HashMap hashMap = this.i;
        return hashMap.get(vxeVar) == null || j - ((Long) hashMap.get(vxeVar)).longValue() > 30000;
    }
}
