package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class wo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ wo0(PhotoViewer photoViewer, int i7) {
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
        bq0 bq0Var;
        Bitmap bitmap;
        ImageView imageView;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.l3 && photoViewer.P3 && !org.telegram.messenger.t0.x) {
                    org.telegram.ui.ActionBar.q0 q0Var = this.b.p0;
                    if (q0Var == null || !q0Var.y()) {
                        org.telegram.ui.ActionBar.q0 q0Var2 = this.b.q0;
                        if (q0Var2 == null || !q0Var2.y()) {
                            up0 up0Var = this.b.U1;
                            if (up0Var == null || up0Var.getScrollY() == 0) {
                                yc ycVar = this.b.Y0;
                                if (ycVar == null || ycVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.g9;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.h3(false, true);
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
                if (photoViewer4.G2 != null || ((bq0Var = photoViewer4.g0) != null && bq0Var.y)) {
                    if (!photoViewer4.s1) {
                        float k12 = photoViewer4.k1() / this.b.x1();
                        if (this.b.h5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                bq0 bq0Var2 = photoViewer5.g0;
                                if (bq0Var2 != null && bq0Var2.y) {
                                    f10 = bq0Var2.getBufferedPosition();
                                } else if (photoViewer5.Q3) {
                                    org.telegram.messenger.w7 G = org.telegram.messenger.w7.G(photoViewer5.U);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f11 = photoViewer6.a3;
                                    if (f11 == 0.0f) {
                                        f11 = k12;
                                    }
                                    f10 = G.t(photoViewer6.c5[0], f11);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.b.S3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.B8 || photoViewer7.R7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.a3 == 0.0f) {
                                org.telegram.ui.Cells.j1 j1Var = photoViewer8.a4;
                                if (j1Var.rewindCount == 0 || (!j1Var.rewindByBackSeek && !photoViewer8.c4.rewindByBackSeek)) {
                                    photoViewer8.q3.h(false, k12);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.b.q3.f(f10);
                                this.b.R8 = f10;
                            }
                        } else if (k12 >= this.b.S7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.H2 = false;
                            photoViewer9.g2();
                            this.b.q3.h(false, 0.0f);
                            this.b.r2((int) (r1.S7.getLeftProgress() * this.b.x1()));
                            this.b.f0.invalidate();
                        } else {
                            float leftProgress = k12 - this.b.S7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            k12 = leftProgress / (this.b.S7.getRightProgress() - this.b.S7.getLeftProgress());
                            if (k12 > 1.0f) {
                                k12 = 1.0f;
                            }
                            this.b.q3.h(false, k12);
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && k12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.d3 >= 1000) {
                                String str = photoViewer10.b3;
                                photoViewer10.d3 = SystemClock.elapsedRealtime();
                                org.telegram.messenger.gj gjVar = this.b.T4;
                                if (gjVar != null) {
                                    gjVar.l3 = Float.valueOf(k12);
                                }
                                Utilities.e.c(new org.telegram.messenger.ue(str, 1, k12));
                            }
                        }
                        this.b.B3();
                    } else if (!photoViewer4.S7.r) {
                        float k13 = photoViewer4.k1() / this.b.x1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.B8 || (photoViewer11.u4 == 0 && photoViewer11.R7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.d2 != 1) {
                                photoViewer12.S7.setProgress(k13);
                            }
                        } else if (k13 >= this.b.S7.getRightProgress()) {
                            uo0 uo0Var = this.b.S7;
                            uo0Var.setProgress(uo0Var.getLeftProgress());
                            this.b.G2.p0((int) (r0.S7.getLeftProgress() * this.b.x1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.H2 = false;
                            photoViewer13.n0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.d2 == 1 || photoViewer14.u4 != 0 || photoViewer14.o6 > 0) {
                                photoViewer14.h2();
                            } else {
                                photoViewer14.g2();
                            }
                            this.b.f0.invalidate();
                        } else {
                            this.b.S7.setProgress(k13);
                        }
                        this.b.B3();
                    }
                }
                nq0 nq0Var = this.b.F2;
                if (nq0Var != null) {
                    nq0.a(nq0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.P3) {
                    org.telegram.messenger.g0.i3(photoViewer15.h4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                wi.n c10 = l2.i.d().c();
                if (c10 != null && c10 != photoViewer16.P8) {
                    c10.b();
                    org.telegram.messenger.g0.i3(this, 250L);
                    break;
                } else {
                    photoViewer16.L3 = false;
                    Bitmap bitmap2 = photoViewer16.C3;
                    if (bitmap2 != null) {
                        bitmap2.recycle();
                        photoViewer16.C3 = null;
                    }
                    photoViewer16.F3 = true;
                    try {
                    } catch (Throwable th2) {
                        Bitmap bitmap3 = photoViewer16.C3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.C3 = null;
                        }
                        org.telegram.messenger.a8.g(th2, true);
                    }
                    if (photoViewer16.E2) {
                        Drawable drawable = photoViewer16.x3.getDrawable();
                        if (drawable instanceof BitmapDrawable) {
                            Bitmap bitmap4 = ((BitmapDrawable) drawable).getBitmap();
                            photoViewer16.C3 = bitmap4;
                            if (bitmap4 != null) {
                                ImageView imageView2 = photoViewer16.x3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                                }
                                bitmap = photoViewer16.C3;
                                photoViewer16.J3 = true;
                                photoViewer16.T0();
                                wi.o g10 = photoViewer16.P8.g(photoViewer16.E, bitmap, !photoViewer16.K3);
                                photoViewer16.w3 = g10;
                                photoViewer16.K3 = true;
                                if (!photoViewer16.E2) {
                                    org.telegram.ui.Components.ie0 ie0Var = photoViewer16.z2;
                                    if (ie0Var != null) {
                                        ie0Var.removeView(photoViewer16.C2);
                                        photoViewer16.z2.removeView(photoViewer16.D2);
                                    }
                                    photoViewer16.G2.z0(null);
                                    photoViewer16.G2.A0(null);
                                    photoViewer16.G2.h0();
                                    photoViewer16.G2.A0(photoViewer16.w3);
                                    photoViewer16.q0(true);
                                    photoViewer16.w3.setVisibility(0);
                                    break;
                                } else {
                                    photoViewer16.Q8 = g10;
                                    org.telegram.ui.Components.ie0 ie0Var2 = photoViewer16.z2;
                                    if (ie0Var2 != null) {
                                        ie0Var2.removeView(photoViewer16.C2);
                                        photoViewer16.z2.removeView(photoViewer16.D2);
                                    }
                                    photoViewer16.Q8 = null;
                                    photoViewer16.F3 = false;
                                    photoViewer16.q0(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        int width = photoViewer16.C2.getWidth();
                        int height = photoViewer16.C2.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap c11 = org.telegram.messenger.xr.c(width, height);
                        photoViewer16.C3 = c11;
                        photoViewer16.C2.getBitmap(c11);
                        if (photoViewer16.C3 != null && (imageView = photoViewer16.x3) != null) {
                            imageView.setVisibility(0);
                            photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                        }
                    }
                    bitmap = null;
                    photoViewer16.J3 = true;
                    photoViewer16.T0();
                    wi.o g102 = photoViewer16.P8.g(photoViewer16.E, bitmap, !photoViewer16.K3);
                    photoViewer16.w3 = g102;
                    photoViewer16.K3 = true;
                    if (!photoViewer16.E2) {
                    }
                }
                break;
        }
    }
}
