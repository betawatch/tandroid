// default package

import android.os.Handler;
import android.text.TextUtils;
import j$.util.Objects;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.messenger.camera.CameraController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.Wallet.c;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class s91 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ s91(zv2 zv2Var, String str, File file, boolean z, boolean z2) {
        this.a = (byte) 1;
        this.d = zv2Var;
        this.e = str;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qb4 qb4Var;
        qb4 qb4Var2;
        NativeInstance nativeInstance;
        switch (this.a) {
            case 0:
                ((CameraController) this.d).lambda$stopVideoRecording$17(this.e, this.b, this.c);
                break;
            case 1:
                zv2 zv2Var = (zv2) this.d;
                String str = (String) this.e;
                boolean z = this.b;
                boolean z2 = this.c;
                bw2 bw2Var = zv2Var.b;
                bw2Var.f0 = false;
                bw2Var.g0 = str;
                if (str == null) {
                    bw2Var.g0 = "";
                }
                bw2Var.h0 = z;
                bw2Var.f(z2, true);
                break;
            case 2:
                y94 y94Var = (y94) this.d;
                boolean z3 = this.b;
                String str2 = (String) this.e;
                boolean z4 = this.c;
                ba4 ba4Var = y94Var.d;
                if (z3) {
                    ba4Var.n.remove(str2);
                } else {
                    ba4Var.h.remove(str2);
                }
                pk5 pk5Var = y94Var.d.F;
                if (pk5Var != null) {
                    Utilities.d.c(new bs1((Object) pk5Var, pk5Var.a, (Object) str2, z3, (byte) 5));
                }
                ba4 ba4Var2 = y94Var.d;
                if (!z4) {
                    int i = ba4Var2.r - 1;
                    ba4Var2.r = i;
                    if (i < 1 && (qb4Var = (qb4) ba4Var2.e.poll()) != null) {
                        y94Var.d.r++;
                        qb4Var.c();
                        break;
                    }
                } else {
                    int i2 = ba4Var2.s - 1;
                    ba4Var2.s = i2;
                    if (i2 < 1 && (qb4Var2 = (qb4) ba4Var2.f.poll()) != null) {
                        y94Var.d.s++;
                        qb4Var2.c();
                        break;
                    }
                }
                break;
            case 3:
                c cVar = (c) this.d;
                p8c p8cVar = (p8c) this.e;
                boolean z5 = this.b;
                boolean z6 = this.c;
                TL_wallet.TL_walletState tL_walletState = (TL_wallet.TL_walletState) cVar.e;
                g15 g15Var = cVar.c;
                if (g15Var == null || !TextUtils.equals(g15Var.c, tL_walletState.address) || !cVar.c.f(tL_walletState.public_key)) {
                    cVar.E(z5, z6, false, new p((Object) cVar, (Object) p8cVar, (Object) tL_walletState, (byte) 14));
                    break;
                } else {
                    p8cVar.a(null);
                    break;
                }
            case 4:
                nm9 nm9Var = (nm9) this.d;
                NativeInstance nativeInstance2 = (NativeInstance) this.e;
                boolean z7 = this.b;
                boolean z8 = this.c;
                boolean z9 = nm9Var.w;
                if (!z9 && (nativeInstance = nm9Var.P) == nativeInstance2 && !z7 && !nm9Var.h) {
                    if (!z8) {
                        yz0 yz0Var = nm9Var.Y;
                        if (yz0Var != null) {
                            yz0Var.k();
                            nm9Var.Y = null;
                        }
                        nm9Var.Z = false;
                        break;
                    } else if (!z9 && nativeInstance != null && nm9Var.Y == null) {
                        yz0 yz0Var2 = new yz0(nm9Var.e, nm9Var.f, nm9Var.k(), nm9Var.P, new im9(nm9Var, nativeInstance));
                        nm9Var.Y = yz0Var2;
                        yz0Var2.b.post(new x6c((byte) 6, yz0Var2, a.o()));
                        nm9Var.N();
                        yz0 yz0Var3 = nm9Var.Y;
                        Handler handler = yz0Var3.b;
                        pz0 pz0Var = yz0Var3.d;
                        Objects.requireNonNull(pz0Var);
                        handler.post(new yy0(pz0Var, (byte) 6));
                        break;
                    }
                }
                break;
            default:
                ekc ekcVar = (ekc) this.d;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.e;
                boolean z10 = this.b;
                boolean z11 = this.c;
                atomicBoolean.set(false);
                ((aec) ekcVar.c).d(z10, z11);
                break;
        }
    }

    public /* synthetic */ s91(y94 y94Var, boolean z, String str, boolean z2) {
        this.a = (byte) 2;
        this.d = y94Var;
        this.b = z;
        this.e = str;
        this.c = z2;
    }

    public /* synthetic */ s91(Object obj, Object obj2, boolean z, boolean z2, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.c = z2;
    }
}
