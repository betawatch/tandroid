package ph;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import c8.ja;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.z5;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class c extends FrameLayout implements z5 {
    public final e6 a;
    public final ImageView b;
    public final TextView c;
    public int d;
    public boolean e;

    public c(Context context, e6 e6Var) {
        super(context);
        this.a = e6Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.msg_arrow_back);
        addView(imageView, ja.d(48, 48.0f, 8388627, 6.0f, 0.0f, 0.0f, 0.0f));
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setText(hd.M0(2131751166, null));
        textView.setTextSize(1, 15.0f);
        textView.setTypeface(g0.o());
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        addView(textView, ja.d(-2, -2.0f, 8388627, 50.0f, 0.0f, 16.0f, 0.0f));
        updateColors();
    }

    public final int a(float f10) {
        return i0.a.o(j6.w0(j6.Nl, this.a), (int) (f10 * 255.0f));
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(j6.Nl));
    }

    public void setOnBackClickListener(View.OnClickListener onClickListener) {
        this.b.setOnClickListener(onClickListener);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.c.setTextColor(a(0.6f));
        int a10 = a(1.0f);
        if (this.e && a10 == this.d) {
            return;
        }
        this.e = true;
        this.d = a10;
        PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(a(0.6f), PorterDuff.Mode.MULTIPLY);
        ImageView imageView = this.b;
        imageView.setColorFilter(porterDuffColorFilter);
        if (imageView.getBackground() != null) {
            j6.H1(imageView.getBackground(), a(0.1f), true);
        } else {
            imageView.setBackground(j6.h0(a(0.1f), 1, -1));
        }
    }
}
