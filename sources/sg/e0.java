package sg;

import android.view.View;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.ic;
import org.telegram.messenger.uz;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class e0 {
    public static Runnable c;
    public static Boolean h;
    public static final HashSet a = new HashSet();
    public static volatile boolean b = false;
    public static boolean d = true;
    public static boolean e = false;
    public static boolean f = false;
    public static boolean g = false;

    public static void a() {
        com.google.android.gms.internal.cast.c0 c0Var = ic.D().p;
        CountDownLatch countDownLatch = (CountDownLatch) c0Var.c;
        if (countDownLatch != null) {
            countDownLatch.countDown();
            c0Var.c = null;
        }
        b = false;
        e = false;
        g = false;
        c = null;
        Iterator it = a.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
        a.clear();
    }

    public static boolean b(View view) {
        if (b) {
            a.add(view);
        }
        return b;
    }

    public static boolean c(View... viewArr) {
        if (h == null) {
            h = Boolean.valueOf(uz.o() != 2);
        }
        if (!h.booleanValue()) {
            return false;
        }
        if (b) {
            a.addAll(Arrays.asList(viewArr));
        }
        return b;
    }

    public static boolean d() {
        return b || e || g;
    }
}
