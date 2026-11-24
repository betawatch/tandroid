// default package

import android.media.AudioDescriptor;
import android.os.SystemClock;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class wz implements x56, ed, wkb, xkb, ml0, dn7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ wz(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // dn7
    public final String c(int i) {
        switch (this.a) {
            case 28:
                return String.valueOf(i);
            default:
                return String.format("%02d", Integer.valueOf(i * 5));
        }
    }

    @Override // xkb
    public final void d(int i, View view) {
        ((a8) view).d(i, i);
    }

    @Override // wkb
    public final int e(View view) {
        a8 a8Var = (a8) view;
        if (a8Var.getTextView() != null) {
            return a8Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // x56
    public final void invoke(Object obj) {
        long j;
        u30 u30Var;
        switch (this.a) {
            case 2:
                o93 o93Var = (o93) obj;
                q93 q93Var = o93Var.a;
                if (o93Var == q93Var.j && q93Var.n != null) {
                    wg2 wg2Var = q93Var.p;
                    int i = wg2Var.b;
                    if (i != -1) {
                        long j2 = ((r00) wg2Var.e).f / i;
                        j40 j40Var = q93Var.t;
                        j40Var.getClass();
                        j = g8c.Z(j40Var.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    q93Var.n.A2(g8c.i0(j), ((r00) q93Var.p.e).f, SystemClock.elapsedRealtime() - q93Var.Z);
                    break;
                }
                break;
            case 3:
                u30 u30Var2 = ((o93) obj).a.n;
                if (u30Var2 != null) {
                    u30Var2.D(new pd5((byte) 14));
                    break;
                }
                break;
            case 4:
                o93 o93Var2 = (o93) obj;
                q93 q93Var2 = o93Var2.a;
                if (o93Var2 == q93Var2.j && (u30Var = q93Var2.n) != null && q93Var2.R) {
                    u30Var.p2();
                    break;
                }
                break;
            case 5:
                o93 o93Var3 = (o93) obj;
                q93 q93Var3 = o93Var3.a;
                if (o93Var3 == q93Var3.j && q93Var3.P) {
                    q93Var3.Q = true;
                    break;
                }
                break;
            default:
                u30 u30Var3 = ((n93) obj).a.n;
                if (u30Var3 != null) {
                    u30Var3.f1();
                    break;
                }
                break;
        }
    }

    @Override // ml0
    public final int k(wjb wjbVar, boolean z) {
        switch (this.a) {
            case 10:
                return z ? bkb.p1(0.9f, -15658735) : nod.m(e66.e(262144) ? 0.82f : 0.76f, bkb.v0(bkb.c6, wjbVar), -14145496);
            case 11:
                return bkb.p1(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.c6, wjbVar));
            case 12:
                if (!e66.e(256)) {
                    return bkb.w0(null, bkb.F8, false);
                }
                return bkb.p1(z ? 0.85f : 0.825f, bkb.w0(null, bkb.F8, false));
            case 13:
                return nod.m(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.c6, wjbVar), bkb.v0(bkb.Pl, wjbVar));
            case 14:
                return nod.m(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.c6, wjbVar), bkb.v0(bkb.Ie, wjbVar));
            case 15:
                return nod.m(e66.e(262144) ? 0.85f : 0.8f, bkb.v0(bkb.Z6, wjbVar), bkb.v0(bkb.c6, wjbVar));
            case 16:
                return 855638016;
            case 17:
                return TLObject.FLAG_30;
            case 18:
                return bkb.p1(z ? 0.82f : 0.78f, bkb.v0(bkb.g5, wjbVar));
            case 19:
                return bkb.p1(0.075f, -16777216);
            case 20:
                return bkb.p1(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.vj, wjbVar));
            case 21:
                return bkb.p1(0.88f, bkb.v0(bkb.c6, wjbVar));
            case 22:
                return bkb.p1(z ? 0.85f : 0.825f, bkb.v0(bkb.F8, wjbVar));
            case 23:
                return nod.m(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.c6, wjbVar), bkb.v0(bkb.Ol, wjbVar));
            case 24:
                return bkb.p1(e66.e(262144) ? 0.85f : 0.76f, bkb.v0(bkb.c6, wjbVar));
            case 25:
                return bkb.p1(0.78f, bkb.v0(bkb.g5, wjbVar));
            case 26:
                return bkb.p1(0.7f, bkb.v0(bkb.c6, wjbVar));
            default:
                e66.e(262144);
                return 0;
        }
    }

    @Override // ed
    public final void u(hd hdVar, int i) {
        hdVar.dismiss();
    }
}
