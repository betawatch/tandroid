package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class qo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ qo0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.U8;
                photoViewer.y0(false);
                org.telegram.ui.Components.jf0.p0.d(true, true);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.U8;
                photoViewer2.h3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.U8;
                photoViewer3.z2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.U8;
                photoViewer4.z2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.U8;
                photoViewer5.z2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.U8;
                photoViewer6.c3();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.U8;
                photoViewer7.z2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.U8;
                photoViewer8.l2();
                break;
            case 8:
                org.telegram.ui.Components.be0 be0Var = this.b.C1;
                eg.f fVar = be0Var.c;
                fVar.b(0.0f);
                fVar.setMirrored(false);
                fVar.setRotated(false);
                be0Var.b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.U8;
                photoViewer9.n0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.q5.b.setLoading(false);
                photoViewer10.h3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.b;
                photoViewer11.q5.b.setLoading(false);
                photoViewer11.h3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.U8;
                photoViewer12.h3(0);
                break;
            case 13:
                this.b.p5.V = false;
                break;
            case 14:
                this.b.y4.setBackground(null);
                break;
            case 15:
                PhotoViewer photoViewer13 = this.b;
                photoViewer13.i7 = null;
                photoViewer13.n0();
                photoViewer13.h3(0);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.q5.b.setLoading(false);
                photoViewer14.h3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.b;
                photoViewer15.q5.b.setLoading(false);
                photoViewer15.h3(0);
                break;
            case 18:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.U8;
                photoViewer16.v3();
                break;
            case 19:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.U8;
                photoViewer17.l0();
                break;
            case 20:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.U8;
                photoViewer18.q3(true);
                break;
            case 21:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.v0.isEnabled()) {
                    Activity activity = photoViewer19.D;
                    Typeface typeface = org.telegram.messenger.i0.a;
                    if (Settings.canDrawOverlays(activity) && !org.telegram.ui.Components.jf0.p0.P && photoViewer19.P3) {
                        if (!photoViewer19.t4) {
                            photoViewer19.K3 = false;
                            photoViewer19.k3();
                            break;
                        } else {
                            mr0 mr0Var = photoViewer19.f0;
                            if (mr0Var != null) {
                                if ((!mr0Var.y || !"inapp".equals(org.telegram.messenger.vp.r1(mr0Var.a).A3)) && photoViewer19.f0.e()) {
                                    photoViewer19.K3 = false;
                                    if (PhotoViewer.b9 != null) {
                                        PhotoViewer.b9.Q0();
                                    }
                                    photoViewer19.J3 = true;
                                    PhotoViewer.b9 = PhotoViewer.a9;
                                    PhotoViewer.a9 = null;
                                    photoViewer19.e = false;
                                    gs0 gs0Var = photoViewer19.d5;
                                    if (gs0Var != null) {
                                        ImageReceiver imageReceiver = gs0Var.a;
                                        if (!imageReceiver.Q0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer19.m6 = 1.0f;
                                    photoViewer19.e0.invalidate();
                                    photoViewer19.T0();
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer20 = this.b;
                if (photoViewer20.e && photoViewer20.n4 == 0) {
                    photoViewer20.y3(photoViewer20.J);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.U8;
                photoViewer21.I1();
                break;
            case 24:
                PhotoViewer photoViewer22 = this.b;
                org.telegram.ui.Components.u61 u61Var = photoViewer22.F2;
                if (u61Var != null && photoViewer22.a6 <= 1.35f) {
                    long S = u61Var.S();
                    long U = photoViewer22.F2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f7 = photoViewer22.E7;
                        int m12 = photoViewer22.m1(photoViewer22.u4);
                        if (U <= 180000) {
                            photoViewer22.c4.startRewind(photoViewer22.F2, f7 > ((float) (m12 / 3)), photoViewer22.E7, photoViewer22.t1, photoViewer22.A1);
                            break;
                        } else {
                            int i10 = m12 / 3;
                            if (f7 < i10 * 2) {
                                z10 = f7 >= ((float) i10);
                            }
                            photoViewer22.a4.startRewind(photoViewer22.F2, z10, photoViewer22.t1);
                            break;
                        }
                    }
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.b;
                if (!photoViewer23.U4.isPopupShown()) {
                    org.telegram.ui.Components.u61 u61Var2 = photoViewer23.F2;
                    if (u61Var2 != null && photoViewer23.U4.videoWasPlaying) {
                        u61Var2.h0();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer23.U4;
                    org.telegram.ui.Components.u61 u61Var3 = photoViewer23.F2;
                    videoAds.videoWasPlaying = u61Var3 != null ? u61Var3.d0() : true;
                    org.telegram.ui.Components.u61 u61Var4 = photoViewer23.F2;
                    if (u61Var4 != null) {
                        u61Var4.g0();
                        break;
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.U8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.bi biVar = photoViewer24.a2;
                if (biVar != null) {
                    biVar.a(true);
                }
                org.telegram.ui.ActionBar.k2 k2Var = photoViewer24.m4;
                if (k2Var != null) {
                    k2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 27:
                this.b.n7 = null;
                break;
            case 28:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.U8;
                photoViewer25.C3();
                break;
            default:
                PhotoViewer photoViewer26 = this.b;
                photoViewer26.D1.e(photoViewer26.J2, photoViewer26.K2, photoViewer26.L2, photoViewer26.P2, photoViewer26.R2, photoViewer26.O2, photoViewer26.u2(true), photoViewer26.u2(true), photoViewer26.M2, photoViewer26.N2, 0.0f, 0.0f, photoViewer26.Q2);
                photoViewer26.h3(0);
                break;
        }
    }
}
