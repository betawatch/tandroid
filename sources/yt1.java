// default package

import android.view.View;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class yt1 implements mcc {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sbb b;
    public final /* synthetic */ View c;
    public final /* synthetic */ nx0 d;

    public /* synthetic */ yt1(nx0 nx0Var, sbb sbbVar, View view, byte b) {
        this.a = b;
        this.d = nx0Var;
        this.b = sbbVar;
        this.c = view;
    }

    @Override // mcc
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        lbb lbbVar = null;
        View view = this.c;
        sbb sbbVar = this.b;
        nx0 nx0Var = this.d;
        switch (b) {
            case 0:
                du1 du1Var = (du1) nx0Var;
                Runnable runnable = (Runnable) obj2;
                Long l = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    hl.c3(new jj1(du1Var, l, (byte) 23));
                    du1Var.dismiss();
                    sbbVar.X(null);
                } else {
                    if ((view instanceof nea) && view.isAttachedToWindow()) {
                        lbbVar = nbb.b((nea) view);
                    }
                    sbbVar.X(lbbVar);
                }
                hl.c3(runnable);
                break;
            default:
                wua wuaVar = (wua) nx0Var;
                Runnable runnable2 = (Runnable) obj2;
                Long l2 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    hl.c3(new kba(wuaVar, l2, (byte) 12));
                    sbbVar.X(null);
                    zsa zsaVar = wuaVar.U2;
                    if (zsaVar != null) {
                        zsaVar.dismiss();
                        wuaVar.U2 = null;
                    }
                } else {
                    if ((view instanceof nea) && view.isAttachedToWindow()) {
                        lbbVar = nbb.b((nea) view);
                    }
                    sbbVar.X(lbbVar);
                }
                hl.c3(runnable2);
                break;
        }
    }
}
