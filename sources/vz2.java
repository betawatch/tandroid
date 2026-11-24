// default package

import android.content.Context;
import android.content.DialogInterface;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vz2 implements DialogInterface.OnDismissListener {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean[] b;
    public final /* synthetic */ boolean[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object h;

    public /* synthetic */ vz2(boolean[] zArr, tn6 tn6Var, boolean[] zArr2, p8c p8cVar, int[] iArr, int i) {
        this.b = zArr;
        this.e = tn6Var;
        this.c = zArr2;
        this.f = p8cVar;
        this.h = iArr;
        this.d = i;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        int i = this.d;
        Object obj3 = this.e;
        boolean[] zArr = this.c;
        boolean[] zArr2 = this.b;
        switch (b) {
            case 0:
                p8c p8cVar = (p8c) obj2;
                int[] iArr = (int[]) obj;
                zArr2[0] = true;
                ((tn6) obj3).run();
                if (!zArr[0]) {
                    zArr[0] = true;
                    p8cVar.a(null);
                }
                if (iArr[0] >= 0) {
                    ConnectionsManager.getInstance(i).cancelRequest(iArr[0], true);
                    iArr[0] = -1;
                    break;
                }
                break;
            default:
                Context context = (Context) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                pt0 pt0Var = (pt0) obj;
                if (!zArr2[0] && !zArr[0]) {
                    zArr[0] = true;
                    y8a.e(context, i, user.id);
                    pt0Var.a(Boolean.TRUE, "cancelled");
                    break;
                }
                break;
        }
    }

    public /* synthetic */ vz2(boolean[] zArr, boolean[] zArr2, Context context, int i, TLRPC.User user, pt0 pt0Var) {
        this.b = zArr;
        this.c = zArr2;
        this.e = context;
        this.d = i;
        this.f = user;
        this.h = pt0Var;
    }
}
