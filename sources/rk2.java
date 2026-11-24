// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rk2 extends FrameLayout {
    public final hn a;
    public final View b;
    public final wjb c;

    public rk2(Context context, wjb wjbVar) {
        super(context);
        this.c = wjbVar;
        hn hnVar = new hn(context, false, false, false);
        this.a = hnVar;
        int i = bkb.F6;
        zkb.U(hnVar, i, wjbVar);
        hnVar.setTextSize(gl.L(14.0f));
        hnVar.setGravity(k96.a0 ? 5 : 3);
        hnVar.setImportantForAccessibility(2);
        hnVar.setOnWidthUpdatedListener(new mk2(this, (byte) 1));
        addView(hnVar, nme.i(-2.0f, -2.0f, 8388627, 21.0f, 0.0f, 38.0f, 3.0f));
        View view = new View(context);
        this.b = view;
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.arrow_more).mutate();
        zkb.x(this, mutate, i, wjbVar, PorterDuff.Mode.MULTIPLY);
        view.setBackground(mutate);
        addView(view, nme.i(14.0f, 14.0f, 8388627, 21.0f, 1.0f, 0.0f, 3.0f));
    }

    public final void a() {
        float c = this.a.getDrawable().c() + gl.L(1.0f);
        boolean z = k96.a0;
        View view = this.b;
        if (z) {
            view.setTranslationX(-c);
        } else {
            view.setTranslationX(c);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(46.0f), TLObject.FLAG_30));
        a();
    }

    public void setColor(int i) {
        wjb wjbVar = this.c;
        int v0 = bkb.v0(i, wjbVar);
        zkb.U(this.a, i, wjbVar);
        this.b.getBackground().setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
    }
}
