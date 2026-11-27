// default package

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
