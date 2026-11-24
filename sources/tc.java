// default package

import android.content.Context;
import android.text.TextUtils;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_agent;
import org.telegram.ui.ActionBar.d;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class tc extends LinearLayout implements jm7 {
    public static final /* synthetic */ int h = 0;
    public final int a;
    public final d b;
    public final ylb c;
    public final sc d;
    public int e;
    public boolean f;

    public tc(Context context, int i, d dVar, ylb ylbVar) {
        super(context);
        this.e = ConnectionsManager.DEFAULT_DATACENTER_ID;
        this.a = i;
        this.b = dVar;
        this.c = ylbVar;
        setOrientation(0);
        setGravity(16);
        sc scVar = new sc(this, context);
        this.d = scVar;
        scVar.setOnClickListener(new j1(this, (byte) 7));
        rve.b(scVar, 0.05f, 1.2f);
        addView(scVar, qoe.r(-2, 26, 16));
        a();
    }

    public final void a() {
        String M0;
        mc c = mc.c(this.a);
        TL_agent.settings settingsVar = c.d;
        int i = cmb.Ke;
        ylb ylbVar = this.c;
        int v0 = cmb.v0(i, ylbVar);
        String str = settingsVar == null ? null : !TextUtils.isEmpty(settingsVar.model_name) ? settingsVar.model_name : settingsVar.model;
        sc scVar = this.d;
        TextView textView = scVar.a;
        TextView textView2 = scVar.b;
        if (TextUtils.isEmpty(str)) {
            str = jb6.M0(2131754285, null);
        }
        textView.setText(str);
        scVar.a.setTextColor(v0);
        String b = c.b();
        b.getClass();
        switch (b) {
            case "expert":
                M0 = jb6.M0(2131754291, null);
                break;
            case "fast":
                M0 = jb6.M0(2131754290, null);
                break;
            case "ultra":
                M0 = jb6.M0(2131754287, null);
                break;
            default:
                M0 = jb6.M0(2131754289, null);
                break;
        }
        textView2.setText(M0);
        textView2.setTextColor(cmb.p1(0.5f, v0));
        textView2.setVisibility((settingsVar == null || !settingsVar.effort_supported) ? 8 : 0);
        if (!this.f || scVar.getBackground() != null) {
            this.f = true;
            int L = gm.L(13.0f);
            int p1 = cmb.p1(0.06f, cmb.v0(i, ylbVar));
            int p12 = cmb.p1(0.12f, v0);
            scVar.setBackground(cmb.i0(L, L, L, L, p1, p12, p12));
        }
        scVar.requestLayout();
    }

    @Override // jm7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        ad adVar;
        if (i == nm7.c4) {
            a();
            d dVar = this.b;
            if (!(dVar instanceof yv1) || (adVar = ((yv1) dVar).bc) == null) {
                return;
            }
            wc wcVar = adVar.E;
            if (adVar.c.d(adVar)) {
                wcVar.c();
                wcVar.d(true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        nm7.f(this.a).a(this, nm7.c4);
        a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        nm7.f(this.a).n(this, nm7.c4);
    }

    public void setChipMaxWidth(int i) {
        if (this.e != i) {
            this.e = i;
            this.d.requestLayout();
        }
    }
}
