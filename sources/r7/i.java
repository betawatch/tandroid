package r7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.f4;
import org.telegram.messenger.g4;
import org.telegram.messenger.h4;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class i extends a7.a {
    public final /* synthetic */ int b = 0;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 2);
        this.c = cVar;
    }

    @Override // a7.a
    public final boolean H0(int i9, Parcel parcel, Parcel parcel2) {
        c7.a iVar;
        boolean lambda$setOnMarkerClickListener$1;
        s7.f fVar;
        switch (this.b) {
            case 0:
                if (i9 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        iVar = queryLocalInterface instanceof c7.a ? (c7.a) queryLocalInterface : new c7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 1);
                    }
                    c7.b.a(parcel);
                    org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.c, new t7.f(iVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    break;
                }
                break;
            case 1:
                b bVar = (b) this.c;
                if (i9 == 1) {
                    bVar.onFinish();
                } else if (i9 == 2) {
                    bVar.onCancel();
                }
                parcel2.writeNoException();
                break;
            case 2:
                if (i9 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        fVar = queryLocalInterface2 instanceof s7.f ? (s7.f) queryLocalInterface2 : new s7.f(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 1);
                    }
                    c7.b.a(parcel);
                    h4 h4Var = (h4) ((f) this.c);
                    h4Var.a.lambda$getMapAsync$0(h4Var.b, new c(fVar));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i9 == 1) {
                    h6.a J0 = h6.b.J0(parcel.readStrongBinder());
                    c7.b.a(parcel);
                    ((f4) this.c).b.accept((Location) h6.b.K0(J0));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i9 == 1) {
                    ((g4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i9 == 1) {
                    int readInt = parcel.readInt();
                    c7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((org.telegram.messenger.d) this.c).b, readInt);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 6:
                if (i9 == 1) {
                    ((g4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i9 == 1) {
                    ((g4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.messenger.d dVar) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 2);
        this.c = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f4 f4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 2);
        this.c = f4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g4 g4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 2);
        this.c = g4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g4 g4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 2);
        this.c = g4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g4 g4Var, char c10) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 2);
        this.c = g4Var;
    }

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 2);
        this.c = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 2);
        this.c = fVar;
    }
}
