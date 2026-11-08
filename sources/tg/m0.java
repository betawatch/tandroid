package tg;

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
import fi.l3;
import fi.m3;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.c20;
import org.telegram.messenger.e6;
import org.telegram.messenger.g6;
import org.telegram.messenger.h6;
import org.telegram.messenger.hc;
import org.telegram.messenger.i6;
import org.telegram.messenger.qs;
import org.telegram.messenger.ui;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public class m0 extends View {
    public final float D;
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
    public final w5 P;
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
    public TLRPC.Document w;
    public TLRPC.Document x;
    public boolean y;

    public m0(Context context, float f10) {
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
        this.P = new w5(this, 350L, xq.h);
        this.D = f10;
        imageReceiver.A0 = true;
        imageReceiver.J0 = true;
        imageReceiver2.A0 = true;
        imageReceiver2.J0 = true;
        int i7 = (int) (3.0f * f10);
        this.I = i7;
        int i10 = (int) (1.0f * f10);
        this.J = i10;
        setPadding(i7, i10, i7, i10);
        this.h = jg.g.h(context, R.drawable.map_pin3);
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        qs.i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.packs != null && tL_messages_stickerSet.documents != null) {
            for (int i7 = 0; i7 < tL_messages_stickerSet.packs.size(); i7++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i7);
                String str2 = tL_stickerPack.emoticon;
                if (str2 != null && str != null) {
                    ArrayList j3 = i6.j(str2, null);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= j3.size()) {
                            break;
                        }
                        if (!TextUtils.equals(((g6) j3.get(i10)).c, str)) {
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
        }
        return null;
    }

    public static l3 c(String str) {
        e6 f10 = i6.f(str);
        if (f10 instanceof h6) {
            ((h6) f10).a = false;
        }
        if (f10 == null) {
            return null;
        }
        return new l3(f10, 8);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.F == null) {
            return;
        }
        int i7 = this.I;
        float f10 = i7;
        int i10 = this.J;
        float f11 = i10;
        float f12 = this.M + f10;
        float f13 = this.N + f11;
        RectF rectF = this.O;
        rectF.set(f10, f11, f12, f13);
        float f14 = this.N * 0.2f;
        canvas.drawRoundRect(rectF, f14, f14, this.f);
        boolean z9 = this.n;
        float f15 = this.D;
        RectF rectF2 = this.d;
        if (z9) {
            float d = this.P.d(this.L);
            if (d > 0.0f) {
                float b10 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f15, f10);
                float f16 = f15 * 21.33f;
                float A = com.google.android.recaptcha.internal.a.A(this.N, f16, 2.0f, f11);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.y0(b10, A, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float b11 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f15, f10);
                float f17 = f15 * 21.33f;
                float A2 = com.google.android.recaptcha.internal.a.A(this.N, f17, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.y0(b11, A2, f17, f17);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.y) {
            float f18 = rectF2.left;
            float f19 = this.N;
            float f20 = f15 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f18 * f15)) + i7, ((int) ((f19 - f20) / 2.0f)) + i10, i7 + ((int) ((f18 + 21.33f) * f15)), i10 + ((int) ((f20 + f19) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f15) + f10, (this.N / 2.0f) + f11);
        float f21 = this.E;
        canvas.scale(f21, f21);
        canvas.translate(-this.H, (-this.F.getHeight()) / 2.0f);
        this.F.draw(canvas);
        canvas.restore();
    }

    public final void d(int i7, final String str) {
        boolean z9;
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.s;
        ImageReceiver imageReceiver2 = this.r;
        if (isEmpty) {
            this.n = false;
            this.w = null;
            this.x = null;
            imageReceiver2.f();
            imageReceiver.f();
            z9 = true;
        } else {
            this.n = true;
            this.w = null;
            this.x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            final int i10 = 0;
            ui.b0(i7).l0(tL_inputStickerSetShortName, 0, false, false, new c20(this) { // from class: tg.l0
                public final /* synthetic */ m0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            m0 m0Var = this.b;
                            m0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = m0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            m0Var.w = b10;
                            m0Var.r.q0(hc.b(b10), "80_80", m0.c(str2), null, null, 0);
                            m0Var.s.u0(hc.b(m0Var.x), "80_80", hc.b(m0Var.w), "80_80", null, null, m0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            m0 m0Var2 = this.b;
                            m0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = m0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            m0Var2.x = b11;
                            if (b11 != null) {
                                m0Var2.s.u0(hc.b(b11), "80_80", hc.b(m0Var2.w), "80_80", null, null, m0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i11 = 1;
            ui.b0(i7).l0(tL_inputStickerSetShortName2, 0, false, false, new c20(this) { // from class: tg.l0
                public final /* synthetic */ m0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.c20
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            m0 m0Var = this.b;
                            m0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = m0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            m0Var.w = b10;
                            m0Var.r.q0(hc.b(b10), "80_80", m0.c(str2), null, null, 0);
                            m0Var.s.u0(hc.b(m0Var.x), "80_80", hc.b(m0Var.w), "80_80", null, null, m0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            m0 m0Var2 = this.b;
                            m0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = m0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            m0Var2.x = b11;
                            if (b11 != null) {
                                m0Var2.s.u0(hc.b(b11), "80_80", hc.b(m0Var2.w), "80_80", null, null, m0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            z9 = true;
            imageReceiver2.q0(hc.b(this.w), "80_80", c(str), null, null, 0);
            imageReceiver.u0(hc.b(this.x), "80_80", hc.b(this.w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.c = z9;
        requestLayout();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i7, int i10) {
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        Paint paint = this.f;
        if (i7 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i7 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i7 == 2) {
            paint.setColor(-1);
            textPaint.setColor(-16777216);
            drawable.setColorFilter(null);
        } else {
            paint.setColor(i10);
            int i11 = org.telegram.messenger.g0.B(i10) < 0.721f ? -1 : -16777216;
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
            int i7 = this.a;
            int i10 = this.I;
            float f11 = (i7 - i10) - i10;
            RectF rectF = this.d;
            float f12 = 2.25f;
            float f13 = rectF.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f14 = this.D;
            float f15 = f11 - (f13 * f14);
            float min = Math.min(1.0f, f15 / measureText);
            this.E = min;
            if (min < 0.4f) {
                f10 = 1.0f;
                String str2 = this.b;
                this.F = new StaticLayout(str2, textPaint, m3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f10 = 1.0f;
                this.F = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.G = 0.0f;
            this.H = Float.MAX_VALUE;
            for (int i11 = 0; i11 < this.F.getLineCount(); i11++) {
                this.G = Math.max(this.G, this.F.getLineWidth(i11));
                this.H = Math.min(this.H, this.F.getLineLeft(i11));
            }
            if (this.F.getLineCount() > 2) {
                this.E = 0.3f;
            } else {
                this.E = Math.min(f10, f15 / this.G);
            }
            float f16 = rectF.left;
            if (!this.n && !this.y) {
                f12 = 0.0f;
            }
            this.M = (this.G * this.E) + ((f16 + f12 + 21.33f + 3.25f + rectF.right) * f14);
            this.N = Math.max(f14 * 21.33f, this.F.getHeight() * this.E) + ((rectF.top + rectF.bottom) * f14);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.L || (document = this.x) == null) ? this.w : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.N);
        int i7 = this.J;
        return round + i7 + i7;
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
        int i7 = this.I;
        return round + i7 + i7;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.K = true;
        if (this.L) {
            this.s.P();
        } else {
            this.r.P();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.K = false;
        this.r.R();
        this.s.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i10) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z9) {
        if (this.L != z9 && this.K) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z9) {
                imageReceiver2.R();
                imageReceiver.P();
            } else {
                imageReceiver2.P();
                imageReceiver.R();
            }
        }
        this.L = z9;
        invalidate();
    }

    public void setMaxWidth(int i7) {
        this.a = i7;
        this.c = true;
    }

    public void setText(String str) {
        this.b = str;
        this.c = true;
        requestLayout();
    }
}
