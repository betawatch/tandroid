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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class ut0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public ut0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        av0 av0Var;
        PhotoViewer photoViewer = this.b;
        int i10 = photoViewer.u4;
        if (i10 == 1) {
            photoViewer.C1.a();
            mg.q qVar = photoViewer.C1.b;
            qVar.d = null;
            qVar.J = false;
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            photoViewer.I1 = null;
        } else if (i10 == 3) {
            photoViewer.L1.n0(false);
            try {
                photoViewer.e0.removeView(photoViewer.L1.getView());
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.L1 = null;
        } else if (i10 == 4) {
            photoViewer.O1 = true;
            photoViewer.e0.invalidate();
            photoViewer.e0.post(new ej0(23, this, photoViewer.N1));
            photoViewer.N1 = null;
            photoViewer.v5.m(false, true);
            photoViewer.w5.m(false, true);
        } else if (i10 == 5) {
            photoViewer.q5.setVisibility(8);
            org.telegram.ui.Components.kf0 kf0Var = photoViewer.q5;
            kf0Var.d = null;
            kf0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.p6 = null;
        int i11 = photoViewer.u4;
        photoViewer.u4 = this.a;
        photoViewer.f1().L.b(photoViewer.u4 != 0);
        di.j4 j4Var = photoViewer.K1;
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
            float r22 = photoViewer.r2(false);
            photoViewer.e6 = r22;
            photoViewer.a6 = r22;
            photoViewer.w3(r22);
            photoViewer.c6 = 0.0f;
            photoViewer.d6 = 0.0f;
        }
        photoViewer.o6 = -1;
        photoViewer.e0.invalidate();
        fv0 fv0Var = photoViewer.i7;
        if (fv0Var != null) {
            PhotoViewer photoViewer2 = fv0Var.d;
            photoViewer2.d = fv0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.d0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.g0.setFocusable(false);
            photoViewer2.e0.setFocusable(false);
            photoViewer2.L0.setAlpha(255);
            photoViewer2.e0.setAlpha(1.0f);
            ArrayList arrayList = fv0Var.b;
            int i12 = fv0Var.a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i12, fv0Var.c.E((MessageObject) arrayList.get(i12), null, fv0Var.a, true, false));
            photoViewer.i7 = null;
            ku0 ku0Var = new ku0();
            ku0Var.c = false;
            photoViewer.k3(false, false, ku0Var);
            photoViewer.k3(true, true, ku0Var);
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
        rg.o2 o2Var = photoViewer.p5;
        if (o2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(o2Var, (Property<rg.o2, Float>) property2, 1.0f));
        }
        bi.a4 a4Var = photoViewer.s5;
        if (a4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(a4Var, (Property<bi.a4, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.S0, (Property<ji.x1, Float>) property, 0.0f));
        if (photoViewer.c2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.F, (Property<org.telegram.ui.Components.z7, Float>) property, 0.0f));
        }
        if (photoViewer.i2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.Q1, (Property<qu0, Float>) property, 0.0f));
        }
        int i13 = photoViewer.c2;
        if (i13 == 0 || i13 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.N0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i13 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.C1, (Property<org.telegram.ui.Components.ue0, Float>) property2, 1.0f));
        }
        if (photoViewer.e1.getTag() != null) {
            photoViewer.e1.setVisibility(photoViewer.d2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.e1, (Property<org.telegram.ui.ActionBar.k0, Float>) property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            photoViewer.f1.setVisibility((!photoViewer.d2 && photoViewer.J4 && ((av0Var = photoViewer.d) == null || av0Var.N())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, (Property<org.telegram.ui.Components.f90, Float>) property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            photoViewer.g1.setVisibility(photoViewer.d2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, (Property<ys0, Float>) property2, 1.0f));
        }
        View view = photoViewer.j0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.j0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new tt0(this, i11));
        animatorSet.start();
    }
}
