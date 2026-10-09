package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class wh0 extends FrameLayout {
    public float E;
    public float F;
    public boolean G;
    public boolean H;
    public boolean I;
    public final org.telegram.ui.Components.c31 J;
    public final /* synthetic */ zh0 K;
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
    public final Paint v;
    public final RectF w;
    public final ImageView x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wh0(zh0 zh0Var, Context context) {
        super(context);
        this.K = zh0Var;
        this.s = new Paint(1);
        Paint paint = new Paint(1);
        this.v = paint;
        this.w = new RectF();
        this.E = 1.0f;
        this.J = new org.telegram.ui.Components.c31();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        LinearLayout linearLayout = new LinearLayout(context);
        this.b = linearLayout;
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.a(-2.0f, 64.0f, 0.0f, 30.0f, 0.0f, -1, 16));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 16.0f);
        int i10 = org.telegram.ui.ActionBar.i6.G6;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        textView.setLines(1);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        linearLayout.addView(textView, w7.x5.n(-1, -2));
        TextView textView2 = new TextView(context);
        this.d = textView2;
        textView2.setTextSize(1, 13.0f);
        int i11 = org.telegram.ui.ActionBar.i6.y6;
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i11, false));
        linearLayout.addView(textView2, w7.x5.k(0.0f, 4.33f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(context);
        this.x = imageView;
        imageView.setImageDrawable(context.getDrawable(R.drawable.ic_ab_other));
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Uh, false));
        imageView.setOnClickListener(new m60(this, 8));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.i6, false), 1, -1));
        addView(imageView, w7.x5.a(48.0f, 0.0f, 0.0f, 8.0f, 0.0f, 48, 21));
        setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d6, false));
        setWillNotDraw(false);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.e = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView3 = new TextView(context);
        this.f = textView3;
        textView3.setTextSize(1, 16.0f);
        textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i10, false));
        textView3.setLines(1);
        textView3.setEllipsize(truncateAt);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setGravity(5);
        linearLayout2.addView(textView3, w7.x5.q(-1, -2, 5));
        TextView textView4 = new TextView(context);
        this.h = textView4;
        textView4.setTextSize(1, 13.0f);
        com.google.android.gms.internal.vision.e2.p(i11, null, false, textView4, 5);
        linearLayout2.addView(textView4, w7.x5.t(-1, -2, 5, 0, 1, 0, 0));
        addView(linearLayout2, w7.x5.a(-2.0f, 0.0f, 0.0f, 18.0f, 0.0f, -2, 21));
        linearLayout2.setVisibility(8);
    }

    public final int a(float f7, int i10) {
        TLRPC.TL_chatInviteExported tL_chatInviteExported = this.n;
        if (tL_chatInviteExported != null && tL_chatInviteExported.subscription_pricing != null) {
            return org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.uj, false);
        }
        if (i10 == 3) {
            return org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ka, false);
        }
        if (i10 != 1) {
            return i10 == 2 ? org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.oa, false) : i10 == 4 ? org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.V8, false) : org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Oh, false);
        }
        if (f7 > 0.5f) {
            return i0.a.d(1.0f - ((f7 - 0.5f) / 0.5f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.na, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.oa, false));
        }
        return i0.a.d(1.0f - (f7 / 0.5f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.oa, false), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.ka, false));
    }

    public final void b(TLRPC.TL_chatInviteExported tL_chatInviteExported, int i10) {
        int i11;
        String formatPluralString;
        int i12;
        this.I = false;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        if (tL_chatInviteExported2 == null || tL_chatInviteExported == null || !tL_chatInviteExported2.link.equals(tL_chatInviteExported.link)) {
            this.a = -1;
            this.E = 1.0f;
        }
        this.n = tL_chatInviteExported;
        this.r = i10;
        if (tL_chatInviteExported == null) {
            return;
        }
        int dp = AndroidUtilities.dp(30.0f);
        TL_stars.TL_starsSubscriptionPricing tL_starsSubscriptionPricing = tL_chatInviteExported.subscription_pricing;
        ImageView imageView = this.x;
        LinearLayout linearLayout = this.e;
        if (tL_starsSubscriptionPricing != null) {
            linearLayout.setVisibility(0);
            imageView.setVisibility(8);
            SpannableStringBuilder Y0 = yh.p7.Y0(false, org.telegram.messenger.q.h(tL_chatInviteExported.subscription_pricing.amount, ',', new StringBuilder("⭐️ ")), 0.75f, null);
            TextView textView = this.f;
            textView.setText(Y0);
            int i13 = tL_chatInviteExported.subscription_pricing.period;
            TextView textView2 = this.h;
            if (i13 == 2592000) {
                textView2.setText(LocaleController.getString(R.string.StarsParticipantSubscriptionPerMonth));
            } else if (i13 == 300) {
                textView2.setText("per 5 minutes");
            } else if (i13 == 60) {
                textView2.setText("each minute");
            }
            dp = AndroidUtilities.dp(28.0f) + ((int) Math.max(ci.d4.g(textView.getText(), textView.getPaint()), ci.d4.g(textView2.getText(), textView2.getPaint())));
        } else {
            linearLayout.setVisibility(8);
            imageView.setVisibility(8);
        }
        ((ViewGroup.MarginLayoutParams) this.b.getLayoutParams()).rightMargin = dp;
        boolean isEmpty = TextUtils.isEmpty(tL_chatInviteExported.title);
        zh0 zh0Var = this.K;
        TextView textView3 = this.c;
        if (!isEmpty) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(tL_chatInviteExported.title);
            Emoji.replaceEmoji(spannableStringBuilder, textView3.getPaint().getFontMetricsInt(), false);
            textView3.setText(spannableStringBuilder);
        } else if (tL_chatInviteExported.link.startsWith("https://t.me/+")) {
            StringBuilder sb2 = new StringBuilder();
            i11 = ((org.telegram.ui.ActionBar.n2) zh0Var).currentAccount;
            sb2.append(MessagesController.getInstance(i11).linkPrefix);
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
        int i14 = tL_chatInviteExported.usage;
        if (i14 == 0 && tL_chatInviteExported.usage_limit == 0 && tL_chatInviteExported.requested == 0) {
            formatPluralString = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
        } else {
            int i15 = tL_chatInviteExported.usage_limit;
            if (i15 > 0 && i14 == 0 && !tL_chatInviteExported.expired && !tL_chatInviteExported.revoked) {
                formatPluralString = LocaleController.formatPluralString("CanJoin", i15, new Object[0]);
            } else if (i15 > 0 && tL_chatInviteExported.expired && tL_chatInviteExported.revoked) {
                formatPluralString = LocaleController.formatPluralString("PeopleJoined", tL_chatInviteExported.usage, new Object[0]) + ", " + LocaleController.formatPluralString("PeopleJoinedRemaining", tL_chatInviteExported.usage_limit - tL_chatInviteExported.usage, new Object[0]);
            } else {
                formatPluralString = i14 > 0 ? LocaleController.formatPluralString("PeopleJoined", i14, new Object[0]) : "";
                if (tL_chatInviteExported.requested > 0) {
                    if (tL_chatInviteExported.usage > 0) {
                        formatPluralString = sc.v.v(formatPluralString, ", ");
                    }
                    StringBuilder v = a1.g.v(formatPluralString);
                    v.append(LocaleController.formatPluralString("JoinRequests", tL_chatInviteExported.requested, new Object[0]));
                    formatPluralString = v.toString();
                }
            }
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(formatPluralString);
        if (tL_chatInviteExported.permanent && !tL_chatInviteExported.revoked) {
            org.telegram.ui.Components.st stVar = new org.telegram.ui.Components.st();
            stVar.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(stVar, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Permanent));
        } else if (tL_chatInviteExported.expired || tL_chatInviteExported.revoked) {
            if (tL_chatInviteExported.revoked && tL_chatInviteExported.usage == 0) {
                String string = LocaleController.getString(tL_chatInviteExported.subscription_pricing != null ? R.string.NoOneSubscribed : R.string.NoOneJoined);
                spannableStringBuilder2.clear();
                spannableStringBuilder2.append((CharSequence) string);
            }
            org.telegram.ui.Components.st stVar2 = new org.telegram.ui.Components.st();
            stVar2.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(stVar2, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            boolean z10 = tL_chatInviteExported.revoked;
            if (z10 || (i12 = tL_chatInviteExported.usage_limit) <= 0 || tL_chatInviteExported.usage < i12) {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(z10 ? R.string.Revoked : R.string.Expired));
            } else {
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.LinkLimitReached));
            }
        } else if (tL_chatInviteExported.expire_date > 0) {
            org.telegram.ui.Components.st stVar3 = new org.telegram.ui.Components.st();
            stVar3.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(stVar3, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            long currentTimeMillis = (tL_chatInviteExported.expire_date * 1000) - ((zh0Var.n0 * 1000) + System.currentTimeMillis());
            if (currentTimeMillis < 0) {
                currentTimeMillis = 0;
            }
            if (currentTimeMillis > 86400000) {
                spannableStringBuilder2.append((CharSequence) LocaleController.formatPluralString("DaysLeft", (int) (currentTimeMillis / 86400000), new Object[0]));
            } else {
                long j3 = currentTimeMillis / 1000;
                int i16 = (int) (j3 % 60);
                long j10 = j3 / 60;
                Locale locale = Locale.ENGLISH;
                spannableStringBuilder2.append((CharSequence) String.format(locale, "%02d", Integer.valueOf((int) (j10 / 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf((int) (j10 % 60)))).append((CharSequence) String.format(locale, ":%02d", Integer.valueOf(i16)));
                this.I = true;
            }
        }
        if (tL_chatInviteExported.request_needed) {
            org.telegram.ui.Components.st stVar4 = new org.telegram.ui.Components.st();
            stVar4.b = AndroidUtilities.dp(1.5f);
            spannableStringBuilder2.append((CharSequence) "  .  ").setSpan(stVar4, spannableStringBuilder2.length() - 3, spannableStringBuilder2.length() - 2, 0);
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.ApprovalRequired));
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
        float f7;
        int i10;
        float f10;
        float f11;
        int i11;
        float f12;
        boolean z10;
        float f13;
        Paint paint;
        RectF rectF;
        boolean z11;
        int i12;
        TLRPC.TL_chatInviteExported tL_chatInviteExported;
        Canvas canvas2 = canvas;
        if (this.n == null) {
            return;
        }
        int dp = AndroidUtilities.dp(32.0f);
        int measuredHeight = getMeasuredHeight() / 2;
        TLRPC.TL_chatInviteExported tL_chatInviteExported2 = this.n;
        boolean z12 = tL_chatInviteExported2.expired;
        zh0 zh0Var = this.K;
        if (z12 || tL_chatInviteExported2.revoked) {
            f7 = 32.0f;
            i10 = tL_chatInviteExported2.revoked ? 4 : 3;
        } else {
            int i13 = tL_chatInviteExported2.expire_date;
            if (i13 > 0 || tL_chatInviteExported2.usage_limit > 0) {
                if (i13 > 0) {
                    long currentTimeMillis = (zh0Var.n0 * 1000) + System.currentTimeMillis();
                    TLRPC.TL_chatInviteExported tL_chatInviteExported3 = this.n;
                    f7 = 32.0f;
                    long j3 = tL_chatInviteExported3.expire_date * 1000;
                    int i14 = tL_chatInviteExported3.start_date;
                    if (i14 <= 0) {
                        i14 = tL_chatInviteExported3.date;
                    }
                    long j10 = i14 * 1000;
                    f11 = 1.0f - ((currentTimeMillis - j10) / (j3 - j10));
                } else {
                    f7 = 32.0f;
                    f11 = 1.0f;
                }
                int i15 = this.n.usage_limit;
                f10 = Math.min(f11, i15 > 0 ? (i15 - r3.usage) / i15 : 1.0f);
                if (f10 <= 0.0f) {
                    this.n.expired = true;
                    AndroidUtilities.updateVisibleRows(zh0Var.b);
                    i10 = 3;
                } else {
                    i10 = 1;
                }
                i11 = this.a;
                if (i10 != i11 && i11 >= 0) {
                    this.y = i11;
                    this.E = 0.0f;
                    if ((i11 == 2 && i11 != 1) || i10 == 2 || i10 == 1) {
                        this.G = false;
                    } else {
                        this.G = true;
                    }
                }
                this.a = i10;
                f12 = this.E;
                if (f12 != 1.0f) {
                    float f14 = f12 + 0.064f;
                    this.E = f14;
                    if (f14 >= 1.0f) {
                        this.E = 1.0f;
                        this.G = false;
                    } else {
                        invalidate();
                    }
                }
                int d = this.E == 1.0f ? i0.a.d(this.E, a(f10, this.y), a(f10, i10)) : a(f10, i10);
                Paint paint2 = this.s;
                paint2.setColor(d);
                canvas2.drawCircle(dp, measuredHeight, AndroidUtilities.dp(f7) / 2.0f, paint2);
                z10 = this.G;
                if (!z10) {
                    TLRPC.TL_chatInviteExported tL_chatInviteExported4 = this.n;
                    if (!tL_chatInviteExported4.expired) {
                        if (tL_chatInviteExported4.expire_date > 0) {
                        }
                    }
                    tL_chatInviteExported = this.n;
                    if (tL_chatInviteExported.subscription_pricing != null) {
                        zh0Var.a0.setBounds(dp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + dp, AndroidUtilities.dp(12.0f) + measuredHeight);
                        zh0Var.a0.draw(canvas2);
                    } else if (tL_chatInviteExported.revoked) {
                        zh0Var.Z.setBounds(dp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + dp, AndroidUtilities.dp(12.0f) + measuredHeight);
                        zh0Var.Z.draw(canvas2);
                    } else {
                        zh0Var.Y.setBounds(dp - AndroidUtilities.dp(12.0f), measuredHeight - AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f) + dp, AndroidUtilities.dp(12.0f) + measuredHeight);
                        zh0Var.Y.draw(canvas2);
                    }
                    if (this.H) {
                        canvas2.drawLine(AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, AndroidUtilities.dp(23.0f) + getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.i6.k0);
                        return;
                    }
                    return;
                }
                if (z10) {
                    f11 = this.F;
                }
                f13 = f11;
                paint = this.v;
                paint.setColor(d);
                float dp2 = dp - AndroidUtilities.dp(20.0f);
                float dp3 = measuredHeight - AndroidUtilities.dp(20.0f);
                float dp4 = AndroidUtilities.dp(20.0f) + dp;
                float dp5 = AndroidUtilities.dp(20.0f) + measuredHeight;
                rectF = this.w;
                rectF.set(dp2, dp3, dp4, dp5);
                if (this.E != 1.0f || (((i12 = this.y) == 2 || i12 == 1) && !this.G)) {
                    float f15 = (-f13) * 360.0f;
                    canvas.drawArc(rectF, -90.0f, f15, false, paint);
                    this.J.a(f15, 1.0f, canvas, paint, rectF);
                    canvas2 = canvas;
                } else {
                    canvas2.save();
                    float f16 = this.G ? 1.0f - this.E : this.E;
                    float f17 = (float) ((0.3f * f16) + 0.7d);
                    canvas2.scale(f17, f17, rectF.centerX(), rectF.centerY());
                    float f18 = (-f13) * 360.0f;
                    canvas2.drawArc(rectF, -90.0f, f18, false, paint);
                    this.J.a(f18, f16, canvas, paint, rectF);
                    canvas.restore();
                    canvas2 = canvas;
                }
                z11 = ((org.telegram.ui.ActionBar.n2) zh0Var).isPaused;
                if (!z11) {
                    invalidate();
                }
                this.F = f13;
                tL_chatInviteExported = this.n;
                if (tL_chatInviteExported.subscription_pricing != null) {
                }
                if (this.H) {
                }
            } else {
                f7 = 32.0f;
                i10 = 0;
            }
        }
        f10 = 0.0f;
        f11 = 1.0f;
        i11 = this.a;
        if (i10 != i11) {
            this.y = i11;
            this.E = 0.0f;
            if (i11 == 2) {
            }
            this.G = true;
        }
        this.a = i10;
        f12 = this.E;
        if (f12 != 1.0f) {
        }
        if (this.E == 1.0f) {
        }
        Paint paint22 = this.s;
        paint22.setColor(d);
        canvas2.drawCircle(dp, measuredHeight, AndroidUtilities.dp(f7) / 2.0f, paint22);
        z10 = this.G;
        if (!z10) {
        }
        if (z10) {
        }
        f13 = f11;
        paint = this.v;
        paint.setColor(d);
        float dp22 = dp - AndroidUtilities.dp(20.0f);
        float dp32 = measuredHeight - AndroidUtilities.dp(20.0f);
        float dp42 = AndroidUtilities.dp(20.0f) + dp;
        float dp52 = AndroidUtilities.dp(20.0f) + measuredHeight;
        rectF = this.w;
        rectF.set(dp22, dp32, dp42, dp52);
        if (this.E != 1.0f) {
        }
        float f152 = (-f13) * 360.0f;
        canvas.drawArc(rectF, -90.0f, f152, false, paint);
        this.J.a(f152, 1.0f, canvas, paint, rectF);
        canvas2 = canvas;
        z11 = ((org.telegram.ui.ActionBar.n2) zh0Var).isPaused;
        if (!z11) {
        }
        this.F = f13;
        tL_chatInviteExported = this.n;
        if (tL_chatInviteExported.subscription_pricing != null) {
        }
        if (this.H) {
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(60.0f), TLObject.FLAG_30));
        this.v.setStrokeWidth(AndroidUtilities.dp(2.0f));
    }
}
