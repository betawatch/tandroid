package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class vt0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public vt0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        bv0 bv0Var;
        PhotoViewer photoViewer = this.b;
        int i10 = photoViewer.u4;
        if (i10 == 1) {
            photoViewer.C1.a();
            lg.p pVar = photoViewer.C1.b;
            pVar.d = null;
            pVar.J = false;
            photoViewer.U0.setVisibility(8);
            photoViewer.C1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.C1.b.a;
            cropAreaView.n0 = 0.0f;
            cropAreaView.o0 = 1.0f;
            cropAreaView.p0 = 0.0f;
            cropAreaView.q0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i10 == 2) {
            try {
                photoViewer.e0.removeView(photoViewer.I1);
            } catch (Exception e) {
                FileLog.e(e);
            }
            photoViewer.I1 = null;
        } else if (i10 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.e0.removeView(photoViewer.L1.getView());
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.L1 = null;
        } else if (i10 == 4) {
            photoViewer.O1 = true;
            photoViewer.e0.invalidate();
            photoViewer.e0.post(new fj0(23, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.v5.m(false, true);
            photoViewer.w5.m(false, true);
        } else if (i10 == 5) {
            photoViewer.q5.setVisibility(8);
            org.telegram.ui.Components.sf0 sf0Var = photoViewer.q5;
            sf0Var.d = null;
            sf0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.p6 = null;
        int i11 = photoViewer.u4;
        photoViewer.u4 = this.a;
        photoViewer.f1().L.b(photoViewer.u4 != 0);
        ci.j4 j4Var = photoViewer.K1;
        if (j4Var != null) {
            j4Var.b(photoViewer.u4 != 3);
        }
        if (photoViewer.u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.c2 == 1) {
            photoViewer.C1.setVisibility(0);
        }
        if (photoViewer.c2 == 11 && (i11 == 3 || i11 == 2 || i11 == 1 || i11 == 4)) {
            photoViewer.c6 = photoViewer.h6;
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
            photoViewer.f6 = photoViewer.k6;
        } else {
            float q22 = photoViewer.q2(false);
            photoViewer.e6 = q22;
            photoViewer.a6 = q22;
            photoViewer.v3(q22);
            photoViewer.c6 = 0.0f;
            photoViewer.d6 = 0.0f;
        }
        photoViewer.o6 = -1;
        photoViewer.e0.invalidate();
        gv0 gv0Var = photoViewer.i7;
        if (gv0Var != null) {
            PhotoViewer photoViewer2 = gv0Var.d;
            photoViewer2.d = gv0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.g0.setFocusable(false);
            photoViewer2.e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.e0.setAlpha(1.0f);
            ArrayList arrayList = gv0Var.b;
            int i12 = gv0Var.a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i12, gv0Var.c.E((MessageObject) arrayList.get(i12), null, gv0Var.a, true, false));
            photoViewer.i7 = null;
            lu0 lu0Var = new lu0();
            lu0Var.c = false;
            photoViewer.j3(false, false, lu0Var);
            photoViewer.j3(true, true, lu0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        t5 t5Var = photoViewer.P0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var, (Property<t5, Float>) property, 0.0f));
        t5 t5Var2 = photoViewer.P0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(t5Var2, (Property<t5, Float>) property2, 1.0f));
        qg.n2 n2Var = photoViewer.p5;
        if (n2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n2Var, (Property<qg.n2, Float>) property2, 1.0f));
        }
        ai.n4 n4Var = photoViewer.s5;
        if (n4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(n4Var, (Property<ai.n4, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, (Property<ii.y1, Float>) property, 0.0f));
        if (photoViewer.c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, (Property<org.telegram.ui.Components.x7, Float>) property, 0.0f));
        }
        if (photoViewer.i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, (Property<ru0, Float>) property, 0.0f));
        }
        int i13 = photoViewer.c2;
        if (i13 == 0 || i13 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i13 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.cf0, Float>) property2, 1.0f));
        }
        if (photoViewer.e1.getTag() != null) {
            photoViewer.e1.setVisibility(photoViewer.d2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.e1, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            photoViewer.f1.setVisibility((!photoViewer.d2 && photoViewer.J4 && ((bv0Var = photoViewer.d) == null || bv0Var.N())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, (Property<org.telegram.ui.Components.m90, Float>) property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            photoViewer.g1.setVisibility(photoViewer.d2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, (Property<zs0, Float>) property2, 1.0f));
        }
        View view = photoViewer.j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new ut0(this, i11));
        animatorSet.start();
    }
}
