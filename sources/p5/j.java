package p5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import l3.g0;
import nh.d6;
import o5.e0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class j extends c7.a {
    public final /* synthetic */ int b = 2;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.google.android.gms.internal.cast.f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.c = fVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c7.a
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.b;
        Object obj = this.c;
        boolean z10 = false;
        Object[] objArr = 0;
        switch (i11) {
            case 0:
                sg.j jVar = (sg.j) obj;
                if (i10 == 1) {
                    j6.b bVar = new j6.b(jVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, bVar);
                    break;
                } else if (i10 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    jVar.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            case 1:
                f fVar = (f) obj;
                switch (i10) {
                    case 1:
                        j6.b bVar2 = new j6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.u.d(parcel2, bVar2);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i12 = com.google.android.gms.internal.cast.u.a;
                        int i13 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel M0 = oVar.M0();
                                M0.writeInt(i13);
                                M0.writeInt(0);
                                oVar.Q0(M0, 6);
                            } catch (RemoteException e10) {
                                c.m.a(e10, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar2 = (c) fVar;
                        z5.l.e("Must be called from the main thread.");
                        q5.h hVar = cVar2.j;
                        long g10 = hVar == null ? 0L : hVar.g() - cVar2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        ((c) fVar).k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.u.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.u.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice b10 = CastDevice.b(bundle5);
                        if (b10 != null) {
                            String str = b10.d;
                            if (!b10.equals(cVar3.k)) {
                                boolean z11 = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.k = b10;
                                c.m.b("update to device (%s) with name %s", b10, true != z11 ? "unchanged" : "changed");
                                if (z11 && (castDevice = cVar3.k) != null) {
                                    r5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        s5.b bVar3 = r5.h.v;
                                        Log.i(bVar3.a, bVar3.d("update Cast device to %s", castDevice));
                                        hVar2.o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((d0) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                com.google.android.gms.internal.cast.f fVar2 = (com.google.android.gms.internal.cast.f) obj;
                b bVar4 = fVar2.d;
                if (i10 == 1) {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    j6.a f9 = new c(fVar2.a, fVar2.b, readString, fVar2.d, fVar2.e, new r5.h(fVar2.a, bVar4, fVar2.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.u.d(parcel2, f9);
                    break;
                } else if (i10 == 2) {
                    boolean z12 = bVar4.e;
                    parcel2.writeNoException();
                    int i14 = com.google.android.gms.internal.cast.u.a;
                    parcel2.writeInt(z12 ? 1 : 0);
                    break;
                } else if (i10 == 3) {
                    String str2 = fVar2.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i10 == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            case 3:
                c cVar4 = (c) obj;
                if (i10 == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var = cVar4.i;
                    if (e0Var != null && e0Var.F == 2) {
                        com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
                        b11.c = new o5.b0(e0Var, readString2, readString3, objArr == true ? 1 : 0);
                        b11.a = 8407;
                        e0Var.e(1, b11.b()).addOnCompleteListener(new d6(this, 14));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    String readString4 = parcel.readString();
                    o5.i iVar = (o5.i) com.google.android.gms.internal.cast.u.a(parcel, o5.i.CREATOR);
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var2 = cVar4.i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v b12 = com.google.android.gms.common.api.internal.w.b();
                        b12.c = new g0(e0Var2, readString4, iVar, false, 13);
                        b12.a = 8406;
                        e0Var2.e(1, b12.b()).addOnCompleteListener(new org.telegram.ui.Components.n(this, 7));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    e0 e0Var3 = cVar4.i;
                    if (e0Var3 != null && e0Var3.F == 2) {
                        com.google.android.gms.common.api.internal.v b13 = com.google.android.gms.common.api.internal.w.b();
                        b13.c = new g9.l(e0Var3, readString5, z10, 27);
                        b13.a = 8409;
                        e0Var3.e(1, b13.b());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 4) {
                    int readInt2 = parcel.readInt();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    c.g(cVar4, readInt2);
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
            default:
                if (i10 == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    com.google.android.gms.internal.cast.u.b(parcel);
                    ((r5.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(c cVar) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", 1);
        this.c = cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f fVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", 1);
        this.c = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(r5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.c = bVar;
    }

    public j(sg.j jVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.c = jVar;
    }
}
