package v7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import java.util.HashMap;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class c {
    public final w7.f a;
    public h b;

    public c(w7.f fVar) {
        new HashMap();
        m.h(fVar);
        this.a = fVar;
    }

    public final void a(int i10) {
        try {
            w7.f fVar = this.a;
            Parcel M0 = fVar.M0();
            M0.writeInt(i10);
            fVar.Q0(M0, 16);
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }
}
