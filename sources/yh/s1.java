package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z3 b;
    public final /* synthetic */ bo c;
    public final /* synthetic */ long d;

    public /* synthetic */ s1(z3 z3Var, bo boVar, long j3, int i10) {
        this.a = i10;
        this.b = z3Var;
        this.c = boVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.d;
        bo boVar = this.c;
        z3 z3Var = this.b;
        switch (i10) {
            case 0:
                oc M = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, z3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                oc M2 = vc.a0(boVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, z3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
