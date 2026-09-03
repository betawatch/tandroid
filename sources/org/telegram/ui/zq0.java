package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq0 implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ zq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        int i10;
        int i11 = 9;
        int i12 = 8;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                dg.n3 n3Var = (dg.n3) obj;
                Drawable[] drawableArr = PhotoViewer.Q8;
                try {
                    boolean isEmpty = TextUtils.isEmpty(((MediaController.MediaEditState) photoViewer.d7.get(photoViewer.M4)).filterPath);
                    dg.q3 q3Var = photoViewer.m5;
                    q3Var.I = true;
                    q3Var.B = n3Var;
                    Bitmap bitmap = photoViewer.z4.getBitmap();
                    photoViewer.z4.getOrientation();
                    dg.n3 n3Var2 = q3Var.B;
                    photoViewer.z4.setImageBitmap(n3Var2 == null ? q3Var.F : (isEmpty || bitmap == null) ? n3Var2.b() : q3Var.e(bitmap));
                    photoViewer.q5.setUndoCutState(true);
                    photoViewer.a3(true, true);
                    photoViewer.q5.post(new tq0(photoViewer, i11));
                    break;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                org.telegram.ui.Components.qc.F(this.b.b0, true).j();
                break;
            case 2:
                PhotoViewer photoViewer2 = this.b;
                photoViewer2.I1.e2 = photoViewer2.H1.c();
                photoViewer2.b0.invalidate();
                int max = Math.max(((Integer) obj).intValue(), photoViewer2.I1.g2);
                float dp = (!(photoViewer2.I1.P0 instanceof dg.b4) || max <= 0) ? 0.0f : ((AndroidUtilities.displaySize.y - max) - AndroidUtilities.dp(80.0f)) - photoViewer2.I1.getSelectedEntityBottom();
                ValueAnimator valueAnimator = photoViewer2.p7;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    photoViewer2.p7 = null;
                }
                if (photoViewer2.r4 != 3) {
                    dp = 0.0f;
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(photoViewer2.W5, dp);
                photoViewer2.p7 = ofFloat;
                ofFloat.addUpdateListener(new sq0(photoViewer2, i11));
                photoViewer2.p7.setDuration(320L);
                ValueAnimator valueAnimator2 = photoViewer2.p7;
                org.telegram.ui.Components.mr mrVar = org.telegram.ui.Components.mr.h;
                valueAnimator2.setInterpolator(mrVar);
                photoViewer2.p7.start();
                AnimatorSet animatorSet = photoViewer2.G1;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat2.addUpdateListener(new sq0(photoViewer2, i12));
                AnimatorSet animatorSet2 = new AnimatorSet();
                photoViewer2.G1 = animatorSet2;
                dg.t2 t2Var = photoViewer2.I1.i1;
                Property property = View.TRANSLATION_Y;
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(t2Var, (Property<dg.t2, Float>) property, (-max) / 2.5f);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(photoViewer2.I1.Z0, (Property<dg.a1, Float>) property, Math.min(0, AndroidUtilities.dp(40.0f) + r15));
                dg.k0 k0Var = photoViewer2.I1.c1;
                Property property2 = View.ALPHA;
                animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(k0Var, (Property<dg.k0, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.I1.x0, (Property<dg.b2, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ObjectAnimator.ofFloat(photoViewer2.I1.y0, (Property<dg.f2, Float>) property2, max > AndroidUtilities.dp(20.0f) ? 0.0f : 1.0f), ofFloat2);
                animatorSet2.setDuration(320L);
                animatorSet2.setInterpolator(mrVar);
                animatorSet2.start();
                mt0 mt0Var = photoViewer2.I1;
                dg.k2 k2Var = mt0Var.r1;
                if (k2Var != null) {
                    if (mt0Var.e2) {
                        k2Var.a(R.drawable.input_smile);
                    } else if (mt0Var.d2) {
                        k2Var.a(R.drawable.input_keyboard);
                    } else {
                        k2Var.a(R.drawable.msg_add);
                    }
                }
                AndroidUtilities.updateViewShow(mt0Var.v1, (mt0Var.e2 || mt0Var.d2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(mt0Var.t1, (mt0Var.e2 || mt0Var.d2) ? false : true, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(mt0Var.x1, mt0Var.e2 || mt0Var.d2, false, 1.0f, true, null);
                AndroidUtilities.updateViewShow(mt0Var.w1, mt0Var.e2 || mt0Var.d2, false, 1.0f, true, null);
                break;
            case 3:
                PhotoViewer photoViewer3 = this.b;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (!photoViewer3.n5.b.K && (i10 = photoViewer3.M4) >= 0 && i10 < photoViewer3.d7.size() && (photoViewer3.d7.get(photoViewer3.M4) instanceof MediaController.PhotoEntry)) {
                    org.telegram.ui.Components.pf0 pf0Var = photoViewer3.n5;
                    ph.d3 d3Var = pf0Var.h;
                    if (d3Var != null) {
                        d3Var.dismiss();
                        pf0Var.h = null;
                    }
                    photoViewer3.n5.b.setLoading(true);
                    Utilities.globalQueue.postRunnable(new c30(photoViewer3, photoEntry, (MediaController.PhotoEntry) photoViewer3.d7.get(photoViewer3.M4), PhotoViewer.y1(), 19));
                    break;
                }
                break;
            case 4:
                PhotoViewer photoViewer4 = this.b;
                Integer num = (Integer) obj;
                Object obj2 = photoViewer4.d7.get(photoViewer4.M4);
                if (obj2 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj2).ttl = num.intValue();
                } else if (obj2 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj2).ttl = num.intValue();
                }
                if (num.intValue() != 0 && !photoViewer4.d.x(photoViewer4.M4)) {
                    photoViewer4.M2();
                }
                photoViewer4.S1.setTimer(num.intValue());
                break;
            case 5:
                PhotoViewer photoViewer5 = this.b;
                Integer num2 = (Integer) obj;
                FrameLayout frameLayout = photoViewer5.N7;
                if (frameLayout != null && frameLayout.getVisibility() != 8) {
                    photoViewer5.N7.setTranslationY(photoViewer5.M0.getTranslationY() - (photoViewer5.R1.getAlpha() * kf.k0.c(46.0f, photoViewer5.R1.getEditTextHeight(), 0)));
                }
                photoViewer5.b1.setTranslationY(photoViewer5.R1.getAlpha() * (-kf.k0.c(46.0f, num2.intValue(), 0)));
                photoViewer5.c1.setTranslationY(photoViewer5.R1.getAlpha() * (-kf.k0.c(46.0f, num2.intValue(), 0)));
                photoViewer5.d1.setTranslationY(photoViewer5.R1.getAlpha() * (-kf.k0.c(46.0f, num2.intValue(), 0)));
                org.telegram.ui.Components.zh zhVar = photoViewer5.R1.J;
                if (zhVar != null) {
                    zhVar.setTranslationY((-num2.intValue()) - AndroidUtilities.dp(14.0f));
                    break;
                }
                break;
            case 6:
                PhotoViewer photoViewer6 = this.b;
                Integer num3 = (Integer) obj;
                Object obj3 = photoViewer6.d7.get(photoViewer6.M4);
                if (obj3 instanceof MediaController.PhotoEntry) {
                    ((MediaController.PhotoEntry) obj3).ttl = num3.intValue();
                } else if (obj3 instanceof MediaController.SearchImage) {
                    ((MediaController.SearchImage) obj3).ttl = num3.intValue();
                }
                if (num3.intValue() != 0 && !photoViewer6.d.x(photoViewer6.M4)) {
                    photoViewer6.M2();
                }
                photoViewer6.R1.setTimer(num3.intValue());
                break;
            case 7:
                Integer num4 = (Integer) obj;
                org.telegram.ui.Components.zh zhVar2 = this.b.S1.J;
                if (zhVar2 != null) {
                    zhVar2.setTranslationY(num4.intValue());
                    break;
                }
                break;
            case 8:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer7.B0(0, false);
                break;
            default:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer8.B0(0, false);
                break;
        }
    }
}
