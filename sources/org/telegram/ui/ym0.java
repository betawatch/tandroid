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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ym0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ ym0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i3;
        org.telegram.ui.Components.m51 m51Var;
        int i10;
        Bitmap bitmap;
        Bitmap bitmap2;
        ei.x2 x2Var;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.ej b10;
        kq0 kq0Var;
        int i11 = 29;
        int i12 = 3;
        char c2 = 1;
        final int i13 = 0;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.n0();
                photoViewer.h3(0);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                if (!photoViewer2.J1.a()) {
                    photoViewer2.h3(0);
                    break;
                } else {
                    Activity activity = photoViewer2.E;
                    if (activity != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, activity, photoViewer2.w2);
                        alertDialog$Builder.a.U = org.telegram.messenger.bd.M0(2131751406, "DiscardChanges");
                        alertDialog$Builder.a.S = org.telegram.messenger.bd.M0(R.string.AppName, "AppName");
                        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, "OK"), new gn0(photoViewer2));
                        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, "Cancel"), null);
                        photoViewer2.V2(alertDialog$Builder);
                        break;
                    }
                }
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                photoViewer3.Z7 = photoViewer3.b8;
                photoViewer3.S0();
                photoViewer3.b3(false);
                photoViewer3.s2(2);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Object obj = photoViewer4.h7.get(photoViewer4.Q4);
                if (obj instanceof org.telegram.messenger.se) {
                    ((org.telegram.messenger.se) obj).s = photoViewer4.p1();
                }
                photoViewer4.b3(false);
                photoViewer4.s2(2);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer5.z2(false, 0, 0, false, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                photoViewer6.w5.m(false, true);
                photoViewer6.x5.m(false, true);
                photoViewer6.h3(0);
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                photoViewer7.w5.m(false, true);
                photoViewer7.x5.m(false, true);
                photoViewer7.n0();
                photoViewer7.h3(0);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer8.h3(5);
                break;
            case 8:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.V8;
                photoViewer9.G0();
                break;
            case 9:
                PhotoViewer photoViewer10 = this.b;
                if (!photoViewer10.r5.b.R && (i3 = photoViewer10.Q4) >= 0 && i3 < photoViewer10.h7.size() && (photoViewer10.h7.get(photoViewer10.Q4) instanceof org.telegram.messenger.ye)) {
                    org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) photoViewer10.h7.get(photoViewer10.Q4);
                    long time = photoViewer10.r5.getTime();
                    String A1 = PhotoViewer.A1();
                    photoViewer10.r5.b.setLoading(true);
                    Utilities.e.c(new ci.l2(photoViewer10, A1, yeVar, time, 23));
                    break;
                }
                break;
            case 10:
                final PhotoViewer photoViewer11 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.V8;
                if (!photoViewer11.K1()) {
                    photoViewer11.r = !photoViewer11.r;
                    ArrayList arrayList = photoViewer11.i1;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj2 = arrayList.get(i14);
                            i14++;
                            ((gi.l3) obj2).f(true);
                        }
                    }
                    if (photoViewer11.r) {
                        final gi.l3 l3Var = new gi.l3(photoViewer11.E, 3);
                        l3Var.r(true);
                        l3Var.u(org.telegram.messenger.bd.M0(2131751210, null));
                        l3Var.h = gi.l3.a(l3Var.getText(), l3Var.getTextPaint());
                        l3Var.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        l3Var.o(0.0f, 22.0f);
                        l3Var.r0 = new Runnable() { // from class: org.telegram.ui.dn0
                            @Override // java.lang.Runnable
                            public final void run() {
                                switch (i13) {
                                    case 0:
                                        ArrayList arrayList2 = photoViewer11.i1;
                                        if (arrayList2 != null) {
                                            arrayList2.remove(l3Var);
                                            break;
                                        }
                                        break;
                                    default:
                                        PhotoViewer photoViewer12 = photoViewer11;
                                        ArrayList arrayList3 = photoViewer12.i1;
                                        gi.l3 l3Var2 = l3Var;
                                        if (arrayList3 != null) {
                                            arrayList3.remove(l3Var2);
                                        }
                                        ArrayList arrayList4 = photoViewer12.j1;
                                        if (arrayList4 != null) {
                                            arrayList4.remove(l3Var2);
                                            break;
                                        }
                                        break;
                                }
                            }
                        };
                        if (photoViewer11.i1 == null) {
                            photoViewer11.i1 = new ArrayList();
                        }
                        photoViewer11.f0.addView(l3Var, b8.mf.e(-1, org.telegram.messenger.hs.e3, 83));
                        photoViewer11.i1.add(l3Var);
                        l3Var.w();
                    }
                    photoViewer11.A3();
                    photoViewer11.E3();
                    if (photoViewer11.r) {
                        CheckBox checkBox = photoViewer11.O0;
                        if (!checkBox.y) {
                            checkBox.callOnClick();
                            break;
                        }
                    }
                    Object obj3 = photoViewer11.h7.get(photoViewer11.Q4);
                    if (obj3 instanceof org.telegram.messenger.se) {
                        ((org.telegram.messenger.se) obj3).s = photoViewer11.p1();
                        break;
                    }
                }
                break;
            case 11:
                final PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.V8;
                boolean T1 = photoViewer12.T1();
                boolean z10 = !T1;
                int i15 = photoViewer12.Q4;
                if (i15 >= 0 && i15 < photoViewer12.h7.size()) {
                    Object obj4 = photoViewer12.h7.get(photoViewer12.Q4);
                    if (obj4 instanceof org.telegram.messenger.ye) {
                        ((org.telegram.messenger.ye) obj4).O = Boolean.valueOf(z10);
                        SharedPreferences.Editor edit = org.telegram.messenger.t0.b.getSharedPreferences("mainconfig", 0).edit();
                        org.telegram.messenger.az.i1 = T1;
                        edit.putBoolean("photoLiveDefault", T1).apply();
                        kq0 kq0Var2 = photoViewer12.d;
                        if (kq0Var2 != null) {
                            kq0Var2.m();
                        }
                    }
                }
                photoViewer12.g1.a(!photoViewer12.T1(), true);
                photoViewer12.T7.animate().alpha(photoViewer12.T1() ? 0.45f : 1.0f).start();
                if (photoViewer12.T1() && (m51Var = photoViewer12.G2) != null) {
                    m51Var.g0();
                }
                photoViewer12.f0.invalidate();
                if (photoViewer12.i1 == null) {
                    photoViewer12.i1 = new ArrayList();
                }
                if (photoViewer12.j1 == null) {
                    photoViewer12.j1 = new ArrayList();
                }
                ArrayList arrayList2 = photoViewer12.i1;
                int size2 = arrayList2.size();
                int i16 = 0;
                while (i16 < size2) {
                    Object obj5 = arrayList2.get(i16);
                    i16++;
                    ((gi.l3) obj5).f(true);
                }
                final gi.l3 l3Var2 = new gi.l3(photoViewer12.E, 3);
                l3Var2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(photoViewer12.T1() ? 2131748844 : 2131748843, null)));
                l3Var2.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), org.telegram.messenger.g0.L(6.0f));
                l3Var2.o(0.0f, 28.0f);
                final char c10 = c2 == true ? 1 : 0;
                l3Var2.r0 = new Runnable() { // from class: org.telegram.ui.dn0
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (c10) {
                            case 0:
                                ArrayList arrayList22 = photoViewer12.i1;
                                if (arrayList22 != null) {
                                    arrayList22.remove(l3Var2);
                                    break;
                                }
                                break;
                            default:
                                PhotoViewer photoViewer122 = photoViewer12;
                                ArrayList arrayList3 = photoViewer122.i1;
                                gi.l3 l3Var22 = l3Var2;
                                if (arrayList3 != null) {
                                    arrayList3.remove(l3Var22);
                                }
                                ArrayList arrayList4 = photoViewer122.j1;
                                if (arrayList4 != null) {
                                    arrayList4.remove(l3Var22);
                                    break;
                                }
                                break;
                        }
                    }
                };
                photoViewer12.f0.addView(l3Var2, b8.mf.e(-1, org.telegram.messenger.hs.e3, 83));
                photoViewer12.i1.add(l3Var2);
                photoViewer12.j1.add(l3Var2);
                l3Var2.w();
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
                ArrayList arrayList3 = photoViewer15.h7;
                if (!photoViewer15.w7) {
                    yp0 yp0Var = photoViewer15.u5;
                    if (!yp0Var.R && yp0Var.n0 != 1 && (i10 = photoViewer15.Q4) >= 0 && i10 < arrayList3.size() && !photoViewer15.q5.W) {
                        org.telegram.messenger.se seVar = (org.telegram.messenger.se) arrayList3.get(photoViewer15.Q4);
                        boolean isEmpty = TextUtils.isEmpty(seVar.i);
                        boolean z11 = !isEmpty;
                        yp0 yp0Var2 = photoViewer15.u5;
                        int i17 = yp0Var2.n0;
                        if (i17 != 0) {
                            if (i17 != 2) {
                                photoViewer15.q5.l();
                                photoViewer15.q5.getThanosEffect();
                                ug.c2 c2Var = photoViewer15.q5;
                                c2Var.M = false;
                                c2Var.F = null;
                                ImageReceiver imageReceiver = photoViewer15.D4;
                                if (isEmpty || (bitmap = c2Var.L) == null) {
                                    bitmap = c2Var.J;
                                }
                                imageReceiver.v0(bitmap);
                                photoViewer15.u5.setCutOutState(true);
                                photoViewer15.a3(false, true);
                                photoViewer15.n0();
                                break;
                            } else {
                                yp0Var2.setCutOutState(true);
                                photoViewer15.a3(false, true);
                                photoViewer15.q5.f();
                                photoViewer15.f0.invalidate();
                                break;
                            }
                        } else {
                            yp0Var2.setCancelState(true);
                            ug.c2 c2Var2 = photoViewer15.q5;
                            gi.nb nbVar = new gi.nb(photoViewer15, z11, seVar, i12);
                            c2Var2.getClass();
                            c2Var2.setOnClickListener(new org.telegram.ui.web.d(3, c2Var2, nbVar));
                            TextView textView = c2Var2.N;
                            textView.setText(org.telegram.messenger.bd.M0(2131745685, null));
                            textView.animate().cancel();
                            textView.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(240L).setInterpolator(org.telegram.ui.Components.xq.h).start();
                            ValueAnimator valueAnimator = c2Var2.O;
                            if (valueAnimator != null) {
                                valueAnimator.cancel();
                            }
                            c2Var2.R = c2Var2.S;
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            c2Var2.O = ofFloat;
                            ofFloat.addUpdateListener(new gi.j3(c2Var2, 29));
                            c2Var2.O.setRepeatCount(-1);
                            c2Var2.O.setRepeatMode(1);
                            c2Var2.O.setDuration(2400L);
                            c2Var2.O.setInterpolator(new LinearInterpolator());
                            c2Var2.O.start();
                            photoViewer15.f0.invalidate();
                            break;
                        }
                    }
                }
                break;
            case 15:
                PhotoViewer photoViewer16 = this.b;
                photoViewer16.w5.m(true, true);
                photoViewer16.x5.m(false, true);
                ug.c2 c2Var3 = photoViewer16.q5;
                if (c2Var3 != null) {
                    c2Var3.setOutlineVisible(false);
                }
                photoViewer16.N1 = true;
                kp0 kp0Var = photoViewer16.O1;
                if (kp0Var != null) {
                    kp0Var.setEraser(true);
                }
                photoViewer16.h3(4);
                break;
            case 16:
                PhotoViewer photoViewer17 = this.b;
                photoViewer17.w5.m(false, true);
                photoViewer17.x5.m(true, true);
                ug.c2 c2Var4 = photoViewer17.q5;
                if (c2Var4 != null) {
                    c2Var4.setOutlineVisible(false);
                }
                photoViewer17.N1 = false;
                kp0 kp0Var2 = photoViewer17.O1;
                if (kp0Var2 != null) {
                    kp0Var2.setEraser(false);
                }
                photoViewer17.h3(4);
                break;
            case 17:
                PhotoViewer photoViewer18 = this.b;
                kp0 kp0Var3 = photoViewer18.O1;
                if (kp0Var3 != null) {
                    tg.k1 k1Var = kp0Var3.b;
                    if (k1Var.a()) {
                        k1Var.c();
                        break;
                    }
                }
                photoViewer18.h3(0);
                photoViewer18.q5.l();
                boolean isEmpty2 = TextUtils.isEmpty(((org.telegram.messenger.se) photoViewer18.h7.get(photoViewer18.Q4)).i);
                ug.c2 c2Var5 = photoViewer18.q5;
                if (c2Var5 != null && !c2Var5.H) {
                    c2Var5.M = false;
                    c2Var5.F = null;
                }
                ImageReceiver imageReceiver2 = photoViewer18.D4;
                if (isEmpty2 || (bitmap2 = c2Var5.L) == null) {
                    bitmap2 = c2Var5.J;
                }
                imageReceiver2.v0(bitmap2);
                ug.c2 c2Var6 = photoViewer18.q5;
                if (c2Var6 == null || !c2Var6.H) {
                    photoViewer18.u5.setCutOutState(true);
                }
                photoViewer18.d3(true, true);
                break;
            case 18:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.q5 != null) {
                    photoViewer19.z5.m(!r2.t0, true);
                    photoViewer19.q5.setOutlineVisible((!photoViewer19.z5.t0 || photoViewer19.w5.t0 || photoViewer19.x5.t0) ? false : true);
                    break;
                }
                break;
            case 19:
                PhotoViewer photoViewer20 = this.b;
                wm wmVar = photoViewer20.m4;
                if (wmVar != null && (ziVar = wmVar.G5) != null && ziVar.q5() && !org.telegram.messenger.t3.z(photoViewer20.U, 24, org.telegram.messenger.zi.B0(photoViewer20.m4.G5.k))) {
                    if (photoViewer20.n4 == null || (b10 = photoViewer20.m4.x5) == null) {
                        b10 = org.telegram.messenger.ej.b(photoViewer20.m4.G5.k.suggested_post);
                    }
                    if (!ci.e9.T(photoViewer20.U, b10.a)) {
                        wm wmVar2 = photoViewer20.m4;
                        if (wmVar2 != null) {
                            wmVar2.wc(b10);
                            break;
                        }
                    }
                }
                if (!photoViewer20.V1.o()) {
                    wm wmVar3 = photoViewer20.m4;
                    if (wmVar3 == null || !wmVar3.c() || ((x2Var = photoViewer20.m4.Y1) != null && x2Var.C3 != null)) {
                        photoViewer20.z2(true, 0, 0, false, false, false);
                        break;
                    } else {
                        photoViewer20.c3();
                        break;
                    }
                } else {
                    org.telegram.ui.Components.h6 h6Var = photoViewer20.V1.w;
                    float f10 = -photoViewer20.X1;
                    photoViewer20.X1 = f10;
                    org.telegram.messenger.g0.G3(f10, h6Var, null);
                    org.telegram.messenger.p2.E.a();
                    if (!org.telegram.messenger.hp.s1(photoViewer20.U).D3() && org.telegram.messenger.hp.s1(photoViewer20.U).U4 > photoViewer20.V1.getCodePointCount()) {
                        photoViewer20.W2(photoViewer20.f0);
                        break;
                    }
                }
                break;
            case 20:
                this.b.a.a(false, true);
                break;
            case 21:
                PhotoViewer photoViewer21 = this.b;
                if (photoViewer21.E != null && (kq0Var = photoViewer21.d) != null) {
                    kq0Var.W();
                    photoViewer21.H0(true, false);
                    break;
                }
                break;
            case 22:
                PhotoViewer photoViewer22 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.V8;
                photoViewer22.u0();
                if (!photoViewer22.K1()) {
                    if (photoViewer22.s1) {
                        if (photoViewer22.l8) {
                            TextureView textureView = photoViewer22.C2;
                            if (textureView instanceof org.telegram.ui.Components.b51) {
                                org.telegram.ui.Components.b51 b51Var = (org.telegram.ui.Components.b51) textureView;
                                if (b51Var.getVideoWidth() <= 0 || b51Var.getVideoHeight() <= 0) {
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
                Drawable[] drawableArr8 = PhotoViewer.V8;
                photoViewer23.P0(-90.0f, false, null);
                break;
            case 24:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.V8;
                photoViewer24.O0();
                break;
            case 25:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.V8;
                photoViewer25.u0();
                if (!photoViewer25.K1()) {
                    if (photoViewer25.s1) {
                        if (photoViewer25.l8) {
                            TextureView textureView2 = photoViewer25.C2;
                            if (textureView2 instanceof org.telegram.ui.Components.b51) {
                                org.telegram.ui.Components.b51 b51Var2 = (org.telegram.ui.Components.b51) textureView2;
                                if (b51Var2.getVideoWidth() <= 0 || b51Var2.getVideoHeight() <= 0) {
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
                Drawable[] drawableArr11 = PhotoViewer.V8;
                if (view.getAlpha() >= 0.9f) {
                    photoViewer26.u0();
                    if (!photoViewer26.K1()) {
                        if (photoViewer26.s1) {
                            if (photoViewer26.l8) {
                                TextureView textureView3 = photoViewer26.C2;
                                if (textureView3 instanceof org.telegram.ui.Components.b51) {
                                    org.telegram.ui.Components.b51 b51Var3 = (org.telegram.ui.Components.b51) textureView3;
                                    if (b51Var3.getVideoWidth() <= 0 || b51Var3.getVideoHeight() <= 0) {
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
                if (photoViewer27.q6 == null) {
                    xm0 xm0Var = new xm0(photoViewer27, i11);
                    if (!photoViewer27.K2) {
                        float stateOrientation = photoViewer27.S2 - photoViewer27.D1.b.getStateOrientation();
                        if (Math.abs(stateOrientation) > 180.0f) {
                            stateOrientation = stateOrientation < 0.0f ? stateOrientation + 360.0f : -(360.0f - stateOrientation);
                        }
                        photoViewer27.P0(stateOrientation, photoViewer27.D1.b.getStateMirror(), xm0Var);
                        break;
                    } else {
                        xm0Var.run();
                        break;
                    }
                }
                break;
            case 28:
                PhotoViewer photoViewer28 = this.b;
                if (photoViewer28.v4 == 1) {
                    pg.m mVar = photoViewer28.D1.b;
                    pg.b bVar = mVar.H;
                    if (bVar.a.isInProgress() || bVar.h || mVar.a.f0) {
                    }
                }
                photoViewer28.n0();
                photoViewer28.h3(0);
                break;
            default:
                PhotoViewer photoViewer29 = this.b;
                float f11 = -photoViewer29.D1.b.getStateOrientation();
                if (Math.abs(f11) > 180.0f) {
                    f11 = f11 < 0.0f ? f11 + 360.0f : -(360.0f - f11);
                }
                photoViewer29.P0(f11, photoViewer29.D1.b.getStateMirror(), new xm0(photoViewer29, 8));
                break;
        }
    }
}
