// default package

import android.media.AudioDescriptor;
import android.os.SystemClock;
import android.view.View;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class xz implements b86, fd, vob, wob, nl0, dq7 {
    public final /* synthetic */ byte a;

    public /* synthetic */ xz(byte b) {
        this.a = b;
    }

    public static /* bridge */ /* synthetic */ AudioDescriptor a(Object obj) {
        return (AudioDescriptor) obj;
    }

    @Override // dq7
    public final String c(int i) {
        return String.valueOf(i);
    }

    @Override // wob
    public final void e(int i, View view) {
        ((b8) view).d(i, i);
    }

    @Override // vob
    public final int f(View view) {
        b8 b8Var = (b8) view;
        if (b8Var.getTextView() != null) {
            return b8Var.getTextView().getCurrentTextColor();
        }
        return 0;
    }

    @Override // b86
    public final void invoke(Object obj) {
        long j;
        v30 v30Var;
        switch (this.a) {
            case 2:
                ha3 ha3Var = (ha3) obj;
                ja3 ja3Var = ha3Var.a;
                if (ha3Var == ja3Var.j && ja3Var.n != null) {
                    oh2 oh2Var = ja3Var.p;
                    int i = oh2Var.b;
                    if (i != -1) {
                        long j2 = ((s00) oh2Var.e).f / i;
                        l40 l40Var = ja3Var.t;
                        l40Var.getClass();
                        j = gcc.Z(l40Var.a.getSampleRate(), j2);
                    } else {
                        j = -9223372036854775807L;
                    }
                    ja3Var.n.C0(gcc.i0(j), ((s00) ja3Var.p.e).f, SystemClock.elapsedRealtime() - ja3Var.Z);
                    break;
                }
                break;
            case 3:
                v30 v30Var2 = ((ha3) obj).a.n;
                if (v30Var2 != null) {
                    v30Var2.u(new qf5((byte) 14));
                    break;
                }
                break;
            case 4:
                ha3 ha3Var2 = (ha3) obj;
                ja3 ja3Var2 = ha3Var2.a;
                if (ha3Var2 == ja3Var2.j && (v30Var = ja3Var2.n) != null && ja3Var2.R) {
                    v30Var.w0();
                    break;
                }
                break;
            case 5:
                ha3 ha3Var3 = (ha3) obj;
                ja3 ja3Var3 = ha3Var3.a;
                if (ha3Var3 == ja3Var3.j && ja3Var3.P) {
                    ja3Var3.Q = true;
                    break;
                }
                break;
            default:
                v30 v30Var3 = ((ga3) obj).a.n;
                if (v30Var3 != null) {
                    v30Var3.Z();
                    break;
                }
                break;
        }
    }

    @Override // nl0
    public final int l(vnb vnbVar, boolean z) {
        switch (this.a) {
            case 10:
                return z ? aob.p1(0.9f, -15658735) : dtd.m(i86.e(262144) ? 0.82f : 0.76f, aob.v0(aob.d6, vnbVar), -14145496);
            case 11:
                return aob.p1(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.d6, vnbVar));
            case 12:
                if (!i86.e(256)) {
                    return aob.w0(null, aob.G8, false);
                }
                return aob.p1(z ? 0.85f : 0.825f, aob.w0(null, aob.G8, false));
            case 13:
                return dtd.m(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.d6, vnbVar), aob.v0(aob.Je, vnbVar));
            case 14:
                return dtd.m(i86.e(262144) ? 0.85f : 0.8f, aob.v0(aob.a7, vnbVar), aob.v0(aob.d6, vnbVar));
            case 15:
                return dtd.m(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.d6, vnbVar), aob.v0(aob.Ql, vnbVar));
            case 16:
                return dtd.m(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.d6, vnbVar), aob.v0(aob.Ql, vnbVar));
            case 17:
                return 855638016;
            case 18:
                return TLObject.FLAG_30;
            case 19:
                return aob.p1(0.88f, aob.v0(aob.d6, vnbVar));
            case 20:
                return aob.p1(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.wj, vnbVar));
            case 21:
                return aob.p1(z ? 0.82f : 0.78f, aob.v0(aob.h5, vnbVar));
            case 22:
                return aob.p1(0.075f, -16777216);
            case 23:
                return aob.p1(z ? 0.85f : 0.825f, aob.v0(aob.G8, vnbVar));
            case 24:
                return dtd.m(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.d6, vnbVar), aob.v0(aob.Pl, vnbVar));
            case 25:
                return aob.p1(i86.e(262144) ? 0.85f : 0.76f, aob.v0(aob.d6, vnbVar));
            case 26:
                return aob.p1(0.78f, aob.v0(aob.h5, vnbVar));
            case 27:
                return aob.p1(0.7f, aob.v0(aob.d6, vnbVar));
            default:
                i86.e(262144);
                return 0;
        }
    }

    @Override // fd
    public final void w(id idVar, int i) {
        idVar.dismiss();
    }
}
