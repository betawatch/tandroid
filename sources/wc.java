// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.tl.TL_agent;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class wc extends LinearLayout {
    public final vc a;
    public final r59 b;
    public final uc c;
    public final View d;
    public final View e;
    public final LinearLayout f;
    public final io h;
    public final rc n;
    public int r;
    public final /* synthetic */ ad s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc(ad adVar, Context context) {
        super(context);
        this.s = adVar;
        this.r = -1;
        byte b = 1;
        setOrientation(1);
        int i = cmb.D8;
        ylb ylbVar = adVar.d;
        int v0 = cmb.v0(i, ylbVar);
        int p1 = cmb.p1(0.5f, v0);
        FrameLayout frameLayout = new FrameLayout(context);
        ImageView k = td4.k(context, R.drawable.smiles_inputsearch);
        k.setScaleType(ImageView.ScaleType.CENTER);
        k.setColorFilter(new PorterDuffColorFilter(p1, PorterDuff.Mode.SRC_IN));
        frameLayout.addView(k, qoe.d(24, 24.0f, (jb6.a0 ? 5 : 3) | 16, 14.0f, 0.0f, 14.0f, 0.0f));
        vc vcVar = new vc(context, (byte) 0);
        this.a = vcVar;
        vcVar.setTextSize(1, 16.0f);
        vcVar.setTextColor(v0);
        vcVar.setHintTextColor(p1);
        vcVar.setCursorColor(cmb.v0(cmb.Ei, ylbVar));
        vcVar.setCursorSize(gm.L(18.0f));
        vcVar.setCursorWidth(1.5f);
        vcVar.setBackground(null);
        vcVar.setPadding(0, 0, 0, 0);
        vcVar.setSingleLine();
        vcVar.setInputType(524289);
        vcVar.setImeOptions(268435459);
        vcVar.setHint(jb6.M0(2131754284, null));
        vcVar.setGravity((jb6.a0 ? 5 : 3) | 16);
        byte b2 = 2;
        vcVar.setOnEditorActionListener(new j(this, b2));
        vcVar.addTextChangedListener(new b7(this, b));
        frameLayout.addView(vcVar, qoe.d(-1, -1.0f, nm7.D1, 52.0f, 0.0f, 16.0f, 0.0f));
        addView(frameLayout, qoe.o(-1, 48));
        View view = new View(context);
        this.d = view;
        view.setBackgroundColor(cmb.p1(0.1f, v0));
        addView(view, new LinearLayout.LayoutParams(-1, Math.max(1, gm.L(0.5f))));
        r59 r59Var = new r59(context, ylbVar);
        this.b = r59Var;
        r59Var.setLayoutManager(new u46());
        uc ucVar = new uc(adVar);
        this.c = ucVar;
        r59Var.setAdapter(ucVar);
        r59Var.setVerticalScrollBarEnabled(false);
        r59Var.setOverScrollMode(2);
        r59Var.setItemAnimator(null);
        r59Var.setClipToPadding(false);
        r59Var.setPadding(0, gm.L(2.0f), 0, gm.L(2.0f));
        r59Var.setSelectorDrawableColor(cmb.p1(0.06f, v0));
        r59Var.setOnItemClickListener(new u(this, r12));
        r59Var.j(new y(this, b2));
        addView(r59Var, qoe.o(-1, 0));
        View view2 = new View(context);
        this.e = view2;
        view2.setBackgroundColor(ylbVar != null ? ylbVar.a() : cmb.I.o() ? 1023410176 : 251658240);
        addView(view2, qoe.k(0.0f, 4.0f, 0.0f, 0.0f, -1, 8));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setPadding(gm.L(16.0f), gm.L(12.0f), gm.L(16.0f), gm.L(14.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 15.0f);
        textView.setTextColor(v0);
        textView.setText(jb6.M0(2131754292, null));
        frameLayout2.addView(textView, qoe.e(-2, -2, (jb6.a0 ? 5 : 3) | 16));
        io ioVar = new io(context, false, true, true);
        this.h = ioVar;
        ioVar.setTextSize(gm.L(15.0f));
        ioVar.setTextColor(v0);
        ioVar.setGravity(jb6.a0 ? 3 : 5);
        ioVar.b(0.6f, 240L, d53.h);
        frameLayout2.addView(ioVar, qoe.e(nm7.E1, 20, (jb6.a0 ? (byte) 3 : (byte) 5) | 16));
        linearLayout.addView(frameLayout2, qoe.o(-1, 20));
        rc rcVar = new rc(context, ylbVar);
        this.n = rcVar;
        rcVar.setListener(new l0(this, (byte) 9));
        linearLayout.addView(rcVar, qoe.k(-14.0f, -4.0f, -14.0f, -14.0f, -1, 56));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        addView(linearLayout, qoe.o(-1, 84));
    }

    public final void a() {
        u46 u46Var;
        ad adVar = this.s;
        if (adVar.K || adVar.J || (u46Var = (u46) this.b.getLayoutManager()) == null || u46Var.M0() < this.c.b() - 4) {
            return;
        }
        adVar.j(false);
    }

    public final void b(int i, boolean z) {
        String M0;
        int i2 = this.r;
        if (i2 == i) {
            return;
        }
        boolean z2 = false;
        boolean z3 = i > i2;
        this.r = i;
        String str = mc.i[i];
        str.getClass();
        switch (str) {
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
        if (z && isAttachedToWindow()) {
            z2 = true;
        }
        this.h.c(M0, z2, !z3);
    }

    public final void c() {
        ad adVar = this.s;
        ArrayList arrayList = adVar.Q;
        ArrayList arrayList2 = adVar.S;
        arrayList2.clear();
        boolean z = TextUtils.isEmpty(adVar.H) && !arrayList.isEmpty();
        if (z) {
            arrayList2.add(new xc(3, null, jb6.M0(2131754281, null)));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TL_agent.agentModel agentmodel = (TL_agent.agentModel) obj;
                TL_agent.agentModel e = ad.e(agentmodel.id, adVar.N);
                if (e != null) {
                    agentmodel = e;
                }
                arrayList2.add(new xc(0, agentmodel, null));
            }
            arrayList2.add(new xc(3, null, jb6.M0(2131754283, null)));
        }
        ArrayList arrayList3 = adVar.G;
        int size2 = arrayList3.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList3.get(i3);
            i3++;
            TL_agent.agentModel agentmodel2 = (TL_agent.agentModel) obj2;
            if (!z || ad.e(agentmodel2.id, arrayList) == null) {
                arrayList2.add(new xc(0, agentmodel2, null));
                i2++;
            }
        }
        if (adVar.K || !adVar.J) {
            arrayList2.add(new xc(1, null, null));
        } else if (i2 == 0 && !z) {
            arrayList2.add(new xc(2, null, null));
        }
        this.c.f();
        requestLayout();
    }

    public final void d(boolean z) {
        ad adVar = this.s;
        TL_agent.settings settingsVar = adVar.y.d;
        int i = (settingsVar == null || !settingsVar.effort_supported) ? 8 : 0;
        LinearLayout linearLayout = this.f;
        if (linearLayout.getVisibility() != i) {
            this.e.setVisibility(i);
            linearLayout.setVisibility(i);
            requestLayout();
        }
        String b = adVar.y.b();
        int i2 = 0;
        while (true) {
            if (i2 >= 4) {
                i2 = 1;
                break;
            } else if (TextUtils.equals(mc.i[i2], b)) {
                break;
            } else {
                i2++;
            }
        }
        b(i2, z);
        rc rcVar = this.n;
        if (rcVar.E || rcVar.F) {
            return;
        }
        ValueAnimator valueAnimator = rcVar.s;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            float f = i2;
            if (Math.abs(rcVar.e - f) >= 0.001f) {
                if (z) {
                    rcVar.a(i2);
                    return;
                }
                rcVar.e = f;
                boolean z2 = f > ((float) rcVar.b) - 1.5f;
                rcVar.r = z2;
                rcVar.n = z2 ? 1.0f : 0.0f;
                rcVar.invalidate();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int max = Math.max(1, gm.L(0.5f)) + gm.L(48.0f);
        ad adVar = this.s;
        TL_agent.settings settingsVar = adVar.y.d;
        if (settingsVar != null && settingsVar.effort_supported) {
            max += gm.L(96.0f);
        }
        int size = View.MeasureSpec.getMode(i2) == 0 ? ConnectionsManager.DEFAULT_DATACENTER_ID : View.MeasureSpec.getSize(i2);
        int L = gm.L(4.0f);
        ArrayList arrayList = adVar.S;
        int size2 = arrayList.size();
        int i3 = 0;
        while (i3 < size2) {
            Object obj = arrayList.get(i3);
            i3++;
            byte b = ((xc) obj).a;
            L += b != 2 ? b != 3 ? gm.L(55.0f) : gm.L(26.0f) : gm.L(48.0f);
            if (L > gm.L(305.0f)) {
                break;
            }
        }
        if (!adVar.J || adVar.K) {
            L = gm.L(305.0f);
        }
        int max2 = Math.max(gm.L(55.0f), Math.min(Math.min(L, gm.L(305.0f)), size - max));
        this.b.getLayoutParams().height = max2;
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(max + max2, TLObject.FLAG_30));
    }
}
