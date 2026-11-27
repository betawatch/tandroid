// default package

import android.os.Parcel;
import com.google.android.gms.location.LocationResult;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class uqd extends u3d implements rff {
    public static final /* synthetic */ int c = 0;
    public final rx b;

    public uqd(rx rxVar) {
        super("com.google.android.gms.location.ILocationCallback", (byte) 8);
        this.b = rxVar;
    }

    public final void T() {
        this.b.j().a(new k09(this, (byte) 28));
    }

    public final void U(a86 a86Var) {
        rx rxVar = this.b;
        synchronized (rxVar) {
            a86 a86Var2 = (a86) rxVar.c;
            if (a86Var2 != a86Var) {
                a86Var2.b = null;
                rxVar.c = a86Var;
            }
        }
    }

    @Override // u3d
    public final boolean e(Parcel parcel, int i) {
        byte b = 2;
        rx rxVar = this.b;
        byte b2 = 1;
        if (i == 1) {
            LocationResult locationResult = (LocationResult) ild.a(parcel, LocationResult.CREATOR);
            ild.b(parcel);
            rxVar.j().a(new g9d(locationResult, b));
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            T();
            return true;
        }
        ild.b(parcel);
        rxVar.j().a(new yad(b2));
        return true;
    }
}
