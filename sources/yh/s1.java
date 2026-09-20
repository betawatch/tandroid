package yh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.xc;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ y3 b;
    public final /* synthetic */ zn c;
    public final /* synthetic */ long d;

    public /* synthetic */ s1(y3 y3Var, zn znVar, long j3, int i10) {
        this.a = i10;
        this.b = y3Var;
        this.c = znVar;
        this.d = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        long j3 = this.d;
        zn znVar = this.c;
        y3 y3Var = this.b;
        switch (i10) {
            case 0:
                pc M = xc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M.t = true;
                M.j();
                break;
            default:
                pc M2 = xc.a0(znVar).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, y3Var.C1(), DialogObject.getShortName(j3))), R.raw.forward);
                M2.t = true;
                M2.j();
                break;
        }
    }
}
