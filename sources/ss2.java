// default package

import android.content.ContentResolver;
import android.net.Uri;
import android.util.Log;
import java.util.HashMap;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ss2 implements g8d {
    public String a;

    public /* synthetic */ ss2(String str) {
        this.a = str;
    }

    public static ss2 a(xu7 xu7Var) {
        String str;
        xu7Var.O(2);
        int A = xu7Var.A();
        int i = A >> 1;
        int A2 = ((A & 1) << 5) | ((xu7Var.A() >> 3) & 31);
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(i < 10 ? ".0" : ".");
        sb.append(i);
        sb.append(A2 < 10 ? ".0" : ".");
        sb.append(A2);
        return new ss2(sb.toString());
    }

    @Override // g8d
    public final Object zzp() {
        Object obj;
        boolean z;
        String str = this.a;
        ContentResolver contentResolver = g6d.g.getContentResolver();
        Uri uri = qhf.a;
        synchronized (qhf.class) {
            qhf.c(contentResolver);
            obj = qhf.k;
        }
        HashMap hashMap = qhf.g;
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = (Boolean) qhf.a(hashMap, str, bool);
        if (bool2 != null) {
            z = bool2.booleanValue();
        } else {
            String b = qhf.b(contentResolver, str);
            boolean z2 = false;
            if (b != null && !b.equals("")) {
                if (qhf.c.matcher(b).matches()) {
                    bool = Boolean.TRUE;
                    z2 = true;
                } else if (!qhf.d.matcher(b).matches()) {
                    Log.w("Gservices", b00.i("attempt to read gservices key ", str, " (value \"", b, "\") as boolean"));
                }
                qhf.e(obj, hashMap, str, bool);
                z = z2;
            }
            bool = bool2;
            qhf.e(obj, hashMap, str, bool);
            z = z2;
        }
        return Boolean.valueOf(z);
    }
}
