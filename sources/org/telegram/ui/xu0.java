package org.telegram.ui;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimatedFileDrawableStream;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.WebFile;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public class xu0 {
    public float A;
    public float B;
    public ValueAnimator C;
    public MessageObject D;
    public tu0 E;
    public uu0 F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public boolean L;
    public int M;
    public int N;
    public float O;
    public float P;
    public final float[] Q;
    public boolean R;
    public ColorMatrixColorFilter S;
    public final ViewGroup a;
    public final ViewGroup b;
    public final boolean c;
    public wu0 d;
    public View e;
    public ImageReceiver f;
    public ImageReceiver g;
    public ImageReceiver h;
    public boolean i;
    public final jh.k j;
    public jh.j k;
    public final Path l;
    public final float[] m;
    public boolean n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public float v;
    public float w;
    public float x;
    public float y;
    public float z;

    public xu0(ViewGroup viewGroup, ViewGroup viewGroup2) {
        this.g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.j = new jh.k();
        this.l = new Path();
        this.m = new float[8];
        this.Q = new float[2];
        this.a = viewGroup;
        this.b = viewGroup2;
        this.c = false;
    }

    public final boolean a(MotionEvent motionEvent, ViewGroup viewGroup, ImageReceiver imageReceiver, MessageObject messageObject, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (!j(viewGroup, imageReceiver)) {
            return false;
        }
        if (motionEvent.getActionMasked() == 0 || motionEvent.getActionMasked() == 5) {
            if (!this.L && motionEvent.getPointerCount() == 2) {
                this.I = (float) Math.hypot(motionEvent.getX(1) - motionEvent.getX(0), motionEvent.getY(1) - motionEvent.getY(0));
                float x10 = (motionEvent.getX(1) + motionEvent.getX(0)) / 2.0f;
                this.s = x10;
                this.G = x10;
                float y10 = (motionEvent.getY(1) + motionEvent.getY(0)) / 2.0f;
                this.t = y10;
                this.H = y10;
                this.O = 1.0f;
                this.M = motionEvent.getPointerId(0);
                this.N = motionEvent.getPointerId(1);
                this.L = true;
            }
        } else if (motionEvent.getActionMasked() == 2 && this.L) {
            int i15 = -1;
            int i16 = -1;
            for (int i17 = 0; i17 < motionEvent.getPointerCount(); i17++) {
                if (this.M == motionEvent.getPointerId(i17)) {
                    i15 = i17;
                }
                if (this.N == motionEvent.getPointerId(i17)) {
                    i16 = i17;
                }
            }
            if (i15 == -1 || i16 == -1) {
                this.L = false;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
                d();
                return false;
            }
            float hypot = ((float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15))) / this.I;
            this.O = hypot;
            if (hypot <= 1.005f || this.n) {
                i11 = i16;
                i12 = i15;
            } else {
                this.I = (float) Math.hypot(motionEvent.getX(i16) - motionEvent.getX(i15), motionEvent.getY(i16) - motionEvent.getY(i15));
                float x11 = (motionEvent.getX(i16) + motionEvent.getX(i15)) / 2.0f;
                this.s = x11;
                this.G = x11;
                float y11 = (motionEvent.getY(i16) + motionEvent.getY(i15)) / 2.0f;
                this.t = y11;
                this.H = y11;
                this.O = 1.0f;
                this.J = 0.0f;
                this.K = 0.0f;
                viewGroup.getParent().requestDisallowInterceptTouchEvent(true);
                this.e = viewGroup;
                this.D = messageObject;
                wu0 wu0Var = this.d;
                ViewGroup viewGroup2 = this.a;
                boolean z4 = this.c;
                if (wu0Var != null || z4) {
                    i13 = -1;
                } else {
                    i13 = -1;
                    wu0 wu0Var2 = new wu0(this, viewGroup2.getContext());
                    this.d = wu0Var2;
                    wu0Var2.setFocusable(false);
                    this.d.setFocusableInTouchMode(false);
                    this.d.setEnabled(false);
                }
                if (this.g == null) {
                    ImageReceiver imageReceiver2 = new ImageReceiver();
                    this.g = imageReceiver2;
                    imageReceiver2.setCrossfadeAlpha((byte) 2);
                    this.g.setCrossfadeWithOldImage(false);
                    this.g.onAttachedToWindow();
                    ImageReceiver imageReceiver3 = new ImageReceiver();
                    this.h = imageReceiver3;
                    imageReceiver3.setCrossfadeAlpha((byte) 2);
                    this.h.setCrossfadeWithOldImage(false);
                    this.h.onAttachedToWindow();
                }
                this.n = true;
                this.A = 1.0f;
                this.B = 0.0f;
                if (z4) {
                    i14 = i15;
                    i11 = i16;
                } else {
                    viewGroup2.addView(this.d);
                    boolean z10 = (messageObject == null || !messageObject.hasMediaSpoilers() || messageObject.isMediaSpoilersRevealed) ? false : true;
                    this.i = z10;
                    if (z10 && this.k == null) {
                        jh.j e6 = jh.j.e(this.d);
                        this.k = e6;
                        if (e6 != null) {
                            e6.k.put(this.d, Integer.valueOf(i10));
                        }
                    }
                    ImageLocation imageLocation = null;
                    if (this.h.getBitmap() != null) {
                        this.h.getBitmap().recycle();
                        this.h.setImageBitmap((Bitmap) null);
                    }
                    if (imageReceiver.getBitmap() == null || imageReceiver.getBitmap().isRecycled() || !this.i) {
                        this.h.setColorFilter(null);
                    } else {
                        this.h.setImageBitmap(Utilities.stackBlurBitmapMax(imageReceiver.getBitmap()));
                        ImageReceiver imageReceiver4 = this.h;
                        if (this.S == null) {
                            ColorMatrix colorMatrix = new ColorMatrix();
                            AndroidUtilities.multiplyBrightnessColorMatrix(colorMatrix, 0.9f);
                            AndroidUtilities.adjustSaturationColorMatrix(colorMatrix, 0.6f);
                            this.S = new ColorMatrixColorFilter(colorMatrix);
                        }
                        imageReceiver4.setColorFilter(this.S);
                    }
                    if (messageObject != null && messageObject.isPhoto()) {
                        int[] iArr = new int[1];
                        TLRPC.Message message = messageObject.messageOwner;
                        if (!(message instanceof TLRPC.TL_messageService)) {
                            TLRPC.MessageMedia messageMedia = message.media;
                            if ((!(messageMedia instanceof TLRPC.TL_messageMediaPhoto) || messageMedia.photo == null) && (!(messageMedia instanceof TLRPC.TL_messageMediaWebPage) || messageMedia.webpage == null)) {
                                if (messageMedia instanceof TLRPC.TL_messageMediaInvoice) {
                                    imageLocation = ImageLocation.getForWebFile(WebFile.createWithWebDocument(((TLRPC.TL_messageMediaInvoice) messageMedia).webPhoto));
                                } else if (messageObject.getDocument() != null) {
                                    TLRPC.Document document = messageObject.getDocument();
                                    if (MessageObject.isDocumentHasThumb(messageObject.getDocument())) {
                                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, 90);
                                        int i18 = closestPhotoSizeWithSize.size;
                                        iArr[0] = i18;
                                        if (i18 == 0) {
                                            iArr[0] = i13;
                                        }
                                        imageLocation = ImageLocation.getForDocument(closestPhotoSizeWithSize, document);
                                    }
                                }
                            } else if (messageObject.isGif()) {
                                imageLocation = ImageLocation.getForDocument(messageObject.getDocument());
                            } else {
                                TLRPC.PhotoSize closestPhotoSizeWithSize2 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize(), false, null, true);
                                if (closestPhotoSizeWithSize2 != null) {
                                    int i19 = closestPhotoSizeWithSize2.size;
                                    iArr[0] = i19;
                                    if (i19 == 0) {
                                        iArr[0] = i13;
                                    }
                                    imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize2, messageObject.photoThumbsObject);
                                } else {
                                    iArr[0] = i13;
                                }
                            }
                        } else if (!(message.action instanceof TLRPC.TL_messageActionUserUpdatedPhoto)) {
                            TLRPC.PhotoSize closestPhotoSizeWithSize3 = FileLoader.getClosestPhotoSizeWithSize(messageObject.photoThumbs, AndroidUtilities.getPhotoSize());
                            if (closestPhotoSizeWithSize3 != null) {
                                int i20 = closestPhotoSizeWithSize3.size;
                                iArr[0] = i20;
                                if (i20 == 0) {
                                    iArr[0] = i13;
                                }
                                imageLocation = ImageLocation.getForObject(closestPhotoSizeWithSize3, messageObject.photoThumbsObject);
                            } else {
                                iArr[0] = i13;
                            }
                        }
                        if (imageLocation != null) {
                            i11 = i16;
                            i14 = i15;
                            this.g.setImage(imageLocation, null, null, null, null, iArr[0], null, messageObject, messageObject.isWebpage() ? 1 : 0);
                            this.g.setCrossfadeAlpha((byte) 2);
                        } else {
                            i14 = i15;
                            i11 = i16;
                        }
                        i();
                    } else {
                        i14 = i15;
                        i11 = i16;
                    }
                    this.u = imageReceiver.getImageX();
                    this.v = imageReceiver.getImageY() + viewGroup.getPaddingTop();
                    this.w = imageReceiver.getImageHeight();
                    this.x = imageReceiver.getImageWidth();
                    this.y = imageReceiver.getBitmapHeight();
                    float bitmapWidth = imageReceiver.getBitmapWidth();
                    this.z = bitmapWidth;
                    float f10 = this.y;
                    float f11 = f10 / bitmapWidth;
                    float f12 = this.w;
                    float f13 = this.x;
                    float f14 = f12 / f13;
                    if (f11 == f14) {
                        this.y = f12;
                        this.z = f13;
                    } else if (f11 < f14) {
                        this.z = (bitmapWidth / f10) * f12;
                        this.y = f12;
                    } else {
                        this.y = f11 * f13;
                        this.z = f13;
                    }
                    if (messageObject != null && messageObject.isVideo() && MediaController.getInstance().isPlayingMessage(messageObject)) {
                        this.R = true;
                        MediaController mediaController = MediaController.getInstance();
                        wu0 wu0Var3 = this.d;
                        mediaController.setTextureView(wu0Var3.b, wu0Var3.c, wu0Var3.a, true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.d.a.getLayoutParams();
                        this.d.a.setTag(R.id.parent_tag, imageReceiver);
                        if (layoutParams.width != imageReceiver.getImageWidth() || layoutParams.height != imageReceiver.getImageHeight()) {
                            this.d.c.setResizeMode(3);
                            layoutParams.width = (int) imageReceiver.getImageWidth();
                            layoutParams.height = (int) imageReceiver.getImageHeight();
                            this.d.a.setLayoutParams(layoutParams);
                        }
                        this.d.b.setScaleX(1.0f);
                        this.d.b.setScaleY(1.0f);
                        tu0 tu0Var = this.E;
                        if (tu0Var != null) {
                            this.d.d.setImageBitmap(tu0Var.h0().getBitmap((int) this.z, (int) this.y));
                            this.d.d.s((int) this.z, (int) this.y);
                            this.d.d.getImageReceiver().setRoundRadius(imageReceiver.getRoundRadius(true));
                        }
                        this.d.a.setVisibility(0);
                    } else {
                        this.R = false;
                        ImageReceiver imageReceiver5 = new ImageReceiver();
                        this.f = imageReceiver5;
                        imageReceiver5.onAttachedToWindow();
                        Drawable drawable = imageReceiver.getDrawable();
                        this.f.setImageBitmap(drawable);
                        if (drawable instanceof org.telegram.ui.Components.y5) {
                            org.telegram.ui.Components.y5 y5Var = (org.telegram.ui.Components.y5) drawable;
                            y5Var.f(this.d);
                            y5Var.O = true;
                        }
                        this.f.setImageCoords(this.u, this.v, this.x, this.w);
                        this.f.setAspectFit(imageReceiver.isAspectFit());
                        this.f.setRoundRadius(imageReceiver.getRoundRadius(true));
                        this.g.setRoundRadius(imageReceiver.getRoundRadius(true));
                        this.g.setAspectFit(imageReceiver.isAspectFit());
                        this.d.a.setVisibility(8);
                    }
                }
                tu0 tu0Var2 = this.E;
                if (tu0Var2 != null) {
                    tu0Var2.y0(messageObject);
                }
                this.P = 0.0f;
                i12 = i14;
            }
            int i21 = i11;
            float x12 = (motionEvent.getX(i21) + motionEvent.getX(i12)) / 2.0f;
            float y12 = (motionEvent.getY(i21) + motionEvent.getY(i12)) / 2.0f;
            float f15 = this.G - x12;
            float f16 = this.H - y12;
            float f17 = -f15;
            float f18 = this.O;
            this.J = f17 / f18;
            this.K = (-f16) / f18;
            e();
        } else if ((motionEvent.getActionMasked() == 1 || ((motionEvent.getActionMasked() == 6 && motionEvent.getPointerCount() >= 2 && ((this.M == motionEvent.getPointerId(0) && this.N == motionEvent.getPointerId(1)) || (this.M == motionEvent.getPointerId(1) && this.N == motionEvent.getPointerId(0)))) || motionEvent.getActionMasked() == 3)) && this.L) {
            this.L = false;
            if (viewGroup != null && viewGroup.getParent() != null) {
                viewGroup.getParent().requestDisallowInterceptTouchEvent(false);
            }
            d();
        }
        return f(viewGroup);
    }

    public final void b() {
        if (this.n) {
            tu0 tu0Var = this.E;
            if (tu0Var != null) {
                tu0Var.G(this.D);
            }
            this.n = false;
        }
        wu0 wu0Var = this.d;
        if (wu0Var != null && wu0Var.getParent() != null) {
            this.a.removeView(this.d);
            this.d.d.getImageReceiver().clearImage();
            jh.j jVar = this.k;
            if (jVar != null) {
                jVar.b(this.d);
                this.k = null;
            }
            ImageReceiver imageReceiver = this.f;
            if (imageReceiver != null) {
                Drawable drawable = imageReceiver.getDrawable();
                if (drawable instanceof org.telegram.ui.Components.y5) {
                    ((org.telegram.ui.Components.y5) drawable).w(this.d);
                }
            }
        }
        View view = this.e;
        if (view != null) {
            view.invalidate();
            this.e = null;
        }
        ImageReceiver imageReceiver2 = this.f;
        if (imageReceiver2 != null) {
            imageReceiver2.onDetachedFromWindow();
            this.f.clearImage();
            this.f = null;
        }
        ImageReceiver imageReceiver3 = this.g;
        if (imageReceiver3 != null) {
            imageReceiver3.onDetachedFromWindow();
            this.g.clearImage();
            this.g = null;
        }
        ImageReceiver imageReceiver4 = this.h;
        if (imageReceiver4 != null) {
            imageReceiver4.onDetachedFromWindow();
            this.h.clearImage();
            this.h = null;
        }
        this.D = null;
    }

    public final void d() {
        if (this.C == null && this.n) {
            if (!this.c && !i()) {
                b();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.C = ofFloat;
            ofFloat.addUpdateListener(new e3(this, 25));
            this.C.addListener(new ns0(this, 9));
            this.C.setDuration(220L);
            this.C.setInterpolator(org.telegram.ui.Components.pr.f);
            this.C.start();
        }
    }

    public void e() {
        View view;
        if (this.c && (view = this.e) != null) {
            view.invalidate();
        }
        wu0 wu0Var = this.d;
        if (wu0Var != null) {
            wu0Var.invalidate();
        }
    }

    public final boolean f(View view) {
        return this.n && view == this.e;
    }

    public final boolean g(MotionEvent motionEvent) {
        if (!i() || this.e == null) {
            return false;
        }
        motionEvent.offsetLocation(-this.q, -this.r);
        return this.e.onTouchEvent(motionEvent);
    }

    public final void h(te teVar) {
        this.F = teVar;
    }

    public final boolean i() {
        float f10 = 0.0f;
        float f11 = 0.0f;
        float f12 = 0.0f;
        for (View view = this.e; view != this.a; view = (View) view.getParent()) {
            if (view == null) {
                return false;
            }
            f11 += view.getLeft();
            f12 += view.getTop();
            if (!(view.getParent() instanceof View)) {
                break;
            }
        }
        float f13 = 0.0f;
        for (View view2 = this.e; view2 != this.b; view2 = (View) view2.getParent()) {
            if (view2 == null) {
                return false;
            }
            f10 += view2.getLeft();
            f13 += view2.getTop();
        }
        this.q = f10;
        this.r = f13;
        this.o = f11;
        this.p = f12;
        return true;
    }

    public boolean j(View view, ImageReceiver imageReceiver) {
        if (this.c) {
            return true;
        }
        if (!(imageReceiver.getDrawable() instanceof org.telegram.ui.Components.y5)) {
            return imageReceiver.hasNotThumbOrOnlyStaticThumb();
        }
        AnimatedFileDrawableStream animatedFileDrawableStream = ((org.telegram.ui.Components.y5) imageReceiver.getDrawable()).r0;
        return animatedFileDrawableStream == null || !animatedFileDrawableStream.isWaitingForLoad();
    }

    public xu0() {
        this.g = new ImageReceiver();
        this.h = new ImageReceiver();
        this.j = new jh.k();
        this.l = new Path();
        this.m = new float[8];
        this.Q = new float[2];
        this.a = null;
        this.b = null;
        this.c = true;
    }

    public void c(Canvas canvas, float f10, float f11, float f12, float f13, float f14) {
    }
}
