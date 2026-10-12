package org.telegram.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageLoader;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.RadialProgress2;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class z2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.n9 {
    public static final /* synthetic */ int V = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockVideo L;
    public a3 M;
    public TL_iv.PageBlock N;
    public TLRPC.Document O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public MessageObject.GroupedMessagePosition T;
    public boolean U;
    public final z70 a;
    public final i4 b;
    public d3 c;
    public d3 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final n4 h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final f1 s;
    public final int v;
    public boolean w;
    public int x;
    public int y;

    public z2(Context context, z70 z70Var, i4 i4Var, int i10) {
        super(context);
        this.a = z70Var;
        this.b = i4Var;
        setWillNotDraw(false);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.e = imageReceiver;
        imageReceiver.setNeedsQualityThumb(true);
        imageReceiver.setShouldGenerateQualityThumb(true);
        this.v = i10;
        RadialProgress2 radialProgress2 = new RadialProgress2(this, null);
        this.r = radialProgress2;
        radialProgress2.d = -1;
        radialProgress2.setColors(1711276032, 2130706432, -1, -2500135);
        this.K = DownloadController.getInstance(((k4) z70Var).X).generateObserverTag();
        f1 f1Var = new f1(context, z70Var, i4Var, 1);
        this.s = f1Var;
        n4 n4Var = new n4(context);
        this.h = n4Var;
        n4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        n4Var.addView(textureView, w7.a6.e(-1, -2, 1));
        frameLayout.addView(n4Var, w7.a6.e(-1, -1, 17));
        addView(frameLayout, w7.a6.d(-2.0f, -1));
        addView(f1Var, w7.a6.d(-2.0f, -1));
    }

    private int getIconForCurrentState() {
        int i10 = this.I;
        if (i10 == 0) {
            return 2;
        }
        if (i10 == 1) {
            return 3;
        }
        if (i10 == 2) {
            return 8;
        }
        return i10 == 3 ? 0 : 4;
    }

    public final void a() {
        int i10 = ((k4) this.a).X;
        int i11 = this.I;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i11 == 0) {
            this.S = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.P;
            i4 i4Var = this.b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.O), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.O.thumbs, 40), this.O), "80_80_b", this.O.size, null, i4Var.E, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.O, i4Var.E, 1, 1);
            }
            this.I = 1;
            radialProgress2.setIcon(getIconForCurrentState(), true, true);
            invalidate();
            return;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                imageReceiver.setAllowStartAnimation(true);
                imageReceiver.startAnimation();
                this.I = -1;
                radialProgress2.setIcon(getIconForCurrentState(), false, true);
                return;
            }
            return;
        }
        this.S = true;
        if (this.P) {
            imageReceiver.cancelLoadImage();
        } else {
            FileLoader.getInstance(i10).cancelLoadFile(this.O);
        }
        this.I = 0;
        radialProgress2.setIcon(getIconForCurrentState(), false, true);
        invalidate();
    }

    public final void b(TL_iv.pageBlockVideo pageblockvideo, a3 a3Var, boolean z10, boolean z11) {
        z70 z70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (z70Var = this.a).w) != null && z70Var.x == this) {
            a0.h hVar = z70Var.y;
            long j10 = pageblockvideo2.video_id;
            a3 a2 = a3.a(videoPlayerHolderBase, this);
            this.M = a2;
            hVar.k(a2, j10);
        }
        this.L = pageblockvideo;
        this.M = a3Var;
        this.N = null;
        this.Q = z10;
        i4 i4Var = this.b;
        if (i4Var != null) {
            this.O = h4.a(i4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        this.P = MessageObject.isVideoDocument(this.O) || MessageObject.isGifDocument(this.O);
        this.w = z11;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(a3 a3Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        a3 a3Var2 = this.M;
        if (a3Var2 != null && (bitmap2 = a3Var.b) != null && (bitmap3 = a3Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.b = null;
        }
        a3 a3Var3 = this.M;
        if (a3Var3 != null && a3Var.b == null && (bitmap = a3Var3.b) != null) {
            a3Var.a = a3Var3.a;
            a3Var.b = bitmap;
        }
        this.M = a3Var;
    }

    public final void d() {
        VideoPlayerHolderBase videoPlayerHolderBase;
        int visibility = getVisibility();
        ImageReceiver imageReceiver = this.e;
        if (visibility == 0 && isAttachedToWindow()) {
            if (this.U) {
                return;
            }
            this.U = true;
            imageReceiver.onAttachedToWindow();
            e(false);
            return;
        }
        if (this.U) {
            this.U = false;
            TL_iv.pageBlockVideo pageblockvideo = this.L;
            z70 z70Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = z70Var.w) != null && z70Var.x == this) {
                a0.h hVar = z70Var.y;
                long j10 = pageblockvideo.video_id;
                a3 a2 = a3.a(videoPlayerHolderBase, this);
                c(a2);
                hVar.k(a2, j10);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((k4) z70Var).X).removeLoadingFileObserver(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return super.drawChild(canvas, view, j10);
    }

    public final void e(boolean z10) {
        int i10 = ((k4) this.a).X;
        String attachFileName = FileLoader.getAttachFileName(this.O);
        boolean z11 = true;
        boolean z12 = FileLoader.getInstance(i10).getPathToAttach(this.O).exists() || FileLoader.getInstance(i10).getPathToAttach(this.O, true).exists();
        boolean isEmpty = TextUtils.isEmpty(attachFileName);
        RadialProgress2 radialProgress2 = this.r;
        if (isEmpty) {
            radialProgress2.setIcon(4, false, false);
            return;
        }
        if (z12) {
            DownloadController.getInstance(i10).removeLoadingFileObserver(this);
            if (this.P) {
                this.I = -1;
            } else {
                this.I = 3;
            }
            radialProgress2.setIcon(getIconForCurrentState(), false, z10);
        } else {
            DownloadController.getInstance(i10).addLoadingFileObserver(attachFileName, null, this);
            a3 a3Var = this.M;
            float f7 = 0.0f;
            if (a3Var == null || a3Var.b == null) {
                if (FileLoader.getInstance(i10).isLoadingFile(attachFileName)) {
                    this.I = 1;
                    Float fileProgress = ImageLoader.getInstance().getFileProgress(attachFileName);
                    if (fileProgress != null) {
                        f7 = fileProgress.floatValue();
                    }
                } else if (!this.S && this.R && this.P) {
                    this.I = 1;
                } else {
                    this.I = 0;
                }
                radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
                radialProgress2.o(f7, false);
            } else {
                this.I = -1;
            }
            z11 = false;
            radialProgress2.setIcon(getIconForCurrentState(), z11, z10);
            radialProgress2.o(f7, false);
        }
        invalidate();
    }

    @Override // org.telegram.ui.Cells.n9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        d3 d3Var = this.c;
        if (d3Var != null) {
            arrayList.add(d3Var);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            arrayList.add(d3Var2);
        }
    }

    public View getChannelCell() {
        return this.s;
    }

    public TL_iv.pageBlockVideo getCurrentBlock() {
        return this.L;
    }

    public ImageReceiver getImageView() {
        return this.e;
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public int getObserverTag() {
        return this.K;
    }

    public TextureView getTextureView() {
        return this.n;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.attach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        d3 d3Var = this.c;
        if (d3Var != null) {
            d3Var.detach(this);
        }
        d3 d3Var2 = this.d;
        if (d3Var2 != null) {
            d3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.L == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
            canvas.drawRect(imageReceiver.getDrawRegion(), k4.o1);
        }
        imageReceiver.draw(canvas);
        d3 d3Var = this.c;
        z70 z70Var = this.a;
        int i10 = 0;
        if (d3Var != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            k4.v(z70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.x, this.y + this.E);
            k4.v(z70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        k4.u(canvas, z70Var, this.L, getMeasuredHeight());
        super.onDraw(canvas);
        if (imageReceiver.getVisible()) {
            this.r.draw(canvas);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onFailedDownload(String str, boolean z10) {
        e(false);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setEnabled(true);
        StringBuilder sb2 = new StringBuilder(LocaleController.getString(R.string.AttachVideo));
        if (this.c != null) {
            sb2.append(", ");
            sb2.append(this.c.d.getText());
        }
        accessibilityNodeInfo.setText(sb2.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x016c  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TL_iv.pageBlockVideo pageblockvideo;
        int dp;
        int i14;
        int i15;
        int i16;
        i4 i4Var;
        boolean z10;
        float f7;
        int i17;
        int i18;
        int i19;
        boolean z11;
        float f10;
        int i20;
        int size = View.MeasureSpec.getSize(i10);
        char c10 = 2;
        int i21 = this.v;
        int i22 = 1;
        if (i21 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i13 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i21 != 2) {
                i12 = size;
                i13 = 0;
                int i23 = ((k4) this.a).X;
                pageblockvideo = this.L;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo != null) {
                    if (i21 != 0 || (i20 = pageblockvideo.level) <= 0) {
                        this.x = AndroidUtilities.dp(18.0f);
                        dp = i12 - AndroidUtilities.dp(36.0f);
                        i14 = i12;
                        i15 = 0;
                    } else {
                        i15 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i20 * 14);
                        this.x = i15;
                        i14 = org.telegram.messenger.yh.A(18.0f, i15, i12);
                        dp = i14;
                    }
                    TLRPC.Document document = this.O;
                    i4 i4Var2 = this.b;
                    if (document != null) {
                        int dp2 = AndroidUtilities.dp(48.0f);
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.O.thumbs, 48);
                        if (i21 == 0) {
                            int size2 = this.O.attributes.size();
                            int i24 = 0;
                            f7 = 2.0f;
                            while (true) {
                                if (i24 >= size2) {
                                    z11 = false;
                                    break;
                                }
                                char c11 = c10;
                                if (this.O.attributes.get(i24) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i13 = (int) ((i14 / r13.w) * r13.h);
                                    z11 = true;
                                    break;
                                } else {
                                    i24++;
                                    c10 = c11;
                                }
                            }
                            float f11 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w : 100.0f;
                            float f12 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100.0f;
                            if (!z11) {
                                i13 = (int) ((i14 / f11) * f12);
                            }
                            if (this.N instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i14);
                                f10 = 100.0f;
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                f10 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i14 = (int) ((max / f12) * f11);
                                    i15 += ((i12 - i15) - i14) / 2;
                                    i13 = max;
                                }
                            }
                            if (i13 == 0) {
                                i13 = AndroidUtilities.dp(f10);
                            } else if (i13 < dp2) {
                                i13 = dp2;
                            }
                        } else {
                            f7 = 2.0f;
                            if (i21 == 2) {
                                if ((this.T.flags & 2) == 0) {
                                    i14 -= AndroidUtilities.dp(2.0f);
                                }
                                if ((this.T.flags & 8) == 0) {
                                    int i25 = i14;
                                    i17 = i13;
                                    i13 -= AndroidUtilities.dp(2.0f);
                                    i18 = i15;
                                    i19 = i25;
                                    imageReceiver.setQualityThumbDocument(this.O);
                                    imageReceiver.setImageCoords(i18, (!this.w || i21 == 1 || i21 == 2 || this.L.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i19, i13);
                                    if (!this.Q) {
                                        if (this.P) {
                                            a3 a3Var = this.M;
                                            if (a3Var == null || a3Var.b == null) {
                                                this.R = DownloadController.getInstance(i23).canDownloadMedia(4, this.O.size);
                                                File pathToAttach = FileLoader.getInstance(i23).getPathToAttach(this.O);
                                                File pathToAttach2 = FileLoader.getInstance(i23).getPathToAttach(this.O, true);
                                                if (this.R || pathToAttach.exists() || pathToAttach2.exists()) {
                                                    imageReceiver.setStrippedLocation(null);
                                                    imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.O), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.O), "80_80_b", null, this.O.size, null, i4Var2.E, 1);
                                                } else {
                                                    imageReceiver.setStrippedLocation(ImageLocation.getForDocument(this.O));
                                                    imageReceiver.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.O), "80_80_b", null, this.O.size, null, i4Var2.E, 1);
                                                }
                                            } else {
                                                imageReceiver.setStrippedLocation(null);
                                                imageReceiver.setImageBitmap(this.M.b);
                                            }
                                        } else {
                                            imageReceiver.setStrippedLocation(null);
                                            imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.O), "80_80_b", 0L, null, i4Var2 != null ? i4Var2.E : null, 1);
                                        }
                                    }
                                    imageReceiver.setAspectFit(true);
                                    float f13 = dp2;
                                    float f14 = f7;
                                    this.F = (int) com.google.android.gms.internal.play_billing.k3.z(imageReceiver.getImageWidth(), f13, f14, imageReceiver.getImageX());
                                    int imageHeight = (int) (((imageReceiver.getImageHeight() - f13) / f14) + imageReceiver.getImageY());
                                    this.G = imageHeight;
                                    int i26 = this.F;
                                    this.r.q(i26, imageHeight, i26 + dp2, dp2 + imageHeight);
                                    i16 = i17;
                                }
                            }
                        }
                        i18 = i15;
                        i19 = i14;
                        i17 = i13;
                        imageReceiver.setQualityThumbDocument(this.O);
                        imageReceiver.setImageCoords(i18, (!this.w || i21 == 1 || i21 == 2 || this.L.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i19, i13);
                        if (!this.Q) {
                        }
                        imageReceiver.setAspectFit(true);
                        float f132 = dp2;
                        float f142 = f7;
                        this.F = (int) com.google.android.gms.internal.play_billing.k3.z(imageReceiver.getImageWidth(), f132, f142, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f132) / f142) + imageReceiver.getImageY());
                        this.G = imageHeight2;
                        int i262 = this.F;
                        this.r.q(i262, imageHeight2, i262 + dp2, dp2 + imageHeight2);
                        i16 = i17;
                    } else {
                        i16 = i13;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.y = imageHeight3;
                    if (i21 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
                        d3 q6 = k4.q(this.a, this, null, pageblockvideo2.caption.text, dp, imageHeight3, pageblockvideo2, this.b);
                        this.c = q6;
                        if (q6 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.E = height;
                            i16 = org.telegram.messenger.yh.c(4.0f, height, i16);
                            d3 d3Var = this.c;
                            d3Var.s = this.x;
                            d3Var.v = this.y;
                        }
                        int i27 = i16;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.L;
                        i4Var = i4Var2;
                        d3 p5 = k4.p(this.a, this, null, pageblockvideo3.caption.credit, dp, 0, pageblockvideo3, (i4Var2 == null || !i4Var2.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.ix0.a(), 0, this.b);
                        this.d = p5;
                        if (p5 != null) {
                            i16 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i27;
                            d3 d3Var2 = this.d;
                            d3Var2.s = this.x;
                            d3Var2.v = this.y + this.E;
                        } else {
                            i16 = i27;
                        }
                    } else {
                        i4Var = i4Var2;
                    }
                    if (!this.w && i21 == 0 && this.L.level <= 0) {
                        i16 += AndroidUtilities.dp(8.0f);
                    }
                    if ((this.N instanceof TL_iv.pageBlockCover) && i4Var != null) {
                        ArrayList arrayList = i4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z10 = true;
                            i22 = (i21 != 2 || z10) ? i16 : AndroidUtilities.dp(8.0f) + i16;
                        }
                    }
                    z10 = false;
                    if (i21 != 2) {
                    }
                }
                f1 f1Var = this.s;
                f1Var.measure(i10, i11);
                f1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.getImageX();
                layoutParams.topMargin = (int) imageReceiver.getImageY();
                layoutParams.width = (int) imageReceiver.getImageWidth();
                layoutParams.height = (int) imageReceiver.getImageHeight();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
            }
            float f15 = this.T.ph;
            Point point2 = AndroidUtilities.displaySize;
            i13 = (int) Math.ceil(f15 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        int i232 = ((k4) this.a).X;
        pageblockvideo = this.L;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo != null) {
        }
        f1 f1Var2 = this.s;
        f1Var2.measure(i10, i11);
        f1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.getImageX();
        layoutParams2.topMargin = (int) imageReceiver2.getImageY();
        layoutParams2.width = (int) imageReceiver2.getImageWidth();
        layoutParams2.height = (int) imageReceiver2.getImageHeight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i22, TLObject.FLAG_30));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j10, long j11) {
        this.r.o(Math.min(1.0f, j10 / j11), true);
        if (this.I != 1) {
            e(true);
        }
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onSuccessDownload(String str) {
        this.r.o(1.0f, true);
        if (!this.P) {
            e(true);
        } else {
            this.I = 2;
            a();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006b, code lost:
    
        if (r1 <= (org.telegram.messenger.AndroidUtilities.dp(48.0f) + r0)) goto L29;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        f1 f1Var = this.s;
        int visibility = f1Var.getVisibility();
        i4 i4Var = this.b;
        if (visibility != 0 || y3 <= f1Var.getTranslationY() || y3 >= f1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
            if (motionEvent.getAction() == 0 && this.e.isInsideImage(x10, y3)) {
                if (this.I != -1) {
                    if (x10 >= this.F && x10 <= AndroidUtilities.dp(48.0f) + r2) {
                        if (y3 >= this.G) {
                        }
                    }
                }
                if (this.I != 0) {
                    this.H = true;
                }
                this.J = 1;
                invalidate();
            } else if (motionEvent.getAction() == 1) {
                if (this.H) {
                    this.H = false;
                    this.a.d(this.L, i4Var);
                } else if (this.J == 1) {
                    this.J = 0;
                    playSoundEffect(0);
                    a();
                    invalidate();
                }
            } else if (motionEvent.getAction() == 3) {
                this.H = false;
            }
            if (!this.H && this.J == 0) {
                if (!k4.l(this.a, this.b, motionEvent, this, this.c, this.x, this.y)) {
                    if (!k4.l(this.a, this.b, motionEvent, this, this.d, this.x, this.y + this.E) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (i4Var != null && i4Var.F != null) {
            motionEvent.getAction();
            return true;
        }
        return true;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        d();
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressUpload(String str, long j10, long j11, boolean z10) {
    }
}
