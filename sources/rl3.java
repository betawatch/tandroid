// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class rl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vl3 b;

    public /* synthetic */ rl3(vl3 vl3Var, byte b) {
        this.a = b;
        this.b = vl3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        vl3 vl3Var = this.b;
        switch (b) {
            case 0:
                DictationAsr.H(vl3Var);
                break;
            default:
                DictationAsr.H(vl3Var);
                break;
        }
    }
}
