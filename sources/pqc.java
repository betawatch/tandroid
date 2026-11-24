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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class pqc extends FrameLayout implements tjb {
    public final kb0 a;
    public final ImageView b;
    public final CheckBox c;
    public final View d;
    public boolean e;
    public AnimatorSet f;
    public Object h;
    public int n;
    public int r;
    public final /* synthetic */ qqc s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pqc(qqc qqcVar, Context context) {
        super(context);
        this.s = qqcVar;
        setWillNotDraw(false);
        kb0 kb0Var = new kb0((byte) 11, context, this);
        this.a = kb0Var;
        addView(kb0Var, nme.e(-1, -1, 51));
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setImageResource(R.drawable.ic_gallery_background);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, nme.e(-1, -1, 51));
        View view = new View(context);
        this.d = view;
        view.setBackgroundDrawable(bkb.L0(false));
        addView(view, nme.c(-1.0f, -1));
        CheckBox checkBox = new CheckBox(context, R.drawable.round_check2);
        this.c = checkBox;
        checkBox.setVisibility(4);
        checkBox.c(bkb.w0(null, bkb.h7, false), bkb.w0(null, bkb.j7, false));
        addView(checkBox, nme.d(22, 22.0f, 53, 0.0f, 2.0f, 2.0f, 0.0f));
    }

    public final void a(Object obj, Object obj2) {
        TLRPC.PhotoSize photoSize;
        int U0;
        int U02;
        kb0 kb0Var;
        this.h = obj;
        kb0 kb0Var2 = this.a;
        kb0Var2.setVisibility(0);
        this.b.setVisibility(4);
        kb0Var2.setBackgroundDrawable(null);
        kb0Var2.getImageReceiver().p1 = null;
        kb0Var2.getImageReceiver().setAlpha(1.0f);
        kb0Var2.getImageReceiver().P(null);
        kb0Var2.getImageReceiver().W(null);
        this.e = obj == obj2;
        if (obj instanceof TLRPC.TL_wallPaper) {
            TLRPC.TL_wallPaper tL_wallPaper = (TLRPC.TL_wallPaper) obj;
            TLRPC.PhotoSize w = ba4.w(tL_wallPaper.document.thumbs, gl.L(100.0f), false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(tL_wallPaper.document.thumbs, gl.L(180.0f), false, null, false);
            photoSize = w2 != w ? w2 : null;
            long j = photoSize != null ? photoSize.size : tL_wallPaper.document.size;
            if (!tL_wallPaper.pattern) {
                TLRPC.Document document = tL_wallPaper.document;
                if (photoSize != null) {
                    kb0Var2.g(1, j, gl5.c(photoSize, document), gl5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                    return;
                } else {
                    kb0Var2.g(1, j, gl5.b(document), gl5.c(w, tL_wallPaper.document), tL_wallPaper, "180_180", "100_100_b", "jpg");
                    return;
                }
            }
            TLRPC.WallPaperSettings wallPaperSettings = tL_wallPaper.settings;
            if (wallPaperSettings.third_background_color != 0) {
                TLRPC.WallPaperSettings wallPaperSettings2 = tL_wallPaper.settings;
                ye7 ye7Var = new ye7(wallPaperSettings2.background_color, wallPaperSettings2.second_background_color, wallPaperSettings2.third_background_color, wallPaperSettings2.fourth_background_color, true, false);
                if (tL_wallPaper.settings.intensity >= 0 || !bkb.I.o()) {
                    kb0Var2.setBackground(ye7Var);
                    if (Build.VERSION.SDK_INT >= 29) {
                        kb0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                    }
                } else {
                    kb0Var2.getImageReceiver().W(ye7Var.k);
                }
                TLRPC.WallPaperSettings wallPaperSettings3 = tL_wallPaper.settings;
                U02 = ye7.g(wallPaperSettings3.background_color, wallPaperSettings3.second_background_color, wallPaperSettings3.third_background_color, wallPaperSettings3.fourth_background_color);
            } else {
                kb0Var2.setBackgroundColor(bkb.Y0(wallPaperSettings.background_color));
                U02 = gl.U0(tL_wallPaper.settings.background_color, false);
            }
            if (Build.VERSION.SDK_INT < 29 || tL_wallPaper.settings.third_background_color == 0) {
                kb0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(gl.U0(U02, false), PorterDuff.Mode.SRC_IN);
            }
            TLRPC.Document document2 = tL_wallPaper.document;
            long j2 = j;
            if (photoSize != null) {
                gl5 c = gl5.c(photoSize, document2);
                gl5 c2 = gl5.c(w, tL_wallPaper.document);
                kb0Var = kb0Var2;
                kb0Var.g(1, j2, c, c2, tL_wallPaper, "180_180", null, "jpg");
            } else {
                gl5 c3 = gl5.c(w, document2);
                kb0Var = kb0Var2;
                kb0Var.g(1, j2, c3, null, tL_wallPaper, "180_180", null, "jpg");
            }
            kb0Var.getImageReceiver().setAlpha(Math.abs(tL_wallPaper.settings.intensity) / 100.0f);
            return;
        }
        if (!(obj instanceof krc)) {
            if (!(obj instanceof lrc)) {
                if (!(obj instanceof nm6)) {
                    this.e = false;
                    return;
                }
                nm6 nm6Var = (nm6) obj;
                TLRPC.Photo photo = nm6Var.K;
                if (photo == null) {
                    kb0Var2.o(nm6Var.D, "180_180", null);
                    return;
                }
                TLRPC.PhotoSize w3 = ba4.w(photo.sizes, gl.L(100.0f), false, null, false);
                TLRPC.PhotoSize w4 = ba4.w(nm6Var.K.sizes, gl.L(180.0f), false, null, false);
                photoSize = w4 != w3 ? w4 : null;
                kb0Var2.g(1, photoSize != null ? photoSize.size : 0, gl5.i(photoSize, nm6Var.K), gl5.i(w3, nm6Var.K), nm6Var, "180_180", "100_100_b", "jpg");
                return;
            }
            lrc lrcVar = (lrc) obj;
            File file = lrcVar.e;
            if (file != null) {
                kb0Var2.o(file.getAbsolutePath(), "180_180", null);
                return;
            }
            File file2 = lrcVar.d;
            if (file2 != null) {
                kb0Var2.o(file2.getAbsolutePath(), "180_180", null);
                return;
            } else if ("t".equals(lrcVar.a)) {
                kb0Var2.setImageDrawable(bkb.X0(true));
                return;
            } else {
                kb0Var2.setImageResource(lrcVar.c);
                return;
            }
        }
        krc krcVar = (krc) obj;
        int i = krcVar.d;
        int i2 = krcVar.c;
        int i3 = krcVar.b;
        if (krcVar.g == null && !"d".equals(krcVar.a)) {
            kb0Var2.setImageBitmap(null);
            if (krcVar.j) {
                kb0Var2.setBackground(new ye7(krcVar.b, krcVar.c, krcVar.d, krcVar.e, true, false));
                return;
            } else if (i2 != 0) {
                kb0Var2.setBackground(new GradientDrawable(GradientDrawable.Orientation.BL_TR, new int[]{i3 | (-16777216), i2 | (-16777216)}));
                return;
            } else {
                kb0Var2.setBackgroundColor(i3 | (-16777216));
                return;
            }
        }
        if (i != 0) {
            ye7 ye7Var2 = new ye7(krcVar.b, krcVar.c, krcVar.d, krcVar.e, true, false);
            if (krcVar.h >= 0.0f) {
                kb0Var2.setBackground(new ye7(krcVar.b, krcVar.c, krcVar.d, krcVar.e, true, false));
                if (Build.VERSION.SDK_INT >= 29) {
                    kb0Var2.getImageReceiver().P(BlendMode.SOFT_LIGHT);
                }
            } else {
                kb0Var2.getImageReceiver().W(ye7Var2.k);
            }
            U0 = ye7.g(i3, i2, i, krcVar.e);
        } else {
            kb0Var2.setBackground(new ye7(krcVar.b, krcVar.c, 0, 0, true, false));
            U0 = gl.U0(i3, false);
        }
        int i4 = U0;
        if ("d".equals(krcVar.a)) {
            Bitmap bitmap = krcVar.l;
            if (bitmap == null) {
                bitmap = lcb.d(R.raw.default_pattern, 100, kk7.J2, -16777216);
                krcVar.l = bitmap;
            }
            kb0Var2.setImageBitmap(bitmap);
            kb0Var2.getImageReceiver().setAlpha(Math.abs(krcVar.h));
            return;
        }
        TLRPC.PhotoSize w5 = ba4.w(krcVar.g.document.thumbs, 100, false, null, false);
        kb0Var2.g(1, w5 != null ? w5.size : krcVar.g.document.size, gl5.c(w5, krcVar.g.document), null, krcVar.g, "180_180", null, "jpg");
        kb0Var2.getImageReceiver().setAlpha(Math.abs(krcVar.h));
        if (Build.VERSION.SDK_INT < 29 || i == 0) {
            kb0Var2.getImageReceiver().p1 = new PorterDuffColorFilter(gl.U0(i4, false), PorterDuff.Mode.SRC_IN);
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
        qqc qqcVar = this.s;
        if (!qqcVar.b || !this.c.y) {
            kb0 kb0Var = this.a;
            if (kb0Var.getImageReceiver().B() && kb0Var.getImageReceiver().i1 == 1.0f) {
                return;
            }
        }
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), qqcVar.s);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.d.drawableHotspotChanged(motionEvent.getX(), motionEvent.getY());
        return super.onTouchEvent(motionEvent);
    }

    @Override // tjb
    public final void updateColors() {
        try {
            int w0 = bkb.w0(null, bkb.h7, false);
            int w02 = bkb.w0(null, bkb.j7, false);
            CheckBox checkBox = this.c;
            if (checkBox != null && (w0 != this.n || w02 != this.r)) {
                this.n = w0;
                this.r = w02;
                checkBox.c(w0, w02);
            }
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
    }
}
