package org.telegram.ui;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.TextureView;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Bitmaps;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class zs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ zs0(PhotoViewer photoViewer, int i10) {
        this.a = i10;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f7;
        hu0 hu0Var;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.l3 && photoViewer.P3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.b.o0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.p0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            au0 au0Var = this.b.T1;
                            if (au0Var == null || au0Var.getScrollY() == 0) {
                                ld ldVar = this.b.X0;
                                if (ldVar == null || ldVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.a9;
                                    PhotoViewer photoViewer3 = this.b;
                                    if (photoViewer2 != photoViewer3) {
                                        photoViewer3.j3(false, true);
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
                if (photoViewer4.F2 != null || ((hu0Var = photoViewer4.f0) != null && hu0Var.x)) {
                    if (!photoViewer4.r1) {
                        float o12 = photoViewer4.o1() / this.b.A1();
                        if (this.b.h5) {
                            f7 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.S3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                hu0 hu0Var2 = photoViewer5.f0;
                                if (hu0Var2 != null && hu0Var2.x) {
                                    f7 = hu0Var2.getBufferedPosition();
                                } else if (photoViewer5.Q3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer5.T);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f10 = photoViewer6.a3;
                                    if (f10 == 0.0f) {
                                        f10 = o12;
                                    }
                                    f7 = fileLoader.getBufferedProgressFromPosition(f10, photoViewer6.c5[0]);
                                } else {
                                    f7 = 1.0f;
                                }
                                this.b.S3 = elapsedRealtime;
                            } else {
                                f7 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.A8 || photoViewer7.Q7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.a3 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer8.a4;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer8.c4.rewindByBackSeek)) {
                                    photoViewer8.q3.h(o12, false);
                                }
                            }
                            if (f7 != -1.0f) {
                                this.b.q3.f(f7);
                                org.telegram.ui.Components.og0 og0Var = org.telegram.ui.Components.og0.p0;
                                if (f7 > og0Var.a0) {
                                    og0Var.a0 = f7;
                                    u7 u7Var = og0Var.b0;
                                    if (u7Var != null) {
                                        u7Var.invalidate();
                                    }
                                }
                            }
                        } else if (o12 >= this.b.R7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.H2 = false;
                            photoViewer9.g2();
                            this.b.q3.h(0.0f, false);
                            this.b.t2((int) (r1.R7.getLeftProgress() * this.b.A1()));
                            this.b.e0.invalidate();
                        } else {
                            float leftProgress = o12 - this.b.R7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            o12 = leftProgress / (this.b.R7.getRightProgress() - this.b.R7.getLeftProgress());
                            if (o12 > 1.0f) {
                                o12 = 1.0f;
                            }
                            this.b.q3.h(o12, false);
                        }
                        this.b.r3.invalidate();
                        if (this.b.b3 != null && o12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.d3 >= 1000) {
                                String str = photoViewer10.b3;
                                photoViewer10.d3 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.b.T4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o12);
                                }
                                Utilities.globalQueue.postRunnable(new c0(str, o12, 4));
                            }
                        }
                        this.b.C3();
                    } else if (!photoViewer4.R7.r) {
                        float o13 = photoViewer4.o1() / this.b.A1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.A8 || (photoViewer11.u4 == 0 && photoViewer11.Q7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.c2 != 1) {
                                photoViewer12.R7.setProgress(o13);
                            }
                        } else if (o13 >= this.b.R7.getRightProgress()) {
                            xs0 xs0Var = this.b.R7;
                            xs0Var.setProgress(xs0Var.getLeftProgress());
                            this.b.F2.K((int) (r0.R7.getLeftProgress() * this.b.A1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.H2 = false;
                            photoViewer13.u0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.c2 == 1 || photoViewer14.u4 != 0 || photoViewer14.o6 > 0) {
                                photoViewer14.i2();
                            } else {
                                photoViewer14.g2();
                            }
                            this.b.e0.invalidate();
                        } else {
                            this.b.R7.setProgress(o13);
                        }
                        this.b.C3();
                    }
                }
                vu0 vu0Var = this.b.E2;
                if (vu0Var != null) {
                    vu0.a(vu0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.P3) {
                    AndroidUtilities.runOnUIThread(photoViewer15.h4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                if (!org.telegram.ui.Components.og0.p0.P) {
                    photoViewer16.L3 = false;
                    Bitmap bitmap = photoViewer16.C3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer16.C3 = null;
                    }
                    photoViewer16.F3 = true;
                    Activity activity = photoViewer16.y;
                    bi.n7 n7Var = new bi.n7(activity, 24);
                    ImageReceiver imageReceiver = new ImageReceiver(n7Var);
                    n7Var.b = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    n7Var.c = textureView;
                    n7Var.addView(textureView);
                    try {
                        if (photoViewer16.D2) {
                            Drawable drawable = photoViewer16.x3.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                                photoViewer16.C3 = bitmap2;
                                if (bitmap2 != null) {
                                    ImageView imageView = photoViewer16.x3;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                        photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                                    }
                                    imageReceiver.setImageBitmap(photoViewer16.C3);
                                }
                            } else {
                                Bitmap createBitmap = Bitmaps.createBitmap(photoViewer16.C2.getWidth(), photoViewer16.C2.getHeight(), Bitmap.Config.ARGB_8888);
                                photoViewer16.C3 = createBitmap;
                                AndroidUtilities.getBitmapFromSurface(photoViewer16.C2, createBitmap, new ak0(21, this, n7Var));
                            }
                        } else {
                            Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer16.B2.getWidth(), photoViewer16.B2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer16.C3 = createBitmap2;
                            photoViewer16.B2.getBitmap(createBitmap2);
                            if (photoViewer16.C3 != null) {
                                ImageView imageView2 = photoViewer16.x3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.x3.setImageBitmap(photoViewer16.C3);
                                }
                                imageReceiver.setImageBitmap(photoViewer16.C3);
                            }
                        }
                    } catch (Throwable th2) {
                        Bitmap bitmap3 = photoViewer16.C3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.C3 = null;
                        }
                        FileLog.e(th2);
                    }
                    photoViewer16.J3 = true;
                    photoViewer16.w3 = (TextureView) n7Var.c;
                    if (org.telegram.ui.Components.og0.x(false, photoViewer16.y, null, n7Var, photoViewer16.U, photoViewer16.V, photoViewer16.K3)) {
                        org.telegram.ui.Components.og0.w(photoViewer16);
                    }
                    photoViewer16.K3 = true;
                    if (!photoViewer16.D2) {
                        photoViewer16.w3.setVisibility(4);
                        rt0 rt0Var = photoViewer16.y2;
                        if (rt0Var != null) {
                            rt0Var.removeView(photoViewer16.B2);
                            photoViewer16.y2.removeView(photoViewer16.C2);
                            break;
                        }
                    } else {
                        rt0 rt0Var2 = photoViewer16.y2;
                        if (rt0Var2 != null) {
                            rt0Var2.removeView(photoViewer16.B2);
                            photoViewer16.y2.removeView(photoViewer16.C2);
                        }
                        photoViewer16.F2.U(null);
                        photoViewer16.F2.V(null);
                        photoViewer16.F2.C();
                        photoViewer16.F2.V(photoViewer16.w3);
                        photoViewer16.x0(true);
                        photoViewer16.w3.setVisibility(0);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.og0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    break;
                }
                break;
        }
    }
}
