package org.telegram.ui;

import android.app.Activity;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ xm0(PhotoViewer photoViewer, int i3) {
        this.a = i3;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.V8;
                photoViewer.y0(false);
                org.telegram.ui.Components.ie0.q0.d(true, true);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.V8;
                photoViewer2.h3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.V8;
                photoViewer3.z2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.V8;
                photoViewer4.z2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.V8;
                photoViewer5.z2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.V8;
                photoViewer6.c3();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.V8;
                photoViewer7.z2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.V8;
                photoViewer8.l2();
                break;
            case 8:
                org.telegram.ui.Components.ad0 ad0Var = this.b.D1;
                pg.e eVar = ad0Var.c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                ad0Var.b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.V8;
                photoViewer9.n0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.r5.b.setLoading(false);
                photoViewer10.h3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.b;
                photoViewer11.r5.b.setLoading(false);
                photoViewer11.h3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.V8;
                photoViewer12.h3(0);
                break;
            case 13:
                this.b.q5.W = false;
                break;
            case 14:
                this.b.z4.setBackground(null);
                break;
            case 15:
                PhotoViewer photoViewer13 = this.b;
                photoViewer13.j7 = null;
                photoViewer13.n0();
                photoViewer13.h3(0);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.r5.b.setLoading(false);
                photoViewer14.h3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.b;
                photoViewer15.r5.b.setLoading(false);
                photoViewer15.h3(0);
                break;
            case 18:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.V8;
                photoViewer16.v3();
                break;
            case 19:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.V8;
                photoViewer17.l0();
                break;
            case 20:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.V8;
                photoViewer18.q3(true);
                break;
            case 21:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.w0.isEnabled()) {
                    Activity activity = photoViewer19.E;
                    Typeface typeface = org.telegram.messenger.g0.a;
                    if (Settings.canDrawOverlays(activity) && !org.telegram.ui.Components.ie0.q0.Q && photoViewer19.Q3) {
                        if (!photoViewer19.u4) {
                            photoViewer19.L3 = false;
                            photoViewer19.k3();
                            break;
                        } else {
                            tp0 tp0Var = photoViewer19.g0;
                            if (tp0Var != null) {
                                if ((!tp0Var.y || !"inapp".equals(org.telegram.messenger.hp.s1(tp0Var.a).B3)) && photoViewer19.g0.e()) {
                                    photoViewer19.L3 = false;
                                    if (PhotoViewer.c9 != null) {
                                        PhotoViewer.c9.Q0();
                                    }
                                    photoViewer19.K3 = true;
                                    PhotoViewer.c9 = PhotoViewer.b9;
                                    PhotoViewer.b9 = null;
                                    photoViewer19.e = false;
                                    mq0 mq0Var = photoViewer19.e5;
                                    if (mq0Var != null) {
                                        ImageReceiver imageReceiver = mq0Var.a;
                                        if (!imageReceiver.R0) {
                                            imageReceiver.O0(true, true);
                                        }
                                    }
                                    photoViewer19.n6 = 1.0f;
                                    photoViewer19.f0.invalidate();
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
                if (photoViewer20.e && photoViewer20.o4 == 0) {
                    photoViewer20.y3(photoViewer20.K);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.V8;
                photoViewer21.I1();
                break;
            case 24:
                PhotoViewer photoViewer22 = this.b;
                org.telegram.ui.Components.m51 m51Var = photoViewer22.G2;
                if (m51Var != null && photoViewer22.b6 <= 1.35f) {
                    long S = m51Var.S();
                    long U = photoViewer22.G2.U();
                    if (S != -9223372036854775807L && U >= 8000) {
                        float f10 = photoViewer22.F7;
                        int m1 = photoViewer22.m1(photoViewer22.v4);
                        if (U <= 180000) {
                            photoViewer22.d4.startRewind(photoViewer22.G2, f10 > ((float) (m1 / 3)), photoViewer22.F7, photoViewer22.u1, photoViewer22.B1);
                            break;
                        } else {
                            int i3 = m1 / 3;
                            if (f10 < i3 * 2) {
                                z10 = f10 >= ((float) i3);
                            }
                            photoViewer22.b4.startRewind(photoViewer22.G2, z10, photoViewer22.u1);
                            break;
                        }
                    }
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.b;
                if (!photoViewer23.V4.isPopupShown()) {
                    org.telegram.ui.Components.m51 m51Var2 = photoViewer23.G2;
                    if (m51Var2 != null && photoViewer23.V4.videoWasPlaying) {
                        m51Var2.h0();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer23.V4;
                    org.telegram.ui.Components.m51 m51Var3 = photoViewer23.G2;
                    videoAds.videoWasPlaying = m51Var3 != null ? m51Var3.d0() : true;
                    org.telegram.ui.Components.m51 m51Var4 = photoViewer23.G2;
                    if (m51Var4 != null) {
                        m51Var4.g0();
                        break;
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.V8;
                photoViewer24.H0(false, false);
                org.telegram.ui.Components.bi biVar = photoViewer24.b2;
                if (biVar != null) {
                    biVar.a(true);
                }
                org.telegram.ui.ActionBar.d2 d2Var = photoViewer24.n4;
                if (d2Var != null) {
                    d2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 27:
                this.b.o7 = null;
                break;
            case 28:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.V8;
                photoViewer25.C3();
                break;
            default:
                PhotoViewer photoViewer26 = this.b;
                photoViewer26.E1.e(photoViewer26.K2, photoViewer26.L2, photoViewer26.M2, photoViewer26.Q2, photoViewer26.S2, photoViewer26.P2, photoViewer26.u2(true), photoViewer26.u2(true), photoViewer26.N2, photoViewer26.O2, 0.0f, 0.0f, photoViewer26.R2);
                photoViewer26.h3(0);
                break;
        }
    }
}
