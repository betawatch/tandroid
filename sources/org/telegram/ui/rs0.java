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

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class rs0 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public rs0(PhotoViewer photoViewer, int i10) {
        this.b = photoViewer;
        this.a = i10;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        xt0 xt0Var;
        PhotoViewer photoViewer = this.b;
        int i10 = photoViewer.q4;
        if (i10 == 1) {
            photoViewer.y1.a();
            wf.n nVar = photoViewer.y1.b;
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
        } else if (i10 == 2) {
            try {
                photoViewer.a0.removeView(photoViewer.E1);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            photoViewer.E1 = null;
        } else if (i10 == 3) {
            photoViewer.H1.n0(false);
            try {
                photoViewer.a0.removeView(photoViewer.H1.getView());
            } catch (Exception e11) {
                FileLog.e(e11);
            }
            photoViewer.H1 = null;
        } else if (i10 == 4) {
            photoViewer.K1 = true;
            photoViewer.a0.invalidate();
            photoViewer.a0.post(new lf0(26, this, photoViewer.J1));
            photoViewer.J1 = null;
            photoViewer.r5.m(false, true);
            photoViewer.s5.m(false, true);
        } else if (i10 == 5) {
            photoViewer.m5.setVisibility(8);
            org.telegram.ui.Components.ff0 ff0Var = photoViewer.m5;
            ff0Var.d = null;
            ff0Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.l6 = null;
        int i11 = photoViewer.q4;
        photoViewer.q4 = this.a;
        photoViewer.f1().H.b(photoViewer.q4 != 0);
        nh.w3 w3Var = photoViewer.G1;
        if (w3Var != null) {
            w3Var.b(photoViewer.q4 != 3);
        }
        if (photoViewer.q4 != 3) {
            photoViewer.V5 = 0.0f;
        }
        if (photoViewer.Y1 == 1) {
            photoViewer.y1.setVisibility(0);
        }
        if (photoViewer.Y1 == 11 && (i11 == 3 || i11 == 2 || i11 == 1 || i11 == 4)) {
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
        cu0 cu0Var = photoViewer.e7;
        if (cu0Var != null) {
            PhotoViewer photoViewer2 = cu0Var.d;
            photoViewer2.d = cu0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.Z;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = 272;
            photoViewer2.c0.setFocusable(false);
            photoViewer2.a0.setFocusable(false);
            photoViewer2.H0.setAlpha(255);
            photoViewer2.a0.setAlpha(1.0f);
            ArrayList arrayList = cu0Var.b;
            int i12 = cu0Var.a;
            photoViewer2.Y1(null, null, null, null, arrayList, null, null, i12, cu0Var.c.E((MessageObject) arrayList.get(i12), null, cu0Var.a, true, false));
            photoViewer.e7 = null;
            ht0 ht0Var = new ht0();
            ht0Var.c = false;
            photoViewer.k3(false, false, ht0Var);
            photoViewer.k3(true, true, ht0Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        bg.u1 u1Var = photoViewer.L0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(u1Var, (Property<bg.u1, Float>) property, 0.0f));
        bg.u1 u1Var2 = photoViewer.L0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(u1Var2, (Property<bg.u1, Float>) property2, 1.0f));
        bg.u3 u3Var = photoViewer.l5;
        if (u3Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(u3Var, (Property<bg.u3, Float>) property2, 1.0f));
        }
        lh.z2 z2Var = photoViewer.o5;
        if (z2Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(z2Var, (Property<lh.z2, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<org.telegram.ui.Components.hp0, Float>) property, 0.0f));
        if (photoViewer.Y1 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.B, (Property<cg.m1, Float>) property, 0.0f));
        }
        if (photoViewer.e2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.M1, (Property<nt0, Float>) property, 0.0f));
        }
        int i13 = photoViewer.Y1;
        if (i13 == 0 || i13 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.J0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.K0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i13 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.y1, (Property<org.telegram.ui.Components.pe0, Float>) property2, 1.0f));
        }
        if (photoViewer.a1.getTag() != null) {
            photoViewer.a1.setVisibility(photoViewer.Z1 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.a1, (Property<org.telegram.ui.ActionBar.m0, Float>) property2, 1.0f));
        }
        if (photoViewer.b1.getTag() != null) {
            photoViewer.b1.setVisibility((!photoViewer.Z1 && photoViewer.F4 && ((xt0Var = photoViewer.d) == null || xt0Var.N())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.b1, (Property<org.telegram.ui.Components.a90, Float>) property2, 1.0f));
        }
        if (photoViewer.c1.getTag() != null) {
            photoViewer.c1.setVisibility(photoViewer.Z1 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.c1, (Property<vr0, Float>) property2, 1.0f));
        }
        View view = photoViewer.f0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new qs0(this, i11));
        animatorSet.start();
    }
}
