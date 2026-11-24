// default package

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class q66 {
    public final n55 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public q66(n55 n55Var) {
        this.a = n55Var;
    }

    public static boolean a() {
        return DictationAsr.E() && na7.c1().getBoolean("asr_live_captions", false);
    }
}
