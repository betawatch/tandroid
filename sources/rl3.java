// default package

import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
