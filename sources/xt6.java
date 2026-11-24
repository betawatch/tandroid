// default package

import android.os.Bundle;
import java.util.ArrayList;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xt6 {
    public ArrayList a = new ArrayList();

    public final void a(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            String str = (String) obj;
            if (str == null) {
                w26.j("category must not be null");
                return;
            }
            ArrayList arrayList2 = this.a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                this.a = arrayList2;
            }
            if (!arrayList2.contains(str)) {
                this.a.add(str);
            }
        }
    }

    public final yt6 b() {
        if (this.a == null) {
            return yt6.c;
        }
        Bundle bundle = new Bundle();
        bundle.putStringArrayList("controlCategories", this.a);
        return new yt6(bundle, this.a);
    }

    public final void c(StringBuilder sb) {
        sb.append(((Boolean) tb4.l(1, this.a)).booleanValue() ? "</ol>" : "</ul>");
    }

    public final void d(StringBuilder sb) {
        while (!this.a.isEmpty()) {
            c(sb);
        }
    }
}
