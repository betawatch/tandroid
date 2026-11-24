// default package

import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import java.io.File;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBox;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rsc extends FrameLayout implements vlb {
    public final kc0 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ ssc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rsc(ssc sscVar, Context context) {
        super(context);
        this.s = sscVar;
        setWillNotDraw(false);
        kc0 kc0Var = new kc0((byte) 11, context, this);
        this.a = kc0Var;
        addView(kc0Var, qoe.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, qoe.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(cmb.L0(false));
        addView(view, qoe.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(cmb.w0(null, cmb.h7, false), cmb.w0(null, cmb.j7, false));
        addView(checkBox, qoe.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        TLRPC.PhotoSize photoSize;
        int U0;
        int U02;
        kc0 kc0Var;
        this.h = obj;
        kc0 kc0Var2 = this.a;
        kc0Var2.setVisibility(0);
        this.b.setVisibility(4);
        kc0Var2.setBackgroundDrawable(null);
        kc0Var2.getImageReceiver().p1 = null;
        kc0Var2.getImageReceiver().setAlpha(1.0f);
        kc0Var2.getImageReceiver().P(null);
        kc0Var2.getImageReceiver().W(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w = bc4.w(tL_wallPaper.document.thumbs, gm.L(100.0f), false, null, false);
            TLRPC.PhotoSize w2 = bc4.w(tL_wallPaper.document.thumbs, gm.L(180.0f), false, null, false);
            photoSize = w2 != w ? w2 : null;
            long j = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                TLRPC.Document document = tL_wallPaper.document;
                if (photoSize != null) {
                    kc0Var2.g(1, j, gn5.c(photoSize, document), gn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                    return;
                } else {
                    kc0Var2.g(1, j, gn5.b(document), gn5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                ah7 ah7Var = new ah7(wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, true, false);
                if (tL_wallPaper.settings.intensity >= 0 || !cmb.I.o()) {
                    kc0Var2.setBackground(ah7Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        kc0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    kc0Var2.getImageReceiver().W(ah7Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                U02 = ah7.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                kc0Var2.setBackgroundColor(cmb.Y0(wallPaperSettings.background_color));
                U02 = gm.U0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                kc0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(gm.U0(U02, false), PorterDuff.Mode.SRC_IN);
            }
            TLRPC.Document document2 = tL_wallPaper.document;
            long j2 = j;
            if (photoSize != null) {
                gn5 c = gn5.c(photoSize, document2);
                gn5 c2 = gn5.c(w, tL_wallPaper.document);
                kc0Var = kc0Var2;
                kc0Var.g(1, j2, c, c2, tL_wallPaper, "180_180", null, "jpg");
            } else {
                gn5 c3 = gn5.c(w, document2);
                kc0Var = kc0Var2;
                kc0Var.g(1, j2, c3, null, tL_wallPaper, "180_180", null, "jpg");
            }
            kc0Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof mtc)) {
            if (!(obj instanceof ntc)) {
                if (!(obj instanceof no6)) {
                    this.e = false;
                    return;
                }
                no6 no6Var = (no6) obj;
                TLRPC.Photo photo = no6Var.K;
                if (photo == null) {
                    kc0Var2.o(no6Var.D, "180_180", null);
                    return;
                }
                TLRPC.PhotoSize w3 = bc4.w(photo.sizes, gm.L(100.0f), false, null, false);
                TLRPC.PhotoSize w4 = bc4.w(no6Var.K.sizes, gm.L(180.0f), false, null, false);
                photoSize = w4 != w3 ? w4 : null;
                kc0Var2.g(1, photoSize != null ? photoSize.size : 0, gn5.i(photoSize, no6Var.K), gn5.i(w3, no6Var.K), no6Var, "180_180", "100_100_b", "jpg");
                return;
            }
            ntc ntcVar = (ntc) obj;
            File file = ntcVar.e;
            if (file != null) {
                kc0Var2.o(file.getAbsolutePath(), "180_180", null);
                return;
            }
            File file2 = ntcVar.d;
            if (file2 != null) {
                kc0Var2.o(file2.getAbsolutePath(), "180_180", null);
                return;
            } else if ("t".equals(ntcVar.a)) {
                kc0Var2.setImageDrawable(cmb.X0(true));
                return;
            } else {
                kc0Var2.setImageResource(ntcVar.c);
                return;
            }
        }
        mtc mtcVar = (mtc) obj;
        int i = mtcVar.d;
        int i2 = mtcVar.c;
        int i3 = mtcVar.b;
        if (mtcVar.g == null && !"d".equals(mtcVar.a)) {
            kc0Var2.setImageBitmap(null);
            if (mtcVar.j) {
                kc0Var2.setBackground(new ah7(mtcVar.b, mtcVar.c, mtcVar.d, mtcVar.e, true, false));
                return;
            } else if (i2 != 0) {
                kc0Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i3 | (-16777216), i2 | (-16777216)}));
                return;
            } else {
                kc0Var2.setBackgroundColor(i3 | (-16777216));
                return;
            }
        }
        if (i != 0) {
            ah7 ah7Var2 = new ah7(mtcVar.b, mtcVar.c, mtcVar.d, mtcVar.e, true, false);
            if (mtcVar.h >= 0.0f) {
                kc0Var2.setBackground(new ah7(mtcVar.b, mtcVar.c, mtcVar.d, mtcVar.e, true, false));
                if (Build.VERSION.SDK_INT >= 29) {
                    kc0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                }
            } else {
                kc0Var2.getImageReceiver().W(ah7Var2.k);
            }
            U0 = ah7.g(i3, i2, i, mtcVar.e);
        } else {
            kc0Var2.setBackground(new ah7(mtcVar.b, mtcVar.c, 0, 0, true, false));
            U0 = gm.U0(i3, false);
        }
        int i4 = U0;
        if ("d".equals(mtcVar.a)) {
            Bitmap bitmap = mtcVar.l;
            if (bitmap == null) {
                bitmap = neb.d(R.raw.default_pattern, 100, nm7.J2, -16777216);
                mtcVar.l = bitmap;
            }
            kc0Var2.setImageBitmap(bitmap);
            kc0Var2.getImageReceiver().setAlpha(Math.abs(mtcVar.h));
            return;
        }
        TLRPC.PhotoSize w5 = bc4.w(mtcVar.g.document.thumbs, 100, false, null, false);
        kc0Var2.g(1, w5 != null ? w5.size : mtcVar.g.document.size, gn5.c(w5, mtcVar.g.document), null, mtcVar.g, "180_180", null, "jpg");
        kc0Var2.getImageReceiver().setAlpha(Math.abs(mtcVar.h));
        if (Build.VERSION.SDK_INT < 29 || i == 0) {
            kc0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(gm.U0(i4, false), PorterDuff.Mode.SRC_IN);
        }
    }

    @Override // android.view.View
    public final void clearAnimation() {
        super.clearAnimation();
        AnimatorSet animatorSet = this.f;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.f = null;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        ssc sscVar = this.s;
        if (!sscVar.b || !this.c.y) {
            kc0 kc0Var = this.a;
            if (kc0Var.getImageReceiver().B() && kc0Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), sscVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            int w0 = cmb.w0(null, cmb.h7, false);
            int w02 = cmb.w0(null, cmb.j7, false);
            CheckBox checkBox = this.c;
            if (checkBox != null && (w0 != this.n || w02 != this.r)) {
                this.n = w0;
                this.r = w02;
                checkBox.c(w0, w02);
            }
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
