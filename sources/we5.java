// default package

import android.app.Activity;
import android.graphics.PorterDuff;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class we5 extends FrameLayout {
    public final int a;
    public final vnb b;
    public ArrayList c;
    public final FrameLayout d;
    public final q9c e;
    public final l9c f;
    public pcc h;

    public we5(int i, vnb vnbVar, Activity activity) {
        super(activity);
        this.a = i;
        this.b = vnbVar;
        q9c q9cVar = new q9c(activity, i, 0, false, new yt4((Object) this, (byte) 10), new ve5(this), new ve5(this), vnbVar);
        this.e = q9cVar;
        q9cVar.setClipToPadding(false);
        l9c l9cVar = (l9c) q9cVar.getAdapter();
        this.f = l9cVar;
        l9cVar.r = false;
        addView(q9cVar, -1, -1);
        FrameLayout frameLayout = new FrameLayout(activity);
        this.d = frameLayout;
        ImageView imageView = new ImageView(activity);
        int i2 = aob.m6;
        yob.s(imageView, i2, vnbVar, PorterDuff.Mode.MULTIPLY);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.large_hashtags);
        frameLayout.addView(imageView, tre.e(56, 56, 49));
        TextView textView = new TextView(activity);
        yob.X(textView, i2, vnbVar);
        textView.setText(ob6.M0(2131749107, null));
        textView.setGravity(17);
        frameLayout.addView(textView, tre.d(-2, -2.0f, 81, 0.0f, 56.0f, 0.0f, 0.0f));
        addView(frameLayout, tre.e(jn7.n3, -2, 17));
        q9cVar.setEmptyView(frameLayout);
    }

    public void setOnHashtagClickListener(pcc pccVar) {
        this.h = pccVar;
    }

    public void setOnScrollListener(v79 v79Var) {
        this.e.j(v79Var);
    }
}
