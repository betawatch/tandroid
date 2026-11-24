// default package

import android.graphics.RectF;
import android.provider.Settings;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b0;
import org.telegram.ui.v;
import org.telegram.ui.z;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class w88 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w88(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                PhotoViewer photoViewer = ((v) ((l48) obj).b).r;
                photoViewer.q7.e();
                Runnable runnable = photoViewer.o4;
                if (runnable != null) {
                    runnable.run();
                    photoViewer.o4 = null;
                }
                photoViewer.H1(true);
                break;
            case 1:
                PhotoViewer photoViewer2 = ((e88) obj).b;
                Runnable runnable2 = photoViewer2.o4;
                if (runnable2 != null) {
                    runnable2.run();
                    photoViewer2.o4 = null;
                    break;
                }
                break;
            case 2:
                ((f98) obj).y.e(true);
                break;
            case 3:
                ((j98) obj).d = true;
                break;
            case 4:
                z zVar = (z) obj;
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) zVar.a.O0.getLayoutParams();
                ((WindowManager) a.b.getSystemService("window")).getDefaultDisplay().getRotation();
                int D = ug8.D(34.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer3 = zVar.a;
                int i = D + (!photoViewer3.s ? gl.m : 0);
                if (i != layoutParams.topMargin) {
                    layoutParams.topMargin = i;
                    photoViewer3.O0.setLayoutParams(layoutParams);
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) zVar.a.P0.getLayoutParams();
                int D2 = ug8.D(40.0f, org.telegram.ui.ActionBar.a.getCurrentActionBarHeight(), 2);
                PhotoViewer photoViewer4 = zVar.a;
                int i2 = D2 + (photoViewer4.s ? 0 : gl.m);
                if (layoutParams2.topMargin != i2) {
                    layoutParams2.topMargin = i2;
                    photoViewer4.P0.setLayoutParams(layoutParams2);
                    break;
                }
                break;
            case 5:
                ((v98) obj).h = null;
                break;
            case 6:
                v98 v98Var = (v98) ((wk4) obj).c;
                v98Var.d.p0(v98Var.e, false);
                break;
            case 7:
                x88 x88Var = (x88) obj;
                if (x88Var.y) {
                    x88Var.h("pollPosition();");
                }
                if (x88Var.H) {
                    gl.d3(x88Var.M, 500L);
                    break;
                }
                break;
            case 8:
                mb3 mb3Var = (mb3) obj;
                ArrayList arrayList = (ArrayList) mb3Var.c;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    xa8 xa8Var = (xa8) arrayList.get(i3);
                    sj4 sj4Var = xa8Var.e;
                    if (sj4Var != null && xa8Var.c == 1 && sj4Var.g && !sj4Var.K) {
                        if ((sj4Var.b.U() && Settings.canDrawOverlays(sj4Var.c)) != sj4Var.f) {
                            sj4Var.l();
                            sj4Var.a();
                        }
                    }
                }
                mb3Var.d();
                break;
            case 9:
                ((sa8) obj).u1();
                break;
            case 10:
                xa8 xa8Var2 = (xa8) obj;
                if (xa8Var2.c == 1) {
                    xa8Var2.a.P1();
                    break;
                }
                break;
            case 11:
                ((ic8) obj).m--;
                break;
            case 12:
                ((bd8) obj).f();
                break;
            case 13:
                gl.E3(((jd8) obj).a);
                break;
            case 14:
                ry8 ry8Var = ((ah8) obj).G;
                ry8Var.getAnimatedDrawable().I(0, true, false);
                ry8Var.d();
                break;
            case 15:
                ((jh8) ((hh8) obj).c).D0();
                break;
            case 16:
                PremiumPreviewFragment premiumPreviewFragment = ((b0) obj).c;
                premiumPreviewFragment.showDialog(new cb9(premiumPreviewFragment.getParentActivity(), false, premiumPreviewFragment.getResourceProvider(), null));
                break;
            case 17:
                qi8 qi8Var = (qi8) obj;
                int size = 1073741823 - (1073741823 % qi8Var.f3.size());
                t26 t26Var = qi8Var.g3;
                qi8Var.t3 = size;
                t26Var.g1(size, (qi8Var.getMeasuredHeight() - qi8Var.getChildAt(0).getMeasuredHeight()) >> 1);
                qi8Var.z1(null, false);
                break;
            case 18:
                dl8 dl8Var = (dl8) obj;
                g16 g16Var = dl8Var.f;
                if (dl8Var.b == 0) {
                    dl8Var.c = true;
                    g16Var.e(u06.ON_PAUSE);
                }
                if (dl8Var.a == 0 && dl8Var.c) {
                    g16Var.e(u06.ON_STOP);
                    dl8Var.d = true;
                    break;
                }
                break;
            case 19:
                RectF rectF = ProfileActivity.Z6;
                ((rl8) obj).a(0);
                break;
            case 20:
                pm8 pm8Var = (pm8) obj;
                pm8Var.G.getNotificationCenter().j(pm8Var.F);
                break;
            case 21:
                ProfileActivity profileActivity = (ProfileActivity) ((st) obj).c;
                if (profileActivity.t5 != 1.0f) {
                    ym8 ym8Var = profileActivity.o0;
                    while (ym8Var.E0.k(r2) != ym8Var.getRealCount() - 1) {
                        r2++;
                    }
                    ym8Var.x(r2, true);
                    break;
                }
                break;
            case 22:
                ProfileActivity profileActivity2 = ((rn8) obj).b;
                RectF rectF2 = ProfileActivity.Z6;
                profileActivity2.getMessagesController().j5(profileActivity2.e1, 0, true, new vn2(profileActivity2, true, b2));
                break;
            case 23:
                vn8 vn8Var = (vn8) obj;
                vn8Var.T0(vn8Var.getTabProgress());
                break;
            case 24:
                ((mo8) obj).c();
                break;
            case 25:
                ((bp8) obj).a();
                break;
            case 26:
                yo8 yo8Var = (yo8) obj;
                yo8Var.f.add(yo8Var.c);
                yo8Var.a();
                break;
            case 27:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                break;
            case 28:
                ((qr8) obj).invalidate();
                break;
            default:
                rr8 rr8Var = (rr8) obj;
                if (rr8Var.getParent() instanceof o39) {
                    ((o39) rr8Var.getParent()).getOnItemClickListener().d(RecyclerView.R(rr8Var), rr8Var);
                    break;
                } else {
                    rr8Var.callOnClick();
                    break;
                }
        }
    }
}
