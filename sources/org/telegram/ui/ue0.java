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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ue0 extends FrameLayout {
    public int E;
    public float F;
    public float G;
    public boolean H;
    public boolean I;
    public boolean J;
    public final org.telegram.ui.Components.b01 K;
    public final /* synthetic */ xe0 L;
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
    public ue0(xe0 xe0Var, Context context) {
        super(context);
        this.L = xe0Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new RectF();
        this.F = 1.0f;
        this.K = new org.telegram.ui.Components.b01();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, b8.mf.d(-1, -2.0f, 16, 64.0f, 0.0f, 30.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        int i3 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.V(textView, i3, null);
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, b8.mf.o(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i10 = org.telegram.ui.ActionBar.k6.y6;
        org.telegram.ui.ActionBar.r6.V(textView2, i10, null);
        linearLayout.addView(textView2, b8.mf.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.y = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.Ii, null, PorterDuff.Mode.SRC_ATOP);
        imageView.setOnClickListener(new b40(this, 10));
        int i11 = org.telegram.ui.ActionBar.k6.i6;
        org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 1, -1);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(h02);
        org.telegram.ui.ActionBar.r6.k(imageView, h02, null, N, null);
        addView(imageView, b8.mf.d(48, 48.0f, 21, 0.0f, 0.0f, 8.0f, 0.0f));
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.d6, this, null);
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 16.0f);
        org.telegram.ui.ActionBar.r6.V(textView3, i3, null);
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(org.telegram.messenger.g0.o());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, b8.mf.r(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        org.telegram.ui.ActionBar.r6.V(textView4, i10, null);
        textView4.setGravity(5);
        linearLayout2.addView(textView4, b8.mf.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, b8.mf.d(-2, -2.0f, 21, 0.0f, 0.0f, 18.0f, 0.0f));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f10, int i3) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ik, false);
        }
        if (i3 == 3) {
            return org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ka, false);
        }
        if (i3 != 1) {
            return i3 == 2 ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oa, false) : i3 == 4 ? org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.V8, false) : org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
        }
        if (f10 > 0.5f) {
            return i0.a.f(1.0f - ((f10 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.na, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oa, false));
        }
        return i0.a.f(1.0f - (f10 / 0.5f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.oa, false), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ka, false));
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i3) {
        int i10;
        String G;
        int i11;
        this.J = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.a = -1;
            this.F = 1.0f;
        }
        this.n = tL_chatInviteExported;
        this.r = i3;
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
            SpannableStringBuilder a12 = ci.wb.a1(false, k2.p1.l(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f;
            textView.setText(a12);
            int i12 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i12 == 2592000) {
                textView2.setText(org.telegram.messenger.bd.M0(2131745066, null));
            } else if (i12 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i12 == 60) {
                textView2.setText("each minute");
            }
            L = org.telegram.messenger.g0.L(28.0f) + ((int) Math.max(gi.l3.h(textView.getText(), textView.getPaint()), gi.l3.h(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = L;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        xe0 xe0Var = this.L;
        TextView textView3 = this.c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            org.telegram.messenger.i6.l(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i10 = ((org.telegram.ui.ActionBar.d2) xe0Var).currentAccount;
            sb2.append(org.telegram.messenger.hp.s1(i10).V2);
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
            G = org.telegram.messenger.bd.M0(tL_chatInviteExported.subscription_pricing != null ? 2131748193 : 2131748195, null);
        } else {
            int i14 = tL_chatInviteExported.usage_limit;
            if (i14 > 0 && i13 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                G = org.telegram.messenger.bd.G(i14, "CanJoin", new Object[0]);
            } else if (i14 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                G = org.telegram.messenger.bd.G(tL_chatInviteExported.usage, "PeopleJoined", new Object[0]) + ", " + org.telegram.messenger.bd.G(tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, "PeopleJoinedRemaining", new Object[0]);
            } else {
                G = i13 > 0 ? org.telegram.messenger.bd.G(i13, "PeopleJoined", new Object[0]) : "";
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        G = t4.c.q(G, ", ");
                    }
                    StringBuilder l10 = com.google.android.recaptcha.internal.a.l(G);
                    l10.append(org.telegram.messenger.bd.G(tL_chatInviteExported.requested, "JoinRequests", new Object[0]));
                    G = l10.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(G);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.fs fsVar = new org.telegram.ui.Components.fs();
            fsVar.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131747329, null));
        } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                String M0 = org.telegram.messenger.bd.M0(tL_chatInviteExported.subscription_pricing != null ? 2131748193 : 2131748195, null);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) M0);
            }
            org.telegram.ui.Components.fs fsVar2 = new org.telegram.ui.Components.fs();
            fsVar2.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (z10 || (i11 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i11) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(z10 ? 2131746025 : 2131750877, null));
            } else {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131748908, null));
            }
        } else if (tL_chatInviteExported.expire_date > 0) {
            org.telegram.ui.Components.fs fsVar3 = new org.telegram.ui.Components.fs();
            fsVar3.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((xe0Var.o0 * 1000) + System.currentTimeMillis());
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 86400000) {
                spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.G((int) (currentTimeMillis / 86400000), "DaysLeft", new Object[0]));
            } else {
                long j10 = currentTimeMillis / 1000;
                int i15 = (int) (j10 % 60);
                long j11 = j10 / 60;
                Locale locale = Locale.ENGLISH;
                spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j11 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j11 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i15)));
                this.J = true;
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.fs fsVar4 = new org.telegram.ui.Components.fs();
            fsVar4.b = org.telegram.messenger.g0.L(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(fsVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) org.telegram.messenger.bd.M0(2131754209, null));
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
        int i3;
        float f11;
        float f12;
        int i10;
        float f13;
        boolean z10;
        float f14;
        Paint paint;
        RectF rectF;
        boolean z11;
        int i11;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        Canvas canvas2 = canvas;
        if (this.n == null) {
            return;
        }
        int L = org.telegram.messenger.g0.L(32.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        boolean z12 = tL_chatInviteExported2.expired;
        xe0 xe0Var = this.L;
        if (z12 || tL_chatInviteExported2.revoked) {
            f10 = 32.0f;
            i3 = tL_chatInviteExported2.revoked ? 4 : 3;
        } else {
            int i12 = tL_chatInviteExported2.expire_date;
            if (i12 > 0 || tL_chatInviteExported2.usage_limit > 0) {
                if (i12 > 0) {
                    long currentTimeMillis = (xe0Var.o0 * 1000) + System.currentTimeMillis();
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.n;
                    f10 = 32.0f;
                    long j10 = tL_chatInviteExported3.expire_date * 1000;
                    int i13 = tL_chatInviteExported3.start_date;
                    if (i13 <= 0) {
                        i13 = tL_chatInviteExported3.date;
                    }
                    long j11 = i13 * 1000;
                    f12 = 1.0f - ((currentTimeMillis - j11) / (j10 - j11));
                } else {
                    f10 = 32.0f;
                    f12 = 1.0f;
                }
                int i14 = this.n.usage_limit;
                f11 = Math.min(f12, i14 > 0 ? (i14 - r3.usage) / i14 : 1.0f);
                if (f11 <= 0.0f) {
                    this.n.expired = true;
                    org.telegram.messenger.g0.b4(xe0Var.b);
                    i3 = 3;
                } else {
                    i3 = 1;
                }
                i10 = this.a;
                if (i3 != i10 && i10 >= 0) {
                    this.E = i10;
                    this.F = 0.0f;
                    if ((i10 == 2 && i10 != 1) || i3 == 2 || i3 == 1) {
                        this.H = false;
                    } else {
                        this.H = true;
                    }
                }
                this.a = i3;
                f13 = this.F;
                if (f13 != 1.0f) {
                    float f15 = f13 + 0.064f;
                    this.F = f15;
                    if (f15 >= 1.0f) {
                        this.F = 1.0f;
                        this.H = false;
                    } else {
                        invalidate();
                    }
                }
                int f16 = this.F == 1.0f ? i0.a.f(this.F, a(f11, this.E), a(f11, i3)) : a(f11, i3);
                Paint paint2 = this.s;
                paint2.setColor(f16);
                canvas2.drawCircle(L, measuredHeight, org.telegram.messenger.g0.L(f10) / 2.0f, paint2);
                z10 = this.H;
                if (!z10) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.n;
                    if (!tL_chatInviteExported4.expired) {
                        if (tL_chatInviteExported4.expire_date > 0) {
                        }
                    }
                    tL_chatInviteExported = this.n;
                    if (tL_chatInviteExported.subscription_pricing != null) {
                        xe0Var.b0.setBounds(L - org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + L, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
                        xe0Var.b0.draw(canvas2);
                    } else if (tL_chatInviteExported.revoked) {
                        xe0Var.a0.setBounds(L - org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + L, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
                        xe0Var.a0.draw(canvas2);
                    } else {
                        xe0Var.Z.setBounds(L - org.telegram.messenger.g0.L(12.0f), measuredHeight - org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f) + L, org.telegram.messenger.g0.L(12.0f) + measuredHeight);
                        xe0Var.Z.draw(canvas2);
                    }
                    if (this.I) {
                        canvas2.drawLine(org.telegram.messenger.g0.L(70.0f), getMeasuredHeight() - 1, org.telegram.messenger.g0.L(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.k6.k0);
                        return;
                    }
                    return;
                }
                if (z10) {
                    f12 = this.G;
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
                if (this.F != 1.0f || (((i11 = this.E) == 2 || i11 == 1) && !this.H)) {
                    float f17 = (-f14) * 360.0f;
                    canvas.drawArc(rectF, -90.0f, f17, false, paint);
                    this.K.a(f17, 1.0f, canvas, paint, rectF);
                    canvas2 = canvas;
                } else {
                    canvas2.save();
                    float f18 = this.H ? 1.0f - this.F : this.F;
                    float f19 = (float) ((0.3f * f18) + 0.7d);
                    canvas2.scale(f19, f19, rectF.centerX(), rectF.centerY());
                    float f20 = (-f14) * 360.0f;
                    canvas2.drawArc(rectF, -90.0f, f20, false, paint);
                    this.K.a(f20, f18, canvas, paint, rectF);
                    canvas.restore();
                    canvas2 = canvas;
                }
                z11 = ((org.telegram.ui.ActionBar.d2) xe0Var).isPaused;
                if (!z11) {
                    invalidate();
                }
                this.G = f14;
                tL_chatInviteExported = this.n;
                if (tL_chatInviteExported.subscription_pricing != null) {
                }
                if (this.I) {
                }
            } else {
                f10 = 32.0f;
                i3 = 0;
            }
        }
        f11 = 0.0f;
        f12 = 1.0f;
        i10 = this.a;
        if (i3 != i10) {
            this.E = i10;
            this.F = 0.0f;
            if (i10 == 2) {
            }
            this.H = true;
        }
        this.a = i3;
        f13 = this.F;
        if (f13 != 1.0f) {
        }
        if (this.F == 1.0f) {
        }
        Paint paint22 = this.s;
        paint22.setColor(f16);
        canvas2.drawCircle(L, measuredHeight, org.telegram.messenger.g0.L(f10) / 2.0f, paint22);
        z10 = this.H;
        if (!z10) {
        }
        if (z10) {
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
        if (this.F != 1.0f) {
        }
        float f172 = (-f14) * 360.0f;
        canvas.drawArc(rectF, -90.0f, f172, false, paint);
        this.K.a(f172, 1.0f, canvas, paint, rectF);
        canvas2 = canvas;
        z11 = ((org.telegram.ui.ActionBar.d2) xe0Var).isPaused;
        if (!z11) {
        }
        this.G = f14;
        tL_chatInviteExported = this.n;
        if (tL_chatInviteExported.subscription_pricing != null) {
        }
        if (this.I) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.L(60.0f), TLObject.FLAG_30));
        this.w.setStrokeWidth(org.telegram.messenger.g0.L(2.0f));
    }
}
