// default package

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class xu1 extends LinearLayout {
    public ImageView a;
    public TextView b;
    public Space c;
    public boolean d;

    public final void a(ImageView imageView, LinearLayout.LayoutParams layoutParams) {
        if (this.a == null) {
            this.a = imageView;
            addView(imageView, layoutParams);
        }
    }

    public final void b(Space space, LinearLayout.LayoutParams layoutParams) {
        if (this.c == null) {
            this.c = space;
            addView(space, layoutParams);
        }
    }

    public final void c(TextView textView, LinearLayout.LayoutParams layoutParams) {
        if (this.b == null) {
            this.b = textView;
            addView(textView, layoutParams);
        }
    }

    public abstract void d();

    public ImageView getImageView() {
        return this.a;
    }

    public TextView getTextView() {
        return this.b;
    }

    public void setEditButton(boolean z) {
        this.d = z;
    }

    public void setOnlyIconMode(boolean z) {
        TextView textView = this.b;
        if (textView != null) {
            textView.setVisibility(z ? 8 : 0);
        }
        Space space = this.c;
        if (space != null) {
            space.setVisibility(z ? 8 : 0);
        }
    }
}
