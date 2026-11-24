// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class s79 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ wjb d;
    public final /* synthetic */ tj9 e;

    public /* synthetic */ s79(d dVar, Context context, wjb wjbVar, tj9 tj9Var, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = context;
        this.d = wjbVar;
        this.e = tj9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        tj9 tj9Var = this.e;
        wjb wjbVar = this.d;
        Context context = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                u21.b0(dVar).c(gl.N2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 11), wjbVar)).j();
                gl.c3(tj9Var);
                break;
            case 1:
                u21.b0(dVar).c(gl.N2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 10), wjbVar)).j();
                gl.c3(tj9Var);
                break;
            default:
                u21.b0(dVar).c(gl.N2(k96.M0(2131754484, null), -1, 2, new vf1(context, (byte) 14), wjbVar)).j();
                gl.c3(tj9Var);
                break;
        }
    }
}
