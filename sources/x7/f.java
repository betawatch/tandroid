package x7;

import android.os.Parcel;
import android.os.RemoteException;
import b6.m;
import g7.i;
import org.telegram.ui.Components.ai;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class f {
    public final g7.a a;

    public f(g7.a aVar) {
        m.h(aVar);
        this.a = aVar;
    }

    public final void a(ai aiVar) {
        g7.a aVar = this.a;
        try {
            l6.a aVar2 = (l6.a) aiVar.b;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, aVar2);
            iVar.Q0(M0, 18);
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        try {
            g7.a aVar = this.a;
            g7.a aVar2 = ((f) obj).a;
            i iVar = (i) aVar;
            Parcel M0 = iVar.M0();
            g7.b.c(M0, aVar2);
            Parcel L0 = iVar.L0(M0, 16);
            boolean z4 = L0.readInt() != 0;
            L0.recycle();
            return z4;
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }

    public final int hashCode() {
        try {
            i iVar = (i) this.a;
            Parcel L0 = iVar.L0(iVar.M0(), 17);
            int readInt = L0.readInt();
            L0.recycle();
            return readInt;
        } catch (RemoteException e6) {
            throw new a7.b(e6);
        }
    }
}
