package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class yo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ yo0(PhotoViewer photoViewer, int i7) {
        this.a = i7;
        this.b = photoViewer;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00db  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        float f10;
        cq0 cq0Var;
        Bitmap bitmap;
        ImageView imageView;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.k3 && photoViewer.O3 && !org.telegram.messenger.t0.x) {
                    org.telegram.ui.ActionBar.r0 r0Var = this.b.o0;
                    if (r0Var == null || !r0Var.x()) {
                        org.telegram.ui.ActionBar.r0 r0Var2 = this.b.p0;
                        if (r0Var2 == null || !r0Var2.x()) {
                            vp0 vp0Var = this.b.T1;
                            if (vp0Var == null || vp0Var.getScrollY() == 0) {
                                zc zcVar = this.b.X0;
                                if (zcVar == null || zcVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.f9;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.g3(false, true);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                }
                break;
            case 1:
                PhotoViewer photoViewer4 = this.b;
                if (photoViewer4.F2 != null || ((cq0Var = photoViewer4.f0) != null && cq0Var.y)) {
                    if (!photoViewer4.r1) {
                        float k12 = photoViewer4.k1() / this.b.x1();
                        if (this.b.g5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.R3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                cq0 cq0Var2 = photoViewer5.f0;
                                if (cq0Var2 != null && cq0Var2.y) {
                                    f10 = cq0Var2.getBufferedPosition();
                                } else if (photoViewer5.P3) {
                                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(photoViewer5.T);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f11 = photoViewer6.Z2;
                                    if (f11 == 0.0f) {
                                        f11 = k12;
                                    }
                                    f10 = G.t(photoViewer6.b5[0], f11);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.b.R3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.A8 || photoViewer7.Q7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.Z2 == 0.0f) {
                                org.telegram.ui.Cells.j1 j1Var = photoViewer8.Z3;
                                if (j1Var.rewindCount == 0 || (!j1Var.rewindByBackSeek && !photoViewer8.b4.rewindByBackSeek)) {
                                    photoViewer8.p3.h(false, k12);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.b.p3.f(f10);
                                this.b.Q8 = f10;
                            }
                        } else if (k12 >= this.b.R7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.G2 = false;
                            photoViewer9.f2();
                            this.b.p3.h(false, 0.0f);
                            this.b.q2((int) (r1.R7.getLeftProgress() * this.b.x1()));
                            this.b.e0.invalidate();
                        } else {
                            float leftProgress = k12 - this.b.R7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            k12 = leftProgress / (this.b.R7.getRightProgress() - this.b.R7.getLeftProgress());
                            if (k12 > 1.0f) {
                                k12 = 1.0f;
                            }
                            this.b.p3.h(false, k12);
                        }
                        this.b.q3.invalidate();
                        if (this.b.a3 != null && k12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.c3 >= 1000) {
                                String str = photoViewer10.a3;
                                photoViewer10.c3 = SystemClock.elapsedRealtime();
                                org.telegram.messenger.ij ijVar = this.b.S4;
                                if (ijVar != null) {
                                    ijVar.j3 = Float.valueOf(k12);
                                }
                                Utilities.e.c(new org.telegram.messenger.ve(str, 1, k12));
                            }
                        }
                        this.b.A3();
                    } else if (!photoViewer4.R7.r) {
                        float k13 = photoViewer4.k1() / this.b.x1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.A8 || (photoViewer11.t4 == 0 && photoViewer11.Q7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.c2 != 1) {
                                photoViewer12.R7.setProgress(k13);
                            }
                        } else if (k13 >= this.b.R7.getRightProgress()) {
                            wo0 wo0Var = this.b.R7;
                            wo0Var.setProgress(wo0Var.getLeftProgress());
                            this.b.F2.p0((int) (r0.R7.getLeftProgress() * this.b.x1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.G2 = false;
                            photoViewer13.n0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.c2 == 1 || photoViewer14.t4 != 0 || photoViewer14.n6 > 0) {
                                photoViewer14.g2();
                            } else {
                                photoViewer14.f2();
                            }
                            this.b.e0.invalidate();
                        } else {
                            this.b.R7.setProgress(k13);
                        }
                        this.b.A3();
                    }
                }
                oq0 oq0Var = this.b.E2;
                if (oq0Var != null) {
                    oq0.a(oq0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.O3) {
                    org.telegram.messenger.g0.i3(photoViewer15.g4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                ti.o c10 = l2.i.d().c();
                if (c10 != null && c10 != photoViewer16.O8) {
                    c10.b();
                    org.telegram.messenger.g0.i3(this, 250L);
                    break;
                } else {
                    photoViewer16.K3 = false;
                    Bitmap bitmap2 = photoViewer16.B3;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        photoViewer16.B3 = null;
                    }
                    photoViewer16.E3 = true;
                    try {
                    } catch (Throwable th2) {
                        Bitmap bitmap3 = photoViewer16.B3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.B3 = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (photoViewer16.D2) {
                        Drawable drawable = photoViewer16.w3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap4 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer16.B3 = bitmap4;
                            if (bitmap4 != null) {
                                ImageView imageView2 = photoViewer16.w3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.w3.setImageBitmap(photoViewer16.B3);
                                }
                                bitmap = photoViewer16.B3;
                                photoViewer16.I3 = true;
                                photoViewer16.T0();
                                ti.p g10 = photoViewer16.O8.g(photoViewer16.D, bitmap, !photoViewer16.J3);
                                photoViewer16.v3 = g10;
                                photoViewer16.J3 = true;
                                if (!photoViewer16.D2) {
                                    org.telegram.ui.Components.fe0 fe0Var = photoViewer16.y2;
                                    if (fe0Var != null) {
                                        fe0Var.removeView(photoViewer16.B2);
                                        photoViewer16.y2.removeView(photoViewer16.C2);
                                    }
                                    photoViewer16.F2.z0(null);
                                    photoViewer16.F2.A0(null);
                                    photoViewer16.F2.h0();
                                    photoViewer16.F2.A0(photoViewer16.v3);
                                    photoViewer16.q0(true);
                                    photoViewer16.v3.setVisibility(0);
                                    break;
                                } else {
                                    photoViewer16.P8 = g10;
                                    org.telegram.ui.Components.fe0 fe0Var2 = photoViewer16.y2;
                                    if (fe0Var2 != null) {
                                        fe0Var2.removeView(photoViewer16.B2);
                                        photoViewer16.y2.removeView(photoViewer16.C2);
                                    }
                                    photoViewer16.P8 = null;
                                    photoViewer16.E3 = false;
                                    photoViewer16.q0(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        int width = photoViewer16.B2.getWidth();
                        int height = photoViewer16.B2.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c11 = org.telegram.messenger.as.c(width, height);
                        photoViewer16.B3 = c11;
                        photoViewer16.B2.getBitmap(c11);
                        if (photoViewer16.B3 != null && (imageView = photoViewer16.w3) != null) {
                            imageView.setVisibility(0);
                            photoViewer16.w3.setImageBitmap(photoViewer16.B3);
                        }
                    }
                    bitmap = null;
                    photoViewer16.I3 = true;
                    photoViewer16.T0();
                    ti.p g102 = photoViewer16.O8.g(photoViewer16.D, bitmap, !photoViewer16.J3);
                    photoViewer16.v3 = g102;
                    photoViewer16.J3 = true;
                    if (!photoViewer16.D2) {
                    }
                }
                break;
        }
    }
}
