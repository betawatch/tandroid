package yf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import kh.w3;
import kh.x3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.y5;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public class r0 extends View {
    public float A;
    public StaticLayout B;
    public float C;
    public float D;
    public final int E;
    public final int F;
    public boolean G;
    public boolean H;
    public float I;
    public float J;
    public final RectF K;
    public final y5 L;
    public int a;
    public String b;
    public boolean c;
    public final RectF d;
    public final TextPaint e;
    public final Paint f;
    public final Drawable h;
    public boolean n;
    public final ImageReceiver r;
    public final ImageReceiver s;
    public TLRPC.Document v;
    public TLRPC.Document w;
    public boolean x;
    public final float y;

    public r0(Context context, float f10) {
        super(context);
        this.b = "";
        this.d = new RectF(4.0f, 4.33f, 7.66f, 3.0f);
        TextPaint textPaint = new TextPaint(1);
        this.e = textPaint;
        this.f = new Paint(1);
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.r = imageReceiver;
        ImageReceiver imageReceiver2 = new ImageReceiver(this);
        this.s = imageReceiver2;
        this.A = 1.0f;
        this.K = new RectF();
        new Path();
        this.L = new y5(this, 350L, gr.h);
        this.y = f10;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i9 = (int) (3.0f * f10);
        this.E = i9;
        int i10 = (int) (1.0f * f10);
        this.F = i10;
        setPadding(i9, i10, i9, i10);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rcondensedbold.ttf"));
        NotificationCenter.listenEmojiLoading(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document b(String str, TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        if (tL_messages_stickerSet == null || tL_messages_stickerSet.packs == null || tL_messages_stickerSet.documents == null) {
            return null;
        }
        for (int i9 = 0; i9 < tL_messages_stickerSet.packs.size(); i9++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i9);
            String str2 = tL_stickerPack.emoticon;
            if (str2 != null && str != null) {
                ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str2);
                int i10 = 0;
                while (true) {
                    if (i10 >= parseEmojis.size()) {
                        break;
                    }
                    if (!TextUtils.equals(parseEmojis.get(i10).code, str)) {
                        i10++;
                    } else if (tL_stickerPack.documents.isEmpty()) {
                        continue;
                    } else {
                        long longValue = tL_stickerPack.documents.get(0).longValue();
                        for (int i11 = 0; i11 < tL_messages_stickerSet.documents.size(); i11++) {
                            if (tL_messages_stickerSet.documents.get(i11).id == longValue) {
                                return tL_messages_stickerSet.documents.get(i11);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static w3 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new w3(emojiBigDrawable, 7);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.B == null) {
            return;
        }
        int i9 = this.E;
        float f10 = i9;
        int i10 = this.F;
        float f11 = i10;
        float f12 = this.I + f10;
        float f13 = this.J + f11;
        RectF rectF = this.K;
        rectF.set(f10, f11, f12, f13);
        float f14 = this.J * 0.2f;
        canvas.drawRoundRect(rectF, f14, f14, this.f);
        boolean z10 = this.n;
        float f15 = this.y;
        RectF rectF2 = this.d;
        if (z10) {
            float e10 = this.L.e(this.H);
            if (e10 > 0.0f) {
                float f16 = ((rectF2.left + 2.25f) * f15) + f10;
                float f17 = f15 * 21.33f;
                float A = e2.c.A(this.J, f17, 2.0f, f11);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.setImageCoords(f16, A, f17, f17);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e10);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e10 < 1.0f) {
                float f18 = ((rectF2.left + 2.25f) * f15) + f10;
                float f19 = f15 * 21.33f;
                float A2 = e2.c.A(this.J, f19, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.setImageCoords(f18, A2, f19, f19);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e10);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.x) {
            float f20 = rectF2.left;
            float f21 = this.J;
            float f22 = f15 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f20 * f15)) + i9, ((int) ((f21 - f22) / 2.0f)) + i10, i9 + ((int) ((f20 + 21.33f) * f15)), i10 + ((int) ((f22 + f21) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f15) + f10, (this.J / 2.0f) + f11);
        float f23 = this.A;
        canvas.scale(f23, f23);
        canvas.translate(-this.D, (-this.B.getHeight()) / 2.0f);
        this.B.draw(canvas);
        canvas.restore();
    }

    public final void d(int i9, final String str) {
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.s;
        ImageReceiver imageReceiver2 = this.r;
        if (isEmpty) {
            this.n = false;
            this.v = null;
            this.w = null;
            imageReceiver2.clearImage();
            imageReceiver.clearImage();
        } else {
            this.n = true;
            this.v = null;
            this.w = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            final int i10 = 0;
            MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) { // from class: yf.q0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i10) {
                        case 0:
                            r0 r0Var = this.b;
                            r0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = r0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var.v = b10;
                            r0Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", r0.c(str2), null, null, 0);
                            r0Var.s.setImage(ImageLocation.getForDocument(r0Var.w), "80_80", ImageLocation.getForDocument(r0Var.v), "80_80", null, null, r0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            r0 r0Var2 = this.b;
                            r0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = r0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var2.w = b11;
                            if (b11 != null) {
                                r0Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(r0Var2.v), "80_80", null, null, r0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i11 = 1;
            MediaDataController.getInstance(i9).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) { // from class: yf.q0
                public final /* synthetic */ r0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            r0 r0Var = this.b;
                            r0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = r0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var.v = b10;
                            r0Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", r0.c(str2), null, null, 0);
                            r0Var.s.setImage(ImageLocation.getForDocument(r0Var.w), "80_80", ImageLocation.getForDocument(r0Var.v), "80_80", null, null, r0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            r0 r0Var2 = this.b;
                            r0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = r0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            r0Var2.w = b11;
                            if (b11 != null) {
                                r0Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(r0Var2.v), "80_80", null, null, r0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            imageReceiver2.setImage(ImageLocation.getForDocument(this.v), "80_80", c(str), null, null, 0);
            imageReceiver.setImage(ImageLocation.getForDocument(this.w), "80_80", ImageLocation.getForDocument(this.v), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.c = true;
        requestLayout();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i9, int i10) {
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        Paint paint = this.f;
        if (i9 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i9 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i9 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i10);
            int i11 = AndroidUtilities.computePerceivedBrightness(i10) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i11);
            drawable.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f10;
        if (this.c) {
            String str = this.b;
            TextPaint textPaint = this.e;
            float measureText = textPaint.measureText(str);
            int i9 = this.a;
            int i10 = this.E;
            float f11 = (i9 - i10) - i10;
            RectF rectF = this.d;
            float f12 = 2.25f;
            float f13 = rectF.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f14 = this.y;
            float f15 = f11 - (f13 * f14);
            float min = Math.min(1.0f, f15 / measureText);
            this.A = min;
            if (min < 0.4f) {
                f10 = 1.0f;
                String str2 = this.b;
                this.B = new StaticLayout(str2, textPaint, x3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f10 = 1.0f;
                this.B = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.C = 0.0f;
            this.D = Float.MAX_VALUE;
            for (int i11 = 0; i11 < this.B.getLineCount(); i11++) {
                this.C = Math.max(this.C, this.B.getLineWidth(i11));
                this.D = Math.min(this.D, this.B.getLineLeft(i11));
            }
            if (this.B.getLineCount() > 2) {
                this.A = 0.3f;
            } else {
                this.A = Math.min(f10, f15 / this.C);
            }
            float f16 = rectF.left;
            if (!this.n && !this.x) {
                f12 = 0.0f;
            }
            this.I = (this.C * this.A) + ((f16 + f12 + 21.33f + 3.25f + rectF.right) * f14);
            this.J = Math.max(f14 * 21.33f, this.B.getHeight() * this.A) + ((rectF.top + rectF.bottom) * f14);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.H || (document = this.w) == null) ? this.v : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.J);
        int i9 = this.F;
        return round + i9 + i9;
    }

    public float getRadius() {
        return this.J * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.I);
        int i9 = this.E;
        return round + i9 + i9;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.G = true;
        if (this.H) {
            this.s.onAttachedToWindow();
        } else {
            this.r.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.G = false;
        this.r.onDetachedFromWindow();
        this.s.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.H != z10 && this.G) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z10) {
                imageReceiver2.onDetachedFromWindow();
                imageReceiver.onAttachedToWindow();
            } else {
                imageReceiver2.onAttachedToWindow();
                imageReceiver.onDetachedFromWindow();
            }
        }
        this.H = z10;
        invalidate();
    }

    public void setMaxWidth(int i9) {
        this.a = i9;
        this.c = true;
    }

    public void setText(String str) {
        this.b = str;
        this.c = true;
        requestLayout();
    }
}
