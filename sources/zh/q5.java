package zh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.yc;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes4.dex */
public final /* synthetic */ class q5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q5(int i10, Object obj, Object obj2) {
        this.a = i10;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((MessagesController) this.b).processUpdates((TLRPC.Updates) ((TLObject) this.c), false);
                break;
            case 1:
                org.telegram.ui.ActionBar.f3[] f3VarArr = (org.telegram.ui.ActionBar.f3[]) this.b;
                new yc(f3VarArr[0].topBulletinContainer, (org.telegram.ui.ActionBar.f6) this.c).Q(R.raw.copy, 36, LocaleController.getString(R.string.StarsTransactionIDCopied)).k(false);
                break;
            default:
                n8 n8Var = (n8) this.b;
                r5 r5Var = (r5) this.c;
                n8Var.R = true;
                n8Var.o(new o5(r5Var, 2));
                AndroidUtilities.runOnUIThread(new w7(n8Var, 1), 240L);
                break;
        }
    }
}
