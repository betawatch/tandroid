package t7;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import org.telegram.messenger.GoogleMapsProvider;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.h4;
import org.telegram.messenger.i4;
import org.telegram.messenger.j4;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class i extends c7.a {
    public final /* synthetic */ int b = 0;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.messenger.c cVar) {
        super("com.google.android.gms.maps.internal.IOnMarkerClickListener", 5);
        this.c = cVar;
    }

    @Override // c7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        e7.a iVar;
        boolean lambda$setOnMarkerClickListener$1;
        u7.f fVar;
        switch (this.b) {
            case 0:
                if (i10 == 1) {
                    IBinder readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder == null) {
                        iVar = null;
                    } else {
                        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
                        iVar = queryLocalInterface instanceof e7.a ? (e7.a) queryLocalInterface : new e7.i(readStrongBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate", 4);
                    }
                    e7.b.a(parcel);
                    org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.c;
                    lambda$setOnMarkerClickListener$1 = ((GoogleMapsProvider.GoogleMapImpl) cVar.b).lambda$setOnMarkerClickListener$1((IMapsProvider.OnMarkerClickListener) cVar.c, new v7.f(iVar));
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
                        fVar = queryLocalInterface2 instanceof u7.f ? (u7.f) queryLocalInterface2 : new u7.f(readStrongBinder2, "com.google.android.gms.maps.internal.IGoogleMapDelegate", 4);
                    }
                    e7.b.a(parcel);
                    j4 j4Var = (j4) ((f) this.c);
                    j4Var.a.lambda$getMapAsync$0(j4Var.b, new c(fVar));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 3:
                if (i10 == 1) {
                    j6.a J0 = j6.b.J0(parcel.readStrongBinder());
                    e7.b.a(parcel);
                    ((h4) this.c).b.accept((Location) j6.b.K0(J0));
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 4:
                if (i10 == 1) {
                    ((i4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 5:
                if (i10 == 1) {
                    int readInt = parcel.readInt();
                    e7.b.a(parcel);
                    GoogleMapsProvider.GoogleMapImpl.lambda$setOnCameraMoveStartedListener$0((IMapsProvider.OnCameraMoveStartedListener) ((org.telegram.messenger.d) this.c).b, readInt);
                    parcel2.writeNoException();
                    break;
                }
                break;
            case 6:
                if (i10 == 1) {
                    ((i4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    ((i4) this.c).a.run();
                    parcel2.writeNoException();
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(org.telegram.messenger.d dVar) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener", 5);
        this.c = dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(h4 h4Var) {
        super("com.google.android.gms.maps.internal.IOnMyLocationChangeListener", 5);
        this.c = h4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i4 i4Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveListener", 5);
        this.c = i4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i4 i4Var, byte b10) {
        super("com.google.android.gms.maps.internal.IOnMapLoadedCallback", 5);
        this.c = i4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(i4 i4Var, char c3) {
        super("com.google.android.gms.maps.internal.IOnCameraIdleListener", 5);
        this.c = i4Var;
    }

    public i(b bVar) {
        super("com.google.android.gms.maps.internal.ICancelableCallback", 5);
        this.c = bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(f fVar) {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback", 5);
        this.c = fVar;
    }
}
