package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a4 b;
    public final /* synthetic */ bo c;
    public final /* synthetic */ long d;

    public /* synthetic */ s1(a4 a4Var, bo boVar, long j3, int i10) {
        this.a = i10;
        this.b = a4Var;
        this.c = boVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.d;
        bo boVar = this.c;
        a4 a4Var = this.b;
        switch (i10) {
            case 0:
                oc M = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, a4Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                oc M2 = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, a4Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
