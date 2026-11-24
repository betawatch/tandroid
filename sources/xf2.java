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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class xf2 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xf2(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x019a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Bitmap bitmap;
        tma tmaVar;
        r74 r74Var;
        byte b = this.a;
        Bitmap bitmap2 = null;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((fi) obj).a(0);
                break;
            case 1:
                yg2 yg2Var = (yg2) obj;
                l7c l7cVar = yg2Var.Z1;
                if (l7cVar != null) {
                    l7cVar.O(true);
                }
                yg2Var.Y0(true);
                break;
            case 2:
                hh2 hh2Var = (hh2) ((k6d) obj).b;
                hh2Var.c.g3.O(true);
                hh2Var.g0();
                break;
            case 3:
                ((ai2) obj).invalidateSelf();
                break;
            case 4:
                ((rj2) obj).dismiss();
                break;
            case 5:
                ((bm2) obj).g = -1L;
                break;
            case 6:
                ((dm2) obj).a();
                break;
            case 7:
                ((jq2) obj).a();
                break;
            case 8:
                ((hr2) obj).invalidateOptionsMenu();
                break;
            case 9:
                fr2 fr2Var = (fr2) obj;
                Runnable runnable = fr2Var.b;
                if (runnable != null) {
                    runnable.run();
                    fr2Var.b = null;
                    break;
                }
                break;
            case 10:
                jr2.b((jr2) obj);
                break;
            case 11:
                qr2 qr2Var = (qr2) obj;
                ArrayList arrayList = qr2Var.c;
                int size = arrayList.size();
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    ((View) obj2).invalidate();
                }
                qr2Var.invalidateSelf();
                break;
            case 12:
                ((zr2) obj).invalidateSelf();
                break;
            case 13:
                as2 as2Var = (as2) obj;
                StringBuilder sb = new StringBuilder("emoji/compound/0_");
                as2Var.getClass();
                sb.append(as2Var.a);
                sb.append("_");
                String k = hg9.k(sb, as2Var.b ? 1 : 0, ".png");
                HashMap hashMap = gw3.a;
                try {
                    r3 = gm.p > 1.0f ? (byte) 1 : (byte) 2;
                    try {
                        InputStream open = a.b.getAssets().open(k);
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = false;
                        options.inSampleSize = r3;
                        bitmap = BitmapFactory.decodeStream(open, null, options);
                        try {
                            open.close();
                        } catch (Throwable th) {
                            th = th;
                            fc4.g(th, true);
                            bitmap2 = bitmap;
                            if (bitmap2 != null) {
                            }
                            as2.f.remove(Integer.valueOf(as2Var.c));
                            return;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bitmap = null;
                    }
                    bitmap2 = bitmap;
                } catch (Throwable th3) {
                    if (e21.a) {
                        fc4.e("Error loading emoji", th3);
                    }
                }
                if (bitmap2 != null) {
                    as2.e.put(as2Var.c, bitmap2);
                    bn3 bn3Var = gw3.l;
                    gm.r(bn3Var);
                    gm.c3(bn3Var);
                }
                as2.f.remove(Integer.valueOf(as2Var.c));
            case 14:
                ((c40) obj).o(true);
                break;
            case 15:
                ((dx2) obj).a.d();
                break;
            case 16:
                ry2 ry2Var = (ry2) obj;
                long j = ry2Var.b;
                if (j > 0) {
                    long j2 = j - 1;
                    ry2Var.b = j2;
                    ry2Var.a.n(j2);
                }
                if (ry2Var.b <= 0) {
                    ry2Var.c = false;
                }
                if (ry2Var.c) {
                    gm.d3(ry2Var.d, 1000L);
                    break;
                }
                break;
            case 17:
                ((hz2) obj).Y1.O(true);
                break;
            case 18:
                a23 a23Var = ((z13) obj).c;
                TLRPC.Peer peer = a23Var.Y1;
                d dVar = a23Var.a2;
                r23 r23Var = new r23(dVar, peer, a23Var.b2, a23Var.T1.size() > 1, a23Var.S1);
                if (dVar.getParentActivity() == null) {
                    r23Var.show();
                    break;
                } else {
                    dVar.showDialog(r23Var);
                    break;
                }
            case 19:
                ((h33) obj).e().A(new uu4("Failed to launch the selector UI. Hint: ensure the `context` parameter is an Activity-based context.", (byte) 2));
                break;
            case 20:
                j43 j43Var = (j43) obj;
                v44 v44Var = j43Var.b.J;
                if (v44Var != null) {
                    v44Var.b();
                }
                j43Var.b.k();
                break;
            case 21:
                ((ValueAnimator) obj).start();
                break;
            case 22:
                d dVar2 = ((t53) obj).h2.r;
                if (!(dVar2 instanceof yv1)) {
                    d Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new kj8(dVar2, 11, false));
                        break;
                    }
                } else {
                    dVar2.showDialog(new kj8(dVar2, 11, false));
                    break;
                }
                break;
            case 23:
                xa3 xa3Var = (xa3) obj;
                tk Q2 = xa3Var.Q();
                xa3Var.V(Q2, 1028, new ua3(Q2, r3));
                xa3Var.f.d();
                break;
            case 24:
                cb3 cb3Var = (cb3) obj;
                if (cb3Var.d0 >= 300000) {
                    cb3Var.n.v();
                    cb3Var.d0 = 0L;
                    break;
                }
                break;
            case 25:
                ob3 ob3Var = (ob3) obj;
                if (!ob3Var.c) {
                    cs3 cs3Var = ob3Var.b;
                    if (cs3Var != null) {
                        cs3Var.c(ob3Var.a);
                    }
                    ob3Var.d.y.remove(ob3Var);
                    ob3Var.c = true;
                    break;
                }
                break;
            case 26:
                ((mb3) obj).c(null);
                break;
            case 27:
                fe3 fe3Var = (fe3) obj;
                if (fe3Var.g.A0 && Build.VERSION.SDK_INT >= 32 && (tmaVar = fe3Var.i) != null && tmaVar.b && (r74Var = fe3Var.a) != null) {
                    r74Var.h.c(10, null).b();
                    break;
                }
                break;
            case 28:
                ((je3) obj).i.y();
                break;
            default:
                my0[] my0VarArr = (my0[]) obj;
                my0 my0Var = my0VarArr[0];
                if (my0Var != null) {
                    my0Var.dismiss();
                    my0VarArr[0] = null;
                    break;
                }
                break;
        }
    }
}
