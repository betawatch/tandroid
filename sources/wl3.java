// default package

import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class wl3 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ov9 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ wl3(ov9 ov9Var, int i, String str, String str2) {
        this.a = (byte) 1;
        this.b = ov9Var;
        this.c = i;
        this.d = str;
        this.e = str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0155  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        String str;
        int i2;
        byte b = this.a;
        String str2 = this.e;
        switch (b) {
            case 0:
                ov9 ov9Var = this.b;
                ov9Var.f = null;
                byte b2 = ov9Var.W;
                String str3 = this.d;
                int i3 = this.c;
                if (b2 != 2) {
                    String lowerCase = str3.trim().toLowerCase();
                    if (lowerCase.length() != 0) {
                        i = i3;
                        str = str3;
                        cf7.Y(ov9Var.t0).a.c(new wl3(ov9Var, lowerCase, i, str, (byte) 2));
                        if (ov9Var.i0 == 15) {
                            wl3 wl3Var = new wl3(ov9Var, i, str, str2);
                            ov9Var.h = wl3Var;
                            gm.c3(wl3Var);
                            break;
                        } else {
                            ov9Var.E0 -= 2;
                            break;
                        }
                    } else {
                        ov9Var.e0 = 0;
                        gm.c3(new i77((Object) ov9Var, ov9Var.e0, (Object) new ArrayList(), (Object) new ArrayList(), (Object) new ArrayList(), (byte) 12));
                    }
                }
                i = i3;
                str = str3;
                if (ov9Var.i0 == 15) {
                }
            case 1:
                ov9 ov9Var2 = this.b;
                byte b3 = ov9Var2.W;
                int i4 = ov9Var2.i0;
                ov9Var2.h = null;
                int i5 = ov9Var2.e0;
                int i6 = this.c;
                if (i6 == i5) {
                    if (b3 == 2 || i4 == 6 || i4 == 5 || ov9Var2.V.a() != 0) {
                        i2 = i6;
                        ov9Var2.E0 -= 2;
                    } else {
                        fm3 fm3Var = ov9Var2.k0;
                        boolean z = i4 != 4;
                        boolean z2 = (i4 == 4 || i4 == 11) ? false : true;
                        boolean z3 = i4 == 2 || i4 == 1;
                        boolean z4 = i4 == 0;
                        uj3 uj3Var = ov9Var2.V;
                        fm3Var.h(this.d, true, z, true, z2, z3, 0L, z4, 0, i6, uj3Var != null ? uj3Var.a() : 0L, null);
                        i2 = i6;
                    }
                    if (b3 != 0 && i4 != 15) {
                        ov9Var2.W(str2);
                        ov9Var2.V(i2, str2);
                        ov9Var2.U(i2, str2);
                        break;
                    } else {
                        ov9Var2.E0--;
                        break;
                    }
                }
                break;
            default:
                ov9 ov9Var3 = this.b;
                ov9Var3.getClass();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                cf7 Y = cf7.Y(ov9Var3.t0);
                int i7 = ov9Var3.i0;
                ArrayList arrayList4 = ov9Var3.r0;
                String str4 = this.d;
                Y.J0(i7, str4, arrayList, arrayList2, arrayList3, arrayList4, -1);
                gm.c3(new i77((Object) ov9Var3, this.c, (Object) arrayList, (Object) arrayList2, (Object) arrayList3, (byte) 12));
                uh4.B1(str4, ov9Var3.z0);
                ov9Var3.A0 = false;
                if (str4.length() >= 3 && (jb6.M0(2131754115, null).toLowerCase().startsWith(str4) || "archive".startsWith(str2))) {
                    ov9Var3.A0 = true;
                }
                gm.c3(new bi3(ov9Var3, (byte) 10));
                break;
        }
    }

    public /* synthetic */ wl3(ov9 ov9Var, String str, int i, String str2, byte b) {
        this.a = b;
        this.b = ov9Var;
        this.d = str;
        this.c = i;
        this.e = str2;
    }
}
