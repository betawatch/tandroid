// default package

import java.util.Arrays;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class roa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ woa b;

    public /* synthetic */ roa(woa woaVar, byte b) {
        this.a = b;
        this.b = woaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wa waVar;
        l9c l9cVar;
        byte b = this.a;
        woa woaVar = this.b;
        switch (b) {
            case 0:
                if (!Arrays.equals(woaVar.n, DictationAsr.I()) && woaVar.getParentActivity() != null && woaVar.a != null) {
                    woaVar.d0(woaVar.getParentActivity());
                    woaVar.a.g3.O(true);
                    break;
                } else if (woaVar.s != DictationAsr.l() && (waVar = woaVar.a) != null && (l9cVar = waVar.g3) != null) {
                    l9cVar.O(true);
                    break;
                } else {
                    woaVar.f0();
                    break;
                }
            default:
                woaVar.showDialog(new xk8((e) woaVar, 8, true));
                break;
        }
    }
}
