// default package

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.RadialProgressView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xb2 extends FrameLayout implements vlb {
    public final su a;
    public final RadialProgressView b;
    public final ylb c;
    public float d;
    public int e;

    public xb2(Context context, ylb ylbVar) {
        super(context);
        this.c = ylbVar;
        su suVar = new su(this, context);
        this.a = suVar;
        suVar.setWillNotDraw(false);
        addView(suVar, qoe.e(36, 36, 17));
        RadialProgressView radialProgressView = new RadialProgressView(context, ylbVar);
        this.b = radialProgressView;
        radialProgressView.setSize(gm.L(28.0f));
        radialProgressView.setProgressColor(cmb.v0(cmb.g1(ylbVar) ? cmb.Ja : cmb.Yc, ylbVar));
        suVar.addView(radialProgressView, qoe.e(32, 32, 17));
    }

    public final void a(float f, int i) {
        if (this.d != f) {
            invalidate();
        }
        this.d = f;
        this.e = i;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gm.L(44.0f), TLObject.FLAG_30));
    }

    public void setProgressVisible(boolean z) {
        this.a.setVisibility(z ? 0 : 4);
    }

    @Override // vlb
    public final void updateColors() {
        ylb ylbVar = this.c;
        try {
            this.b.setProgressColor(cmb.v0(cmb.g1(ylbVar) ? cmb.Ja : cmb.Yc, ylbVar));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
