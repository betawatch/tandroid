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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class xr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ PhotoViewer b;

    public /* synthetic */ xr0(PhotoViewer photoViewer, int i9) {
        this.a = i9;
        this.b = photoViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float f10;
        gt0 gt0Var;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b;
                if (photoViewer.h3 && photoViewer.L3 && !ApplicationLoader.mainInterfacePaused) {
                    org.telegram.ui.ActionBar.w0 w0Var = this.b.k0;
                    if (w0Var == null || !w0Var.t()) {
                        org.telegram.ui.ActionBar.w0 w0Var2 = this.b.l0;
                        if (w0Var2 == null || !w0Var2.t()) {
                            zs0 zs0Var = this.b.P1;
                            if (zs0Var == null || zs0Var.getScrollY() == 0) {
                                gd gdVar = this.b.T0;
                                if (gdVar == null || gdVar.getVisibility() != 0) {
                                    PhotoViewer photoViewer2 = PhotoViewer.W8;
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
                if (photoViewer4.B2 != null || ((gt0Var = photoViewer4.b0) != null && gt0Var.x)) {
                    if (!photoViewer4.n1) {
                        float o12 = photoViewer4.o1() / this.b.A1();
                        if (this.b.d5) {
                            f10 = 1.0f;
                        } else {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (Math.abs(elapsedRealtime - this.b.O3) >= 500) {
                                PhotoViewer photoViewer5 = this.b;
                                gt0 gt0Var2 = photoViewer5.b0;
                                if (gt0Var2 != null && gt0Var2.x) {
                                    f10 = gt0Var2.getBufferedPosition();
                                } else if (photoViewer5.M3) {
                                    FileLoader fileLoader = FileLoader.getInstance(photoViewer5.P);
                                    PhotoViewer photoViewer6 = this.b;
                                    float f11 = photoViewer6.W2;
                                    if (f11 == 0.0f) {
                                        f11 = o12;
                                    }
                                    f10 = fileLoader.getBufferedProgressFromPosition(f11, photoViewer6.Y4[0]);
                                } else {
                                    f10 = 1.0f;
                                }
                                this.b.O3 = elapsedRealtime;
                            } else {
                                f10 = -1.0f;
                            }
                        }
                        PhotoViewer photoViewer7 = this.b;
                        if (photoViewer7.w8 || photoViewer7.M7.getVisibility() != 0) {
                            PhotoViewer photoViewer8 = this.b;
                            if (photoViewer8.W2 == 0.0f) {
                                org.telegram.ui.Cells.g1 g1Var = photoViewer8.W3;
                                if (g1Var.rewindCount == 0 || (!g1Var.rewindByBackSeek && !photoViewer8.Y3.rewindByBackSeek)) {
                                    photoViewer8.m3.h(o12, false);
                                }
                            }
                            if (f10 != -1.0f) {
                                this.b.m3.f(f10);
                                org.telegram.ui.Components.pf0 pf0Var = org.telegram.ui.Components.pf0.l0;
                                if (f10 > pf0Var.W) {
                                    pf0Var.W = f10;
                                    ih.b3 b3Var = pf0Var.X;
                                    if (b3Var != null) {
                                        b3Var.invalidate();
                                    }
                                }
                            }
                        } else if (o12 >= this.b.N7.getRightProgress()) {
                            PhotoViewer photoViewer9 = this.b;
                            photoViewer9.D2 = false;
                            photoViewer9.g2();
                            this.b.m3.h(0.0f, false);
                            this.b.t2((int) (r1.N7.getLeftProgress() * this.b.A1()));
                            this.b.a0.invalidate();
                        } else {
                            float leftProgress = o12 - this.b.N7.getLeftProgress();
                            if (leftProgress < 0.0f) {
                                leftProgress = 0.0f;
                            }
                            o12 = leftProgress / (this.b.N7.getRightProgress() - this.b.N7.getLeftProgress());
                            if (o12 > 1.0f) {
                                o12 = 1.0f;
                            }
                            this.b.m3.h(o12, false);
                        }
                        this.b.n3.invalidate();
                        if (this.b.X2 != null && o12 >= 0.0f) {
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            PhotoViewer photoViewer10 = this.b;
                            if (elapsedRealtime2 - photoViewer10.Z2 >= 1000) {
                                String str = photoViewer10.X2;
                                photoViewer10.Z2 = SystemClock.elapsedRealtime();
                                MessageObject messageObject = this.b.P4;
                                if (messageObject != null) {
                                    messageObject.cachedSavedTimestamp = Float.valueOf(o12);
                                }
                                Utilities.globalQueue.postRunnable(new d0(str, o12, 4));
                            }
                        }
                        this.b.C3();
                    } else if (!photoViewer4.N7.r) {
                        float o13 = photoViewer4.o1() / this.b.A1();
                        PhotoViewer photoViewer11 = this.b;
                        if (photoViewer11.w8 || (photoViewer11.q4 == 0 && photoViewer11.M7.getVisibility() != 0)) {
                            PhotoViewer photoViewer12 = this.b;
                            if (photoViewer12.Y1 != 1) {
                                photoViewer12.N7.setProgress(o13);
                            }
                        } else if (o13 >= this.b.N7.getRightProgress()) {
                            vr0 vr0Var = this.b.N7;
                            vr0Var.setProgress(vr0Var.getLeftProgress());
                            this.b.B2.L((int) (r0.N7.getLeftProgress() * this.b.A1()));
                            PhotoViewer photoViewer13 = this.b;
                            photoViewer13.D2 = false;
                            photoViewer13.t0();
                            PhotoViewer photoViewer14 = this.b;
                            if (photoViewer14.r || photoViewer14.Y1 == 1 || photoViewer14.q4 != 0 || photoViewer14.k6 > 0) {
                                photoViewer14.i2();
                            } else {
                                photoViewer14.g2();
                            }
                            this.b.a0.invalidate();
                        } else {
                            this.b.N7.setProgress(o13);
                        }
                        this.b.C3();
                    }
                }
                st0 st0Var = this.b.A2;
                if (st0Var != null) {
                    st0.a(st0Var);
                }
                PhotoViewer photoViewer15 = this.b;
                if (photoViewer15.L3) {
                    AndroidUtilities.runOnUIThread(photoViewer15.d4, 17L);
                    break;
                }
                break;
            default:
                PhotoViewer photoViewer16 = this.b;
                if (!org.telegram.ui.Components.pf0.l0.L) {
                    photoViewer16.H3 = false;
                    Bitmap bitmap = photoViewer16.y3;
                    if (bitmap != null) {
                        bitmap.recycle();
                        photoViewer16.y3 = null;
                    }
                    photoViewer16.B3 = true;
                    Activity activity = photoViewer16.y;
                    fh.v vVar = new fh.v(activity, 26);
                    ImageReceiver imageReceiver = new ImageReceiver(vVar);
                    vVar.c = imageReceiver;
                    TextureView textureView = new TextureView(activity);
                    vVar.b = textureView;
                    vVar.addView(textureView);
                    try {
                        if (photoViewer16.z2) {
                            Drawable drawable = photoViewer16.t3.getDrawable();
                            if (drawable instanceof BitmapDrawable) {
                                Bitmap bitmap2 = ((BitmapDrawable) drawable).getBitmap();
                                photoViewer16.y3 = bitmap2;
                                if (bitmap2 != null) {
                                    ImageView imageView = photoViewer16.t3;
                                    if (imageView != null) {
                                        imageView.setVisibility(0);
                                        photoViewer16.t3.setImageBitmap(photoViewer16.y3);
                                    }
                                    imageReceiver.setImageBitmap(photoViewer16.y3);
                                }
                            } else {
                                Bitmap createBitmap = Bitmaps.createBitmap(photoViewer16.y2.getWidth(), photoViewer16.y2.getHeight(), Bitmap.Config.ARGB_8888);
                                photoViewer16.y3 = createBitmap;
                                AndroidUtilities.getBitmapFromSurface(photoViewer16.y2, createBitmap, new ys0(0, this, vVar));
                            }
                        } else {
                            Bitmap createBitmap2 = Bitmaps.createBitmap(photoViewer16.x2.getWidth(), photoViewer16.x2.getHeight(), Bitmap.Config.ARGB_8888);
                            photoViewer16.y3 = createBitmap2;
                            photoViewer16.x2.getBitmap(createBitmap2);
                            if (photoViewer16.y3 != null) {
                                ImageView imageView2 = photoViewer16.t3;
                                if (imageView2 != null) {
                                    imageView2.setVisibility(0);
                                    photoViewer16.t3.setImageBitmap(photoViewer16.y3);
                                }
                                imageReceiver.setImageBitmap(photoViewer16.y3);
                            }
                        }
                    } catch (Throwable th) {
                        Bitmap bitmap3 = photoViewer16.y3;
                        if (bitmap3 != null) {
                            bitmap3.recycle();
                            photoViewer16.y3 = null;
                        }
                        FileLog.e(th);
                    }
                    photoViewer16.F3 = true;
                    photoViewer16.s3 = (TextureView) vVar.b;
                    if (org.telegram.ui.Components.pf0.x(false, photoViewer16.y, null, vVar, photoViewer16.Q, photoViewer16.R, photoViewer16.G3)) {
                        org.telegram.ui.Components.pf0.w(photoViewer16);
                    }
                    photoViewer16.G3 = true;
                    if (!photoViewer16.z2) {
                        photoViewer16.s3.setVisibility(4);
                        ps0 ps0Var = photoViewer16.u2;
                        if (ps0Var != null) {
                            ps0Var.removeView(photoViewer16.x2);
                            photoViewer16.u2.removeView(photoViewer16.y2);
                            break;
                        }
                    } else {
                        ps0 ps0Var2 = photoViewer16.u2;
                        if (ps0Var2 != null) {
                            ps0Var2.removeView(photoViewer16.x2);
                            photoViewer16.u2.removeView(photoViewer16.y2);
                        }
                        photoViewer16.B2.V(null);
                        photoViewer16.B2.W(null);
                        photoViewer16.B2.D();
                        photoViewer16.B2.W(photoViewer16.s3);
                        photoViewer16.w0(true);
                        photoViewer16.s3.setVisibility(0);
                        break;
                    }
                } else {
                    org.telegram.ui.Components.pf0.j(false);
                    AndroidUtilities.runOnUIThread(this, 250L);
                    break;
                }
                break;
        }
    }
}
