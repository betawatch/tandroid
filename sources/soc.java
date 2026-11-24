// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public final class soc extends LinearLayout implements tjb {
    public final wjb a;
    public final TextView b;
    public final TextView c;
    public final ImageView d;

    public soc(Context context, wjb wjbVar) {
        super(context);
        setOrientation(0);
        this.a = wjbVar;
        setPadding(gl.L(20.0f), 0, gl.L(13.0f), 0);
        LinearLayout j = de9.j(context, 1);
        j.setPadding(0, gl.L(10.0f), 0, gl.L(10.0f));
        addView(j, nme.q(0, -2, 1.0f, 19, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(gl.n1("fonts/rmono.ttf"));
        TextView m = ug8.m(j, textView, nme.t(-1, -2, 55, 0, 0, 0, 2), context);
        this.c = m;
        m.setTextSize(1, 14.0f);
        j.addView(m, nme.t(-1, -2, 55, 0, 0, 0, 0));
        ImageView imageView = new ImageView(context);
        this.d = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.attach_arrow_right);
        addView(imageView, nme.t(21, 21, 21, 9, 0, 0, 0));
        updateColors();
    }

    @Override // tjb
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.y6));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), TLObject.FLAG_30), i2);
    }

    @Override // tjb
    public final void updateColors() {
        int i = bkb.F6;
        wjb wjbVar = this.a;
        this.b.setTextColor(bkb.v0(i, wjbVar));
        int i2 = bkb.y6;
        this.c.setTextColor(bkb.v0(i2, wjbVar));
        this.d.setColorFilter(new PorterDuffColorFilter(bkb.v0(i2, wjbVar), PorterDuff.Mode.SRC_IN));
    }
}
