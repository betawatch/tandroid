package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xb1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.jl0, org.telegram.ui.Components.n81, org.telegram.ui.ActionBar.c2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jd1 b;

    public /* synthetic */ xb1(jd1 jd1Var, int i10) {
        this.a = i10;
        this.b = jd1Var;
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ boolean Y0(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.jl0
    public void c(float f10, float f11, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            boolean i32 = t1Var.i3(f10);
            jd1 jd1Var = this.b;
            if (!i32) {
                jd1Var.Y0(2, true);
            } else if (t1Var.getMessageObject().isOutOwner()) {
                jd1Var.Y0(3, true);
            } else {
                jd1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.ui.Components.n81
    public void d(int i10, int i11) {
        jd1 jd1Var = this.b;
        if (jd1Var.B1) {
            jd1Var.u0.getBackground();
            float scaleX = jd1Var.y0 != null ? (jd1Var.u0.getScaleX() - 1.0f) / (jd1Var.v1 - 1.0f) : 1.0f;
            jd1Var.u0.setTranslationX(i10 * scaleX);
            jd1Var.u0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z4, boolean z10, boolean z11) {
        jd1 jd1Var = this.b;
        if (jd1Var.y1 instanceof vi1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z4 || drawable == null) {
            return;
        }
        ic1 ic1Var = jd1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        ic1Var.b(jd1Var.P0(drawable), drawable, Float.valueOf(jd1Var.i1));
        if (!z10 && jd1Var.C1 && jd1Var.t1 == null) {
            jd1Var.u0.getImageReceiver().setCrossfadeWithOldImage(false);
            jd1Var.i1();
            jd1Var.u0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        jd1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.j5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.p0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                jd1 jd1Var = this.b;
                org.telegram.ui.ActionBar.i6 i6Var = jd1Var.s;
                if (i6Var.j == 4294967296L) {
                    i6Var.j = 0L;
                    i6Var.k = 0L;
                    i6Var.l = 0L;
                    i6Var.m = 0L;
                    jd1Var.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                jd1Var.v = true;
                org.telegram.ui.ActionBar.k6.p1(true);
                jd1Var.Y0(2, false);
                break;
            case 6:
                jd1 jd1Var2 = this.b;
                org.telegram.ui.ActionBar.i6 i6Var2 = jd1Var2.s;
                if (org.telegram.ui.ActionBar.k6.Z0() && org.telegram.ui.ActionBar.k6.I.f0.d != 0) {
                    org.telegram.ui.ActionBar.d6 d6Var = i6Var2.y;
                    i6Var2.j = d6Var.d;
                    i6Var2.k = d6Var.e;
                    i6Var2.l = d6Var.f;
                    i6Var2.m = d6Var.g;
                    i6Var2.n = d6Var.h;
                    String str = d6Var.c;
                    i6Var2.o = str;
                    float f10 = d6Var.k;
                    i6Var2.p = f10;
                    jd1Var2.i1 = f10;
                    if (str == null || "c".equals(str)) {
                        jd1Var2.T0 = null;
                    } else {
                        int size = jd1Var2.R0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) jd1Var2.R0.get(i11);
                                if (tL_wallPaper.pattern && i6Var2.o.equals(tL_wallPaper.slug)) {
                                    jd1Var2.T0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    jd1Var2.v = true;
                    jd1Var2.G0[1].a(jd1Var2.T0 != null, true);
                    jd1Var2.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                Drawable background = jd1Var2.u0.getBackground();
                if (background instanceof org.telegram.ui.Components.fc0) {
                    org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) background;
                    fc0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.k6.I.q()) {
                        if (jd1Var2.i1 < 0.0f) {
                            jd1Var2.u0.getImageReceiver().setGradientBitmap(fc0Var.k);
                        }
                        org.telegram.ui.Cells.j0 j0Var = jd1Var2.Q0;
                        if (j0Var != null) {
                            j0Var.setTwoSided(true);
                        }
                    } else {
                        float f11 = jd1Var2.i1;
                        if (f11 < 0.0f) {
                            jd1Var2.i1 = -f11;
                        }
                    }
                }
                org.telegram.ui.Cells.j0 j0Var2 = jd1Var2.Q0;
                if (j0Var2 != null) {
                    j0Var2.setProgress(jd1Var2.i1);
                }
                org.telegram.ui.ActionBar.k6.p1(true);
                jd1Var2.Y0(2, false);
                break;
            default:
                jd1 jd1Var3 = this.b;
                org.telegram.ui.ActionBar.i6 i6Var3 = jd1Var3.s;
                if (i6Var3.j == 4294967296L) {
                    i6Var3.j = 0L;
                    i6Var3.k = 0L;
                    i6Var3.l = 0L;
                    i6Var3.m = 0L;
                    jd1Var3.m1(false);
                    org.telegram.ui.ActionBar.k6.n1(false, false);
                }
                jd1Var3.v = true;
                org.telegram.ui.ActionBar.k6.p1(true);
                jd1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.j5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.jl0
    public /* synthetic */ void r0(View view, float f10, float f11) {
    }
}
