// default package

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class r4d extends dzc {
    public final /* synthetic */ byte b = 3;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(kx3 kx3Var) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", (byte) 9);
        this.c = kx3Var;
    }

    @Override // dzc
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        byte b = this.b;
        i5d i5dVar = null;
        a6e a6eVar = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        i5dVar = queryLocalInterface instanceof i5d ? (i5d) queryLocalInterface : new rhf(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                    }
                    sgd.a(parcel);
                    yi6 yi6Var = new yi6(i5dVar);
                    HashMap hashMap = ((ty4) ((ry4) obj).b).b;
                    if (((sy4) hashMap.get(yi6Var)) == null) {
                        hashMap.put(yi6Var, new sy4(yi6Var));
                    }
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    break;
                }
                break;
            case 1:
                if (i == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        a6eVar = queryLocalInterface2 instanceof a6e ? (a6e) queryLocalInterface2 : new a6e(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", (byte) 6);
                    }
                    sgd.a(parcel);
                    vy4 vy4Var = (vy4) obj;
                    wk4 wk4Var = new wk4(a6eVar);
                    gl2 gl2Var = vy4Var.a;
                    vs2 vs2Var = vy4Var.b;
                    ty4 ty4Var = new ty4();
                    ty4Var.b = new HashMap();
                    ty4Var.c = new HashMap();
                    ty4Var.a = wk4Var;
                    vs2Var.accept(ty4Var);
                    gl2Var.n((st) gl2Var.b);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    yi5 T = bo7.T(parcel.readStrongBinder());
                    sgd.a(parcel);
                    ((x32) ((ry4) obj).b).accept((Location) bo7.U(T));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i == 1) {
                    ((s32) ((kx3) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i == 1) {
                    int readInt = parcel.readInt();
                    sgd.a(parcel);
                    zh5 zh5Var = (zh5) ((ry4) obj).b;
                    int i2 = 2;
                    if (readInt != 2) {
                        i2 = 3;
                        if (readInt != 3) {
                            i2 = 1;
                        }
                    }
                    zh5Var.c(i2);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i == 1) {
                    ((t96) ((ry4) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i == 1) {
                    ((s32) ((ry4) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(ry4 ry4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", (byte) 9);
        this.c = ry4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(ry4 ry4Var, byte b) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", (byte) 9);
        this.c = ry4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(ry4 ry4Var, char c) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", (byte) 9);
        this.c = ry4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(ry4 ry4Var, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", (byte) 9);
        this.c = ry4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(ry4 ry4Var, short s) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", (byte) 9);
        this.c = ry4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r4d(vy4 vy4Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", (byte) 9);
        this.c = vy4Var;
    }
}
