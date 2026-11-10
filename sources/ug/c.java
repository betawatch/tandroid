package ug;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ha;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.id;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.v3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.vq0;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class c extends oj0 {
    public final h6 c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final y0 h;
    public int n;
    public b r;
    public final boolean s;

    public c(int i7, h6 h6Var) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.s = true;
        this.c = h6Var;
        y0 y0Var = new y0(m6.zk, m6.Ak, m6.Bk, m6.Ck, h6Var);
        this.h = y0Var;
        y0Var.o = 0.0f;
        y0Var.p = 0.0f;
        y0Var.q = 1.0f;
        qp s12 = qp.s1(i7);
        arrayList.add(new d(s12.D4, s12.E4, id.M0(2131749379, null), id.a0(null, null, 2131749380, Integer.valueOf(s12.E4))));
        arrayList.add(new d(s12.P4, s12.Q4, id.M0(2131747248, null), id.a0(null, null, 2131747249, Integer.valueOf(s12.Q4))));
        arrayList.add(new d(s12.R4, s12.S4, id.M0(2131746589, null), id.a0(null, null, 2131746590, Integer.valueOf(s12.S4))));
        arrayList.add(new d(s12.F4, s12.G4, id.M0(2131745902, null), id.a0(null, null, 2131745903, Integer.valueOf(s12.G4))));
        arrayList.add(new d(s12.H4, s12.I4, id.M0(2131750839, null), id.a0(null, null, 2131750840, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.X4, s12.Y4, id.M0(2131753719, null), id.a0(null, null, 2131753720, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.T4, s12.U4, id.M0(2131752554, null), id.a0(null, null, 2131752555, Integer.valueOf(s12.I4))));
        arrayList.add(new d(s12.L4, s12.M4, id.M0(2131750611, null), id.a0(null, null, 2131750612, Integer.valueOf(s12.M4))));
        arrayList.add(new d(s12.N4, s12.O4, id.M0(2131752215, null), id.a0(null, null, 2131752216, Integer.valueOf(s12.O4))));
        arrayList.add(new d(3, 4, id.M0(2131751810, null), id.a0(null, null, 2131751811, 4)));
        arrayList.add(new d(s12.w4, s12.x4, id.M0(2131745315, null), id.a0(null, null, 2131745316, Integer.valueOf(s12.x4))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override // org.telegram.ui.Components.oj0
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override // v4.g0
    public final int b() {
        return this.d;
    }

    @Override // v4.g0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == 0 ? 2 : 0;
    }

    @Override // v4.g0
    public final void t(v4.d1 d1Var, int i7) {
        if (d1Var.f == 0) {
            e eVar = (e) d1Var.a;
            int i10 = i7 - this.e;
            ArrayList arrayList = this.f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.c;
            limitPreviewView.F = ((d) arrayList.get(i10)).e;
            limitPreviewView.c = this.n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewGroup, org.telegram.ui.vq0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ug.e] */
    @Override // v4.g0
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        v3 v3Var;
        Context context = viewGroup.getContext();
        h6 h6Var = this.c;
        if (i7 != 1) {
            if (i7 != 2) {
                ?? eVar = new e(context, h6Var);
                b bVar = this.r;
                LimitPreviewView limitPreviewView = eVar.c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                v3Var = eVar;
            } else {
                v3Var = new v3(context, 16);
            }
        } else if (this.s) {
            ?? vq0Var = new vq0(context, 18);
            LinearLayout f10 = k5.f(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ia.e.c(context.getDrawable(R.drawable.other_2x_large), (y0) ia.e.d().b));
            f10.addView(imageView, ha.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(id.M0(2131751349, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            t6.U(textView, m6.G6, h6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            f10.addView(textView, ha.e(-2, -2, 16));
            vq0Var.addView(f10, ha.e(-2, -2, 17));
            v3Var = vq0Var;
        } else {
            v3Var = new v3(context, 64);
        }
        return jg.g.r(v3Var, v3Var, -1, -2);
    }
}
