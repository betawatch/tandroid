// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wva implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ my0[] b;
    public final /* synthetic */ Context c;

    public /* synthetic */ wva(Context context, my0[] my0VarArr) {
        this.a = (byte) 0;
        this.c = context;
        this.b = my0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        my0 my0Var;
        d dVar;
        byte b = this.a;
        Context context = this.c;
        my0[] my0VarArr = this.b;
        switch (b) {
            case 0:
                apa apaVar = new apa(context);
                if (!gm.O1() && !gm.s1(my0VarArr[0].i1) && (my0Var = my0VarArr[0]) != null && (dVar = my0Var.i1) != null) {
                    apaVar.X(dVar);
                }
                apaVar.show();
                break;
            case 1:
                my0VarArr[0].dismiss();
                l11.u(context, jb6.M0(2131751972, null));
                break;
            case 2:
                my0VarArr[0].dismiss();
                l11.w(context, jb6.M0(2131751967, null), false);
                break;
            default:
                my0VarArr[0].dismiss();
                l11.u(context, jb6.M0(2131751964, null));
                break;
        }
    }

    public /* synthetic */ wva(my0[] my0VarArr, Context context, byte b) {
        this.a = b;
        this.b = my0VarArr;
        this.c = context;
    }
}
