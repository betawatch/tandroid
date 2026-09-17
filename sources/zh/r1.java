package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.yc;
import org.telegram.ui.co;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ w3 b;
    public final /* synthetic */ co c;
    public final /* synthetic */ long d;

    public /* synthetic */ r1(w3 w3Var, co coVar, long j3, int i10) {
        this.a = i10;
        this.b = w3Var;
        this.c = coVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.d;
        co coVar = this.c;
        w3 w3Var = this.b;
        switch (i10) {
            case 0:
                qc M = yc.a0(coVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, w3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                qc M2 = yc.a0(coVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, w3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
