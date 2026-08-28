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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class ss0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public ss0(PhotoViewer photoViewer, int i9) {
        this.b = photoViewer;
        this.a = i9;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        zt0 zt0Var;
        PhotoViewer photoViewer = this.b;
        int i9 = photoViewer.q4;
        if (i9 == 1) {
            photoViewer.y1.a();
            tf.n nVar = photoViewer.y1.b;
            nVar.d = null;
            nVar.F = false;
            photoViewer.Q0.setVisibility(8);
            photoViewer.y1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.y1.b.a;
            cropAreaView.j0 = 0.0f;
            cropAreaView.k0 = 1.0f;
            cropAreaView.l0 = 0.0f;
            cropAreaView.m0 = 0.0f;
            cropAreaView.invalidate();
        } else if (i9 == 2) {
            try {
                photoViewer.a0.removeView(photoViewer.E1);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.E1 = null;
        } else if (i9 == 3) {
            photoViewer.H1.n0(false);
            try {
                photoViewer.a0.removeView(photoViewer.H1.getView());
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            photoViewer.H1 = null;
        } else if (i9 == 4) {
            photoViewer.K1 = true;
            photoViewer.a0.invalidate();
            photoViewer.a0.post(new cf0(29, this, photoViewer.J1));
            photoViewer.J1 = null;
            photoViewer.r5.m(false, true);
            photoViewer.s5.m(false, true);
        } else if (i9 == 5) {
            photoViewer.m5.setVisibility(8);
            org.telegram.ui.Components.re0 re0Var = photoViewer.m5;
            re0Var.d = null;
            re0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.l6 = null;
        int i10 = photoViewer.q4;
        photoViewer.q4 = this.a;
        photoViewer.f1().H.b(photoViewer.q4 != 0);
        kh.b4 b4Var = photoViewer.G1;
        if (b4Var != null) {
            b4Var.b(photoViewer.q4 != 3);
        }
        if (photoViewer.q4 != 3) {
            photoViewer.V5 = 0.0f;
        }
        if (photoViewer.Y1 == 1) {
            photoViewer.y1.setVisibility(0);
        }
        if (photoViewer.Y1 == 11 && (i10 == 3 || i10 == 2 || i10 == 1 || i10 == 4)) {
            photoViewer.Y5 = photoViewer.d6;
            photoViewer.Z5 = photoViewer.e6;
            photoViewer.a6 = photoViewer.f6;
            photoViewer.b6 = photoViewer.g6;
        } else {
            float r22 = photoViewer.r2(false);
            photoViewer.a6 = r22;
            photoViewer.W5 = r22;
            photoViewer.w3(r22);
            photoViewer.Y5 = 0.0f;
            photoViewer.Z5 = 0.0f;
        }
        photoViewer.k6 = -1;
        photoViewer.a0.invalidate();
        eu0 eu0Var = photoViewer.e7;
        if (eu0Var != null) {
            PhotoViewer photoViewer2 = eu0Var.d;
            photoViewer2.d = eu0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.Z;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.c0.setFocusable(false);
            photoViewer2.a0.setFocusable(false);
            photoViewer2.H0.setAlpha(255);
            photoViewer2.a0.setAlpha(1.0f);
            ArrayList arrayList = eu0Var.b;
            int i11 = eu0Var.a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i11, eu0Var.c.E((MessageObject) arrayList.get(i11), null, eu0Var.a, true, false));
            photoViewer.e7 = null;
            jt0 jt0Var = new jt0();
            jt0Var.c = false;
            photoViewer.k3(false, false, jt0Var);
            photoViewer.k3(true, true, jt0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bh.g gVar = photoViewer.L0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(gVar, (Property<bh.g, Float>) property, 0.0f));
        bh.g gVar2 = photoViewer.L0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(gVar2, (Property<bh.g, Float>) property2, 1.0f));
        yf.m2 m2Var = photoViewer.l5;
        if (m2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(m2Var, (Property<yf.m2, Float>) property2, 1.0f));
        }
        ih.b3 b3Var = photoViewer.o5;
        if (b3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(b3Var, (Property<ih.b3, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<org.telegram.ui.Components.wo0, Float>) property, 0.0f));
        if (photoViewer.Y1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.B, (Property<org.telegram.ui.Components.r7, Float>) property, 0.0f));
        }
        if (photoViewer.e2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.M1, (Property<pt0, Float>) property, 0.0f));
        }
        int i12 = photoViewer.Y1;
        if (i12 == 0 || i12 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.J0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i12 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.y1, (Property<org.telegram.ui.Components.be0, Float>) property2, 1.0f));
        }
        if (photoViewer.a1.getTag() != null) {
            photoViewer.a1.setVisibility(photoViewer.Z1 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.a1, (Property<org.telegram.ui.ActionBar.l0, Float>) property2, 1.0f));
        }
        if (photoViewer.b1.getTag() != null) {
            photoViewer.b1.setVisibility((!photoViewer.Z1 && photoViewer.F4 && ((zt0Var = photoViewer.d) == null || zt0Var.N())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.b1, (Property<org.telegram.ui.Components.n80, Float>) property2, 1.0f));
        }
        if (photoViewer.c1.getTag() != null) {
            photoViewer.c1.setVisibility(photoViewer.Z1 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.c1, (Property<wr0, Float>) property2, 1.0f));
        }
        View view = photoViewer.f0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new rs0(this, i10));
        animatorSet.start();
    }
}
