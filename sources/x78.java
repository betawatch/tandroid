// default package

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.widget.ImageView;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class x78 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ x78(PhotoViewer photoViewer, byte b) {
        this.a = b;
        this.b = photoViewer;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        float f;
        x88 x88Var;
        Bitmap bitmap;
        ImageView imageView;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.l3 && photoViewer.P3 && !a.x) {
                    r7 r7Var = this.b.p0;
                    if (r7Var == null || !r7Var.y()) {
                        r7 r7Var2 = this.b.q0;
                        if (r7Var2 == null || !r7Var2.y()) {
                            r88 r88Var = this.b.U1;
                            if (r88Var == null || r88Var.getScrollY() == 0) {
                                wh1 wh1Var = this.b.Y0;
                                if (wh1Var == null || wh1Var.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.m9;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.s2(false, true);
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
                if (photoViewer4.G2 != null || ((x88Var = photoViewer4.g0) != null && x88Var.y)) {
                    if (!photoViewer4.s1) {
                        float m0 = photoViewer4.m0() / this.b.z0();
                        if (this.b.h5) {
                            f = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                x88 x88Var2 = photoViewer5.g0;
                                if (x88Var2 != null && x88Var2.y) {
                                    f = x88Var2.getBufferedPosition();
                                } else if (photoViewer5.Q3) {
                                    ba4 G = ba4.G(photoViewer5.U);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f2 = photoViewer6.a3;
                                    if (f2 == 0.0f) {
                                        f2 = m0;
                                    }
                                    f = G.t(photoViewer6.c5[0], f2);
                                } else {
                                    f = 1.0f;
                                }
                                this.b.S3 = elapsedRealtime;
                            } else {
                                f = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.H8 || photoViewer7.X7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.a3 == 0.0f) {
                                ya2 ya2Var = photoViewer8.a4;
                                if (ya2Var.rewindCount == 0 || (!ya2Var.rewindByBackSeek && !photoViewer8.c4.rewindByBackSeek)) {
                                    photoViewer8.q3.h(false, m0);
                                }
                            }
                            if (f != -1.0f) {
                                this.b.q3.f(f);
                                this.b.X8 = f;
                            }
                        } else {
                            float rightProgress = this.b.Y7.getRightProgress();
                            PhotoViewer photoViewer9 = this.b;
                            if (m0 >= rightProgress) {
                                photoViewer9.H2 = false;
                                photoViewer9.o1();
                                this.b.q3.h(false, 0.0f);
                                this.b.B1((int) (r1.Y7.getLeftProgress() * this.b.z0()));
                                this.b.f0.invalidate();
                            } else {
                                float leftProgress = m0 - photoViewer9.Y7.getLeftProgress();
                                if (leftProgress < 0.0f) {
                                    leftProgress = 0.0f;
                                }
                                m0 = leftProgress / (this.b.Y7.getRightProgress() - this.b.Y7.getLeftProgress());
                                if (m0 > 1.0f) {
                                    m0 = 1.0f;
                                }
                                this.b.q3.h(false, m0);
                            }
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && m0 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.d3 >= 1000) {
                                String str = photoViewer10.b3;
                                photoViewer10.d3 = SystemClock.elapsedRealtime();
                                k27 k27Var = this.b.T4;
                                if (k27Var != null) {
                                    k27Var.l3 = Float.valueOf(m0);
                                }
                                Utilities.e.c(new ul6(str, m0, (byte) 1));
                            }
                        }
                        this.b.P2();
                    } else if (!photoViewer4.Y7.r) {
                        float m02 = photoViewer4.m0() / this.b.z0();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.H8 || (photoViewer11.u4 == 0 && photoViewer11.X7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.d2 != 1) {
                                photoViewer12.Y7.setProgress(m02);
                            }
                        } else {
                            float rightProgress2 = this.b.Y7.getRightProgress();
                            v78 v78Var = this.b.Y7;
                            if (m02 >= rightProgress2) {
                                v78Var.setProgress(v78Var.getLeftProgress());
                                this.b.G2.o0((int) (r0.Y7.getLeftProgress() * this.b.z0()));
                                PhotoViewer photoViewer13 = this.b;
                                photoViewer13.H2 = false;
                                photoViewer13.n();
                                PhotoViewer photoViewer14 = this.b;
                                if (photoViewer14.r || photoViewer14.d2 == 1 || photoViewer14.u4 != 0 || photoViewer14.o6 > 0) {
                                    photoViewer14.q1();
                                } else {
                                    photoViewer14.o1();
                                }
                                this.b.f0.invalidate();
                            } else {
                                v78Var.setProgress(m02);
                            }
                        }
                        this.b.P2();
                    }
                }
                j98 j98Var = this.b.F2;
                if (j98Var != null) {
                    int i = j98.r;
                    j98Var.a();
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.P3) {
                    gl.e3(photoViewer15.h4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                xa8 a = mb3.c().a();
                if (a != null && a != photoViewer16.V8) {
                    a.b();
                    gl.e3(this, 250L);
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
                    } catch (Throwable th) {
                        Bitmap bitmap3 = photoViewer16.C3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.C3 = null;
                        }
                        fa4.g(th, true);
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
                                photoViewer16.W();
                                ya8 g = photoViewer16.V8.g(photoViewer16.E, bitmap, !photoViewer16.K3);
                                photoViewer16.w3 = g;
                                photoViewer16.K3 = true;
                                if (!photoViewer16.E2) {
                                    m88 m88Var = photoViewer16.z2;
                                    if (m88Var != null) {
                                        m88Var.removeView(photoViewer16.C2);
                                        photoViewer16.z2.removeView(photoViewer16.D2);
                                    }
                                    photoViewer16.G2.y0(null);
                                    photoViewer16.G2.z0(null);
                                    photoViewer16.G2.g0();
                                    photoViewer16.G2.z0(photoViewer16.w3);
                                    photoViewer16.s(true);
                                    photoViewer16.w3.setVisibility(0);
                                    break;
                                } else {
                                    photoViewer16.W8 = g;
                                    m88 m88Var2 = photoViewer16.z2;
                                    if (m88Var2 != null) {
                                        m88Var2.removeView(photoViewer16.C2);
                                        photoViewer16.z2.removeView(photoViewer16.D2);
                                    }
                                    photoViewer16.W8 = null;
                                    photoViewer16.F3 = false;
                                    photoViewer16.s(true);
                                    break;
                                }
                            }
                        }
                    } else {
                        int width = photoViewer16.C2.getWidth();
                        int height = photoViewer16.C2.getHeight();
                        Bitmap.Config config = Bitmap.Config.ARGB_8888;
                        Bitmap a2 = dc1.a(width, height);
                        photoViewer16.C3 = a2;
                        photoViewer16.C2.getBitmap(a2);
                        if (photoViewer16.C3 != null && (imageView = photoViewer16.x3) != null) {
                            imageView.setVisibility(0);
                            photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                        }
                    }
                    bitmap = null;
                    photoViewer16.J3 = true;
                    photoViewer16.W();
                    ya8 g2 = photoViewer16.V8.g(photoViewer16.E, bitmap, !photoViewer16.K3);
                    photoViewer16.w3 = g2;
                    photoViewer16.K3 = true;
                    if (!photoViewer16.E2) {
                    }
                }
                break;
        }
    }
}
