// default package

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.Task;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class sef {
    public static tdd k;
    public static final med l;
    public final String a;
    public final String b;
    public final nef c;
    public final sfa d;
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
        l = new med(objArr);
    }

    public sef(Context context, sfa sfaVar, nef nefVar) {
        this.a = context.getPackageName();
        this.b = om2.a(context);
        this.d = sfaVar;
        this.c = nefVar;
        cff.R();
        this.g = "subject-segmentation";
        l69.x();
        this.e = l69.I(new ke7(this, (byte) 9));
        l69.x();
        sfaVar.getClass();
        this.f = l69.I(new ixe(sfaVar, (byte) 4));
        med medVar = l;
        this.h = medVar.containsKey("subject-segmentation") ? ds3.d(context, (String) medVar.get("subject-segmentation"), false) : -1;
    }

    public static long a(ArrayList arrayList, double d) {
        return ((Long) arrayList.get(Math.max(((int) Math.ceil((d / 100.0d) * arrayList.size())) - 1, 0))).longValue();
    }

    public final void b(qef qefVar, p5f p5fVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (d(p5fVar, elapsedRealtime)) {
            this.i.put(p5fVar, Long.valueOf(elapsedRealtime));
            yjb.c(1, new vc1(this, qefVar.zza(), p5fVar, c(), (byte) 4));
        }
    }

    public final String c() {
        Task task = this.e;
        if (task.isSuccessful()) {
            return (String) task.getResult();
        }
        return r06.c.a(this.g);
    }

    public final boolean d(p5f p5fVar, long j) {
        HashMap hashMap = this.i;
        return hashMap.get(p5fVar) == null || j - ((Long) hashMap.get(p5fVar)).longValue() > 30000;
    }
}
