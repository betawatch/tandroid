package zh;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.ea;
import bi.k7;
import bi.n4;
import c8.ha;
import c8.ka;
import fi.y5;
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.m5;
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.dd;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.i6;
import org.telegram.ui.Components.we;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.z20;
import org.telegram.ui.cn;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.w2 {
    public boolean A1;
    public final g0 B1;
    public final TL_stars.TL_starGiftUnique C1;
    public final long D1;
    public n4 E1;
    public boolean F1;
    public final c4 l1;
    public final jh.l m1;
    public final ri.g n1;
    public final dh.c o1;
    public final jh.f p1;
    public final rh.h q1;
    public final e0 r1;
    public final FrameLayout s1;
    public final wo t1;
    public final TextView u1;
    public final i6 v1;
    public final ImageView w1;
    public final Drawable x1;
    public final int y1;
    public int z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, h6 h6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (h6) null, true, true);
        cn cnVar;
        final int i7 = 1;
        this.m1 = new jh.l();
        rh.h hVar = new rh.h(new bi.z3(this, i7));
        this.q1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.C1 = tL_starGiftUnique;
        this.D1 = j3;
        this.y1 = qp.s1(this.a).D6;
        ri.g gVar = new ri.g();
        this.n1 = gVar;
        dh.c cVar = new dh.c(gVar, gVar, gVar);
        this.o1 = cVar;
        d0 d0Var = new d0(this, context);
        this.b = d0Var;
        int i10 = this.t0;
        final int i11 = 0;
        d0Var.setPadding(i10, 0, i10, 0);
        jh.k kVar = new jh.k(this.b);
        ViewGroup viewGroup = this.b;
        cVar.h = kVar;
        cVar.i = viewGroup;
        rh.d dVar = new rh.d(this.c);
        ViewGroup viewGroup2 = this.b;
        hVar.D = dVar;
        hVar.E = viewGroup2;
        dVar.d.add(hVar);
        Drawable e10 = y5.e(null, this.a, j3, m6.I.q());
        this.x1 = e10;
        d0Var.U(e10);
        c4 c4Var = new c4(this.a, context, h6Var);
        this.l1 = c4Var;
        c4Var.a(tL_starGiftUnique, p10.i(this.a).e(), null, id.M0(2131749745, null), false);
        c4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        c4Var.setLayoutBackground(new org.telegram.ui.ActionBar.y5(c4Var, this.b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        d0Var.addView(c4Var, ha.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.p1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.g0.b(h6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.g0.b(h6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        e0 e0Var = new e0(this, org.telegram.messenger.g0.u0(), d0Var);
        this.r1 = e0Var;
        e0Var.setInAppInsetsController(hVar);
        e0Var.setOverrideHint(id.M0(2131749750, null));
        e0Var.y4 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        e0Var.x4 = false;
        e0Var.i2 = !org.telegram.messenger.g0.E && ((cnVar = e0Var.P2) == null || !cnVar.isInBubbleMode());
        e0Var.V0(false, false, false);
        e0Var.g1(true, false);
        e0Var.z1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        e0Var.getSendButton().setAlpha(0.0f);
        e0Var.getEditField().setMaxLines(3);
        e0Var.setCustomWindowView(this.c);
        e0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(e0Var, ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(fVar.getFadeView(), ha.c(-1.0f, -1));
        this.b.addView(fVar, ha.c(-1.0f, -1));
        e0Var.setDelegate(new f0(this, tL_starGiftUnique));
        we weVar = e0Var.E0;
        dd ddVar = new dd();
        InputFilter[] filters = weVar.getFilters();
        if (filters == null) {
            weVar.setFilters(new InputFilter[]{ddVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = ddVar;
            weVar.setFilters(inputFilterArr);
        }
        i6 i6Var = new i6(context, false, false, false);
        this.v1 = i6Var;
        i6Var.setAllowCancel(true);
        i6Var.setScaleProperty(0.6f);
        i6Var.setVisibility(8);
        i6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        t6.Y(i6Var, m6.y6, h6Var);
        i6Var.setTypeface(org.telegram.messenger.g0.o());
        i6Var.setGravity(17);
        this.b.addView(i6Var, ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        g0 g0Var = new g0(R.drawable.send_plane_24, context, h6Var, false);
        this.B1 = g0Var;
        int L = org.telegram.messenger.g0.L(38.0f);
        int L2 = org.telegram.messenger.g0.L(38.0f);
        g0Var.I = L;
        g0Var.J = L2;
        float L3 = org.telegram.messenger.g0.L(6.0f);
        float L4 = org.telegram.messenger.g0.L(8.0f);
        g0Var.M = L3;
        g0Var.N = L4;
        g0Var.h0 = true;
        this.b.addView(g0Var, ha.e(qs.v1, 50, 85));
        g0Var.setScrimViewBackgroundColor(m6.w0(m6.d6, this.I0));
        g0Var.setOnClickListener(new View.OnClickListener(this) { // from class: zh.c0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        h0 h0Var = this.b;
                        if (h0Var.y1 - h0Var.z1 >= 0) {
                            n4 n4Var = h0Var.E1;
                            if (n4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = h0Var.r1.getTextWithEntities();
                                boolean z9 = h0Var.A1;
                                k7 k7Var = (k7) n4Var.c;
                                h0 h0Var2 = (h0) n4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.e;
                                long j10 = n4Var.b;
                                cg.b bVar = (cg.b) n4Var.f;
                                if (!h0Var2.F1) {
                                    k7Var.f2.setLoading(true);
                                    if (!h0Var2.F1) {
                                        h0Var2.F1 = true;
                                        h0Var2.B1.f(true);
                                    }
                                    ea.x(k7Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z9, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z9));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(h0Var.v1);
                            break;
                        }
                        break;
                    case 1:
                        h0 h0Var3 = this.b;
                        boolean z10 = h0Var3.A1;
                        h0Var3.A1 = !z10;
                        h0Var3.t1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.u1 = textView;
        int i12 = m6.Wc;
        k5.n(textView, i12, h6Var, 1, 14.0f);
        textView.setText(id.M0(2131749746, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        final int i13 = 2;
        textView.setBackground(new org.telegram.ui.ActionBar.y5(textView, this.b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.b.addView(textView, ha.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.s1 = frameLayout;
        TextView textView2 = new TextView(context);
        t6.U(textView2, i12, h6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(id.M0(2131749747, null));
        frameLayout.addView(textView2, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        wo woVar = new wo(18, context, h6Var);
        this.t1 = woVar;
        woVar.getCheckBoxBase().j(true);
        woVar.getCheckBoxBase().e = 0.9f;
        woVar.b(i12, i12, m6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(!this.A1, false);
        c4Var.getLayout().V = new bi.z3(this, i13);
        c4Var.getLayout().U = new bi.z3(this, 3);
        woVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(woVar, ha.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new org.telegram.ui.ActionBar.y5(frameLayout, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: zh.c0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i7) {
                    case 0:
                        h0 h0Var = this.b;
                        if (h0Var.y1 - h0Var.z1 >= 0) {
                            n4 n4Var = h0Var.E1;
                            if (n4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = h0Var.r1.getTextWithEntities();
                                boolean z9 = h0Var.A1;
                                k7 k7Var = (k7) n4Var.c;
                                h0 h0Var2 = (h0) n4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.e;
                                long j10 = n4Var.b;
                                cg.b bVar = (cg.b) n4Var.f;
                                if (!h0Var2.F1) {
                                    k7Var.f2.setLoading(true);
                                    if (!h0Var2.F1) {
                                        h0Var2.F1 = true;
                                        h0Var2.B1.f(true);
                                    }
                                    ea.x(k7Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z9, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z9));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(h0Var.v1);
                            break;
                        }
                        break;
                    case 1:
                        h0 h0Var3 = this.b;
                        boolean z10 = h0Var3.A1;
                        h0Var3.A1 = !z10;
                        h0Var3.t1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(frameLayout, ha.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.w1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        org.telegram.ui.ActionBar.y5 y5Var = new org.telegram.ui.ActionBar.y5(imageView, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L5 = org.telegram.messenger.g0.L(32.0f);
        int L6 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.a;
        imageView.setBackground(new ih.c(L5, L6, y5Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: zh.c0
            public final /* synthetic */ h0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i13) {
                    case 0:
                        h0 h0Var = this.b;
                        if (h0Var.y1 - h0Var.z1 >= 0) {
                            n4 n4Var = h0Var.E1;
                            if (n4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = h0Var.r1.getTextWithEntities();
                                boolean z9 = h0Var.A1;
                                k7 k7Var = (k7) n4Var.c;
                                h0 h0Var2 = (h0) n4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.e;
                                long j10 = n4Var.b;
                                cg.b bVar = (cg.b) n4Var.f;
                                if (!h0Var2.F1) {
                                    k7Var.f2.setLoading(true);
                                    if (!h0Var2.F1) {
                                        h0Var2.F1 = true;
                                        h0Var2.B1.f(true);
                                    }
                                    ea.x(k7Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z9, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z9));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(h0Var.v1);
                            break;
                        }
                        break;
                    case 1:
                        h0 h0Var3 = this.b;
                        boolean z10 = h0Var3.A1;
                        h0Var3.A1 = !z10;
                        h0Var3.t1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(imageView, ha.e(56, 56, 53));
        ka.b(frameLayout, 0.05f, 1.2f);
        ka.a(imageView);
        ViewGroup viewGroup3 = this.b;
        u5.e eVar = new u5.e(this, 14);
        WeakHashMap weakHashMap = r0.i0.a;
        r0.a0.i(viewGroup3, eVar);
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final boolean G() {
        return false;
    }

    public final void I0() {
        rh.h hVar = this.q1;
        int i7 = hVar.f(647).b;
        float L = org.telegram.messenger.g0.L(36.0f) + i7;
        float inputBubbleHeight = this.p1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.b.getHeight();
        c4 c4Var = this.l1;
        FrameLayout frameLayout = this.s1;
        c4Var.setTranslationY(Math.min(((L - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - c4Var.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - c4Var.getHeight()));
        c4Var.invalidate();
        float y10 = c4Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.u1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.w1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        h6 h6Var = this.I0;
        Paint d = h6Var != null ? h6Var.d("paintChatActionBackground") : null;
        return d != null ? d : m6.V0("paintChatActionBackground");
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        this.r1.B0();
    }

    @Override // org.telegram.ui.ActionBar.w2, android.app.Dialog
    public final void onBackPressed() {
        e0 e0Var = this.r1;
        if (e0Var == null || !e0Var.s0()) {
            super.onBackPressed();
        } else {
            e0Var.k0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void s0() {
        super.s0();
        try {
            g0 g0Var = this.B1;
            if (g0Var != null) {
                g0Var.setScrimViewBackgroundColor(m6.w0(m6.d6, this.I0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void v() {
        u0(false);
        ch.v vVar = new ch.v(this, 11);
        org.telegram.ui.ActionBar.m2 m2Var = this.c;
        bc.a(m2Var, vVar);
        z20 z20Var = z20.s;
        if (z20Var.c()) {
            z20Var.b();
            TLObject e22 = qp.s1(this.a).e2(this.D1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.C1.title);
            sb2.append(" #");
            new gc(m2Var, this.I0).V(Arrays.asList(e22), id.M0(2131749749, null), org.telegram.messenger.g0.X2(id.a0(null, null, 2131749751, m5.u(e22), jg.g.m(r4.num, ',', sb2))), null).k(true);
        }
    }
}
