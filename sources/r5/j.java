package r5;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.cast.CastDevice;
import java.util.HashSet;
import java.util.Iterator;
import l7.w0;
import n7.qa;
import org.telegram.ui.Cells.f1;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class j extends a7.c {
    public final /* synthetic */ int b = 0;
    public final Object c;

    public j(androidx.emoji2.text.w wVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener", 1);
        this.c = wVar;
    }

    @Override // a7.c
    public final boolean H0(int i10, Parcel parcel, Parcel parcel2) {
        CastDevice castDevice;
        CastDevice castDevice2;
        int i11 = this.b;
        Object obj = this.c;
        int i12 = 0;
        switch (i11) {
            case 0:
                androidx.emoji2.text.w wVar = (androidx.emoji2.text.w) obj;
                if (i10 == 1) {
                    l6.b bVar = new l6.b(wVar);
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.s.d(parcel2, bVar);
                    break;
                } else if (i10 == 2) {
                    int readInt = parcel.readInt();
                    com.google.android.gms.internal.cast.s.b(parcel);
                    wVar.getClass();
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
                        l6.b bVar2 = new l6.b(fVar);
                        parcel2.writeNoException();
                        com.google.android.gms.internal.cast.s.d(parcel2, bVar2);
                        break;
                    case 2:
                        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.s.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.s.b(parcel);
                        ((c) fVar).i(bundle);
                        parcel2.writeNoException();
                        break;
                    case 3:
                        Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.s.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.s.b(parcel);
                        ((c) fVar).i(bundle2);
                        parcel2.writeNoException();
                        break;
                    case 4:
                        int i13 = com.google.android.gms.internal.cast.s.a;
                        int i14 = parcel.readInt() != 0 ? 1 : 0;
                        com.google.android.gms.internal.cast.s.b(parcel);
                        c cVar = (c) fVar;
                        q qVar = cVar.e;
                        if (qVar != null) {
                            try {
                                o oVar = (o) qVar;
                                Parcel M0 = oVar.M0();
                                M0.writeInt(i14);
                                M0.writeInt(0);
                                oVar.Q0(M0, 6);
                            } catch (RemoteException e6) {
                                c.m.a(e6, "Unable to call %s on %s.", "disconnectFromDevice", q.class.getSimpleName());
                            }
                            cVar.d(0);
                        }
                        parcel2.writeNoException();
                        break;
                    case 5:
                        c cVar2 = (c) fVar;
                        b6.m.e("Must be called from the main thread.");
                        s5.h hVar = cVar2.j;
                        long g10 = hVar == null ? 0L : hVar.g() - cVar2.j.a();
                        parcel2.writeNoException();
                        parcel2.writeLong(g10);
                        break;
                    case 6:
                        parcel2.writeNoException();
                        parcel2.writeInt(12451000);
                        break;
                    case 7:
                        Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.s.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.s.b(parcel);
                        ((c) fVar).k = CastDevice.e(bundle3);
                        parcel2.writeNoException();
                        break;
                    case 8:
                        Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.s.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.s.b(parcel);
                        ((c) fVar).k = CastDevice.e(bundle4);
                        parcel2.writeNoException();
                        break;
                    case 9:
                        Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.s.a(parcel, Bundle.CREATOR);
                        com.google.android.gms.internal.cast.s.b(parcel);
                        c cVar3 = (c) fVar;
                        CastDevice e10 = CastDevice.e(bundle5);
                        if (e10 != null) {
                            String str = e10.d;
                            if (!e10.equals(cVar3.k)) {
                                boolean z4 = !TextUtils.isEmpty(str) && ((castDevice2 = cVar3.k) == null || !TextUtils.equals(castDevice2.d, str));
                                cVar3.k = e10;
                                c.m.b("update to device (%s) with name %s", e10, true != z4 ? "unchanged" : "changed");
                                if (z4 && (castDevice = cVar3.k) != null) {
                                    t5.h hVar2 = cVar3.h;
                                    if (hVar2 != null) {
                                        u5.b bVar3 = t5.h.v;
                                        Log.i(bVar3.a, bVar3.d("update Cast device to %s", castDevice));
                                        hVar2.o = castDevice;
                                        hVar2.b();
                                    }
                                    Iterator it = new HashSet(cVar3.d).iterator();
                                    while (it.hasNext()) {
                                        ((e0) it.next()).getClass();
                                    }
                                }
                            }
                        }
                        parcel2.writeNoException();
                        break;
                }
            case 2:
                com.google.android.gms.internal.cast.e eVar = (com.google.android.gms.internal.cast.e) obj;
                b bVar4 = eVar.d;
                if (i10 == 1) {
                    String readString = parcel.readString();
                    com.google.android.gms.internal.cast.s.b(parcel);
                    l6.a f10 = new c(eVar.a, eVar.b, readString, eVar.d, eVar.e, new t5.h(eVar.a, bVar4, eVar.e)).f();
                    parcel2.writeNoException();
                    com.google.android.gms.internal.cast.s.d(parcel2, f10);
                    break;
                } else if (i10 == 2) {
                    boolean z10 = bVar4.e;
                    parcel2.writeNoException();
                    int i15 = com.google.android.gms.internal.cast.s.a;
                    parcel2.writeInt(z10 ? 1 : 0);
                    break;
                } else if (i10 == 3) {
                    String str2 = eVar.b;
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
                    com.google.android.gms.internal.cast.s.b(parcel);
                    q5.e0 e0Var = cVar4.i;
                    if (e0Var != null && e0Var.F == 2) {
                        com.google.android.gms.common.api.internal.v e11 = com.google.android.gms.common.api.internal.w.e();
                        e11.c = new q5.b0(e0Var, readString2, readString3, i12);
                        e11.a = 8407;
                        e0Var.e(1, e11.e()).addOnCompleteListener(new f1(this, 15));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 2) {
                    String readString4 = parcel.readString();
                    q5.i iVar = (q5.i) com.google.android.gms.internal.cast.s.a(parcel, q5.i.CREATOR);
                    com.google.android.gms.internal.cast.s.b(parcel);
                    q5.e0 e0Var2 = cVar4.i;
                    if (e0Var2 != null && e0Var2.F == 2) {
                        com.google.android.gms.common.api.internal.v e12 = com.google.android.gms.common.api.internal.w.e();
                        e12.c = new w0(e0Var2, readString4, iVar);
                        e12.a = 8406;
                        e0Var2.e(1, e12.e()).addOnCompleteListener(new org.telegram.ui.web.e0(this, 7));
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 3) {
                    String readString5 = parcel.readString();
                    com.google.android.gms.internal.cast.s.b(parcel);
                    q5.e0 e0Var3 = cVar4.i;
                    if (e0Var3 != null && e0Var3.F == 2) {
                        com.google.android.gms.common.api.internal.v e13 = com.google.android.gms.common.api.internal.w.e();
                        e13.c = new qa(29, e0Var3, readString5);
                        e13.a = 8409;
                        e0Var3.e(1, e13.e());
                    }
                    parcel2.writeNoException();
                    break;
                } else if (i10 == 4) {
                    int readInt2 = parcel.readInt();
                    com.google.android.gms.internal.cast.s.b(parcel);
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
                    com.google.android.gms.internal.cast.s.b(parcel);
                    ((t5.b) obj).publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
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
    public j(com.google.android.gms.internal.cast.e eVar) {
        super("com.google.android.gms.cast.framework.ISessionProvider", 1);
        this.c = eVar;
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
    public j(t5.b bVar) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher", 1);
        this.c = bVar;
    }
}
