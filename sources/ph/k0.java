package ph;

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
import java.util.Arrays;
import java.util.WeakHashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.m5;
import org.telegram.messenger.o5;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.f6;
import org.telegram.ui.Components.k7;
import org.telegram.ui.Components.r30;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Components.xc;
import org.telegram.ui.lh;
import org.telegram.ui.un;
import rh.e6;
import vh.k4;
import w7.b6;
import w7.b9;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class k0 extends org.telegram.ui.ActionBar.z2 {
    public final long A1;
    public lh B1;
    public boolean C1;
    public final h4 i1;
    public final zg.i j1;
    public final hi.g k1;
    public final tg.b l1;
    public final zg.e m1;
    public final hh.i n1;
    public final h0 o1;
    public final FrameLayout p1;
    public final ep q1;
    public final TextView r1;
    public final f6 s1;
    public final ImageView t1;
    public final Drawable u1;
    public final int v1;
    public int w1;
    public boolean x1;
    public final j0 y1;
    public final TL_stars.TL_starGiftUnique z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(Context context, p6 p6Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10) {
        super(context, (p6) null, true, true);
        un unVar;
        final int i10 = 1;
        this.j1 = new zg.i();
        final int i11 = 0;
        hh.i iVar = new hh.i(new e0(this, i11));
        this.n1 = iVar;
        org.telegram.messenger.i0.S(getWindow());
        this.z1 = tL_starGiftUnique;
        this.A1 = j10;
        this.v1 = vp.r1(this.a).E6;
        hi.g gVar = new hi.g();
        this.k1 = gVar;
        tg.b bVar = new tg.b(gVar);
        this.l1 = bVar;
        g0 g0Var = new g0(this, context);
        this.b = g0Var;
        int i12 = this.t0;
        g0Var.setPadding(i12, 0, i12, 0);
        zg.h hVar = new zg.h(this.b);
        ViewGroup viewGroup = this.b;
        bVar.f = hVar;
        bVar.g = viewGroup;
        hh.e eVar = new hh.e(this.c);
        ViewGroup viewGroup2 = this.b;
        iVar.D = eVar;
        iVar.E = viewGroup2;
        eVar.d.add(iVar);
        Drawable e = k4.e(null, this.a, j10, t6.I.q());
        this.u1 = e;
        g0Var.U(e);
        h4 h4Var = new h4(this.a, context, p6Var);
        this.i1 = h4Var;
        h4Var.a(tL_starGiftUnique, d20.i(this.a).e(), null, cd.L0(2131749754, null), false);
        h4Var.setPadding(0, org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f));
        h4Var.setLayoutBackground(new g6(h4Var, this.b, org.telegram.messenger.i0.L(18.0f), J0("paintChatActionBackground")));
        g0Var.addView(h4Var, b6.e(-2, -2, 48));
        zg.e eVar2 = new zg.e(context);
        this.m1 = eVar2;
        eVar2.setClipChildren(false);
        eVar2.setWindowInsetsProvider(iVar);
        eVar2.setInputIslandBubbleDrawable(bVar.c(eVar2, b9.b(p6Var), false));
        eVar2.setUnderKeyboardBackgroundDrawable(bVar.c(eVar2, b9.b(p6Var), false));
        FrameLayout inputIslandBubbleContainer = eVar2.getInputIslandBubbleContainer();
        inputIslandBubbleContainer.setClipChildren(false);
        FrameLayout inAppKeyboardBubbleContainer = eVar2.getInAppKeyboardBubbleContainer();
        h0 h0Var = new h0(this, org.telegram.messenger.i0.u0(), g0Var);
        this.o1 = h0Var;
        h0Var.setInAppInsetsController(iVar);
        h0Var.setOverrideHint(cd.L0(2131749759, null));
        h0Var.y4 = false;
        this.b.setClipChildren(false);
        this.b.setClipToPadding(false);
        h0Var.x4 = false;
        h0Var.i2 = !org.telegram.messenger.i0.E && ((unVar = h0Var.P2) == null || !unVar.isInBubbleMode());
        h0Var.T0(false, false, false);
        h0Var.e1(true, false);
        h0Var.z1.setPadding(0, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(20.0f), 0);
        h0Var.getSendButton().setAlpha(0.0f);
        h0Var.getEditField().setMaxLines(3);
        h0Var.setCustomWindowView(this.c);
        h0Var.setViewParentForEmoji(inAppKeyboardBubbleContainer);
        inputIslandBubbleContainer.addView(h0Var, b6.d(-1, -2.0f, 83, 7.0f, 0.0f, 7.0f, 0.0f));
        this.b.addView(eVar2.getFadeView(), b6.c(-1.0f, -1));
        this.b.addView(eVar2, b6.c(-1.0f, -1));
        h0Var.setDelegate(new i0(this, tL_starGiftUnique));
        se seVar = h0Var.E0;
        xc xcVar = new xc();
        InputFilter[] filters = seVar.getFilters();
        if (filters == null) {
            seVar.setFilters(new InputFilter[]{xcVar});
        } else {
            InputFilter[] inputFilterArr = (InputFilter[]) Arrays.copyOf(filters, filters.length + 1);
            inputFilterArr[filters.length] = xcVar;
            seVar.setFilters(inputFilterArr);
        }
        f6 f6Var = new f6(context, false, false, false);
        this.s1 = f6Var;
        f6Var.setAllowCancel(true);
        f6Var.setScaleProperty(0.6f);
        f6Var.setVisibility(8);
        f6Var.setTextSize(org.telegram.messenger.i0.L(15.0f));
        a7.Z(f6Var, t6.y6, p6Var);
        f6Var.setTypeface(org.telegram.messenger.i0.o());
        f6Var.setGravity(17);
        this.b.addView(f6Var, b6.d(56, 20.0f, 85, 3.0f, 0.0f, 3.0f, 54.0f));
        j0 j0Var = new j0(R.drawable.send_plane_24, context, p6Var, false);
        this.y1 = j0Var;
        int L = org.telegram.messenger.i0.L(38.0f);
        int L2 = org.telegram.messenger.i0.L(38.0f);
        j0Var.I = L;
        j0Var.J = L2;
        float L3 = org.telegram.messenger.i0.L(6.0f);
        float L4 = org.telegram.messenger.i0.L(8.0f);
        j0Var.M = L3;
        j0Var.N = L4;
        j0Var.h0 = true;
        this.b.addView(j0Var, b6.e(zs.v1, 50, 85));
        j0Var.setScrimViewBackgroundColor(t6.w0(t6.d6, this.I0));
        j0Var.setOnClickListener(new View.OnClickListener(this) { // from class: ph.f0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        k0 k0Var = this.b;
                        if (k0Var.v1 - k0Var.w1 >= 0) {
                            lh lhVar = k0Var.B1;
                            if (lhVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.o1.getTextWithEntities();
                                boolean z10 = k0Var.x1;
                                rh.e4 e4Var = (rh.e4) lhVar.c;
                                k0 k0Var2 = (k0) lhVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) lhVar.e;
                                long j11 = lhVar.b;
                                sf.b bVar2 = (sf.b) lhVar.f;
                                if (!k0Var2.C1) {
                                    e4Var.c2.setLoading(true);
                                    if (!k0Var2.C1) {
                                        k0Var2.C1 = true;
                                        k0Var2.y1.h(true);
                                    }
                                    e6.x(e4Var.a, bVar2).H(tL_starGiftUnique2, j11, textWithEntities, z10, new rh.c1(e4Var, k0Var2, bVar2, tL_starGiftUnique2, j11, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.i0.E3(k0Var.s1);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var3 = this.b;
                        boolean z11 = k0Var3.x1;
                        k0Var3.x1 = !z11;
                        k0Var3.q1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        TextView textView = new TextView(context);
        this.r1 = textView;
        int i13 = t6.Wc;
        m5.m(textView, i13, p6Var, 1, 14.0f);
        textView.setText(cd.L0(2131749755, null));
        textView.setGravity(17);
        textView.setPadding(org.telegram.messenger.i0.L(10.0f), 0, org.telegram.messenger.i0.L(10.0f), 0);
        final int i14 = 2;
        textView.setBackground(new g6(textView, this.b, org.telegram.messenger.i0.L(23.0f) / 2, J0("paintChatActionBackground")));
        this.b.addView(textView, b6.e(-2, 23, 49));
        FrameLayout frameLayout = new FrameLayout(context);
        this.p1 = frameLayout;
        TextView textView2 = new TextView(context);
        a7.V(textView2, i13, p6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setText(cd.L0(2131749756, null));
        frameLayout.addView(textView2, b6.d(-2, -2.0f, 16, 36.0f, 0.0f, 14.0f, 0.0f));
        ep epVar = new ep(18, context, p6Var);
        this.q1 = epVar;
        epVar.getCheckBoxBase().j(true);
        epVar.getCheckBoxBase().e = 0.9f;
        epVar.b(i13, i13, t6.k7);
        epVar.setDrawUnchecked(true);
        epVar.a(!this.x1, false);
        h4Var.getLayout().V = new e0(this, i10);
        h4Var.getLayout().U = new e0(this, i14);
        epVar.setDrawBackgroundAsArc(10);
        frameLayout.addView(epVar, b6.d(18, 18.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setBackground(new g6(frameLayout, this.b, org.telegram.messenger.i0.L(16.0f), J0("paintChatActionBackground")));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ph.f0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        k0 k0Var = this.b;
                        if (k0Var.v1 - k0Var.w1 >= 0) {
                            lh lhVar = k0Var.B1;
                            if (lhVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.o1.getTextWithEntities();
                                boolean z10 = k0Var.x1;
                                rh.e4 e4Var = (rh.e4) lhVar.c;
                                k0 k0Var2 = (k0) lhVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) lhVar.e;
                                long j11 = lhVar.b;
                                sf.b bVar2 = (sf.b) lhVar.f;
                                if (!k0Var2.C1) {
                                    e4Var.c2.setLoading(true);
                                    if (!k0Var2.C1) {
                                        k0Var2.C1 = true;
                                        k0Var2.y1.h(true);
                                    }
                                    e6.x(e4Var.a, bVar2).H(tL_starGiftUnique2, j11, textWithEntities, z10, new rh.c1(e4Var, k0Var2, bVar2, tL_starGiftUnique2, j11, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.i0.E3(k0Var.s1);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var3 = this.b;
                        boolean z11 = k0Var3.x1;
                        k0Var3.x1 = !z11;
                        k0Var3.q1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(frameLayout, b6.e(-2, 32, 81));
        ImageView imageView = new ImageView(context);
        this.t1 = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        g6 g6Var = new g6(imageView, this.b, org.telegram.messenger.i0.L(16.0f), J0("paintChatActionBackground"));
        int L5 = org.telegram.messenger.i0.L(32.0f);
        int L6 = org.telegram.messenger.i0.L(32.0f);
        Matrix matrix = yg.d.a;
        imageView.setBackground(new yg.c(L5, L6, g6Var));
        imageView.setOnClickListener(new View.OnClickListener(this) { // from class: ph.f0
            public final /* synthetic */ k0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i14) {
                    case 0:
                        k0 k0Var = this.b;
                        if (k0Var.v1 - k0Var.w1 >= 0) {
                            lh lhVar = k0Var.B1;
                            if (lhVar != null) {
                                TLRPC.TL_textWithEntities textWithEntities = k0Var.o1.getTextWithEntities();
                                boolean z10 = k0Var.x1;
                                rh.e4 e4Var = (rh.e4) lhVar.c;
                                k0 k0Var2 = (k0) lhVar.d;
                                TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) lhVar.e;
                                long j11 = lhVar.b;
                                sf.b bVar2 = (sf.b) lhVar.f;
                                if (!k0Var2.C1) {
                                    e4Var.c2.setLoading(true);
                                    if (!k0Var2.C1) {
                                        k0Var2.C1 = true;
                                        k0Var2.y1.h(true);
                                    }
                                    e6.x(e4Var.a, bVar2).H(tL_starGiftUnique2, j11, textWithEntities, z10, new rh.c1(e4Var, k0Var2, bVar2, tL_starGiftUnique2, j11, textWithEntities, z10));
                                    break;
                                }
                            }
                        } else {
                            org.telegram.messenger.i0.E3(k0Var.s1);
                            break;
                        }
                        break;
                    case 1:
                        k0 k0Var3 = this.b;
                        boolean z11 = k0Var3.x1;
                        k0Var3.x1 = !z11;
                        k0Var3.q1.a(z11, true);
                        break;
                    default:
                        this.b.dismiss();
                        break;
                }
            }
        });
        this.b.addView(imageView, b6.e(56, 56, 53));
        w7.e6.b(frameLayout, 0.05f, 1.2f);
        w7.e6.a(imageView);
        ViewGroup viewGroup3 = this.b;
        mg.l lVar = new mg.l(this, 21);
        WeakHashMap weakHashMap = r0.h0.a;
        r0.z.i(viewGroup3, lVar);
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final boolean H() {
        return false;
    }

    public final void I0() {
        hh.i iVar = this.n1;
        int i10 = iVar.f(647).b;
        float L = org.telegram.messenger.i0.L(36.0f) + i10;
        float inputBubbleHeight = this.m1.getInputBubbleHeight() + iVar.d() + org.telegram.messenger.i0.L(9.0f);
        int height = this.b.getHeight();
        h4 h4Var = this.i1;
        FrameLayout frameLayout = this.p1;
        h4Var.setTranslationY(Math.min(((L - (org.telegram.messenger.i0.L(46.0f) + inputBubbleHeight)) / 2.0f) + ((height - h4Var.getHeight()) / 2.0f), ((((this.b.getHeight() - inputBubbleHeight) - org.telegram.messenger.i0.L(14.0f)) - frameLayout.getHeight()) - org.telegram.messenger.i0.L(10.0f)) - h4Var.getHeight()));
        h4Var.invalidate();
        float y3 = h4Var.getY() - org.telegram.messenger.i0.L(33.0f);
        TextView textView = this.r1;
        textView.setTranslationY(y3);
        textView.invalidate();
        frameLayout.setTranslationY(-(inputBubbleHeight + org.telegram.messenger.i0.L(14.0f)));
        frameLayout.invalidate();
        float f7 = i10;
        ImageView imageView = this.t1;
        imageView.setTranslationY(f7);
        imageView.invalidate();
    }

    public final Paint J0(String str) {
        p6 p6Var = this.I0;
        Paint d = p6Var != null ? p6Var.d("paintChatActionBackground") : null;
        return d != null ? d : t6.V0("paintChatActionBackground");
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void L() {
        super.L();
        this.o1.z0();
    }

    @Override // org.telegram.ui.ActionBar.z2, android.app.Dialog
    public final void onBackPressed() {
        h0 h0Var = this.o1;
        if (h0Var == null || !h0Var.q0()) {
            super.onBackPressed();
        } else {
            h0Var.i0(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void s0() {
        super.s0();
        try {
            j0 j0Var = this.y1;
            if (j0Var != null) {
                j0Var.setScrimViewBackgroundColor(t6.w0(t6.d6, this.I0));
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }

    @Override // org.telegram.ui.ActionBar.z2
    public final void w() {
        u0(false);
        k7 k7Var = new k7(this, 6);
        org.telegram.ui.ActionBar.p2 p2Var = this.c;
        wb.a(p2Var, k7Var);
        r30 r30Var = r30.s;
        if (r30Var.c()) {
            r30Var.b();
            TLObject d22 = vp.r1(this.a).d2(this.A1);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.z1.title);
            sb2.append(" #");
            new cc(p2Var, this.I0).V(Arrays.asList(d22), cd.L0(2131749758, null), org.telegram.messenger.i0.W2(cd.a0(null, null, 2131749760, o5.u(d22), i0.a.k(r4.num, ',', sb2))), null).k(true);
        }
    }
}
