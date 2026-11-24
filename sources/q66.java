// default package

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
