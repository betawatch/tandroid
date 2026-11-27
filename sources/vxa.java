// default package

import android.content.Context;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class vxa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx0[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ vxa(Context context, nx0[] nx0VarArr) {
        this.a = (byte) 0;
        this.c = context;
        this.b = nx0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nx0 nx0Var;
        e eVar;
        byte b = this.a;
        Context context = this.c;
        nx0[] nx0VarArr = this.b;
        switch (b) {
            case 0:
                wqa wqaVar = new wqa(context);
                if (!hl.O1() && !hl.s1(nx0VarArr[0].i1) && (nx0Var = nx0VarArr[0]) != null && (eVar = nx0Var.i1) != null) {
                    wqaVar.X(eVar);
                }
                wqaVar.show();
                break;
            case 1:
                nx0VarArr[0].dismiss();
                m01.u(context, ob6.M0(2131752000, null));
                break;
            case 2:
                nx0VarArr[0].dismiss();
                m01.w(context, ob6.M0(2131751995, null), false);
                break;
            default:
                nx0VarArr[0].dismiss();
                m01.u(context, ob6.M0(2131751992, null));
                break;
        }
    }

    public /* synthetic */ vxa(nx0[] nx0VarArr, Context context, byte b) {
        this.a = b;
        this.b = nx0VarArr;
        this.c = context;
    }
}
