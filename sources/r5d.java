// default package

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class r5d extends dzc {
    public final /* synthetic */ byte b = 1;
    public final Object c;

    public r5d(k32 k32Var) {
        super("com.google.android.gms.cast.framework.ICastStateListener", (byte) 4);
        this.c = k32Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // dzc
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        byte b = this.b;
        Object obj = this.c;
        boolean z = false;
        Object[] objArr = 0;
        switch (b) {
            case 0:
                k32 k32Var = (k32) obj;
                if (i == 1) {
                    bo7 bo7Var = new bo7(k32Var);
                    parcel2.writeNoException();
                    jgd.d(parcel2, bo7Var);
                    break;
                } else if (i == 2) {
                    int readInt = parcel.readInt();
                    jgd.b(parcel);
                    k32Var.getClass();
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
                d5a d5aVar = (d5a) obj;
                switch (i) {
                    case 1:
                        bo7 bo7Var2 = new bo7(d5aVar);
                        parcel2.writeNoException();
                        jgd.d(parcel2, bo7Var2);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) jgd.a(parcel, Bundle.CREATOR);
                        jgd.b(parcel);
                        ((ed1) d5aVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) jgd.a(parcel, Bundle.CREATOR);
                        jgd.b(parcel);
                        ((ed1) d5aVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i2 = jgd.a;
                        int i3 = parcel.readInt() != 0 ? 1 : 0;
                        jgd.b(parcel);
                        ed1 ed1Var = (ed1) d5aVar;
                        f8d f8dVar = ed1Var.e;
                        if (f8dVar != null) {
                            try {
                                u7d u7dVar = (u7d) f8dVar;
                                Parcel R = u7dVar.R();
                                R.writeInt(i3);
                                R.writeInt(0);
                                u7dVar.V(R, 6);
                            } catch (RemoteException e) {
                                ed1.m.a(e, "Unable to call %s on %s.", "disconnectFromDevice", f8d.class.getSimpleName());
                            }
                            ed1Var.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        ed1 ed1Var2 = (ed1) d5aVar;
                        fre.e("Must be called from the main thread.");
                        i69 i69Var = ed1Var2.j;
                        long g = i69Var == null ? 0L : i69Var.g() - ed1Var2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) jgd.a(parcel, Bundle.CREATOR);
                        jgd.b(parcel);
                        ((ed1) d5aVar).k = CastDevice.b(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) jgd.a(parcel, Bundle.CREATOR);
                        jgd.b(parcel);
                        ((ed1) d5aVar).k = CastDevice.b(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) jgd.a(parcel, Bundle.CREATOR);
                        jgd.b(parcel);
                        ed1 ed1Var3 = (ed1) d5aVar;
                        CastDevice b2 = CastDevice.b(bundle5);
                        if (b2 != null) {
                            String str = b2.d;
                            if (!b2.equals(ed1Var3.k)) {
                                Object[] objArr2 = !TextUtils.isEmpty(str) && ((castDevice2 = ed1Var3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                ed1Var3.k = b2;
                                ed1.m.b("update to device (%s) with name %s", b2, true != objArr2 ? "unchanged" : "changed");
                                if (objArr2 != false && (castDevice = ed1Var3.k) != null) {
                                    kgf kgfVar = ed1Var3.h;
                                    if (kgfVar != null) {
                                        dc6 dc6Var = kgf.v;
                                        Log.i(dc6Var.a, dc6Var.d("update Cast device to %s", castDevice));
                                        kgfVar.o = castDevice;
                                        kgfVar.b();
                                    }
                                    Iterator it = new HashSet(ed1Var3.d).iterator();
                                    while (it.hasNext()) {
                                        ((uhf) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                e7d e7dVar = (e7d) obj;
                dd1 dd1Var = e7dVar.d;
                if (i == 1) {
                    String readString = parcel.readString();
                    jgd.b(parcel);
                    yi5 f = new ed1(e7dVar.a, e7dVar.b, readString, e7dVar.d, e7dVar.e, new kgf(e7dVar.a, dd1Var, e7dVar.e)).f();
                    parcel2.writeNoException();
                    jgd.d(parcel2, f);
                    break;
                } else if (i == 2) {
                    boolean z2 = dd1Var.e;
                    parcel2.writeNoException();
                    int i4 = jgd.a;
                    parcel2.writeInt(z2 ? 1 : 0);
                    break;
                } else if (i == 3) {
                    String str2 = e7dVar.b;
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
                    jgd.b(parcel);
                    ((yyd) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
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
                ed1 ed1Var4 = (ed1) obj;
                byte b3 = 5;
                if (i == 1) {
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    jgd.b(parcel);
                    afd afdVar = ed1Var4.i;
                    if (afdVar != null && afdVar.G == 2) {
                        agb b4 = bgb.b();
                        b4.a = new fcd(afdVar, readString2, readString3, objArr == true ? 1 : 0);
                        b4.d = (char) 8407;
                        afdVar.e(1, b4.a()).addOnCompleteListener(new e6e(this, b3));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 2) {
                    String readString4 = parcel.readString();
                    b06 b06Var = (b06) jgd.a(parcel, b06.CREATOR);
                    jgd.b(parcel);
                    afd afdVar2 = ed1Var4.i;
                    if (afdVar2 != null && afdVar2.G == 2) {
                        agb b5 = bgb.b();
                        b5.a = new vk9((Object) afdVar2, (Object) readString4, (Object) b06Var, (byte) 21);
                        b5.d = (char) 8406;
                        afdVar2.e(1, b5.a()).addOnCompleteListener(new sld(this));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 3) {
                    String readString5 = parcel.readString();
                    jgd.b(parcel);
                    afd afdVar3 = ed1Var4.i;
                    if (afdVar3 != null && afdVar3.G == 2) {
                        agb b6 = bgb.b();
                        b6.a = new aec(afdVar3, readString5, z, (byte) 12);
                        b6.d = (char) 8409;
                        afdVar3.e(1, b6.a());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i == 4) {
                    int readInt2 = parcel.readInt();
                    jgd.b(parcel);
                    ed1.g(ed1Var4, readInt2);
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
    public r5d(ed1 ed1Var) {
        super("com.google.android.gms.cast.framework.ICastConnectionController", (byte) 4);
        this.c = ed1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5d(d5a d5aVar) {
        super("com.google.android.gms.cast.framework.ISessionProxy", (byte) 4);
        this.c = d5aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5d(e7d e7dVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", (byte) 4);
        this.c = e7dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5d(yyd yydVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", (byte) 4);
        this.c = yydVar;
    }
}
