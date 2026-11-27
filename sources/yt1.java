// default package

import android.view.View;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class yt1 implements mcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rbb b;
    public final /* synthetic */ View c;
    public final /* synthetic */ nx0 d;

    public /* synthetic */ yt1(nx0 nx0Var, rbb rbbVar, View view, byte b) {
        this.a = b;
        this.d = nx0Var;
        this.b = rbbVar;
        this.c = view;
    }

    @Override // mcc
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        kbb kbbVar = null;
        View view = this.c;
        rbb rbbVar = this.b;
        nx0 nx0Var = this.d;
        switch (b) {
            case 0:
                du1 du1Var = (du1) nx0Var;
                Runnable runnable = (Runnable) obj2;
                Long l = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    hl.c3(new jj1(du1Var, l, (byte) 23));
                    du1Var.dismiss();
                    rbbVar.X(null);
                } else {
                    if ((view instanceof nea) && view.isAttachedToWindow()) {
                        kbbVar = mbb.b((nea) view);
                    }
                    rbbVar.X(kbbVar);
                }
                hl.c3(runnable);
                break;
            default:
                wua wuaVar = (wua) nx0Var;
                Runnable runnable2 = (Runnable) obj2;
                Long l2 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    hl.c3(new ida(wuaVar, l2, (byte) 11));
                    rbbVar.X(null);
                    zsa zsaVar = wuaVar.U2;
                    if (zsaVar != null) {
                        zsaVar.dismiss();
                        wuaVar.U2 = null;
                    }
                } else {
                    if ((view instanceof nea) && view.isAttachedToWindow()) {
                        kbbVar = mbb.b((nea) view);
                    }
                    rbbVar.X(kbbVar);
                }
                hl.c3(runnable2);
                break;
        }
    }
}
