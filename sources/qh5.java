// default package

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class qh5 {
    public final ph5 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public qh5(ph5 ph5Var, String str, Uri uri, int i) {
        this.a = ph5Var;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public final bp5 a() {
        return bp5.q(this.b.keySet());
    }

    public final Uri b() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
