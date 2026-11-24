// default package

import android.media.AudioDescriptor;
import android.os.SystemClock;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class w00 implements x76, ee, xmb, ymb, mm0, hp7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ w00(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // hp7
    public final String c(int i) {
        switch (this.a) {
            case 28:
                return String.valueOf(i);
            default:
                return String.format("%02d", Integer.valueOf(i * 5));
        }
    }

    @Override // ymb
    public final void e(int i, View view) {
        ((a8) view).d(i, i);
    }

    @Override // xmb
    public final int g(View view) {
        a8 a8Var = (a8) view;
        if (a8Var.getTextView() != null) {
            return a8Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // x76
    public final void invoke(Object obj) {
        long j;
        u40 u40Var;
        switch (this.a) {
            case 2:
                ab3 ab3Var = (ab3) obj;
                cb3 cb3Var = ab3Var.a;
                if (ab3Var == cb3Var.j && cb3Var.n != null) {
                    ki2 ki2Var = cb3Var.p;
                    int i = ki2Var.b;
                    if (i != -1) {
                        long j2 = ((r10) ki2Var.e).f / i;
                        j50 j50Var = cb3Var.t;
                        j50Var.getClass();
                        j = hac.Z(j50Var.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    cb3Var.n.x0(hac.i0(j), ((r10) cb3Var.p.e).f, SystemClock.elapsedRealtime() - cb3Var.Z);
                    break;
                }
                break;
            case 3:
                u40 u40Var2 = ((ab3) obj).a.n;
                if (u40Var2 != null) {
                    u40Var2.u(new nf5((byte) 14));
                    break;
                }
                break;
            case 4:
                ab3 ab3Var2 = (ab3) obj;
                cb3 cb3Var2 = ab3Var2.a;
                if (ab3Var2 == cb3Var2.j && (u40Var = cb3Var2.n) != null && cb3Var2.R) {
                    u40Var.s0();
                    break;
                }
                break;
            case 5:
                ab3 ab3Var3 = (ab3) obj;
                cb3 cb3Var3 = ab3Var3.a;
                if (ab3Var3 == cb3Var3.j && cb3Var3.P) {
                    cb3Var3.Q = true;
                    break;
                }
                break;
            default:
                u40 u40Var3 = ((za3) obj).a.n;
                if (u40Var3 != null) {
                    u40Var3.X();
                    break;
                }
                break;
        }
    }

    @Override // mm0
    public final int o(ylb ylbVar, boolean z) {
        switch (this.a) {
            case 10:
                return z ? cmb.p1(0.9f, -15658735) : qqd.m(e86.e(262144) ? 0.82f : 0.76f, cmb.v0(cmb.c6, ylbVar), -14145496);
            case 11:
                return cmb.p1(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.c6, ylbVar));
            case 12:
                if (!e86.e(256)) {
                    return cmb.w0(null, cmb.F8, false);
                }
                return cmb.p1(z ? 0.85f : 0.825f, cmb.w0(null, cmb.F8, false));
            case 13:
                return qqd.m(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.c6, ylbVar), cmb.v0(cmb.Pl, ylbVar));
            case 14:
                return qqd.m(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.c6, ylbVar), cmb.v0(cmb.Ie, ylbVar));
            case 15:
                return qqd.m(e86.e(262144) ? 0.85f : 0.8f, cmb.v0(cmb.Z6, ylbVar), cmb.v0(cmb.c6, ylbVar));
            case 16:
                return 855638016;
            case 17:
                return TLObject.FLAG_30;
            case 18:
                return cmb.p1(z ? 0.82f : 0.78f, cmb.v0(cmb.g5, ylbVar));
            case 19:
                return cmb.p1(0.075f, -16777216);
            case 20:
                return cmb.p1(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.vj, ylbVar));
            case 21:
                return cmb.p1(0.88f, cmb.v0(cmb.c6, ylbVar));
            case 22:
                return cmb.p1(z ? 0.85f : 0.825f, cmb.v0(cmb.F8, ylbVar));
            case 23:
                return qqd.m(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.c6, ylbVar), cmb.v0(cmb.Ol, ylbVar));
            case 24:
                return cmb.p1(e86.e(262144) ? 0.85f : 0.76f, cmb.v0(cmb.c6, ylbVar));
            case 25:
                return cmb.p1(0.78f, cmb.v0(cmb.g5, ylbVar));
            case 26:
                return cmb.p1(0.7f, cmb.v0(cmb.c6, ylbVar));
            default:
                e86.e(262144);
                return 0;
        }
    }

    @Override // ee
    public final void r(he heVar, int i) {
        heVar.dismiss();
    }
}
