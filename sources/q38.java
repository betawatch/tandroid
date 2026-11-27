// default package

import android.animation.ObjectAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.view.View;
import android.widget.FrameLayout;
import java.io.IOException;
import java.util.ArrayList;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.PremiumPreviewFragment;
import org.telegram.ui.ProfileActivity;
import org.webrtc.VideoSource;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final /* synthetic */ class q38 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q38(k09 k09Var, IOException iOException, boolean z) {
        this.a = (byte) 20;
        this.c = k09Var;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CheckBoxBase checkBoxBase;
        CheckBoxBase[] checkBoxBaseArr;
        CheckBoxBase checkBoxBase2;
        byte b = this.a;
        byte b2 = 1;
        boolean z = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((s38) obj).e.q0.J.F(1 - (z ? 1 : 0));
                break;
            case 1:
                PhotoViewer photoViewer = (PhotoViewer) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (!z) {
                    photoViewer.W0.setVisibility(8);
                    break;
                }
                break;
            case 2:
                RectF rectF = ProfileActivity.Z6;
                ((ProfileActivity) obj).Z3(z, true);
                break;
            case 3:
                ((FrameLayout) obj).setVisibility(z ? 4 : 0);
                break;
            case 4:
                m01.u(((wr8) obj).e.getParentActivity(), ob6.M0(z ? 2131746431 : 2131746433, null));
                break;
            case 5:
                dk9 dk9Var = (dk9) obj;
                hl9 hl9Var = dk9Var.a;
                boolean z2 = !z;
                TLObject tLObject = dk9Var.H;
                if (tLObject instanceof TL_iv.PageListItem) {
                    ((TL_iv.PageListItem) tLObject).checked = z2;
                } else if (tLObject instanceof TL_iv.PageListOrderedItem) {
                    ((TL_iv.PageListOrderedItem) tLObject).checked = z2;
                }
                View view = hl9Var.Q;
                if (view != null) {
                    dk9Var.r.a = view;
                }
                dk9Var.r.f(-1, z2, true);
                View view2 = hl9Var.Q;
                if (view2 != null) {
                    view2.invalidate();
                    break;
                }
                break;
            case 6:
                ((nm9) obj).p0(z ? "shown after a change away" : "shown, height differs", false);
                break;
            case 7:
                on9 on9Var = (on9) obj;
                on9Var.O = z;
                on9Var.P = on9Var.E();
                on9Var.Q = 0;
                on9Var.R = 0;
                on9Var.j.b("torch requested: enabled=" + z + ", available=" + on9Var.E() + ", cameraId=" + on9Var.o + ", facing=" + on9Var.F);
                on9Var.a();
                break;
            case 8:
                dr9 dr9Var = (dr9) obj;
                dr9Var.P.X = z ? 1.0f : 0.0f;
                dr9Var.L = true;
                dr9Var.requestLayout();
                break;
            case 9:
                xz0 xz0Var = ((rr9) obj).e;
                boolean z3 = !z;
                xz0Var.getClass();
                xz0Var.y = z3 == 1;
                break;
            case 10:
                ((aw9) obj).H.presentFragment(new PremiumPreviewFragment(0, z ? "upload_speed" : "download_speed"));
                break;
            case 11:
                i2a i2aVar = (i2a) obj;
                if (!z) {
                    i2aVar.setVisibility(8);
                    break;
                }
                break;
            case 12:
                eja ejaVar = (eja) obj;
                if (!z) {
                    ejaVar.p0.setVisibility(8);
                    break;
                }
                break;
            case 13:
                cga cgaVar = (cga) obj;
                if (!z) {
                    cgaVar.W.t0.setVisibility(8);
                    break;
                }
                break;
            case 14:
                fga fgaVar = (fga) obj;
                if (!z) {
                    fgaVar.x.t0.setVisibility(8);
                    break;
                }
                break;
            case 15:
                wma wmaVar = (wma) obj;
                ArrayList arrayList = wmaVar.r;
                vma vmaVar = wmaVar.n;
                if (vmaVar != null) {
                    vmaVar.L(wmaVar.f, z);
                }
                for (int i = 0; i < arrayList.size(); i++) {
                    ((vma) arrayList.get(i)).L(wmaVar.f, z);
                }
                break;
            case 16:
                xma xmaVar = (xma) obj;
                ArrayList arrayList2 = xmaVar.r;
                vma vmaVar2 = xmaVar.n;
                if (vmaVar2 != null) {
                    vmaVar2.L(xmaVar.i0, z);
                }
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    ((vma) arrayList2.get(i2)).L(xmaVar.i0, z);
                }
                break;
            case 17:
                gra graVar = (gra) obj;
                if (!z) {
                    graVar.l2.setVisibility(8);
                    break;
                }
                break;
            case 18:
                wua wuaVar = (wua) obj;
                wuaVar.v2(wuaVar.h3, hl.S2(ob6.a0(null, null, z ? 2131750385 : 2131750382, wuaVar.t1())), true);
                break;
            case 19:
                wua wuaVar2 = ((fta) obj).W;
                TL_stars.SavedStarGift y1 = wuaVar2.y1(z);
                if (y1 != null) {
                    wuaVar2.Z2 = true;
                    wuaVar2.o2(y1, wuaVar2.B2);
                } else {
                    TL_stars.TL_starGiftUnique z1 = wuaVar2.z1(z);
                    if (z1 != null) {
                        wuaVar2.Z2 = true;
                        wuaVar2.n2(z1.slug, z1, wuaVar2.B2);
                    }
                }
                wuaVar2.P2 = -1;
                v21 v21Var = v21.x;
                if (v21Var != null) {
                    v21Var.c(0L, false);
                    break;
                }
                break;
            case 20:
                v34 v34Var = (v34) ((ny8) ((k09) obj).b).f;
                v34Var.getClass();
                ug5 ug5Var = (ug5) v34Var.b;
                yve.p(ug5Var.k);
                if (z && ug5Var.m == null) {
                    ug5Var.f();
                    break;
                }
                break;
            case 21:
                vab vabVar = (vab) obj;
                if (!z) {
                    vabVar.o2.k1.setVisibility(8);
                    break;
                }
                break;
            case 22:
                ktb ktbVar = (ktb) obj;
                hl.c3(new ctb(ktbVar, b2));
                wb2 wb2Var = ktbVar.L;
                if (wb2Var != null) {
                    wb2Var.setVisibility(0);
                    if (!z) {
                        wb2 wb2Var2 = ktbVar.L;
                        int e2 = wb2Var2.e2(ktbVar.P);
                        itb itbVar = ktbVar.J;
                        CheckBoxBase[] checkBoxBaseArr2 = wb2Var2.f7;
                        if (checkBoxBaseArr2 != null && e2 >= 0 && e2 < checkBoxBaseArr2.length && (checkBoxBase = checkBoxBaseArr2[e2]) != null && itbVar != null && (checkBoxBaseArr = itbVar.f7) != null && e2 >= 0 && e2 < checkBoxBaseArr.length && (checkBoxBase2 = checkBoxBaseArr[e2]) != null) {
                            ObjectAnimator objectAnimator = checkBoxBase.p;
                            if (objectAnimator != null) {
                                objectAnimator.cancel();
                                checkBoxBase.p = null;
                            }
                            checkBoxBase.setProgress(checkBoxBase2.getProgress());
                            checkBoxBase.f(-1, checkBoxBase2.q, true);
                        }
                    }
                    wb2 wb2Var3 = ktbVar.L;
                    wb2Var3.c6 = -1;
                    wb2Var3.invalidate();
                }
                st1 st1Var = ktbVar.d0;
                if (st1Var != null) {
                    hl.c3(st1Var);
                    ktbVar.d0 = null;
                    break;
                }
                break;
            case 23:
                ((icc) obj).a(null, Boolean.valueOf(z));
                break;
            case 24:
                ((l9c) obj).Q(z);
                break;
            case 25:
                ((VideoCapturerDevice) obj).lambda$new$0(z);
                break;
            case 26:
                ((VideoSource) obj).lambda$setIsScreencast$1(z);
                break;
            case 27:
                ((VoIPService) obj).lambda$startGroupCall$30(z);
                break;
            case 28:
                ((AudioManager) obj).setSpeakerphoneOn(z);
                break;
            default:
                ((View) obj).setVisibility(z ? 0 : 8);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ q38(s38 s38Var, int i) {
        this.a = (byte) 0;
        this.c = s38Var;
        this.b = i;
    }

    public /* synthetic */ q38(byte b, Object obj, boolean z) {
        this.a = b;
        this.c = obj;
        this.b = z;
    }
}
