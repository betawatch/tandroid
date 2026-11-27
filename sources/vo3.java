// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.a;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class vo3 {
    public static ArrayList j;
    public static vo3 k;
    public static final ArrayList l = new ArrayList();
    public static final tv m = new tv(6);
    public ArrayList a;
    public SparseIntArray b;
    public ArrayList c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public p1 i;

    public static void a(Runnable runnable) {
        if (Thread.currentThread() != a.d.getLooper().getThread()) {
            boolean z = f11.a;
            cc4.g(new RuntimeException("wrong thread"), true);
            return;
        }
        if (j == null) {
            ArrayList arrayList = l;
            if (arrayList.isEmpty()) {
                j = new ArrayList(100);
            } else {
                j = (ArrayList) qd4.l(1, arrayList);
            }
            hl.c3(m);
        }
        j.add(runnable);
    }
}
