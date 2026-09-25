package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ x3 b;
    public final /* synthetic */ wn c;
    public final /* synthetic */ long d;

    public /* synthetic */ s1(x3 x3Var, wn wnVar, long j3, int i10) {
        this.a = i10;
        this.b = x3Var;
        this.c = wnVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.d;
        wn wnVar = this.c;
        x3 x3Var = this.b;
        switch (i10) {
            case 0:
                qc M = xc.a0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                qc M2 = xc.a0(wnVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, x3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
