package ug;

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
import gi.k3;
import gi.l3;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.e6;
import org.telegram.messenger.g6;
import org.telegram.messenger.h6;
import org.telegram.messenger.hs;
import org.telegram.messenger.i6;
import org.telegram.messenger.li;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u5;
import org.telegram.ui.Components.xq;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public class l0 extends View {
    public final float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final int J;
    public final int K;
    public boolean L;
    public boolean M;
    public float N;
    public float O;
    public final RectF P;
    public final u5 Q;
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

    public l0(Context context, float f10) {
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
        this.F = 1.0f;
        this.P = new RectF();
        new Path();
        this.Q = new u5(this, 350L, xq.h);
        this.E = f10;
        imageReceiver.B0 = true;
        imageReceiver.K0 = true;
        imageReceiver2.B0 = true;
        imageReceiver2.K0 = true;
        int i3 = (int) (3.0f * f10);
        this.J = i3;
        int i10 = (int) (1.0f * f10);
        this.K = i10;
        setPadding(i3, i10, i3, i10);
        this.h = k2.p1.g(context, R.drawable.map_pin3);
        textPaint.setTextSize(f10 * 24.0f);
        textPaint.setTypeface(org.telegram.messenger.g0.o1("fonts/rcondensedbold.ttf"));
        hs.i(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0079, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TLRPC.Document b(TLRPC.TL_messages_stickerSet tL_messages_stickerSet, String str) {
        if (tL_messages_stickerSet != null && tL_messages_stickerSet.packs != null && tL_messages_stickerSet.documents != null) {
            for (int i3 = 0; i3 < tL_messages_stickerSet.packs.size(); i3++) {
                TLRPC.TL_stickerPack tL_stickerPack = tL_messages_stickerSet.packs.get(i3);
                String str2 = tL_stickerPack.emoticon;
                if (str2 != null && str != null) {
                    ArrayList j10 = i6.j(str2, null);
                    int i10 = 0;
                    while (true) {
                        if (i10 >= j10.size()) {
                            break;
                        }
                        if (!TextUtils.equals(((g6) j10.get(i10)).c, str)) {
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

    public static k3 c(String str) {
        e6 f10 = i6.f(str);
        if (f10 instanceof h6) {
            ((h6) f10).a = false;
        }
        if (f10 == null) {
            return null;
        }
        return new k3(f10, 8);
    }

    public final void a(Canvas canvas) {
        f();
        if (this.G == null) {
            return;
        }
        int i3 = this.J;
        float f10 = i3;
        int i10 = this.K;
        float f11 = i10;
        float f12 = this.N + f10;
        float f13 = this.O + f11;
        RectF rectF = this.P;
        rectF.set(f10, f11, f12, f13);
        float f14 = this.O * 0.2f;
        canvas.drawRoundRect(rectF, f14, f14, this.f);
        boolean z10 = this.n;
        float f15 = this.E;
        RectF rectF2 = this.d;
        if (z10) {
            float d = this.Q.d(this.M);
            if (d > 0.0f) {
                float b10 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f15, f10);
                float f16 = f15 * 21.33f;
                float z11 = com.google.android.recaptcha.internal.a.z(this.O, f16, 2.0f, f11);
                ImageReceiver imageReceiver = this.s;
                imageReceiver.y0(b10, z11, f16, f16);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver.r(), imageReceiver.s());
                imageReceiver.setAlpha(d);
                imageReceiver.h(canvas, null);
                canvas.restore();
            }
            if (d < 1.0f) {
                float b11 = org.telegram.messenger.camera.q.b(rectF2.left, 2.25f, f15, f10);
                float f17 = f15 * 21.33f;
                float z12 = com.google.android.recaptcha.internal.a.z(this.O, f17, 2.0f, f11);
                ImageReceiver imageReceiver2 = this.r;
                imageReceiver2.y0(b11, z12, f17, f17);
                canvas.save();
                canvas.scale(1.2f, 1.2f, imageReceiver2.r(), imageReceiver2.s());
                imageReceiver2.setAlpha(1.0f - d);
                imageReceiver2.h(canvas, null);
                canvas.restore();
            }
        } else if (!this.y) {
            float f18 = rectF2.left;
            float f19 = this.O;
            float f20 = f15 * 21.33f;
            Drawable drawable = this.h;
            drawable.setBounds(((int) (f18 * f15)) + i3, ((int) ((f19 - f20) / 2.0f)) + i10, i3 + ((int) ((f18 + 21.33f) * f15)), i10 + ((int) ((f20 + f19) / 2.0f)));
            drawable.draw(canvas);
        }
        canvas.save();
        canvas.translate(((rectF2.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f) * f15) + f10, (this.O / 2.0f) + f11);
        float f21 = this.F;
        canvas.scale(f21, f21);
        canvas.translate(-this.I, (-this.G.getHeight()) / 2.0f);
        this.G.draw(canvas);
        canvas.restore();
    }

    public final void d(int i3, final String str) {
        boolean z10;
        boolean isEmpty = TextUtils.isEmpty(str);
        ImageReceiver imageReceiver = this.s;
        ImageReceiver imageReceiver2 = this.r;
        if (isEmpty) {
            this.n = false;
            this.w = null;
            this.x = null;
            imageReceiver2.f();
            imageReceiver.f();
            z10 = true;
        } else {
            this.n = true;
            this.w = null;
            this.x = null;
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName.short_name = "StaticEmoji";
            final int i10 = 0;
            li.b0(i3).l0(tL_inputStickerSetShortName, 0, false, false, new u10(this) { // from class: ug.k0
                public final /* synthetic */ l0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i10) {
                        case 0:
                            l0 l0Var = this.b;
                            l0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            l0Var.w = b10;
                            l0Var.r.q0(ac.b(b10), "80_80", l0.c(str2), null, null, 0);
                            l0Var.s.u0(ac.b(l0Var.x), "80_80", ac.b(l0Var.w), "80_80", null, null, l0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            l0 l0Var2 = this.b;
                            l0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            l0Var2.x = b11;
                            if (b11 != null) {
                                l0Var2.s.u0(ac.b(b11), "80_80", ac.b(l0Var2.w), "80_80", null, null, l0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            TLRPC.TL_inputStickerSetShortName tL_inputStickerSetShortName2 = new TLRPC.TL_inputStickerSetShortName();
            tL_inputStickerSetShortName2.short_name = "RestrictedEmoji";
            final int i11 = 1;
            li.b0(i3).l0(tL_inputStickerSetShortName2, 0, false, false, new u10(this) { // from class: ug.k0
                public final /* synthetic */ l0 b;

                {
                    this.b = this;
                }

                @Override // org.telegram.messenger.u10
                public final void a(Object obj) {
                    switch (i11) {
                        case 0:
                            l0 l0Var = this.b;
                            l0Var.getClass();
                            String str2 = str;
                            TLRPC.Document b10 = l0.b((TLRPC.TL_messages_stickerSet) obj, str2);
                            l0Var.w = b10;
                            l0Var.r.q0(ac.b(b10), "80_80", l0.c(str2), null, null, 0);
                            l0Var.s.u0(ac.b(l0Var.x), "80_80", ac.b(l0Var.w), "80_80", null, null, l0.c(str2), 0L, null, null, 0);
                            break;
                        default:
                            l0 l0Var2 = this.b;
                            l0Var2.getClass();
                            String str3 = str;
                            TLRPC.Document b11 = l0.b((TLRPC.TL_messages_stickerSet) obj, str3);
                            l0Var2.x = b11;
                            if (b11 != null) {
                                l0Var2.s.u0(ac.b(b11), "80_80", ac.b(l0Var2.w), "80_80", null, null, l0.c(str3), 0L, null, null, 0);
                                break;
                            }
                            break;
                    }
                }
            });
            z10 = true;
            imageReceiver2.q0(ac.b(this.w), "80_80", c(str), null, null, 0);
            imageReceiver.u0(ac.b(this.x), "80_80", ac.b(this.w), "80_80", null, null, c(str), 0L, null, null, 0);
        }
        this.c = z10;
        requestLayout();
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        a(canvas);
    }

    public final void e(int i3, int i10) {
        Drawable drawable = this.h;
        TextPaint textPaint = this.e;
        Paint paint = this.f;
        if (i3 == 0) {
            paint.setColor(-16777216);
            textPaint.setColor(-1);
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        } else if (i3 == 1) {
            paint.setColor(1275068416);
            textPaint.setColor(-1);
            drawable.setColorFilter(null);
        } else if (i3 == 2) {
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
            int i3 = this.a;
            int i10 = this.J;
            float f11 = (i3 - i10) - i10;
            RectF rectF = this.d;
            float f12 = 2.25f;
            float f13 = rectF.left + ((this.n || this.y) ? 2.25f : 0.0f) + 21.33f + 3.25f + rectF.right;
            float f14 = this.E;
            float f15 = f11 - (f13 * f14);
            float min = Math.min(1.0f, f15 / measureText);
            this.F = min;
            if (min < 0.4f) {
                f10 = 1.0f;
                String str2 = this.b;
                this.G = new StaticLayout(str2, textPaint, l3.a(str2, textPaint), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            } else {
                f10 = 1.0f;
                this.G = new StaticLayout(this.b, textPaint, (int) Math.ceil(measureText), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            }
            this.H = 0.0f;
            this.I = Float.MAX_VALUE;
            for (int i11 = 0; i11 < this.G.getLineCount(); i11++) {
                this.H = Math.max(this.H, this.G.getLineWidth(i11));
                this.I = Math.min(this.I, this.G.getLineLeft(i11));
            }
            if (this.G.getLineCount() > 2) {
                this.F = 0.3f;
            } else {
                this.F = Math.min(f10, f15 / this.H);
            }
            float f16 = rectF.left;
            if (!this.n && !this.y) {
                f12 = 0.0f;
            }
            this.N = (this.H * this.F) + ((f16 + f12 + 21.33f + 3.25f + rectF.right) * f14);
            this.O = Math.max(f14 * 21.33f, this.G.getHeight() * this.F) + ((rectF.top + rectF.bottom) * f14);
            this.c = false;
        }
    }

    public TLRPC.Document getCodeEmojiDocument() {
        TLRPC.Document document;
        return (!this.M || (document = this.x) == null) ? this.w : document;
    }

    public int getHeightInternal() {
        int round = Math.round(this.O);
        int i3 = this.K;
        return round + i3 + i3;
    }

    public float getRadius() {
        return this.O * 0.2f;
    }

    public String getText() {
        return this.b;
    }

    public int getTypesCount() {
        return 4;
    }

    public int getWidthInternal() {
        int round = Math.round(this.N);
        int i3 = this.J;
        return round + i3 + i3;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.L = true;
        if (this.M) {
            this.s.P();
        } else {
            this.r.P();
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.L = false;
        this.r.R();
        this.s.R();
    }

    @Override // android.view.View
    public final void onMeasure(int i3, int i10) {
        f();
        setMeasuredDimension(getWidthInternal(), getHeightInternal());
    }

    public void setIsVideo(boolean z10) {
        if (this.M != z10 && this.L) {
            ImageReceiver imageReceiver = this.s;
            ImageReceiver imageReceiver2 = this.r;
            if (z10) {
                imageReceiver2.R();
                imageReceiver.P();
            } else {
                imageReceiver2.P();
                imageReceiver.R();
            }
        }
        this.M = z10;
        invalidate();
    }

    public void setMaxWidth(int i3) {
        this.a = i3;
        this.c = true;
    }

    public void setText(String str) {
        this.b = str;
        this.c = true;
        requestLayout();
    }
}
