package zh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import e0.f0;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.i0;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.w6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.g9;
import w7.b6;
import yh.d0;
import yh.e0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class h extends FrameLayout implements k6 {
    public static final /* synthetic */ int H = 0;
    public int D;
    public e E;
    public long F;
    public long G;
    public final p6 a;
    public final int b;
    public final g9 c;
    public final TextView d;
    public final g9 e;
    public final TextView f;
    public final TextView h;
    public final TextView n;
    public final vh.d r;
    public final dq s;
    public final hi.f w;
    public final vg.f x;
    public boolean y;

    public h(int i10, Context context, p6 p6Var) {
        super(context);
        tg.b bVar;
        this.D = a7.b;
        this.a = p6Var;
        this.b = i10;
        final int i11 = 1;
        if (Build.VERSION.SDK_INT >= 31) {
            hi.f fVar = new hi.f(null);
            this.w = fVar;
            fVar.g(i0.L(7.0f), f0.a());
            fVar.n = true;
            bVar = new tg.b(fVar);
        } else {
            this.w = null;
            hi.c cVar = new hi.c();
            cVar.a(-16777216);
            bVar = new tg.b(cVar);
        }
        FrameLayout frameLayout = new FrameLayout(context);
        g9 g9Var = new g9(context);
        this.c = g9Var;
        final int i12 = 2;
        g9Var.setRoundRadius(i0.L(52.0f) / 2);
        addView(g9Var, b6.d(52, 52.0f, 51, 11.0f, 9.0f, 0.0f, 0.0f));
        final int i13 = 0;
        dq dqVar = new dq(R.drawable.mini_user_channels_10, 0);
        this.s = dqVar;
        dqVar.r = i0.L(2.0f);
        TextView textView = new TextView(context);
        this.d = textView;
        textView.setTypeface(i0.o());
        textView.setVisibility(8);
        textView.setTextSize(1, 9.33f);
        textView.setTextColor(-1);
        textView.setGravity(17);
        textView.setPadding(i0.L(1.0f), 0, i0.L(5.0f), 0);
        frameLayout.addView(textView, b6.e(-2, -1, 81));
        addView(frameLayout, b6.n(14.33f, 52, 48, 11, 48, 0, 0));
        vg.f c10 = bVar.c(textView, null, false);
        wg.d dVar = new wg.d(p6Var);
        dVar.e = new xg.a(6);
        dVar.f(1627389951, 1358954495);
        dVar.e(603979776, 603979776);
        dVar.d(0, 0);
        dVar.n = 0.0f;
        dVar.r = 0.0f;
        float N = i0.N(0.43f);
        float N2 = i0.N(0.43f);
        dVar.f = N;
        dVar.h = N2;
        c10.o(dVar);
        c10.q(i0.L(7.0f));
        this.x = c10;
        textView.setBackground(c10);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        TextView textView2 = new TextView(context);
        this.f = textView2;
        textView2.setTypeface(i0.o());
        textView2.setTextSize(1, 16.0f);
        textView2.setSingleLine(true);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView2.setEllipsize(truncateAt);
        linearLayout.addView(textView2, b6.k(0.0f, 10.0f, 0.0f, 1.33f, -1, -2));
        g9 g9Var2 = new g9(context);
        this.e = g9Var2;
        g9Var2.setRoundRadius(i0.L(8.0f));
        g9Var2.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        h hVar = this.b;
                        e eVar = hVar.E;
                        if (eVar != null) {
                            long j10 = hVar.G;
                            d0 d0Var = ((e0) eVar).h;
                            if (d0Var != null) {
                                d0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar2 = hVar2.E;
                        if (eVar2 != null) {
                            long j11 = hVar2.G;
                            d0 d0Var2 = ((e0) eVar2).h;
                            if (d0Var2 != null) {
                                d0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar3 = hVar3.E;
                        if (eVar3 != null) {
                            ((e0) eVar3).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar4 = hVar4.E;
                        if (eVar4 != null) {
                            ((e0) eVar4).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        addView(g9Var2, b6.d(16, 16.0f, 51, 75.0f, 35.0f, 0.0f, 0.0f));
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 13.0f);
        textView3.setSingleLine(true);
        textView3.setEllipsize(truncateAt);
        textView3.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h hVar = this.b;
                        e eVar = hVar.E;
                        if (eVar != null) {
                            long j10 = hVar.G;
                            d0 d0Var = ((e0) eVar).h;
                            if (d0Var != null) {
                                d0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar2 = hVar2.E;
                        if (eVar2 != null) {
                            long j11 = hVar2.G;
                            d0 d0Var2 = ((e0) eVar2).h;
                            if (d0Var2 != null) {
                                d0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar3 = hVar3.E;
                        if (eVar3 != null) {
                            ((e0) eVar3).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar4 = hVar4.E;
                        if (eVar4 != null) {
                            ((e0) eVar4).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        TextView f7 = z20.f(linearLayout, textView3, b6.k(20.0f, 0.0f, 0.0f, 1.33f, -1, -2), context);
        this.n = f7;
        f7.setTextSize(1, 13.0f);
        int L = i0.L(12.0f);
        int i14 = t6.D6;
        ShapeDrawable d02 = t6.d0(L, t6.r1(0.14f, t6.w0(i14, p6Var)));
        w6 L2 = a7.L(0.14f, i14);
        f7.setBackground(d02);
        a7.k(f7, d02, L2, null, p6Var);
        f7.setPadding(i0.L(4.0f), i0.L(1.0f), i0.L(8.0f), i0.L(1.66f));
        f7.setSingleLine(true);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "* ");
        spannableStringBuilder.setSpan(new dq(R.drawable.mini_ephemeral_hidden_14, 0), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) cd.L0(2131751899, null));
        f7.setText(spannableStringBuilder);
        f7.setVisibility(8);
        linearLayout.addView(f7, b6.k(0.0f, 7.0f, 0.0f, 1.33f, -2, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setClipChildren(false);
        vh.d dVar2 = new vh.d(context, p6Var, true);
        this.r = dVar2;
        dVar2.setUseWrapContent(true);
        dVar2.setPadding(i0.L(15.0f), 0, i0.L(15.0f), 0);
        dVar2.f();
        dVar2.e();
        int i15 = t6.z6;
        dVar2.setColor(t6.r1(0.14f, t6.w0(i15, p6Var)));
        dVar2.setTextColor(t6.x0(null, t6.G6, false));
        if (dVar2.getBackground() != null) {
            Drawable background = dVar2.getBackground();
            w6 L3 = a7.L(0.14f, i15);
            dVar2.setBackground(background);
            a7.k(dVar2, background, L3, null, p6Var);
        }
        dVar2.i(cd.L0(2131751605, null), false, true);
        dVar2.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        h hVar = this.b;
                        e eVar = hVar.E;
                        if (eVar != null) {
                            long j10 = hVar.G;
                            d0 d0Var = ((e0) eVar).h;
                            if (d0Var != null) {
                                d0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar2 = hVar2.E;
                        if (eVar2 != null) {
                            long j11 = hVar2.G;
                            d0 d0Var2 = ((e0) eVar2).h;
                            if (d0Var2 != null) {
                                d0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar3 = hVar3.E;
                        if (eVar3 != null) {
                            ((e0) eVar3).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar4 = hVar4.E;
                        if (eVar4 != null) {
                            ((e0) eVar4).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar2, b6.q(-2, 30, 0.0f, 16, 0, 0, 4, 0));
        vh.d dVar3 = new vh.d(context, p6Var, true);
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(i0.L(15.0f), 0, i0.L(15.0f), 0);
        dVar3.f();
        dVar3.i(cd.L0(2131754486, null), false, true);
        final int i16 = 3;
        dVar3.setOnClickListener(new View.OnClickListener(this) { // from class: zh.d
            public final /* synthetic */ h b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        h hVar = this.b;
                        e eVar = hVar.E;
                        if (eVar != null) {
                            long j10 = hVar.G;
                            d0 d0Var = ((e0) eVar).h;
                            if (d0Var != null) {
                                d0Var.a(j10);
                                break;
                            }
                        }
                        break;
                    case 1:
                        h hVar2 = this.b;
                        e eVar2 = hVar2.E;
                        if (eVar2 != null) {
                            long j11 = hVar2.G;
                            d0 d0Var2 = ((e0) eVar2).h;
                            if (d0Var2 != null) {
                                d0Var2.a(j11);
                                break;
                            }
                        }
                        break;
                    case 2:
                        h hVar3 = this.b;
                        e eVar3 = hVar3.E;
                        if (eVar3 != null) {
                            ((e0) eVar3).g(hVar3.F, false);
                            break;
                        }
                        break;
                    default:
                        h hVar4 = this.b;
                        e eVar4 = hVar4.E;
                        if (eVar4 != null) {
                            ((e0) eVar4).g(hVar4.F, true);
                            break;
                        }
                        break;
                }
            }
        });
        linearLayout2.addView(dVar3, b6.q(-2, 30, 0.0f, 16, 4, 0, 0, 0));
        linearLayout.addView(linearLayout2, b6.t(-1, -2, 0, 0, 10, 0, 0));
        addView(linearLayout, b6.d(-1, -2.0f, 48, 75.0f, 0.0f, 0.0f, 13.0f));
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.G6));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        int i10 = this.D;
        int i11 = a7.b;
        if (i10 != i11) {
            this.D = i11;
            try {
                vh.d dVar = this.r;
                if (dVar != null) {
                    dVar.setTextColor(t6.x0(null, t6.G6, false));
                }
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        if (this.y) {
            canvas2 = canvas;
            canvas2.drawLine(i0.L(76.0f), getHeight() - 1, getMeasuredWidth(), getHeight() - 1, t6.k0);
        } else {
            canvas2 = canvas;
        }
        super.dispatchDraw(canvas2);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        hi.f fVar;
        g9 g9Var;
        if (Build.VERSION.SDK_INT >= 31 && (fVar = this.w) != null && view == (g9Var = this.c)) {
            int L = i0.L(9.0f);
            int left = g9Var.getLeft() - L;
            int top = g9Var.getTop() - L;
            int L2 = (L * 2) + i0.L(52.0f);
            RecordingCanvas b10 = fVar.b(L2, L2);
            b10.translate(-left, -top);
            b10.drawColor(t6.w0(t6.d6, this.a));
            b10.save();
            float f7 = L2 / 2.0f;
            b10.scale(1.125f, 1.125f, f7, f7);
            super.drawChild(b10, view, j10);
            b10.restore();
            b10.drawColor(TLObject.FLAG_29);
            fVar.c();
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.x.i(i0.L(9.0f) + this.d.getLeft(), i0.L(48.0f));
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        int i10 = t6.G6;
        p6 p6Var = this.a;
        this.f.setTextColor(t6.w0(i10, p6Var));
        int i11 = t6.z6;
        this.h.setTextColor(t6.w0(i11, p6Var));
        this.n.setTextColor(t6.w0(i11, p6Var));
    }
}
