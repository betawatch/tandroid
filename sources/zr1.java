// default package

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zr1 extends yp {
    public final /* synthetic */ byte c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zr1(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    @Override // yp
    public final int i(int i) {
        int i2;
        k47 k47Var;
        f47 v7;
        int i3;
        c47 d;
        k47 k47Var2;
        f47 c;
        int i4;
        int i5;
        int i6;
        int i7;
        byte b = this.c;
        Object obj = this.d;
        switch (b) {
            case 0:
                yv1 yv1Var = (yv1) obj;
                hu1 hu1Var = yv1Var.D0;
                int i8 = hu1Var.K;
                if (i < i8 || i >= hu1Var.L || (i2 = i - i8) < 0 || i2 >= hu1Var.G().size() || (v7 = yv1Var.v7((k47Var = (k47) yv1Var.D0.G().get(i2)))) == null) {
                    return 1000;
                }
                return v7.d(k47Var).i;
            case 1:
                h32 h32Var = (h32) obj;
                int i9 = h32Var.r;
                byte b2 = h32Var.x;
                return i9 + (i % b2 != b2 - 1 ? gm.L(5.0f) : 0);
            case 2:
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) obj;
                if (i == chatAttachAlertPhotoLayout.H.n - 1 || ((chatAttachAlertPhotoLayout.Q0 || chatAttachAlertPhotoLayout.P0) && i == 0)) {
                    return chatAttachAlertPhotoLayout.G.J;
                }
                if (chatAttachAlertPhotoLayout.P0) {
                    i--;
                }
                int i10 = chatAttachAlertPhotoLayout.L0;
                byte b3 = chatAttachAlertPhotoLayout.N0;
                return i10 + (i % b3 != b3 - 1 ? gm.L(2.0f) : 0);
            case 3:
                xw3 xw3Var = (xw3) obj;
                if (xw3Var.Y.c.E(i) == null) {
                    return xw3Var.J;
                }
                xw3Var.z1();
                return xw3Var.R.get(i);
            case 4:
                ex3 ex3Var = (ex3) obj;
                if (ex3Var.c.d(i) != 2) {
                    return ex3Var.h;
                }
                return 1;
            case 5:
                k24 k24Var = (k24) obj;
                e34 e34Var = k24Var.Y;
                if (i == 0) {
                    e34Var.o0.getClass();
                }
                y59 adapter = e34Var.i0.getAdapter();
                j24 j24Var = e34Var.k0;
                if (adapter == j24Var && j24Var.y.isEmpty()) {
                    return k24Var.J;
                }
                e34Var.o0.getClass();
                k24Var.z1();
                return k24Var.R.get(i);
            case 6:
                return (i == 0 || i == 1 || i == ((tt4) obj).f.b() - 1) ? 3 : 1;
            case 7:
                ux4 ux4Var = (ux4) obj;
                f84 f84Var = ux4Var.c2;
                l7c l7cVar = ux4Var.T1;
                if (l7cVar == null || i == 0) {
                    return f84Var.J;
                }
                c6c G = l7cVar.G(i - 1);
                return (G == null || (i3 = G.v) == -1) ? f84Var.J : i3;
            case 8:
                pv7 pv7Var = (pv7) obj;
                int size = (pv7Var.u0.size() - 1) - i;
                f47 f47Var = pv7Var.v0;
                if (f47Var == null || size < 0 || size >= f47Var.d.size() || (d = f47Var.d((k47) f47Var.d.get(size))) == null) {
                    return 1000;
                }
                return d.i;
            case 9:
                f57 f57Var = (f57) obj;
                if (i < 0 || i >= f57Var.r.f.size() || (c = f57Var.c((k47Var2 = (k47) f57Var.r.f.get(i)))) == null) {
                    return 1000;
                }
                return c.d(k47Var2).i;
            case 10:
                j67 j67Var = (j67) obj;
                ArrayList arrayList = j67Var.N;
                k47 k47Var3 = (k47) arrayList.get((arrayList.size() - 1) - i);
                f47 j = j67Var.j(k47Var3);
                if (j != null) {
                    return j.d(k47Var3).i;
                }
                return 1000;
            case 11:
                w28 w28Var = (w28) obj;
                return ((i < w28Var.c0 || i >= w28Var.d0) && (i < w28Var.e0 || i >= w28Var.f0)) ? 3 : 1;
            case 12:
                w78 w78Var = (w78) obj;
                if (w78Var.M.d(i) == 1 || w78Var.Z || (w78Var.K == null && TextUtils.isEmpty(w78Var.w))) {
                    return w78Var.N.J;
                }
                int i11 = w78Var.S;
                byte b4 = w78Var.h0;
                return i11 + (i % b4 != b4 - 1 ? gm.L(2.0f) : 0);
            case 13:
                gy8 gy8Var = (gy8) obj;
                if (gy8Var.e.d(i) == 0) {
                    return gy8Var.r;
                }
                return 1;
            case 14:
                c6c G2 = ((yb9) obj).d2.G(i - 1);
                if (G2 == null || (i4 = G2.v) == -1) {
                    return 3;
                }
                return i4;
            case 15:
                p0a p0aVar = (p0a) obj;
                f84 f84Var2 = p0aVar.V1;
                l7c l7cVar2 = p0aVar.b2;
                if (l7cVar2 == null) {
                    return f84Var2.J;
                }
                c6c G3 = l7cVar2.G(i - 1);
                return (G3 == null || (i5 = G3.v) == -1) ? f84Var2.J : i5;
            case 16:
                s0a s0aVar = (s0a) obj;
                f84 f84Var3 = s0aVar.S1;
                l7c l7cVar3 = s0aVar.Y1;
                if (l7cVar3 == null) {
                    return f84Var3.J;
                }
                c6c G4 = l7cVar3.G(i - 1);
                return (G4 == null || (i6 = G4.v) == -1) ? f84Var3.J : i6;
            case 17:
                kpa kpaVar = (kpa) obj;
                f84 f84Var4 = kpaVar.c2;
                fpa fpaVar = kpaVar.f2;
                if (fpaVar == null || i == 0) {
                    return f84Var4.J;
                }
                c6c G5 = fpaVar.G(i - 1);
                return (G5 == null || (i7 = G5.v) == -1) ? f84Var4.J : i7;
            default:
                x2b x2bVar = (x2b) obj;
                if ((x2bVar.Q1 == null || !(x2bVar.n1.e.get(i) instanceof Integer)) && i != x2bVar.n1.h) {
                    return 1;
                }
                return x2bVar.n1.d;
        }
    }
}
