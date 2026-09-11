package z9;

import bb.i;
import cf.c;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.hh1;
import q9.d;
import za.c0;
import za.i0;
import za.l;
import za.m0;
import za.s;
import zh.w3;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements d, a2 {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // q9.d
    public Object D(c cVar) {
        l lVar;
        i0 i0Var;
        c0 c0Var;
        i iVar;
        s sVar;
        m0 m0Var;
        switch (this.a) {
            case 7:
                lVar = FirebaseSessionsRegistrar.getComponents$lambda-0(cVar);
                return lVar;
            case 8:
                i0Var = FirebaseSessionsRegistrar.getComponents$lambda-1(cVar);
                return i0Var;
            case 9:
                c0Var = FirebaseSessionsRegistrar.getComponents$lambda-2(cVar);
                return c0Var;
            case 10:
                iVar = FirebaseSessionsRegistrar.getComponents$lambda-3(cVar);
                return iVar;
            case 11:
                sVar = FirebaseSessionsRegistrar.getComponents$lambda-4(cVar);
                return sVar;
            default:
                m0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(cVar);
                return m0Var;
        }
    }

    @Override // org.telegram.ui.ActionBar.a2
    public void g(b2 b2Var, int i10) {
        switch (this.a) {
            case 13:
                w3.d2(new hh1(6, null));
                break;
            default:
                int i11 = w3.q1;
                break;
        }
    }

    public /* synthetic */ a(w3 w3Var) {
        this.a = 13;
    }
}
