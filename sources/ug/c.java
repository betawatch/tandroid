package ug;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ma;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Cells.w3;
import org.telegram.ui.Components.Premium.LimitPreviewView;
import org.telegram.ui.Components.bk0;
import org.telegram.ui.ih0;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class c extends bk0 {
    public final i6 c;
    public final int d;
    public final int e;
    public final ArrayList f;
    public final b1 h;
    public int n;
    public b r;
    public final boolean s;

    public c(int i7, i6 i6Var) {
        ArrayList arrayList = new ArrayList();
        this.f = arrayList;
        this.s = true;
        this.c = i6Var;
        b1 b1Var = new b1(n6.Ck, n6.Dk, n6.Ek, n6.Fk, i6Var);
        this.h = b1Var;
        b1Var.o = 0.0f;
        b1Var.p = 0.0f;
        b1Var.q = 1.0f;
        mp u12 = mp.u1(i7);
        arrayList.add(new d(u12.G4, u12.H4, gd.M0(2131749187, null), gd.a0(null, null, 2131749188, Integer.valueOf(u12.H4))));
        arrayList.add(new d(u12.S4, u12.T4, gd.M0(2131747055, null), gd.a0(null, null, 2131747056, Integer.valueOf(u12.T4))));
        arrayList.add(new d(u12.U4, u12.V4, gd.M0(2131746394, null), gd.a0(null, null, 2131746395, Integer.valueOf(u12.V4))));
        arrayList.add(new d(u12.I4, u12.J4, gd.M0(2131745707, null), gd.a0(null, null, 2131745708, Integer.valueOf(u12.J4))));
        arrayList.add(new d(u12.K4, u12.L4, gd.M0(2131750828, null), gd.a0(null, null, 2131750829, Integer.valueOf(u12.L4))));
        arrayList.add(new d(u12.a5, u12.b5, gd.M0(2131753717, null), gd.a0(null, null, 2131753718, Integer.valueOf(u12.L4))));
        arrayList.add(new d(u12.W4, u12.X4, gd.M0(2131752543, null), gd.a0(null, null, 2131752544, Integer.valueOf(u12.L4))));
        arrayList.add(new d(u12.O4, u12.P4, gd.M0(2131750595, null), gd.a0(null, null, 2131750596, Integer.valueOf(u12.P4))));
        arrayList.add(new d(u12.Q4, u12.R4, gd.M0(2131752204, null), gd.a0(null, null, 2131752205, Integer.valueOf(u12.R4))));
        arrayList.add(new d(3, 4, gd.M0(2131751799, null), gd.a0(null, null, 2131751800, 4)));
        arrayList.add(new d(u12.z4, u12.A4, gd.M0(2131745120, null), gd.a0(null, null, 2131745121, Integer.valueOf(u12.A4))));
        this.d = 1;
        this.e = 1;
        this.d = arrayList.size() + 1;
    }

    @Override // org.telegram.ui.Components.bk0
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override // v4.i0
    public final int b() {
        return this.d;
    }

    @Override // v4.i0
    public final int d(int i7) {
        if (i7 == 0) {
            return 1;
        }
        return i7 == 0 ? 2 : 0;
    }

    @Override // v4.i0
    public final void t(v4.f1 f1Var, int i7) {
        if (f1Var.f == 0) {
            e eVar = (e) f1Var.a;
            int i10 = i7 - this.e;
            ArrayList arrayList = this.f;
            eVar.a((d) arrayList.get(i10));
            LimitPreviewView limitPreviewView = eVar.c;
            limitPreviewView.G = ((d) arrayList.get(i10)).e;
            limitPreviewView.c = this.n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [android.view.ViewGroup, org.telegram.ui.ih0] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ug.e] */
    @Override // v4.i0
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        w3 w3Var;
        Context context = viewGroup.getContext();
        i6 i6Var = this.c;
        if (i7 != 1) {
            if (i7 != 2) {
                ?? eVar = new e(context, i6Var);
                b bVar = this.r;
                LimitPreviewView limitPreviewView = eVar.c;
                limitPreviewView.setParentViewForGradien(bVar);
                limitPreviewView.setStaticGradinet(this.h);
                w3Var = eVar;
            } else {
                w3Var = new w3(context, 16);
            }
        } else if (this.s) {
            ?? ih0Var = new ih0(context, 20);
            LinearLayout g10 = f3.g(context, 0);
            ImageView imageView = new ImageView(context);
            imageView.setImageDrawable(ia.e.c(context.getDrawable(R.drawable.other_2x_large), (b1) ia.e.d().b));
            g10.addView(imageView, ma.d(40, 28.0f, 16, 0.0f, 0.0f, 8.0f, 0.0f));
            TextView textView = new TextView(context);
            textView.setText(gd.M0(2131751338, null));
            textView.setGravity(17);
            textView.setTextSize(1, 20.0f);
            u6.U(textView, n6.G6, i6Var);
            textView.setTypeface(org.telegram.messenger.g0.o());
            g10.addView(textView, ma.e(-2, -2, 16));
            ih0Var.addView(g10, ma.e(-2, -2, 17));
            w3Var = ih0Var;
        } else {
            w3Var = new w3(context, 64);
        }
        return i5.c.q(w3Var, w3Var, -1, -2);
    }
}
