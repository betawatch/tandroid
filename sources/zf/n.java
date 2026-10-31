package zf;

import java.util.ArrayList;
import org.telegram.messenger.cd;
import org.telegram.messenger.hs;
import org.telegram.ui.mx;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ z b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ n(z zVar, int i10, String str, String str2) {
        this.a = 1;
        this.b = zVar;
        this.c = i10;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        String str;
        int i10;
        int i11;
        int i12 = this.a;
        String str2 = this.e;
        switch (i12) {
            case 0:
                z zVar = this.b;
                zVar.f = null;
                int i13 = zVar.V;
                String str3 = this.d;
                int i14 = this.c;
                if (i13 != 2) {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        str = str3;
                        i10 = i14;
                        hs.a0(zVar.s0).a.c(new n(zVar, lowerCase, i10, str, 2));
                        if (zVar.h0 == 15) {
                            n nVar = new n(zVar, i10, str, str2);
                            zVar.h = nVar;
                            org.telegram.messenger.i0.g3(nVar);
                            break;
                        } else {
                            zVar.D0 -= 2;
                            break;
                        }
                    } else {
                        zVar.d0 = 0;
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        ArrayList arrayList3 = new ArrayList();
                        new ArrayList();
                        org.telegram.messenger.i0.g3(new i2.g1(zVar, zVar.d0, arrayList, arrayList2, arrayList3, 24));
                    }
                }
                str = str3;
                i10 = i14;
                if (zVar.h0 == 15) {
                }
            case 1:
                z zVar2 = this.b;
                int i15 = zVar2.V;
                int i16 = zVar2.h0;
                zVar2.h = null;
                int i17 = zVar2.d0;
                int i18 = this.c;
                if (i18 == i17) {
                    if (i15 == 2 || i16 == 6 || i16 == 5 || zVar2.U.a() != 0) {
                        i11 = i18;
                        zVar2.D0 -= 2;
                    } else {
                        t tVar = zVar2.j0;
                        long j10 = 0;
                        boolean z10 = i16 != 4;
                        boolean z11 = (i16 == 4 || i16 == 11) ? false : true;
                        boolean z12 = i16 == 2 || i16 == 1;
                        boolean z13 = i16 == 0;
                        mx mxVar = zVar2.U;
                        if (mxVar != null) {
                            j10 = mxVar.a();
                        }
                        tVar.h(this.d, true, z10, true, z11, z12, 0L, z13, 0, i18, j10, null);
                        i11 = i18;
                    }
                    if (i15 != 0 && i16 != 15) {
                        zVar2.W(str2);
                        zVar2.V(i11, str2);
                        zVar2.U(i11, str2);
                        break;
                    } else {
                        zVar2.D0--;
                        break;
                    }
                }
                break;
            default:
                z zVar3 = this.b;
                zVar3.getClass();
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                new ArrayList();
                hs a02 = hs.a0(zVar3.s0);
                int i19 = zVar3.h0;
                ArrayList arrayList7 = zVar3.q0;
                String str4 = this.d;
                a02.M0(i19, str4, arrayList4, arrayList5, arrayList6, arrayList7, -1);
                org.telegram.messenger.i0.g3(new i2.g1(zVar3, this.c, arrayList4, arrayList5, arrayList6, 24));
                g0.B1(str4, zVar3.y0);
                zVar3.z0 = false;
                if (str4.length() >= 3 && (cd.L0(2131754150, null).toLowerCase().startsWith(str4) || "archive".startsWith(str2))) {
                    zVar3.z0 = true;
                }
                org.telegram.messenger.i0.g3(new r(zVar3, 0));
                break;
        }
    }

    public /* synthetic */ n(z zVar, String str, int i10, String str2, int i11) {
        this.a = i11;
        this.b = zVar;
        this.d = str;
        this.c = i10;
        this.e = str2;
    }
}
