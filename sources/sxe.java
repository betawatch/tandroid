// default package

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sxe {
    public static shf j;
    public static final c6d k;
    public final String a;
    public final String b;
    public final zwe c;
    public final sfa d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new c6d(objArr);
    }

    public sxe(Context context, sfa sfaVar, zwe zweVar, String str) {
        this.a = context.getPackageName();
        this.b = om2.a(context);
        this.d = sfaVar;
        this.c = zweVar;
        ize.k();
        this.g = str;
        l69.x();
        this.e = l69.I(new ke7(this, (byte) 5));
        l69.x();
        sfaVar.getClass();
        this.f = l69.I(new ixe(sfaVar, (byte) 0));
        c6d c6dVar = k;
        this.h = c6dVar.containsKey(str) ? ds3.d(context, (String) c6dVar.get(str), false) : -1;
    }
}
