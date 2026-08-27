package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import gf.n0;
import h7.z5;
import oh.p0;
import oh.q0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.n9;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class g extends FrameLayout implements x5 {
    public static final /* synthetic */ int B = 0;
    public long A;
    public final c6 a;
    public final int b;
    public final n9 c;
    public final TextView d;
    public final n9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final cq r;
    public final og.d s;
    public final lg.d v;
    public boolean w;
    public d x;
    public long y;

    public g(Context context, int i10, c6 c6Var) {
        super(context);
        jg.a aVar;
        this.a = c6Var;
        this.b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            og.d dVar = new og.d(null);
            this.s = dVar;
            dVar.g(AndroidUtilities.dp(7.0f), n0.a());
            dVar.h = true;
            aVar = new jg.a(dVar);
        } else {
            this.s = null;
            og.c cVar = new og.c();
            cVar.a(-16777216);
            aVar = new jg.a(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        n9 n9Var = new n9(context);
        this.c = n9Var;
        n9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(n9Var, z5.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        cq cqVar = new cq(R.drawable.mini_user_channels_10, 0);
        this.r = cqVar;
        cqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, z5.e(-2, -1, 81));
        addView(frameLayout, z5.s(52, 48, 11, 48, 0, 14.33f, 0));
        lg.d c10 = aVar.c(textView, null, false);
        mg.d dVar2 = new mg.d(c6Var);
        dVar2.e = new ng.a(5);
        dVar2.d(1627389951, 1358954495);
        dVar2.c(603979776, 603979776);
        dVar2.b(0, 0);
        dVar2.n = 0.0f;
        dVar2.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        dVar2.f = dpf2;
        dVar2.h = dpf22;
        c10.n(dVar2);
        c10.p(AndroidUtilities.dp(7.0f));
        this.v = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, z5.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        n9 n9Var2 = new n9(context);
        this.e = n9Var2;
        n9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        final int i11 = 0;
        n9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: ph.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        g gVar = this.b;
                        d dVar3 = gVar.x;
                        if (dVar3 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar3).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar4 = gVar2.x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        addView(n9Var2, z5.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        final int i12 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: ph.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        g gVar = this.b;
                        d dVar3 = gVar.x;
                        if (dVar3 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar3).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar4 = gVar2.x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        TextView i13 = pa.i(linearLayout, textView3, z5.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = i13;
        i13.setTextSize(1, 13.0f);
        i13.setBackground(g6.b0(AndroidUtilities.dp(12.0f), g6.l1(0.14f, g6.v0(g6.D6, c6Var))));
        i13.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        i13.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new cq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        i13.setText(spannableStringBuilder);
        i13.setVisibility(8);
        linearLayout.addView(i13, z5.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        lh.d dVar3 = new lh.d(context, c6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.d();
        dVar3.setColor(g6.l1(0.14f, g6.v0(g6.z6, c6Var)));
        dVar3.setTextColor(g6.w0(null, g6.G6, false));
        dVar3.g(LocaleController.getString(R.string.Decline), false, true);
        final int i14 = 2;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: ph.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        g gVar = this.b;
                        d dVar32 = gVar.x;
                        if (dVar32 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar32).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar4 = gVar2.x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar4).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar3, z5.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        lh.d dVar4 = new lh.d(context, c6Var, true);
        dVar4.setUseWrapContent(true);
        dVar4.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar4.e();
        dVar4.g(LocaleController.getString(R.string.Add), false, true);
        final int i15 = 3;
        dVar4.setOnClickListener(new View.OnClickListener(this) { // from class: ph.c
            public final /* synthetic */ g b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        g gVar = this.b;
                        d dVar32 = gVar.x;
                        if (dVar32 != null) {
                            long j10 = gVar.A;
                            p0 p0Var = ((q0) dVar32).h;
                            if (p0Var != null) {
                                p0Var.b(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar42 = gVar2.x;
                        if (dVar42 != null) {
                            long j11 = gVar2.A;
                            p0 p0Var2 = ((q0) dVar42).h;
                            if (p0Var2 != null) {
                                p0Var2.b(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((q0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((q0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar4, z5.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, z5.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, z5.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        d();
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void d() {
        int i10 = g6.G6;
        c6 c6Var = this.a;
        this.f.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.z6;
        this.h.setTextColor(g6.v0(i11, c6Var));
        this.n.setTextColor(g6.v0(i11, c6Var));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        if (this.w) {
            canvas2 = canvas;
            canvas2.drawLine(AndroidUtilities.dp(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, g6.k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        og.d dVar;
        n9 n9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.s) != null && view == (n9Var = this.c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = n9Var.getLeft() - dp;
            int top = n9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(g6.v0(g6.d6, this.a));
            a2.save();
            float f10 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f10, f10);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(TLObject.FLAG_29);
            dVar.b();
        }
        return super.drawChild(canvas, view, j10);
    }

    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.v.s(AndroidUtilities.dp(9.0f) + this.d.getLeft(), AndroidUtilities.dp(48.0f));
    }
}
