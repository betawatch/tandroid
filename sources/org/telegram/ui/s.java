package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.view.WindowManager;
import java.util.ArrayList;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.Crop.CropAreaView;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class s extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    /* JADX WARN: Multi-variable type inference failed */
    public s(PhotoViewer photoViewer, int i) {
        this.b = photoViewer;
        this.a = i;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ed8 ed8Var;
        PhotoViewer photoViewer = this.b;
        byte b = photoViewer.t4;
        if (b == 1) {
            photoViewer.D1.a();
            b43 b43Var = photoViewer.D1.b;
            b43Var.d = null;
            b43Var.K = false;
            photoViewer.V0.setVisibility(8);
            photoViewer.D1.setVisibility(8);
            CropAreaView cropAreaView = photoViewer.D1.b.a;
            cropAreaView.o0 = 0.0f;
            cropAreaView.p0 = 1.0f;
            cropAreaView.q0 = 0.0f;
            cropAreaView.r0 = 0.0f;
            cropAreaView.invalidate();
        } else if (b == 2) {
            try {
                photoViewer.f0.removeView(photoViewer.J1);
            } catch (Exception e) {
                cc4.g(e, true);
            }
            photoViewer.J1 = null;
        } else if (b == 3) {
            photoViewer.M1.o0(false);
            try {
                photoViewer.f0.removeView(photoViewer.M1.getView());
            } catch (Exception e2) {
                cc4.g(e2, true);
            }
            photoViewer.M1 = null;
        } else if (b == 4) {
            photoViewer.P1 = true;
            photoViewer.f0.invalidate();
            photoViewer.f0.post(new h68(this, photoViewer.O1, (byte) 9));
            photoViewer.O1 = null;
            photoViewer.u5.m(false, true);
            photoViewer.v5.m(false, true);
        } else if (b == 5) {
            photoViewer.p5.setVisibility(8);
            ld8 ld8Var = photoViewer.p5;
            ld8Var.d = null;
            ld8Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.o6 = null;
        byte b2 = photoViewer.t4;
        photoViewer.t4 = this.a;
        photoViewer.c0().M.b(photoViewer.t4 != 0);
        rx5 rx5Var = photoViewer.L1;
        if (rx5Var != null) {
            rx5Var.b(photoViewer.t4 != 3);
        }
        if (photoViewer.t4 != 3) {
            photoViewer.Y5 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (b2 == 3 || b2 == 2 || b2 == 1 || b2 == 4)) {
            photoViewer.b6 = photoViewer.g6;
            photoViewer.c6 = photoViewer.h6;
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
        } else {
            float z1 = photoViewer.z1(false);
            photoViewer.d6 = z1;
            photoViewer.Z5 = z1;
            photoViewer.I2(z1);
            photoViewer.b6 = 0.0f;
            photoViewer.c6 = 0.0f;
        }
        photoViewer.n6 = -1;
        photoViewer.f0.invalidate();
        a0 a0Var = photoViewer.h7;
        if (a0Var != null) {
            PhotoViewer photoViewer2 = a0Var.d;
            photoViewer2.d = a0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = jn7.u4;
            photoViewer2.h0.setFocusable(false);
            photoViewer2.f0.setFocusable(false);
            photoViewer2.M0.setAlpha(jn7.d4);
            photoViewer2.f0.setAlpha(1.0f);
            PhotoViewer photoViewer3 = a0Var.d;
            ArrayList arrayList = a0Var.b;
            int i = a0Var.a;
            photoViewer3.d1(null, null, null, null, arrayList, null, null, i, a0Var.c.M((r47) arrayList.get(i), null, a0Var.a, true, false));
            photoViewer.h7 = null;
            rc8 rc8Var = new rc8();
            rc8Var.c = false;
            photoViewer.u2(false, false, rc8Var);
            photoViewer.u2(true, true, rc8Var);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList2 = new ArrayList();
        jo0 jo0Var = photoViewer.Q0;
        Property property = View.TRANSLATION_Y;
        arrayList2.add(ObjectAnimator.ofFloat(jo0Var, (Property<jo0, Float>) property, 0.0f));
        jo0 jo0Var2 = photoViewer.Q0;
        Property property2 = View.ALPHA;
        arrayList2.add(ObjectAnimator.ofFloat(jo0Var2, (Property<jo0, Float>) property2, 1.0f));
        k3b k3bVar = photoViewer.o5;
        if (k3bVar != null) {
            arrayList2.add(ObjectAnimator.ofFloat(k3bVar, (Property<k3b, Float>) property2, 1.0f));
        }
        vl4 vl4Var = photoViewer.r5;
        if (vl4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(vl4Var, (Property<vl4, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, (Property<di3, Float>) property, 0.0f));
        if (photoViewer.d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, (Property<y10, Float>) property, 0.0f));
        }
        if (photoViewer.j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, (Property<wc8, Float>) property, 0.0f));
        }
        int i2 = photoViewer.d2;
        if (i2 == 0 || i2 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i2 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<k88, Float>) property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            photoViewer.f1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, (Property<d7, Float>) property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            photoViewer.g1.setVisibility((!photoViewer.e2 && photoViewer.I4 && ((ed8Var = photoViewer.d) == null || ed8Var.O())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, (Property<s96, Float>) property2, 1.0f));
        }
        if (photoViewer.h1.getTag() != null) {
            photoViewer.h1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.h1, (Property<nb8, Float>) property2, 1.0f));
        }
        View view = photoViewer.k0;
        if (view != null) {
            view.setVisibility(0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.k0, (Property<View, Float>) property2, 1.0f));
        }
        animatorSet.playTogether(arrayList2);
        animatorSet.setDuration(200L);
        animatorSet.addListener(new r(this, b2));
        animatorSet.start();
    }
}
