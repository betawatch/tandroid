// default package

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class rn2 extends LinearLayout implements tjb {
    public final wjb a;
    public final g37 b;
    public final FrameLayout c;
    public final ImageView d;
    public final TextView e;
    public final TextView f;
    public final boolean h;
    public boolean n;

    public rn2(wjb wjbVar, Context context, boolean z) {
        super(context);
        this.a = wjbVar;
        this.h = z;
        setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.c = frameLayout;
        g37 g37Var = new g37((byte) 1);
        this.b = g37Var;
        frameLayout.setBackground(g37Var);
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        frameLayout.addView(imageView, nme.e(24, 24, 17));
        LinearLayout j = de9.j(context, 1);
        TextView textView = new TextView(context);
        this.e = textView;
        textView.setTextSize(1, 16.0f);
        TextView m = ug8.m(j, textView, nme.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2), context);
        this.f = m;
        m.setGravity(17);
        m.setMinWidth(gl.L(20.66f));
        m.setPadding(gl.L(6.33f), 0, gl.L(6.33f), 0);
        m.setTextSize(1, 16.0f);
        if (k96.a0) {
            addView(m, nme.j(13.33f, 0.0f));
            addView(j, nme.q(0, -2, 1.0f, 23, 20, 0, z ? 12 : 16, 0));
            addView(frameLayout, nme.t(28, 28, 21, 0, 0, z ? 9 : 14, 0));
        } else {
            addView(frameLayout, nme.t(28, 28, 19, z ? 9 : 14, 0, 0, 0));
            addView(j, nme.q(0, -2, 1.0f, 23, z ? 12 : 16, 0, 20, 0));
            addView(m, nme.j(0.0f, 13.33f));
        }
        updateColors();
        setUnreadMode(true);
    }

    public final void a(int i, int i2, int i3, CharSequence charSequence, CharSequence charSequence2, boolean z) {
        this.c.setVisibility(i3 != 0 ? 0 : 8);
        this.e.setTranslationX(i3 == 0 ? gl.L(2.0f) : 0.0f);
        this.b.b(i, i2);
        this.d.setImageResource(i3);
        setTitle(charSequence);
        setValue(charSequence2);
        setUnreadMode(z);
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.T8));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(this.h ? 44.0f : 50.0f), TLObject.FLAG_30));
    }

    public void setTitle(CharSequence charSequence) {
        this.e.setText(charSequence);
    }

    public void setUnreadMode(boolean z) {
        if (this.n != z) {
            this.n = z;
            float f = z ? 13.0f : 16.0f;
            TextView textView = this.f;
            textView.setTextSize(1, f);
            textView.setTypeface(z ? gl.o() : null);
            int i = z ? bkb.V8 : bkb.m6;
            wjb wjbVar = this.a;
            zkb.X(textView, i, wjbVar);
            textView.setBackground(z ? bkb.b0(gl.L(10.33f), bkb.v0(bkb.T8, wjbVar)) : null);
        }
    }

    public void setValue(CharSequence charSequence) {
        int i = !TextUtils.isEmpty(charSequence) ? 0 : 8;
        TextView textView = this.f;
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.e.setTextColor(bkb.v0(i, wjbVar));
        int v0 = bkb.v0(this.n ? bkb.V8 : bkb.m6, wjbVar);
        TextView textView = this.f;
        textView.setTextColor(v0);
        textView.setBackground(this.n ? bkb.b0(gl.L(10.33f), bkb.v0(bkb.T8, wjbVar)) : null);
        this.b.b = wjbVar != null ? wjbVar.a() : bkb.I.o();
    }
}
