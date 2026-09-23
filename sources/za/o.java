package za;

import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final /* synthetic */ class o implements q9.d, i5.e {
    @Override // q9.d
    public Object G(cf.c cVar) {
        o0 o0Var;
        o0Var = FirebaseSessionsRegistrar.getComponents$lambda-5(cVar);
        return o0Var;
    }

    @Override // i5.e
    public Object apply(Object obj) {
        wa.e eVar = (wa.e) obj;
        eVar.getClass();
        aa.a aVar = com.google.firebase.messaging.r.a;
        aVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            aVar.j(eVar, byteArrayOutputStream);
        } catch (IOException unused) {
        }
        return byteArrayOutputStream.toByteArray();
    }
}
