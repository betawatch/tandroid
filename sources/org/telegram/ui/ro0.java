package org.telegram.ui;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ro0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ro0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10;
        org.telegram.ui.Components.u61 u61Var;
        int i11;
        Bitmap bitmap;
        Bitmap bitmap2;
        ag.v vVar;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.oj b10;
        es0 es0Var;
        int i12 = 2;
        char c10 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.n0();
                photoViewer.h3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                if (!photoViewer2.I1.a()) {
                    photoViewer2.h3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.D;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.v2);
                        alertDialog$Builder.a.T = org.telegram.messenger.cd.L0(2131751406, "DiscardChanges");
                        alertDialog$Builder.a.R = org.telegram.messenger.cd.L0(R.string.AppName, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, "OK"), new yo0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, "Cancel"), null);
                        photoViewer2.V2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.Y7 = photoViewer3.a8;
                photoViewer3.S0();
                photoViewer3.b3(false);
                photoViewer3.s2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Object obj = photoViewer4.g7.get(photoViewer4.P4);
                if (obj instanceof org.telegram.messenger.ze) {
                    ((org.telegram.messenger.ze) obj).s = photoViewer4.p1();
                }
                photoViewer4.b3(false);
                photoViewer4.s2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer5.z2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.v5.m(false, true);
                photoViewer6.w5.m(false, true);
                photoViewer6.h3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.v5.m(false, true);
                photoViewer7.w5.m(false, true);
                photoViewer7.n0();
                photoViewer7.h3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer8.h3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer9.G0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                if (!photoViewer10.q5.b.Q && (i10 = photoViewer10.P4) >= 0 && i10 < photoViewer10.g7.size() && (photoViewer10.g7.get(photoViewer10.P4) instanceof org.telegram.messenger.ef)) {
                    org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) photoViewer10.g7.get(photoViewer10.P4);
                    long time = photoViewer10.q5.getTime();
                    String A1 = PhotoViewer.A1();
                    photoViewer10.q5.b.setLoading(true);
                    Utilities.e.c(new ag.a3(photoViewer10, A1, efVar, time, 11));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                if (!photoViewer11.K1()) {
                    photoViewer11.r = !photoViewer11.r;
                    ArrayList arrayList = photoViewer11.h1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            ((vh.p2) obj2).e(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final vh.p2 p2Var = new vh.p2(photoViewer11.D, 3);
                        p2Var.p(true);
                        p2Var.s(org.telegram.messenger.cd.L0(2131751210, null));
                        p2Var.h = vh.p2.a(p2Var.getText(), p2Var.getTextPaint());
                        p2Var.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
                        p2Var.l(0.0f, 22.0f);
                        p2Var.l0 = new Runnable() { // from class: org.telegram.ui.vo0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.h1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(p2Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.h1;
                                        vh.p2 p2Var2 = p2Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(p2Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.i1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(p2Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.h1 == null) {
                            photoViewer11.h1 = new ArrayList();
                        }
                        photoViewer11.e0.addView(p2Var, w7.b6.e(-1, org.telegram.messenger.zs.e3, 83));
                        photoViewer11.h1.add(p2Var);
                        p2Var.u();
                    }
                    photoViewer11.A3();
                    photoViewer11.E3();
                    if (photoViewer11.r) {
                        CheckBox checkBox = photoViewer11.N0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer11.g7.get(photoViewer11.P4);
                    if (obj3 instanceof org.telegram.messenger.ze) {
                        ((org.telegram.messenger.ze) obj3).s = photoViewer11.p1();
                        break;
                    }
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                boolean T1 = photoViewer12.T1();
                boolean z10 = !T1;
                int i15 = photoViewer12.P4;
                if (i15 >= 0 && i15 < photoViewer12.g7.size()) {
                    Object obj4 = photoViewer12.g7.get(photoViewer12.P4);
                    if (obj4 instanceof org.telegram.messenger.ef) {
                        ((org.telegram.messenger.ef) obj4).O = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = org.telegram.messenger.w0.b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.tz.i1 = T1;
                        edit.putBoolean("photoLiveDefault", T1).apply();
                        es0 es0Var2 = photoViewer12.d;
                        if (es0Var2 != null) {
                            es0Var2.m();
                        }
                    }
                }
                photoViewer12.f1.a(!photoViewer12.T1(), true);
                photoViewer12.S7.animate().alpha(photoViewer12.T1() ? 0.45f : 1.0f).start();
                if (photoViewer12.T1() && (u61Var = photoViewer12.F2) != null) {
                    u61Var.g0();
                }
                photoViewer12.e0.invalidate();
                if (photoViewer12.h1 == null) {
                    photoViewer12.h1 = new ArrayList();
                }
                if (photoViewer12.i1 == null) {
                    photoViewer12.i1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.h1;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    ((vh.p2) obj5).e(true);
                }
                final vh.p2 p2Var2 = new vh.p2(photoViewer12.D, 3);
                p2Var2.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(photoViewer12.T1() ? 2131748846 : 2131748845, null)));
                p2Var2.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f));
                p2Var2.l(0.0f, 28.0f);
                final char c11 = c10 == true ? 1 : 0;
                p2Var2.l0 = new Runnable() { // from class: org.telegram.ui.vo0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c11) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.h1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(p2Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.h1;
                                vh.p2 p2Var22 = p2Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(p2Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.i1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(p2Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.e0.addView(p2Var2, w7.b6.e(-1, org.telegram.messenger.zs.e3, 83));
                photoViewer12.h1.add(p2Var2);
                photoViewer12.i1.add(p2Var2);
                p2Var2.u();
                break;
            case 12:
                PhotoViewer photoViewer13 = this.b;
                if (photoViewer13.d != null && !photoViewer13.K1()) {
                    photoViewer13.d.n();
                    photoViewer13.H0(true, false);
                    break;
                }
                break;
            case 13:
                PhotoViewer photoViewer14 = this.b;
                if (photoViewer14.d != null && !photoViewer14.K1()) {
                    photoViewer14.d.n();
                    photoViewer14.H0(true, false);
                    break;
                }
                break;
            case 14:
                PhotoViewer photoViewer15 = this.b;
                ArrayList arrayList3 = photoViewer15.g7;
                if (!photoViewer15.v7) {
                    sr0 sr0Var = photoViewer15.t5;
                    if (!sr0Var.Q && sr0Var.m0 != 1 && (i11 = photoViewer15.P4) >= 0 && i11 < arrayList3.size() && !photoViewer15.p5.V) {
                        org.telegram.messenger.ze zeVar = (org.telegram.messenger.ze) arrayList3.get(photoViewer15.P4);
                        boolean isEmpty = TextUtils.isEmpty(zeVar.i);
                        boolean z11 = !isEmpty;
                        sr0 sr0Var2 = photoViewer15.t5;
                        int i17 = sr0Var2.m0;
                        if (i17 != 0) {
                            if (i17 != 2) {
                                photoViewer15.p5.l();
                                photoViewer15.p5.getThanosEffect();
                                jg.v2 v2Var = photoViewer15.p5;
                                v2Var.L = false;
                                v2Var.E = null;
                                ImageReceiver imageReceiver = photoViewer15.C4;
                                if (isEmpty || (bitmap = v2Var.K) == null) {
                                    bitmap = v2Var.I;
                                }
                                imageReceiver.v0(bitmap);
                                photoViewer15.t5.setCutOutState(true);
                                photoViewer15.a3(false, true);
                                photoViewer15.n0();
                                break;
                            } else {
                                sr0Var2.setCutOutState(true);
                                photoViewer15.a3(false, true);
                                photoViewer15.p5.f();
                                photoViewer15.e0.invalidate();
                                break;
                            }
                        } else {
                            sr0Var2.setCancelState(true);
                            jg.v2 v2Var2 = photoViewer15.p5;
                            org.telegram.ui.Components.ll llVar = new org.telegram.ui.Components.ll(photoViewer15, z11, zeVar, i12);
                            v2Var2.getClass();
                            v2Var2.setOnClickListener(new ag.t0(6, v2Var2, llVar));
                            TextView textView = v2Var2.M;
                            textView.setText(org.telegram.messenger.cd.L0(2131745692, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                            ValueAnimator valueAnimator = v2Var2.N;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            v2Var2.Q = v2Var2.R;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            v2Var2.N = ofFloat;
                            ofFloat.addUpdateListener(new bg.k(v2Var2, 7));
                            v2Var2.N.setRepeatCount(-1);
                            v2Var2.N.setRepeatMode(1);
                            v2Var2.N.setDuration(2400L);
                            v2Var2.N.setInterpolator(new LinearInterpolator());
                            v2Var2.N.start();
                            photoViewer15.e0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.v5.m(true, true);
                photoViewer16.w5.m(false, true);
                jg.v2 v2Var3 = photoViewer16.p5;
                if (v2Var3 != null) {
                    v2Var3.setOutlineVisible(false);
                }
                photoViewer16.M1 = true;
                dr0 dr0Var = photoViewer16.N1;
                if (dr0Var != null) {
                    dr0Var.setEraser(true);
                }
                photoViewer16.h3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.v5.m(false, true);
                photoViewer17.w5.m(true, true);
                jg.v2 v2Var4 = photoViewer17.p5;
                if (v2Var4 != null) {
                    v2Var4.setOutlineVisible(false);
                }
                photoViewer17.M1 = false;
                dr0 dr0Var2 = photoViewer17.N1;
                if (dr0Var2 != null) {
                    dr0Var2.setEraser(false);
                }
                photoViewer17.h3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                dr0 dr0Var3 = photoViewer18.N1;
                if (dr0Var3 != null) {
                    ig.t1 t1Var = dr0Var3.b;
                    if (t1Var.a()) {
                        t1Var.c();
                        break;
                    }
                }
                photoViewer18.h3(0);
                photoViewer18.p5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.ze) photoViewer18.g7.get(photoViewer18.P4)).i);
                jg.v2 v2Var5 = photoViewer18.p5;
                if (v2Var5 != null && !v2Var5.G) {
                    v2Var5.L = false;
                    v2Var5.E = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.C4;
                if (isEmpty2 || (bitmap2 = v2Var5.K) == null) {
                    bitmap2 = v2Var5.I;
                }
                imageReceiver2.v0(bitmap2);
                jg.v2 v2Var6 = photoViewer18.p5;
                if (v2Var6 == null || !v2Var6.G) {
                    photoViewer18.t5.setCutOutState(true);
                }
                photoViewer18.d3(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.p5 != null) {
                    photoViewer19.y5.m(!r2.s0, true);
                    photoViewer19.p5.setOutlineVisible((!photoViewer19.y5.s0 || photoViewer19.v5.s0 || photoViewer19.w5.s0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                un unVar = photoViewer20.l4;
                if (unVar != null && (jjVar = unVar.F5) != null && jjVar.p5() && !org.telegram.messenger.w3.z(photoViewer20.T, 24, org.telegram.messenger.jj.B0(photoViewer20.l4.F5.k))) {
                    if (photoViewer20.m4 == null || (b10 = photoViewer20.l4.w5) == null) {
                        b10 = org.telegram.messenger.oj.b(photoViewer20.l4.F5.k.suggested_post);
                    }
                    if (!rh.e6.T(photoViewer20.T, b10.a)) {
                        un unVar2 = photoViewer20.l4;
                        if (unVar2 != null) {
                            unVar2.mc(b10);
                            break;
                        }
                    }
                }
                if (!photoViewer20.U1.o()) {
                    un unVar3 = photoViewer20.l4;
                    if (unVar3 == null || !unVar3.c() || ((vVar = photoViewer20.l4.X1) != null && vVar.B3 != null)) {
                        photoViewer20.z2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.c3();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.f6 f6Var = photoViewer20.U1.w;
                    float f7 = -photoViewer20.W1;
                    photoViewer20.W1 = f7;
                    org.telegram.messenger.i0.F3(f7, f6Var, null);
                    org.telegram.messenger.t2.D.a();
                    if (!org.telegram.messenger.vp.r1(photoViewer20.T).A3() && org.telegram.messenger.vp.r1(photoViewer20.T).V4 > photoViewer20.U1.getCodePointCount()) {
                        photoViewer20.W2(photoViewer20.e0);
                        break;
                    }
                }
                break;
            case 20:
                this.b.a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.D != null && (es0Var = photoViewer21.d) != null) {
                    es0Var.W();
                    photoViewer21.H0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer22.u0();
                if (!photoViewer22.K1()) {
                    if (photoViewer22.r1) {
                        if (photoViewer22.k8) {
                            TextureView textureView = photoViewer22.B2;
                            if (textureView instanceof org.telegram.ui.Components.k61) {
                                org.telegram.ui.Components.k61 k61Var = (org.telegram.ui.Components.k61) textureView;
                                if (k61Var.getVideoWidth() <= 0 || k61Var.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer22.h3(1);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer23 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer23.P0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer24.O0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer25.u0();
                if (!photoViewer25.K1()) {
                    if (photoViewer25.r1) {
                        if (photoViewer25.k8) {
                            TextureView textureView2 = photoViewer25.B2;
                            if (textureView2 instanceof org.telegram.ui.Components.k61) {
                                org.telegram.ui.Components.k61 k61Var2 = (org.telegram.ui.Components.k61) textureView2;
                                if (k61Var2.getVideoWidth() <= 0 || k61Var2.getVideoHeight() <= 0) {
                                }
                            }
                        }
                    }
                    photoViewer25.h3(3);
                    break;
                }
                break;
            case 26:
                PhotoViewer photoViewer26 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.u0();
                    if (!photoViewer26.K1()) {
                        if (photoViewer26.r1) {
                            if (photoViewer26.k8) {
                                TextureView textureView3 = photoViewer26.B2;
                                if (textureView3 instanceof org.telegram.ui.Components.k61) {
                                    org.telegram.ui.Components.k61 k61Var3 = (org.telegram.ui.Components.k61) textureView3;
                                    if (k61Var3.getVideoWidth() <= 0 || k61Var3.getVideoHeight() <= 0) {
                                    }
                                }
                            }
                        }
                        photoViewer26.h3(2);
                        break;
                    }
                }
                break;
            case 27:
                PhotoViewer photoViewer27 = this.b;
                if (photoViewer27.p6 == null) {
                    qo0 qo0Var = new qo0(photoViewer27, 29);
                    if (!photoViewer27.J2) {
                        float stateOrientation = photoViewer27.R2 - photoViewer27.C1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.P0(stateOrientation, photoViewer27.C1.b.getStateMirror(), qo0Var);
                        break;
                    } else {
                        qo0Var.run();
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.u4 == 1) {
                    eg.q qVar = photoViewer28.C1.b;
                    eg.c cVar = qVar.G;
                    if (cVar.a.isInProgress() || cVar.h || qVar.a.e0) {
                    }
                }
                photoViewer28.n0();
                photoViewer28.h3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                float f10 = -photoViewer29.C1.b.getStateOrientation();
                if (Math.abs(f10) > 180.0f) {
                    f10 = f10 < 0.0f ? f10 + 360.0f : -(360.0f - f10);
                }
                photoViewer29.P0(f10, photoViewer29.C1.b.getStateMirror(), new qo0(photoViewer29, 8));
                break;
        }
    }
}
