// default package

import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xu1 implements nac {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v9b b;
    public final /* synthetic */ View c;
    public final /* synthetic */ my0 d;

    public /* synthetic */ xu1(my0 my0Var, v9b v9bVar, View view, byte b) {
        this.a = b;
        this.d = my0Var;
        this.b = v9bVar;
        this.c = view;
    }

    @Override // nac
    public final void a(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        o9b o9bVar = null;
        View view = this.c;
        v9b v9bVar = this.b;
        my0 my0Var = this.d;
        switch (b) {
            case 0:
                cv1 cv1Var = (cv1) my0Var;
                Runnable runnable = (Runnable) obj2;
                Long l = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    gm.c3(new uj1(cv1Var, l, (byte) 24));
                    cv1Var.dismiss();
                    v9bVar.X(null);
                } else {
                    if ((view instanceof wca) && view.isAttachedToWindow()) {
                        o9bVar = q9b.b((wca) view);
                    }
                    v9bVar.X(o9bVar);
                }
                gm.c3(runnable);
                break;
            default:
                wsa wsaVar = (wsa) my0Var;
                Runnable runnable2 = (Runnable) obj2;
                Long l2 = (Long) obj4;
                if (((Boolean) obj3).booleanValue()) {
                    gm.c3(new e6a(wsaVar, l2, (byte) 13));
                    v9bVar.X(null);
                    yqa yqaVar = wsaVar.U2;
                    if (yqaVar != null) {
                        yqaVar.dismiss();
                        wsaVar.U2 = null;
                    }
                } else {
                    if ((view instanceof wca) && view.isAttachedToWindow()) {
                        o9bVar = q9b.b((wca) view);
                    }
                    v9bVar.X(o9bVar);
                }
                gm.c3(runnable2);
                break;
        }
    }
}
