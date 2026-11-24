// default package

import java.util.concurrent.ConcurrentLinkedQueue;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class q86 {
    public final l75 a;
    public boolean c;
    public volatile boolean d;
    public Thread e;
    public final ConcurrentLinkedQueue b = new ConcurrentLinkedQueue();
    public long f = 1;

    public q86(l75 l75Var) {
        this.a = l75Var;
    }

    public static boolean a() {
        return DictationAsr.E() && oc7.d1().getBoolean("asr_live_captions", false);
    }
}
