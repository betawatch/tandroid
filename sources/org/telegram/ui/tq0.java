package org.telegram.ui;

import android.graphics.drawable.Drawable;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.video.VideoAds;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ tq0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z4;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                Drawable[] drawableArr = PhotoViewer.Q8;
                photoViewer.x0(false);
                org.telegram.ui.Components.mg0.m0.k(true, true);
                break;
            case 1:
                PhotoViewer photoViewer2 = this.b;
                Drawable[] drawableArr2 = PhotoViewer.Q8;
                photoViewer2.e3(0);
                break;
            case 2:
                PhotoViewer photoViewer3 = this.b;
                Drawable[] drawableArr3 = PhotoViewer.Q8;
                photoViewer3.w2(true, 0, 0, false, true, false);
                break;
            case 3:
                PhotoViewer photoViewer4 = this.b;
                Drawable[] drawableArr4 = PhotoViewer.Q8;
                photoViewer4.w2(true, 0, 0, false, false, false);
                break;
            case 4:
                PhotoViewer photoViewer5 = this.b;
                Drawable[] drawableArr5 = PhotoViewer.Q8;
                photoViewer5.w2(false, 0, 0, true, false, false);
                break;
            case 5:
                PhotoViewer photoViewer6 = this.b;
                Drawable[] drawableArr6 = PhotoViewer.Q8;
                photoViewer6.Z2();
                break;
            case 6:
                PhotoViewer photoViewer7 = this.b;
                Drawable[] drawableArr7 = PhotoViewer.Q8;
                photoViewer7.w2(false, 0, 0, false, false, false);
                break;
            case 7:
                PhotoViewer photoViewer8 = this.b;
                Drawable[] drawableArr8 = PhotoViewer.Q8;
                photoViewer8.h2();
                break;
            case 8:
                org.telegram.ui.Components.ze0 ze0Var = this.b.z1;
                yf.e eVar = ze0Var.c;
                eVar.b(0.0f);
                eVar.setMirrored(false);
                eVar.setRotated(false);
                ze0Var.b.l(true);
                break;
            case 9:
                PhotoViewer photoViewer9 = this.b;
                Drawable[] drawableArr9 = PhotoViewer.Q8;
                photoViewer9.m0();
                break;
            case 10:
                PhotoViewer photoViewer10 = this.b;
                photoViewer10.n5.b.setLoading(false);
                photoViewer10.e3(0);
                break;
            case 11:
                PhotoViewer photoViewer11 = this.b;
                photoViewer11.n5.b.setLoading(false);
                photoViewer11.e3(0);
                break;
            case 12:
                PhotoViewer photoViewer12 = this.b;
                Drawable[] drawableArr10 = PhotoViewer.Q8;
                photoViewer12.e3(0);
                break;
            case 13:
                this.b.m5.S = false;
                break;
            case 14:
                this.b.v4.setBackground(null);
                break;
            case 15:
                PhotoViewer photoViewer13 = this.b;
                photoViewer13.f7 = null;
                photoViewer13.m0();
                photoViewer13.e3(0);
                break;
            case 16:
                PhotoViewer photoViewer14 = this.b;
                photoViewer14.n5.b.setLoading(false);
                photoViewer14.e3(0);
                break;
            case 17:
                PhotoViewer photoViewer15 = this.b;
                photoViewer15.n5.b.setLoading(false);
                photoViewer15.e3(0);
                break;
            case 18:
                PhotoViewer photoViewer16 = this.b;
                Drawable[] drawableArr11 = PhotoViewer.Q8;
                photoViewer16.s3();
                break;
            case 19:
                PhotoViewer photoViewer17 = this.b;
                Drawable[] drawableArr12 = PhotoViewer.Q8;
                photoViewer17.k0();
                break;
            case 20:
                PhotoViewer photoViewer18 = this.b;
                Drawable[] drawableArr13 = PhotoViewer.Q8;
                photoViewer18.n3(true);
                break;
            case 21:
                PhotoViewer photoViewer19 = this.b;
                if (photoViewer19.s0.isEnabled() && AndroidUtilities.checkInlinePermissions(photoViewer19.y) && !org.telegram.ui.Components.mg0.m0.M && photoViewer19.M3) {
                    if (!photoViewer19.q4) {
                        photoViewer19.H3 = false;
                        photoViewer19.h3();
                        break;
                    } else {
                        ut0 ut0Var = photoViewer19.c0;
                        if (ut0Var != null) {
                            if ((!ut0Var.x || !"inapp".equals(MessagesController.getInstance(ut0Var.a).youtubePipType)) && photoViewer19.c0.e()) {
                                photoViewer19.H3 = false;
                                if (PhotoViewer.X8 != null) {
                                    PhotoViewer.X8.P0();
                                }
                                photoViewer19.G3 = true;
                                PhotoViewer.X8 = PhotoViewer.W8;
                                PhotoViewer.W8 = null;
                                photoViewer19.e = false;
                                qu0 qu0Var = photoViewer19.a5;
                                if (qu0Var != null && !qu0Var.a.getVisible()) {
                                    photoViewer19.a5.a.setVisible(true, true);
                                }
                                photoViewer19.j6 = 1.0f;
                                photoViewer19.b0.invalidate();
                                photoViewer19.S0();
                                break;
                            }
                        }
                    }
                }
                break;
            case 22:
                PhotoViewer photoViewer20 = this.b;
                if (photoViewer20.e && photoViewer20.k4 == 0) {
                    photoViewer20.v3(photoViewer20.G);
                    break;
                }
                break;
            case 23:
                PhotoViewer photoViewer21 = this.b;
                Drawable[] drawableArr14 = PhotoViewer.Q8;
                photoViewer21.F1();
                break;
            case 24:
                PhotoViewer photoViewer22 = this.b;
                org.telegram.ui.Components.i71 i71Var = photoViewer22.C2;
                if (i71Var != null && photoViewer22.X5 <= 1.35f) {
                    long n10 = i71Var.n();
                    long p10 = photoViewer22.C2.p();
                    if (n10 != -9223372036854775807L && p10 >= 8000) {
                        float f10 = photoViewer22.A7;
                        int k12 = photoViewer22.k1(photoViewer22.r4);
                        if (p10 <= 180000) {
                            photoViewer22.Z3.startRewind(photoViewer22.C2, f10 > ((float) (k12 / 3)), photoViewer22.A7, photoViewer22.q1, photoViewer22.x1);
                            break;
                        } else {
                            int i10 = k12 / 3;
                            if (f10 < i10 * 2) {
                                z4 = f10 >= ((float) i10);
                            }
                            photoViewer22.X3.startRewind(photoViewer22.C2, z4, photoViewer22.q1);
                            break;
                        }
                    }
                }
                break;
            case 25:
                PhotoViewer photoViewer23 = this.b;
                if (!photoViewer23.R4.isPopupShown()) {
                    org.telegram.ui.Components.i71 i71Var2 = photoViewer23.C2;
                    if (i71Var2 != null && photoViewer23.R4.videoWasPlaying) {
                        i71Var2.C();
                        break;
                    }
                } else {
                    VideoAds videoAds = photoViewer23.R4;
                    org.telegram.ui.Components.i71 i71Var3 = photoViewer23.C2;
                    videoAds.videoWasPlaying = i71Var3 != null ? i71Var3.y() : true;
                    org.telegram.ui.Components.i71 i71Var4 = photoViewer23.C2;
                    if (i71Var4 != null) {
                        i71Var4.B();
                        break;
                    }
                }
                break;
            case 26:
                PhotoViewer photoViewer24 = this.b;
                Drawable[] drawableArr15 = PhotoViewer.Q8;
                photoViewer24.G0(false, false);
                org.telegram.ui.Components.li liVar = photoViewer24.X1;
                if (liVar != null) {
                    liVar.dismiss(true);
                }
                org.telegram.ui.ActionBar.p2 p2Var = photoViewer24.j4;
                if (p2Var != null) {
                    p2Var.presentFragment(new PremiumPreviewFragment(0, "caption_limit"));
                    break;
                }
                break;
            case 27:
                this.b.k7 = null;
                break;
            case 28:
                PhotoViewer photoViewer25 = this.b;
                Drawable[] drawableArr16 = PhotoViewer.Q8;
                photoViewer25.z3();
                break;
            default:
                PhotoViewer photoViewer26 = this.b;
                photoViewer26.A1.e(photoViewer26.G2, photoViewer26.H2, photoViewer26.I2, photoViewer26.M2, photoViewer26.O2, photoViewer26.L2, photoViewer26.r2(true), photoViewer26.r2(true), photoViewer26.J2, photoViewer26.K2, 0.0f, 0.0f, photoViewer26.N2);
                photoViewer26.e3(0);
                break;
        }
    }
}
