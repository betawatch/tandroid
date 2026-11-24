// default package

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t6d extends e1d {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(wx4 wx4Var) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", (byte) 9);
        this.c = wx4Var;
    }

    @Override // e1d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        byte b = this.b;
        k7d k7dVar = null;
        d8e d8eVar = null;
        Object obj = this.c;
        switch (b) {
            case 0:
                if (i == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        k7dVar = queryLocalInterface instanceof k7d ? (k7d) queryLocalInterface : new sjf(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", (byte) 6);
                    }
                    tid.a(parcel);
                    bl6 bl6Var = new bl6(k7dVar);
                    HashMap hashMap = ((s05) ((wx4) obj).b).b;
                    if (((r05) hashMap.get(bl6Var)) == null) {
                        hashMap.put(bl6Var, new r05(bl6Var));
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
                        d8eVar = queryLocalInterface2 instanceof d8e ? (d8e) queryLocalInterface2 : new d8e(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", (byte) 6);
                    }
                    tid.a(parcel);
                    u05 u05Var = (u05) obj;
                    wm4 wm4Var = new wm4(d8eVar);
                    sm2 sm2Var = u05Var.a;
                    gu2 gu2Var = u05Var.b;
                    s05 s05Var = new s05();
                    s05Var.b = new HashMap();
                    s05Var.c = new HashMap();
                    s05Var.a = wm4Var;
                    gu2Var.accept(s05Var);
                    sm2Var.u((su) sm2Var.b);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 2:
                if (i == 1) {
                    xk5 T = eq7.T(parcel.readStrongBinder());
                    tid.a(parcel);
                    ((i52) ((wx4) obj).b).accept((Location) eq7.U(T));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i == 1) {
                    ((d52) ((wx4) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i == 1) {
                    int readInt = parcel.readInt();
                    tid.a(parcel);
                    yj5 yj5Var = (yj5) ((wx4) obj).b;
                    int i2 = 2;
                    if (readInt != 2) {
                        i2 = 3;
                        if (readInt != 3) {
                            i2 = 1;
                        }
                    }
                    yj5Var.c(i2);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i == 1) {
                    ((sb6) ((wx4) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i == 1) {
                    ((d52) ((wx4) obj).b).run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(wx4 wx4Var, byte b) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", (byte) 9);
        this.c = wx4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(wx4 wx4Var, byte b, boolean z) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", (byte) 9);
        this.c = wx4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(wx4 wx4Var, char c) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", (byte) 9);
        this.c = wx4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(wx4 wx4Var, int i) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", (byte) 9);
        this.c = wx4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(wx4 wx4Var, short s) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", (byte) 9);
        this.c = wx4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t6d(u05 u05Var) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", (byte) 9);
        this.c = u05Var;
    }
}
