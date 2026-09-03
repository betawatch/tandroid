package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import f2.d0;
import f2.f0;
import fg.s0;
import java.util.HashMap;
import jg.u;
import k7.c6;
import mh.m5;
import oh.d6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.nr0;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.v31;
import org.telegram.ui.Components.zi;
import org.telegram.ui.Components.zw0;
import org.telegram.ui.cp;
import org.telegram.ui.mi1;
import org.telegram.ui.vd1;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class l extends FrameLayout {
    public static final /* synthetic */ int U = 0;
    public final s0 B;
    public final qh.d C;
    public final f0 D;
    public boolean E;
    public boolean F;
    public final i G;
    public boolean H;
    public boolean I;
    public boolean J;
    public int K;
    public int L;
    public float M;
    public float N;
    public boolean O;
    public int P;
    public int Q;
    public int R;
    public final Rect S;
    public final /* synthetic */ nr0 T;
    public d6 a;
    public boolean b;
    public float c;
    public int d;
    public int e;
    public final e f;
    public final g61 h;
    public final f2.l n;
    public final pt0 r;
    public final zi s;
    public final g v;
    public final k w;
    public final h x;
    public final zw0 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(nr0 nr0Var, Context context) {
        super(context);
        this.T = nr0Var;
        this.d = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.e = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.E = false;
        this.F = false;
        this.S = new Rect();
        g61 g61Var = new g61();
        this.h = g61Var;
        g61Var.O = new d(this, 1);
        g61Var.y1(this.d);
        f2.l lVar = new f2.l();
        this.n = lVar;
        lVar.n(280L);
        lVar.o(pr.h);
        lVar.m = false;
        e eVar = new e(this, context);
        this.f = eVar;
        eVar.setScrollingTouchSlop(1);
        eVar.setPinnedSectionOffsetY(-AndroidUtilities.dp(2.0f));
        eVar.setPadding(0, 0, 0, 0);
        eVar.setItemAnimator(null);
        eVar.setClipToPadding(false);
        eVar.setSectionsType(2);
        eVar.setLayoutManager(g61Var);
        addView(eVar, c6.c(-1.0f, -1));
        eVar.i(new f(this, 0));
        eVar.setOnItemClickListener(new ag.h(this, 13));
        eVar.setOnItemLongClickListener(new m5(this, 22));
        pt0 pt0Var = new pt0(context, null);
        this.r = pt0Var;
        zi ziVar = new zi(this);
        this.s = ziVar;
        pt0Var.setLayoutManager(ziVar);
        pt0Var.i(new f(this, 1));
        ziVar.y1(this.e);
        pt0Var.setVisibility(8);
        addView(pt0Var, c6.c(-1.0f, -1));
        g gVar = new g(this, context);
        this.v = gVar;
        eVar.setAdapter(gVar);
        k kVar = new k(this, getContext());
        gVar.f = kVar;
        this.w = kVar;
        pt0Var.setAdapter(kVar);
        h hVar = new h(this, context);
        this.x = hVar;
        hVar.w = false;
        zw0 zw0Var = new zw0(context, hVar, 1, null);
        this.y = zw0Var;
        zw0Var.setVisibility(8);
        zw0Var.setAnimateLayoutChange(true);
        addView(zw0Var, c6.c(-1.0f, -1));
        zw0Var.setOnTouchListener(new mi1(1));
        zw0Var.e(true, false);
        zw0Var.b.setVisibility(8);
        zw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
        zw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(nr0Var.b).botPreviewMediasMax, new Object[0]));
        String string = LocaleController.getString(R.string.ProfileBotPreviewEmptyButton);
        qh.d dVar = zw0Var.f;
        dVar.g(string, false, true);
        dVar.setVisibility(0);
        dVar.setOnClickListener(new c(this, 0));
        s0 s0Var = new s0(this, context);
        this.B = s0Var;
        int i10 = k6.y6;
        g6 g6Var = nr0Var.c;
        s0Var.setTextColor(k6.v0(i10, g6Var));
        s0Var.setText(LocaleController.getString(R.string.ProfileBotOr));
        s0Var.setTextSize(1, 14.0f);
        s0Var.setTextAlignment(4);
        s0Var.setGravity(17);
        s0Var.setTypeface(AndroidUtilities.bold());
        zw0Var.a.addView(s0Var, c6.t(165, -2, 17, 0, 17, 0, 12));
        qh.d dVar2 = new qh.d(context, g6Var, false);
        this.C = dVar2;
        dVar2.setMinWidth(AndroidUtilities.dp(200.0f));
        zw0Var.a.addView(dVar2, c6.q(-2, 44, 17));
        zw0Var.addView(hVar, 0, c6.c(-1.0f, -1));
        eVar.setEmptyView(zw0Var);
        eVar.V1 = true;
        eVar.W1 = 0;
        new SparseArray();
        new HashMap();
        f0 f0Var = new f0(new cp(this, 6));
        this.D = f0Var;
        f0Var.d(eVar);
        i iVar = new i(context, g6Var);
        this.G = iVar;
        addView(iVar, c6.e(-1, -2, 48));
    }

    public final void a() {
        if (this.b) {
            float f10 = this.c;
            pt0 pt0Var = this.r;
            e eVar = this.f;
            if (f10 != 1.0f) {
                if (f10 == 0.0f) {
                    this.b = false;
                    pt0Var.setVisibility(8);
                    eVar.invalidate();
                    return;
                }
                boolean z4 = f10 > 0.2f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, z4 ? 1.0f : 0.0f);
                ofFloat.addUpdateListener(new d0(this, 9));
                ofFloat.addListener(new vd1(5, this, z4));
                ofFloat.setInterpolator(pr.f);
                ofFloat.setDuration(200L);
                ofFloat.start();
                return;
            }
            this.b = false;
            int i10 = this.e;
            this.d = i10;
            this.T.y = i10;
            SharedConfig.setStoriesColumnsCount(i10);
            g gVar = this.v;
            int h = gVar.h();
            pt0Var.setVisibility(8);
            int i11 = this.d;
            g61 g61Var = this.h;
            g61Var.y1(i11);
            eVar.a0();
            eVar.invalidate();
            if (gVar.h() == h) {
                AndroidUtilities.updateVisibleRows(eVar);
            } else {
                gVar.l();
            }
            int i12 = this.P;
            if (i12 >= 0) {
                View m9 = this.s.m(i12);
                if (m9 != null) {
                    this.Q = m9.getTop();
                }
                g61Var.h1(this.P, (-eVar.getPaddingTop()) + this.Q);
            }
        }
    }

    public final void b(boolean z4) {
        if (this.b || this.T.D.z1) {
            return;
        }
        int i10 = this.d + (!z4 ? 1 : -1);
        if (i10 > 6) {
            i10 = !z4 ? 9 : 6;
        }
        int clamp = Utilities.clamp(i10, 6, this.E ? 1 : 2);
        this.e = clamp;
        if (clamp == this.d || this.E) {
            return;
        }
        pt0 pt0Var = this.r;
        pt0Var.setVisibility(0);
        pt0Var.setAdapter(this.w);
        pt0Var.setPadding(pt0Var.getPaddingLeft(), 0, pt0Var.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
        zi ziVar = this.s;
        ziVar.y1(clamp);
        pt0Var.a0();
        ziVar.O = new d(this, 0);
        AndroidUtilities.updateVisibleRows(this.f);
        this.b = true;
        this.c = 0.0f;
        int i11 = this.P;
        if (i11 >= 0) {
            ziVar.h1(i11, this.Q - pt0Var.getPaddingTop());
        }
    }

    public final void c() {
        String string;
        int i10 = this.T.b;
        d6 d6Var = this.a;
        int size = d6Var == null ? 0 : d6Var.i.size();
        d6 d6Var2 = this.a;
        int i11 = 1;
        boolean z4 = d6Var2 == null || TextUtils.isEmpty(d6Var2.E);
        int i12 = size > 0 ? 0 : 8;
        i iVar = this.G;
        iVar.setVisibility(i12);
        String string2 = z4 ? LocaleController.getString(R.string.ProfileBotPreviewFooterGeneral) : LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, v31.D(this.a.E, null, null));
        String string3 = LocaleController.getString(R.string.ProfileBotAddPreview);
        org.telegram.ui.web.s0 s0Var = new org.telegram.ui.web.s0(this, 7);
        if (z4 || size <= 0) {
            string = LocaleController.getString(z4 ? R.string.ProfileBotPreviewFooterCreateTranslation : R.string.ProfileBotPreviewFooterDeleteTranslation);
        } else {
            string = null;
        }
        qv0 qv0Var = (z4 || size <= 0) ? new qv0(10, this, z4) : null;
        s0 s0Var2 = iVar.c;
        qh.d dVar = iVar.d;
        iVar.a.setText(string2);
        mh.n nVar = iVar.b;
        nVar.g(string3, false, true);
        nVar.setOnClickListener(new org.telegram.ui.Components.voip.o(s0Var, 5));
        if (string == null) {
            s0Var2.setVisibility(8);
            dVar.setVisibility(8);
        } else {
            s0Var2.setVisibility(0);
            dVar.setVisibility(0);
            dVar.g(string, false, true);
            dVar.setOnClickListener(new u(3, qv0Var));
        }
        s0 s0Var3 = this.B;
        qh.d dVar2 = this.C;
        zw0 zw0Var = this.y;
        if (z4) {
            zw0Var.d.setVisibility(0);
            zw0Var.d.setText(LocaleController.getString(R.string.ProfileBotPreviewEmptyTitle));
            zw0Var.e.setText(LocaleController.formatPluralString("ProfileBotPreviewEmptyText", MessagesController.getInstance(i10).botPreviewMediasMax, new Object[0]));
            zw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var3.setVisibility(8);
            dVar2.setVisibility(8);
        } else {
            zw0Var.d.setVisibility(8);
            zw0Var.e.setText(LocaleController.formatString(R.string.ProfileBotPreviewFooterLanguage, v31.D(this.a.E, null, null)));
            zw0Var.f.g(LocaleController.getString(R.string.ProfileBotPreviewEmptyButton), false, true);
            s0Var3.setVisibility(0);
            dVar2.setVisibility(0);
            dVar2.g(LocaleController.getString(R.string.ProfileBotPreviewFooterDeleteTranslation), false, true);
            dVar2.setOnClickListener(new c(this, i11));
        }
        zw0Var.f.setVisibility(this.v.h() >= MessagesController.getInstance(i10).botPreviewMediasMax ? 8 : 0);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (view == this.r) {
            return true;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        e eVar = this.f;
        eVar.setPadding(eVar.getPaddingLeft(), eVar.V2, eVar.getPaddingRight(), this.G.getMeasuredHeight() + AndroidUtilities.dp(42.0f));
    }

    public void setList(d6 d6Var) {
        if (this.a != d6Var) {
            this.E = false;
            this.F = false;
            this.d = this.T.y;
        }
        this.a = d6Var;
        g gVar = this.v;
        gVar.e = d6Var;
        if (gVar != gVar.s.w) {
            gVar.M();
        }
        gVar.l();
        k kVar = this.w;
        kVar.e = d6Var;
        if (kVar != kVar.s.w) {
            kVar.M();
        }
        kVar.l();
        c();
    }

    public void setVisibleHeight(int i10) {
        float f10 = (-(getMeasuredHeight() - Math.max(i10, AndroidUtilities.dp(280.0f)))) / 2.0f;
        this.y.setTranslationY(f10);
        this.x.setTranslationY(-f10);
    }
}
