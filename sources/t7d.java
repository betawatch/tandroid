// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class t7d extends e1d {
    public final /* synthetic */ byte b = 0;
    public final Object c;

    public t7d(a32 a32Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", (byte) 4);
        this.c = a32Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e1d
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        byte b = this.b;
        Object obj = this.c;
        boolean z = false;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                a32 a32Var = (a32) obj;
                if (i == 1) {
                    eq7 eq7Var = new eq7(a32Var);
                    parcel2.writeNoException();
                    kid.d(parcel2, eq7Var);
                    break;
                } else if (i == 2) {
                    int readInt = parcel.readInt();
                    kid.b(parcel);
                    a32Var.getClass();
                    Log.d("CAST_STATE", "onCastStateChanged " + readInt);
                    parcel2.writeNoException();
                    break;
                } else if (i == 3) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 1:
                f7a f7aVar = (f7a) obj;
                switch (i) {
                    case 1:
                        eq7 eq7Var2 = new eq7(f7aVar);
                        parcel2.writeNoException();
                        kid.d(parcel2, eq7Var2);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) kid.a(parcel, Bundle.CREATOR);
                        kid.b(parcel);
                        ((me1) f7aVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) kid.a(parcel, Bundle.CREATOR);
                        kid.b(parcel);
                        ((me1) f7aVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i2 = kid.a;
                        int i3 = parcel.readInt() != 0 ? 1 : 0;
                        kid.b(parcel);
                        me1 me1Var = (me1) f7aVar;
                        had hadVar = me1Var.e;
                        if (hadVar != null) {
                            try {
                                w9d w9dVar = (w9d) hadVar;
                                Parcel R = w9dVar.R();
                                R.writeInt(i3);
                                R.writeInt(0);
                                w9dVar.V(R, 6);
                            } catch (RemoteException e) {
                                me1.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", had.class.getSimpleName());
                            }
                            me1Var.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        me1 me1Var2 = (me1) f7aVar;
                        ite.e("Must be called from the main thread.");
                        k89 k89Var = me1Var2.j;
                        long g = k89Var == null ? 0L : k89Var.g() - me1Var2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) kid.a(parcel, Bundle.CREATOR);
                        kid.b(parcel);
                        ((me1) f7aVar).k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) kid.a(parcel, Bundle.CREATOR);
                        kid.b(parcel);
                        ((me1) f7aVar).k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) kid.a(parcel, Bundle.CREATOR);
                        kid.b(parcel);
                        me1 me1Var3 = (me1) f7aVar;
                        CastDevice b2 = CastDevice.b(bundle5);
                        if (b2 != null) {
                            String str = b2.d;
                            if (!b2.equals(me1Var3.k)) {
                                Object[] objArr2 = !TextUtils.isEmpty(str) && ((castDevice2 = me1Var3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                me1Var3.k = b2;
                                me1.m.b("update to device (%s) with name %s", b2, true != objArr2 ? "unchanged" : "changed");
                                if (objArr2 != false && (castDevice = me1Var3.k) != null) {
                                    lif lifVar = me1Var3.h;
                                    if (lifVar != null) {
                                        ce6 ce6Var = lif.v;
                                        Log.i(ce6Var.a, ce6Var.d("update Cast device to %s", castDevice));
                                        lifVar.o = castDevice;
                                        lifVar.b();
                                    }
                                    Iterator it = new HashSet(me1Var3.d).iterator();
                                    while (it.hasNext()) {
                                        ((vjf) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                g9d g9dVar = (g9d) obj;
                le1 le1Var = g9dVar.d;
                if (i == 1) {
                    String readString = parcel.readString();
                    kid.b(parcel);
                    xk5 f = new me1(g9dVar.a, g9dVar.b, readString, g9dVar.d, g9dVar.e, new lif(g9dVar.a, le1Var, g9dVar.e)).f();
                    parcel2.writeNoException();
                    kid.d(parcel2, f);
                    break;
                } else if (i == 2) {
                    boolean z2 = le1Var.e;
                    parcel2.writeNoException();
                    int i4 = kid.a;
                    parcel2.writeInt(z2 ? 1 : 0);
                    break;
                } else if (i == 3) {
                    String str2 = g9dVar.b;
                    parcel2.writeNoException();
                    parcel2.writeString(str2);
                    break;
                } else if (i == 4) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            case 3:
                if (i == 1) {
                    long readLong = parcel.readLong();
                    long readLong2 = parcel.readLong();
                    kid.b(parcel);
                    ((b1e) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
                    parcel2.writeNoException();
                    break;
                } else if (i == 2) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
            default:
                me1 me1Var4 = (me1) obj;
                if (i == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    kid.b(parcel);
                    bhd bhdVar = me1Var4.i;
                    if (bhdVar != null && bhdVar.G == 2) {
                        bib b3 = cib.b();
                        b3.a = new hed(bhdVar, readString2, readString3, objArr == true ? 1 : 0);
                        b3.d = (char) 8407;
                        bhdVar.e(1, b3.a()).addOnCompleteListener(new fkd((Object) this, (byte) 8));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 2) {
                    String readString4 = parcel.readString();
                    b26 b26Var = (b26) kid.a(parcel, b26.CREATOR);
                    kid.b(parcel);
                    bhd bhdVar2 = me1Var4.i;
                    if (bhdVar2 != null && bhdVar2.G == 2) {
                        bib b4 = cib.b();
                        b4.a = new wm9((Object) bhdVar2, (Object) readString4, (Object) b26Var, (byte) 21);
                        b4.d = (char) 8406;
                        bhdVar2.e(1, b4.a()).addOnCompleteListener(new und(this));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 3) {
                    String readString5 = parcel.readString();
                    kid.b(parcel);
                    bhd bhdVar3 = me1Var4.i;
                    if (bhdVar3 != null && bhdVar3.G == 2) {
                        bib b5 = cib.b();
                        b5.a = new rhb(bhdVar3, readString5, z, (byte) 14);
                        b5.d = (char) 8409;
                        bhdVar3.e(1, b5.a());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 4) {
                    int readInt2 = parcel.readInt();
                    kid.b(parcel);
                    me1.g(me1Var4, readInt2);
                    parcel2.writeNoException();
                    break;
                } else if (i == 5) {
                    parcel2.writeNoException();
                    parcel2.writeInt(12451000);
                    break;
                } else {
                    break;
                }
                break;
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7d(me1 me1Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 4);
        this.c = me1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7d(f7a f7aVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 4);
        this.c = f7aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7d(g9d g9dVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 4);
        this.c = g9dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7d(b1e b1eVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 4);
        this.c = b1eVar;
    }
}
