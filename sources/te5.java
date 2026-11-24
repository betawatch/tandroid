// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class te5 extends FrameLayout {
    public final int a;
    public final ylb b;
    public ArrayList c;
    public final FrameLayout d;
    public final q7c e;
    public final l7c f;
    public qac h;

    public te5(int i, ylb ylbVar, Activity activity) {
        super(activity);
        this.a = i;
        this.b = ylbVar;
        q7c q7cVar = new q7c(activity, i, 0, false, new vt4((Object) this, (byte) 10), new se5(this), new se5(this), ylbVar);
        this.e = q7cVar;
        q7cVar.setClipToPadding(false);
        l7c l7cVar = (l7c) q7cVar.getAdapter();
        this.f = l7cVar;
        l7cVar.r = false;
        addView(q7cVar, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i2 = cmb.l6;
        anb.s(imageView, i2, ylbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, qoe.e(56, 56, 49));
        TextView textView = new TextView(activity);
        anb.X(textView, i2, ylbVar);
        textView.setText(jb6.M0(2131749110, null));
        textView.setGravity(17);
        frameLayout.addView(textView, qoe.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, qoe.e(nm7.n3, -2, 17));
        q7cVar.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(qac qacVar) {
        this.h = qacVar;
    }

    public void setOnScrollListener(k69 k69Var) {
        this.e.j(k69Var);
    }
}
