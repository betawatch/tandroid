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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
        o98 o98Var;
        PhotoViewer photoViewer = this.b;
        byte b = photoViewer.u4;
        if (b == 1) {
            photoViewer.D1.a();
            j33 j33Var = photoViewer.D1.b;
            j33Var.d = null;
            j33Var.K = false;
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
                fa4.g(e, true);
            }
            photoViewer.J1 = null;
        } else if (b == 3) {
            photoViewer.M1.o0(false);
            try {
                photoViewer.f0.removeView(photoViewer.M1.getView());
            } catch (Exception e2) {
                fa4.g(e2, true);
            }
            photoViewer.M1 = null;
        } else if (b == 4) {
            photoViewer.P1 = true;
            photoViewer.f0.invalidate();
            photoViewer.f0.post(new h18(this, photoViewer.O1, (byte) 11));
            photoViewer.O1 = null;
            photoViewer.v5.m(false, true);
            photoViewer.w5.m(false, true);
        } else if (b == 5) {
            photoViewer.q5.setVisibility(8);
            v98 v98Var = photoViewer.q5;
            v98Var.d = null;
            v98Var.a.o(false, null, 0L, 0.0f);
        }
        photoViewer.p6 = null;
        byte b2 = photoViewer.u4;
        photoViewer.u4 = this.a;
        photoViewer.d0().M.b(photoViewer.u4 != 0);
        mv5 mv5Var = photoViewer.L1;
        if (mv5Var != null) {
            mv5Var.b(photoViewer.u4 != 3);
        }
        if (photoViewer.u4 != 3) {
            photoViewer.Z5 = 0.0f;
        }
        if (photoViewer.d2 == 1) {
            photoViewer.D1.setVisibility(0);
        }
        if (photoViewer.d2 == 11 && (b2 == 3 || b2 == 2 || b2 == 1 || b2 == 4)) {
            photoViewer.c6 = photoViewer.h6;
            photoViewer.d6 = photoViewer.i6;
            photoViewer.e6 = photoViewer.j6;
            photoViewer.f6 = photoViewer.k6;
        } else {
            float y1 = photoViewer.y1(false);
            photoViewer.e6 = y1;
            photoViewer.a6 = y1;
            photoViewer.H2(y1);
            photoViewer.c6 = 0.0f;
            photoViewer.d6 = 0.0f;
        }
        photoViewer.o6 = -1;
        photoViewer.f0.invalidate();
        a0 a0Var = photoViewer.i7;
        if (a0Var != null) {
            PhotoViewer photoViewer2 = a0Var.d;
            photoViewer2.d = a0Var.c;
            WindowManager.LayoutParams layoutParams = photoViewer2.e0;
            layoutParams.flags = -2147286784;
            layoutParams.softInputMode = kk7.u4;
            photoViewer2.h0.setFocusable(false);
            photoViewer2.f0.setFocusable(false);
            photoViewer2.M0.setAlpha(kk7.d4);
            photoViewer2.f0.setAlpha(1.0f);
            PhotoViewer photoViewer3 = a0Var.d;
            ArrayList arrayList = a0Var.b;
            int i = a0Var.a;
            photoViewer3.c1(null, null, null, null, arrayList, null, null, i, a0Var.c.M((k27) arrayList.get(i), null, a0Var.a, true, false));
            photoViewer.i7 = null;
            b98 b98Var = new b98();
            b98Var.c = false;
            photoViewer.t2(false, false, b98Var);
            photoViewer.t2(true, true, b98Var);
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
        mza mzaVar = photoViewer.p5;
        if (mzaVar != null) {
            arrayList2.add(ObjectAnimator.ofFloat(mzaVar, (Property<mza, Float>) property2, 1.0f));
        }
        rj4 rj4Var = photoViewer.s5;
        if (rj4Var != null) {
            arrayList2.add(ObjectAnimator.ofFloat(rj4Var, (Property<rj4, Float>) property2, 1.0f));
        }
        arrayList2.add(ObjectAnimator.ofFloat(photoViewer.T0, (Property<jh3, Float>) property, 0.0f));
        if (photoViewer.d2 != 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.G, (Property<x10, Float>) property, 0.0f));
        }
        if (photoViewer.j2) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.R1, (Property<g98, Float>) property, 0.0f));
        }
        int i2 = photoViewer.d2;
        if (i2 == 0 || i2 == 4) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.O0, (Property<CheckBox, Float>) property2, 1.0f));
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.P0, (Property<PhotoViewer.CounterView, Float>) property2, 1.0f));
        } else if (i2 == 1) {
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.D1, (Property<v48, Float>) property2, 1.0f));
        }
        if (photoViewer.f1.getTag() != null) {
            photoViewer.f1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.f1, (Property<c7, Float>) property2, 1.0f));
        }
        if (photoViewer.g1.getTag() != null) {
            photoViewer.g1.setVisibility((!photoViewer.e2 && photoViewer.J4 && ((o98Var = photoViewer.d) == null || o98Var.O())) ? 0 : 8);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.g1, (Property<o76, Float>) property2, 1.0f));
        }
        if (photoViewer.h1.getTag() != null) {
            photoViewer.h1.setVisibility(photoViewer.e2 ? 8 : 0);
            arrayList2.add(ObjectAnimator.ofFloat(photoViewer.h1, (Property<w78, Float>) property2, 1.0f));
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
