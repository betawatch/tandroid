package org.telegram.ui;

import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class rc1 implements ImageReceiver.ImageReceiverDelegate, org.telegram.ui.Components.bm0, org.telegram.ui.Components.m91, org.telegram.ui.ActionBar.z1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ce1 b;

    public /* synthetic */ rc1(ce1 ce1Var, int i10) {
        this.a = i10;
        this.b = ce1Var;
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ boolean c1(View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.bm0
    public void d(float f7, float f10, int i10, View view) {
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            boolean i32 = u1Var.i3(f7);
            ce1 ce1Var = this.b;
            if (!i32) {
                ce1Var.Y0(2, true);
            } else if (u1Var.getMessageObject().isOutOwner()) {
                ce1Var.Y0(3, true);
            } else {
                ce1Var.Y0(1, true);
            }
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public void didSetImage(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
        ce1 ce1Var = this.b;
        if (ce1Var.B1 instanceof pj1) {
            return;
        }
        Drawable drawable = imageReceiver.getDrawable();
        if (!z10 || drawable == null) {
            return;
        }
        cd1 cd1Var = ce1Var.a;
        AndroidUtilities.calcDrawableColor(drawable);
        cd1Var.b(ce1Var.P0(drawable), drawable, Float.valueOf(ce1Var.l1));
        if (!z11 && ce1Var.F1 && ce1Var.w1 == null) {
            ce1Var.x0.getImageReceiver().setCrossfadeWithOldImage(false);
            ce1Var.i1();
            ce1Var.x0.getImageReceiver().setCrossfadeWithOldImage(true);
        }
        ce1Var.V0();
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void didSetImageBitmap(int i10, String str, Drawable drawable) {
        org.telegram.messenger.l5.a(this, i10, str, drawable);
    }

    @Override // org.telegram.ui.Components.m91
    public void e(int i10, int i11) {
        ce1 ce1Var = this.b;
        if (ce1Var.E1) {
            ce1Var.x0.getBackground();
            float scaleX = ce1Var.B0 != null ? (ce1Var.x0.getScaleX() - 1.0f) / (ce1Var.y1 - 1.0f) : 1.0f;
            ce1Var.x0.setTranslationX(i10 * scaleX);
            ce1Var.x0.setTranslationY(i11 * scaleX);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.a) {
            case 3:
                this.b.s0.getActionBarMenuOnItemClick().b(4);
                break;
            case 4:
                this.b.O0(false);
                break;
            case 5:
                ce1 ce1Var = this.b;
                org.telegram.ui.ActionBar.e6 e6Var = ce1Var.s;
                if (e6Var.j == 4294967296L) {
                    e6Var.j = 0L;
                    e6Var.k = 0L;
                    e6Var.l = 0L;
                    e6Var.m = 0L;
                    ce1Var.m1(false);
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                }
                ce1Var.v = true;
                org.telegram.ui.ActionBar.g6.q1(true);
                ce1Var.Y0(2, false);
                break;
            case 6:
                ce1 ce1Var2 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var2 = ce1Var2.s;
                if (org.telegram.ui.ActionBar.g6.a1() && org.telegram.ui.ActionBar.g6.I.i0.d != 0) {
                    org.telegram.ui.ActionBar.z5 z5Var = e6Var2.y;
                    e6Var2.j = z5Var.d;
                    e6Var2.k = z5Var.e;
                    e6Var2.l = z5Var.f;
                    e6Var2.m = z5Var.g;
                    e6Var2.n = z5Var.h;
                    String str = z5Var.c;
                    e6Var2.o = str;
                    float f7 = z5Var.k;
                    e6Var2.p = f7;
                    ce1Var2.l1 = f7;
                    if (str == null || "c".equals(str)) {
                        ce1Var2.W0 = null;
                    } else {
                        int size = ce1Var2.U0.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 < size) {
                                TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) ce1Var2.U0.get(i11);
                                if (tL_wallPaper.pattern && e6Var2.o.equals(tL_wallPaper.slug)) {
                                    ce1Var2.W0 = tL_wallPaper;
                                } else {
                                    i11++;
                                }
                            }
                        }
                    }
                    ce1Var2.v = true;
                    ce1Var2.J0[1].a(ce1Var2.W0 != null, true);
                    ce1Var2.m1(false);
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                }
                Drawable background = ce1Var2.x0.getBackground();
                if (background instanceof org.telegram.ui.Components.cd0) {
                    org.telegram.ui.Components.cd0 cd0Var = (org.telegram.ui.Components.cd0) background;
                    cd0Var.t(null, 100);
                    if (org.telegram.ui.ActionBar.g6.I.q()) {
                        if (ce1Var2.l1 < 0.0f) {
                            ce1Var2.x0.getImageReceiver().setGradientBitmap(cd0Var.k);
                        }
                        org.telegram.ui.Cells.k0 k0Var = ce1Var2.T0;
                        if (k0Var != null) {
                            k0Var.setTwoSided(true);
                        }
                    } else {
                        float f10 = ce1Var2.l1;
                        if (f10 < 0.0f) {
                            ce1Var2.l1 = -f10;
                        }
                    }
                }
                org.telegram.ui.Cells.k0 k0Var2 = ce1Var2.T0;
                if (k0Var2 != null) {
                    k0Var2.setProgress(ce1Var2.l1);
                }
                org.telegram.ui.ActionBar.g6.q1(true);
                ce1Var2.Y0(2, false);
                break;
            default:
                ce1 ce1Var3 = this.b;
                org.telegram.ui.ActionBar.e6 e6Var3 = ce1Var3.s;
                if (e6Var3.j == 4294967296L) {
                    e6Var3.j = 0L;
                    e6Var3.k = 0L;
                    e6Var3.l = 0L;
                    e6Var3.m = 0L;
                    ce1Var3.m1(false);
                    org.telegram.ui.ActionBar.g6.o1(false, false);
                }
                ce1Var3.v = true;
                org.telegram.ui.ActionBar.g6.q1(true);
                ce1Var3.Y0(2, false);
                break;
        }
    }

    @Override // org.telegram.messenger.ImageReceiver.ImageReceiverDelegate
    public /* synthetic */ void onAnimationReady(ImageReceiver imageReceiver) {
        org.telegram.messenger.l5.b(this, imageReceiver);
    }

    @Override // org.telegram.ui.Components.bm0
    public /* synthetic */ void p0(View view, float f7, float f10) {
    }
}
