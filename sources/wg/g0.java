package wg;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import c8.ha;
import fi.r7;
import org.telegram.messenger.id;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.bc;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.zw;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class g0 extends ug.f1 {
    public static g0 N2;
    public final yg.a L2;
    public final String M2;

    public g0(f2 f2Var, int i7, TLRPC.User user, ug.j jVar, String str, boolean z9, h6 h6Var) {
        super(f2Var, i7, user, jVar, null, h6Var);
        this.M2 = str;
        bc.a((FrameLayout) this.b, new r7(15));
        if (!z9) {
            pj0 pj0Var = this.n1;
            int i10 = this.t0;
            pj0Var.setPadding(i10, 0, i10, org.telegram.messenger.g0.L(68.0f));
            yg.a aVar = new yg.a(getContext(), this.I0);
            this.L2 = aVar;
            aVar.setOnClickListener(new ii.g(this, 27));
            yg.a aVar2 = this.L2;
            aVar2.e = true;
            fi.d dVar = aVar2.a;
            dVar.setEnabled(true);
            dVar.i(id.M0(2131749675, null), false, true);
            t6.h(m6.h5, aVar2.b, aVar2.c);
            this.b.addView(this.L2, ha.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        }
        N();
    }

    public static void l1(g0 g0Var) {
        String str = "https://t.me/giftcode/" + g0Var.M2;
        zw zwVar = new zw(org.telegram.ui.Cells.f1.h(3, "onlySelect", "dialogsType", true));
        zwVar.D2 = new org.telegram.ui.web.a0(21, g0Var, str);
        g0Var.r1.presentFragment(zwVar);
        g0Var.dismiss();
    }

    @Override // org.telegram.ui.ActionBar.w2
    public final void K() {
        super.K();
        N2 = null;
    }

    @Override // ug.f1
    public final int f1() {
        return 6;
    }

    @Override // ug.f1
    public final void g1(View view) {
        ((yg.t) view).setSlug(this.M2);
    }

    @Override // ug.f1
    public final View h1(Context context, int i7) {
        if (i7 != 6) {
            return null;
        }
        yg.t tVar = new yg.t(context, this.I0);
        tVar.setPadding(0, 0, 0, org.telegram.messenger.g0.L(8.0f));
        return tVar;
    }

    @Override // ug.f1
    public final void j1(boolean z9) {
        super.j1(z9);
        this.K2.setLineSpacing(org.telegram.messenger.g0.L(2.0f), 1.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).bottomMargin = org.telegram.messenger.g0.L(14.0f);
        ((ViewGroup.MarginLayoutParams) this.K2.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(12.0f);
        this.K2.setText(org.telegram.messenger.g0.K2(org.telegram.messenger.g0.S2(id.M0(2131749679, "GiftPremiumAboutThisLink"), m6.Uc, 0, new e0(this, 0), null), org.telegram.messenger.g0.X2(id.M0(2131749678, "GiftPremiumAboutThisLinkEnd")), "%1$s"));
    }

    @Override // ug.f1
    public final void k1() {
        int i7 = this.a2;
        this.b2 = i7;
        this.c2 = i7 + 1;
        int i10 = i7 + 2;
        this.a2 = i10;
        this.d2 = i10;
        this.e2 = i10;
        int size = this.S1.size() + i10;
        this.f2 = size;
        this.a2 = size + 1;
        this.g2 = size;
    }
}
