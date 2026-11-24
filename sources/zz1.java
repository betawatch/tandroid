// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import org.telegram.ui.Components.ChatActivityEnterView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zz1 extends View {
    public StaticLayout E;
    public float F;
    public TextPaint G;
    public final float H;
    public float I;
    public final /* synthetic */ ChatActivityEnterView J;
    public boolean a;
    public boolean b;
    public String c;
    public long d;
    public long e;
    public long f;
    public long h;
    public long n;
    public boolean r;
    public final SpannableStringBuilder s;
    public final SpannableStringBuilder w;
    public SpannableStringBuilder x;
    public StaticLayout y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zz1(ChatActivityEnterView chatActivityEnterView, Context context) {
        super(context);
        this.J = chatActivityEnterView;
        this.s = new SpannableStringBuilder();
        this.w = new SpannableStringBuilder();
        this.x = new SpannableStringBuilder();
        this.H = gm.L(15.0f);
    }

    public final void a(long j) {
        this.a = true;
        long currentTimeMillis = System.currentTimeMillis() - j;
        this.d = currentTimeMillis;
        this.h = j;
        this.f = currentTimeMillis;
        invalidate();
    }

    public final void b() {
        if (this.a) {
            this.a = false;
            if (this.d > 0) {
                this.e = System.currentTimeMillis();
            }
            invalidate();
        }
        this.f = 0L;
    }

    public float getLeftProperty() {
        return this.I;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        long j;
        String str;
        int threadMessageId;
        TextPaint textPaint = this.G;
        ChatActivityEnterView chatActivityEnterView = this.J;
        if (textPaint == null) {
            TextPaint textPaint2 = new TextPaint(1);
            this.G = textPaint2;
            textPaint2.setTextSize(gm.L(14.0f));
            this.G.setTypeface(gm.o());
            this.G.setFontFeatureSettings("tnum");
            TextPaint textPaint3 = this.G;
            int i = cmb.F6;
            int i2 = ChatActivityEnterView.z7;
            textPaint3.setColor(chatActivityEnterView.F0(i));
        }
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = this.a ? this.r ? this.h : currentTimeMillis - this.d : this.e - this.d;
        long j3 = j2 / 1000;
        int i3 = ((int) (j2 % 1000)) / 10;
        long j4 = 0;
        if (chatActivityEnterView.d1 && j2 >= 59500 && !this.b) {
            chatActivityEnterView.t3 = -1.0f;
            chatActivityEnterView.P3.F1(3, 0, chatActivityEnterView.P ? Integer.MAX_VALUE : 0, chatActivityEnterView.W6, 0L, true);
            by1 by1Var = chatActivityEnterView.K0;
            chatActivityEnterView.W6 = 0L;
            by1Var.setEffect(0L);
            this.b = true;
        }
        if (this.a && currentTimeMillis > this.f + 5000) {
            this.f = currentTimeMillis;
            oc7 r1 = oc7.r1(chatActivityEnterView.R);
            long j5 = chatActivityEnterView.G3;
            threadMessageId = chatActivityEnterView.getThreadMessageId();
            r1.J4(chatActivityEnterView.d1 ? 7 : 1, 0, j5, threadMessageId, null);
        }
        long j6 = (int) j3;
        Typeface typeface = gm.a;
        StringBuilder sb = new StringBuilder();
        long j7 = j6 / 60;
        if (j7 >= 60) {
            sb.append(j7 / 60);
            sb.append(":");
            gm.o2(j7 % 60, sb);
            sb.append(":");
            gm.o2(j6 % 60, sb);
            sb.append(",");
            sb.append(i3 / 10);
        } else {
            sb.append(j7);
            sb.append(":");
            gm.o2(j6 % 60, sb);
            sb.append(",");
            sb.append(i3 / 10);
        }
        String sb2 = sb.toString();
        if (sb2.length() < 3 || (str = this.c) == null || str.length() < 3 || sb2.length() != this.c.length() || sb2.charAt(sb2.length() - 3) == this.c.charAt(sb2.length() - 3)) {
            j = 0;
            SpannableStringBuilder spannableStringBuilder = this.x;
            if (spannableStringBuilder == null) {
                spannableStringBuilder = new SpannableStringBuilder(sb2);
                this.x = spannableStringBuilder;
            }
            if (spannableStringBuilder.length() == 0 || this.x.length() != sb2.length()) {
                this.x.clear();
                this.x.append((CharSequence) sb2);
            } else {
                this.x.replace(r15.length() - 1, this.x.length(), (CharSequence) sb2, (sb2.length() - 1) - (sb2.length() - this.x.length()), sb2.length());
            }
        } else {
            int length = sb2.length();
            SpannableStringBuilder spannableStringBuilder2 = this.s;
            spannableStringBuilder2.clear();
            SpannableStringBuilder spannableStringBuilder3 = this.w;
            spannableStringBuilder3.clear();
            this.x.clear();
            spannableStringBuilder2.append((CharSequence) sb2);
            spannableStringBuilder3.append((CharSequence) this.c);
            this.x.append((CharSequence) sb2);
            int i4 = -1;
            int i5 = -1;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                j = j4;
                if (i6 >= length - 1) {
                    break;
                }
                if (this.c.charAt(i6) != sb2.charAt(i6)) {
                    if (i8 == 0) {
                        i5 = i6;
                    }
                    i8++;
                    if (i7 != 0) {
                        vy2 vy2Var = new vy2((byte) 1);
                        if (i6 == length - 2) {
                            i7++;
                        }
                        int i9 = i7 + i4;
                        spannableStringBuilder2.setSpan(vy2Var, i4, i9, 33);
                        spannableStringBuilder3.setSpan(vy2Var, i4, i9, 33);
                        i7 = 0;
                    }
                } else {
                    if (i7 == 0) {
                        i4 = i6;
                    }
                    i7++;
                    if (i8 != 0) {
                        this.x.setSpan(new vy2((byte) 1), i5, i8 + i5, 33);
                        i8 = 0;
                    }
                }
                i6++;
                j4 = j;
            }
            if (i7 != 0) {
                vy2 vy2Var2 = new vy2((byte) 1);
                int i10 = i7 + i4 + 1;
                spannableStringBuilder2.setSpan(vy2Var2, i4, i10, 33);
                spannableStringBuilder3.setSpan(vy2Var2, i4, i10, 33);
            }
            if (i8 != 0) {
                this.x.setSpan(new vy2((byte) 1), i5, i8 + i5, 33);
            }
            TextPaint textPaint4 = this.G;
            int measuredWidth = getMeasuredWidth();
            Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
            this.y = new StaticLayout(spannableStringBuilder2, textPaint4, measuredWidth, alignment, 1.0f, 0.0f, false);
            this.E = new StaticLayout(spannableStringBuilder3, this.G, getMeasuredWidth(), alignment, 1.0f, 0.0f, false);
            this.F = 1.0f;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j8 = this.n;
        long min = j8 == j ? 16L : Math.min(50L, elapsedRealtime - j8);
        this.n = elapsedRealtime;
        float f = this.F;
        if (f != 0.0f) {
            float f2 = f - (min / 116.0f);
            this.F = f2;
            if (f2 < 0.0f) {
                this.F = 0.0f;
            }
        }
        float measuredHeight = getMeasuredHeight() / 2;
        if (this.F == 0.0f) {
            this.x.clearSpans();
            StaticLayout staticLayout = new StaticLayout(this.x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            canvas.save();
            hg9.m(staticLayout.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout.draw(canvas);
            canvas.restore();
            this.I = staticLayout.getLineWidth(0) + 0.0f;
        } else {
            StaticLayout staticLayout2 = this.y;
            float f3 = this.H;
            if (staticLayout2 != null) {
                canvas.save();
                this.G.setAlpha((int) ((1.0f - this.F) * 255.0f));
                canvas.translate(0.0f, (measuredHeight - (this.y.getHeight() / 2.0f)) - (this.F * f3));
                this.y.draw(canvas);
                canvas.restore();
            }
            if (this.E != null) {
                canvas.save();
                this.G.setAlpha((int) (this.F * 255.0f));
                canvas.translate(0.0f, td4.A(1.0f, this.F, f3, measuredHeight - (this.E.getHeight() / 2.0f)));
                this.E.draw(canvas);
                canvas.restore();
            }
            canvas.save();
            this.G.setAlpha(nm7.d4);
            StaticLayout staticLayout3 = new StaticLayout(this.x, this.G, getMeasuredWidth(), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            hg9.m(staticLayout3.getHeight(), 2.0f, measuredHeight, 0.0f, canvas);
            staticLayout3.draw(canvas);
            canvas.restore();
            this.I = staticLayout3.getLineWidth(0) + 0.0f;
        }
        this.c = sb2;
        if ((this.a || this.F != 0.0f) && !this.r) {
            invalidate();
        }
    }

    public void setExternalFrameClock(boolean z) {
        this.r = z;
        this.n = SystemClock.elapsedRealtime();
        invalidate();
    }
}
