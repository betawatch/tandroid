// default package

import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.v;
import org.telegram.ui.z;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class x38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x38(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:189:0x02ac, code lost:
    
        if (r6.b.contains(java.lang.Long.valueOf(r4.id)) == false) goto L163;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i;
        nr1 nr1Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                y38 y38Var = (y38) obj;
                a48 a48Var = y38Var.c;
                g48 g48Var = a48Var.F;
                h48 h48Var = a48Var.q0;
                if (g48Var != null && a48Var.M.size() > 1) {
                    g48Var.a(1, true);
                    TL_stars.StarGift starGift = (TL_stars.StarGift) a48Var.N.get(1);
                    a48Var.L = starGift;
                    ed9 ed9Var = a48Var.K;
                    if (starGift != null) {
                        if (ed9Var != null) {
                            break;
                        }
                        i = ((e) h48Var).currentAccount;
                        ed9 ed9Var2 = new ed9(i, a48Var.L.id, new ii7(y38Var, (byte) 12));
                        ed9Var2.x = true;
                        a48Var.K = ed9Var2;
                        ed9Var2.o(false);
                    } else if (ed9Var != null) {
                        ed9Var.i();
                        a48Var.K = null;
                    }
                    a48Var.e();
                    (h48Var.J.getCurrentPosition() == 1 ? h48Var.n : h48Var.h).d();
                    break;
                }
                break;
            case 1:
                ((q58) obj).a.K0();
                break;
            case 2:
                o68 o68Var = ((t58) obj).y;
                k68 k68Var = o68Var.A1;
                if (k68Var != null) {
                    if (!o68Var.D1 && !o68Var.E1 && !o68Var.F1) {
                        lcb lcbVar = ((ccb) k68Var).d;
                        if (!lcbVar.o0.getCurrentPeerView().Z0(true) && !lcbVar.o0.E(true)) {
                            lcbVar.o(true);
                            break;
                        }
                    } else if (o68Var.y1.e) {
                        ((kcb) o68Var.w2.c).loopBack();
                        break;
                    } else {
                        o68Var.G0 = 0L;
                        break;
                    }
                }
                break;
            case 3:
                ((w68) obj).n1.start();
                break;
            case 4:
                ((d88) obj).a.invalidate();
                break;
            case 5:
                rf4 rf4Var = ((z88) obj).c.m0;
                if (rf4Var != null) {
                    rf4Var.b(false, true, false);
                    break;
                }
                break;
            case 6:
                b98 b98Var = (b98) obj;
                b98Var.r = false;
                b98Var.invalidate();
                break;
            case 7:
                l98 l98Var = (l98) ((cm0) obj).c;
                l98Var.f0(l98Var.Q.getSearchField());
                break;
            case 8:
                ((g98) obj).j0.M.f();
                break;
            case 9:
                ((ad8) obj).invalidate();
                break;
            case 10:
                vy0 vy0Var = (vy0) obj;
                PhotoViewer photoViewer = (PhotoViewer) vy0Var.d;
                long j = vy0Var.a;
                Drawable[] drawableArr = PhotoViewer.d9;
                photoViewer.C1(j);
                if (photoViewer.d2 == 1) {
                    long j2 = vy0Var.a;
                    photoViewer.c8 = j2;
                    if (photoViewer.b8 != j2) {
                        photoViewer.b8 = -1L;
                    }
                }
                vy0Var.c = null;
                break;
            case 11:
                PhotoViewer photoViewer2 = (PhotoViewer) ((rf3) obj).b;
                ImageView imageView = photoViewer2.E3;
                if (imageView != null && imageView.getParent() != null) {
                    ((ViewGroup) photoViewer2.E3.getParent()).removeView(photoViewer2.E3);
                    if (photoViewer2.D3 != null) {
                        ImageView imageView2 = photoViewer2.E3;
                        if (imageView2 != null) {
                            imageView2.setBackground(null);
                        }
                        hl.w2(photoViewer2.D3);
                        photoViewer2.D3 = null;
                    }
                    photoViewer2.E3 = null;
                    break;
                }
                break;
            case 12:
                zu1 zu1Var = ((tb8) obj).W2.k4;
                if (zu1Var != null && (nr1Var = zu1Var.a0) != null) {
                    nr1Var.o1();
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer3 = (PhotoViewer) ((v5) ((n88) obj).b).c;
                photoViewer3.H2 = false;
                kfc kfcVar = photoViewer3.G2;
                if (kfcVar != null) {
                    kfcVar.g0();
                }
                photoViewer3.I2 = null;
                break;
            case 14:
                PhotoViewer photoViewer4 = ((ua8) obj).a;
                photoViewer4.H2 = false;
                kfc kfcVar2 = photoViewer4.G2;
                if (kfcVar2 != null) {
                    kfcVar2.g0();
                }
                photoViewer4.I2 = null;
                break;
            case 15:
                PhotoViewer photoViewer5 = ((v) ((n88) obj).b).r;
                photoViewer5.q7.e();
                Runnable runnable = photoViewer5.o4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer5.o4 = null;
                }
                photoViewer5.H1(true);
                break;
            case 16:
                PhotoViewer photoViewer6 = ((wb8) obj).b;
                Runnable runnable2 = photoViewer6.o4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer6.o4 = null;
                    break;
                }
                break;
            case 17:
                ((vc8) obj).y.e(true);
                break;
            case 18:
                ((zc8) obj).d = true;
                break;
            case 19:
                z zVar = (z) obj;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zVar.a.O0.getLayoutParams();
                ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                int D = ik8.D(34.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer7 = zVar.a;
                int i2 = D + (!photoViewer7.s ? hl.m : 0);
                if (i2 != layoutParams.topMargin) {
                    layoutParams.topMargin = i2;
                    photoViewer7.O0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zVar.a.P0.getLayoutParams();
                int D2 = ik8.D(40.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer8 = zVar.a;
                int i3 = D2 + (photoViewer8.s ? 0 : hl.m);
                if (layoutParams2.topMargin != i3) {
                    layoutParams2.topMargin = i3;
                    photoViewer8.P0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 20:
                ((ld8) obj).h = null;
                break;
            case 21:
                ld8 ld8Var = (ld8) ((um4) obj).c;
                ld8Var.d.p0(ld8Var.e, false);
                break;
            case 22:
                nc8 nc8Var = (nc8) obj;
                if (nc8Var.y) {
                    nc8Var.h("pollPosition();");
                }
                if (nc8Var.H) {
                    hl.d3(nc8Var.M, 500L);
                    break;
                }
                break;
            case 23:
                fc3 fc3Var = (fc3) obj;
                ArrayList arrayList = (ArrayList) fc3Var.c;
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    me8 me8Var = (me8) arrayList.get(i4);
                    xl4 xl4Var = me8Var.e;
                    if (xl4Var != null && me8Var.c == 1 && xl4Var.h && !xl4Var.N) {
                        if ((!xl4Var.d && xl4Var.b.E() && Settings.canDrawOverlays(xl4Var.c)) != xl4Var.g) {
                            xl4Var.m();
                            xl4Var.a();
                        }
                    }
                }
                fc3Var.d();
                break;
            case 24:
                ((je8) obj).g0();
                break;
            case 25:
                me8 me8Var2 = (me8) obj;
                if (me8Var2.c == 1) {
                    me8Var2.a.p0();
                    break;
                }
                break;
            case 26:
                ((xf8) obj).m--;
                break;
            case 27:
                ((pg8) obj).f();
                break;
            case 28:
                hl.E3(((xg8) obj).a);
                break;
            default:
                e29 e29Var = ((ok8) obj).G;
                e29Var.getAnimatedDrawable().I(0, true, false);
                e29Var.d();
                break;
        }
    }
}
