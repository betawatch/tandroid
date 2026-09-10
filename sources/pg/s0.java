package pg;

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
import bi.w4;
import bi.x4;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d6;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public class s0 extends View {
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final int I;
    public final int J;
    public boolean K;
    public boolean L;
    public float M;
    public float N;
    public final RectF O;
    public final d6 P;
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

    public s0(Context context, float f7) {
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
        this.E = 1.0f;
        this.O = new RectF();
        new Path();
        this.P = new d6(this, 350L, wr.h);
        this.y = f7;
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setInvalidateAll(true);
        imageReceiver2.setCrossfadeWithOldImage(true);
        imageReceiver2.setInvalidateAll(true);
        int i10 = (int) (3.0f * f7);
        this.I = i10;
        int i11 = (int) (1.0f * f7);
        this.J = i11;
        setPadding(i10, i11, i10, i11);
        this.h = context.getResources().getDrawable(R.drawable.map_pin3).mutate();
        textPaint.setTextSize(f7 * 24.0f);
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
        for (int i10 = 0; i10 < tL_messages_stickerSet.packs.size(); i10++) {
            TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i10);
            String str2 = tL_stickerPack.emoticon;
            if (str2 != null && str != null) {
                ArrayList<Emoji.EmojiSpanRange> parseEmojis = Emoji.parseEmojis(str2);
                int i11 = 0;
                while (true) {
                    if (i11 >= parseEmojis.size()) {
                        break;
                    }
                    if (!TextUtils.equals(parseEmojis.get(i11).code, str)) {
                        i11++;
                    } else if (tL_stickerPack.documents.isEmpty()) {
                        continue;
                    } else {
                        long longValue = tL_stickerPack.documents.get(0).longValue();
                        for (int i12 = 0; i12 < tL_messages_stickerSet.documents.size(); i12++) {
                            if (tL_messages_stickerSet.documents.get(i12).id == longValue) {
                                return tL_messages_stickerSet.documents.get(i12);
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public static w4 c(String str) {
        Drawable emojiBigDrawable = Emoji.getEmojiBigDrawable(str);
        if (emojiBigDrawable instanceof Emoji.SimpleEmojiDrawable) {
            ((Emoji.SimpleEmojiDrawable) emojiBigDrawable).fullSize = false;
        }
        if (emojiBigDrawable == null) {
            return null;
        }
        return new w4(emojiBigDrawable, 7);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.F == null) {
            return;
        }
        int i10 = this.I;
        float f7 = i10;
        int i11 = this.J;
        float f10 = i11;
        float f11 = this.M + f7;
        float f12 = this.N + f10;
        RectF rectF = this.O;
        rectF.set(f7, f10, f11, f12);
        float f13 = this.N * 0.2f;
        canvas.drawRoundRect(rectF, f13, f13, this.f);
        boolean z10 = this.n;
        float f14 = this.y;
        RectF rectF2 = this.d;
        if (z10) {
            float e = this.P.e(this.L);
            if (e > 0.0f) {
                float f15 = ((rectF2.left + 2.25f) * f14) + f7;
                float f16 = f14 * 21.33f;
                float A = com.google.android.gms.internal.vision.e2.A(this.N, f16, 2.0f, f10);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.setImageCoords(f15, A, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.getCenterX(), imageReceiver.getCenterY());
                imageReceiver.setAlpha(e);
                imageReceiver.draw(canvas);
                canvas.restore();
            }
            if (e < 1.0f) {
                float f17 = ((rectF2.left + 2.25f) * f14) + f7;
                float f18 = f14 * 21.33f;
                float A2 = com.google.android.gms.internal.vision.e2.A(this.N, f18, 2.0f, f10);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.setImageCoords(f17, A2, f18, f18);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.getCenterX(), imageReceiver2.getCenterY());
                imageReceiver2.setAlpha(1.0f - e);
                imageReceiver2.draw(canvas);
                canvas.restore();
            }
        } else if (!this.x) {
            float f19 = rectF2.left;
            float f20 = this.N;
            float f21 = f14 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f19 * f14)) + i10, ((int) ((f20 - f21) / 2.0f)) + i11, i10 + ((int) ((f19 + 21.33f) * f14)), i11 + ((int) ((f21 + f20) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f14) + f7, (this.N / 2.0f) + f10);
        float f22 = this.E;
        canvas.scale(f22, f22);
        canvas.translate(-this.H, (-this.F.getHeight()) / 2.0f);
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void d(int i10, final String str) {
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
            final int i11 = 0;
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName, 0, false, new Utilities.Callback(this) { // from class: pg.r0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i11) {
                        case 0:
                            s0 s0Var = this.b;
                            s0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = s0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var.v = b10;
                            s0Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", s0.c(str2), null, null, 0);
                            s0Var.s.setImage(ImageLocation.getForDocument(s0Var.w), "80_80", ImageLocation.getForDocument(s0Var.v), "80_80", null, null, s0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            s0 s0Var2 = this.b;
                            s0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = s0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var2.w = b11;
                            if (b11 != null) {
                                s0Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(s0Var2.v), "80_80", null, null, s0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i12 = 1;
            MediaDataController.getInstance(i10).getStickerSet(tL_inputStickerSetShortName2, 0, false, new Utilities.Callback(this) { // from class: pg.r0
                public final /* synthetic */ s0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.Utilities.Callback
                public final void run(Object obj) {
                    switch (i12) {
                        case 0:
                            s0 s0Var = this.b;
                            s0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = s0.b(str2, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var.v = b10;
                            s0Var.r.setImage(ImageLocation.getForDocument(b10), "80_80", s0.c(str2), null, null, 0);
                            s0Var.s.setImage(ImageLocation.getForDocument(s0Var.w), "80_80", ImageLocation.getForDocument(s0Var.v), "80_80", null, null, s0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            s0 s0Var2 = this.b;
                            s0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = s0.b(str3, (TLRPC.TL_messages_stickerSet) obj);
                            s0Var2.w = b11;
                            if (b11 != null) {
                                s0Var2.s.setImage(ImageLocation.getForDocument(b11), "80_80", ImageLocation.getForDocument(s0Var2.v), "80_80", null, null, s0.c(str3), 0L, null, null, 0);
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

    public final void e(int i10, int i11) {
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        Paint paint = this.f;
        if (i10 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i10 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i10 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i11);
            int i12 = AndroidUtilities.computePerceivedBrightness(i11) < 0.721f ? -1 : -16777216;
            textPaint.setColor(i12);
            drawable.setColorFilter(new PorterDuffColorFilter(i12, PorterDuff.Mode.SRC_IN));
        }
        invalidate();
    }

    public final void f() {
        float f7;
        if (this.c) {
            String str = this.b;
            TextPaint textPaint = this.e;
            float measureText = textPaint.measureText(str);
            int i10 = this.a;
            int i11 = this.I;
            float f10 = (i10 - i11) - i11;
            RectF rectF = this.d;
            float f11 = 2.25f;
            float f12 = rectF.left + ((this.n || this.x) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f13 = this.y;
            float f14 = f10 - (f12 * f13);
            float min = Math.min(1.0f, f14 / measureText);
            this.E = min;
            if (min < 0.4f) {
                f7 = 1.0f;
                String str2 = this.b;
                this.F = new StaticLayout(str2, textPaint, x4.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f7 = 1.0f;
                this.F = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.G = 0.0f;
            this.H = Float.MAX_VALUE;
            for (int i12 = 0; i12 < this.F.getLineCount(); i12++) {
                this.G = Math.max(this.G, this.F.getLineWidth(i12));
                this.H = Math.min(this.H, this.F.getLineLeft(i12));
            }
            if (this.F.getLineCount() > 2) {
                this.E = 0.3f;
            } else {
                this.E = Math.min(f7, f14 / this.G);
            }
            float f15 = rectF.left;
            if (!this.n && !this.x) {
                f11 = 0.0f;
            }
            this.M = (this.G * this.E) + ((f15 + f11 + 21.33f + 3.25f + rectF.right) * f13);
            this.N = Math.max(f13 * 21.33f, this.F.getHeight() * this.E) + ((rectF.top + rectF.bottom) * f13);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.L || (document = this.w) == null) ? this.v : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.N);
        int i10 = this.J;
        return round + i10 + i10;
    }

    public float getRadius() {
        return this.N * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.M);
        int i10 = this.I;
        return round + i10 + i10;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        if (this.L) {
            this.s.onAttachedToWindow();
        } else {
            this.r.onAttachedToWindow();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.r.onDetachedFromWindow();
        this.s.onDetachedFromWindow();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.L != z10 && this.K) {
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
        this.L = z10;
        invalidate();
    }

    public void setMaxWidth(int i10) {
        this.a = i10;
        this.c = true;
    }

    public void setText(String str) {
        this.b = str;
        this.c = true;
        requestLayout();
    }
}
