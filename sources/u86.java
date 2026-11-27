// default package

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class u86 {
    public final p75 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public u86(p75 p75Var) {
        this.a = p75Var;
    }

    public static boolean a() {
        return DictationAsr.G() && uc7.e1().getBoolean("asr_live_captions", false);
    }
}
