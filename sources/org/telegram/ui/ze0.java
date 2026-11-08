package org.telegram.ui;

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

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class ze0 extends FrameLayout {
    public int D;
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.c01 J;
    public final /* synthetic */ cf0 K;
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
    public ze0(cf0 cf0Var, Context context) {
        super(context);
        this.K = cf0Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new RectF();
        this.E = 1.0f;
        this.J = new org.telegram.ui.Components.c01();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, c8.ha.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        int i7 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i7, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, c8.ha.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        linearLayout.addView(textView2, c8.ha.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ii, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new g40(this, 10));
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        addView(imageView, c8.ha.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, i7, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, c8.ha.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, c8.ha.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, c8.ha.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i7) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false);
        }
        if (i7 == 3) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ka, false);
        }
        if (i7 != 1) {
            return i7 == 2 ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oa, false) : i7 == 4 ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V8, false) : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        }
        if (f10 > 0.5f) {
            return i0.a.f(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.na, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oa, false));
        }
        return i0.a.f(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oa, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ka, false));
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i7) {
        int i10;
        String G;
        int i11;
        this.I = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.a = -1;
            this.E = 1.0f;
        }
        this.n = tL_chatInviteExported;
        this.r = i7;
        if (tL_chatInviteExported == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.y;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder a12 = bi.dd.a1(false, jg.g.m(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f;
            textView.setText(a12);
            int i12 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i12 == 2592000) {
                textView2.setText(org.telegram.messenger.id.M0(2131745059, null));
            } else if (i12 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i12 == 60) {
                textView2.setText("each minute");
            }
            L = org.telegram.messenger.g0.L(28.0f) + ((int) Math.max(fi.m3.h(textView.getText(), textView.getPaint()), fi.m3.h(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        cf0 cf0Var = this.K;
        TextView textView3 = this.c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.i6.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i10 = ((org.telegram.ui.ActionBar.f2) cf0Var).currentAccount;
            sb2.append(org.telegram.messenger.qp.s1(i10).U2);
            sb2.append("/");
            sb2.append(tL_chatInviteExported.link.substring(14));
            textView3.setText(sb2.toString());
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/joinchat/")) {
            textView3.setText(tL_chatInviteExported.link.substring(22));
        } else if (tL_chatInviteExported.link.startsWith("https://")) {
            textView3.setText(tL_chatInviteExported.link.substring(8));
        } else {
            textView3.setText(tL_chatInviteExported.link);
        }
        int i13 = tL_chatInviteExported.usage;
        if (i13 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            G = org.telegram.messenger.id.M0(tL_chatInviteExported.subscription_pricing != null ? 2131748186 : 2131748188, null);
        } else {
            int i14 = tL_chatInviteExported.usage_limit;
            if (i14 > 0 && i13 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                G = org.telegram.messenger.id.G(i14, "CanJoin", new Object[0]);
            } else if (i14 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                G = org.telegram.messenger.id.G(tL_chatInviteExported.usage, "PeopleJoined", new Object[0]) + ", " + org.telegram.messenger.id.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                G = i13 > 0 ? org.telegram.messenger.id.G(i13, "PeopleJoined", new Object[0]) : "";
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        G = rf.b.r(G, ", ");
                    }
                    StringBuilder m10 = com.google.android.recaptcha.internal.a.m(G);
                    m10.append(org.telegram.messenger.id.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                    G = m10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(G);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs();
            fsVar.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131747322, null));
        } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                String M0 = org.telegram.messenger.id.M0(tL_chatInviteExported.subscription_pricing != null ? 2131748186 : 2131748188, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) M0);
            }
            org.telegram.ui.Components.fs fsVar2 = new org.telegram.ui.Components.fs();
            fsVar2.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z9 = tL_chatInviteExported.revoked;
            if (z9 || (i11 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i11) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(z9 ? 2131746018 : 2131750877, null));
            } else {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131748901, null));
            }
        } else if (tL_chatInviteExported.expire_date > 0) {
            org.telegram.ui.Components.fs fsVar3 = new org.telegram.ui.Components.fs();
            fsVar3.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((cf0Var.n0 * 1000) + System.currentTimeMillis());
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 86400000) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
            } else {
                long j3 = currentTimeMillis / 1000;
                int i15 = (int) (j3 % 60);
                long j10 = j3 / 60;
                Locale locale = Locale.ENGLISH;
                spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j10 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i15)));
                this.I = true;
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.fs fsVar4 = new org.telegram.ui.Components.fs();
            fsVar4.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.id.M0(2131754209, null));
        }
        this.d.setText(spannableStringBuilder2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0101, code lost:
    
        if (r6.revoked == false) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00db  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onDraw(Canvas canvas) {
        float f10;
        int i7;
        float f11;
        float f12;
        int i10;
        float f13;
        boolean z9;
        float f14;
        Paint paint;
        RectF rectF;
        boolean z10;
        int i11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        Canvas canvas2 = canvas;
        if (this.n == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(32.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        boolean z11 = tL_chatInviteExported2.expired;
        cf0 cf0Var = this.K;
        if (z11 || tL_chatInviteExported2.revoked) {
            f10 = 32.0f;
            i7 = tL_chatInviteExported2.revoked ? 4 : 3;
        } else {
            int i12 = tL_chatInviteExported2.expire_date;
            if (i12 > 0 || tL_chatInviteExported2.usage_limit > 0) {
                if (i12 > 0) {
                    long currentTimeMillis = (cf0Var.n0 * 1000) + System.currentTimeMillis();
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.n;
                    f10 = 32.0f;
                    long j3 = tL_chatInviteExported3.expire_date * 1000;
                    int i13 = tL_chatInviteExported3.start_date;
                    if (i13 <= 0) {
                        i13 = tL_chatInviteExported3.date;
                    }
                    long j10 = i13 * 1000;
                    f12 = 1.0f - ((currentTimeMillis - j10) / (j3 - j10));
                } else {
                    f10 = 32.0f;
                    f12 = 1.0f;
                }
                int i14 = this.n.usage_limit;
                f11 = Math.min(f12, i14 > 0 ? (i14 - r3.usage) / i14 : 1.0f);
                if (f11 <= 0.0f) {
                    this.n.expired = true;
                    org.telegram.messenger.g0.b4(cf0Var.b);
                    i7 = 3;
                } else {
                    i7 = 1;
                }
                i10 = this.a;
                if (i7 != i10 && i10 >= 0) {
                    this.D = i10;
                    this.E = 0.0f;
                    if ((i10 == 2 && i10 != 1) || i7 == 2 || i7 == 1) {
                        this.G = false;
                    } else {
                        this.G = true;
                    }
                }
                this.a = i7;
                f13 = this.E;
                if (f13 != 1.0f) {
                    float f15 = f13 + 0.064f;
                    this.E = f15;
                    if (f15 >= 1.0f) {
                        this.E = 1.0f;
                        this.G = false;
                    } else {
                        invalidate();
                    }
                }
                int f16 = this.E == 1.0f ? i0.a.f(this.E, a(f11, this.D), a(f11, i7)) : a(f11, i7);
                Paint paint2 = this.s;
                paint2.setColor(f16);
                canvas2.drawCircle(L, measuredHeight, org.telegram.messenger.g0.L(f10) / 2.0f, paint2);
                z9 = this.G;
                if (!z9) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.n;
                    if (!tL_chatInviteExported4.expired) {
                        if (tL_chatInviteExported4.expire_date > 0) {
                        }
                    }
                    tL_chatInviteExported = this.n;
                    if (tL_chatInviteExported.subscription_pricing != null) {
                        cf0Var.a0.setBounds(L - org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + L, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
                        cf0Var.a0.draw(canvas2);
                    } else if (tL_chatInviteExported.revoked) {
                        cf0Var.Z.setBounds(L - org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + L, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
                        cf0Var.Z.draw(canvas2);
                    } else {
                        cf0Var.Y.setBounds(L - org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + L, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
                        cf0Var.Y.draw(canvas2);
                    }
                    if (this.H) {
                        canvas2.drawLine(org.telegram.messenger.g0.L(70.0f), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
                        return;
                    }
                    return;
                }
                if (z9) {
                    f12 = this.F;
                }
                f14 = f12;
                paint = this.w;
                paint.setColor(f16);
                float L2 = L - org.telegram.messenger.g0.L(20.0f);
                float L3 = measuredHeight - org.telegram.messenger.g0.L(20.0f);
                float L4 = org.telegram.messenger.g0.L(20.0f) + L;
                float L5 = org.telegram.messenger.g0.L(20.0f) + measuredHeight;
                rectF = this.x;
                rectF.set(L2, L3, L4, L5);
                if (this.E != 1.0f || (((i11 = this.D) == 2 || i11 == 1) && !this.G)) {
                    float f17 = (-f14) * 360.0f;
                    canvas.drawArc(rectF, -90.0f, f17, false, paint);
                    this.J.a(f17, 1.0f, canvas, paint, rectF);
                    canvas2 = canvas;
                } else {
                    canvas2.save();
                    float f18 = this.G ? 1.0f - this.E : this.E;
                    float f19 = (float) ((0.3f * f18) + 0.7d);
                    canvas2.scale(f19, f19, rectF.centerX(), rectF.centerY());
                    float f20 = (-f14) * 360.0f;
                    canvas2.drawArc(rectF, -90.0f, f20, false, paint);
                    this.J.a(f20, f18, canvas, paint, rectF);
                    canvas.restore();
                    canvas2 = canvas;
                }
                z10 = ((org.telegram.ui.ActionBar.f2) cf0Var).isPaused;
                if (!z10) {
                    invalidate();
                }
                this.F = f14;
                tL_chatInviteExported = this.n;
                if (tL_chatInviteExported.subscription_pricing != null) {
                }
                if (this.H) {
                }
            } else {
                f10 = 32.0f;
                i7 = 0;
            }
        }
        f11 = 0.0f;
        f12 = 1.0f;
        i10 = this.a;
        if (i7 != i10) {
            this.D = i10;
            this.E = 0.0f;
            if (i10 == 2) {
            }
            this.G = true;
        }
        this.a = i7;
        f13 = this.E;
        if (f13 != 1.0f) {
        }
        if (this.E == 1.0f) {
        }
        Paint paint22 = this.s;
        paint22.setColor(f16);
        canvas2.drawCircle(L, measuredHeight, org.telegram.messenger.g0.L(f10) / 2.0f, paint22);
        z9 = this.G;
        if (!z9) {
        }
        if (z9) {
        }
        f14 = f12;
        paint = this.w;
        paint.setColor(f16);
        float L22 = L - org.telegram.messenger.g0.L(20.0f);
        float L32 = measuredHeight - org.telegram.messenger.g0.L(20.0f);
        float L42 = org.telegram.messenger.g0.L(20.0f) + L;
        float L52 = org.telegram.messenger.g0.L(20.0f) + measuredHeight;
        rectF = this.x;
        rectF.set(L22, L32, L42, L52);
        if (this.E != 1.0f) {
        }
        float f172 = (-f14) * 360.0f;
        canvas.drawArc(rectF, -90.0f, f172, false, paint);
        this.J.a(f172, 1.0f, canvas, paint, rectF);
        canvas2 = canvas;
        z10 = ((org.telegram.ui.ActionBar.f2) cf0Var).isPaused;
        if (!z10) {
        }
        this.F = f14;
        tL_chatInviteExported = this.n;
        if (tL_chatInviteExported.subscription_pricing != null) {
        }
        if (this.H) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        this.w.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
