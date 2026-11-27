// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.e;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class zj6 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final tsb K;
    public final /* synthetic */ ck6 L;
    public int a;
    public final LinearLayout b;
    public final TextView c;
    public final TextView d;
    public final LinearLayout e;
    public final TextView f;
    public final TextView h;
    public TLRPC.TL_chatInviteExported n;
    public int r;
    public final Paint s;
    public final Paint w;
    public final RectF x;
    public final ImageView y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zj6(ck6 ck6Var, Context context) {
        super(context);
        this.L = ck6Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new RectF();
        this.F = 1.0f;
        this.K = new tsb();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, tre.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        int i = aob.G6;
        yob.X(textView, i, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, tre.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i2 = aob.y6;
        yob.X(textView2, i2, null);
        linearLayout.addView(textView2, tre.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        yob.s(imageView, aob.Li, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new sa5(this, (byte) 25));
        int i3 = aob.i6;
        hf0 f0 = aob.f0(aob.w0(null, i3, false), 1, -1);
        uob M = yob.M(i3);
        imageView.setBackground(f0);
        yob.j(imageView, f0, null, M, null);
        addView(imageView, tre.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        yob.h(aob.d6, null, this);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 16.0f);
        yob.X(textView3, i, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(hl.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, tre.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        yob.X(textView4, i2, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, tre.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, tre.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f, int i) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return aob.w0(null, aob.lk, false);
        }
        if (i == 3) {
            return aob.w0(null, aob.ka, false);
        }
        if (i != 1) {
            return i == 2 ? aob.w0(null, aob.oa, false) : i == 4 ? aob.w0(null, aob.V8, false) : aob.w0(null, aob.Fi, false);
        }
        if (f > 0.5f) {
            return vm2.f(1.0f - ((f - 0.5f) / 0.5f), aob.w0(null, aob.na, false), aob.w0(null, aob.oa, false));
        }
        return vm2.f(1.0f - (f / 0.5f), aob.w0(null, aob.oa, false), aob.w0(null, aob.ka, false));
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i) {
        int i2;
        String G;
        int i3;
        this.J = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.a = -1;
            this.F = 1.0f;
        }
        this.n = tL_chatInviteExported;
        this.r = i;
        if (tL_chatInviteExported == null) {
            return;
        }
        int L = hl.L(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.y;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder b1 = nza.b1(false, "⭐️ ".concat(ob6.E(tL_chatInviteExported.subscription_pricing.amount, ',')), 0.75f, null);
            TextView textView = this.f;
            textView.setText(b1);
            int i4 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i4 == 2592000) {
                textView2.setText(ob6.M0(2131744713, null));
            } else if (i4 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i4 == 60) {
                textView2.setText("each minute");
            }
            L = hl.L(28.0f) + ((int) Math.max(kg5.h(textView.getText(), textView.getPaint()), kg5.h(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        ck6 ck6Var = this.L;
        TextView textView3 = this.c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            pv3.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb = new StringBuilder();
            i2 = ((e) ck6Var).currentAccount;
            sb.append(uc7.s1(i2).N2);
            sb.append("/");
            sb.append(tL_chatInviteExported.link.substring(14));
            textView3.setText(sb.toString());
        } else {
            boolean startsWith = tL_chatInviteExported.link.startsWith("https://t.me/joinchat/");
            String str = tL_chatInviteExported.link;
            if (startsWith) {
                textView3.setText(str.substring(22));
            } else {
                boolean startsWith2 = str.startsWith("https://");
                String str2 = tL_chatInviteExported.link;
                if (startsWith2) {
                    textView3.setText(str2.substring(8));
                } else {
                    textView3.setText(str2);
                }
            }
        }
        int i5 = tL_chatInviteExported.usage;
        if (i5 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            G = ob6.M0(tL_chatInviteExported.subscription_pricing != null ? 2131747916 : 2131747918, null);
        } else {
            int i6 = tL_chatInviteExported.usage_limit;
            if (i6 > 0 && i5 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                G = ob6.G(i6, "CanJoin", new Object[0]);
            } else if (i6 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                G = ob6.G(i5, "PeopleJoined", new Object[0]) + ", " + ob6.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                G = i5 > 0 ? ob6.G(i5, "PeopleJoined", new Object[0]) : "";
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        G = G.concat(", ");
                    }
                    G = G.concat(ob6.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(G);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            np3 np3Var = new np3();
            np3Var.b = hl.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131747048, null));
        } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                String M0 = ob6.M0(tL_chatInviteExported.subscription_pricing != null ? 2131747916 : 2131747918, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) M0);
            }
            np3 np3Var2 = new np3();
            np3Var2.b = hl.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z = tL_chatInviteExported.revoked;
            if (z || (i3 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i3) {
                spannableStringBuilder2.append((CharSequence) ob6.M0(z ? 2131745742 : 2131750841, null));
            } else {
                spannableStringBuilder2.append((CharSequence) ob6.M0(2131748654, null));
            }
        } else if (tL_chatInviteExported.expire_date > 0) {
            np3 np3Var3 = new np3();
            np3Var3.b = hl.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((ck6Var.o0 * 1000) + System.currentTimeMillis());
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 86400000) {
                spannableStringBuilder2.append((CharSequence) ob6.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
            } else {
                long j = currentTimeMillis / 1000;
                int i7 = (int) (j % 60);
                long j2 = j / 60;
                Locale locale = Locale.ENGLISH;
                spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j2 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j2 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i7)));
                this.J = true;
            }
        }
        if (tL_chatInviteExported.request_needed) {
            np3 np3Var4 = new np3();
            np3Var4.b = hl.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(np3Var4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) ob6.M0(2131754202, null));
        }
        this.d.setText(spannableStringBuilder2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        if (r5.revoked == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e0  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        int i;
        float f3;
        float f4;
        float f5;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        boolean z;
        int i2;
        Canvas canvas2 = canvas;
        if (this.n == null) {
            return;
        }
        int L = hl.L(32.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        boolean z2 = tL_chatInviteExported2.expired;
        ck6 ck6Var = this.L;
        if (z2 || tL_chatInviteExported2.revoked) {
            f = 32.0f;
            f2 = 1.0f;
            i = tL_chatInviteExported2.revoked ? 4 : 3;
            f3 = 0.0f;
            f4 = 1.0f;
        } else {
            if (tL_chatInviteExported2.expire_date <= 0) {
                f = 32.0f;
                if (tL_chatInviteExported2.usage_limit > 0) {
                    f4 = 1.0f;
                    f2 = 1.0f;
                } else {
                    i = 0;
                    f3 = 0.0f;
                    f4 = 1.0f;
                    f2 = 1.0f;
                }
            } else {
                long currentTimeMillis = (ck6Var.o0 * 1000) + System.currentTimeMillis();
                TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.n;
                f = 32.0f;
                long j = tL_chatInviteExported3.expire_date * 1000;
                int i3 = tL_chatInviteExported3.start_date;
                if (i3 <= 0) {
                    i3 = tL_chatInviteExported3.date;
                }
                f2 = 1.0f;
                long j2 = i3 * 1000;
                f4 = 1.0f - ((currentTimeMillis - j2) / (j - j2));
                tL_chatInviteExported2 = tL_chatInviteExported3;
            }
            int i4 = tL_chatInviteExported2.usage_limit;
            f3 = Math.min(f4, i4 > 0 ? (i4 - tL_chatInviteExported2.usage) / i4 : f2);
            if (f3 <= 0.0f) {
                this.n.expired = true;
                hl.V3(ck6Var.b);
                i = 3;
            } else {
                i = 1;
            }
        }
        int i5 = this.a;
        if (i != i5 && i5 >= 0) {
            this.E = i5;
            this.F = 0.0f;
            if ((i5 != 2 && i5 != 1) || i == 2 || i == 1) {
                this.H = false;
            } else {
                this.H = true;
            }
        }
        this.a = i;
        float f6 = this.F;
        if (f6 != f2) {
            float f7 = f6 + 0.064f;
            this.F = f7;
            if (f7 >= f2) {
                f5 = f2;
                this.F = f5;
                this.H = false;
            } else {
                f5 = f2;
                invalidate();
            }
        } else {
            f5 = f2;
        }
        int f8 = this.F != f5 ? vm2.f(this.F, a(f3, this.E), a(f3, i)) : a(f3, i);
        Paint paint = this.s;
        paint.setColor(f8);
        canvas2.drawCircle(L, measuredHeight, hl.L(f) / 2.0f, paint);
        if (!this.H) {
            TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.n;
            if (!tL_chatInviteExported4.expired) {
                if (tL_chatInviteExported4.expire_date > 0) {
                }
            }
            tL_chatInviteExported = this.n;
            if (tL_chatInviteExported.subscription_pricing == null) {
                ck6Var.b0.setBounds(L - hl.L(12.0f), measuredHeight - hl.L(12.0f), hl.L(12.0f) + L, hl.L(12.0f) + measuredHeight);
                ck6Var.b0.draw(canvas2);
            } else if (tL_chatInviteExported.revoked) {
                ck6Var.a0.setBounds(L - hl.L(12.0f), measuredHeight - hl.L(12.0f), hl.L(12.0f) + L, hl.L(12.0f) + measuredHeight);
                ck6Var.a0.draw(canvas2);
            } else {
                ck6Var.Z.setBounds(L - hl.L(12.0f), measuredHeight - hl.L(12.0f), hl.L(12.0f) + L, hl.L(12.0f) + measuredHeight);
                ck6Var.Z.draw(canvas2);
            }
            if (this.I) {
                return;
            }
            canvas2.drawLine(hl.L(70.0f), getMeasuredHeight() - 1, hl.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), aob.j0);
            return;
        }
        f4 = this.G;
        float f9 = f4;
        Paint paint2 = this.w;
        paint2.setColor(f8);
        float L2 = L - hl.L(20.0f);
        float L3 = measuredHeight - hl.L(20.0f);
        float L4 = hl.L(20.0f) + L;
        float L5 = hl.L(20.0f) + measuredHeight;
        RectF rectF = this.x;
        rectF.set(L2, L3, L4, L5);
        if (this.F == 1.0f || (((i2 = this.E) == 2 || i2 == 1) && !this.H)) {
            float f10 = (-f9) * 360.0f;
            canvas.drawArc(rectF, -90.0f, f10, false, paint2);
            this.K.a(f10, 1.0f, canvas, paint2, rectF);
            canvas2 = canvas;
        } else {
            canvas2.save();
            boolean z3 = this.H;
            float f11 = this.F;
            if (z3) {
                f11 = 1.0f - f11;
            }
            float f12 = (float) ((0.3f * r10) + 0.7d);
            canvas2.scale(f12, f12, rectF.centerX(), rectF.centerY());
            float f13 = (-f9) * 360.0f;
            canvas2.drawArc(rectF, -90.0f, f13, false, paint2);
            this.K.a(f13, f11, canvas, paint2, rectF);
            canvas.restore();
            canvas2 = canvas;
        }
        z = ((e) ck6Var).isPaused;
        if (!z) {
            invalidate();
        }
        this.G = f9;
        tL_chatInviteExported = this.n;
        if (tL_chatInviteExported.subscription_pricing == null) {
        }
        if (this.I) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(60.0f), TLObject.FLAG_30));
        this.w.setStrokeWidth(hl.L(2.0f));
    }
}
