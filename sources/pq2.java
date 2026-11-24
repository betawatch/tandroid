// default package

import android.util.SparseArray;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pq2 {
    public static final SparseArray e = new SparseArray();
    public static final ArrayList f = new ArrayList();
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public pq2(int i, int i2) {
        if (i == -2) {
            this.d = true;
            i = -1;
        }
        this.a = i;
        Integer valueOf = Integer.valueOf(i);
        this.b = i2;
        this.c = Objects.hash(0, valueOf, Integer.valueOf(i2));
    }

    public final void a() {
        if (e.indexOfKey(this.c) >= 0) {
            return;
        }
        ArrayList arrayList = f;
        if (arrayList.contains(Integer.valueOf(this.c))) {
            return;
        }
        arrayList.add(Integer.valueOf(this.c));
        Utilities.e.c(new mk2(this, (byte) 8));
    }

    public final int hashCode() {
        return this.c;
    }
}
