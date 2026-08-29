package rh;

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
import i7.f6;
import jf.m0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.x5;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.t9;
import org.telegram.ui.th;
import org.telegram.ui.xx0;
import qh.n0;
import qh.o0;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class g extends FrameLayout implements x5 {
    public static final /* synthetic */ int B = 0;
    public long A;
    public final c6 a;
    public final int b;
    public final t9 c;
    public final TextView d;
    public final t9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final iq r;
    public final qg.d s;
    public final ng.d v;
    public boolean w;
    public d x;
    public long y;

    public g(Context context, int i10, c6 c6Var) {
        super(context);
        lg.a aVar;
        this.a = c6Var;
        this.b = i10;
        if (Build.VERSION.SDK_INT >= 31) {
            qg.d dVar = new qg.d(null);
            this.s = dVar;
            dVar.g(AndroidUtilities.dp(7.0f), m0.a());
            dVar.h = true;
            aVar = new lg.a(dVar);
        } else {
            this.s = null;
            qg.c cVar = new qg.c();
            cVar.a(-16777216);
            aVar = new lg.a(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        t9 t9Var = new t9(context);
        this.c = t9Var;
        t9Var.setRoundRadius(AndroidUtilities.dp(52.0f) / 2);
        addView(t9Var, f6.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        iq iqVar = new iq(R.drawable.mini_user_channels_10, 0);
        this.r = iqVar;
        iqVar.setTranslateX(AndroidUtilities.dp(2.0f));
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(1.0f), 0, AndroidUtilities.dp(5.0f), 0);
        frameLayout.addView(textView, f6.e(-2, -1, 81));
        addView(frameLayout, f6.s(52, 48, 11, 48, 0, 14.33f, 0));
        ng.d c3 = aVar.c(textView, null, false);
        og.d dVar2 = new og.d(c6Var);
        dVar2.e = new xx0(14);
        dVar2.d(1627389951, 1358954495);
        dVar2.c(603979776, 603979776);
        dVar2.b(0, 0);
        dVar2.n = 0.0f;
        dVar2.r = 0.0f;
        float dpf2 = AndroidUtilities.dpf2(0.43f);
        float dpf22 = AndroidUtilities.dpf2(0.43f);
        dVar2.f = dpf2;
        dVar2.h = dpf22;
        c3.n(dVar2);
        c3.p(AndroidUtilities.dp(7.0f));
        this.v = c3;
        textView.setBackground(c3);
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
        linearLayout.addView(textView2, f6.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        t9 t9Var2 = new t9(context);
        this.e = t9Var2;
        t9Var2.setRoundRadius(AndroidUtilities.dp(8.0f));
        final int i11 = 0;
        t9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: rh.c
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
                            n0 n0Var = ((o0) dVar3).h;
                            if (n0Var != null) {
                                n0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar4 = gVar2.x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            n0 n0Var2 = ((o0) dVar4).h;
                            if (n0Var2 != null) {
                                n0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        addView(t9Var2, f6.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        final int i12 = 1;
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: rh.c
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
                            n0 n0Var = ((o0) dVar3).h;
                            if (n0Var != null) {
                                n0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar4 = gVar2.x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            n0 n0Var2 = ((o0) dVar4).h;
                            if (n0Var2 != null) {
                                n0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        TextView i13 = th.i(linearLayout, textView3, f6.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = i13;
        i13.setTextSize(1, 13.0f);
        i13.setBackground(g6.b0(AndroidUtilities.dp(12.0f), g6.l1(0.14f, g6.v0(g6.D6, c6Var))));
        i13.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(1.66f));
        i13.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new iq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.CommunityPendingRequestOnlyVisibleToMembers));
        i13.setText(spannableStringBuilder);
        i13.setVisibility(8);
        linearLayout.addView(i13, f6.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        nh.d dVar3 = new nh.d(context, c6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar3.e();
        dVar3.d();
        dVar3.setColor(g6.l1(0.14f, g6.v0(g6.z6, c6Var)));
        dVar3.setTextColor(g6.w0(null, g6.G6, false));
        dVar3.g(LocaleController.getString(R.string.Decline), false, true);
        final int i14 = 2;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: rh.c
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
                            n0 n0Var = ((o0) dVar32).h;
                            if (n0Var != null) {
                                n0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar4 = gVar2.x;
                        if (dVar4 != null) {
                            long j11 = gVar2.A;
                            n0 n0Var2 = ((o0) dVar4).h;
                            if (n0Var2 != null) {
                                n0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar3, f6.p(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        nh.d dVar4 = new nh.d(context, c6Var, true);
        dVar4.setUseWrapContent(true);
        dVar4.setPadding(AndroidUtilities.dp(15.0f), 0, AndroidUtilities.dp(15.0f), 0);
        dVar4.e();
        dVar4.g(LocaleController.getString(R.string.Add), false, true);
        final int i15 = 3;
        dVar4.setOnClickListener(new View.OnClickListener(this) { // from class: rh.c
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
                            n0 n0Var = ((o0) dVar32).h;
                            if (n0Var != null) {
                                n0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        g gVar2 = this.b;
                        d dVar42 = gVar2.x;
                        if (dVar42 != null) {
                            long j11 = gVar2.A;
                            n0 n0Var2 = ((o0) dVar42).h;
                            if (n0Var2 != null) {
                                n0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        g gVar3 = this.b;
                        d dVar5 = gVar3.x;
                        if (dVar5 != null) {
                            ((o0) dVar5).g(gVar3.y, false);
                            break;
                        }
                        break;
                    default:
                        g gVar4 = this.b;
                        d dVar6 = gVar4.x;
                        if (dVar6 != null) {
                            ((o0) dVar6).g(gVar4.y, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar4, f6.p(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, f6.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, f6.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        e();
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
        qg.d dVar;
        t9 t9Var;
        if (Build.VERSION.SDK_INT >= 31 && (dVar = this.s) != null && view == (t9Var = this.c)) {
            int dp = AndroidUtilities.dp(9.0f);
            int left = t9Var.getLeft() - dp;
            int top = t9Var.getTop() - dp;
            int dp2 = (dp * 2) + AndroidUtilities.dp(52.0f);
            RecordingCanvas a2 = dVar.a(dp2, dp2);
            a2.translate(-left, -top);
            a2.drawColor(g6.v0(g6.d6, this.a));
            a2.save();
            float f9 = dp2 / 2.0f;
            a2.scale(1.125f, 1.125f, f9, f9);
            super.drawChild(a2, view, j10);
            a2.restore();
            a2.drawColor(TLObject.FLAG_29);
            dVar.b();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // org.telegram.ui.ActionBar.x5
    public final void e() {
        int i10 = g6.G6;
        c6 c6Var = this.a;
        this.f.setTextColor(g6.v0(i10, c6Var));
        int i11 = g6.z6;
        this.h.setTextColor(g6.v0(i11, c6Var));
        this.n.setTextColor(g6.v0(i11, c6Var));
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
