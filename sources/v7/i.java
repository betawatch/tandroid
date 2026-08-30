package v7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.i4;
import org.telegram.messenger.j4;
import org.telegram.messenger.k4;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes.dex */
public final class i extends a7.c {
    public final /* synthetic */ int b = 0;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 6);
        this.c = cVar;
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        g7.a iVar;
        boolean lambda$setOnMarkerClickListener$1;
        w7.f fVar;
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        iVar = queryLocalInterface instanceof g7.a ? (g7.a) queryLocalInterface : new g7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 5);
                    }
                    g7.b.a(parcel);
                    org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.c, new x7.f(iVar));
                    parcel2.writeNoException();
                    parcel2.writeInt(lambda$setOnMarkerClickListener$1 ? 1 : 0);
                    break;
                }
                break;
            case 1:
                b bVar = (b) this.c;
                if (i10 == 1) {
                    bVar.onFinish();
                } else if (i10 == 2) {
                    bVar.onCancel();
                }
                parcel2.writeNoException();
                break;
            case 2:
                if (i10 == 1) {
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 == null) {
                        fVar = null;
                    } else {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                        fVar = queryLocalInterface2 instanceof w7.f ? (w7.f) queryLocalInterface2 : new w7.f(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 5);
                    }
                    g7.b.a(parcel);
                    k4 k4Var = (k4) ((f) this.c);
                    k4Var.a.lambda$getMapAsync$0(k4Var.b, new c(fVar));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    l6.a J0 = l6.b.J0(parcel.readStrongBinder());
                    g7.b.a(parcel);
                    ((i4) this.c).b.accept((Location) l6.b.K0(J0));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i10 == 1) {
                    ((j4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    g7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((org.telegram.messenger.d) this.c).b, readInt);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    ((j4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    ((j4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.messenger.d dVar) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 6);
        this.c = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i4 i4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 6);
        this.c = i4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j4 j4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 6);
        this.c = j4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j4 j4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 6);
        this.c = j4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j4 j4Var, char c3) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 6);
        this.c = j4Var;
    }

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 6);
        this.c = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 6);
        this.c = fVar;
    }
}
