// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r22 extends FrameLayout implements vlb {
    public final ylb a;
    public final TextView b;
    public final TextView c;

    public r22(Context context, ylb ylbVar) {
        super(context);
        this.a = ylbVar;
        setPadding(0, gm.L(42.0f), 0, gm.L(42.0f));
        setTag(-33024);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        addView(linearLayout, qoe.r(-1, -2, 17));
        bf0 bf0Var = new bf0(context);
        bf0Var.setImageDrawable(new p09(R.raw.utyan_empty, gm.L(120.0f), gm.L(120.0f)));
        linearLayout.addView(bf0Var, qoe.t(nm7.E1, nm7.E1, 17, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(gm.o());
        textView.setGravity(17);
        TextView m = wi8.m(linearLayout, textView, qoe.t(-1, -2, 17, 32, 12, 32, 8), context);
        this.c = m;
        m.setTextSize(1, 14.0f);
        m.setGravity(17);
        linearLayout.addView(m, qoe.t(-1, -2, 17, 32, 0, 32, 0));
        updateColors();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.x6));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // vlb
    public final void updateColors() {
        int i = cmb.F6;
        ylb ylbVar = this.a;
        this.b.setTextColor(cmb.v0(i, ylbVar));
        this.c.setTextColor(cmb.v0(cmb.x6, ylbVar));
    }
}
