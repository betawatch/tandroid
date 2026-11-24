// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uc extends q59 {
    public final /* synthetic */ ad c;

    public uc(ad adVar) {
        this.c = adVar;
    }

    @Override // q59
    public final boolean D(u69 u69Var) {
        return u69Var.f == 0;
    }

    @Override // y59
    public final int b() {
        return this.c.S.size();
    }

    @Override // y59
    public final int d(int i) {
        return ((xc) this.c.S.get(i)).a;
    }

    @Override // y59
    public final void t(u69 u69Var, int i) {
        TL_agent.agentModel agentmodel;
        ad adVar = this.c;
        xc xcVar = (xc) adVar.S.get(i);
        View view = u69Var.a;
        if (!(view instanceof zc) || (agentmodel = xcVar.b) == null) {
            if (xcVar.a == 3 && (view instanceof TextView)) {
                ((TextView) view).setText(xcVar.c);
                return;
            }
            return;
        }
        String str = adVar.M;
        if (str == null) {
            TL_agent.settings settingsVar = adVar.y.d;
            str = settingsVar != null ? settingsVar.model : null;
        }
        zc zcVar = (zc) view;
        boolean equals = TextUtils.equals(agentmodel.id, str);
        zcVar.a.setText(agentmodel.name);
        zcVar.b.setText(!TextUtils.isEmpty(agentmodel.description) ? agentmodel.description : agentmodel.id);
        zcVar.c.setVisibility(equals ? 0 : 4);
    }

    @Override // y59
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        Context context = viewGroup.getContext();
        int i2 = cmb.D8;
        ad adVar = this.c;
        int p1 = cmb.p1(0.5f, cmb.v0(i2, adVar.d));
        int i3 = 55;
        if (i == 0) {
            view = new zc(adVar, context);
        } else if (i == 1) {
            view = new yc(adVar, context);
        } else {
            if (i == 3) {
                TextView textView = new TextView(context);
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(gm.o());
                textView.setTextColor(p1);
                textView.setSingleLine();
                textView.setGravity((jb6.a0 ? 5 : 3) | 80);
                textView.setPadding(gm.L(16.0f), 0, gm.L(16.0f), gm.L(3.0f));
                i3 = 26;
                view = textView;
            } else {
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setTextColor(p1);
                textView2.setGravity((jb6.a0 ? 5 : 3) | 16);
                textView2.setPadding(gm.L(16.0f), 0, gm.L(16.0f), 0);
                textView2.setText(jb6.M0(2131754282, null));
                i3 = 48;
                view = textView2;
            }
        }
        view.setLayoutParams(new g69(-1, gm.L(i3)));
        return new b59(view);
    }
}
