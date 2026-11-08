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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ed;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.j6;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xe;
import org.telegram.ui.Components.z20;
import org.telegram.ui.an;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class h0 extends org.telegram.ui.ActionBar.v2 {
    public final long A1;
    public n4 B1;
    public boolean C1;
    public final b4 i1;
    public final jh.l j1;
    public final ri.g k1;
    public final dh.c l1;
    public final jh.f m1;
    public final rh.h n1;
    public final e0 o1;
    public final FrameLayout p1;
    public final wo q1;
    public final TextView r1;
    public final j6 s1;
    public final ImageView t1;
    public final Drawable u1;
    public final int v1;
    public int w1;
    public boolean x1;
    public final g0 y1;
    public final TL_stars.TL_starGiftUnique z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(Context context, f6 f6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j3) {
        super(context, (f6) null, true, true);
        an anVar;
        final int i7 = 1;
        this.j1 = new jh.l();
        rh.h hVar = new rh.h(new bi.z3(this, i7));
        this.n1 = hVar;
        org.telegram.messenger.g0.S(getWindow());
        this.z1 = tL_starGiftUnique;
        this.A1 = j3;
        this.v1 = qp.s1(this.a).D6;
        ri.g gVar = new ri.g();
        this.k1 = gVar;
        dh.c cVar = new dh.c(gVar, gVar, gVar);
        this.l1 = cVar;
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
        Drawable e10 = y5.e(null, this.a, j3, k6.I.q());
        this.u1 = e10;
        d0Var.U(e10);
        b4 b4Var = new b4(this.a, context, f6Var);
        this.i1 = b4Var;
        b4Var.a(tL_starGiftUnique, p10.i(this.a).e(), null, id.M0(2131749746, null), false);
        b4Var.setPadding(0, org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f));
        b4Var.setLayoutBackground(new w5(b4Var, this.b, org.telegram.messenger.g0.L(18.0f), J0("paintChatActionBackground")));
        d0Var.addView(b4Var, ha.e(-2, -2, 48));
        jh.f fVar = new jh.f(context);
        this.m1 = fVar;
        fVar.setClipChildren(false);
        fVar.setWindowInsetsProvider(hVar);
        fVar.setInputIslandBubbleDrawable(cVar.c(fVar, c8.g0.b(f6Var), false));
        fVar.setUnderKeyboardBackgroundDrawable(cVar.c(fVar, c8.g0.b(f6Var), false));
        FrameLayout inputIslandBubbleContainer = fVar.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = fVar.getInAppKeyboardBubbleContainer();
        e0 e0Var = new e0(this, org.telegram.messenger.g0.u0(), d0Var);
        this.o1 = e0Var;
        e0Var.setInAppInsetsController(hVar);
        e0Var.setOverrideHint(id.M0(2131749751, null));
        e0Var.y4 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        e0Var.x4 = false;
        e0Var.i2 = !org.telegram.messenger.g0.E && ((anVar = e0Var.P2) == null || !anVar.isInBubbleMode());
        e0Var.U0(false, false, false);
        e0Var.f1(true, false);
        e0Var.z1.setPadding(0, org.telegram.messenger.g0.L(1.0f), org.telegram.messenger.g0.L(20.0f), 0);
        e0Var.getSendButton().setAlpha(0.0f);
        e0Var.getEditField().setMaxLines(3);
        e0Var.setCustomWindowView(this.c);
        e0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(e0Var, ha.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(fVar.getFadeView(), ha.c(-1.0f, -1));
        this.b.addView(fVar, ha.c(-1.0f, -1));
        e0Var.setDelegate(new f0(this, tL_starGiftUnique));
        xe xeVar = e0Var.E0;
        ed edVar = new ed();
        InputFilter[] filters = xeVar.getFilters();
        if (filters == null) {
            xeVar.setFilters(new InputFilter[]{edVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = edVar;
            xeVar.setFilters(inputFilterArr);
        }
        j6 j6Var = new j6(context, false, false, false);
        this.s1 = j6Var;
        j6Var.setAllowCancel(true);
        j6Var.setScaleProperty(0.6f);
        j6Var.setVisibility(8);
        j6Var.setTextSize(org.telegram.messenger.g0.L(15.0f));
        r6.Z(j6Var, k6.y6, f6Var);
        j6Var.setTypeface(org.telegram.messenger.g0.o());
        j6Var.setGravity(17);
        this.b.addView(j6Var, ha.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        g0 g0Var = new g0(R.drawable.send_plane_24, context, f6Var, false);
        this.y1 = g0Var;
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
        g0Var.setScrimViewBackgroundColor(k6.w0(k6.d6, this.I0));
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
                        if (h0Var.v1 - h0Var.w1 >= 0) {
                            n4 n4Var = h0Var.B1;
                            if (n4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = h0Var.o1.getTextWithEntities();
                                boolean z9 = h0Var.x1;
                                k7 k7Var = (k7) n4Var.c;
                                h0 h0Var2 = (h0) n4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.e;
                                long j10 = n4Var.b;
                                cg.b bVar = (cg.b) n4Var.f;
                                if (!h0Var2.C1) {
                                    k7Var.c2.setLoading(true);
                                    if (!h0Var2.C1) {
                                        h0Var2.C1 = true;
                                        h0Var2.y1.f(true);
                                    }
                                    ea.x(k7Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z9, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z9));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(h0Var.s1);
                            break;
                        }
                        break;
                    case 1:
                        h0 h0Var3 = this.b;
                        boolean z10 = h0Var3.x1;
                        h0Var3.x1 = !z10;
                        h0Var3.q1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.r1 = textView;
        int i12 = k6.Wc;
        k5.n(textView, i12, f6Var, 1, 14.0f);
        textView.setText(id.M0(2131749747, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
        final int i13 = 2;
        textView.setBackground(new w5(textView, this.b, org.telegram.messenger.g0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.b.addView(textView, ha.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.p1 = frameLayout;
        TextView textView2 = new TextView(context);
        r6.V(textView2, i12, f6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setText(id.M0(2131749748, null));
        frameLayout.addView(textView2, ha.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        wo woVar = new wo(18, context, f6Var);
        this.q1 = woVar;
        woVar.getCheckBoxBase().j(true);
        woVar.getCheckBoxBase().e = 0.9f;
        woVar.b(i12, i12, k6.k7);
        woVar.setDrawUnchecked(true);
        woVar.a(!this.x1, false);
        b4Var.getLayout().V = new bi.z3(this, i13);
        b4Var.getLayout().U = new bi.z3(this, 3);
        woVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(woVar, ha.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new w5(frameLayout, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground")));
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
                        if (h0Var.v1 - h0Var.w1 >= 0) {
                            n4 n4Var = h0Var.B1;
                            if (n4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = h0Var.o1.getTextWithEntities();
                                boolean z9 = h0Var.x1;
                                k7 k7Var = (k7) n4Var.c;
                                h0 h0Var2 = (h0) n4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.e;
                                long j10 = n4Var.b;
                                cg.b bVar = (cg.b) n4Var.f;
                                if (!h0Var2.C1) {
                                    k7Var.c2.setLoading(true);
                                    if (!h0Var2.C1) {
                                        h0Var2.C1 = true;
                                        h0Var2.y1.f(true);
                                    }
                                    ea.x(k7Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z9, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z9));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(h0Var.s1);
                            break;
                        }
                        break;
                    case 1:
                        h0 h0Var3 = this.b;
                        boolean z10 = h0Var3.x1;
                        h0Var3.x1 = !z10;
                        h0Var3.q1.a(z10, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(frameLayout, ha.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.t1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        w5 w5Var = new w5(imageView, this.b, org.telegram.messenger.g0.L(16.0f), J0("paintChatActionBackground"));
        int L5 = org.telegram.messenger.g0.L(32.0f);
        int L6 = org.telegram.messenger.g0.L(32.0f);
        Matrix matrix = ih.d.a;
        imageView.setBackground(new ih.c(L5, L6, w5Var));
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
                        if (h0Var.v1 - h0Var.w1 >= 0) {
                            n4 n4Var = h0Var.B1;
                            if (n4Var != null) {
                                TLRPC.TL_textWithEntities textWithEntities = h0Var.o1.getTextWithEntities();
                                boolean z9 = h0Var.x1;
                                k7 k7Var = (k7) n4Var.c;
                                h0 h0Var2 = (h0) n4Var.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) n4Var.e;
                                long j10 = n4Var.b;
                                cg.b bVar = (cg.b) n4Var.f;
                                if (!h0Var2.C1) {
                                    k7Var.c2.setLoading(true);
                                    if (!h0Var2.C1) {
                                        h0Var2.C1 = true;
                                        h0Var2.y1.f(true);
                                    }
                                    ea.x(k7Var.a, bVar).H(tL_starGiftUnique2, j10, textWithEntities, z9, new bi.i2(k7Var, h0Var2, bVar, tL_starGiftUnique2, j10, textWithEntities, z9));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.g0.F3(h0Var.s1);
                            break;
                        }
                        break;
                    case 1:
                        h0 h0Var3 = this.b;
                        boolean z10 = h0Var3.x1;
                        h0Var3.x1 = !z10;
                        h0Var3.q1.a(z10, true);
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

    @Override // org.telegram.ui.ActionBar.v2
    public final boolean G() {
        return false;
    }

    public final void I0() {
        rh.h hVar = this.n1;
        int i7 = hVar.f(647).b;
        float L = org.telegram.messenger.g0.L(36.0f) + i7;
        float inputBubbleHeight = this.m1.getInputBubbleHeight() + hVar.d() + org.telegram.messenger.g0.L(9.0f);
        int height = this.b.getHeight();
        b4 b4Var = this.i1;
        FrameLayout frameLayout = this.p1;
        b4Var.setTranslationY(Math.min(((L - (org.telegram.messenger.g0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - b4Var.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - org.telegram.messenger.g0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.g0.L(10.0f)) - b4Var.getHeight()));
        b4Var.invalidate();
        float y10 = b4Var.getY() - org.telegram.messenger.g0.L(33.0f);
        TextView textView = this.r1;
        textView.setTranslationY(y10);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.g0.L(14.0f)));
        frameLayout.invalidate();
        float f10 = i7;
        ImageView imageView = this.t1;
        imageView.setTranslationY(f10);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        f6 f6Var = this.I0;
        Paint d = f6Var != null ? f6Var.d("paintChatActionBackground") : null;
        return d != null ? d : k6.V0("paintChatActionBackground");
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void K() {
        super.K();
        this.o1.B0();
    }

    @Override // org.telegram.ui.ActionBar.v2, android.app.Dialog
    public final void onBackPressed() {
        e0 e0Var = this.o1;
        if (e0Var == null || !e0Var.s0()) {
            super.onBackPressed();
        } else {
            e0Var.k0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void s0() {
        super.s0();
        try {
            g0 g0Var = this.y1;
            if (g0Var != null) {
                g0Var.setScrimViewBackgroundColor(k6.w0(k6.d6, this.I0));
            }
        } catch (Exception e10) {
            a8.g(e10, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.v2
    public final void v() {
        u0(false);
        ch.v vVar = new ch.v(this, 11);
        org.telegram.ui.ActionBar.l2 l2Var = this.c;
        cc.a(l2Var, vVar);
        z20 z20Var = z20.s;
        if (z20Var.c()) {
            z20Var.b();
            TLObject e22 = qp.s1(this.a).e2(this.A1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.z1.title);
            sb2.append(" #");
            new hc(l2Var, this.I0).V(Arrays.asList(e22), id.M0(2131749750, null), org.telegram.messenger.g0.X2(id.a0(null, null, 2131749752, m5.u(e22), jg.g.m(r4.num, ',', sb2))), null).k(true);
        }
    }
}
