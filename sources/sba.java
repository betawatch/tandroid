// default package

import android.content.Context;
import android.widget.LinearLayout;
import java.util.HashSet;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class sba extends LinearLayout implements snb {
    public final vnb a;
    public final p66 b;
    public final p66 c;
    public final c51 d;
    public final c51 e;

    public sba(Context context, vnb vnbVar) {
        super(context);
        this.a = vnbVar;
        setOrientation(1);
        int i = aob.G6;
        p66 a = zze.a(context, 15.0f, i, true, vnbVar);
        this.b = a;
        a.setGravity(17);
        addView(a, tre.t(-1, -2, 55, 32, 20, 32, 0));
        p66 a2 = zze.a(context, 13.0f, i, false, vnbVar);
        this.c = a2;
        a2.setGravity(17);
        addView(a2, tre.s(-1, -2, 55, 32.0f, 9.33f, 32.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        c51 i2 = xnb.i(24, vnbVar, context, true);
        this.d = i2;
        c51 i3 = xnb.i(24, vnbVar, context, true);
        this.e = i3;
        linearLayout.addView(i2, tre.q(0, 42, 1.0f, jn7.w1, 0, 0, 12, 0));
        linearLayout.addView(i3, tre.q(0, 42, 1.0f, jn7.w1, 0, 0, 0, 0));
        addView(linearLayout, tre.t(-1, -2, 55, 24, 18, 24, 16));
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(aob.G6));
    }

    @Override // snb
    public final void updateColors() {
        int i = aob.G6;
        vnb vnbVar = this.a;
        this.b.setTextColor(aob.v0(i, vnbVar));
        this.c.setTextColor(aob.v0(i, vnbVar));
    }
}
