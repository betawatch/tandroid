// default package

import java.util.ArrayList;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class vl3 {
    public final String a;
    public final String[] b;
    public volatile String[] c;
    public volatile String[] d;
    public volatile long e;
    public volatile long f;
    public int g;
    public boolean i;
    public boolean j;
    public volatile float k;
    public final ArrayList h = new ArrayList();
    public final ArrayList l = new ArrayList();

    public vl3(String str, String[] strArr, String[] strArr2, long j) {
        this.a = str;
        this.b = strArr;
        this.c = strArr2;
        this.e = j;
    }

    public final String a(String str) {
        StringBuilder sb = new StringBuilder();
        for (String str2 : str.split(",")) {
            if (sb.length() > 0) {
                sb.append(',');
            }
            sb.append(DictationAsr.g0(this, str2));
        }
        return sb.toString();
    }

    public final String b() {
        return b00.j(new StringBuilder(), this.a, ".tzf");
    }

    public final boolean c(String str) {
        for (String str2 : this.b) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public final String[] d(String str) {
        String[] strArr = this.d != null ? this.d : this.c;
        ArrayList arrayList = new ArrayList();
        for (String str2 : strArr) {
            if (DictationAsr.m(str2).equals(str)) {
                arrayList.add(str2);
            }
        }
        String f0 = DictationAsr.f0(arrayList);
        if (f0 != null) {
            arrayList.remove(f0);
            arrayList.add(0, f0);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }
}
