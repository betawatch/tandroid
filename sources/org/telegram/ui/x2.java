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

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class x2 extends FrameLayout implements DownloadController.FileDownloadProgressListener, org.telegram.ui.Cells.p9 {
    public static final /* synthetic */ int V = 0;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public int J;
    public final int K;
    public TL_iv.pageBlockVideo L;
    public y2 M;
    public TL_iv.PageBlock N;
    public TLRPC.Document O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public MessageObject.GroupedMessagePosition T;
    public boolean U;
    public final v70 a;
    public final g4 b;
    public b3 c;
    public b3 d;
    public final ImageReceiver e;
    public final FrameLayout f;
    public final l4 h;
    public final TextureView n;
    public final RadialProgress2 r;
    public final d1 s;
    public final int v;
    public boolean w;
    public int x;
    public int y;

    public x2(Context context, v70 v70Var, g4 g4Var, int i10) {
        super(context);
        this.a = v70Var;
        this.b = g4Var;
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
        this.K = DownloadController.getInstance(((i4) v70Var).X).generateObserverTag();
        d1 d1Var = new d1(context, v70Var, g4Var, 1);
        this.s = d1Var;
        l4 l4Var = new l4(context);
        this.h = l4Var;
        l4Var.setResizeMode(0);
        TextureView textureView = new TextureView(context);
        this.n = textureView;
        textureView.setOpaque(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f = frameLayout;
        l4Var.addView(textureView, w7.x5.e(-1, -2, 1));
        frameLayout.addView(l4Var, w7.x5.e(-1, -1, 17));
        addView(frameLayout, w7.x5.c(-2.0f, -1));
        addView(d1Var, w7.x5.c(-2.0f, -1));
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
        int i10 = ((i4) this.a).X;
        int i11 = this.I;
        ImageReceiver imageReceiver = this.e;
        RadialProgress2 radialProgress2 = this.r;
        if (i11 == 0) {
            this.S = false;
            radialProgress2.o(0.0f, false);
            boolean z10 = this.P;
            g4 g4Var = this.b;
            if (z10) {
                imageReceiver.setImage(ImageLocation.getForDocument(this.O), null, ImageLocation.getForDocument(FileLoader.getClosestPhotoSizeWithSize(this.O.thumbs, 40), this.O), "80_80_b", this.O.size, null, g4Var.E, 1);
            } else {
                FileLoader.getInstance(i10).loadFile(this.O, g4Var.E, 1, 1);
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

    public final void b(TL_iv.pageBlockVideo pageblockvideo, y2 y2Var, boolean z10, boolean z11) {
        v70 v70Var;
        VideoPlayerHolderBase videoPlayerHolderBase;
        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
        if (pageblockvideo2 != null && (videoPlayerHolderBase = (v70Var = this.a).w) != null && v70Var.x == this) {
            a0.i iVar = v70Var.y;
            long j3 = pageblockvideo2.video_id;
            y2 a2 = y2.a(videoPlayerHolderBase, this);
            this.M = a2;
            iVar.k(a2, j3);
        }
        this.L = pageblockvideo;
        this.M = y2Var;
        this.N = null;
        this.Q = z10;
        g4 g4Var = this.b;
        if (g4Var != null) {
            this.O = f4.a(g4Var.E, pageblockvideo.video_id);
        } else {
            this.O = null;
        }
        this.P = MessageObject.isVideoDocument(this.O) || MessageObject.isGifDocument(this.O);
        this.w = z11;
        this.s.setVisibility(4);
        e(false);
        requestLayout();
    }

    public final void c(y2 y2Var) {
        Bitmap bitmap;
        Bitmap bitmap2;
        Bitmap bitmap3;
        y2 y2Var2 = this.M;
        if (y2Var2 != null && (bitmap2 = y2Var.b) != null && (bitmap3 = y2Var2.b) != null && bitmap2 != bitmap3) {
            bitmap3.recycle();
            this.M.b = null;
        }
        y2 y2Var3 = this.M;
        if (y2Var3 != null && y2Var.b == null && (bitmap = y2Var3.b) != null) {
            y2Var.a = y2Var3.a;
            y2Var.b = bitmap;
        }
        this.M = y2Var;
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
            v70 v70Var = this.a;
            if (pageblockvideo != null && (videoPlayerHolderBase = v70Var.w) != null && v70Var.x == this) {
                a0.i iVar = v70Var.y;
                long j3 = pageblockvideo.video_id;
                y2 a2 = y2.a(videoPlayerHolderBase, this);
                c(a2);
                iVar.k(a2, j3);
            }
            imageReceiver.onDetachedFromWindow();
            DownloadController.getInstance(((i4) v70Var).X).removeLoadingFileObserver(this);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        return super.drawChild(canvas, view, j3);
    }

    public final void e(boolean z10) {
        int i10 = ((i4) this.a).X;
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
            y2 y2Var = this.M;
            float f7 = 0.0f;
            if (y2Var == null || y2Var.b == null) {
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

    @Override // org.telegram.ui.Cells.p9
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        b3 b3Var = this.c;
        if (b3Var != null) {
            arrayList.add(b3Var);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            arrayList.add(b3Var2);
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
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.attach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.attach(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d();
        b3 b3Var = this.c;
        if (b3Var != null) {
            b3Var.detach(this);
        }
        b3 b3Var2 = this.d;
        if (b3Var2 != null) {
            b3Var2.detach(this);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.L == null) {
            return;
        }
        ImageReceiver imageReceiver = this.e;
        if (!imageReceiver.hasBitmapImage() || imageReceiver.getCurrentAlpha() != 1.0f) {
            canvas.drawRect(imageReceiver.getDrawRegion(), i4.o1);
        }
        imageReceiver.draw(canvas);
        b3 b3Var = this.c;
        v70 v70Var = this.a;
        int i10 = 0;
        if (b3Var != null) {
            canvas.save();
            canvas.translate(this.x, this.y);
            i4.v(v70Var, canvas, this, 0);
            this.c.draw(canvas, this);
            canvas.restore();
            i10 = 1;
        }
        if (this.d != null) {
            canvas.save();
            canvas.translate(this.x, this.y + this.E);
            i4.v(v70Var, canvas, this, i10);
            this.d.draw(canvas, this);
            canvas.restore();
        }
        i4.u(canvas, v70Var, this.L, getMeasuredHeight());
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

    /* JADX WARN: Removed duplicated region for block: B:127:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0171  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        TL_iv.pageBlockVideo pageblockvideo;
        int i14;
        int dp;
        int i15;
        int i16;
        int i17;
        g4 g4Var;
        boolean z10;
        int i18;
        int i19;
        int i20;
        boolean z11;
        float f7;
        int i21;
        int size = View.MeasureSpec.getSize(i10);
        int i22 = this.v;
        if (i22 == 1) {
            size = ((View) getParent()).getMeasuredWidth();
            i13 = ((View) getParent()).getMeasuredHeight();
        } else {
            if (i22 != 2) {
                i12 = size;
                i13 = 0;
                int i23 = ((i4) this.a).X;
                pageblockvideo = this.L;
                ImageReceiver imageReceiver = this.e;
                if (pageblockvideo == null) {
                    if (i22 != 0 || (i21 = pageblockvideo.level) <= 0) {
                        this.x = AndroidUtilities.dp(18.0f);
                        dp = i12 - AndroidUtilities.dp(36.0f);
                        i15 = i12;
                        i16 = 0;
                    } else {
                        i16 = AndroidUtilities.dp(18.0f) + AndroidUtilities.dp(i21 * 14);
                        this.x = i16;
                        i15 = org.telegram.messenger.wl.v(18.0f, i16, i12);
                        dp = i15;
                    }
                    TLRPC.Document document = this.O;
                    g4 g4Var2 = this.b;
                    if (document != null) {
                        int dp2 = AndroidUtilities.dp(48.0f);
                        TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(this.O.thumbs, 48);
                        if (i22 == 0) {
                            int size2 = this.O.attributes.size();
                            int i24 = 0;
                            while (true) {
                                if (i24 >= size2) {
                                    z11 = false;
                                    break;
                                }
                                if (this.O.attributes.get(i24) instanceof TLRPC.TL_documentAttributeVideo) {
                                    i13 = (int) ((i15 / r13.w) * r13.h);
                                    z11 = true;
                                    break;
                                }
                                i24++;
                            }
                            float f10 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.w : 100.0f;
                            float f11 = closestPhotoSizeWithSize != null ? closestPhotoSizeWithSize.h : 100.0f;
                            if (!z11) {
                                i13 = (int) ((i15 / f10) * f11);
                            }
                            if (this.N instanceof TL_iv.pageBlockCover) {
                                i13 = Math.min(i13, i15);
                                f7 = 100.0f;
                            } else {
                                Point point = AndroidUtilities.displaySize;
                                f7 = 100.0f;
                                int max = (int) ((Math.max(point.x, point.y) - AndroidUtilities.dp(56.0f)) * 0.9f);
                                if (i13 > max) {
                                    i15 = (int) ((max / f11) * f10);
                                    i16 += ((i12 - i16) - i15) / 2;
                                    i13 = max;
                                }
                            }
                            if (i13 == 0) {
                                i13 = AndroidUtilities.dp(f7);
                            } else if (i13 < dp2) {
                                i13 = dp2;
                            }
                        } else if (i22 == 2) {
                            if ((this.T.flags & 2) == 0) {
                                i15 -= AndroidUtilities.dp(2.0f);
                            }
                            if ((this.T.flags & 8) == 0) {
                                int i25 = i15;
                                i18 = i13;
                                i13 -= AndroidUtilities.dp(2.0f);
                                i19 = i16;
                                i20 = i25;
                                imageReceiver.setQualityThumbDocument(this.O);
                                imageReceiver.setImageCoords(i19, (!this.w || i22 == 1 || i22 == 2 || this.L.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i20, i13);
                                if (!this.Q) {
                                    if (this.P) {
                                        y2 y2Var = this.M;
                                        if (y2Var == null || y2Var.b == null) {
                                            this.R = DownloadController.getInstance(i23).canDownloadMedia(4, this.O.size);
                                            File pathToAttach = FileLoader.getInstance(i23).getPathToAttach(this.O);
                                            File pathToAttach2 = FileLoader.getInstance(i23).getPathToAttach(this.O, true);
                                            if (this.R || pathToAttach.exists() || pathToAttach2.exists()) {
                                                imageReceiver.setStrippedLocation(null);
                                                imageReceiver.setImage(null, null, ImageLocation.getForDocument(this.O), "200_200_pframe", ImageLocation.getForDocument(closestPhotoSizeWithSize, this.O), "80_80_b", null, this.O.size, null, g4Var2.E, 1);
                                            } else {
                                                imageReceiver.setStrippedLocation(ImageLocation.getForDocument(this.O));
                                                imageReceiver.setImage(null, null, null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.O), "80_80_b", null, this.O.size, null, g4Var2.E, 1);
                                            }
                                        } else {
                                            imageReceiver.setStrippedLocation(null);
                                            imageReceiver.setImageBitmap(this.M.b);
                                        }
                                    } else {
                                        imageReceiver.setStrippedLocation(null);
                                        imageReceiver.setImage(null, null, ImageLocation.getForDocument(closestPhotoSizeWithSize, this.O), "80_80_b", 0L, null, g4Var2 != null ? g4Var2.E : null, 1);
                                    }
                                }
                                imageReceiver.setAspectFit(true);
                                float f12 = dp2;
                                this.F = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), f12, 2.0f, imageReceiver.getImageX());
                                int imageHeight = (int) (((imageReceiver.getImageHeight() - f12) / 2.0f) + imageReceiver.getImageY());
                                this.G = imageHeight;
                                int i26 = this.F;
                                this.r.q(i26, imageHeight, i26 + dp2, dp2 + imageHeight);
                                i17 = i18;
                            }
                        }
                        i19 = i16;
                        i20 = i15;
                        i18 = i13;
                        imageReceiver.setQualityThumbDocument(this.O);
                        imageReceiver.setImageCoords(i19, (!this.w || i22 == 1 || i22 == 2 || this.L.level > 0) ? 0 : AndroidUtilities.dp(8.0f), i20, i13);
                        if (!this.Q) {
                        }
                        imageReceiver.setAspectFit(true);
                        float f122 = dp2;
                        this.F = (int) com.google.android.gms.internal.vision.e2.A(imageReceiver.getImageWidth(), f122, 2.0f, imageReceiver.getImageX());
                        int imageHeight2 = (int) (((imageReceiver.getImageHeight() - f122) / 2.0f) + imageReceiver.getImageY());
                        this.G = imageHeight2;
                        int i262 = this.F;
                        this.r.q(i262, imageHeight2, i262 + dp2, dp2 + imageHeight2);
                        i17 = i18;
                    } else {
                        i17 = i13;
                    }
                    int imageHeight3 = (int) (imageReceiver.getImageHeight() + imageReceiver.getImageY() + AndroidUtilities.dp(8.0f));
                    this.y = imageHeight3;
                    if (i22 == 0) {
                        TL_iv.pageBlockVideo pageblockvideo2 = this.L;
                        b3 q6 = i4.q(this.a, this, null, pageblockvideo2.caption.text, dp, imageHeight3, pageblockvideo2, this.b);
                        this.c = q6;
                        if (q6 != null) {
                            int height = this.c.d.getHeight() + AndroidUtilities.dp(4.0f);
                            this.E = height;
                            i17 = org.telegram.messenger.w1.C(4.0f, height, i17);
                            b3 b3Var = this.c;
                            b3Var.s = this.x;
                            b3Var.v = this.y;
                        }
                        int i27 = i17;
                        TL_iv.pageBlockVideo pageblockvideo3 = this.L;
                        g4Var = g4Var2;
                        b3 p5 = i4.p(this.a, this, null, pageblockvideo3.caption.credit, dp, 0, pageblockvideo3, (g4Var2 == null || !g4Var2.G) ? Layout.Alignment.ALIGN_NORMAL : org.telegram.ui.Components.iw0.a(), 0, this.b);
                        this.d = p5;
                        if (p5 != null) {
                            i17 = this.d.d.getHeight() + AndroidUtilities.dp(4.0f) + i27;
                            b3 b3Var2 = this.d;
                            b3Var2.s = this.x;
                            b3Var2.v = this.y + this.E;
                        } else {
                            i17 = i27;
                        }
                    } else {
                        g4Var = g4Var2;
                    }
                    if (!this.w && i22 == 0 && this.L.level <= 0) {
                        i17 += AndroidUtilities.dp(8.0f);
                    }
                    if ((this.N instanceof TL_iv.pageBlockCover) && g4Var != null) {
                        ArrayList arrayList = g4Var.e;
                        if (arrayList.size() > 1 && (arrayList.get(1) instanceof TL_iv.pageBlockChannel)) {
                            z10 = true;
                            i14 = (i22 != 2 || z10) ? i17 : AndroidUtilities.dp(8.0f) + i17;
                        }
                    }
                    z10 = false;
                    if (i22 != 2) {
                    }
                } else {
                    i14 = 1;
                }
                d1 d1Var = this.s;
                d1Var.measure(i10, i11);
                d1Var.setTranslationY(imageReceiver.getImageHeight() - AndroidUtilities.dp(39.0f));
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f.getLayoutParams();
                layoutParams.leftMargin = (int) imageReceiver.getImageX();
                layoutParams.topMargin = (int) imageReceiver.getImageY();
                layoutParams.width = (int) imageReceiver.getImageWidth();
                layoutParams.height = (int) imageReceiver.getImageHeight();
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
            }
            float f13 = this.T.ph;
            Point point2 = AndroidUtilities.displaySize;
            i13 = (int) Math.ceil(f13 * Math.max(point2.x, point2.y) * 0.5f);
        }
        i12 = size;
        int i232 = ((i4) this.a).X;
        pageblockvideo = this.L;
        ImageReceiver imageReceiver2 = this.e;
        if (pageblockvideo == null) {
        }
        d1 d1Var2 = this.s;
        d1Var2.measure(i10, i11);
        d1Var2.setTranslationY(imageReceiver2.getImageHeight() - AndroidUtilities.dp(39.0f));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f.getLayoutParams();
        layoutParams2.leftMargin = (int) imageReceiver2.getImageX();
        layoutParams2.topMargin = (int) imageReceiver2.getImageY();
        layoutParams2.width = (int) imageReceiver2.getImageWidth();
        layoutParams2.height = (int) imageReceiver2.getImageHeight();
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i14, TLObject.FLAG_30));
    }

    @Override // org.telegram.messenger.DownloadController.FileDownloadProgressListener
    public final void onProgressDownload(String str, long j3, long j10) {
        this.r.o(Math.min(1.0f, j3 / j10), true);
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
        d1 d1Var = this.s;
        int visibility = d1Var.getVisibility();
        g4 g4Var = this.b;
        if (visibility != 0 || y3 <= d1Var.getTranslationY() || y3 >= d1Var.getTranslationY() + AndroidUtilities.dp(39.0f)) {
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
                    this.a.d(this.L, g4Var);
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
                if (!i4.l(this.a, this.b, motionEvent, this, this.c, this.x, this.y)) {
                    if (!i4.l(this.a, this.b, motionEvent, this, this.d, this.x, this.y + this.E) && !super.onTouchEvent(motionEvent)) {
                        return false;
                    }
                }
            }
        } else if (g4Var != null && g4Var.F != null) {
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
    public final void onProgressUpload(String str, long j3, long j10, boolean z10) {
    }
}
