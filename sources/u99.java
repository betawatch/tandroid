// default package

import android.content.Context;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class u99 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ylb d;
    public final /* synthetic */ il9 e;

    public /* synthetic */ u99(d dVar, Context context, ylb ylbVar, il9 il9Var, byte b) {
        this.a = b;
        this.b = dVar;
        this.c = context;
        this.d = ylbVar;
        this.e = il9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        il9 il9Var = this.e;
        ylb ylbVar = this.d;
        Context context = this.c;
        d dVar = this.b;
        switch (b) {
            case 0:
                c41.b0(dVar).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 11), ylbVar)).j();
                gm.c3(il9Var);
                break;
            case 1:
                c41.b0(dVar).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 10), ylbVar)).j();
                gm.c3(il9Var);
                break;
            default:
                c41.b0(dVar).c(gm.N2(jb6.M0(2131754484, null), -1, 2, new dh1(context, (byte) 14), ylbVar)).j();
                gm.c3(il9Var);
                break;
        }
    }
}
