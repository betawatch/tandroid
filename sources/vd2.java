// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.view.View;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class vd2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vd2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:97:0x018f  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        moa moaVar;
        c74 c74Var;
        byte b = this.a;
        Bitmap bitmap2 = null;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                wd2 wd2Var = (wd2) ((ri6) obj).b;
                ud2 ud2Var = wd2Var.b;
                if (ud2Var != null) {
                    ud2Var.a(true);
                }
                wd2Var.a.L5(true);
                break;
            case 1:
                ((le) obj).a(0);
                break;
            case 2:
                dg2 dg2Var = (dg2) obj;
                l9c l9cVar = dg2Var.Z1;
                if (l9cVar != null) {
                    l9cVar.O(true);
                }
                dg2Var.Z0(true);
                break;
            case 3:
                mg2 mg2Var = (mg2) ((z8d) obj).b;
                mg2Var.c.g3.O(true);
                mg2Var.f0();
                break;
            case 4:
                ((eh2) obj).invalidateSelf();
                break;
            case 5:
                ((zi2) obj).dismiss();
                break;
            case 6:
                ((jl2) obj).g = -1L;
                break;
            case 7:
                ((ll2) obj).a();
                break;
            case 8:
                ((rp2) obj).a();
                break;
            case 9:
                ((pq2) obj).invalidateOptionsMenu();
                break;
            case 10:
                nq2 nq2Var = (nq2) obj;
                Runnable runnable = nq2Var.b;
                if (runnable != null) {
                    runnable.run();
                    nq2Var.b = null;
                    break;
                }
                break;
            case 11:
                rq2.b((rq2) obj);
                break;
            case 12:
                yq2 yq2Var = (yq2) obj;
                ArrayList arrayList = yq2Var.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((View) obj2).invalidate();
                }
                yq2Var.invalidateSelf();
                break;
            case 13:
                ((hr2) obj).invalidateSelf();
                break;
            case 14:
                ir2 ir2Var = (ir2) obj;
                StringBuilder sb = new StringBuilder("emoji/compound/0_");
                ir2Var.getClass();
                sb.append(ir2Var.a);
                sb.append("_");
                String l = uh9.l(sb, ir2Var.b ? 1 : 0, ".png");
                HashMap hashMap = pv3.a;
                try {
                    int i2 = hl.p > 1.0f ? 1 : 2;
                    try {
                        InputStream open = a.b.getAssets().open(l);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = i2;
                        bitmap = BitmapFactory.decodeStream(open, null, options);
                        try {
                            open.close();
                        } catch (Throwable th) {
                            th = th;
                            cc4.g(th, true);
                            bitmap2 = bitmap;
                            if (bitmap2 != null) {
                            }
                            ir2.f.remove(Integer.valueOf(ir2Var.c));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap = null;
                    }
                    bitmap2 = bitmap;
                } catch (Throwable th3) {
                    if (f11.a) {
                        cc4.e("Error loading emoji", th3);
                    }
                }
                if (bitmap2 != null) {
                    ir2.e.put(ir2Var.c, bitmap2);
                    jm3 jm3Var = pv3.l;
                    hl.r(jm3Var);
                    hl.c3(jm3Var);
                }
                ir2.f.remove(Integer.valueOf(ir2Var.c));
            case 15:
                ((d30) obj).o(true);
                break;
            case 16:
                ((nw2) obj).a.d();
                break;
            case 17:
                by2 by2Var = (by2) obj;
                long j = by2Var.b;
                if (j > 0) {
                    long j2 = j - 1;
                    by2Var.b = j2;
                    by2Var.a.l(j2);
                }
                if (by2Var.b <= 0) {
                    by2Var.c = false;
                }
                if (by2Var.c) {
                    hl.d3(by2Var.d, 1000L);
                    break;
                }
                break;
            case 18:
                ((ry2) obj).Y1.O(true);
                break;
            case 19:
                h13 h13Var = ((g13) obj).c;
                TLRPC.Peer peer = h13Var.Y1;
                e eVar = h13Var.a2;
                y13 y13Var = new y13(eVar, peer, h13Var.b2, h13Var.T1.size() > 1, h13Var.S1);
                if (eVar.getParentActivity() == null) {
                    y13Var.show();
                    break;
                } else {
                    eVar.showDialog(y13Var);
                    break;
                }
            case 20:
                ((o23) obj).e().B(new xu4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                break;
            case 21:
                q33 q33Var = (q33) obj;
                g44 g44Var = q33Var.b.J;
                if (g44Var != null) {
                    g44Var.b();
                }
                q33Var.b.k();
                break;
            case 22:
                ((ValueAnimator) obj).start();
                break;
            case 23:
                e eVar2 = ((a53) obj).h2.r;
                if (!(eVar2 instanceof zu1)) {
                    e Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new xk8(eVar2, 11, false));
                        break;
                    }
                } else {
                    eVar2.showDialog(new xk8(eVar2, 11, false));
                    break;
                }
                break;
            case 24:
                ea3 ea3Var = (ea3) obj;
                uj Q2 = ea3Var.Q();
                ea3Var.V(Q2, 1028, new aa3(Q2, (byte) 7));
                ea3Var.f.d();
                break;
            case 25:
                ja3 ja3Var = (ja3) obj;
                if (ja3Var.d0 >= 300000) {
                    ja3Var.n.z();
                    ja3Var.d0 = 0L;
                    break;
                }
                break;
            case 26:
                va3 va3Var = (va3) obj;
                if (!va3Var.c) {
                    jr3 jr3Var = va3Var.b;
                    if (jr3Var != null) {
                        jr3Var.c(va3Var.a);
                    }
                    va3Var.d.y.remove(va3Var);
                    va3Var.c = true;
                    break;
                }
                break;
            case 27:
                ((ta3) obj).c(null);
                break;
            case 28:
                ld3 ld3Var = (ld3) obj;
                if (ld3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && (moaVar = ld3Var.i) != null && moaVar.b && (c74Var = ld3Var.a) != null) {
                    c74Var.h.c(10, null).b();
                    break;
                }
                break;
            default:
                ((pd3) obj).i.w();
                break;
        }
    }
}
