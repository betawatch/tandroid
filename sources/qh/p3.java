package qh;

import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import java.io.File;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class p3 extends View {
    public final org.telegram.ui.Components.z5 B;
    public final ImageReceiver a;
    public final Paint b;
    public final Paint c;
    public final org.telegram.ui.Components.j6 d;
    public boolean e;
    public boolean f;
    public View.OnClickListener h;
    public final rc n;
    public int r;
    public String s;
    public float v;
    public float w;
    public float x;
    public final org.telegram.ui.Components.z5 y;

    public p3(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.a = imageReceiver;
        Paint paint = new Paint(1);
        this.b = paint;
        Paint paint2 = new Paint(1);
        this.c = paint2;
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, false, false, false);
        this.d = j6Var;
        this.n = new rc(this);
        this.r = -1;
        pr prVar = pr.h;
        this.y = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.B = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        j6Var.setCallback(this);
        j6Var.r(-1);
        j6Var.b = 17;
        j6Var.t(AndroidUtilities.dp(16.0f));
        j6Var.u(AndroidUtilities.getTypeface("fonts/num.otf"));
        j6Var.G = AndroidUtilities.displaySize.x;
        j6Var.k(0.65f, 480L, prVar);
        j6Var.v = 0.35f;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(-1);
        paint2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g6Var));
        imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
        k7.e6.a(this);
    }

    public final void a(int i10, int i11, final r6 r6Var) {
        String str;
        if (this.r != i10) {
            this.s = null;
            this.a.clearImage();
            this.r = i10;
        }
        this.d.q(Integer.toString(i11 + 1), false, true);
        File file = r6Var.O0;
        if (file != null) {
            if (TextUtils.equals(this.s, file.getPath())) {
                return;
            }
            this.s = r6Var.O0.getPath();
            final int i12 = 0;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: qh.m3
                public final /* synthetic */ p3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i12) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            r6 r6Var2 = r6Var;
                            BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                            int dp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            r6.C(options, dp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                            final int i13 = 1;
                            final p3 p3Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i13) {
                                        case 0:
                                            p3Var.a.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            p3Var.a.setImageBitmap(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            r6 r6Var3 = r6Var;
                            BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                            int dp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            r6.C(options2, dp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                            final int i14 = 0;
                            final p3 p3Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            p3Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            p3Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        if (!r6Var.K) {
            File file2 = r6Var.L;
            if (file2 == null || TextUtils.equals(this.s, file2.getPath())) {
                return;
            }
            this.s = r6Var.L.getPath();
            final int i13 = 1;
            Utilities.searchQueue.postRunnable(new Runnable(this) { // from class: qh.m3
                public final /* synthetic */ p3 b;

                {
                    this.b = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    switch (i13) {
                        case 0:
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            options.inJustDecodeBounds = true;
                            r6 r6Var2 = r6Var;
                            BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                            int dp = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            r6.C(options, dp);
                            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options.inDither = true;
                            options.inJustDecodeBounds = false;
                            final Bitmap decodeFile = BitmapFactory.decodeFile(r6Var2.O0.getPath(), options);
                            final int i132 = 1;
                            final p3 p3Var = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i132) {
                                        case 0:
                                            p3Var.a.setImageBitmap(decodeFile);
                                            break;
                                        default:
                                            p3Var.a.setImageBitmap(decodeFile);
                                            break;
                                    }
                                }
                            });
                            break;
                        default:
                            BitmapFactory.Options options2 = new BitmapFactory.Options();
                            options2.inJustDecodeBounds = true;
                            r6 r6Var3 = r6Var;
                            BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                            int dp2 = AndroidUtilities.dp(94.0f);
                            AndroidUtilities.dp(112.0f);
                            r6.C(options2, dp2);
                            options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                            options2.inDither = true;
                            options2.inJustDecodeBounds = false;
                            final Bitmap decodeFile2 = BitmapFactory.decodeFile(r6Var3.L.getPath(), options2);
                            final int i14 = 0;
                            final p3 p3Var2 = this.b;
                            AndroidUtilities.runOnUIThread(new Runnable() { // from class: qh.n3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    switch (i14) {
                                        case 0:
                                            p3Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                        default:
                                            p3Var2.a.setImageBitmap(decodeFile2);
                                            break;
                                    }
                                }
                            });
                            break;
                    }
                }
            });
            return;
        }
        Bitmap bitmap = r6Var.M0;
        if (bitmap == null) {
            bitmap = null;
        }
        if (bitmap == null && (str = r6Var.N) != null && str.startsWith("vthumb://")) {
            if (TextUtils.equals(this.s, r6Var.N)) {
                return;
            }
            String str2 = r6Var.N;
            this.s = str2;
            long parseLong = Long.parseLong(str2.substring(9));
            if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                try {
                    bitmap = getContext().getContentResolver().loadThumbnail(r6Var.K ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, parseLong) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                } catch (Exception unused) {
                }
            }
        }
        this.a.setImageBitmap(bitmap);
    }

    public final void b(boolean z4, boolean z10) {
        if (this.e == z4) {
            return;
        }
        this.e = z4;
        if (!z10) {
            this.y.a(z4);
        }
        invalidate();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(4.0f);
        float dp3 = AndroidUtilities.dp(94.0f);
        float dp4 = AndroidUtilities.dp(112.0f);
        ImageReceiver imageReceiver = this.a;
        imageReceiver.setImageCoords(dp, dp2, dp3, dp4);
        imageReceiver.draw(canvas);
        float dp5 = AndroidUtilities.dp(1.5f);
        Paint paint = this.b;
        paint.setStrokeWidth(dp5);
        float e6 = this.y.e(this.e);
        if (e6 > 0.0f) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
            paint.setAlpha((int) (e6 * 255.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        }
        this.v = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
        this.w = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
        this.x = AndroidUtilities.dp(12.833f);
        float e10 = this.B.e(this.f);
        float a2 = this.n.a(0.075f);
        canvas.save();
        canvas.scale(a2, a2, this.v, this.w);
        if (e10 > 0.0f) {
            Paint paint2 = this.c;
            paint2.setAlpha((int) (e10 * 255.0f));
            canvas.drawCircle(this.v, this.w, this.x, paint2);
        }
        paint.setAlpha(255);
        canvas.drawCircle(this.v, this.w, this.x - AndroidUtilities.dp(1.0f), paint);
        if (e10 > 0.0f) {
            float f10 = this.v;
            float f11 = this.x;
            float f12 = f10 - f11;
            float f13 = this.w;
            float f14 = f10 + f11;
            org.telegram.ui.Components.j6 j6Var = this.d;
            j6Var.l(f12, f13, f14, f13);
            j6Var.w = (int) (e10 * 255.0f);
            j6Var.draw(canvas);
        }
        canvas.restore();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a.onAttachedToWindow();
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.a.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View.OnClickListener onClickListener;
        boolean z4 = motionEvent.getX() >= this.v - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getX() <= this.v + ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() >= this.w - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() <= this.w + ((float) AndroidUtilities.dp(14.0f));
        int action = motionEvent.getAction();
        rc rcVar = this.n;
        if (action == 0) {
            rcVar.c(z4);
        } else if (motionEvent.getAction() == 1) {
            if (rcVar.h && z4 && (onClickListener = this.h) != null) {
                onClickListener.onClick(this);
            }
            rcVar.c(false);
        } else if (motionEvent.getAction() == 3) {
            rcVar.c(false);
        }
        return rcVar.h || super.onTouchEvent(motionEvent);
    }

    public void setOnCheckboxClick(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    public void setPosition(int i10) {
        this.d.q(i10 < 0 ? "" : Integer.toString(i10 + 1), true, true);
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return drawable == this.d || super.verifyDrawable(drawable);
    }
}
